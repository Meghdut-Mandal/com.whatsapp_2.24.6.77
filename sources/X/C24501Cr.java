package X;

import android.os.Build;

/* renamed from: X.1Cr  reason: invalid class name and case insensitive filesystem */
public abstract class C24501Cr {
    public static final boolean A00;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 26) {
            z = true;
        }
        A00 = z;
    }
}
