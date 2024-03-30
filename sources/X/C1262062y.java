package X;

import android.content.res.Resources;
import android.view.View;

/* renamed from: X.62y  reason: invalid class name and case insensitive filesystem */
public class C1262062y {
    public final Resources A00;
    public final View A01;
    public final C117355m8 A02;

    public void A00(float f) {
        C133586Zc r3 = this.A02.A00;
        int i = (int) f;
        r3.A01 = i;
        int max = Math.max(i, r3.A02);
        r3.A0E.setPadding(0, 0, 0, max);
        r3.A0E.requestLayout();
        r3.A0P(max);
    }

    public C1262062y(Resources resources, View view, C117355m8 r3) {
        this.A00 = resources;
        this.A01 = view;
        this.A02 = r3;
    }
}
