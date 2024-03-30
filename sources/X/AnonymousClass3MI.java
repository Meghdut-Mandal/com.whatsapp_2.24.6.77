package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.List;

/* renamed from: X.3MI  reason: invalid class name */
public abstract class AnonymousClass3MI {
    public static final void A00(Context context, C19420v0 r7, C19770wU r8) {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        String str3;
        boolean A1a = C36341k9.A1a(context, r8);
        AnonymousClass00C.A0D(r7, 2);
        C64593Op r2 = new C64593Op(context);
        AnonymousClass37I r5 = new AnonymousClass37I(r2, r7, r8);
        int i = r2.A00;
        if (i != 2) {
            if (i == A1a) {
                str3 = "Client is already in the process of connecting to the service.";
            } else if (i == 3) {
                str3 = "Client was already closed and can't be reused. Please create another instance.";
            }
            AnonymousClass3LL.A01(str3);
            return;
        } else if (!(r2.A02 == null || r2.A01 == null)) {
            AnonymousClass3LL.A00("Service connection is valid. No need to re-initialize.");
            C80313vC.A01(r5.A02, r5.A00, r5.A01, 21);
            return;
        }
        AnonymousClass3LL.A00("Starting install referrer service setup.");
        Intent A0I = C36441kJ.A0I("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        C36421kH.A0o(A0I, "com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService");
        Context context2 = r2.A03;
        List<ResolveInfo> queryIntentServices = context2.getPackageManager().queryIntentServices(A0I, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
            r2.A00 = 0;
            str = "Install Referrer service unavailable on device.";
        } else {
            String str4 = serviceInfo.packageName;
            String str5 = serviceInfo.name;
            if ("com.android.vending".equals(str4) && str5 != null) {
                try {
                    if (context2.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                        Intent intent = new Intent(A0I);
                        AnonymousClass3WF r0 = new AnonymousClass3WF(r2, r5);
                        r2.A01 = r0;
                        try {
                            if (context2.bindService(intent, r0, A1a ? 1 : 0)) {
                                str = "Service was bonded successfully.";
                            } else {
                                str2 = "Connection to service is blocked.";
                                AnonymousClass3LL.A01(str2);
                                r2.A00 = 0;
                                return;
                            }
                        } catch (SecurityException unused) {
                            AnonymousClass3LL.A01("No permission to connect to service.");
                            r2.A00 = 0;
                            return;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
            }
            str2 = "Play Store missing or incompatible. Version 8.3.73 or later required.";
            AnonymousClass3LL.A01(str2);
            r2.A00 = 0;
            return;
        }
        AnonymousClass3LL.A00(str);
    }
}
