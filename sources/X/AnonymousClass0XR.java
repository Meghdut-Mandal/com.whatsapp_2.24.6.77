package X;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* renamed from: X.0XR  reason: invalid class name */
public abstract class AnonymousClass0XR {
    public static int A00(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AnonymousClass0XP.A00((AppOpsManager) AnonymousClass0XP.A01(context), str, str2);
        }
        return 1;
    }

    public static int A01(Context context, String str, String str2, int i) {
        if (Build.VERSION.SDK_INT < 29) {
            return A00(context, str, str2);
        }
        AppOpsManager A01 = AnonymousClass0XQ.A01(context);
        int A00 = AnonymousClass0XQ.A00(A01, str, str2, Binder.getCallingUid());
        if (A00 == 0) {
            return AnonymousClass0XQ.A00(A01, str, AnonymousClass0XQ.A02(context), i);
        }
        return A00;
    }

    public static String A02(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AnonymousClass0XP.A02(str);
        }
        return null;
    }
}
