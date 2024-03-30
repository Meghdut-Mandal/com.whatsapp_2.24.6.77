package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.06R  reason: invalid class name */
public abstract class AnonymousClass06R {
    public static AnonymousClass06N A00(int i) {
        if (i == 0 || i != 1) {
            return new AnonymousClass06O();
        }
        return new AnonymousClass0NN();
    }

    public static void A03(View view, C012505l r3) {
        C014406g r0 = r3.A01.A0J;
        if (r0 != null && r0.A04) {
            float f = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                f += C011004s.A00((View) parent);
            }
            AnonymousClass06X r1 = r3.A01;
            if (r1.A02 != f) {
                r1.A02 = f;
                C012505l.A03(r3);
            }
        }
    }

    public static void A01(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C012505l) {
            A03(view, (C012505l) background);
        }
    }

    public static void A02(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C012505l) {
            ((C012505l) background).A09(f);
        }
    }
}
