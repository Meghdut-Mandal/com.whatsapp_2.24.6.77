package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: X.6I0  reason: invalid class name */
public abstract class AnonymousClass6I0 {
    public static final String A00 = AnonymousClass6VD.A01("PackageManagerHelper");

    public static void A00(Context context, Class cls, boolean z) {
        String str = "enabled";
        try {
            PackageManager packageManager = context.getPackageManager();
            String name = cls.getName();
            packageManager.setComponentEnabledSetting(new ComponentName(context, name), C36391kE.A00(z ? 1 : 0), 1);
            AnonymousClass6VD A002 = AnonymousClass6VD.A00();
            String str2 = A00;
            StringBuilder A0v = AnonymousClass000.A0v(name);
            C36421kH.A1N(A0v);
            String str3 = "disabled";
            if (z) {
                str3 = str;
            }
            AnonymousClass6VD.A03(A002, str3, str2, A0v);
        } catch (Exception e) {
            AnonymousClass6VD A003 = AnonymousClass6VD.A00();
            String str4 = A00;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(cls.getName());
            A0u.append("could not be ");
            if (!z) {
                str = "disabled";
            }
            String A0q = AnonymousClass000.A0q(str, A0u);
            if (A003.A00 <= 3) {
                Log.d(str4, A0q, e);
            }
        }
    }
}
