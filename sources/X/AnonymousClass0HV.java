package X;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: X.0HV  reason: invalid class name */
public class AnonymousClass0HV extends AnonymousClass0V6 {
    public int A00;
    public int A01 = -1;
    public final /* synthetic */ SwipeDismissBehavior A02;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        if (r3 <= 0) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        if (java.lang.Math.abs(r2) >= java.lang.Math.round(((float) r7.getWidth()) * 0.5f)) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        r4 = r6.A00;
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r8 < 0.0f) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(android.view.View r7, float r8, float r9) {
        /*
            r6 = this;
            r0 = -1
            r6.A01 = r0
            int r5 = r7.getWidth()
            r4 = 0
            r1 = 1
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x005c
            int r0 = X.AnonymousClass04F.A01(r7)
            boolean r2 = X.AnonymousClass000.A1S(r0, r1)
            com.google.android.material.behavior.SwipeDismissBehavior r0 = r6.A02
            int r1 = r0.A02
            r0 = 2
            if (r1 == r0) goto L_0x0024
            if (r1 != 0) goto L_0x0057
            if (r2 == 0) goto L_0x0059
        L_0x0020:
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0076
        L_0x0024:
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0053
            int r0 = r7.getLeft()
            int r4 = r6.A00
            if (r0 < r4) goto L_0x0053
            int r4 = r4 + r5
        L_0x0031:
            r3 = 1
        L_0x0032:
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r6.A02
            X.0Z5 r1 = r2.A03
            int r0 = r7.getTop()
            boolean r0 = r1.A0E(r4, r0)
            if (r0 == 0) goto L_0x0049
            X.0h6 r0 = new X.0h6
            r0.<init>(r7, r2, r3)
            X.C011504z.A07(r7, r0)
        L_0x0048:
            return
        L_0x0049:
            if (r3 == 0) goto L_0x0048
            X.0ql r0 = r2.A04
            if (r0 == 0) goto L_0x0048
            r0.BVs(r7)
            return
        L_0x0053:
            int r4 = r6.A00
            int r4 = r4 - r5
            goto L_0x0031
        L_0x0057:
            if (r2 == 0) goto L_0x0020
        L_0x0059:
            if (r3 <= 0) goto L_0x0076
            goto L_0x0024
        L_0x005c:
            int r2 = r7.getLeft()
            int r0 = r6.A00
            int r2 = r2 - r0
            int r0 = r7.getWidth()
            float r1 = (float) r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r0
            int r1 = java.lang.Math.round(r1)
            int r0 = java.lang.Math.abs(r2)
            if (r0 < r1) goto L_0x0076
            goto L_0x0024
        L_0x0076:
            int r4 = r6.A00
            r3 = 0
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0HV.A06(android.view.View, float, float):void");
    }

    public AnonymousClass0HV(SwipeDismissBehavior swipeDismissBehavior) {
        this.A02 = swipeDismissBehavior;
    }

    public void A05(int i) {
        C17120ql r0 = this.A02.A04;
        if (r0 != null) {
            r0.BWD(i);
        }
    }

    public void A07(View view, int i) {
        this.A01 = i;
        this.A00 = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.A02;
            swipeDismissBehavior.A05 = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.A05 = false;
        }
    }

    public boolean A09(View view, int i) {
        int i2 = this.A01;
        if ((i2 == -1 || i2 == i) && this.A02.A0R(view)) {
            return true;
        }
        return false;
    }

    public int A01(View view) {
        return view.getWidth();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        if (r1 != false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r1 != false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        r2 = r3.A00;
        r1 = r4.getWidth() + r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A03(android.view.View r4, int r5, int r6) {
        /*
            r3 = this;
            int r0 = X.AnonymousClass04F.A01(r4)
            r2 = 1
            boolean r1 = X.AnonymousClass000.A1S(r0, r2)
            com.google.android.material.behavior.SwipeDismissBehavior r0 = r3.A02
            int r0 = r0.A02
            if (r0 != 0) goto L_0x0023
            if (r1 == 0) goto L_0x0027
        L_0x0011:
            int r2 = r3.A00
            int r0 = r4.getWidth()
            int r2 = r2 - r0
            int r1 = r3.A00
        L_0x001a:
            int r0 = java.lang.Math.max(r2, r5)
            int r0 = java.lang.Math.min(r0, r1)
            return r0
        L_0x0023:
            if (r0 != r2) goto L_0x002f
            if (r1 == 0) goto L_0x0011
        L_0x0027:
            int r2 = r3.A00
            int r1 = r4.getWidth()
            int r1 = r1 + r2
            goto L_0x001a
        L_0x002f:
            int r2 = r3.A00
            int r0 = r4.getWidth()
            int r2 = r2 - r0
            int r0 = r3.A00
            int r1 = r4.getWidth()
            int r1 = r1 + r0
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0HV.A03(android.view.View, int, int):int");
    }

    public int A04(View view, int i, int i2) {
        return view.getTop();
    }

    public void A08(View view, int i, int i2, int i3, int i4) {
        SwipeDismissBehavior swipeDismissBehavior = this.A02;
        float width = ((float) view.getWidth()) * swipeDismissBehavior.A01;
        float width2 = ((float) view.getWidth()) * swipeDismissBehavior.A00;
        float A05 = (float) AnonymousClass000.A05(i, this.A00);
        if (A05 <= width) {
            view.setAlpha(1.0f);
        } else if (A05 >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((A05 - width) / (width2 - width))), 1.0f));
        }
    }
}
