package X;

import android.os.Build;
import android.view.View;

/* renamed from: X.0SI  reason: invalid class name */
public final class AnonymousClass0SI {
    public final AnonymousClass0Q0 A00;

    public AnonymousClass0SI(View view) {
        AnonymousClass0Q0 r0;
        if (Build.VERSION.SDK_INT >= 30) {
            r0 = new AnonymousClass0Gu(view);
        } else {
            r0 = new C03630Gv(view);
        }
        this.A00 = r0;
    }
}
