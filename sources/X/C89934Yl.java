package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.4Yl  reason: invalid class name and case insensitive filesystem */
public class C89934Yl implements ViewTreeObserver.OnPreDrawListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C89934Yl(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public boolean onPreDraw() {
        if (this.A03 != 0) {
            View view = (View) this.A01;
            int height = view.getHeight();
            View view2 = (View) this.A02;
            view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), view2.getPaddingBottom() + height);
            C36351kA.A1D(view, this);
            return false;
        }
        AnonymousClass2IS r1 = (AnonymousClass2IS) this.A02;
        C36351kA.A1D(r1, this);
        r1.A1D((C64933Qa) this.A01);
        return true;
    }
}
