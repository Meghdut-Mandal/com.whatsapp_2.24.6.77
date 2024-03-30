package X;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: X.3SJ  reason: invalid class name */
public abstract class AnonymousClass3SJ {
    public static void A03(C70803fk r1) {
        A01(r1.A2l.BoP(), 106);
    }

    public static void A00(Activity activity, int i) {
        if (!A04(activity)) {
            activity.removeDialog(i);
        }
    }

    public static void A01(Activity activity, int i) {
        if (!A04(activity)) {
            activity.showDialog(i);
        }
    }

    public static void A02(Activity activity, Bundle bundle, int i) {
        if (!A04(activity)) {
            activity.showDialog(i, bundle);
        }
    }

    public static boolean A04(Activity activity) {
        if (activity.isFinishing() || activity.isChangingConfigurations() || activity.isDestroyed()) {
            return true;
        }
        return false;
    }
}
