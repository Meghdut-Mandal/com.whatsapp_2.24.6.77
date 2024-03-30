package X;

import android.os.Build;
import android.view.Window;

/* renamed from: X.0Q4  reason: invalid class name */
public abstract class AnonymousClass0Q4 {
    public static void A00(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            AnonymousClass0Q3.A00(window, z);
        } else {
            AnonymousClass0Q2.A00(window, z);
        }
    }
}
