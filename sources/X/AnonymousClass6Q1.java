package X;

import android.os.Build;
import android.view.ViewStructure;

/* renamed from: X.6Q1  reason: invalid class name */
public class AnonymousClass6Q1 {
    public final Object A00;

    public static AnonymousClass6Q1 A00(ViewStructure viewStructure) {
        return new AnonymousClass6Q1(viewStructure);
    }

    public ViewStructure A01() {
        return (ViewStructure) this.A00;
    }

    public void A02(float f) {
        if (Build.VERSION.SDK_INT >= 23) {
            C132736Va.A00((ViewStructure) this.A00, f);
        }
    }

    public void A03(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 23) {
            C132736Va.A01((ViewStructure) this.A00, i, i2, i3, i4);
        }
    }

    public void A04(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 23) {
            C132736Va.A02((ViewStructure) this.A00, charSequence);
        }
    }

    public void A05(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 23) {
            C132736Va.A03((ViewStructure) this.A00, charSequence);
        }
    }

    public void A06(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            C132736Va.A04((ViewStructure) this.A00, str);
        }
    }

    public AnonymousClass6Q1(ViewStructure viewStructure) {
        this.A00 = viewStructure;
    }
}
