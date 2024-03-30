package X;

import android.os.Build;
import android.view.View;

/* renamed from: X.0IX  reason: invalid class name */
public class AnonymousClass0IX extends AnonymousClass0IY {
    public static boolean A00 = true;

    public void A05(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.A05(view, i);
        } else if (A00) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                A00 = false;
            }
        }
    }
}
