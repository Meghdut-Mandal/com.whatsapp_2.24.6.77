package X;

import android.os.Build;
import android.view.View;

/* renamed from: X.5XK  reason: invalid class name */
public abstract class AnonymousClass5XK {
    public static AnonymousClass6ME A00(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return AnonymousClass6ME.A00(AnonymousClass5XH.A00(view));
        }
        return null;
    }
}
