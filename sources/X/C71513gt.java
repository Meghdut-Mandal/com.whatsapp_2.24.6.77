package X;

/* renamed from: X.3gt  reason: invalid class name and case insensitive filesystem */
public class C71513gt implements C159417jK {
    public final AnonymousClass1DM A00;
    public final C19420v0 A01;
    public final C30911ay A02;
    public final C19970wo A03;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0062, code lost:
        if (r17 < r8) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BV1() {
        /*
            r21 = this;
            r7 = r21
            X.0v0 r6 = r7.A01
            X.005 r1 = r6.A00
            android.content.SharedPreferences r0 = X.C36391kE.A0H(r1)
            java.lang.String r5 = "privacy_token_last_batch_time_sec"
            long r19 = X.C36371kC.A08(r0, r5)
            android.content.SharedPreferences r1 = X.C36391kE.A0H(r1)
            java.lang.String r3 = "privacy_token_batch_offset_sec"
            r0 = -1
            int r1 = r1.getInt(r3, r0)
            r2 = 604800(0x93a80, float:8.47505E-40)
            if (r1 < 0) goto L_0x0022
            if (r1 < r2) goto L_0x002e
        L_0x0022:
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            int r1 = r0.nextInt(r2)
            X.C36321k7.A0q(r6, r3, r1)
        L_0x002e:
            X.0wo r0 = r7.A03
            long r2 = X.C36371kC.A09(r0)
            r17 = 86400(0x15180, double:4.26873E-319)
            long r17 = r17 + r2
            r8 = 7200(0x1c20, double:3.5573E-320)
            long r10 = r17 - r8
            r15 = 604800(0x93a80, double:2.98811E-318)
            long r8 = r19 + r15
            r14 = 1
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            boolean r4 = X.AnonymousClass000.A1R(r0)
            long r0 = (long) r1
            long r12 = r19 - r0
            long r12 = r12 / r15
            long r10 = r2 - r0
            long r10 = r10 / r15
            long r8 = r10 * r15
            long r8 = r8 + r0
            r0 = 129600(0x1fa40, double:6.4031E-319)
            long r8 = r8 + r0
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x0064
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0064
            int r0 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            r1 = 1
            if (r0 >= 0) goto L_0x0065
        L_0x0064:
            r1 = 0
        L_0x0065:
            long r15 = r15 + r2
            int r0 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x006b
            r14 = 0
        L_0x006b:
            if (r4 != 0) goto L_0x0072
            if (r1 != 0) goto L_0x0072
            if (r14 != 0) goto L_0x0072
            return
        L_0x0072:
            X.1DM r0 = r7.A00
            X.1DN r0 = r0.A03
            java.util.HashSet r9 = X.C36441kJ.A16()
            X.16r r0 = r0.A00
            X.1M0 r8 = r0.get()
            X.14e r10 = r8.A02     // Catch:{ all -> 0x00d5 }
            java.lang.String r4 = "SELECT jid FROM wa_trusted_contacts_send WHERE real_issue_timestamp >= 0"
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = "GET_DEFERRED_TOKEN_JIDS"
            android.database.Cursor r4 = r10.A09(r4, r0, r1)     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = "jid"
            int r1 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c9 }
        L_0x0093:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x00a7
            java.lang.String r0 = r4.getString(r1)     // Catch:{ all -> 0x00c9 }
            com.whatsapp.jid.UserJid r0 = X.C36431kI.A0l(r0)     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x0093
            r9.add(r0)     // Catch:{ all -> 0x00c9 }
            goto L_0x0093
        L_0x00a7:
            r4.close()     // Catch:{ all -> 0x00d5 }
            r8.close()
            java.util.Iterator r4 = r9.iterator()
        L_0x00b1:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00c1
            com.whatsapp.jid.UserJid r1 = X.C36441kJ.A0o(r4)
            X.1ay r0 = r7.A02
            r0.A00(r1)
            goto L_0x00b1
        L_0x00c1:
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r6)
            X.C36341k9.A0w(r0, r5, r2)
            return
        L_0x00c9:
            r1 = move-exception
            if (r4 == 0) goto L_0x00d4
            r4.close()     // Catch:{ all -> 0x00d0 }
            goto L_0x00d4
        L_0x00d0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00d5 }
        L_0x00d4:
            throw r1     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x00da }
            throw r1
        L_0x00da:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71513gt.BV1():void");
    }

    public C71513gt(AnonymousClass1DM r1, C19970wo r2, C19420v0 r3, C30911ay r4) {
        this.A03 = r2;
        this.A00 = r1;
        this.A02 = r4;
        this.A01 = r3;
    }
}
