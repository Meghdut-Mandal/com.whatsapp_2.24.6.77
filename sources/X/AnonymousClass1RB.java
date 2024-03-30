package X;

import android.graphics.Color;
import android.view.Window;

/* renamed from: X.1RB  reason: invalid class name */
public abstract class AnonymousClass1RB {
    public static final void A00(Window window, int i, boolean z) {
        AnonymousClass00C.A0D(window, 0);
        if (C19550w8.A01() || Color.alpha(i) != 255 || !C224514j.A02(i)) {
            window.setStatusBarColor(i);
            if (z && Color.alpha(i) == 255) {
                AnonymousClass1RC.A09(window, C224514j.A02(i));
                return;
            }
            return;
        }
        window.setStatusBarColor(-16777216);
    }
}
