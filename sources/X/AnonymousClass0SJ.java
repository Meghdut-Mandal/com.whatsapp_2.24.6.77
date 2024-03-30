package X;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: X.0SJ  reason: invalid class name */
public final class AnonymousClass0SJ {
    public final AnonymousClass0UD A00;

    public AnonymousClass0SJ(View view, Window window) {
        AnonymousClass0UD r0;
        AnonymousClass0SI r2 = new AnonymousClass0SI(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            r0 = new AnonymousClass0H4(window, r2, this);
        } else if (i >= 26) {
            r0 = new AnonymousClass0H1(window, r2);
        } else if (i >= 23) {
            r0 = new AnonymousClass0H2(window, r2);
        } else {
            r0 = new AnonymousClass0H3(window, r2);
        }
        this.A00 = r0;
    }
}
