package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.95I  reason: invalid class name */
public abstract class AnonymousClass95I {
    public static final List A00(Context context, String str) {
        PackageInfo packageInfo;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                packageInfo = context.getPackageManager().getPackageInfo(str, PackageManager.PackageInfoFlags.of(0));
            } else {
                packageInfo = context.getPackageManager().getPackageInfo(str, 128);
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("versionName=");
            A0u.append(packageInfo.versionName);
            AnonymousClass6YR.A06("lam:CompanionAppUtil", AnonymousClass000.A0t(A0u, ' '));
            String str2 = packageInfo.versionName;
            if (str2 != null) {
                List A0L = AnonymousClass099.A0L(str2, new String[]{"."}, 0);
                ArrayList A0J = C36321k7.A0J(A0L);
                Iterator it = A0L.iterator();
                while (it.hasNext()) {
                    String A0C = AnonymousClass001.A0C(it);
                    int i = 0;
                    if (!AnonymousClass000.A1Q(A0C.length())) {
                        i = Integer.parseInt(A0C);
                    }
                    AnonymousClass000.A1F(A0J, i);
                }
                return A0J;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}
