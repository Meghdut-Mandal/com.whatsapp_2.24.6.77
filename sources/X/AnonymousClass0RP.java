package X;

import android.os.Build;

/* renamed from: X.0RP  reason: invalid class name */
public abstract class AnonymousClass0RP {
    public static final int A00;

    static {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 31) {
            i = 33554432;
        }
        A00 = i;
    }
}
