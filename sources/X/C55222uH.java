package X;

import android.os.Build;
import android.telephony.TelephonyManager;

/* renamed from: X.2uH  reason: invalid class name and case insensitive filesystem */
public abstract class C55222uH {
    public static int A00(C21060yb r2) {
        TelephonyManager A0K;
        if (Build.VERSION.SDK_INT < 28 || (A0K = r2.A0K()) == null || A0K.getSignalStrength() == null) {
            return 5;
        }
        return A0K.getSignalStrength().getLevel();
    }
}
