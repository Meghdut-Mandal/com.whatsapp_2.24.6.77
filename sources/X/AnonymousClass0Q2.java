package X;

import android.view.View;
import android.view.Window;

/* renamed from: X.0Q2  reason: invalid class name */
public abstract class AnonymousClass0Q2 {
    public static void A00(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        int i = systemUiVisibility | 1792;
        if (z) {
            i = systemUiVisibility & -1793;
        }
        decorView.setSystemUiVisibility(i);
    }
}
