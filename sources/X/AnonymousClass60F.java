package X;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;

/* renamed from: X.60F  reason: invalid class name */
public class AnonymousClass60F {
    public final PackageManager A00;

    public C592733h A00() {
        Bundle bundle;
        try {
            PackageInfo packageInfo = this.A00.getPackageInfo(C113705fy.A00, 192);
            if (packageInfo.applicationInfo == null) {
                return null;
            }
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null && signatureArr.length == 1) {
                Signature signature = signatureArr[0];
                if (!C113855gE.A01.equals(signature) && !C113855gE.A00.equals(signature)) {
                    C113855gE.A02.equals(signature);
                }
            }
            int i = -1;
            if (packageInfo.versionCode >= 20297189) {
                i = 1;
            }
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (!(applicationInfo == null || (bundle = applicationInfo.metaData) == null)) {
                i = bundle.getInt("com.facebook.appmanager.api.level", i);
            }
            return new C592733h(i, packageInfo.applicationInfo.enabled);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public AnonymousClass60F(PackageManager packageManager) {
        this.A00 = packageManager;
    }
}
