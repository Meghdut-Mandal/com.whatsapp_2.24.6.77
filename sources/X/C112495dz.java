package X;

import android.os.Build;

/* renamed from: X.5dz  reason: invalid class name and case insensitive filesystem */
public abstract class C112495dz {
    public static final C158867iN A00;

    static {
        C158867iN r0;
        if (Build.VERSION.SDK_INT >= 23) {
            r0 = new C138046hB();
        } else {
            r0 = new C138056hC();
        }
        A00 = r0;
    }
}
