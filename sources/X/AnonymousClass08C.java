package X;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: X.08C  reason: invalid class name */
public final class AnonymousClass08C {
    public final PointerIcon A00;

    public static AnonymousClass08C A00(Context context) {
        PointerIcon pointerIcon;
        if (Build.VERSION.SDK_INT >= 24) {
            pointerIcon = AnonymousClass08D.A00(context);
        } else {
            pointerIcon = null;
        }
        return new AnonymousClass08C(pointerIcon);
    }

    public AnonymousClass08C(PointerIcon pointerIcon) {
        this.A00 = pointerIcon;
    }

    public Object A01() {
        return this.A00;
    }
}
