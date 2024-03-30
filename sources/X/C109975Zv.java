package X;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: X.5Zv  reason: invalid class name and case insensitive filesystem */
public abstract class C109975Zv {
    public static long A00(C140456lc r5) {
        Object A0I = C140456lc.A0I(r5, 35);
        if (A0I != null) {
            if (A0I instanceof String) {
                String str = (String) A0I;
                if (!TextUtils.isEmpty(str)) {
                    try {
                        return Long.parseLong(str);
                    } catch (NumberFormatException e) {
                        Log.e("WaRcCountDownTimer", AnonymousClass000.A0l(A0I, "Invalid long value:", AnonymousClass000.A0u()), e);
                        return 0;
                    }
                }
            } else if (A0I instanceof Number) {
                return C36431kI.A09(A0I);
            } else {
                throw AnonymousClass001.A08("Attempting to extract unrecognized type from countdown timer component");
            }
        }
        return 0;
    }
}
