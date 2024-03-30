package X;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.3Nx  reason: invalid class name and case insensitive filesystem */
public class C64423Nx {
    public final C19630wG A00;
    public final C33241ex A01;
    public final AnonymousClass1VH A02;
    public final C62223Fg A03;
    public final AnonymousClass62D A04;
    public final Executor A05;

    public C64423Nx(C19630wG r4, C33241ex r5, AnonymousClass1VH r6, C62223Fg r7, C19770wU r8) {
        C81873xm r2 = new C81873xm(r8, 5, false);
        AnonymousClass62D r0 = new AnonymousClass62D(r4, new AnonymousClass1VG(r4, new AnonymousClass1VJ()));
        this.A00 = r4;
        this.A03 = r7;
        this.A02 = r6;
        this.A01 = r5;
        this.A05 = r2;
        this.A04 = r0;
    }

    public static void A00(C64423Nx r7, String str, boolean z) {
        SecurityException securityException;
        try {
            if (r7.A02.A01("com.facebook.stella").A03) {
                Intent intent = C36441kJ.A0I("com.whatsapp.action.INSTRUMENTATION_CALLBACK_SERVICE").setPackage("com.facebook.stella");
                try {
                    AnonymousClass62D r0 = r7.A04;
                    String str2 = C19430v1.A0C;
                    List<ResolveInfo> queryIntentServices = r0.A00.queryIntentServices(intent, 0);
                    if (!queryIntentServices.isEmpty()) {
                        if (queryIntentServices.size() <= 1) {
                            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                            if (serviceInfo == null || !str2.equals(serviceInfo.permission)) {
                                securityException = new SecurityException(AnonymousClass000.A0p("Service not protected by permission ", str2, AnonymousClass000.A0u()));
                            }
                        } else {
                            StringBuilder A0u = AnonymousClass000.A0u();
                            A0u.append("Multiple services can handle this intent ");
                            securityException = new SecurityException(AnonymousClass000.A0q(intent.getAction(), A0u));
                        }
                        throw securityException;
                    }
                    if (!r7.A00.A00.bindService(intent, new AnonymousClass3WH(r7, str, z), 1)) {
                        Log.w("CallbackServiceProxy/Failed to bind to stella service");
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("CallbackServiceProxy/Failed to bind to stella service", th);
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Log.w("CallbackServiceProxy/verification failed, dropping event");
    }
}
