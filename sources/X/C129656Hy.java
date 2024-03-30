package X;

import android.os.Build;

/* renamed from: X.6Hy  reason: invalid class name and case insensitive filesystem */
public abstract class C129656Hy {
    public static final AnonymousClass7e4 A00;

    static {
        AnonymousClass7e4 r0;
        if (Build.VERSION.SDK_INT >= 24) {
            r0 = new C138156hO();
        } else {
            r0 = new C138146hN();
        }
        A00 = r0;
    }
}
