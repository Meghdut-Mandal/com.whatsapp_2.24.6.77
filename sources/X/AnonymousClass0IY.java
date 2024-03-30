package X;

import android.view.View;

/* renamed from: X.0IY  reason: invalid class name */
public class AnonymousClass0IY extends AnonymousClass0IZ {
    public static boolean A00 = true;

    public void A06(View view, int i, int i2, int i3, int i4) {
        if (A00) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                A00 = false;
            }
        }
    }
}
