package X;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;

/* renamed from: X.74I  reason: invalid class name */
public final /* synthetic */ class AnonymousClass74I implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ Resources A04;
    public final /* synthetic */ ImageView A05;
    public final /* synthetic */ AnonymousClass6AV A06;
    public final /* synthetic */ C123425wT A07;
    public final /* synthetic */ AnonymousClass6TW A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;

    public /* synthetic */ AnonymousClass74I(Context context, Resources resources, ImageView imageView, AnonymousClass6AV r4, C123425wT r5, AnonymousClass6TW r6, String str, String str2, int i, int i2, int i3) {
        this.A07 = r5;
        this.A00 = i;
        this.A09 = str;
        this.A0A = str2;
        this.A01 = i2;
        this.A02 = i3;
        this.A04 = resources;
        this.A05 = imageView;
        this.A03 = context;
        this.A06 = r4;
        this.A08 = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d7, code lost:
        if (r2 != 2) goto L_0x00d9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r0 = r19
            X.5wT r14 = r0.A07
            int r9 = r0.A00
            java.lang.String r3 = r0.A09
            java.lang.String r7 = r0.A0A
            int r8 = r0.A01
            int r5 = r0.A02
            android.content.res.Resources r4 = r0.A04
            android.widget.ImageView r12 = r0.A05
            android.content.Context r13 = r0.A03
            X.6AV r2 = r0.A06
            X.6TW r10 = r0.A08
            X.1Dp r1 = r14.A01
            java.io.File r0 = r1.A00(r3, r9)
            if (r0 == 0) goto L_0x00bd
            boolean r0 = r0.exists()
        L_0x0024:
            java.lang.String r6 = "lottie"
            if (r0 == 0) goto L_0x0088
            boolean r0 = X.AnonymousClass00C.A0J(r7, r6)
            if (r0 == 0) goto L_0x0059
            java.io.File r0 = r1.A00(r3, r9)
            java.io.FileInputStream r5 = X.C90524aI.A0U(r0)
            r0 = 1024(0x400, float:1.435E-42)
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            r1.<init>(r5, r0)
            r0 = 0
            X.6Nn r0 = X.C203529oE.A04(r1, r0)
            java.lang.Object r5 = r0.A00
            if (r5 == 0) goto L_0x0088
            X.02l r2 = r14.A04
            X.02m r0 = X.AnonymousClass19R.A00
            X.03P r1 = X.C36401kF.A0y()
            r0 = 38
            X.72v r9 = new X.72v
            r9.<init>(r12, r5, r0)
        L_0x0055:
            r2.A03(r9, r1)
        L_0x0058:
            return
        L_0x0059:
            X.AnonymousClass00C.A0B(r4)
            r0 = 4
            X.AnonymousClass00C.A0D(r4, r0)
            java.io.File r1 = r1.A00(r3, r9)
            if (r1 == 0) goto L_0x0088
            X.6Kx r0 = new X.6Kx
            r0.<init>(r8, r5)
            X.5sn r0 = X.AnonymousClass6Y8.A09(r0, r1)
            android.graphics.Bitmap r0 = r0.A02
            if (r0 == 0) goto L_0x0088
            android.graphics.drawable.BitmapDrawable r11 = new android.graphics.drawable.BitmapDrawable
            r11.<init>(r4, r0)
            X.02l r2 = r14.A04
            X.02m r0 = X.AnonymousClass19R.A00
            X.03P r1 = X.C36401kF.A0y()
            r14 = 10
            X.73N r9 = new X.73N
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x0055
        L_0x0088:
            boolean r0 = X.AnonymousClass00C.A0J(r7, r6)
            if (r0 == 0) goto L_0x00c0
            boolean r0 = r12 instanceof com.airbnb.lottie.LottieAnimationView
            if (r0 == 0) goto L_0x0058
            X.5Rx r0 = r2.A01
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 != r0) goto L_0x0058
            boolean r1 = X.AnonymousClass1RC.A0A(r13)
            r0 = 2132017157(0x7f140005, float:1.9672584E38)
            if (r1 == 0) goto L_0x00a7
            r0 = 2132017156(0x7f140004, float:1.9672582E38)
        L_0x00a7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x0058
            int r3 = r0.intValue()
            X.17Y r2 = r14.A00
            r1 = 1
            X.3wm r0 = new X.3wm
            r0.<init>((java.lang.Object) r12, (int) r3, (int) r1)
            r2.A0H(r0)
            return
        L_0x00bd:
            r0 = 0
            goto L_0x0024
        L_0x00c0:
            X.AnonymousClass00C.A0B(r4)
            X.5Rx r0 = r2.A01
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x00f5
            r0 = 1
            int r2 = r2.A00
            if (r2 == 0) goto L_0x00d9
            if (r2 == r0) goto L_0x00f1
            r0 = 2
            r1 = 2131232211(0x7f0805d3, float:1.8080525E38)
            if (r2 == r0) goto L_0x00dc
        L_0x00d9:
            r1 = 2131232207(0x7f0805cf, float:1.8080517E38)
        L_0x00dc:
            r0 = 0
            android.graphics.drawable.Drawable r16 = X.AnonymousClass0BT.A00(r0, r4, r1)
        L_0x00e1:
            X.17Y r0 = r14.A00
            r18 = 21
            X.74y r13 = new X.74y
            r15 = r12
            r17 = r3
            r13.<init>(r14, r15, r16, r17, r18)
            r0.A0H(r13)
            return
        L_0x00f1:
            r1 = 2131232209(0x7f0805d1, float:1.808052E38)
            goto L_0x00dc
        L_0x00f5:
            r1 = 0
            r0 = 2131232213(0x7f0805d5, float:1.8080529E38)
            android.graphics.drawable.Drawable r16 = X.AnonymousClass0BT.A00(r1, r4, r0)
            goto L_0x00e1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74I.run():void");
    }
}
