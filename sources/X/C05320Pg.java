package X;

import android.content.Context;
import android.os.Process;

/* renamed from: X.0Pg  reason: invalid class name and case insensitive filesystem */
public abstract class C05320Pg {
    public static int A00(Context context, String str, String str2, int i, int i2) {
        int A00;
        if (context.checkPermission(str, i, i2) != -1) {
            String A02 = AnonymousClass0XR.A02(str);
            if (A02 == null) {
                return 0;
            }
            if (str2 == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
                if (packagesForUid != null && packagesForUid.length > 0) {
                    str2 = packagesForUid[0];
                }
            }
            int myUid = Process.myUid();
            String packageName = context.getPackageName();
            if (myUid != i2 || !C014106d.A01(packageName, str2)) {
                A00 = AnonymousClass0XR.A00(context, A02, str2);
            } else {
                A00 = AnonymousClass0XR.A01(context, A02, str2, i2);
            }
            if (A00 != 0) {
                return -2;
            }
            return 0;
        }
        return -1;
    }
}
