package X;

import android.os.Build;
import android.telephony.TelephonyManager;

/* renamed from: X.6Re  reason: invalid class name and case insensitive filesystem */
public abstract class C131896Re {
    public static int A00;

    public static int A00() {
        int i = A00;
        if (i == 0) {
            i = AnonymousClass1K0.A01();
            if (i <= 0 && (i = Runtime.getRuntime().availableProcessors()) <= 0) {
                i = 1;
            }
            A00 = i;
        }
        return i;
    }

    public static int A01(TelephonyManager telephonyManager, C20830yE r3) {
        if (r3.A02("android.permission.READ_PHONE_STATE") != 0) {
            return 0;
        }
        if (Build.VERSION.SDK_INT < 30) {
            return telephonyManager.getNetworkType();
        }
        return telephonyManager.getDataNetworkType();
    }

    public static String A02() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr[0];
        }
        return Build.CPU_ABI;
    }
}
