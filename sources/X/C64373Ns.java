package X;

/* renamed from: X.3Ns  reason: invalid class name and case insensitive filesystem */
public class C64373Ns {
    public final AnonymousClass37O A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b9, code lost:
        if (r7 != null) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C64373Ns A00(android.content.Context r10, X.C32731e6 r11, X.AnonymousClass1DU r12, X.AnonymousClass3T1 r13, int r14, boolean r15) {
        /*
            boolean r0 = r13 instanceof X.AnonymousClass2bO
            java.lang.String r7 = ""
            r1 = 0
            if (r0 == 0) goto L_0x0073
            X.3Qa r3 = r13.A1J
            X.11F r0 = r3.A00
            boolean r2 = r0 instanceof X.C28981Uw
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x006a
            r0 = 2131893744(0x7f121df0, float:1.9422273E38)
            if (r2 == 0) goto L_0x0019
            r0 = 2131893745(0x7f121df1, float:1.9422275E38)
        L_0x0019:
            java.lang.String r9 = r10.getString(r0)
            r5 = r1
            r8 = r1
            r4 = r1
            r3 = r1
        L_0x0021:
            boolean r0 = r7.equals(r4)
            if (r0 == 0) goto L_0x0034
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x0034
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x0034
            r7 = r1
        L_0x0034:
            boolean r0 = android.text.TextUtils.equals(r4, r5)
            r10 = 1
            if (r0 == 0) goto L_0x0047
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x0054
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x0054
        L_0x0047:
            int r0 = r13.A1I
            if (r0 == 0) goto L_0x0068
            boolean r0 = X.C66013Ui.A0n(r13)
            if (r0 != 0) goto L_0x0068
        L_0x0051:
            r8 = r5
            r3 = r5
            r9 = r1
        L_0x0054:
            com.whatsapp.jid.UserJid r0 = r13.A0L()
            java.util.Set r2 = r11.BFr(r0, r13, r5)
            if (r2 == 0) goto L_0x0060
            r9 = r1
            r10 = 0
        L_0x0060:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x010e
            goto L_0x0105
        L_0x0068:
            r10 = 0
            goto L_0x0051
        L_0x006a:
            r0 = 2131893742(0x7f121dee, float:1.942227E38)
            if (r2 == 0) goto L_0x0019
            r0 = 2131893743(0x7f121def, float:1.9422271E38)
            goto L_0x0019
        L_0x0073:
            boolean r3 = r13 instanceof X.C23043B1o
            if (r3 != 0) goto L_0x00e3
            boolean r0 = X.C202359le.A04(r13)
            if (r0 != 0) goto L_0x00e3
            boolean r0 = r13 instanceof X.AnonymousClass2bV
            if (r0 == 0) goto L_0x00c5
            r5 = r13
            X.2bV r5 = (X.AnonymousClass2bV) r5
            java.lang.String r8 = r5.A05
            java.lang.String r7 = r5.A0b()
            java.lang.String r4 = r12.A03(r7)
            java.lang.String r0 = r5.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00c2
            r3 = r4
        L_0x0097:
            boolean r0 = X.C63933Lz.A01(r3)
            if (r0 == 0) goto L_0x00bf
            int r0 = r5.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r5.A04
            java.lang.String r9 = X.AnonymousClass3MV.A00(r10, r2, r0, r15)
        L_0x00a9:
            java.util.ArrayList r2 = r12.A04(r7)
            if (r2 == 0) goto L_0x00bd
            int r0 = r2.size()
            if (r0 <= r14) goto L_0x00bd
            java.lang.String r5 = X.C36421kH.A0e(r2, r14)
        L_0x00b9:
            if (r7 == 0) goto L_0x0034
            goto L_0x0021
        L_0x00bd:
            r5 = r4
            goto L_0x00b9
        L_0x00bf:
            java.lang.String r9 = r5.A04
            goto L_0x00a9
        L_0x00c2:
            java.lang.String r3 = r5.A06
            goto L_0x0097
        L_0x00c5:
            boolean r0 = r13 instanceof X.AnonymousClass2bU
            if (r0 == 0) goto L_0x00de
            r0 = r13
            X.2bU r0 = (X.AnonymousClass2bU) r0
            java.lang.String r8 = r0.A1a()
            java.lang.String r9 = r0.A1b()
            java.lang.String r7 = r0.A1a()
            java.lang.String r4 = r12.A03(r7)
            r3 = r4
            goto L_0x00a9
        L_0x00de:
            r9 = r1
            r8 = r1
            r4 = r1
            r3 = r1
            goto L_0x00a9
        L_0x00e3:
            r2 = 0
            if (r3 == 0) goto L_0x00fa
            r0 = r13
            X.B1o r0 = (X.C23043B1o) r0
            X.9uk r0 = r0.BA8()
            if (r0 == 0) goto L_0x00f1
            java.lang.String r2 = r0.A09
        L_0x00f1:
            java.lang.String r9 = r12.A03(r2)
            r8 = r9
            r4 = r9
            r3 = r9
            r7 = r1
            goto L_0x00a9
        L_0x00fa:
            boolean r0 = X.C202359le.A04(r13)
            if (r0 == 0) goto L_0x00f1
            java.lang.String r2 = X.C202359le.A01(r13)
            goto L_0x00f1
        L_0x0105:
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x010e }
            r0.<init>(r3)     // Catch:{ MalformedURLException -> 0x010e }
            java.lang.String r1 = r0.getHost()     // Catch:{ MalformedURLException -> 0x010e }
        L_0x010e:
            X.37O r6 = new X.37O
            r6.<init>(r5, r1, r2)
            X.3Ns r5 = new X.3Ns
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64373Ns.A00(android.content.Context, X.1e6, X.1DU, X.3T1, int, boolean):X.3Ns");
    }

    public C64373Ns(AnonymousClass37O r2, String str, String str2, String str3, boolean z) {
        this.A02 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A01 = Boolean.valueOf(z);
        this.A00 = r2;
    }
}
