package com.whatsapp.gesture;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0XL;
import X.C011004s;
import X.C117115lj;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.collections.observablelistview.ObservableListView;
import java.lang.ref.WeakReference;

public class VerticalSwipeDownBehavior extends AnonymousClass0XL {
    public int A00 = -1;
    public C117115lj A01;
    public float A02;
    public float A03;
    public WeakReference A04;
    public boolean A05;
    public final int A06;

    private void A01(float f) {
        ObservableListView observableListView;
        boolean z;
        WeakReference weakReference = this.A04;
        if (weakReference != null && (weakReference.get() instanceof ObservableListView) && (observableListView = (ObservableListView) weakReference.get()) != null) {
            int i = observableListView.A04;
            if (observableListView.getFirstVisiblePosition() == 0 || i == 0) {
                float f2 = this.A02;
                float f3 = (float) this.A06;
                if (f - f2 > f3 && !this.A05) {
                    this.A03 = f2 + f3;
                    z = true;
                } else {
                    return;
                }
            } else {
                z = false;
            }
            this.A05 = z;
        }
    }

    public VerticalSwipeDownBehavior(Context context) {
        this.A06 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    private View A00(View view) {
        if (C011004s.A0A(view) || (view instanceof AbsListView)) {
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
        int findPointerIndex;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.A00;
                    if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                        A01(motionEvent.getY(findPointerIndex));
                    }
                    return false;
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.A00) {
                            this.A00 = motionEvent.getPointerId(AnonymousClass000.A1Q(actionIndex) ? 1 : 0);
                        }
                    }
                }
            }
            this.A05 = false;
            this.A00 = -1;
        } else {
            int pointerId = motionEvent.getPointerId(0);
            this.A00 = pointerId;
            this.A05 = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 >= 0) {
                this.A02 = motionEvent.getY(findPointerIndex2);
            }
            return false;
        }
        return this.A05;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0086, code lost:
        if (r0 < 0) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0M(android.view.MotionEvent r7, android.view.View r8, androidx.coordinatorlayout.widget.CoordinatorLayout r9) {
        /*
            r6 = this;
            int r1 = r7.getActionMasked()
            r4 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0089
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r1 == r4) goto L_0x005e
            r0 = 2
            if (r1 == r0) goto L_0x002f
            r0 = 3
            if (r1 == r0) goto L_0x0088
            r0 = 5
            if (r1 == r0) goto L_0x0082
            r0 = 6
            if (r1 != r0) goto L_0x002e
            int r2 = r7.getActionIndex()
            int r1 = r7.getPointerId(r2)
            int r0 = r6.A00
            if (r1 != r0) goto L_0x002e
            boolean r0 = X.AnonymousClass000.A1Q(r2)
        L_0x0028:
            int r0 = r7.getPointerId(r0)
            r6.A00 = r0
        L_0x002e:
            return r4
        L_0x002f:
            int r0 = r6.A00
            int r0 = r7.findPointerIndex(r0)
            if (r0 < 0) goto L_0x0088
            float r3 = r7.getY(r0)
            r6.A01(r3)
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x002e
            float r0 = r6.A03
            float r3 = r3 - r0
            float r3 = r3 * r5
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x002e
            X.5lj r0 = r6.A01
            if (r0 == 0) goto L_0x002e
            com.whatsapp.conversation.gesture.VerticalSwipeToRevealBehavior r2 = r0.A00
            float r1 = r2.A00
            r0 = 1
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x005a
            r2.A00 = r3
        L_0x005a:
            com.whatsapp.conversation.gesture.VerticalSwipeToRevealBehavior.A00(r2, r3, r4)
            return r4
        L_0x005e:
            int r0 = r6.A00
            int r1 = r7.findPointerIndex(r0)
            if (r1 < 0) goto L_0x0088
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x007e
            r6.A05 = r3
            float r2 = r7.getY(r1)
            float r0 = r6.A03
            float r2 = r2 - r0
            float r2 = r2 * r5
            X.5lj r0 = r6.A01
            if (r0 == 0) goto L_0x007e
            com.whatsapp.conversation.gesture.VerticalSwipeToRevealBehavior r1 = r0.A00
            r0 = 2
            com.whatsapp.conversation.gesture.VerticalSwipeToRevealBehavior.A00(r1, r2, r0)
        L_0x007e:
            r0 = -1
            r6.A00 = r0
            return r3
        L_0x0082:
            int r0 = r7.getActionIndex()
            if (r0 >= 0) goto L_0x0028
        L_0x0088:
            return r3
        L_0x0089:
            int r0 = r7.getPointerId(r3)
            r6.A00 = r0
            r6.A05 = r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gesture.VerticalSwipeDownBehavior.A0M(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    public boolean A0P(View view, CoordinatorLayout coordinatorLayout, int i) {
        coordinatorLayout.A0F(view, i);
        View A002 = A00(view);
        if (A002 == null) {
            return true;
        }
        this.A04 = AnonymousClass001.A0F(A002);
        return true;
    }
}
