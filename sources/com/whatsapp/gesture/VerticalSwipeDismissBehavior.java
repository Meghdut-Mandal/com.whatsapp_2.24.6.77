package com.whatsapp.gesture;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0XL;
import X.AnonymousClass0Z5;
import X.AnonymousClass752;
import X.C011004s;
import X.C011504z;
import X.C012005e;
import X.C160647lM;
import X.C36441kJ;
import X.C90514aH;
import X.C95274kL;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

public class VerticalSwipeDismissBehavior extends AnonymousClass0XL {
    public float A00;
    public float A01 = 0.0f;
    public int A02;
    public VelocityTracker A03;
    public AnonymousClass0Z5 A04;
    public C160647lM A05;
    public boolean A06 = true;
    public boolean A07;
    public boolean A08;
    public WeakReference A09;
    public boolean A0A;
    public boolean A0B;

    public boolean A0N(View view, View view2, View view3, CoordinatorLayout coordinatorLayout, int i, int i2) {
        this.A0B = false;
        return (i & 2) != 0;
    }

    public void A0H(View view, View view2, CoordinatorLayout coordinatorLayout, int i) {
        float yVelocity;
        WeakReference weakReference = this.A09;
        if (weakReference != null && view2 == weakReference.get() && this.A0B) {
            VelocityTracker velocityTracker = this.A03;
            if (velocityTracker == null) {
                yVelocity = 0.0f;
            } else {
                velocityTracker.computeCurrentVelocity(1000, this.A00);
                yVelocity = this.A03.getYVelocity(this.A02);
            }
            if (Math.abs(yVelocity) <= ((float) (view.getHeight() * 2))) {
                int top = view.getTop();
                if (Math.abs(top) < C90514aH.A06(C36441kJ.A02(view), 0.2f)) {
                    if (this.A04.A0H(view, view.getLeft(), 0)) {
                        C011504z.A07(view, new AnonymousClass752(this, view, 23, false));
                    }
                    this.A0B = false;
                }
            }
            this.A05.BVs(view);
            this.A0B = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I(android.view.View r5, android.view.View r6, androidx.coordinatorlayout.widget.CoordinatorLayout r7, int[] r8, int r9, int r10, int r11) {
        /*
            r4 = this;
            java.lang.ref.WeakReference r0 = r4.A09
            java.lang.Object r0 = r0.get()
            if (r6 != r0) goto L_0x003e
            int r2 = r5.getTop()
            r1 = 1
            if (r10 <= 0) goto L_0x003f
            boolean r0 = r6.canScrollVertically(r1)
            if (r0 == 0) goto L_0x004f
            if (r2 <= 0) goto L_0x0021
            int r0 = java.lang.Math.min(r10, r2)
        L_0x001b:
            r8[r1] = r0
            int r0 = -r0
            X.C012005e.A0Q(r5, r0)
        L_0x0021:
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x003e
            X.7lM r3 = r4.A05
            int r0 = r5.getTop()
            int r0 = java.lang.Math.abs(r0)
            float r2 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 * r1
            float r0 = X.C36441kJ.A02(r5)
            float r0 = X.C90524aI.A00(r2, r0, r1)
            r3.Bgp(r5, r0)
        L_0x003e:
            return
        L_0x003f:
            if (r10 >= 0) goto L_0x0021
            r0 = -1
            boolean r0 = r6.canScrollVertically(r0)
            if (r0 == 0) goto L_0x004f
            if (r2 >= 0) goto L_0x0021
            int r0 = java.lang.Math.max(r10, r2)
            goto L_0x001b
        L_0x004f:
            r8[r1] = r10
            int r0 = -r10
            X.C012005e.A0Q(r5, r0)
            r4.A0B = r1
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gesture.VerticalSwipeDismissBehavior.A0I(android.view.View, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int[], int, int, int):void");
    }

    public boolean A0O(View view, View view2, CoordinatorLayout coordinatorLayout, float f, float f2) {
        this.A09.get();
        return false;
    }

    public VerticalSwipeDismissBehavior(Context context) {
        this.A00 = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private View A00(View view) {
        if (C011004s.A0A(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View A002 = A00(viewGroup.getChildAt(i));
                if (A002 != null) {
                    return A002;
                }
            }
        }
        return null;
    }

    public boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        View A0Y;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A02 = -1;
            VelocityTracker velocityTracker = this.A03;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.A03 = null;
            }
        }
        VelocityTracker velocityTracker2 = this.A03;
        if (velocityTracker2 == null) {
            velocityTracker2 = VelocityTracker.obtain();
            this.A03 = velocityTracker2;
        }
        velocityTracker2.addMovement(motionEvent);
        boolean z = this.A0A;
        if (actionMasked == 0) {
            z = coordinatorLayout.A0H(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.A0A = z;
            WeakReference weakReference = this.A09;
            if (!(weakReference == null || (A0Y = AnonymousClass000.A0Y(weakReference)) == null || !coordinatorLayout.A0H(A0Y, (int) motionEvent.getX(), (int) motionEvent.getY()))) {
                this.A02 = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.A08 = true;
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.A08 = false;
            this.A0A = false;
            this.A02 = -1;
        }
        if (!z) {
            return false;
        }
        AnonymousClass0Z5 r3 = this.A04;
        if (r3 == null) {
            if (this.A07) {
                float f = this.A01;
                r3 = AnonymousClass0Z5.A01(coordinatorLayout, new C95274kL(coordinatorLayout, this));
                r3.A05 = (int) (((float) r3.A05) * (1.0f / f));
            } else {
                r3 = AnonymousClass0Z5.A01(coordinatorLayout, new C95274kL(coordinatorLayout, this));
            }
            this.A04 = r3;
        }
        return r3.A0F(motionEvent);
    }

    public boolean A0M(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (motionEvent.getActionMasked() == 0) {
            this.A02 = -1;
            VelocityTracker velocityTracker = this.A03;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.A03 = null;
            }
        }
        VelocityTracker velocityTracker2 = this.A03;
        if (velocityTracker2 == null) {
            velocityTracker2 = VelocityTracker.obtain();
            this.A03 = velocityTracker2;
        }
        velocityTracker2.addMovement(motionEvent);
        AnonymousClass0Z5 r0 = this.A04;
        if (r0 == null) {
            return false;
        }
        try {
            r0.A0C(motionEvent);
            return true;
        } catch (IllegalArgumentException e) {
            Log.e("VerticalSwipeDismissBehavior/onTouchEvent", e);
            return false;
        }
    }

    public boolean A0P(View view, CoordinatorLayout coordinatorLayout, int i) {
        int top = view.getTop();
        coordinatorLayout.A0F(view, i);
        if (this.A0B) {
            C012005e.A0Q(view, top - view.getTop());
        }
        this.A09 = AnonymousClass001.A0F(A00(view));
        return true;
    }
}
