package X;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;

/* renamed from: X.9Ym  reason: invalid class name and case insensitive filesystem */
public abstract class C196269Ym {
    public static KeyguardManager A00(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C196259Yl.A00(context);
        }
        Object systemService = context.getSystemService("keyguard");
        if (systemService instanceof KeyguardManager) {
            return (KeyguardManager) systemService;
        }
        return null;
    }

    public static boolean A01(Context context) {
        KeyguardManager A00 = A00(context);
        if (A00 == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return C196259Yl.A01(A00);
        }
        return A00.isKeyguardSecure();
    }
}
