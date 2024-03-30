package X;

/* renamed from: X.9ak  reason: invalid class name and case insensitive filesystem */
public abstract class C196919ak {
    public static final C197499bo A00 = C197499bo.A01("k");
    public static final C197499bo A01 = C197499bo.A01("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0153, code lost:
        if (r3.A01 == 1.0f) goto L_0x0155;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C208599yW A00(X.AnonymousClass9Y2 r22, X.C21655ATw r23) {
        /*
            r2 = r23
            java.lang.Integer r3 = r2.A0H()
            java.lang.Integer r1 = X.C023109s.A0C
            r0 = 0
            r5 = 0
            if (r3 != r1) goto L_0x0010
            r5 = 1
            r2.A0M()
        L_0x0010:
            r6 = 0
            r12 = 0
            r14 = 0
            r13 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = 0
            r8 = 0
        L_0x0019:
            boolean r1 = r2.A0S()
            if (r1 == 0) goto L_0x00d4
            X.9bo r1 = A01
            int r3 = r2.A0F(r1)
            r1 = r22
            switch(r3) {
                case 0: goto L_0x0031;
                case 1: goto L_0x0052;
                case 2: goto L_0x00c5;
                case 3: goto L_0x0057;
                case 4: goto L_0x005c;
                case 5: goto L_0x00a7;
                case 6: goto L_0x00ad;
                case 7: goto L_0x00b3;
                case 8: goto L_0x00b9;
                case 9: goto L_0x00bf;
                default: goto L_0x002a;
            }
        L_0x002a:
            r2.A0P()
            r2.A0Q()
            goto L_0x0019
        L_0x0031:
            r2.A0M()
        L_0x0034:
            boolean r3 = r2.A0S()
            if (r3 == 0) goto L_0x004e
            X.9bo r3 = A00
            int r3 = r2.A0F(r3)
            if (r3 == 0) goto L_0x0049
            r2.A0P()
            r2.A0Q()
            goto L_0x0034
        L_0x0049:
            X.9yG r12 = X.C200549ha.A00(r1, r2)
            goto L_0x0034
        L_0x004e:
            r2.A0O()
            goto L_0x0019
        L_0x0052:
            X.B25 r14 = X.C200549ha.A01(r1, r2)
            goto L_0x0019
        L_0x0057:
            java.lang.String r3 = "Lottie doesn't support 3D layers."
            X.AnonymousClass9Y2.A00(r1, r3)
        L_0x005c:
            X.815 r6 = X.C200299h7.A01(r1, r2, r0)
            java.util.List r3 = r6.A00
            boolean r4 = r3.isEmpty()
            r21 = 0
            if (r4 == 0) goto L_0x0083
            java.lang.Float r19 = java.lang.Float.valueOf(r21)
            r16 = 0
            float r4 = r1.A00
            java.lang.Float r18 = java.lang.Float.valueOf(r4)
            X.9mQ r15 = new X.9mQ
            r17 = r1
            r20 = r19
            r15.<init>((android.view.animation.Interpolator) r16, (X.AnonymousClass9Y2) r17, (java.lang.Float) r18, (java.lang.Object) r19, (java.lang.Object) r20, (float) r21)
            r3.add(r15)
            goto L_0x0019
        L_0x0083:
            java.lang.Object r4 = r3.get(r0)
            X.9mQ r4 = (X.C202689mQ) r4
            java.lang.Object r4 = r4.A0E
            if (r4 != 0) goto L_0x0019
            java.lang.Float r19 = java.lang.Float.valueOf(r21)
            r16 = 0
            float r4 = r1.A00
            java.lang.Float r18 = java.lang.Float.valueOf(r4)
            X.9mQ r15 = new X.9mQ
            r17 = r1
            r20 = r19
            r15.<init>((android.view.animation.Interpolator) r16, (X.AnonymousClass9Y2) r17, (java.lang.Float) r18, (java.lang.Object) r19, (java.lang.Object) r20, (float) r21)
            r3.set(r0, r15)
            goto L_0x0019
        L_0x00a7:
            X.817 r11 = X.C200299h7.A02(r1, r2)
            goto L_0x0019
        L_0x00ad:
            X.815 r7 = X.C200299h7.A01(r1, r2, r0)
            goto L_0x0019
        L_0x00b3:
            X.815 r8 = X.C200299h7.A01(r1, r2, r0)
            goto L_0x0019
        L_0x00b9:
            X.815 r9 = X.C200299h7.A01(r1, r2, r0)
            goto L_0x0019
        L_0x00bf:
            X.815 r10 = X.C200299h7.A01(r1, r2, r0)
            goto L_0x0019
        L_0x00c5:
            X.9yd r4 = X.C208659yd.A00
            r3 = 1065353216(0x3f800000, float:1.0)
            java.util.ArrayList r1 = X.C200569hc.A00(r1, r4, r2, r3, r0)
            X.819 r13 = new X.819
            r13.<init>(r1)
            goto L_0x0019
        L_0x00d4:
            if (r5 == 0) goto L_0x00d9
            r2.A0O()
        L_0x00d9:
            if (r12 == 0) goto L_0x00f4
            boolean r1 = r12.BNL()
            if (r1 == 0) goto L_0x00f5
            java.util.List r1 = r12.A00
            java.lang.Object r1 = r1.get(r0)
            X.9mQ r1 = (X.C202689mQ) r1
            java.lang.Object r2 = r1.A0E
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            r1 = 0
            boolean r1 = r2.equals(r1, r1)
            if (r1 == 0) goto L_0x00f5
        L_0x00f4:
            r12 = 0
        L_0x00f5:
            if (r14 == 0) goto L_0x0116
            boolean r1 = r14 instanceof X.C208469yI
            if (r1 != 0) goto L_0x0117
            boolean r1 = r14.BNL()
            if (r1 == 0) goto L_0x0117
            java.util.List r1 = r14.BDO()
            java.lang.Object r1 = r1.get(r0)
            X.9mQ r1 = (X.C202689mQ) r1
            java.lang.Object r2 = r1.A0E
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            r1 = 0
            boolean r1 = r2.equals(r1, r1)
            if (r1 == 0) goto L_0x0117
        L_0x0116:
            r14 = 0
        L_0x0117:
            if (r6 == 0) goto L_0x0132
            boolean r1 = r6.BNL()
            if (r1 == 0) goto L_0x0133
            java.util.List r1 = r6.A00
            java.lang.Object r1 = r1.get(r0)
            X.9mQ r1 = (X.C202689mQ) r1
            java.lang.Object r1 = r1.A0E
            float r2 = X.C36441kJ.A03(r1)
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0133
        L_0x0132:
            r6 = 0
        L_0x0133:
            if (r13 == 0) goto L_0x0155
            boolean r1 = r13.BNL()
            if (r1 == 0) goto L_0x0156
            java.util.List r1 = r13.A00
            java.lang.Object r1 = r1.get(r0)
            X.9mQ r1 = (X.C202689mQ) r1
            java.lang.Object r3 = r1.A0E
            X.9dx r3 = (X.C198639dx) r3
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r3.A00
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0156
            float r1 = r3.A01
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0156
        L_0x0155:
            r13 = 0
        L_0x0156:
            if (r9 == 0) goto L_0x0171
            boolean r1 = r9.BNL()
            if (r1 == 0) goto L_0x0172
            java.util.List r1 = r9.A00
            java.lang.Object r1 = r1.get(r0)
            X.9mQ r1 = (X.C202689mQ) r1
            java.lang.Object r1 = r1.A0E
            float r2 = X.C36441kJ.A03(r1)
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0172
        L_0x0171:
            r9 = 0
        L_0x0172:
            if (r10 == 0) goto L_0x018d
            boolean r1 = r10.BNL()
            if (r1 == 0) goto L_0x018e
            java.util.List r1 = r10.A00
            java.lang.Object r0 = r1.get(r0)
            X.9mQ r0 = (X.C202689mQ) r0
            java.lang.Object r0 = r0.A0E
            float r1 = X.C36441kJ.A03(r0)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x018e
        L_0x018d:
            r10 = 0
        L_0x018e:
            X.9yW r5 = new X.9yW
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196919ak.A00(X.9Y2, X.ATw):X.9yW");
    }
}
