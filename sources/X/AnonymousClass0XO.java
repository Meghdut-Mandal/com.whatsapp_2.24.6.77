package X;

import android.app.Activity;
import android.app.SharedElementCallback;

/* renamed from: X.0XO  reason: invalid class name */
public abstract class AnonymousClass0XO {
    public static void A01(Object obj) {
        ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
    }

    public static boolean A02(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }

    public static void A00(Activity activity, String[] strArr, int i) {
        activity.requestPermissions(strArr, i);
    }
}
