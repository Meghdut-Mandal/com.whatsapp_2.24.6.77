package X;

/* renamed from: X.0Co  reason: invalid class name and case insensitive filesystem */
public class C02960Co extends C02950Cn {
    public AnonymousClass0WQ A00;
    public boolean A01;
    public boolean A02 = false;

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a7, code lost:
        if (r5 != 0) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00dd, code lost:
        if (r0 != null) goto L_0x00df;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x00c8 */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c8 A[SYNTHETIC, Splitter:B:63:0x00c8] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0WQ A03(android.content.Context r9) {
        /*
            r8 = this;
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x0007
            X.0WQ r4 = r8.A00
            return r4
        L_0x0007:
            X.0Bl r0 = r8.A01
            X.02E r7 = r0.A04
            java.lang.Integer r2 = r0.A00
            java.lang.Integer r0 = X.C023109s.A01
            r3 = 1
            r1 = 0
            if (r2 != r0) goto L_0x0014
            r1 = 1
        L_0x0014:
            boolean r4 = r8.A01
            X.09r r0 = r7.A0H
            if (r0 != 0) goto L_0x00fd
            r2 = 0
        L_0x001b:
            if (r4 == 0) goto L_0x00ec
            if (r1 == 0) goto L_0x00e6
            if (r0 == 0) goto L_0x00fa
            int r5 = r0.A04
        L_0x0023:
            r0 = 0
            r7.A0r(r0, r0, r0, r0)
            android.view.ViewGroup r0 = r7.A0G
            r4 = 0
            if (r0 == 0) goto L_0x003a
            r6 = 2131435195(0x7f0b1ebb, float:1.8492225E38)
            java.lang.Object r0 = r0.getTag(r6)
            if (r0 == 0) goto L_0x003a
            android.view.ViewGroup r0 = r7.A0G
            r0.setTag(r6, r4)
        L_0x003a:
            android.view.ViewGroup r0 = r7.A0G
            if (r0 == 0) goto L_0x0049
            android.animation.LayoutTransition r0 = r0.getLayoutTransition()
            if (r0 == 0) goto L_0x0049
        L_0x0044:
            r8.A00 = r4
            r8.A02 = r3
            return r4
        L_0x0049:
            android.view.animation.Animation r0 = r7.A0e(r2, r5, r1)
            if (r0 != 0) goto L_0x00df
            if (r5 != 0) goto L_0x0068
            if (r2 == 0) goto L_0x0044
            r0 = 4097(0x1001, float:5.741E-42)
            if (r2 == r0) goto L_0x00b3
            r0 = 8194(0x2002, float:1.1482E-41)
            if (r2 == r0) goto L_0x00aa
            r0 = 8197(0x2005, float:1.1486E-41)
            if (r2 == r0) goto L_0x0082
            r0 = 4099(0x1003, float:5.744E-42)
            if (r2 == r0) goto L_0x0079
            r0 = 4100(0x1004, float:5.745E-42)
            if (r2 == r0) goto L_0x008b
            r5 = -1
        L_0x0068:
            android.content.res.Resources r0 = r9.getResources()
            java.lang.String r1 = r0.getResourceTypeName(r5)
            java.lang.String r0 = "anim"
            boolean r2 = r0.equals(r1)
            if (r2 == 0) goto L_0x00c8
            goto L_0x00bc
        L_0x0079:
            r5 = 2130837510(0x7f020006, float:1.7279976E38)
            if (r1 == 0) goto L_0x0068
            r5 = 2130837509(0x7f020005, float:1.7279974E38)
            goto L_0x0068
        L_0x0082:
            r0 = 16842939(0x10100bb, float:2.3694082E-38)
            if (r1 == 0) goto L_0x0093
            r0 = 16842938(0x10100ba, float:2.369408E-38)
            goto L_0x0093
        L_0x008b:
            r0 = 16842937(0x10100b9, float:2.3694076E-38)
            if (r1 == 0) goto L_0x0093
            r0 = 16842936(0x10100b8, float:2.3694074E-38)
        L_0x0093:
            int[] r1 = new int[r3]
            r2 = 0
            r1[r2] = r0
            r0 = 16973825(0x1030001, float:2.4060903E-38)
            android.content.res.TypedArray r1 = r9.obtainStyledAttributes(r0, r1)
            r0 = -1
            int r5 = r1.getResourceId(r2, r0)
            r1.recycle()
            if (r5 == 0) goto L_0x0044
            goto L_0x0068
        L_0x00aa:
            r5 = 2130837508(0x7f020004, float:1.7279972E38)
            if (r1 == 0) goto L_0x0068
            r5 = 2130837507(0x7f020003, float:1.727997E38)
            goto L_0x0068
        L_0x00b3:
            r5 = 2130837512(0x7f020008, float:1.727998E38)
            if (r1 == 0) goto L_0x0068
            r5 = 2130837511(0x7f020007, float:1.7279978E38)
            goto L_0x0068
        L_0x00bc:
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r9, r5)     // Catch:{ NotFoundException -> 0x0101, RuntimeException -> 0x00c8 }
            if (r0 == 0) goto L_0x0044
            X.0WQ r1 = new X.0WQ     // Catch:{ NotFoundException -> 0x0101, RuntimeException -> 0x00c8 }
            r1.<init>((android.view.animation.Animation) r0)     // Catch:{ NotFoundException -> 0x0101, RuntimeException -> 0x00c8 }
            goto L_0x00d3
        L_0x00c8:
            android.animation.Animator r0 = android.animation.AnimatorInflater.loadAnimator(r9, r5)     // Catch:{ RuntimeException -> 0x00d6 }
            if (r0 == 0) goto L_0x0044
            X.0WQ r1 = new X.0WQ     // Catch:{ RuntimeException -> 0x00d6 }
            r1.<init>((android.animation.Animator) r0)     // Catch:{ RuntimeException -> 0x00d6 }
        L_0x00d3:
            r4 = r1
            goto L_0x0044
        L_0x00d6:
            r0 = move-exception
            if (r2 != 0) goto L_0x0103
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r9, r5)
            if (r0 == 0) goto L_0x0044
        L_0x00df:
            X.0WQ r4 = new X.0WQ
            r4.<init>((android.view.animation.Animation) r0)
            goto L_0x0044
        L_0x00e6:
            if (r0 == 0) goto L_0x00fa
            int r5 = r0.A05
            goto L_0x0023
        L_0x00ec:
            if (r1 == 0) goto L_0x00f4
            if (r0 == 0) goto L_0x00fa
            int r5 = r0.A01
            goto L_0x0023
        L_0x00f4:
            if (r0 == 0) goto L_0x00fa
            int r5 = r0.A02
            goto L_0x0023
        L_0x00fa:
            r5 = 0
            goto L_0x0023
        L_0x00fd:
            int r2 = r0.A03
            goto L_0x001b
        L_0x0101:
            r0 = move-exception
            throw r0
        L_0x0103:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02960Co.A03(android.content.Context):X.0WQ");
    }

    public C02960Co(C02680Bk r2, AnonymousClass0Bl r3, boolean z) {
        super(r2, r3);
        this.A01 = z;
    }
}
