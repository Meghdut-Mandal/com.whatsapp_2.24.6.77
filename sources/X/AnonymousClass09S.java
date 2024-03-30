package X;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.09S  reason: invalid class name */
public abstract class AnonymousClass09S {
    public static void A01(View view, int i) {
        view.setScrollIndicators(i, 3);
    }

    public static AnonymousClass09H A00(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        AnonymousClass09H A01 = AnonymousClass09H.A01((View) null, rootWindowInsets);
        AnonymousClass09I r1 = A01.A00;
        r1.A0G(A01);
        r1.A0F(view.getRootView());
        return A01;
    }
}
