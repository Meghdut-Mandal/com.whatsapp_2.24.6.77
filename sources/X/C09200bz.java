package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: X.0bz  reason: invalid class name and case insensitive filesystem */
public class C09200bz implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ AnonymousClass0ET A00;

    public C09200bz(AnonymousClass0ET r1) {
        this.A00 = r1;
    }

    public boolean onPreDraw() {
        View view;
        AnonymousClass0ET r2 = this.A00;
        C011504z.A05(r2);
        ViewGroup viewGroup = r2.A01;
        if (viewGroup == null || (view = r2.A00) == null) {
            return true;
        }
        viewGroup.endViewTransition(view);
        C011504z.A05(r2.A01);
        r2.A01 = null;
        r2.A00 = null;
        return true;
    }
}
