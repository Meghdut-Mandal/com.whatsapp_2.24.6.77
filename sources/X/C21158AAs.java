package X;

import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.AAs  reason: case insensitive filesystem */
public class C21158AAs implements AnonymousClass00M {
    public final C219712j A00;
    public final C19700wN A01;
    public final C19970wo A02;
    public final C20310xM A03;
    public final AnonymousClass12P A04;
    public final AnonymousClass1AC A05;
    public final C26191Jf A06;

    public static long A00(long j, long j2) {
        if (j2 > 0 && j / 10 > j2) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("MessageRangeUtil/convertTheTimestampIfTooLarge DeleteMessageForMeMutation message timestamp is too large, timestampToConvert=");
            A0u.append(j);
            Log.w(C36381kD.A0z("; validTimestamp=", A0u, j2));
            while (j / 10 > j2) {
                j = C36391kE.A0B(j);
            }
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r1 > 0) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long A01(android.database.Cursor r6, boolean r7) {
        /*
            java.lang.String r5 = "timestamp"
            if (r7 == 0) goto L_0x002a
            java.lang.String r0 = "status"
            int r0 = X.C36351kA.A03(r6, r0)
            r3 = 0
            if (r0 != 0) goto L_0x000f
            return r3
        L_0x000f:
            java.lang.String r0 = "receipt_server_timestamp"
            long r1 = X.C36351kA.A07(r6, r0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0029
            java.lang.String r0 = "receipt_device_timestamp"
            int r0 = r6.getColumnIndex(r0)
            if (r0 < 0) goto L_0x002a
            long r1 = r6.getLong(r0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x002a
        L_0x0029:
            return r1
        L_0x002a:
            long r0 = X.C36351kA.A07(r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21158AAs.A01(android.database.Cursor, boolean):long");
    }

    public C196099Xq A02(Cursor cursor, AnonymousClass11F r14) {
        UserJid userJid;
        String string = cursor.getString(cursor.getColumnIndexOrThrow("key_id"));
        boolean A1O = AnonymousClass000.A1O(C36351kA.A03(cursor, "from_me"));
        long A012 = A01(cursor, A1O);
        AnonymousClass11F r6 = r14;
        if (!AnonymousClass143.A0G(r14) || A1O) {
            userJid = null;
        } else {
            long A07 = C36351kA.A07(cursor, "sender_jid_row_id");
            Jid A09 = this.A00.A09(A07);
            userJid = C36401kF.A0b(A09);
            if (userJid == null) {
                DeviceJid of = DeviceJid.of(A09);
                if (of != null) {
                    userJid = of.userJid;
                    if (userJid == null) {
                        return null;
                    }
                } else {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("MessageRangeUtil/getSenderJid null or not UserJid/DeviceJid when db migration is completed; senderJidRowId=");
                    A0u.append(A07);
                    C36321k7.A1J(A09, "; jid=", A0u);
                    return null;
                }
            }
        }
        C64933Qa A022 = this.A06.A02(C165617ti.A0R(r14, string, A1O));
        if (A022 != null) {
            string = A022.A01;
            A1O = A022.A02;
        }
        return new C196099Xq(r6, userJid, string, A012, A1O);
    }

    public C202679mP A03(AnonymousClass11F r22) {
        UserJid userJid;
        HashSet A0g = C36421kH.A0g(new String[]{"clearChat", "deleteChat", "deleteMessageForMe"});
        ArrayList A0I = AnonymousClass001.A0I();
        AnonymousClass1AC r2 = this.A05;
        AnonymousClass11F r6 = r22;
        A0I.addAll(r2.A0C(r6, A0g, false));
        A0I.addAll(r2.A0C(r6, A0g, true));
        C202679mP A042 = A04(r6, true);
        HashSet A16 = C36441kJ.A16();
        Iterator it = A0I.iterator();
        while (it.hasNext()) {
            C201669k5 r62 = (C201669k5) it.next();
            if (r62 instanceof AnonymousClass4QK) {
                A042 = C202679mP.A01(A042, ((AnonymousClass4QK) r62).BE5());
            } else if (r62 instanceof C176118bb) {
                C176118bb r63 = (C176118bb) r62;
                long j = r63.A00;
                if (j > 0) {
                    long A002 = A00(j, r63.A04);
                    C64933Qa r0 = r63.A02;
                    boolean z = r0.A02;
                    String str = r0.A01;
                    AnonymousClass11F r9 = r0.A00;
                    C18740tg.A06(r9);
                    AnonymousClass11F r02 = r63.A01;
                    if (r02 != null) {
                        userJid = C36431kI.A0l(r02.getRawString());
                    } else {
                        userJid = null;
                    }
                    A16.add(new C196099Xq(r9, userJid, str, A002, z));
                }
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("MessageRangeUtil/createActiveRange unhandledMutation:");
                C36321k7.A1Z(A0u, r62.A07());
            }
        }
        return C202679mP.A01(A042, new C202679mP(A16, Collections.emptySet(), 0, 0));
    }

    /* JADX INFO: finally extract failed */
    public C202679mP A04(AnonymousClass11F r20, boolean z) {
        Throwable th;
        long j;
        long j2;
        C20310xM r2 = this.A03;
        String[] strArr = new String[3];
        AnonymousClass163 r6 = r2.A0H;
        AnonymousClass11F r12 = r20;
        C36341k9.A1W(strArr, r6.A08(r12));
        C19970wo r7 = r2.A0C;
        strArr[1] = String.valueOf(C19970wo.A00(r7));
        String valueOf = String.valueOf(1000);
        strArr[2] = valueOf;
        AnonymousClass12P r8 = r2.A0c;
        AnonymousClass1M0 A042 = r8.get();
        Cursor A09 = A042.A02.A09("   SELECT MAX(timestamp) as timestamp FROM  ( SELECT timestamp FROM available_message_view WHERE chat_row_id = ? AND from_me = 0 AND (message_type != '7') AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1)  ORDER BY sort_id DESC  LIMIT ? )", "SELECT_LATEST_TIMESTAMP_OF_RECEIVED_MESSAGES_IN_CHAT_SQL", strArr);
        try {
            if (!A09.moveToFirst()) {
                j = -1;
            } else {
                j = C36351kA.A07(A09, "timestamp");
            }
        } catch (Throwable th2) {
            th = th2;
            if (A09 != null) {
                A09.close();
            }
            throw th;
        }
        try {
            A09.close();
            A042.close();
            if (z) {
                String[] strArr2 = new String[1];
                C36341k9.A1W(strArr2, r6.A08(r12));
                A042 = r8.get();
                Cursor A092 = A042.A02.A09("   SELECT timestamp FROM available_message_view WHERE chat_row_id = ? AND from_me = 1 AND message_type = 7 ORDER BY sort_id DESC LIMIT 1", "SELECT_LATEST_TIMESTAMP_OF_SYSTEM_MESSAGES_IN_CHAT_SQL", strArr2);
                try {
                    if (!A092.moveToFirst()) {
                        j2 = -1;
                    } else {
                        j2 = C36351kA.A07(A092, "timestamp");
                    }
                    A092.close();
                    A042.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
            } else {
                j2 = 0;
            }
            HashSet A16 = C36441kJ.A16();
            HashSet A162 = C36441kJ.A16();
            AnonymousClass1M0 A043 = this.A04.get();
            try {
                String valueOf2 = String.valueOf(j);
                String[] strArr3 = new String[7];
                C36331k8.A1N(String.valueOf(r6.A08(r12)), valueOf2, strArr3);
                strArr3[2] = valueOf2;
                strArr3[3] = valueOf2;
                strArr3[4] = valueOf2;
                strArr3[5] = String.valueOf(C19970wo.A00(r7));
                strArr3[6] = valueOf;
                A043 = r8.get();
                try {
                    Cursor A093 = A043.A02.A09("   SELECT key_id, from_me, timestamp, receipt_server_timestamp, receipt_device_timestamp, sender_jid_raw_string, sender_jid_row_id, status FROM available_message_view WHERE chat_row_id = ? AND (message_type != '7') AND  (  ( from_me = 0 AND timestamp >= ? ) OR ( from_me = 1 AND (  CASE  WHEN status = 0 THEN 1  WHEN receipt_server_timestamp > 0  THEN receipt_server_timestamp >= ?  WHEN receipt_device_timestamp > 0  THEN receipt_device_timestamp >= ?  WHEN timestamp >= 0  THEN timestamp >= ?  ELSE 0  END  ) ))  AND (status != '7')  AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1)  ORDER BY sort_id DESC LIMIT ?", "SELECT_MESSAGE_KEYS_FROM_C2S_TIMESTAMP_IN_CHAT_SQL", strArr3);
                    if (A093 != null) {
                        while (A093.moveToNext()) {
                            try {
                                C196099Xq A022 = A02(A093, r12);
                                if (A022 == null) {
                                    Log.e("MessageRangeUtil/createRange unable to create message");
                                } else if (A022.A00 <= 0) {
                                    A162.add(A022);
                                } else {
                                    A16.add(A022);
                                }
                            } catch (Throwable th4) {
                                th.addSuppressed(th4);
                            }
                        }
                        A093.close();
                    }
                    A043.close();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                    long millis = timeUnit.toMillis(timeUnit2.toSeconds(j));
                    long millis2 = timeUnit.toMillis(timeUnit2.toSeconds(j2));
                    if (millis2 <= millis) {
                        millis2 = 0;
                    }
                    return new C202679mP(A16, A162, millis, millis2);
                } catch (Throwable th5) {
                    th.addSuppressed(th5);
                }
                throw th;
            } finally {
                th = th;
                try {
                    A043.close();
                } catch (Throwable th6) {
                    th.addSuppressed(th6);
                    throw th;
                }
            }
        } catch (Throwable th7) {
            th = th7;
            A042.close();
            throw th;
        }
    }

    public C21158AAs(C19700wN r1, C19970wo r2, C20310xM r3, C219712j r4, AnonymousClass12P r5, AnonymousClass1AC r6, C26191Jf r7) {
        this.A02 = r2;
        this.A00 = r4;
        this.A01 = r1;
        this.A03 = r3;
        this.A06 = r7;
        this.A04 = r5;
        this.A05 = r6;
    }
}
