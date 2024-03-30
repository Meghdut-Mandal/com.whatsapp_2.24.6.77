package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.6ID  reason: invalid class name */
public abstract class AnonymousClass6ID {
    public static Set A00;

    public static Set A00() {
        Set set = A00;
        if (set != null) {
            return set;
        }
        HashSet A16 = C36441kJ.A16();
        for (AnonymousClass72I r1 : C197129bB.A10) {
            A16.add(r1.sha1Hash);
            A16.add(r1.sha256Hash);
        }
        for (AnonymousClass72I r12 : C197129bB.A11) {
            A16.add(r12.sha1Hash);
            A16.add(r12.sha256Hash);
        }
        Set unmodifiableSet = Collections.unmodifiableSet(A16);
        A00 = unmodifiableSet;
        return unmodifiableSet;
    }

    public static boolean A01(Context context) {
        String packageName = context.getPackageName();
        int i = 64;
        if (C19550w8.A05()) {
            i = 134217728;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, i);
            if (packageInfo == null || !C132916Vu.A04(packageInfo)) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e((Throwable) e);
        }
    }
}
