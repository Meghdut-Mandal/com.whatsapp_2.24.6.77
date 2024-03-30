package X;

/* renamed from: X.4iY  reason: invalid class name and case insensitive filesystem */
public final class C94644iY extends AnonymousClass6EG {
    public float A00;
    public float A01;
    public String A02 = "";
    public AnonymousClass00S A03 = AnonymousClass7PL.A00;
    public boolean A04 = true;
    public long A05;
    public C114365h6 A06;
    public final C161547n5 A07;
    public final C161547n5 A08;
    public final C123565wi A09 = new C123565wi();
    public final C94654iZ A0A;
    public final C006302t A0B;

    public C94644iY(C94654iZ r6) {
        this.A0A = r6;
        r6.A0B = new AnonymousClass7RN(this);
        C137076fY r4 = C137076fY.A00;
        this.A07 = C93994hT.A00(r4, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A08 = C93994hT.A00(r4, new AnonymousClass6X0(AnonymousClass6X0.A02), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A05 = AnonymousClass6X0.A01;
        this.A00 = 1.0f;
        this.A01 = 1.0f;
        this.A0B = new AnonymousClass7RO(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005f, code lost:
        if (r8 != r1) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a2, code lost:
        if (r6 != android.graphics.Bitmap.Config.HARDWARE) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012a, code lost:
        if (r4.A00 != r8) goto L_0x0198;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.C114365h6 r30, X.C161927nh r31, float r32) {
        /*
            r29 = this;
            r0 = r30
            r5 = r29
            X.4iZ r3 = r5.A0A
            boolean r1 = r3.A0E
            if (r1 == 0) goto L_0x01e8
            long r8 = r3.A07
            long r6 = X.C133336Xx.A05
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x01e8
            X.7n5 r1 = r5.A07
            java.lang.Object r2 = r1.getValue()
            X.5h6 r2 = (X.C114365h6) r2
            java.util.List r1 = X.C196389Zl.A00
            boolean r1 = r2 instanceof X.C94494iJ
            if (r1 == 0) goto L_0x01e4
            X.4iJ r2 = (X.C94494iJ) r2
            int r2 = r2.A00
            r1 = 5
            if (r2 == r1) goto L_0x002a
            r1 = 3
            if (r2 != r1) goto L_0x01e8
        L_0x002a:
            boolean r1 = r0 instanceof X.C94494iJ
            if (r1 == 0) goto L_0x01e0
            r1 = r0
            X.4iJ r1 = (X.C94494iJ) r1
            int r2 = r1.A00
            r1 = 5
            if (r2 == r1) goto L_0x0039
            r1 = 3
            if (r2 != r1) goto L_0x01e8
        L_0x0039:
            r8 = 1
        L_0x003a:
            boolean r1 = r5.A04
            r28 = r31
            if (r1 != 0) goto L_0x00a4
            long r6 = r5.A05
            long r9 = r28.BHc()
            long r1 = X.AnonymousClass6X0.A02
            int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x00a4
            X.5wi r4 = r5.A09
            X.B3v r1 = r4.A03
            if (r1 == 0) goto L_0x01dd
            X.6g5 r1 = (X.C137406g5) r1
            android.graphics.Bitmap r1 = r1.A00
            android.graphics.Bitmap$Config r6 = r1.getConfig()
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8
            if (r6 != r1) goto L_0x008e
            r1 = 1
        L_0x005f:
            if (r8 != r1) goto L_0x00a4
        L_0x0061:
            if (r30 != 0) goto L_0x0071
            X.7n5 r1 = r5.A07
            java.lang.Object r0 = r1.getValue()
            if (r0 == 0) goto L_0x008b
            java.lang.Object r0 = r1.getValue()
            X.5h6 r0 = (X.C114365h6) r0
        L_0x0071:
            X.B3v r3 = r4.A03
            if (r3 == 0) goto L_0x01eb
            long r1 = r4.A01
            long r11 = X.AnonymousClass6TU.A01
            X.4iU r7 = X.C94604iU.A00
            r9 = 3
            r10 = 1
            r17 = r1
            r8 = r32
            r4 = r28
            r5 = r0
            r6 = r3
            r13 = r1
            r15 = r11
            r4.B65(r5, r6, r7, r8, r9, r10, r11, r13, r15, r17)
            return
        L_0x008b:
            X.5h6 r0 = r5.A06
            goto L_0x0071
        L_0x008e:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565
            if (r6 == r1) goto L_0x00a4
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444
            if (r6 == r1) goto L_0x01dd
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r2 < r1) goto L_0x01dd
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16
            if (r6 == r1) goto L_0x00a4
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.HARDWARE
            if (r6 != r1) goto L_0x01dd
        L_0x00a4:
            r1 = 1
            if (r8 != r1) goto L_0x01da
            long r2 = r3.A07
            r4 = 5
            X.4iJ r1 = new X.4iJ
            r1.<init>(r2, r4)
        L_0x00af:
            r5.A06 = r1
            long r1 = r28.BHc()
            float r3 = X.AnonymousClass6X0.A01(r1)
            X.7n5 r4 = r5.A08
            java.lang.Object r1 = r4.getValue()
            X.6X0 r1 = (X.AnonymousClass6X0) r1
            long r1 = r1.A00
            float r1 = X.AnonymousClass6X0.A01(r1)
            float r3 = r3 / r1
            r5.A00 = r3
            long r1 = r28.BHc()
            float r3 = X.AnonymousClass6X0.A00(r1)
            java.lang.Object r1 = r4.getValue()
            X.6X0 r1 = (X.AnonymousClass6X0) r1
            long r1 = r1.A00
            float r1 = X.AnonymousClass6X0.A00(r1)
            float r3 = r3 / r1
            r5.A01 = r3
            X.5wi r4 = r5.A09
            long r6 = r28.BHc()
            float r1 = X.AnonymousClass6X0.A01(r6)
            int r2 = X.C90514aH.A04(r1)
            float r1 = X.AnonymousClass6X0.A00(r6)
            int r1 = X.C90514aH.A04(r1)
            long r6 = X.C90484aE.A0J(r2, r1)
            X.5RW r13 = r28.getLayoutDirection()
            X.02t r1 = r5.A0B
            r27 = r1
            r1 = r28
            r4.A04 = r1
            X.B3v r3 = r4.A03
            X.7m3 r2 = r4.A02
            if (r3 == 0) goto L_0x0198
            if (r2 == 0) goto L_0x0198
            int r9 = X.C90494aF.A08(r6)
            r1 = r3
            X.6g5 r1 = (X.C137406g5) r1
            android.graphics.Bitmap r10 = r1.A00
            int r1 = r10.getWidth()
            if (r9 > r1) goto L_0x0198
            int r9 = X.C90474aD.A03(r6)
            int r1 = r10.getHeight()
            if (r9 > r1) goto L_0x0198
            int r1 = r4.A00
            if (r1 != r8) goto L_0x0198
        L_0x012c:
            r4.A01 = r6
            X.6gE r8 = r4.A05
            long r6 = X.AnonymousClass6GI.A02(r6)
            X.6Bs r1 = r8.A02
            X.7ni r14 = r1.A02
            X.5RW r12 = r1.A03
            X.7m3 r11 = r1.A01
            long r9 = r1.A00
            r15 = r28
            r1.A02 = r15
            r1.A03 = r13
            r1.A01 = r2
            r1.A00 = r6
            r2.BpF()
            long r21 = X.C133336Xx.A01
            r17 = 0
            long r23 = X.C133206Xf.A03
            long r15 = r8.BHc()
            float r7 = X.AnonymousClass6X0.A01(r15)
            float r6 = X.C133206Xf.A00(r23)
            float r7 = r7 - r6
            float r6 = X.AnonymousClass6X0.A00(r15)
            float r13 = X.C133206Xf.A01(r23)
            float r6 = r6 - r13
            long r25 = X.C90464aC.A0B(r7, r6)
            r19 = 1065353216(0x3f800000, float:1.0)
            X.4iU r18 = X.C94604iU.A00
            r6 = 0
            r20 = 0
            r16 = r8
            r16.B6E(r17, r18, r19, r20, r21, r23, r25)
            r7 = r27
            r7.invoke(r8)
            r2.Boi()
            r1.A02 = r14
            r1.A03 = r12
            r1.A01 = r11
            r1.A00 = r9
            X.6g5 r3 = (X.C137406g5) r3
            android.graphics.Bitmap r1 = r3.A00
            r1.prepareToDraw()
            r5.A04 = r6
            long r1 = r28.BHc()
            r5.A05 = r1
            goto L_0x0061
        L_0x0198:
            int r12 = X.C90494aF.A08(r6)
            int r11 = X.C90474aD.A03(r6)
            X.4iQ r10 = X.C114185go.A0G
            r9 = 1
            r1 = 0
            if (r8 != r1) goto L_0x01d7
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x01a8:
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r2 < r1) goto L_0x01ce
            android.graphics.Bitmap r1 = X.AnonymousClass5WZ.A00(r10, r12, r11, r8)
        L_0x01b2:
            X.6g5 r3 = new X.6g5
            r3.<init>(r1)
            android.graphics.Canvas r1 = X.C112335dj.A00
            X.6g3 r2 = new X.6g3
            r2.<init>()
            android.graphics.Bitmap r1 = r3.A00
            android.graphics.Canvas r1 = X.C90524aI.A0A(r1)
            r2.A00 = r1
            r4.A03 = r3
            r4.A02 = r2
            r4.A00 = r8
            goto L_0x012c
        L_0x01ce:
            r1 = 0
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r12, r11, r3)
            r1.setHasAlpha(r9)
            goto L_0x01b2
        L_0x01d7:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ALPHA_8
            goto L_0x01a8
        L_0x01da:
            r1 = 0
            goto L_0x00af
        L_0x01dd:
            r1 = 0
            goto L_0x005f
        L_0x01e0:
            if (r30 != 0) goto L_0x01e8
            goto L_0x0039
        L_0x01e4:
            if (r2 != 0) goto L_0x01e8
            goto L_0x002a
        L_0x01e8:
            r8 = 0
            goto L_0x003a
        L_0x01eb:
            java.lang.String r0 = "drawCachedImage must be invoked first before attempting to draw the result into another destination"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94644iY.A05(X.5h6, X.7nh, float):void");
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Params: ");
        A0u.append("\tname: ");
        A0u.append(this.A02);
        A0u.append("\n");
        A0u.append("\tviewportWidth: ");
        C161547n5 r2 = this.A08;
        A0u.append(AnonymousClass6X0.A01(((AnonymousClass6X0) r2.getValue()).A00));
        A0u.append("\n");
        A0u.append("\tviewportHeight: ");
        A0u.append(AnonymousClass6X0.A00(((AnonymousClass6X0) r2.getValue()).A00));
        String A0q = AnonymousClass000.A0q("\n", A0u);
        AnonymousClass00C.A08(A0q);
        return A0q;
    }
}
