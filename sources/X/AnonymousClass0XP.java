package X;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: X.0XP  reason: invalid class name */
public abstract class AnonymousClass0XP {
    public static Object A01(Context context) {
        return context.getSystemService(AppOpsManager.class);
    }

    public static int A00(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    public static String A02(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
