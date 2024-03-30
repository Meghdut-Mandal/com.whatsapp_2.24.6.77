package X;

import android.view.ViewStructure;

/* renamed from: X.6Va  reason: invalid class name and case insensitive filesystem */
public abstract class C132736Va {
    public static void A00(ViewStructure viewStructure, float f) {
        viewStructure.setTextStyle(f, 0, 0, 0);
    }

    public static void A01(ViewStructure viewStructure, int i, int i2, int i3, int i4) {
        viewStructure.setDimens(i, i2, 0, 0, i3, i4);
    }

    public static void A02(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setContentDescription(charSequence);
    }

    public static void A03(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setText(charSequence);
    }

    public static void A04(ViewStructure viewStructure, String str) {
        viewStructure.setClassName(str);
    }
}
