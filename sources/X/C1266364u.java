package X;

/* renamed from: X.64u  reason: invalid class name and case insensitive filesystem */
public final class C1266364u {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C1271967i A03;
    public final /* synthetic */ C140456lc A04;
    public final /* synthetic */ C140456lc A05;
    public final /* synthetic */ C140456lc A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public C1266364u(C1271967i r1, C140456lc r2, C140456lc r3, C140456lc r4, int i, int i2, int i3, boolean z, boolean z2) {
        this.A07 = z;
        this.A03 = r1;
        this.A06 = r2;
        this.A02 = i;
        this.A08 = z2;
        this.A05 = r3;
        this.A04 = r4;
        this.A01 = i2;
        this.A00 = i3;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cf, code lost:
        r0.setSpan(r8, r7, r6, 0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.text.Layout r42, android.text.Spannable r43, X.C122065uF r44, int r45, int r46) {
        /*
            r41 = this;
            r1 = 1
            r0 = r43
            X.AnonymousClass00C.A0D(r0, r1)
            r4 = r41
            boolean r1 = r4.A07
            if (r1 == 0) goto L_0x0055
            X.67i r8 = r4.A03
            X.6lc r1 = r4.A06
            java.lang.String r9 = X.C140456lc.A0O(r1)
            java.lang.String r7 = X.C140456lc.A0M(r1)
            r0 = 38
            X.6lc r6 = r1.A0W(r0)
            r0 = 36
            X.C140456lc.A0I(r1, r0)
            r5 = 41
            X.6lc r4 = r1.A0W(r5)
            r0 = 43
            java.util.List r0 = r1.A0d(r0)
            java.util.Iterator r3 = X.C90514aH.A14(r0)
        L_0x0033:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0051
            X.6lc r2 = X.C90514aH.A0Y(r3)
            int r1 = r2.A04
            r0 = 16870(0x41e6, float:2.364E-41)
            if (r1 != r0) goto L_0x0033
            java.lang.Object r1 = X.C140456lc.A0I(r2, r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = X.C140456lc.A0J(r2)
            if (r1 == 0) goto L_0x0033
            if (r0 == 0) goto L_0x0033
        L_0x0051:
            X.AnonymousClass6Y5.A07(r8, r6, r4, r9, r7)
        L_0x0054:
            return
        L_0x0055:
            int r3 = r4.A02
            switch(r3) {
                case 16870: goto L_0x018d;
                case 16871: goto L_0x018d;
                case 16872: goto L_0x005a;
                case 16873: goto L_0x018d;
                case 16874: goto L_0x018d;
                case 16875: goto L_0x018d;
                case 16876: goto L_0x018d;
                default: goto L_0x005a;
            }
        L_0x005a:
            r1 = 0
        L_0x005b:
            r5 = 0
            if (r1 != 0) goto L_0x006c
            boolean r1 = r4.A08
            if (r1 != 0) goto L_0x0177
            X.67i r2 = r4.A03
            java.lang.String r1 = "TextNodeUtils:Span:unsupported-style"
            java.lang.String r0 = "Span style is not supported"
        L_0x0068:
            X.AnonymousClass6RS.A00(r2, r1, r0, r5)
            return
        L_0x006c:
            X.67i r9 = r4.A03
            X.6lc r11 = r4.A05
            X.6lc r10 = r4.A06
            X.6lc r8 = r4.A04
            r1 = r44
            int r7 = r1.A01
            int r6 = r1.A00
            switch(r3) {
                case 16870: goto L_0x009a;
                case 16871: goto L_0x00d5;
                case 16872: goto L_0x007d;
                case 16873: goto L_0x0105;
                case 16874: goto L_0x014c;
                case 16875: goto L_0x0082;
                case 16876: goto L_0x0165;
                default: goto L_0x007d;
            }
        L_0x007d:
            java.lang.IllegalArgumentException r0 = X.C90464aC.A0O(r3)
            throw r0
        L_0x0082:
            r1 = 35
            X.6lc r1 = r8.A0W(r1)
            if (r1 == 0) goto L_0x0177
            int r2 = X.AnonymousClass5Z8.A00(r9, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            if (r1 == 0) goto L_0x0177
            android.text.style.ForegroundColorSpan r8 = new android.text.style.ForegroundColorSpan
            r8.<init>(r2)
            goto L_0x00cf
        L_0x009a:
            java.lang.String r1 = X.C140456lc.A0N(r8)
            X.AnonymousClass6Y5.A05(r0, r9, r1, r7, r6)
            java.lang.String r13 = X.C140456lc.A0O(r8)
            java.lang.String r12 = X.C140456lc.A0J(r8)
            r10 = r0
            r11 = r9
            r14 = r7
            r15 = r6
            X.AnonymousClass6Y5.A06(r10, r11, r12, r13, r14, r15)
            r2 = 44
            r1 = 1
            float r2 = r8.A0S(r2, r1)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0177
            X.6NR r1 = X.AnonymousClass6NR.A00()
            android.content.Context r1 = r1.A00
            X.AnonymousClass00C.A08(r1)
            android.util.DisplayMetrics r1 = X.AnonymousClass000.A0X(r1)
            float r1 = r1.scaledDensity
            X.4cv r8 = new X.4cv
            r8.<init>(r2, r1)
        L_0x00cf:
            r1 = 0
            r0.setSpan(r8, r7, r6, r1)
            goto L_0x0177
        L_0x00d5:
            r1 = 40
            r2 = 0
            float r12 = r8.A0S(r1, r2)
            r1 = 36
            float r11 = r8.A0S(r1, r2)
            r1 = 38
            float r10 = r8.A0S(r1, r2)
            r1 = 35
            X.6lc r2 = r8.A0W(r1)
            r8 = 0
            r1 = 0
            int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0177
            if (r2 == 0) goto L_0x0103
            int r2 = X.AnonymousClass5Z8.A01(r9, r2, r8)
        L_0x00fa:
            X.4ch r1 = new X.4ch
            r1.<init>(r12, r11, r10, r2)
            r0.setSpan(r1, r7, r6, r8)
            goto L_0x0177
        L_0x0103:
            r2 = 0
            goto L_0x00fa
        L_0x0105:
            int r2 = r10.A04
            r1 = 16880(0x41f0, float:2.3654E-41)
            if (r2 == r1) goto L_0x0143
            r1 = 16887(0x41f7, float:2.3664E-41)
            if (r2 == r1) goto L_0x0143
            r1 = 16898(0x4202, float:2.3679E-41)
            if (r2 == r1) goto L_0x013a
            r13 = 0
        L_0x0114:
            r1 = 35
            java.lang.Object r12 = X.C140456lc.A0I(r8, r1)
            java.lang.String r12 = (java.lang.String) r12
            r1 = 36
            X.7ku r18 = r8.A0X(r1)
            r2 = 0
            if (r18 == 0) goto L_0x0177
            X.4rF r1 = new X.4rF
            r21 = 0
            r14 = r1
            r15 = r9
            r16 = r11
            r17 = r10
            r19 = r13
            r20 = r12
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r0.setSpan(r1, r7, r6, r2)
            goto L_0x0177
        L_0x013a:
            r1 = 44
            java.lang.Object r13 = X.C140456lc.A0I(r10, r1)
            java.lang.String r13 = (java.lang.String) r13
            goto L_0x0114
        L_0x0143:
            r1 = 35
            java.lang.Object r13 = X.C140456lc.A0I(r10, r1)
            java.lang.String r13 = (java.lang.String) r13
            goto L_0x0114
        L_0x014c:
            r2 = 35
            r1 = 0
            boolean r1 = r8.A0f(r2, r1)
            r2 = 0
            if (r1 == 0) goto L_0x015f
            android.text.style.StrikethroughSpan r1 = new android.text.style.StrikethroughSpan
            r1.<init>()
        L_0x015b:
            r0.setSpan(r1, r7, r6, r2)
            goto L_0x0177
        L_0x015f:
            X.4cd r1 = new X.4cd
            r1.<init>()
            goto L_0x015b
        L_0x0165:
            r2 = 35
            r1 = 0
            boolean r1 = r8.A0f(r2, r1)
            r2 = 0
            if (r1 == 0) goto L_0x0187
            android.text.style.UnderlineSpan r1 = new android.text.style.UnderlineSpan
            r1.<init>()
        L_0x0174:
            r0.setSpan(r1, r7, r6, r2)
        L_0x0177:
            boolean r1 = r4.A08
            if (r1 == 0) goto L_0x0054
            r19 = r42
            if (r42 != 0) goto L_0x0190
            X.67i r2 = r4.A03
            java.lang.String r1 = "TextNodeUtils:Span:null-layout"
            java.lang.String r0 = "Trying to apply layoutAffectingStyle with null layout!"
            goto L_0x0068
        L_0x0187:
            X.4ce r1 = new X.4ce
            r1.<init>()
            goto L_0x0174
        L_0x018d:
            r1 = 1
            goto L_0x005b
        L_0x0190:
            X.67i r10 = r4.A03
            X.6lc r7 = r4.A05
            X.6lc r6 = r4.A04
            int r1 = r4.A01
            r36 = r1
            int r12 = r4.A00
            r1 = 16891(0x41fb, float:2.367E-41)
            if (r3 != r1) goto L_0x0366
            r2 = 0
            java.lang.String r1 = X.C140456lc.A0K(r6)
            if (r1 != 0) goto L_0x01a9
            java.lang.String r1 = "1.sp"
        L_0x01a9:
            java.lang.String r9 = X.C140456lc.A0J(r6)
            if (r9 != 0) goto L_0x01b1
            java.lang.String r9 = "100.sp"
        L_0x01b1:
            r4 = 1
            r5 = 2
            float r3 = X.AnonymousClass6Y7.A02(r1)     // Catch:{ 5R5 -> 0x01bf }
            android.content.Context r1 = r10.A00     // Catch:{ 5R5 -> 0x01bf }
            float r1 = X.C90464aC.A02(r1, r3, r5)     // Catch:{ 5R5 -> 0x01bf }
            int r4 = (int) r1     // Catch:{ 5R5 -> 0x01bf }
            goto L_0x01c7
        L_0x01bf:
            r5 = move-exception
            java.lang.String r3 = "ResizeToFitSpanStyle"
            java.lang.String r1 = "Error parsing text size value"
            X.AnonymousClass6RS.A00(r10, r3, r1, r5)
        L_0x01c7:
            r3 = 100
            r8 = 2
            float r5 = X.AnonymousClass6Y7.A02(r9)     // Catch:{ 5R5 -> 0x01d6 }
            android.content.Context r1 = r10.A00     // Catch:{ 5R5 -> 0x01d6 }
            float r1 = X.C90464aC.A02(r1, r5, r8)     // Catch:{ 5R5 -> 0x01d6 }
            int r3 = (int) r1     // Catch:{ 5R5 -> 0x01d6 }
            goto L_0x01de
        L_0x01d6:
            r8 = move-exception
            java.lang.String r5 = "ResizeToFitSpanStyle"
            java.lang.String r1 = "Error parsing text size value"
            X.AnonymousClass6RS.A00(r10, r5, r1, r8)
        L_0x01de:
            if (r4 <= r3) goto L_0x01e8
            java.lang.String r3 = "ResizeToFitSpanStyle"
            java.lang.String r1 = "Min text size cannot be larger than max text size."
            X.AnonymousClass6RS.A01(r3, r1)
            r3 = r4
        L_0x01e8:
            android.text.TextPaint r5 = r19.getPaint()
            android.text.TextPaint r18 = new android.text.TextPaint
            r1 = r18
            r1.<init>(r5)
            r1 = 40
            int r26 = r7.A0T(r1, r2)
            java.lang.Object r5 = X.C140456lc.A0I(r6, r1)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L_0x0203
            java.lang.String r5 = "uniform"
        L_0x0203:
            android.text.SpannableString r17 = X.C36441kJ.A0O(r0)
            java.lang.String r1 = "scaled"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0305
            android.graphics.RectF r16 = X.C36441kJ.A0N()
            int r5 = android.view.View.MeasureSpec.getMode(r45)
            int r1 = android.view.View.MeasureSpec.getMode(r46)
            r9 = 1
            boolean r38 = X.AnonymousClass000.A1Q(r5)
            boolean r39 = X.AnonymousClass000.A1Q(r1)
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r38 == 0) goto L_0x0278
            r1 = 2147483647(0x7fffffff, float:NaN)
        L_0x022c:
            if (r39 != 0) goto L_0x0232
            int r5 = android.view.View.MeasureSpec.getSize(r46)
        L_0x0232:
            float r7 = (float) r1
            float r6 = (float) r5
            r5 = 0
            r1 = r16
            r1.set(r5, r5, r7, r6)
            java.lang.Class<android.text.style.AbsoluteSizeSpan> r6 = android.text.style.AbsoluteSizeSpan.class
            r5 = r17
            r1 = r36
            java.lang.Object[] r8 = r5.getSpans(r1, r12, r6)
            android.text.style.AbsoluteSizeSpan[] r8 = (android.text.style.AbsoluteSizeSpan[]) r8
            X.AnonymousClass00C.A0B(r8)
            int r15 = r8.length
            r14 = 2147483647(0x7fffffff, float:NaN)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2147483647(0x7fffffff, float:NaN)
        L_0x0255:
            r40 = 1
            if (r7 >= r15) goto L_0x027d
            r11 = r8[r7]
            int r1 = r11.getSize()
            boolean r11 = r11.getDip()
            if (r11 == 0) goto L_0x026d
            float r11 = (float) r1
            android.content.Context r1 = r10.A00
            float r1 = X.C90464aC.A02(r1, r11, r9)
            int r1 = (int) r1
        L_0x026d:
            int r6 = java.lang.Math.max(r6, r1)
            int r5 = java.lang.Math.min(r5, r1)
            int r7 = r7 + 1
            goto L_0x0255
        L_0x0278:
            int r1 = android.view.View.MeasureSpec.getSize(r45)
            goto L_0x022c
        L_0x027d:
            if (r6 != r13) goto L_0x02eb
            if (r5 != r14) goto L_0x02eb
        L_0x0281:
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            java.lang.Float r5 = java.lang.Float.valueOf(r1)
            float r1 = (float) r6
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            X.0fI r6 = new X.0fI
            r6.<init>(r5, r5, r1)
        L_0x0292:
            if (r26 <= 0) goto L_0x0295
            r9 = 0
        L_0x0295:
            if (r38 == 0) goto L_0x02b5
            if (r39 == 0) goto L_0x02b5
            if (r9 == 0) goto L_0x02b5
            java.lang.Object r5 = r6.second
        L_0x029d:
            float r5 = X.C36441kJ.A03(r5)
        L_0x02a1:
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0305
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0054
            android.text.style.RelativeSizeSpan r3 = new android.text.style.RelativeSizeSpan
            r3.<init>(r5)
            goto L_0x033f
        L_0x02b5:
            java.lang.Object r1 = r6.first
            float r5 = X.C36441kJ.A03(r1)
            java.lang.Object r1 = r6.second
            float r1 = X.C36441kJ.A03(r1)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            java.lang.Object r5 = r6.first
            if (r1 >= 0) goto L_0x029d
            float r31 = X.C36441kJ.A03(r5)
            java.lang.Object r1 = r6.second
            float r32 = X.C36441kJ.A03(r1)
            java.lang.Object r1 = r6.third
            float r33 = X.C36441kJ.A03(r1)
            r34 = 1036831949(0x3dcccccd, float:0.1)
            r29 = r17
            r30 = r18
            r37 = r12
            r27 = r16
            r28 = r19
            r35 = r26
            float r5 = X.AnonymousClass6UL.A00(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            goto L_0x02a1
        L_0x02eb:
            if (r6 == r5) goto L_0x0281
            float r7 = (float) r4
            float r1 = (float) r5
            float r7 = r7 / r1
            float r5 = (float) r3
            float r1 = (float) r6
            float r5 = r5 / r1
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            X.0fI r6 = new X.0fI
            r6.<init>(r7, r5, r1)
            goto L_0x0292
        L_0x0305:
            if (r3 == r4) goto L_0x033a
            android.graphics.RectF r6 = X.C36441kJ.A0N()
            int r5 = android.view.View.MeasureSpec.getMode(r45)
            int r1 = android.view.View.MeasureSpec.getMode(r46)
            r8 = 1
            boolean r29 = X.AnonymousClass000.A1Q(r5)
            boolean r30 = X.AnonymousClass000.A1Q(r1)
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r29 == 0) goto L_0x0361
            r1 = 2147483647(0x7fffffff, float:NaN)
        L_0x0324:
            if (r30 != 0) goto L_0x032a
            int r5 = android.view.View.MeasureSpec.getSize(r46)
        L_0x032a:
            float r7 = (float) r1
            float r5 = (float) r5
            r1 = 0
            r6.set(r1, r1, r7, r5)
            if (r26 <= 0) goto L_0x0333
            r8 = 0
        L_0x0333:
            if (r29 == 0) goto L_0x0345
            if (r30 == 0) goto L_0x0345
            if (r8 == 0) goto L_0x0345
            r4 = r3
        L_0x033a:
            android.text.style.AbsoluteSizeSpan r3 = new android.text.style.AbsoluteSizeSpan
            r3.<init>(r4)
        L_0x033f:
            r1 = r36
            r0.setSpan(r3, r1, r12, r2)
            return
        L_0x0345:
            float r4 = (float) r4
            float r1 = (float) r3
            r25 = 1065353216(0x3f800000, float:1.0)
            r24 = r1
            r31 = 0
            r20 = r17
            r21 = r18
            r22 = r4
            r23 = r1
            r27 = r36
            r28 = r12
            r18 = r6
            float r1 = X.AnonymousClass6UL.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            int r4 = (int) r1
            goto L_0x033a
        L_0x0361:
            int r1 = android.view.View.MeasureSpec.getSize(r45)
            goto L_0x0324
        L_0x0366:
            java.lang.IllegalArgumentException r0 = X.C90464aC.A0O(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1266364u.A00(android.text.Layout, android.text.Spannable, X.5uF, int, int):void");
    }
}
