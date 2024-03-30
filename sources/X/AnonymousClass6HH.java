package X;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;

/* renamed from: X.6HH  reason: invalid class name */
public final class AnonymousClass6HH {
    public static final Integer A00(PackageManager packageManager) {
        Bundle bundle;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.meta.testing", 192);
            AnonymousClass00C.A0B(packageInfo);
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null || signatureArr.length != 1 || !AnonymousClass00C.A0J(C113385fS.A00, signatureArr[0])) {
                return null;
            }
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return 0;
            }
            return Integer.valueOf(bundle.getInt("com.meta.testing.group", 0));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}
