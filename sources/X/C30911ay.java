package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.GeneratePrivacyTokenJob;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1ay  reason: invalid class name and case insensitive filesystem */
public class C30911ay {
    public Set A00;
    public final C19970wo A01;
    public final C20810yC A02;
    public final AnonymousClass164 A03;
    public final AnonymousClass1DM A04;

    public void A01(UserJid userJid) {
        Set set;
        synchronized (this) {
            set = this.A00;
            if (set == null) {
                set = Collections.synchronizedSet(new HashSet());
                this.A00 = set;
            }
        }
        synchronized (set) {
            set.remove(userJid);
        }
    }

    public boolean A03(UserJid userJid) {
        Set set;
        synchronized (this) {
            set = this.A00;
            if (set == null) {
                set = Collections.synchronizedSet(new HashSet());
                this.A00 = set;
            }
        }
        synchronized (set) {
            if (set.contains(userJid)) {
                return false;
            }
            set.add(userJid);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ab, code lost:
        if (r6 < 0) goto L_0x00ad;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(com.whatsapp.jid.UserJid r19) {
        /*
            r18 = this;
            r10 = r18
            X.1DM r4 = r10.A04
            r11 = r19
            X.5pv r3 = r4.A08(r11)
            if (r3 == 0) goto L_0x004a
            long r5 = r3.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            if (r0 == 0) goto L_0x004a
            X.0yC r2 = r10.A02
            r1 = 996(0x3e4, float:1.396E-42)
            X.0yV r0 = X.C21000yV.A02
            int r0 = X.C20800yB.A00(r0, r2, r1)
            long r0 = (long) r0
            r12 = 1000(0x3e8, double:4.94E-321)
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x005d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "Bad bucket configuration, bucketLengthSec = "
            r7.append(r2)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0wo r0 = r10.A01
            long r7 = r0.A04()
            long r7 = r7 / r12
            r0 = 15724800(0xeff100, double:7.7690835E-317)
            long r7 = r7 - r0
        L_0x0046:
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x016a
        L_0x004a:
            X.0wo r0 = r10.A01
            long r16 = r0.A04()
            r14 = 1000(0x3e8, double:4.94E-321)
            long r16 = r16 / r14
            X.1DN r0 = r4.A03
            X.16r r0 = r0.A00
            X.1M0 r2 = r0.A04()
            goto L_0x0067
        L_0x005d:
            X.0wo r2 = r10.A01
            long r7 = r2.A04()
            long r7 = r7 / r12
            long r7 = r7 / r0
            long r5 = r5 / r0
            goto L_0x0046
        L_0x0067:
            X.71s r13 = r2.B1k()     // Catch:{ all -> 0x00fa }
            X.14e r5 = r2.A02     // Catch:{ all -> 0x00f0 }
            java.lang.String r7 = "SELECT sent_tc_token_timestamp, real_issue_timestamp FROM wa_trusted_contacts_send WHERE jid= ?"
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ all -> 0x00f0 }
            java.lang.String r1 = r11.getRawString()     // Catch:{ all -> 0x00f0 }
            r0 = 0
            r6[r0] = r1     // Catch:{ all -> 0x00f0 }
            java.lang.String r0 = "GET_SENT_TOKEN_BY_JID"
            android.database.Cursor r12 = r5.A09(r7, r0, r6)     // Catch:{ all -> 0x00f0 }
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x00e4 }
            r7 = 0
            if (r0 == 0) goto L_0x008a
            X.5pv r7 = X.AnonymousClass1DN.A04(r12)     // Catch:{ all -> 0x00e4 }
        L_0x008a:
            r8 = 0
            if (r7 == 0) goto L_0x00ad
            long r0 = r7.A00     // Catch:{ all -> 0x00e4 }
            int r6 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r6 < 0) goto L_0x00a1
            r13.A00()     // Catch:{ all -> 0x00e4 }
            r12.close()     // Catch:{ all -> 0x00f0 }
            r13.close()     // Catch:{ all -> 0x00fa }
            r2.close()
            goto L_0x010e
        L_0x00a1:
            java.lang.Long r0 = r7.A01     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x00d9
            long r6 = r0.longValue()     // Catch:{ all -> 0x00e4 }
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x00db
        L_0x00ad:
            r0 = 3
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x00e4 }
            r6.<init>(r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = "jid"
            java.lang.String r0 = r11.getRawString()     // Catch:{ all -> 0x00e4 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = "sent_tc_token_timestamp"
            java.lang.Long r0 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x00e4 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = "real_issue_timestamp"
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x00e4 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = "wa_trusted_contacts_send"
            java.lang.String r0 = "UPDATE_SCHEDULED_TIMESTAMP"
            r5.A06(r1, r0, r6)     // Catch:{ all -> 0x00e4 }
            r13.A00()     // Catch:{ all -> 0x00e4 }
            goto L_0x00dd
        L_0x00d9:
            r6 = 0
        L_0x00db:
            r8 = r6
            goto L_0x00ad
        L_0x00dd:
            r12.close()     // Catch:{ all -> 0x00f0 }
            r13.close()     // Catch:{ all -> 0x00fa }
            goto L_0x0104
        L_0x00e4:
            r1 = move-exception
            if (r12 == 0) goto L_0x00ef
            r12.close()     // Catch:{ all -> 0x00eb }
            goto L_0x00ef
        L_0x00eb:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00f0 }
        L_0x00ef:
            throw r1     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x00f5 }
            goto L_0x00f9
        L_0x00f5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00fa }
        L_0x00f9:
            throw r1     // Catch:{ all -> 0x00fa }
        L_0x00fa:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x00ff }
            throw r1
        L_0x00ff:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0104:
            r2.close()
            java.util.Map r0 = X.AnonymousClass1DM.A03(r4)
            r0.remove(r11)
        L_0x010e:
            if (r3 == 0) goto L_0x016b
            java.lang.Long r13 = r3.A01
            if (r13 == 0) goto L_0x016b
            X.0yC r2 = r4.A06
            r0 = 4063(0xfdf, float:5.693E-42)
            X.0yV r1 = X.C21000yV.A02
            int r12 = X.C20800yB.A00(r1, r2, r0)
            if (r12 <= 0) goto L_0x016b
            r0 = 996(0x3e4, float:1.396E-42)
            int r0 = X.C20800yB.A00(r1, r2, r0)
            long r8 = (long) r0
            X.0v0 r0 = r4.A05
            X.005 r0 = r0.A00
            java.lang.Object r3 = r0.get()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.String r2 = "privacy_token_last_batch_time_sec"
            r0 = -1
            long r6 = r3.getLong(r2, r0)
            long r6 = r6 / r8
            X.0wo r0 = r4.A04
            long r4 = r0.A04()
            long r4 = r4 / r14
            long r4 = r4 / r8
            r2 = 4693442413123862528(0x4122750200000000, double:604801.0)
            double r0 = (double) r8
            double r2 = r2 / r0
            double r0 = java.lang.Math.ceil(r2)
            int r2 = (int) r0
            long r0 = (long) r2
            long r2 = r4 - r0
            long r0 = java.lang.Math.min(r6, r4)
            long r3 = java.lang.Math.max(r2, r0)
            long r0 = (long) r12
            long r3 = r3 - r0
            long r3 = r3 * r8
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            if (r0 == 0) goto L_0x016b
            long r1 = r13.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x016b
        L_0x016a:
            return
        L_0x016b:
            boolean r0 = r10.A03(r11)
            if (r0 == 0) goto L_0x016a
            X.164 r1 = r10.A03
            com.whatsapp.jobqueue.job.GeneratePrivacyTokenJob r0 = new com.whatsapp.jobqueue.job.GeneratePrivacyTokenJob
            r0.<init>(r11)
            r1.A01(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30911ay.A02(com.whatsapp.jid.UserJid):void");
    }

    public C30911ay(AnonymousClass164 r1, AnonymousClass1DM r2, C19970wo r3, C20810yC r4) {
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r1;
        this.A04 = r2;
    }

    public void A00(UserJid userJid) {
        if (A03(userJid)) {
            AnonymousClass1DM r1 = this.A04;
            C119505pv A08 = r1.A08(userJid);
            if (A08 != null) {
                long j = A08.A00;
                if (Long.valueOf(j) != null && j >= r1.A05()) {
                    this.A03.A01(new GeneratePrivacyTokenJob(userJid));
                    return;
                }
            }
            A01(userJid);
        }
    }
}
