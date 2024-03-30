package X;

import android.os.Build;

/* renamed from: X.990  reason: invalid class name */
public abstract class AnonymousClass990 {
    public static final int A00;

    static {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 30) {
            String str = Build.VERSION.CODENAME;
            if (str.length() == 1 && str.charAt(0) >= 'S' && str.charAt(0) <= 'Z') {
                i = 33554432;
            }
        }
        A00 = i;
    }
}
