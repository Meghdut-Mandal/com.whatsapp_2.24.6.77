package X;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: X.0h5  reason: invalid class name and case insensitive filesystem */
public class C11840h5 implements Runnable {
    public final View A00;
    public final CoordinatorLayout A01;
    public final /* synthetic */ AnonymousClass0NB A02;

    public C11840h5(View view, CoordinatorLayout coordinatorLayout, AnonymousClass0NB r3) {
        this.A02 = r3;
        this.A01 = coordinatorLayout;
        this.A00 = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r4.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r4 = this;
            android.view.View r3 = r4.A00
            if (r3 == 0) goto L_0x001e
            X.0NB r2 = r4.A02
            android.widget.OverScroller r0 = r2.A01
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.computeScrollOffset()
            androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r4.A01
            if (r0 == 0) goto L_0x001f
            android.widget.OverScroller r0 = r2.A01
            int r0 = r0.getCurrY()
            r2.A0U(r3, r1, r0)
            X.C011504z.A07(r3, r4)
        L_0x001e:
            return
        L_0x001f:
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r2 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r2
            com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
            com.google.android.material.appbar.AppBarLayout.BaseBehavior.A02(r1, r2, r3)
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x001e
            android.view.View r0 = com.google.android.material.appbar.AppBarLayout.BaseBehavior.A00(r1)
            boolean r0 = r3.A03(r0)
            r3.A04(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11840h5.run():void");
    }
}
