package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: X.5eS  reason: invalid class name and case insensitive filesystem */
public abstract class C112785eS {
    public static Boolean A00;

    public static boolean A00(Context context) {
        boolean z = false;
        Boolean bool = A00;
        if (bool == null) {
            int i = Build.VERSION.SDK_INT;
            if (i > 29) {
                bool = true;
            } else if (i < 24) {
                A00 = false;
                bool = false;
            } else {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && packageManager.hasSystemFeature("android.hardware.camera.level.full")) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
            A00 = bool;
        }
        return bool.booleanValue();
    }
}
