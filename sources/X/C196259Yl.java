package X;

import android.app.KeyguardManager;
import android.content.Context;

/* renamed from: X.9Yl  reason: invalid class name and case insensitive filesystem */
public abstract class C196259Yl {
    public static KeyguardManager A00(Context context) {
        return (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    public static boolean A01(KeyguardManager keyguardManager) {
        return keyguardManager.isDeviceSecure();
    }
}
