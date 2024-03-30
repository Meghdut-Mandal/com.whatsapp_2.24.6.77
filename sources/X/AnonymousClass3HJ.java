package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDiskIOException;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.3HJ  reason: invalid class name */
public class AnonymousClass3HJ {
    public final C19460v5 A00;
    public final AnonymousClass164 A01;
    public final AnonymousClass15x A02;
    public final AnonymousClass16E A03;
    public final C20810yC A04;
    public final C32931eR A05;
    public final AnonymousClass1GQ A06;
    public final C24751Dq A07;
    public final C24681Dj A08;
    public final C29301Wc A09;
    public final AnonymousClass16D A0A;
    public final C20430xY A0B;
    public final C587831a A0C;
    public final C220712t A0D;
    public final AnonymousClass1QH A0E;
    public final AnonymousClass13P A0F;
    public final AnonymousClass1LW A0G;
    public final C232617u A0H;
    public final AnonymousClass17X A0I;
    public final C220612s A0J;
    public final C219612i A0K;
    public final C231517j A0L;
    public final C20350xQ A0M;
    public final C32831eG A0N;
    public final C27331Nu A0O;
    public final C30131Zi A0P;
    public final C19770wU A0Q;

    public void A00() {
        AnonymousClass1M0 A052;
        long longValue;
        Cursor A092;
        int i;
        Cursor A093;
        C220712t.A02(this.A0D, false);
        this.A0L.A07();
        this.A0J.A01();
        C587831a r2 = this.A0C;
        Log.i("BroadcastListChatStore/getBroadcastLists");
        ArrayList A0I2 = AnonymousClass001.A0I();
        try {
            AnonymousClass1M0 A042 = r2.A00.get();
            try {
                A093 = A042.A02.A09("SELECT raw_string_jid, subject, created_timestamp FROM chat_view WHERE raw_string_jid LIKE '%@broadcast' AND (chat_view.hidden IS NULL OR hidden=0)", "GET_BROADCAST_LISTS_SQL", (String[]) null);
                int columnIndexOrThrow = A093.getColumnIndexOrThrow("raw_string_jid");
                int columnIndexOrThrow2 = A093.getColumnIndexOrThrow("subject");
                int columnIndexOrThrow3 = A093.getColumnIndexOrThrow("created_timestamp");
                while (A093.moveToNext()) {
                    C177538dx A002 = C177538dx.A00(A093.getString(columnIndexOrThrow));
                    if (A002 == null) {
                        Log.w("BroadcastListChatStore/getBroadcastLists/jid is null or invalid!");
                    } else {
                        String string = A093.getString(columnIndexOrThrow2);
                        long j = 0;
                        if (!A093.isNull(columnIndexOrThrow3)) {
                            j = A093.getLong(columnIndexOrThrow3);
                        }
                        A0I2.add(new C600236e(A002, string, j));
                    }
                }
                A093.close();
                A042.close();
                AnonymousClass16D r14 = this.A0A;
                Log.i("contactmanager/populateNamesFromBroadcasts");
                Iterator it = A0I2.iterator();
                while (it.hasNext()) {
                    C600236e r1 = (C600236e) it.next();
                    r14.A06(r1.A01, r1.A02, "pn", r1.A00);
                }
                AnonymousClass1LW r22 = this.A0G;
                Log.i("msgstore/getPersistedGroupInfo");
                ArrayList A0I3 = AnonymousClass001.A0I();
                try {
                    AnonymousClass1M0 A043 = r22.A03.get();
                    try {
                        A092 = A043.A02.A09("SELECT raw_string_jid, subject, created_timestamp, ephemeral_expiration FROM chat_view WHERE raw_string_jid LIKE '%@g.us' AND (chat_view.hidden IS NULL OR chat_view.hidden = 0)", "GET_GROUP_CHAT_INFO_SQL", new String[0]);
                        int columnIndexOrThrow4 = A092.getColumnIndexOrThrow("raw_string_jid");
                        int columnIndexOrThrow5 = A092.getColumnIndexOrThrow("subject");
                        int columnIndexOrThrow6 = A092.getColumnIndexOrThrow("created_timestamp");
                        int columnIndexOrThrow7 = A092.getColumnIndexOrThrow("ephemeral_expiration");
                        while (A092.moveToNext()) {
                            String string2 = A092.getString(columnIndexOrThrow4);
                            String string3 = A092.getString(columnIndexOrThrow5);
                            Long l = null;
                            if (!A092.isNull(columnIndexOrThrow6)) {
                                l = C36361kB.A0k(A092, columnIndexOrThrow6);
                            }
                            if (!A092.isNull(columnIndexOrThrow7)) {
                                i = A092.getInt(columnIndexOrThrow7);
                            } else {
                                i = 0;
                            }
                            AnonymousClass147 A062 = AnonymousClass147.A01.A06(string2);
                            if (A062 != null) {
                                A0I3.add(new AnonymousClass38D(A062, l, string3, i));
                            }
                        }
                        A092.close();
                        A043.close();
                    } catch (Throwable th) {
                        A043.close();
                        throw th;
                    }
                } catch (SQLiteDiskIOException e) {
                    Log.e("msgstore/groupinfo/error ", e);
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                Log.i("contactmanager/populateNamesFromBroadcasts");
                Iterator it2 = A0I3.iterator();
                while (it2.hasNext()) {
                    AnonymousClass38D r3 = (AnonymousClass38D) it2.next();
                    AnonymousClass141 r15 = new AnonymousClass141(r3.A01);
                    String str = r3.A03;
                    Long l2 = r3.A02;
                    if (l2 == null) {
                        longValue = Long.MIN_VALUE;
                    } else {
                        longValue = l2.longValue();
                    }
                    r14.A0W(r15, (UserJid) null, AnonymousClass3QL.A05, str, "pn", r3.A00, 0, longValue, false, false, false, false, false, false, false, false, false, false, false);
                }
                AnonymousClass17X r23 = this.A0I;
                AnonymousClass1M0 A053 = r23.A06.A05();
                try {
                    C1495671s B1k = A053.B1k();
                    try {
                        C232317r r6 = r23.A07;
                        Log.i("participant-user-store/resetSentSenderKeyForAllParticipants");
                        AnonymousClass1M0 A054 = r6.A06.A05();
                        try {
                            C1495671s B1k2 = A054.B1k();
                            try {
                                C232817w r32 = r6.A07;
                                Log.i("participant-device-store/resetSentSenderKeyForAllParticipants");
                                ContentValues contentValues = new ContentValues(1);
                                contentValues.put("sent_sender_key", C36381kD.A0m());
                                A052 = r32.A03.A05();
                                A052.A02.A01(contentValues, "group_participant_device", (String) null, "resetSentSenderKeyForAllParticipants/UPDATE_GROUP_PARTICIPANT_DEVICE", (String[]) null);
                                A052.close();
                                C232617u r33 = r6.A04;
                                Iterator it3 = new HashSet(r33.A07.keySet()).iterator();
                                while (it3.hasNext()) {
                                    AnonymousClass6X6 A094 = r33.A09((AnonymousClass144) it3.next());
                                    if (A094 != null) {
                                        C232317r.A06(A094);
                                    }
                                }
                                B1k2.A00();
                                B1k2.close();
                                A054.close();
                                B1k.A00();
                                B1k.close();
                                A053.close();
                                this.A0E.A01();
                                this.A0F.BmP();
                                this.A0K.A02("async_init_migration_start_time");
                                AnonymousClass1Q9 r34 = C29301Wc.A00(this.A09).A09;
                                r34.A0E.A14(512);
                                if (r34.A0S.A0E(2660)) {
                                    r34.A0Z.Boy(new C35691j6(r34, 35));
                                    return;
                                }
                                return;
                            } catch (Throwable th3) {
                                B1k2.close();
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            A054.close();
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        B1k.close();
                        throw th5;
                    }
                } catch (Throwable th6) {
                    try {
                        A053.close();
                        throw th6;
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                        throw th6;
                    }
                }
                throw th;
                throw th;
                throw th;
            } catch (Throwable th8) {
                A042.close();
                throw th8;
            }
        } catch (SQLiteDiskIOException e2) {
            Log.e("BroadcastListChatStore/getBroadcastLists/error ", e2);
        } catch (Throwable th9) {
            th8.addSuppressed(th9);
        }
    }

    public void A01() {
        this.A0B.A05();
        this.A0H.A07.clear();
        this.A0M.A0U(3, false);
        this.A0O.A00();
        this.A0P.A02();
        C19770wU r1 = this.A0Q;
        C81143wX.A01(r1, this, 9);
        C81143wX.A01(r1, this, 10);
    }

    public AnonymousClass3HJ(C19460v5 r2, AnonymousClass164 r3, C29301Wc r4, AnonymousClass16D r5, C20430xY r6, C587831a r7, C220712t r8, AnonymousClass1QH r9, AnonymousClass13P r10, AnonymousClass1LW r11, C232617u r12, AnonymousClass17X r13, AnonymousClass15x r14, C220612s r15, C219612i r16, AnonymousClass16E r17, C231517j r18, C20810yC r19, C20350xQ r20, C32931eR r21, C32831eG r22, C27331Nu r23, AnonymousClass1GQ r24, C30131Zi r25, C24751Dq r26, C24681Dj r27, C19770wU r28) {
        this.A04 = r19;
        this.A0Q = r28;
        this.A0D = r8;
        this.A03 = r17;
        this.A01 = r3;
        this.A09 = r4;
        this.A0L = r18;
        this.A0A = r5;
        this.A0G = r11;
        this.A0M = r20;
        this.A06 = r24;
        this.A0N = r22;
        this.A0P = r25;
        this.A0K = r16;
        this.A0B = r6;
        this.A0O = r23;
        this.A05 = r21;
        this.A0H = r12;
        this.A00 = r2;
        this.A0C = r7;
        this.A0E = r9;
        this.A0I = r13;
        this.A02 = r14;
        this.A08 = r27;
        this.A0J = r15;
        this.A07 = r26;
        this.A0F = r10;
    }
}
