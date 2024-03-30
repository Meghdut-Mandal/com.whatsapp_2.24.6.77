package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: X.6L2  reason: invalid class name */
public final class AnonymousClass6L2 {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;
    public final List A04;

    public static final void A00(AnonymousClass6L2 r6) {
        int i;
        int i2;
        if (r6.A03) {
            int i3 = r6.A02;
            if (i3 == 1 || i3 == 3) {
                i = r6.A00;
                i2 = r6.A01;
            } else {
                i2 = -1;
                i = -1;
            }
            Iterator it = r6.A04.iterator();
            while (it.hasNext()) {
                View A0K = C36431kI.A0K(it);
                ViewGroup.LayoutParams layoutParams = A0K.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.width = i;
                layoutParams2.height = i2;
                layoutParams2.gravity = 17;
                A0K.setLayoutParams(layoutParams2);
                A0K.setRotation(((float) r6.A02) * -90.0f);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6L2(android.view.ViewGroup r5, java.util.List r6) {
        /*
            r4 = this;
            X.C36321k7.A0x(r5, r6)
            r4.<init>()
            r4.A04 = r6
            boolean r0 = r5 instanceof android.widget.FrameLayout
            if (r0 == 0) goto L_0x0038
            java.util.Iterator r3 = r6.iterator()
        L_0x0010:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0033
            android.view.View r2 = X.C36431kI.A0K(r3)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            int r0 = r0.width
            r1 = -1
            if (r0 != r1) goto L_0x002c
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            int r0 = r0.height
            if (r0 != r1) goto L_0x002c
            goto L_0x0010
        L_0x002c:
            java.lang.String r0 = "Children must have MATCH_PARENT for both width and height"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0033:
            r0 = 1
            X.C163327q1.A00(r5, r4, r0)
            return
        L_0x0038:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6L2.<init>(android.view.ViewGroup, java.util.List):void");
    }
}
