package X;

/* renamed from: X.3w1  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80823w1 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C88424Sq A02;
    public final /* synthetic */ AnonymousClass3OD A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ AnonymousClass011 A08;

    public /* synthetic */ C80823w1(C88424Sq r1, AnonymousClass3OD r2, String str, String str2, String str3, String str4, AnonymousClass011 r7, int i, int i2) {
        this.A03 = r2;
        this.A00 = i;
        this.A04 = str;
        this.A05 = str2;
        this.A08 = r7;
        this.A06 = str3;
        this.A01 = i2;
        this.A07 = str4;
        this.A02 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00f2, code lost:
        if (r1.A00 != r16) goto L_0x00f4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r34 = this;
            r2 = r34
            X.3OD r10 = r2.A03
            int r5 = r2.A00
            java.lang.String r1 = r2.A04
            java.lang.String r9 = r2.A05
            X.011 r0 = r2.A08
            r33 = r0
            java.lang.String r0 = r2.A06
            r20 = r0
            int r0 = r2.A01
            r32 = r0
            java.lang.String r0 = r2.A07
            r31 = r0
            X.4Sq r0 = r2.A02
            r30 = r0
            r19 = 0
            if (r5 == 0) goto L_0x0223
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0223
            java.security.PublicKey r4 = X.AnonymousClass6UE.A05(r1)
            X.AnonymousClass00C.A08(r4)
            java.lang.String r2 = X.AnonymousClass6UE.A00()
            X.AnonymousClass00C.A08(r2)
            X.0wo r0 = r10.A05
            long r0 = X.C36371kC.A09(r0)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.String r2 = X.C130936Na.A01(r0, r2, r3, r4)
            X.AnonymousClass00C.A08(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "#PWD_WA:11:"
            r1.append(r0)
            r1.append(r3)
            r0 = 58
            r1.append(r0)
            java.lang.String r14 = X.AnonymousClass000.A0q(r2, r1)
        L_0x0060:
            if (r9 == 0) goto L_0x021f
            int r0 = r9.length()
            if (r0 == 0) goto L_0x021f
            X.189 r0 = r10.A07
            X.18u r0 = r0.A00
            X.34P r2 = r0.A04()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "1539"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r9, r1)
            X.66J r1 = r2.A00
            byte[] r0 = X.C36351kA.A1b(r0)
            byte[] r0 = X.C133256Xm.A08(r1, r0)
            java.lang.String r8 = X.C36441kJ.A13(r0)
            X.AnonymousClass00C.A08(r8)
        L_0x008b:
            java.util.Map r1 = r10.A0C
            r0 = 551495536(0x20df2770, float:3.7803767E-19)
            java.lang.Object r7 = X.C36371kC.A0r(r1, r0)
            if (r7 == 0) goto L_0x023f
            X.1UN r7 = (X.AnonymousClass1UN) r7
            java.lang.String r0 = "WFS_START"
            r7.A04(r0)
            X.3TX r6 = r10.A0A
            java.lang.String r5 = "wfs"
            java.lang.String r0 = "login_wfs"
            r6.A07(r5, r0)
            X.3UV r4 = r10.A09
            r0 = r33
            java.lang.Object r3 = r0.first
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r0.second
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = ""
            r11 = r1
            if (r20 == 0) goto L_0x00b9
            r1 = r20
        L_0x00b9:
            java.lang.String r0 = "foa_authproof"
            X.011 r1 = X.C36441kJ.A19(r0, r1)
            if (r9 == 0) goto L_0x00c2
            r11 = r9
        L_0x00c2:
            java.lang.String r0 = "wa_ac_ent_id"
            X.011 r15 = X.C36441kJ.A19(r0, r11)
            java.lang.String r0 = "wa_ac_ent_enc_pw"
            X.011 r18 = X.C36441kJ.A19(r0, r14)
            java.lang.String r0 = "id_ac_sign"
            X.011 r17 = X.C36441kJ.A19(r0, r8)
            boolean r16 = X.C36341k9.A1a(r3, r2)
            r11 = 4
            boolean r0 = r4.A0I()
            if (r0 != 0) goto L_0x01a3
            X.2op r0 = X.C52062op.FAIL_TO_INITIALIZE_WAMSYS
            X.3No r1 = new X.3No
            r1.<init>(r0)
        L_0x00e6:
            java.lang.String r0 = "WFS_END"
            r7.A04(r0)
            if (r1 == 0) goto L_0x00f4
            int r3 = r1.A00
            r2 = 1
            r0 = r16
            if (r3 == r0) goto L_0x00f5
        L_0x00f4:
            r2 = 0
        L_0x00f5:
            java.lang.String r4 = "successful"
            java.lang.String r3 = "is_2fac"
            if (r2 == 0) goto L_0x014c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r19)
            r7.A01(r0, r3)
            r6.A07(r5, r4)
            X.0v0 r4 = r10.A06
            android.content.SharedPreferences$Editor r3 = X.C19420v0.A00(r4)
            java.lang.String r2 = "pref_wfs_source"
            r0 = r32
            X.C36341k9.A0v(r3, r2, r0)
            android.content.SharedPreferences$Editor r3 = X.C19420v0.A00(r4)
            java.lang.String r2 = "pref_wfs_name"
            r0 = r31
            X.C36341k9.A0x(r3, r2, r0)
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r4)
            java.lang.String r0 = "pref_wfs_user"
            X.C36341k9.A0x(r2, r0, r9)
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r4)
            java.lang.String r0 = "pref_wfs_pw"
            X.C36341k9.A0x(r2, r0, r14)
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r4)
            java.lang.String r0 = "pref_wfs_id_sign"
            X.C36341k9.A0x(r2, r0, r8)
            X.17Y r5 = r10.A00
            r4 = 17
        L_0x013c:
            X.74n r3 = new X.74n
            r2 = r30
            r0 = r33
            r3.<init>(r2, r0, r1, r4)
            r5.Bp3(r3)
            r7.A00()
            return
        L_0x014c:
            if (r1 == 0) goto L_0x01a1
            X.2op r2 = r1.A01
        L_0x0150:
            X.2op r0 = X.C52062op.SECURITY_CODE
            if (r2 != r0) goto L_0x0227
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            r7.A01(r0, r3)
            r6.A07(r5, r4)
            X.0v0 r4 = r10.A06
            android.content.SharedPreferences$Editor r3 = X.C19420v0.A00(r4)
            java.lang.String r2 = "pref_wfs_source"
            r0 = r32
            X.C36341k9.A0v(r3, r2, r0)
            android.content.SharedPreferences$Editor r3 = X.C19420v0.A00(r4)
            java.lang.String r2 = "pref_wfs_name"
            r0 = r31
            X.C36341k9.A0x(r3, r2, r0)
            android.content.SharedPreferences$Editor r3 = X.C19420v0.A00(r4)
            java.lang.String r2 = "pref_wfs_blob"
            r0 = r20
            X.C36341k9.A0x(r3, r2, r0)
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r4)
            java.lang.String r0 = "pref_wfs_user"
            X.C36341k9.A0x(r2, r0, r9)
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r4)
            java.lang.String r0 = "pref_wfs_pw"
            X.C36341k9.A0x(r2, r0, r14)
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r4)
            java.lang.String r0 = "pref_wfs_id_sign"
            X.C36341k9.A0x(r2, r0, r8)
            X.17Y r5 = r10.A00
            r4 = 16
            goto L_0x013c
        L_0x01a1:
            r2 = 0
            goto L_0x0150
        L_0x01a3:
            r0 = r16
            r4.A0H(r0)
            byte[] r28 = r4.A0K(r3, r2)
            java.lang.String r0 = "wfsAuth"
            byte[] r29 = r4.A0J(r0)
            X.011[] r13 = new X.AnonymousClass011[r11]
            java.lang.Object r0 = r1.first
            r11 = r0
            java.lang.Object r0 = r1.second
            java.lang.String r0 = (java.lang.String) r0
            java.nio.charset.Charset r12 = X.AnonymousClass0S4.A05
            byte[] r1 = X.C36371kC.A1Z(r0, r12)
            r0 = 0
            X.C36341k9.A1J(r11, r1, r13, r0)
            java.lang.Object r0 = r15.first
            r21 = r0
            java.lang.Object r0 = r15.second
            java.lang.String r0 = (java.lang.String) r0
            byte[] r11 = X.C36371kC.A1Z(r0, r12)
            r1 = r16
            r0 = r21
            X.C36341k9.A1J(r0, r11, r13, r1)
            r0 = r18
            java.lang.Object r11 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            byte[] r1 = X.C36371kC.A1Z(r0, r12)
            r0 = 2
            X.C36341k9.A1J(r11, r1, r13, r0)
            r0 = r17
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            byte[] r11 = X.C36371kC.A1Z(r0, r12)
            r0 = 3
            X.C36341k9.A1J(r1, r11, r13, r0)
            java.util.LinkedHashMap r27 = X.C000400e.A08(r13)
            X.3No r1 = r4.A00
            if (r1 != 0) goto L_0x021b
            X.3Sd r1 = r4.A09
            java.util.List r26 = X.AnonymousClass3UV.A02(r4)
            X.33T r0 = r4.A08
            X.2kt r21 = new X.2kt
            r22 = r0
            r23 = r1
            r24 = r3
            r25 = r2
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r1 = X.AnonymousClass3PM.A00(r21)
            X.3No r1 = (X.C64333No) r1
        L_0x021b:
            r4.A00 = r1
            goto L_0x00e6
        L_0x021f:
            java.lang.String r8 = ""
            goto L_0x008b
        L_0x0223:
            java.lang.String r14 = ""
            goto L_0x0060
        L_0x0227:
            java.lang.String r0 = "failed"
            r6.A07(r5, r0)
            java.lang.String r0 = "WFS_ERROR"
            r7.A03(r0)
            X.17Y r3 = r10.A00
            r2 = 5
            X.72m r1 = new X.72m
            r0 = r30
            r1.<init>(r0, r2)
            r3.Bp3(r1)
            return
        L_0x023f:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80823w1.run():void");
    }
}
