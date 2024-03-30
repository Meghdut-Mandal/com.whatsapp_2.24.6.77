package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9dY  reason: invalid class name and case insensitive filesystem */
public final class C198439dY {
    public final Context A00;

    private final C207779wy A00() {
        C207779wy r1 = new C207779wy(this.A00);
        if (r1.isAvailableOnDevice()) {
            return r1;
        }
        return null;
    }

    public final B24 A01() {
        C207779wy r8;
        String string;
        if (Build.VERSION.SDK_INT < 34 || (r8 = A00()) == null) {
            r8 = null;
            Context context = this.A00;
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
            ArrayList A0I = AnonymousClass001.A0I();
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            if (serviceInfoArr != null) {
                for (ServiceInfo serviceInfo : serviceInfoArr) {
                    if (!(serviceInfo.metaData == null || (string = serviceInfo.metaData.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) == null)) {
                        A0I.add(string);
                    }
                }
            }
            List A0Y = C007103b.A0Y(A0I);
            if (!A0Y.isEmpty()) {
                Iterator it = A0Y.iterator();
                B24 b24 = null;
                while (it.hasNext()) {
                    try {
                        Object newInstance = Class.forName(AnonymousClass001.A0C(it)).getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
                        AnonymousClass00C.A0E(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                        B24 b242 = (B24) newInstance;
                        if (!b242.isAvailableOnDevice()) {
                            continue;
                        } else if (b24 != null) {
                            Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                            return null;
                        } else {
                            b24 = b242;
                        }
                    } catch (Throwable unused) {
                    }
                }
                return b24;
            }
        }
        return r8;
    }

    public C198439dY(Context context) {
        this.A00 = context;
    }
}
