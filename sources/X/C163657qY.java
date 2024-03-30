package X;

import android.view.View;

/* renamed from: X.7qY  reason: invalid class name and case insensitive filesystem */
public class C163657qY implements View.OnLayoutChangeListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C163657qY(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        r0 = (X.C93024fQ) r15.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayoutChange(android.view.View r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24) {
        /*
            r15 = this;
            int r0 = r15.A02
            r1 = r16
            switch(r0) {
                case 0: goto L_0x0016;
                case 1: goto L_0x003b;
                case 2: goto L_0x00ba;
                case 3: goto L_0x0163;
                default: goto L_0x0007;
            }
        L_0x0007:
            r1.removeOnLayoutChangeListener(r15)
            java.lang.Object r1 = r15.A00
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r15.A01
            X.7q1 r0 = (X.C163327q1) r0
            r1.addOnLayoutChangeListener(r0)
        L_0x0015:
            return
        L_0x0016:
            java.lang.Object r3 = r15.A01
            android.view.View r3 = (android.view.View) r3
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x0015
            java.lang.Object r0 = r15.A00
            X.4fQ r0 = (X.C93024fQ) r0
            X.08H r2 = r0.A06
            if (r2 == 0) goto L_0x0015
            android.view.View r0 = r0.A01
            if (r3 != r0) goto L_0x0015
            r1 = 0
            android.graphics.Rect r0 = X.AnonymousClass001.A06()
            r3.getDrawingRect(r0)
            r2.setBounds(r0)
            r2.A07(r3, r1)
            return
        L_0x003b:
            java.lang.Object r4 = r15.A00
            com.whatsapp.calling.callgrid.view.FocusViewContainer r4 = (com.whatsapp.calling.callgrid.view.FocusViewContainer) r4
            android.graphics.Rect r5 = r4.A00
            r1.getGlobalVisibleRect(r5)
            java.lang.Object r1 = r15.A01
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            int r3 = r1.top
            int r0 = r5.top
            int r3 = r3 - r0
            int r6 = r1.left
            int r0 = r5.left
            int r6 = r6 - r0
            int r0 = r1.width()
            float r2 = (float) r0
            int r0 = r5.width()
            float r0 = (float) r0
            float r2 = r2 / r0
            int r0 = r1.height()
            float r1 = (float) r0
            int r0 = r5.height()
            float r0 = (float) r0
            float r1 = r1 / r0
            com.whatsapp.WaTextView r0 = r4.A03
            r5 = 0
            r0.setAlpha(r5)
            android.widget.LinearLayout r0 = r4.A02
            r0.setAlpha(r5)
            android.widget.FrameLayout r4 = r4.A01
            r4.setPivotX(r5)
            r4.setPivotY(r5)
            r4.setScaleX(r2)
            r4.setScaleY(r1)
            float r0 = (float) r6
            r4.setTranslationX(r0)
            float r0 = (float) r3
            r4.setTranslationY(r0)
            r0 = 1069547520(0x3fc00000, float:1.5)
            android.view.animation.DecelerateInterpolator r3 = new android.view.animation.DecelerateInterpolator
            r3.<init>(r0)
            android.view.ViewPropertyAnimator r2 = r4.animate()
            r0 = 250(0xfa, double:1.235E-321)
            android.view.ViewPropertyAnimator r1 = r2.setDuration(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = X.C90514aH.A0R(r1, r0)
            android.view.ViewPropertyAnimator r0 = r0.translationX(r5)
            android.view.ViewPropertyAnimator r2 = r0.translationY(r5)
            r1 = 13
            X.7oQ r0 = new X.7oQ
            r0.<init>(r15, r1)
            android.view.ViewPropertyAnimator r0 = r2.setListener(r0)
            r0.setInterpolator(r3)
            r4.removeOnLayoutChangeListener(r15)
            return
        L_0x00ba:
            r1.removeOnLayoutChangeListener(r15)
            java.lang.Object r8 = r15.A01
            com.whatsapp.components.AutoScrollView r8 = (com.whatsapp.components.AutoScrollView) r8
            android.view.View r0 = r8.getRootView()
            int r0 = X.AnonymousClass04F.A01(r0)
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            r8.A03 = r0
            android.widget.HorizontalScrollView r3 = r8.A00
            r0 = r0 ^ 1
            X.AnonymousClass04F.A05(r3, r0)
            com.whatsapp.WaTextView r5 = r8.A09
            int r10 = r5.getWidth()
            int r0 = r8.A06
            int r10 = r10 + r0
            boolean r0 = r8.A03
            r11 = 1
            if (r0 == 0) goto L_0x00e5
            r11 = -1
        L_0x00e5:
            int r12 = -r11
            int r2 = r8.A04
            int r7 = r2 + r10
            int r6 = r8.A07
            int r7 = r7 + r6
            int r1 = r8.A05
            java.lang.String r4 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
            if (r7 >= r1) goto L_0x012a
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            java.util.Objects.requireNonNull(r0, r4)
            r0.width = r7
            r5.setLayoutParams(r0)
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            java.util.Objects.requireNonNull(r1, r4)
            r0 = -2
            r1.width = r0
            r3.setLayoutParams(r1)
            int r6 = r6 * r12
            float r0 = (float) r6
            r5.setTranslationX(r0)
            com.whatsapp.WaTextView r1 = r8.A0A
            r0 = 8
            r1.setVisibility(r0)
        L_0x0118:
            r1 = 25
            X.3v2 r0 = new X.3v2
            r0.<init>(r8, r1)
            r3.post(r0)
            java.lang.Object r0 = r15.A00
            X.00S r0 = (X.AnonymousClass00S) r0
            r0.invoke()
            return
        L_0x012a:
            r0 = 1
            r8.A02 = r0
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            java.util.Objects.requireNonNull(r0, r4)
            r0.width = r1
            r3.setLayoutParams(r0)
            int r0 = r2 + r6
            int r0 = r0 * r12
            float r9 = (float) r0
            long r13 = r8.A08
            int r0 = r10 / r1
            long r0 = (long) r0
            long r13 = r13 * r0
            r5.setTranslationX(r9)
            com.whatsapp.WaTextView r4 = r8.A0A
            float r1 = r5.getTranslationX()
            int r0 = r10 * r12
            float r0 = (float) r0
            float r1 = r1 + r0
            r4.setTranslationX(r1)
            com.whatsapp.components.AutoScrollView.A00(r8, r9, r10, r11, r12, r13)
            if (r2 <= 0) goto L_0x0118
            r0 = 1
            r3.setHorizontalFadingEdgeEnabled(r0)
            r3.setFadingEdgeLength(r2)
            r3.requestLayout()
            goto L_0x0118
        L_0x0163:
            java.lang.Object r0 = r15.A00
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r2 = r15.A01
            android.view.ViewTreeObserver$OnGlobalLayoutListener r2 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r2
            int r1 = r0.getVisibility()
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r1 != 0) goto L_0x0179
            r0.addOnGlobalLayoutListener(r2)
            return
        L_0x0179:
            r0.removeGlobalOnLayoutListener(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163657qY.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
    }
}
