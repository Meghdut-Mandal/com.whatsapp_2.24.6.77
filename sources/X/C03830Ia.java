package X;

import android.view.View;

/* renamed from: X.0Ia  reason: invalid class name and case insensitive filesystem */
public abstract class C03830Ia extends AnonymousClass0V3 {
    public static boolean A00 = true;

    public float A00(View view) {
        if (A00) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                A00 = false;
            }
        }
        return view.getAlpha();
    }

    public void A04(View view, float f) {
        if (A00) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                A00 = false;
            }
        }
        view.setAlpha(f);
    }
}
