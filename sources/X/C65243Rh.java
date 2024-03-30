package X;

/* renamed from: X.3Rh  reason: invalid class name and case insensitive filesystem */
public final class C65243Rh {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r1 != 22) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        if (r4 == 4) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        if (r7.A0E(3522) != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a8, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e5, code lost:
        if (r1 != 22) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f0, code lost:
        if (r6 == 4) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f8, code lost:
        if (r7.A0E(3522) != false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00fb, code lost:
        if (r2 != 1) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00fd, code lost:
        if (r3 != false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0105, code lost:
        if (r7.A0E(2060) == false) goto L_0x00e7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C65243Rh A00(X.C20810yC r7, X.AnonymousClass1DU r8, X.AnonymousClass3T1 r9) {
        /*
            r5 = 0
            X.C36331k8.A1I(r7, r8)
            r2 = 2
            X.AnonymousClass00C.A0D(r9, r2)
            X.3BG r1 = r9.A0V
            if (r1 == 0) goto L_0x0092
            int r0 = r1.A01
            if (r0 != r2) goto L_0x003f
            java.lang.String r3 = r1.A04
            r0 = r3
            if (r3 != 0) goto L_0x0017
            java.lang.String r0 = ""
        L_0x0017:
            int r4 = X.AnonymousClass3TO.A01(r8, r0)
            java.lang.String r2 = r1.A08
            r6 = 1
            if (r4 == 0) goto L_0x002d
            r0 = 4
            if (r4 != r0) goto L_0x0034
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 == r0) goto L_0x002d
            r0 = 22
            if (r1 != r0) goto L_0x0036
        L_0x002d:
            r6 = 0
        L_0x002e:
            X.3Rh r1 = new X.3Rh
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L_0x0034:
            if (r4 != r0) goto L_0x002e
        L_0x0036:
            r0 = 3522(0xdc2, float:4.935E-42)
            boolean r0 = r7.A0E(r0)
            if (r0 == 0) goto L_0x002e
            goto L_0x002d
        L_0x003f:
            java.lang.String r4 = r1.A08
            java.lang.String r5 = r1.A09
            r7 = 0
            if (r4 == 0) goto L_0x006b
            java.lang.String r0 = X.AnonymousClass1DU.A01(r4)
            android.net.Uri r3 = android.net.Uri.parse(r0)
            java.lang.String[] r2 = X.AnonymousClass6JD.A0b
            X.AnonymousClass00C.A09(r2)
            if (r3 == 0) goto L_0x0074
            java.lang.String r1 = r3.getHost()
            if (r1 == 0) goto L_0x0074
            java.util.Locale r0 = java.util.Locale.ROOT
            X.AnonymousClass00C.A09(r0)
            java.lang.String r0 = X.C36431kI.A1D(r0, r1)
            boolean r0 = X.AnonymousClass02R.A0F(r0, r2)
            if (r0 == 0) goto L_0x0074
            r7 = 1
        L_0x006b:
            X.3Rh r1 = new X.3Rh
            r6 = 0
            r8 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            return r1
        L_0x0074:
            java.lang.String[] r2 = X.AnonymousClass6JD.A0c
            X.AnonymousClass00C.A09(r2)
            if (r3 == 0) goto L_0x006b
            java.lang.String r1 = r3.getHost()
            if (r1 == 0) goto L_0x006b
            java.util.Locale r0 = java.util.Locale.ROOT
            X.AnonymousClass00C.A09(r0)
            java.lang.String r0 = X.C36431kI.A1D(r0, r1)
            boolean r0 = X.AnonymousClass02R.A0F(r0, r2)
            if (r0 == 0) goto L_0x006b
            r7 = 2
            goto L_0x006b
        L_0x0092:
            boolean r0 = r9 instanceof X.AnonymousClass2bV
            if (r0 == 0) goto L_0x010c
            r2 = r9
            X.2bV r2 = (X.AnonymousClass2bV) r2
            java.lang.String r0 = r2.A05
            java.lang.String r1 = r2.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00aa
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r0 = 0
            if (r1 != 0) goto L_0x00ab
        L_0x00aa:
            r0 = 1
        L_0x00ab:
            r5 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0108
            java.lang.String r0 = r9.A0b()
            java.lang.String r4 = r8.A03(r0)
            if (r4 == 0) goto L_0x0108
            java.lang.String r5 = r2.A06
            if (r5 == 0) goto L_0x00c3
            int r0 = r5.length()
            if (r0 != 0) goto L_0x00c4
        L_0x00c3:
            r5 = r4
        L_0x00c4:
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0109
            int r6 = X.AnonymousClass3TO.A01(r8, r5)
            byte[] r0 = r2.A1c()
            if (r0 != 0) goto L_0x00d5
            r3 = 0
        L_0x00d5:
            int r2 = r2.A01
            r8 = 1
            if (r6 == 0) goto L_0x00e7
            r0 = 4
            if (r6 != r0) goto L_0x00f0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 == r0) goto L_0x00e7
            r0 = 22
            if (r1 != r0) goto L_0x00f2
        L_0x00e7:
            r8 = 0
        L_0x00e8:
            X.3Rh r1 = new X.3Rh
            r7 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            return r1
        L_0x00f0:
            if (r6 != r0) goto L_0x00fb
        L_0x00f2:
            r0 = 3522(0xdc2, float:4.935E-42)
            boolean r0 = r7.A0E(r0)
            if (r0 == 0) goto L_0x00fb
            goto L_0x00e7
        L_0x00fb:
            if (r2 != r8) goto L_0x00e7
            if (r3 != 0) goto L_0x00e8
            r0 = 2060(0x80c, float:2.887E-42)
            boolean r0 = r7.A0E(r0)
            if (r0 == 0) goto L_0x00e7
            goto L_0x00e8
        L_0x0108:
            r4 = r5
        L_0x0109:
            r8 = 0
            r6 = 0
            goto L_0x00e8
        L_0x010c:
            r2 = 0
            r4 = 0
            r6 = 0
            X.3Rh r1 = new X.3Rh
            r3 = r2
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65243Rh.A00(X.0yC, X.1DU, X.3T1):X.3Rh");
    }

    public C65243Rh(String str, String str2, int i, int i2, boolean z) {
        this.A03 = str;
        this.A02 = str2;
        this.A04 = z;
        this.A01 = i;
        this.A00 = i2;
    }
}
