package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1DM  reason: invalid class name */
public class AnonymousClass1DM {
    public Map A00;
    public Map A01;
    public final AnonymousClass16D A02;
    public final AnonymousClass1DN A03;
    public final C19970wo A04;
    public final C19420v0 A05;
    public final C20810yC A06;

    public static synchronized Map A02(AnonymousClass1DM r1) {
        Map map;
        synchronized (r1) {
            map = r1.A00;
            if (map == null) {
                map = Collections.synchronizedMap(new HashMap());
                r1.A00 = map;
            }
        }
        return map;
    }

    public static synchronized Map A03(AnonymousClass1DM r1) {
        Map map;
        synchronized (r1) {
            map = r1.A01;
            if (map == null) {
                map = Collections.synchronizedMap(new HashMap());
                r1.A01 = map;
            }
        }
        return map;
    }

    private long A00(long j, long j2) {
        long A042 = this.A04.A04() / 1000;
        long j3 = A042 - 15724800;
        if (j <= 0 || j2 <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Bad bucket configuration: numValidBuckets = ");
            sb.append(j2);
            sb.append(", bucketLengthSec = ");
            sb.append(j);
            Log.e(sb.toString());
            return j3;
        }
        long j4 = A042 / j;
        long j5 = j2 - 1;
        if (j4 < j5) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Strange bucket configuration: currentBucket = ");
            sb2.append(j4);
            sb2.append(", currentTimeSec = ");
            sb2.append(A042);
            sb2.append(", numValidBuckets = ");
            sb2.append(j2);
            sb2.append(", bucketLengthSec = ");
            sb2.append(j);
            Log.e(sb2.toString());
        }
        return Math.max((j4 - j5) * j, j3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005e, code lost:
        if (r8 == 1) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A04(com.whatsapp.jid.UserJid r14, byte[] r15, long r16) {
        /*
            r13 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r16
            java.util.Map r4 = A02(r13)
            r2 = 2
            X.36K r3 = new X.36K
            r3.<init>(r13, r2, r0)
            r4.put(r14, r3)
            X.1DN r3 = r13.A03
            r0 = 3
            android.content.ContentValues r7 = new android.content.ContentValues
            r7.<init>(r0)
            java.lang.String r1 = r14.getRawString()
            java.lang.String r0 = "jid"
            r7.put(r0, r1)
            java.lang.String r0 = "incoming_tc_token"
            r7.put(r0, r15)
            java.lang.Long r1 = java.lang.Long.valueOf(r16)
            java.lang.String r0 = "incoming_tc_token_timestamp"
            r7.put(r0, r1)
            X.16r r0 = r3.A00
            X.1M0 r5 = r0.A04()
            X.71s r12 = r5.B1k()     // Catch:{ all -> 0x008b }
            java.lang.String r6 = "wa_trusted_contacts"
            java.lang.String r3 = "jid = ? AND incoming_tc_token_timestamp < ? "
            r11 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = r14.getRawString()     // Catch:{ all -> 0x0081 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x0081 }
            r10 = 1
            r2[r10] = r0     // Catch:{ all -> 0x0081 }
            long r8 = X.C229416o.A01(r7, r5, r6, r3, r2)     // Catch:{ all -> 0x0081 }
            r0 = 0
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x0060
            r2 = 1
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x0061
        L_0x0060:
            r0 = 1
        L_0x0061:
            X.C18740tg.A0C(r0)     // Catch:{ all -> 0x0081 }
            if (r4 != 0) goto L_0x0077
            X.14e r2 = r5.A02     // Catch:{ all -> 0x0081 }
            r1 = 4
            java.lang.String r0 = "PrivacyTokenStore/insert_wa_trusted_contacts"
            long r3 = r2.A08(r6, r0, r7, r1)     // Catch:{ all -> 0x0081 }
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0076
            r11 = 0
        L_0x0076:
            r10 = r11
        L_0x0077:
            r12.A00()     // Catch:{ all -> 0x0081 }
            r12.close()     // Catch:{ all -> 0x008b }
            r5.close()
            return r10
        L_0x0081:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0086 }
            goto L_0x008a
        L_0x0086:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x008b }
        L_0x008a:
            throw r1     // Catch:{ all -> 0x008b }
        L_0x008b:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0090 }
            throw r1
        L_0x0090:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DM.A04(com.whatsapp.jid.UserJid, byte[], long):int");
    }

    public long A05() {
        C20810yC r4 = this.A06;
        C21000yV r1 = C21000yV.A02;
        return Math.min(A00((long) C20800yB.A00(r1, r4, 996), (long) C20800yB.A00(r1, r4, 997)), A06());
    }

    public long A06() {
        C20810yC r4 = this.A06;
        C21000yV r1 = C21000yV.A02;
        return A00((long) C20800yB.A00(r1, r4, 865), (long) C20800yB.A00(r1, r4, 909));
    }

    public C192449Ha A07(UserJid userJid) {
        Cursor A09;
        byte[] bArr;
        Long l;
        AnonymousClass1M0 A032 = this.A03.A00.get();
        try {
            A09 = A032.A02.A09("SELECT incoming_tc_token, incoming_tc_token_timestamp FROM wa_trusted_contacts WHERE jid= ?", "GET_RECEIVED_TOKEN_AND_TIMESTAMP_BY_JID", new String[]{userJid.getRawString()});
            if (A09.moveToNext()) {
                bArr = A09.getBlob(A09.getColumnIndexOrThrow("incoming_tc_token"));
                l = Long.valueOf(A09.getLong(A09.getColumnIndexOrThrow("incoming_tc_token_timestamp")));
            } else {
                bArr = null;
                l = null;
            }
            A09.close();
            A032.close();
            if (bArr != null) {
                C192449Ha r5 = new C192449Ha(l, bArr);
                if (r5.A00.longValue() >= A06()) {
                    return r5;
                }
            }
            return null;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public HashMap A09() {
        Cursor A09;
        AnonymousClass1DN r0 = this.A03;
        HashMap hashMap = new HashMap();
        AnonymousClass1M0 A032 = r0.A00.get();
        try {
            A09 = A032.A02.A09("SELECT jid, incoming_tc_token, incoming_tc_token_timestamp FROM wa_trusted_contacts", "GET_ALL_RECEIVED_TOKENS", new String[0]);
            int columnIndexOrThrow = A09.getColumnIndexOrThrow("jid");
            int columnIndexOrThrow2 = A09.getColumnIndexOrThrow("incoming_tc_token");
            int columnIndexOrThrow3 = A09.getColumnIndexOrThrow("incoming_tc_token_timestamp");
            while (A09.moveToNext()) {
                UserJid A022 = UserJid.Companion.A02(A09.getString(columnIndexOrThrow));
                byte[] blob = A09.getBlob(columnIndexOrThrow2);
                long j = A09.getLong(columnIndexOrThrow3);
                C18740tg.A06(blob);
                hashMap.put(A022, new C192449Ha(Long.valueOf(j), blob));
            }
            A09.close();
            A032.close();
            return hashMap;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public HashMap A0A() {
        Cursor A09;
        AnonymousClass1DN r0 = this.A03;
        HashMap hashMap = new HashMap();
        AnonymousClass1M0 A032 = r0.A00.get();
        try {
            A09 = A032.A02.A09("SELECT jid, sent_tc_token_timestamp, real_issue_timestamp FROM wa_trusted_contacts_send", "GET_ALL_SENT_TOKENS", new String[0]);
            int columnIndexOrThrow = A09.getColumnIndexOrThrow("jid");
            while (A09.moveToNext()) {
                AnonymousClass11F A022 = AnonymousClass11F.A00.A02(A09.getString(columnIndexOrThrow));
                if (A022 != null) {
                    hashMap.put(A022, AnonymousClass1DN.A04(A09));
                }
            }
            A09.close();
            A032.close();
            return hashMap;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A0B(UserJid userJid, long j) {
        C1495671s B1k;
        AnonymousClass1M0 A042 = this.A03.A00.A04();
        try {
            B1k = A042.B1k();
            ContentValues contentValues = new ContentValues(2);
            Long valueOf = Long.valueOf(j);
            contentValues.put("sent_tc_token_timestamp", valueOf);
            contentValues.putNull("real_issue_timestamp");
            UserJid userJid2 = userJid;
            boolean z = false;
            String valueOf2 = String.valueOf(j);
            int i = (C229416o.A01(contentValues, A042, "wa_trusted_contacts_send", "jid = ? AND sent_tc_token_timestamp <= ?", new String[]{userJid2.getRawString(), valueOf2}) > 1 ? 1 : (C229416o.A01(contentValues, A042, "wa_trusted_contacts_send", "jid = ? AND sent_tc_token_timestamp <= ?", new String[]{userJid2.getRawString(), valueOf2}) == 1 ? 0 : -1));
            if (i < 0) {
                ContentValues contentValues2 = new ContentValues(1);
                contentValues2.put("real_issue_timestamp", valueOf);
                i = (C229416o.A01(contentValues2, A042, "wa_trusted_contacts_send", "jid = ? AND real_issue_timestamp IS NOT NULL AND real_issue_timestamp <= ?", new String[]{userJid2.getRawString(), valueOf2}) > 1 ? 1 : (C229416o.A01(contentValues2, A042, "wa_trusted_contacts_send", "jid = ? AND real_issue_timestamp IS NOT NULL AND real_issue_timestamp <= ?", new String[]{userJid2.getRawString(), valueOf2}) == 1 ? 0 : -1));
                if (i < 0) {
                    ContentValues contentValues3 = new ContentValues(2);
                    contentValues3.put("jid", userJid2.getRawString());
                    contentValues3.put("sent_tc_token_timestamp", valueOf);
                    long A08 = A042.A02.A08("wa_trusted_contacts_send", "PrivacyTokenStore/insert_wa_trusted_contacts_send", contentValues3, 4);
                    B1k.A00();
                    if (A08 == -1) {
                        B1k.close();
                        A042.close();
                        return;
                    }
                    B1k.close();
                    A042.close();
                    A03(this).remove(userJid2);
                    return;
                }
            }
            if (i == 0) {
                z = true;
            }
            C18740tg.A0D(z, "Should have only one row per JID");
            B1k.A00();
            B1k.close();
            A042.close();
            A03(this).remove(userJid2);
            return;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public boolean A0C(UserJid userJid) {
        Long l;
        if (userJid == null) {
            return false;
        }
        AnonymousClass141 A08 = this.A02.A08(userJid);
        if (A08 != null && A08.A0B()) {
            return true;
        }
        C119505pv A082 = A08(userJid);
        if (A082 == null || (l = A082.A01) == null) {
            return false;
        }
        long longValue = l.longValue();
        C20810yC r4 = this.A06;
        C21000yV r1 = C21000yV.A02;
        if (longValue >= A00((long) C20800yB.A00(r1, r4, 865), (long) C20800yB.A00(r1, r4, 3802))) {
            return true;
        }
        return false;
    }

    public AnonymousClass1DM(AnonymousClass16D r2, C19970wo r3, C19420v0 r4, C20810yC r5, C229716r r6) {
        this.A04 = r3;
        this.A06 = r5;
        this.A02 = r2;
        this.A03 = new AnonymousClass1DN(r6);
        this.A05 = r4;
    }

    public static AnonymousClass36K A01(AnonymousClass1DM r11, UserJid userJid) {
        Map A022 = A02(r11);
        AnonymousClass36K r6 = (AnonymousClass36K) A022.get(userJid);
        if (r6 != null) {
            int i = r6.A00;
            if (i == 1 || i == 0) {
                if (r6.A01 > r11.A04.A04() - 21600000) {
                    return r6;
                }
            } else if (i == 2 && r6.A01 >= r11.A06() * 1000) {
                return r6;
            }
            A022.remove(userJid);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r5.A00 < A05()) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C119505pv A08(com.whatsapp.jid.UserJid r8) {
        /*
            r7 = this;
            java.util.Map r6 = A03(r7)
            boolean r0 = r6.containsKey(r8)
            if (r0 != 0) goto L_0x0063
            X.1DN r0 = r7.A03
            X.16r r0 = r0.A00
            X.1M0 r4 = r0.get()
            X.14e r5 = r4.A02     // Catch:{ all -> 0x0059 }
            java.lang.String r3 = "SELECT sent_tc_token_timestamp, real_issue_timestamp FROM wa_trusted_contacts_send WHERE jid= ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0059 }
            r1 = 0
            java.lang.String r0 = r8.getRawString()     // Catch:{ all -> 0x0059 }
            r2[r1] = r0     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = "GET_SENT_TOKEN_BY_JID"
            android.database.Cursor r2 = r5.A09(r3, r0, r2)     // Catch:{ all -> 0x0059 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0034
            X.5pv r5 = X.AnonymousClass1DN.A04(r2)     // Catch:{ all -> 0x004d }
            r2.close()     // Catch:{ all -> 0x0059 }
            goto L_0x003b
        L_0x0034:
            r2.close()     // Catch:{ all -> 0x0059 }
            r4.close()
            goto L_0x0048
        L_0x003b:
            r4.close()
            long r3 = r5.A00
            long r1 = r7.A05()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            r6.put(r8, r5)
            return r5
        L_0x004d:
            r1 = move-exception
            if (r2 == 0) goto L_0x0058
            r2.close()     // Catch:{ all -> 0x0054 }
            goto L_0x0058
        L_0x0054:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0059 }
        L_0x0058:
            throw r1     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x005e }
            throw r1
        L_0x005e:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0063:
            java.lang.Object r0 = r6.get(r8)
            X.5pv r0 = (X.C119505pv) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DM.A08(com.whatsapp.jid.UserJid):X.5pv");
    }
}
