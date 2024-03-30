package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.93J  reason: invalid class name */
public abstract class AnonymousClass93J {
    public static boolean A00(Context context) {
        if (Build.VERSION.SDK_INT < 23 || context == null || context.getPackageManager() == null || !AnonymousClass93I.A00(context.getPackageManager())) {
            return false;
        }
        return true;
    }
}
