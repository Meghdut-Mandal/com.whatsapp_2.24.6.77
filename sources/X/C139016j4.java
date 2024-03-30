package X;

import android.view.View;

/* renamed from: X.6j4  reason: invalid class name and case insensitive filesystem */
public final class C139016j4 implements AnonymousClass7eE {
    public static final C139016j4 A00 = new C139016j4();

    public final int BG2(View view, int i) {
        int i2;
        if (view != null) {
            i2 = view.getMeasuredHeight();
        } else {
            i2 = 0;
        }
        return Math.min(i2, (int) (((float) i) * 0.75f));
    }
}
