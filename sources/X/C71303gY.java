package X;

import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3gY  reason: invalid class name and case insensitive filesystem */
public class C71303gY implements C30631aW {
    public final C21100yf A00;
    public final C24571Cy A01;
    public final AnonymousClass196 A02;
    public final AnonymousClass1AB A03;
    public final C237119n A04;
    public final AnonymousClass1IS A05;
    public final AnonymousClass1A9 A06;
    public final C19980wp A07;
    public final C19970wo A08;
    public final C19420v0 A09;
    public final C20310xM A0A;
    public final C19770wU A0B;

    /* JADX INFO: finally extract failed */
    public void BV2() {
        Throwable th;
        long j;
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        Long valueOf4;
        Long valueOf5;
        Long valueOf6;
        Long valueOf7;
        Cursor A092;
        long millis;
        AnonymousClass1M0 A042;
        Cursor A093;
        long j2;
        C36341k9.A0u(C237119n.A00(this.A04).edit(), "syncd_one_time_cleanup_for_non_md_user");
        C36341k9.A0u(C19980wp.A00(this.A07).edit().remove("companion_rollout_random"), "previously_accessed_companion_mode");
        AnonymousClass1AB r3 = this.A03;
        C237119n r1 = r3.A01;
        long A012 = r1.A01("mutation_counter");
        long A013 = r1.A01("invalid_action_counter");
        AnonymousClass1AC r9 = r3.A04;
        AnonymousClass18P r2 = r9.A00;
        AnonymousClass1M0 A032 = r2.get();
        try {
            Cursor A094 = A032.A02.A09("SELECT COUNT(*) as count FROM syncd_mutations", "SyncdMutationsTable.COUNT_NUM_MUTATIONS", new String[0]);
            try {
                if (!A094.moveToNext()) {
                    j = -1;
                } else {
                    j = C36351kA.A07(A094, "count");
                }
                A094.close();
                A032.close();
                long A014 = r1.A01("upload_conflict_counter");
                long A015 = r1.A01("unsupported_action_counter");
                long A016 = r1.A01("cross_index_conflict_counter");
                long A017 = r1.A01("unset_action_mutation_counter");
                long A018 = r1.A01("key_rotation_remove_counter");
                long A019 = r1.A01("missing_key_counter");
                long[] jArr = {A012, A019, A013, j, A014, A018, A015, A016, A017};
                int i = 0;
                while (true) {
                    if (jArr[i] <= 0) {
                        i++;
                        if (i >= 9) {
                            break;
                        }
                    } else {
                        AnonymousClass2S5 r12 = new AnonymousClass2S5();
                        r12.A04 = Long.valueOf(A012);
                        Long l = null;
                        if (A013 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(A013);
                        }
                        r12.A01 = valueOf;
                        if (j == -1) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Long.valueOf(j);
                        }
                        r12.A05 = valueOf2;
                        if (A014 == 0) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Long.valueOf(A014);
                        }
                        r12.A08 = valueOf3;
                        if (A015 == 0) {
                            valueOf4 = null;
                        } else {
                            valueOf4 = Long.valueOf(A015);
                        }
                        r12.A07 = valueOf4;
                        if (A016 == 0) {
                            valueOf5 = null;
                        } else {
                            valueOf5 = Long.valueOf(A016);
                        }
                        r12.A00 = valueOf5;
                        if (A017 == 0) {
                            valueOf6 = null;
                        } else {
                            valueOf6 = Long.valueOf(A017);
                        }
                        r12.A06 = valueOf6;
                        if (A018 == 0) {
                            valueOf7 = null;
                        } else {
                            valueOf7 = Long.valueOf(A018);
                        }
                        r12.A02 = valueOf7;
                        if (A019 != 0) {
                            l = Long.valueOf(A019);
                        }
                        r12.A03 = l;
                        r3.A06.Bly(r12);
                    }
                }
                if (r3.A05.A0E(1221)) {
                    HashMap A0J = AnonymousClass001.A0J();
                    A032 = r2.get();
                    Cursor A095 = A032.A02.A09("SELECT mutation_name, are_dependencies_missing, COUNT(*) AS mutation_count FROM syncd_mutations GROUP BY mutation_name, are_dependencies_missing", "SyncdMutationsTable.COUNT_MUTATIONS_GROUP_BY_MUTATION_NAME_AND_ARE_DEPENDENCIES_MISSING", new String[0]);
                    while (A095.moveToNext()) {
                        try {
                            String A0f = C36341k9.A0f(A095, "mutation_name");
                            boolean A1P = AnonymousClass000.A1P((C36351kA.A07(A095, "are_dependencies_missing") > 0 ? 1 : (C36351kA.A07(A095, "are_dependencies_missing") == 0 ? 0 : -1)));
                            long A072 = C36351kA.A07(A095, "mutation_count");
                            C600936l r22 = (C600936l) A0J.get(A0f);
                            if (r22 == null) {
                                r22 = new C600936l();
                            }
                            if (!A1P) {
                                r22.A00 += A072;
                            } else {
                                AnonymousClass1AE r13 = r9.A01;
                                AnonymousClass00C.A0D(A0f, 0);
                                AnonymousClass1LZ A002 = r13.A00(A0f);
                                if (A002 == null || !A002.A0H()) {
                                    r22.A02 += A072;
                                } else {
                                    r22.A01 += A072;
                                }
                            }
                            A0J.put(A0f, r22);
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    A095.close();
                    A032.close();
                    Iterator A10 = C36371kC.A10(A0J);
                    while (A10.hasNext()) {
                        Map.Entry A11 = AnonymousClass000.A11(A10);
                        C600936l r8 = (C600936l) A11.getValue();
                        long[] jArr2 = {r8.A00, r8.A01, r8.A02};
                        int i2 = 0;
                        while (true) {
                            if (jArr2[i2] <= 0) {
                                i2++;
                                if (i2 >= 3) {
                                    break;
                                }
                            } else {
                                AnonymousClass2TA r23 = new AnonymousClass2TA();
                                r23.A00 = AnonymousClass1AB.A02(r8.A00);
                                r23.A01 = AnonymousClass1AB.A02(r8.A01);
                                r23.A02 = AnonymousClass1AB.A02(r8.A02);
                                r23.A03 = (String) A11.getKey();
                                r3.A06.Bly(r23);
                                break;
                            }
                        }
                    }
                }
                AnonymousClass1A9 r82 = this.A06;
                Log.i("SyncdKeyManager/dailyCronJob");
                AnonymousClass1AA r7 = r82.A09;
                HashSet A16 = C36441kJ.A16();
                AnonymousClass18P r6 = r7.A00;
                AnonymousClass1M0 A033 = r6.get();
                try {
                    A092 = A033.A02.A09("SELECT crypto_info.device_id,  crypto_info.epoch FROM crypto_info LEFT JOIN syncd_mutations on crypto_info.device_id = syncd_mutations.device_id AND crypto_info.epoch = syncd_mutations.epoch WHERE syncd_mutations._id IS NULL AND crypto_info.stale_timestamp = 0 ", "SyncdCryptoInfoTable.SELECT_STALE_KEY_IDS_WHERE_TIMESTAMP_NOT_SET", (String[]) null);
                    while (A092.moveToNext()) {
                        A16.add(new C201539jo((int) C36351kA.A07(A092, "device_id"), (int) C36351kA.A07(A092, "epoch")));
                    }
                    A092.close();
                    A033.close();
                    C195589Va A052 = r82.A05();
                    if (A052 != null) {
                        A16.remove(A052.A01);
                    }
                    long A003 = C19970wo.A00(r82.A04);
                    r7.A03(A16, A003);
                    millis = A003 - TimeUnit.DAYS.toMillis((long) r82.A01.A04(C21100yf.A1X));
                    A042 = r6.A04();
                    throw th;
                    throw th;
                } catch (Throwable th3) {
                    th = th3;
                    A033.close();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                if (A094 != null) {
                    A094.close();
                }
                throw th;
            }
            try {
                A042.A02.A0E("DELETE FROM crypto_info WHERE stale_timestamp != 0  AND stale_timestamp <= ? ", "SyncdCryptoInfoTable.DELETE_STALE_KEY_IDS", C36341k9.A1b(millis));
                A042.close();
                AnonymousClass1IS r4 = this.A05;
                Log.i("SyncEncryptionHelper/dailyCronJob");
                C20810yC r32 = r4.A0A;
                if (r32.A07(1104) != 0 && C19970wo.A00(r4.A06) - C36341k9.A0B(C237119n.A00(r4.A03), "syncd_last_lthash_consistency_check_time") >= C36441kJ.A0B(r32, 1104) * 3600000) {
                    r4.A0B.Boz(new C35671j4(r4, 34), "SyncEncryptionHelper/checkLtHashConsistency");
                }
                AnonymousClass196 r5 = this.A02;
                synchronized (r5) {
                    C25921Ie r83 = r5.A09;
                    boolean z = false;
                    if (C237119n.A00(r83.A04).getLong("syncd_last_companion_dereg_time", 0) != 0) {
                        if (!C25921Ie.A00(r83) && !C36411kG.A1a(r83.A06.A0A())) {
                            z = true;
                        }
                        C36321k7.A1X("SyncdDeleteAllDataApiHandler/shouldCleanUpSyncd: shouldCleanUpSyncd = ", AnonymousClass000.A0u(), z);
                        if (z) {
                            C18740tg.A0C(AnonymousClass000.A1Q(r5.A06.A0L() ? 1 : 0));
                            r5.A0I(3);
                        }
                    }
                    AnonymousClass1A9 r84 = r5.A0I;
                    AnonymousClass1AI r0 = r84.A08;
                    C18740tg.A00();
                    AnonymousClass1M0 A034 = r0.A00.get();
                    try {
                        C224114e r33 = A034.A02;
                        String[] A1R = C36441kJ.A1R();
                        C36431kI.A1O(A1R, 39, 0);
                        A093 = r33.A09("SELECT _id, message_type, key_remote_jid, key_from_me, key_id, timestamp, device_id, data, acked FROM peer_messages WHERE message_type = ?  ORDER BY timestamp ASC  LIMIT 1", "PeerMessagesTable.SELECT_OLDEST_MESSAGE_BY_MESSAGE_TYPE", A1R);
                        if (!A093.moveToNext()) {
                            j2 = 0;
                        } else {
                            j2 = C36351kA.A07(A093, "timestamp");
                        }
                        A093.close();
                        A034.close();
                        if (j2 != 0) {
                            if (j2 + TimeUnit.DAYS.toMillis((long) r84.A01.A04(C21100yf.A1a)) < C19970wo.A00(r84.A04)) {
                                Log.i("sync-manager/deleteSyncdIfWaitForKeyTimedOut: fatal exception because wait for key timed out");
                                r5.A0K(31);
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            A034.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                th.addSuppressed(th7);
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            A032.close();
            throw th;
        }
    }

    public void BV3() {
        C19970wo r3 = this.A08;
        C20310xM r5 = this.A0A;
        this.A0B.Boy(new C80543vZ(this.A01, r3, this.A09, r5, C36371kC.A07(this.A00.A04(C21100yf.A1w))));
    }

    public C71303gY(C21100yf r1, C24571Cy r2, AnonymousClass196 r3, AnonymousClass1AB r4, C237119n r5, AnonymousClass1IS r6, AnonymousClass1A9 r7, C19980wp r8, C19970wo r9, C19420v0 r10, C20310xM r11, C19770wU r12) {
        this.A08 = r9;
        this.A0B = r12;
        this.A00 = r1;
        this.A02 = r3;
        this.A06 = r7;
        this.A0A = r11;
        this.A03 = r4;
        this.A09 = r10;
        this.A05 = r6;
        this.A01 = r2;
        this.A04 = r5;
        this.A07 = r8;
    }
}
