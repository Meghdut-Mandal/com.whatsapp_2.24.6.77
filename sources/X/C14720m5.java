package X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.0m5  reason: invalid class name and case insensitive filesystem */
public final class C14720m5 extends AnonymousClass00R implements C006302t {
    public static final C14720m5 A00 = new C14720m5();

    public C14720m5() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view = (View) obj;
        AnonymousClass00C.A0D(view, 0);
        ViewParent parent = view.getParent();
        if (!(parent instanceof View)) {
            return null;
        }
        return parent;
    }
}
