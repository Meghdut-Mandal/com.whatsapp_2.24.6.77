package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: X.0NB  reason: invalid class name */
public abstract class AnonymousClass0NB extends AnonymousClass0GV {
    public VelocityTracker A00;
    public OverScroller A01;
    public Runnable A02;
    public int A03 = -1;
    public int A04;
    public int A05 = -1;
    public boolean A06;

    public abstract int A0S();

    public abstract int A0T(View view, CoordinatorLayout coordinatorLayout, int i, int i2, int i3);

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006c, code lost:
        if (r10.A0H(r9, r5, r2) == false) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0L(android.view.MotionEvent r8, android.view.View r9, androidx.coordinatorlayout.widget.CoordinatorLayout r10) {
        /*
            r7 = this;
            int r0 = r7.A05
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r10.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r7.A05 = r0
        L_0x0012:
            int r1 = r8.getActionMasked()
            r0 = 2
            r6 = 1
            r4 = -1
            r3 = 0
            if (r1 != r0) goto L_0x003c
            boolean r0 = r7.A06
            if (r0 == 0) goto L_0x003c
            int r0 = r7.A03
            if (r0 == r4) goto L_0x009c
            int r0 = r8.findPointerIndex(r0)
            if (r0 == r4) goto L_0x009c
            float r0 = r8.getY(r0)
            int r2 = (int) r0
            int r0 = r7.A04
            int r1 = X.AnonymousClass000.A05(r2, r0)
            int r0 = r7.A05
            if (r1 <= r0) goto L_0x003c
            r7.A04 = r2
            return r6
        L_0x003c:
            int r0 = r8.getActionMasked()
            if (r0 != 0) goto L_0x0095
            r7.A03 = r4
            float r0 = r8.getX()
            int r5 = (int) r0
            float r0 = r8.getY()
            int r2 = (int) r0
            r0 = r7
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r0 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r0
            java.lang.ref.WeakReference r0 = r0.A04
            if (r0 == 0) goto L_0x0067
            android.view.View r1 = X.AnonymousClass000.A0Y(r0)
            if (r1 == 0) goto L_0x006e
            boolean r0 = r1.isShown()
            if (r0 == 0) goto L_0x006e
            boolean r0 = r1.canScrollVertically(r4)
            if (r0 != 0) goto L_0x006e
        L_0x0067:
            boolean r1 = r10.A0H(r9, r5, r2)
            r0 = 1
            if (r1 != 0) goto L_0x006f
        L_0x006e:
            r0 = 0
        L_0x006f:
            r7.A06 = r0
            if (r0 == 0) goto L_0x0095
            r7.A04 = r2
            int r0 = r8.getPointerId(r3)
            r7.A03 = r0
            android.view.VelocityTracker r0 = r7.A00
            if (r0 != 0) goto L_0x0085
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r7.A00 = r0
        L_0x0085:
            android.widget.OverScroller r0 = r7.A01
            if (r0 == 0) goto L_0x0095
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0095
            android.widget.OverScroller r0 = r7.A01
            r0.abortAnimation()
            return r6
        L_0x0095:
            android.view.VelocityTracker r0 = r7.A00
            if (r0 == 0) goto L_0x009c
            r0.addMovement(r8)
        L_0x009c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0NB.A0L(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0M(android.view.MotionEvent r20, android.view.View r21, androidx.coordinatorlayout.widget.CoordinatorLayout r22) {
        /*
            r19 = this;
            r4 = r20
            int r7 = r4.getActionMasked()
            r6 = -1
            r3 = 1
            r11 = 0
            r2 = r19
            r5 = r21
            r0 = r22
            if (r7 == r3) goto L_0x006a
            r1 = 2
            if (r7 == r1) goto L_0x0042
            r0 = 3
            if (r7 == r0) goto L_0x00f1
            r0 = 6
            if (r7 != r0) goto L_0x0032
            int r0 = r4.getActionIndex()
            boolean r1 = X.AnonymousClass000.A1Q(r0)
            int r0 = r4.getPointerId(r1)
            r2.A03 = r0
            float r1 = r4.getY(r1)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            r2.A04 = r0
        L_0x0032:
            r1 = 0
        L_0x0033:
            android.view.VelocityTracker r0 = r2.A00
            if (r0 == 0) goto L_0x003a
            r0.addMovement(r4)
        L_0x003a:
            boolean r0 = r2.A06
            if (r0 != 0) goto L_0x0041
            if (r1 != 0) goto L_0x0041
            r3 = 0
        L_0x0041:
            return r3
        L_0x0042:
            int r1 = r2.A03
            int r1 = r4.findPointerIndex(r1)
            if (r1 != r6) goto L_0x004b
            return r11
        L_0x004b:
            float r1 = r4.getY(r1)
            int r1 = (int) r1
            int r6 = r2.A04
            int r6 = r6 - r1
            r2.A04 = r1
            r1 = r5
            com.google.android.material.appbar.AppBarLayout r1 = (com.google.android.material.appbar.AppBarLayout) r1
            int r1 = r1.getDownNestedScrollRange()
            int r1 = -r1
            int r9 = r2.A0S()
            int r9 = r9 - r6
            r8 = r0
            r10 = r1
            r6 = r2
            r7 = r5
            r6.A0T(r7, r8, r9, r10, r11)
            goto L_0x0032
        L_0x006a:
            android.view.VelocityTracker r1 = r2.A00
            if (r1 == 0) goto L_0x00f1
            r1.addMovement(r4)
            android.view.VelocityTracker r7 = r2.A00
            r1 = 1000(0x3e8, float:1.401E-42)
            r7.computeCurrentVelocity(r1)
            android.view.VelocityTracker r7 = r2.A00
            int r1 = r2.A03
            float r9 = r7.getYVelocity(r1)
            r1 = r5
            com.google.android.material.appbar.AppBarLayout r1 = (com.google.android.material.appbar.AppBarLayout) r1
            int r7 = r1.getTotalScrollRange()
            int r7 = -r7
            java.lang.Runnable r8 = r2.A02
            if (r8 == 0) goto L_0x0092
            r5.removeCallbacks(r8)
            r8 = 0
            r2.A02 = r8
        L_0x0092:
            android.widget.OverScroller r10 = r2.A01
            if (r10 != 0) goto L_0x00a1
            android.content.Context r8 = r5.getContext()
            android.widget.OverScroller r10 = new android.widget.OverScroller
            r10.<init>(r8)
            r2.A01 = r10
        L_0x00a1:
            X.0Tz r8 = r2.A01
            if (r8 == 0) goto L_0x00ef
            int r12 = r8.A02
        L_0x00a7:
            int r14 = java.lang.Math.round(r9)
            r13 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r17 = r7
            r10.fling(r11, r12, r13, r14, r15, r16, r17, r18)
            android.widget.OverScroller r7 = r2.A01
            boolean r7 = r7.computeScrollOffset()
            if (r7 == 0) goto L_0x00d9
            X.0h5 r1 = new X.0h5
            r1.<init>(r5, r0, r2)
            r2.A02 = r1
            X.C011504z.A07(r5, r1)
        L_0x00c8:
            r1 = 1
        L_0x00c9:
            r2.A06 = r11
            r2.A03 = r6
            android.view.VelocityTracker r0 = r2.A00
            if (r0 == 0) goto L_0x0033
            r0.recycle()
            r0 = 0
            r2.A00 = r0
            goto L_0x0033
        L_0x00d9:
            r5 = r2
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r5 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r5
            com.google.android.material.appbar.AppBarLayout.BaseBehavior.A02(r0, r5, r1)
            boolean r5 = r1.A09
            if (r5 == 0) goto L_0x00c8
            android.view.View r0 = com.google.android.material.appbar.AppBarLayout.BaseBehavior.A00(r0)
            boolean r0 = r1.A03(r0)
            r1.A04(r0)
            goto L_0x00c8
        L_0x00ef:
            r12 = 0
            goto L_0x00a7
        L_0x00f1:
            r1 = 0
            goto L_0x00c9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0NB.A0M(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    public void A0U(View view, CoordinatorLayout coordinatorLayout, int i) {
        A0T(view, coordinatorLayout, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public AnonymousClass0NB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnonymousClass0NB() {
    }
}
