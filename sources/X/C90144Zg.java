package X;

import android.view.ViewTreeObserver;

/* renamed from: X.4Zg  reason: invalid class name and case insensitive filesystem */
public class C90144Zg implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public boolean A01;
    public final int A02;

    public C90144Zg(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01a4, code lost:
        if (r0 <= 0) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        if (r0 <= 0) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGlobalLayout() {
        /*
            r8 = this;
            int r0 = r8.A02
            switch(r0) {
                case 0: goto L_0x014b;
                case 1: goto L_0x0122;
                case 2: goto L_0x00f8;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r8.A00
            X.3UT r3 = (X.AnonymousClass3UT) r3
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r3.A05
            if (r0 == 0) goto L_0x0016
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L_0x0016
            r0.removeOnGlobalLayoutListener(r8)
        L_0x0016:
            int r1 = X.AnonymousClass3UT.A01(r3)
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r3.A05
            if (r0 == 0) goto L_0x00f5
            int r5 = r0.getHeight()
        L_0x0022:
            r0 = 0
            if (r1 >= r0) goto L_0x0026
            r1 = 0
        L_0x0026:
            int r5 = r5 + r1
            if (r5 <= 0) goto L_0x00bf
            int r0 = r3.A00
            int r4 = r5 - r0
            android.content.Context r0 = r3.A01
            if (r0 == 0) goto L_0x0050
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L_0x0050
            android.content.res.Configuration r0 = r0.getConfiguration()
            if (r0 == 0) goto L_0x0050
            int r2 = r0.orientation
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = 1
            if (r1 == 0) goto L_0x0050
            if (r2 != r0) goto L_0x00ea
            X.0v0 r0 = r3.A0M
            int r0 = r0.A0A()
        L_0x004e:
            if (r0 > 0) goto L_0x0061
        L_0x0050:
            android.view.View r0 = r3.A03
            if (r0 == 0) goto L_0x00e7
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L_0x00e7
            r0 = 2131166531(0x7f070543, float:1.794731E38)
            int r0 = r1.getDimensionPixelOffset(r0)
        L_0x0061:
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r3.A06
            if (r1 == 0) goto L_0x0067
            r1.A0D = r4
        L_0x0067:
            if (r4 >= r0) goto L_0x00e1
            if (r1 == 0) goto L_0x0073
            int r0 = r5 / 2
            if (r4 <= r0) goto L_0x0070
            r4 = r0
        L_0x0070:
            r1.A0V(r4)
        L_0x0073:
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x00bf
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r3.A06
            if (r0 == 0) goto L_0x00a9
            int r0 = r0.A0D
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto L_0x00a9
            android.view.View r0 = r3.A02
            if (r0 == 0) goto L_0x0093
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L_0x0093
            int r0 = r2.intValue()
            r1.height = r0
        L_0x0093:
            android.view.View r0 = r3.A02
            if (r0 == 0) goto L_0x009a
            r0.requestLayout()
        L_0x009a:
            android.view.View r0 = r3.A02
            if (r0 == 0) goto L_0x00a9
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            if (r1 == 0) goto L_0x00a9
            r0 = 20
            X.C90104Zc.A00(r1, r3, r0)
        L_0x00a9:
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r3.A0E
            r4 = 8
            if (r0 == 0) goto L_0x00c0
            int r0 = r0.getVisibility()
            if (r0 != r4) goto L_0x00c0
        L_0x00b5:
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r3.A0E
            if (r0 == 0) goto L_0x00cc
            int r0 = r0.getVisibility()
            if (r0 != r4) goto L_0x00cc
        L_0x00bf:
            return
        L_0x00c0:
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r3.A06
            if (r2 == 0) goto L_0x00b5
            int r1 = r2.A0J
            r0 = 3
            if (r1 != r0) goto L_0x00b5
            int r0 = r2.A0D
            goto L_0x00d9
        L_0x00cc:
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r3.A06
            if (r2 == 0) goto L_0x00bf
            int r1 = r2.A0J
            r0 = 4
            if (r1 != r0) goto L_0x00bf
            int r0 = r2.A0S()
        L_0x00d9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.AnonymousClass3UT.A06(r3, r0)
            return
        L_0x00e1:
            if (r1 == 0) goto L_0x0073
            r1.A0V(r0)
            goto L_0x0073
        L_0x00e7:
            r0 = 0
            goto L_0x0061
        L_0x00ea:
            r0 = 2
            if (r2 != r0) goto L_0x0050
            X.0v0 r0 = r3.A0M
            int r0 = r0.A09()
            goto L_0x004e
        L_0x00f5:
            r5 = 0
            goto L_0x0022
        L_0x00f8:
            java.lang.Object r1 = r8.A00
            X.3UT r1 = (X.AnonymousClass3UT) r1
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r1.A0E
            if (r0 == 0) goto L_0x0109
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L_0x0109
            r0.removeOnGlobalLayoutListener(r8)
        L_0x0109:
            r0 = 0
            r1.A0G = r0
            boolean r0 = r1.A0K
            if (r0 != 0) goto L_0x0113
            X.AnonymousClass3UT.A04(r1)
        L_0x0113:
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x00bf
            com.whatsapp.KeyboardPopupLayout r1 = r1.A08
            if (r1 == 0) goto L_0x00bf
            r0 = 0
            r1.A04 = r0
            r1.requestLayout()
            return
        L_0x0122:
            java.lang.Object r1 = r8.A00
            X.3fk r1 = (X.C70803fk) r1
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r1.A3l
            if (r0 == 0) goto L_0x00bf
            X.C36351kA.A1C(r0, r8)
            r0 = 0
            r1.A6C = r0
            boolean r0 = r1.A6Y
            if (r0 != 0) goto L_0x0137
            X.C70803fk.A0z(r1)
        L_0x0137:
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x013e
            r1.A1m()
        L_0x013e:
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r2 = r1.A3l
            r1 = 41
            X.3wT r0 = new X.3wT
            r0.<init>((java.lang.Object) r8, (int) r1)
            r2.post(r0)
            return
        L_0x014b:
            java.lang.Object r4 = r8.A00
            X.3fk r4 = (X.C70803fk) r4
            android.view.ViewGroup r0 = r4.A0S
            X.C36351kA.A1C(r0, r8)
            int r1 = X.C70803fk.A03(r4)
            android.view.ViewGroup r0 = r4.A0S
            int r7 = r0.getHeight()
            r0 = 0
            int r0 = java.lang.Math.max(r1, r0)
            int r7 = r7 + r0
            if (r7 <= 0) goto L_0x00bf
            X.3AC r0 = r4.A2R
            android.widget.FrameLayout r0 = r0.A04
            int r6 = r0.getHeight()
            X.3AC r0 = r4.A2R
            android.view.View r0 = r0.A02
            X.3QI r0 = X.C65723Tf.A01(r0)
            int r5 = r0.A00
            X.0yC r1 = X.C70803fk.A0H(r4)
            r0 = 5627(0x15fb, float:7.885E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x022f
            r0 = 0
        L_0x0185:
            int r2 = r7 - r6
            int r2 = r2 - r5
            int r2 = r2 - r0
            int r1 = X.C70803fk.A01(r4)
            r0 = 1
            if (r1 == r0) goto L_0x0227
            r0 = 2
            if (r1 == r0) goto L_0x021f
            r3 = 0
        L_0x0194:
            int r1 = X.C70803fk.A01(r4)
            r0 = 1
            if (r1 == r0) goto L_0x0218
            r0 = 2
            if (r1 != r0) goto L_0x01a6
            X.0v0 r0 = r4.A35
            int r0 = r0.A09()
        L_0x01a4:
            if (r0 > 0) goto L_0x01b3
        L_0x01a6:
            android.view.View r0 = r4.A0B
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131166531(0x7f070543, float:1.794731E38)
            int r3 = r1.getDimensionPixelOffset(r0)
        L_0x01b3:
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r4.A0n
            if (r1 == 0) goto L_0x01c4
            r1.A0D = r2
            if (r2 >= r3) goto L_0x01c1
            int r0 = r7 / 2
            int r3 = java.lang.Math.min(r2, r0)
        L_0x01c1:
            r1.A0V(r3)
        L_0x01c4:
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x00bf
            android.view.View r2 = r4.A0D
            if (r2 == 0) goto L_0x00bf
            android.view.ViewGroup r0 = r4.A0S
            if (r0 == 0) goto L_0x00bf
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r4.A0n
            if (r1 == 0) goto L_0x00bf
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r4.A3l
            if (r0 == 0) goto L_0x00bf
            int r0 = r1.A0D
            X.C36411kG.A1A(r2, r0)
            android.view.View r0 = r4.A0D
            r0.requestLayout()
            android.view.View r0 = r4.A0D
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r0 = 18
            X.C90104Zc.A00(r1, r4, r0)
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r4.A3l
            int r0 = r0.getVisibility()
            r3 = 8
            if (r0 == r3) goto L_0x0204
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r4.A0n
            int r1 = r2.A0J
            r0 = 3
            if (r1 != r0) goto L_0x0204
            int r0 = r2.A0D
        L_0x0200:
            X.C70803fk.A16(r4, r0)
            return
        L_0x0204:
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r4.A3l
            int r0 = r0.getVisibility()
            if (r0 == r3) goto L_0x00bf
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r4.A0n
            int r1 = r2.A0J
            r0 = 4
            if (r1 != r0) goto L_0x00bf
            int r0 = r2.A0S()
            goto L_0x0200
        L_0x0218:
            X.0v0 r0 = r4.A35
            int r0 = r0.A0A()
            goto L_0x01a4
        L_0x021f:
            X.0v0 r0 = r4.A35
            int r3 = r0.A09()
            goto L_0x0194
        L_0x0227:
            X.0v0 r0 = r4.A35
            int r3 = r0.A0A()
            goto L_0x0194
        L_0x022f:
            int r3 = X.C70803fk.A01(r4)
            r2 = 2
            android.view.View r0 = r4.A0B
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131166537(0x7f070549, float:1.7947322E38)
            if (r3 != r2) goto L_0x0242
            r0 = 2131166538(0x7f07054a, float:1.7947324E38)
        L_0x0242:
            int r0 = r1.getDimensionPixelOffset(r0)
            goto L_0x0185
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90144Zg.onGlobalLayout():void");
    }
}
