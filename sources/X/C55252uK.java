package X;

import android.os.Build;
import android.telephony.TelephonyManager;

/* renamed from: X.2uK  reason: invalid class name and case insensitive filesystem */
public abstract class C55252uK {
    public static final boolean A00(C21060yb r5, C21520zN r6, int i) {
        TelephonyManager A0K;
        int A1a = C36331k8.A1a(r5, r6);
        boolean A0E = r6.A0E(4431);
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 28;
        if (A0E) {
            i3 = 23;
        }
        boolean A1T = C36371kC.A1T(i2, i3);
        Boolean bool = C18750th.A03;
        if (!A1T || (((A0K = r5.A0K()) != null && A0K.getSimState() == A1a) || i < A1a)) {
            return false;
        }
        return true;
    }
}
