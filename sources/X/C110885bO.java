package X;

import android.animation.ValueAnimator;

/* renamed from: X.5bO  reason: invalid class name and case insensitive filesystem */
public class C110885bO implements ValueAnimator.AnimatorUpdateListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C110885bO(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008b, code lost:
        if (r0 == 0) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAnimationUpdate(android.animation.ValueAnimator r11) {
        /*
            r10 = this;
            int r0 = r10.A02
            switch(r0) {
                case 3: goto L_0x00a2;
                case 4: goto L_0x001d;
                default: goto L_0x0005;
            }
        L_0x0005:
            r1 = 0
            X.AnonymousClass00C.A0D(r11, r1)
            X.68b r0 = X.C1273868b.A00()
            X.6MO r2 = X.C1273868b.A05(r0, r11, r1)
            java.lang.Object r1 = r10.A01
            X.7ku r1 = (X.C160377ku) r1
            java.lang.Object r0 = r10.A00
            X.4vP r0 = (X.C100674vP) r0
            X.AnonymousClass6JI.A00(r0, r2, r1)
        L_0x001c:
            return
        L_0x001d:
            java.lang.Object r0 = r10.A00
            android.transition.TransitionValues r0 = (android.transition.TransitionValues) r0
            java.lang.Object r1 = r10.A01
            X.4d0 r1 = (X.C92024d0) r1
            boolean r3 = X.C90484aE.A1U(r11)
            android.view.View r4 = r0.view
            boolean r0 = r4 instanceof com.whatsapp.mediaview.PhotoView
            if (r0 != 0) goto L_0x0033
            boolean r0 = r4 instanceof com.whatsapp.components.button.ThumbnailButton
            if (r0 == 0) goto L_0x001c
        L_0x0033:
            X.AnonymousClass00C.A07(r4)
            java.lang.Object r2 = r11.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            X.AnonymousClass00C.A0E(r2, r0)
            float r7 = X.C36441kJ.A03(r2)
            boolean r0 = r1.A03
            r2 = 1
            if (r0 == 0) goto L_0x004b
            float r0 = (float) r3
            float r7 = r0 - r7
        L_0x004b:
            int[] r0 = r1.A04
            r4.getLocationOnScreen(r0)
            r8 = r0[r3]
            int r9 = X.C36431kI.A04(r4, r8)
            android.graphics.Rect r5 = r1.A02
            r6 = 0
            r5.left = r6
            int r0 = r4.getWidth()
            r5.right = r0
            int r0 = r1.A00
            if (r3 > r0) goto L_0x00a0
            if (r0 >= r9) goto L_0x00a0
        L_0x0067:
            r3 = 0
            if (r2 == 0) goto L_0x009b
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x009b
            int r2 = r4.getHeight()
            int r0 = r1.A00
            int r9 = r9 - r0
            float r0 = (float) r9
            float r0 = r0 * r7
            int r0 = (int) r0
            int r2 = r2 - r0
        L_0x0079:
            r5.bottom = r2
            int r1 = r1.A01
            if (r8 >= r1) goto L_0x0098
            if (r1 <= 0) goto L_0x0098
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0098
            int r1 = r1 - r8
            float r0 = (float) r1
            float r7 = r7 * r0
            int r0 = (int) r7
            r5.top = r0
            if (r0 != 0) goto L_0x00bd
        L_0x008d:
            int r0 = r4.getHeight()
            if (r2 != r0) goto L_0x00bd
            r0 = 0
            X.AnonymousClass0VN.A01(r4, r0)
            return
        L_0x0098:
            r5.top = r6
            goto L_0x008d
        L_0x009b:
            int r2 = r4.getHeight()
            goto L_0x0079
        L_0x00a0:
            r2 = 0
            goto L_0x0067
        L_0x00a2:
            java.lang.Object r5 = r10.A00
            X.6WU r5 = (X.AnonymousClass6WU) r5
            java.lang.Object r4 = r10.A01
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            int r3 = r4.leftMargin
            int r2 = r4.topMargin
            int r1 = r4.rightMargin
            int r0 = X.C36361kB.A01(r11)
            r4.setMargins(r3, r2, r1, r0)
            android.view.View r0 = r5.A0C
            r0.setLayoutParams(r4)
            return
        L_0x00bd:
            X.AnonymousClass0VN.A01(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110885bO.onAnimationUpdate(android.animation.ValueAnimator):void");
    }
}
