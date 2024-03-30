package X;

/* renamed from: X.3Ov  reason: invalid class name and case insensitive filesystem */
public final class C64633Ov {
    public final C19630wG A00;
    public final C18820ts A01;
    public final C20810yC A02;
    public final C596634u A03;
    public final C54852tf A04;

    public static final int A00(C64633Ov r2, int i) {
        C20810yC r1 = r2.A02;
        if (!r1.A0E(4653) || !r1.A0E(5402)) {
            return i;
        }
        String language = C36401kF.A0x(r2.A01).getLanguage();
        AnonymousClass00C.A08(language);
        if (language.equals("") || i < 1000) {
            return i;
        }
        return (i / 1000) * 1000;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0073, code lost:
        if (r2 != null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009b, code lost:
        if (r4 >= r15) goto L_0x009d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A01(int r18) {
        /*
            r17 = this;
            r3 = r17
            X.0yC r1 = r3.A02
            r0 = 4653(0x122d, float:6.52E-42)
            boolean r0 = r1.A0E(r0)
            r1 = r18
            if (r0 == 0) goto L_0x0198
            X.34u r2 = r3.A03
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            X.0wG r0 = r3.A00
            android.content.res.Resources r9 = X.C36421kH.A0B(r0)
            X.AnonymousClass00C.A08(r9)
            r4 = 1000(0x3e8, float:1.401E-42)
            r8 = 1
            X.0ts r12 = r2.A00
            java.util.Locale r5 = X.C36401kF.A0x(r12)
            X.AnonymousClass00C.A08(r5)
            if (r1 != 0) goto L_0x002e
            java.lang.String r0 = ""
            return r0
        L_0x002e:
            int r10 = r1.intValue()
            if (r10 >= r4) goto L_0x0040
            java.text.NumberFormat r0 = java.text.NumberFormat.getNumberInstance(r5)
            java.lang.String r0 = r0.format(r1)
            X.AnonymousClass00C.A08(r0)
            return r0
        L_0x0040:
            X.00T r1 = r2.A01
            java.lang.Object r0 = r1.getValue()
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L_0x0075
            java.lang.Object r0 = r1.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r3 = r0.iterator()
        L_0x0058:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0184
            java.lang.Object r2 = r3.next()
            r0 = r2
            java.util.Locale r0 = (java.util.Locale) r0
            java.lang.String r1 = r0.getLanguage()
            java.lang.String r0 = r5.getLanguage()
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0058
            if (r2 == 0) goto L_0x0184
        L_0x0075:
            X.2pa r7 = X.C52532pa.A02
        L_0x0077:
            X.2pa r0 = X.C52532pa.A02
            r6 = 0
            r2 = 4621819117588971520(0x4024000000000000, double:10.0)
            if (r7 != r0) goto L_0x009d
            double r4 = (double) r4
            int r0 = r0.stepSize
            double r0 = (double) r0
            double r15 = java.lang.Math.pow(r2, r0)
            int r0 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x009d
            double r4 = (double) r10
            X.2pa r0 = X.C52532pa.A03
            int r0 = r0.stepSize
            double r0 = (double) r0
            double r13 = java.lang.Math.pow(r2, r0)
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x009d
            int r1 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L_0x009e
        L_0x009d:
            r0 = 0
        L_0x009e:
            java.lang.String r11 = "%d"
            if (r0 == 0) goto L_0x0110
            java.lang.Object[] r8 = new java.lang.Object[r8]
            double r4 = (double) r10
            X.2pa r7 = X.C52532pa.A03
            int r0 = r7.stepSize
            double r0 = (double) r0
            double r0 = java.lang.Math.pow(r2, r0)
            double r4 = r4 / r0
            int r0 = (int) r4
            X.AnonymousClass000.A1L(r8, r0, r6)
            java.util.Locale r2 = X.C36401kF.A0x(r12)
            r0 = 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r8, r0)
            int r0 = r1.length
            java.lang.String r13 = X.C36391kE.A0y(r11, r2, r1, r0)
            int r11 = r7.stepSize
        L_0x00c3:
            r0 = 3
            r1 = 2
            r2 = 1
            if (r11 == r0) goto L_0x00fc
            r0 = 4
            if (r11 == r0) goto L_0x00f8
            r0 = 6
            if (r11 == r0) goto L_0x0100
            r0 = 8
            if (r11 == r0) goto L_0x00f4
            r0 = 9
            if (r11 != r0) goto L_0x0188
            r5 = 2131894373(0x7f122065, float:1.9423549E38)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r6] = r13
        L_0x00df:
            r3 = 0
            java.lang.String r2 = "%s"
            int r0 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            int r0 = r1.length
            java.lang.String r0 = X.C36391kE.A0y(r2, r3, r1, r0)
            java.lang.String r0 = X.C36411kG.A0w(r9, r0, r4, r6, r5)
            X.AnonymousClass00C.A0B(r0)
            return r0
        L_0x00f4:
            r5 = 2131894374(0x7f122066, float:1.942355E38)
            goto L_0x0103
        L_0x00f8:
            r5 = 2131894376(0x7f122068, float:1.9423555E38)
            goto L_0x0103
        L_0x00fc:
            r5 = 2131894377(0x7f122069, float:1.9423557E38)
            goto L_0x0103
        L_0x0100:
            r5 = 2131894375(0x7f122067, float:1.9423553E38)
        L_0x0103:
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r6] = r13
            java.util.Locale r0 = X.C36401kF.A0x(r12)
            r1[r2] = r0
            goto L_0x00df
        L_0x0110:
            double r4 = (double) r10
            int r10 = r7.stepSize
            double r0 = (double) r10
            double r2 = java.lang.Math.pow(r2, r0)
            double r13 = java.lang.Math.log10(r4)
            double r13 = java.lang.Math.floor(r13)
            double r13 = r13 / r0
            double r0 = java.lang.Math.floor(r13)
            double r0 = java.lang.Math.pow(r2, r0)
            double r13 = r4 / r0
            int r10 = r10 - r8
            double r2 = (double) r10
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r1 = java.lang.Math.pow(r0, r2)
            r10 = 10
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x017b
            double r0 = java.lang.Math.floor(r13)
        L_0x013d:
            double r2 = (double) r10
            double r2 = r2 * r0
            double r2 = java.lang.Math.floor(r2)
            int r11 = (int) r2
            int r11 = r11 % r10
            if (r11 != 0) goto L_0x0178
            java.lang.String r10 = "%.0f"
        L_0x0149:
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3[r6] = r0
            java.util.Locale r2 = X.C36401kF.A0x(r12)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r3, r8)
            int r0 = r1.length
            java.lang.String r13 = X.C36391kE.A0y(r10, r2, r1, r0)
            r11 = 0
            r10 = 1
        L_0x0160:
            int r8 = r7.stepSize
            int r1 = r8 + r11
            int r0 = r7.maxMultiplier
            if (r1 > r0) goto L_0x00c3
            r2 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r0 = (double) r8
            double r0 = java.lang.Math.pow(r2, r0)
            int r2 = (int) r0
            int r10 = r10 * r2
            double r0 = (double) r10
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x00c3
            int r11 = r11 + r8
            goto L_0x0160
        L_0x0178:
            java.lang.String r10 = "%.1f"
            goto L_0x0149
        L_0x017b:
            double r2 = (double) r10
            double r13 = r13 * r2
            int r0 = X.C14960mT.A00(r13)
            double r0 = (double) r0
            double r0 = r0 / r2
            goto L_0x013d
        L_0x0184:
            X.2pa r7 = X.C52532pa.A03
            goto L_0x0077
        L_0x0188:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid multiplier: "
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r11)
            X.3yL r0 = new X.3yL
            r0.<init>(r1)
            throw r0
        L_0x0198:
            long r1 = (long) r1
            X.0ts r0 = r3.A01
            java.text.NumberFormat r0 = r0.A0M()
            java.lang.String r0 = r0.format(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64633Ov.A01(int):java.lang.String");
    }

    public C64633Ov(C19630wG r1, C18820ts r2, C20810yC r3, C596634u r4, C54852tf r5) {
        C36321k7.A1B(r3, r4, r2, r1, r5);
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = r5;
    }
}
