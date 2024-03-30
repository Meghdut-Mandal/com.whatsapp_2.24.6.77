package X;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: X.0by  reason: invalid class name and case insensitive filesystem */
public class C09190by implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ CoordinatorLayout A00;

    public C09190by(CoordinatorLayout coordinatorLayout) {
        this.A00 = coordinatorLayout;
    }

    public boolean onPreDraw() {
        this.A00.A0D(0);
        return true;
    }
}
