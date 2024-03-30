package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: X.6Is  reason: invalid class name and case insensitive filesystem */
public abstract class C129856Is {
    public static Context A00;
    public static C161387mk A01;

    public static Context A00(Context context) {
        Context context2 = A00;
        if (context2 == null) {
            try {
                context2 = AnonymousClass0Z3.A04(context, AnonymousClass0Z3.A09, "com.google.android.gms.maps_dynamite").A00;
            } catch (Exception e) {
                Log.e("zzca", "Failed to load maps module, use legacy", e);
                boolean z = C02620Be.A00;
                try {
                    context2 = context.createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    context2 = null;
                }
            }
            A00 = context2;
        }
        return context2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x006b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C161387mk A01(android.content.Context r3) {
        /*
            X.AnonymousClass006.A01(r3)
            X.7mk r0 = A01
            if (r0 != 0) goto L_0x00a0
            r0 = 13400000(0xcc77c0, float:1.87774E-38)
            int r1 = X.C02620Be.A00(r3, r0)
            if (r1 != 0) goto L_0x0098
            java.lang.String r1 = "zzca"
            java.lang.String r0 = "Making Creator dynamically"
            android.util.Log.i(r1, r0)
            android.content.Context r0 = A00(r3)
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.lang.String r0 = "com.google.android.gms.maps.internal.CreatorImpl"
            X.AnonymousClass006.A01(r1)     // Catch:{ ClassNotFoundException -> 0x0091 }
            java.lang.Class r0 = r1.loadClass(r0)     // Catch:{ ClassNotFoundException -> 0x0091 }
            java.lang.Object r1 = r0.newInstance()     // Catch:{ InstantiationException -> 0x007e, IllegalAccessException -> 0x006b }
            android.os.IBinder r1 = (android.os.IBinder) r1
            if (r1 != 0) goto L_0x0034
            r2 = 0
        L_0x0031:
            A01 = r2
            goto L_0x0047
        L_0x0034:
            java.lang.String r0 = "com.google.android.gms.maps.internal.ICreator"
            android.os.IInterface r2 = r1.queryLocalInterface(r0)
            boolean r0 = r2 instanceof X.C161387mk
            if (r0 == 0) goto L_0x0041
            X.7mk r2 = (X.C161387mk) r2
            goto L_0x0031
        L_0x0041:
            X.4sU r2 = new X.4sU
            r2.<init>(r1)
            goto L_0x0031
        L_0x0047:
            android.content.Context r0 = A00(r3)     // Catch:{ RemoteException -> 0x0065 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ RemoteException -> 0x0065 }
            X.0LR r1 = new X.0LR     // Catch:{ RemoteException -> 0x0065 }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x0065 }
            X.6a2 r2 = (X.C133816a2) r2     // Catch:{ RemoteException -> 0x0065 }
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            android.os.Parcel r1 = X.AnonymousClass6UO.A00(r1, r2)     // Catch:{ RemoteException -> 0x0065 }
            r1.writeInt(r0)     // Catch:{ RemoteException -> 0x0065 }
            r0 = 6
            r2.A03(r0, r1)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x009e
        L_0x0065:
            r0 = move-exception
            X.78K r0 = X.AnonymousClass78K.A00(r0)
            throw r0
        L_0x006b:
            java.lang.String r0 = r0.getName()     // Catch:{ ClassNotFoundException -> 0x0091 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ ClassNotFoundException -> 0x0091 }
            java.lang.String r0 = "Unable to call the default constructor of "
            java.lang.String r0 = X.C90484aE.A0n(r1, r0)     // Catch:{ ClassNotFoundException -> 0x0091 }
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ ClassNotFoundException -> 0x0091 }
            goto L_0x0090
        L_0x007e:
            java.lang.String r0 = r0.getName()     // Catch:{ ClassNotFoundException -> 0x0091 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ ClassNotFoundException -> 0x0091 }
            java.lang.String r0 = "Unable to instantiate the dynamic class "
            java.lang.String r0 = X.C90484aE.A0n(r1, r0)     // Catch:{ ClassNotFoundException -> 0x0091 }
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ ClassNotFoundException -> 0x0091 }
        L_0x0090:
            throw r0     // Catch:{ ClassNotFoundException -> 0x0091 }
        L_0x0091:
            java.lang.String r0 = "Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0098:
            X.0O8 r0 = new X.0O8
            r0.<init>(r1)
            throw r0
        L_0x009e:
            X.7mk r0 = A01
        L_0x00a0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C129856Is.A01(android.content.Context):X.7mk");
    }
}
