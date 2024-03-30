package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0Be  reason: invalid class name and case insensitive filesystem */
public abstract class C02620Be {
    public static boolean A00;
    public static boolean A01;
    public static final AtomicBoolean A02 = new AtomicBoolean();
    public static final AtomicBoolean A03 = new AtomicBoolean();

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a8, code lost:
        if (r0.booleanValue() != false) goto L_0x00aa;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(android.content.Context r10, int r11) {
        /*
            java.lang.String r3 = "GooglePlayServicesUtil"
            android.content.res.Resources r1 = r10.getResources()     // Catch:{ all -> 0x000d }
            r0 = 2131896419(0x7f122863, float:1.9427699E38)
            r1.getString(r0)     // Catch:{ all -> 0x000d }
            goto L_0x0012
        L_0x000d:
            java.lang.String r0 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r3, r0)
        L_0x0012:
            java.lang.String r0 = r10.getPackageName()
            java.lang.String r8 = "com.google.android.gms"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0077
            java.util.concurrent.atomic.AtomicBoolean r0 = A03
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0077
            java.lang.Object r4 = X.C02630Bf.A02
            monitor-enter(r4)
            boolean r0 = X.C02630Bf.A01     // Catch:{ all -> 0x0074 }
            if (r0 != 0) goto L_0x005e
            r0 = 1
            X.C02630Bf.A01 = r0     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = r10.getPackageName()     // Catch:{ all -> 0x0074 }
            X.0Bh r0 = X.C02640Bg.A00(r10)     // Catch:{ all -> 0x0074 }
            r1 = 128(0x80, float:1.794E-43)
            android.content.Context r0 = r0.A00     // Catch:{ NameNotFoundException -> 0x0056 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0056 }
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r2, r1)     // Catch:{ NameNotFoundException -> 0x0056 }
            android.os.Bundle r1 = r0.metaData     // Catch:{ NameNotFoundException -> 0x0056 }
            if (r1 == 0) goto L_0x005e
            java.lang.String r0 = "com.google.app.id"
            r1.getString(r0)     // Catch:{ NameNotFoundException -> 0x0056 }
            java.lang.String r0 = "com.google.android.gms.version"
            int r0 = r1.getInt(r0)     // Catch:{ NameNotFoundException -> 0x0056 }
            X.C02630Bf.A00 = r0     // Catch:{ NameNotFoundException -> 0x0056 }
            goto L_0x005e
        L_0x0056:
            r2 = move-exception
            java.lang.String r1 = "MetadataValueReader"
            java.lang.String r0 = "This should never happen."
            android.util.Log.wtf(r1, r0, r2)     // Catch:{ all -> 0x0074 }
        L_0x005e:
            monitor-exit(r4)     // Catch:{ all -> 0x0074 }
            int r1 = X.C02630Bf.A00
            if (r1 == 0) goto L_0x006e
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            if (r1 == r0) goto L_0x0077
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r0 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r0.<init>(r1)
            throw r0
        L_0x006e:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r0 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r0.<init>()
            throw r0
        L_0x0074:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0074 }
            throw r0
        L_0x0077:
            boolean r0 = X.C02660Bi.A00(r10)
            r4 = 1
            r7 = 0
            if (r0 != 0) goto L_0x00aa
            java.lang.Boolean r0 = X.C02660Bi.A02
            if (r0 != 0) goto L_0x00a3
            android.content.pm.PackageManager r1 = r10.getPackageManager()
            java.lang.String r0 = "android.hardware.type.iot"
            boolean r0 = r1.hasSystemFeature(r0)
            r2 = 1
            if (r0 != 0) goto L_0x009d
            android.content.pm.PackageManager r1 = r10.getPackageManager()
            java.lang.String r0 = "android.hardware.type.embedded"
            boolean r0 = r1.hasSystemFeature(r0)
            if (r0 != 0) goto L_0x009d
            r2 = 0
        L_0x009d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            X.C02660Bi.A02 = r0
        L_0x00a3:
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 == 0) goto L_0x00ab
        L_0x00aa:
            r2 = 0
        L_0x00ab:
            r0 = 0
            if (r11 < 0) goto L_0x00af
            r0 = 1
        L_0x00af:
            X.AnonymousClass006.A06(r0)
            java.lang.String r5 = r10.getPackageName()
            android.content.pm.PackageManager r6 = r10.getPackageManager()
            if (r2 == 0) goto L_0x00d3
            java.lang.String r1 = "com.android.vending"
            r0 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r1 = r6.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x00c5 }
            goto L_0x00d4
        L_0x00c5:
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = " requires the Google Play Store, but it is missing."
            java.lang.String r0 = r1.concat(r0)
            android.util.Log.w(r3, r0)
            goto L_0x00f0
        L_0x00d3:
            r1 = 0
        L_0x00d4:
            r0 = 64
            android.content.pm.PackageInfo r9 = r6.getPackageInfo(r8, r0)     // Catch:{ NameNotFoundException -> 0x0170 }
            X.C07480Xv.A00(r10)
            boolean r0 = X.C07480Xv.A01(r9, r4)
            if (r0 != 0) goto L_0x00f3
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = " requires Google Play services, but their signature is invalid."
        L_0x00e9:
            java.lang.String r0 = r1.concat(r0)
            android.util.Log.w(r3, r0)
        L_0x00f0:
            r4 = 9
            return r4
        L_0x00f3:
            if (r2 == 0) goto L_0x011c
            X.AnonymousClass006.A01(r1)
            boolean r0 = X.C07480Xv.A01(r1, r4)
            if (r0 != 0) goto L_0x0105
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = " requires Google Play Store, but its signature is invalid."
            goto L_0x00e9
        L_0x0105:
            if (r1 == 0) goto L_0x011c
            android.content.pm.Signature[] r0 = r1.signatures
            r1 = r0[r7]
            android.content.pm.Signature[] r0 = r9.signatures
            r0 = r0[r7]
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x011c
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            goto L_0x00e9
        L_0x011c:
            int r2 = r9.versionCode
            r1 = -1
            if (r2 != r1) goto L_0x014e
            r0 = -1
        L_0x0122:
            if (r11 == r1) goto L_0x0126
            int r1 = r11 / 1000
        L_0x0126:
            if (r0 >= r1) goto L_0x0151
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Google Play services out of date for "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ".  Requires "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = " but found "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r3, r0)
            r4 = 2
            return r4
        L_0x014e:
            int r0 = r2 / 1000
            goto L_0x0122
        L_0x0151:
            android.content.pm.ApplicationInfo r0 = r9.applicationInfo
            if (r0 != 0) goto L_0x0169
            android.content.pm.ApplicationInfo r0 = r6.getApplicationInfo(r8, r7)     // Catch:{ NameNotFoundException -> 0x015a }
            goto L_0x0169
        L_0x015a:
            r2 = move-exception
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r0 = r1.concat(r0)
            android.util.Log.wtf(r3, r0, r2)
            return r4
        L_0x0169:
            boolean r0 = r0.enabled
            if (r0 != 0) goto L_0x016f
            r4 = 3
            return r4
        L_0x016f:
            return r7
        L_0x0170:
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = " requires Google Play services, but they are missing."
            java.lang.String r0 = r1.concat(r0)
            android.util.Log.w(r3, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02620Be.A00(android.content.Context, int):int");
    }

    @Deprecated
    public static void A01(Context context, int i) {
        C02600Bc r1 = C02600Bc.A00;
        int A022 = r1.A02(context, i);
        if (A022 != 0) {
            Intent A032 = r1.A03(context, "e", A022);
            StringBuilder sb = new StringBuilder();
            sb.append("GooglePlayServices not available due to error ");
            sb.append(A022);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (A032 == null) {
                throw new AnonymousClass0O8(A022);
            }
            throw new C04030Iz(A032, "Google Play Services not available", A022);
        }
    }

    public static boolean A02(Context context) {
        if (!A00) {
            try {
                PackageInfo packageInfo = C02640Bg.A00(context).A00.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                C07480Xv.A00(context);
                if (packageInfo == null || C07480Xv.A01(packageInfo, false) || !C07480Xv.A01(packageInfo, true)) {
                    A01 = false;
                } else {
                    A01 = true;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
            } catch (Throwable th) {
                A00 = true;
                throw th;
            }
            A00 = true;
        }
        if (A01 || !PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(Build.TYPE)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(android.content.Context r5) {
        /*
            java.lang.String r4 = "com.google.android.gms"
            r3 = 1
            r2 = 0
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch:{ Exception -> 0x0038 }
            android.content.pm.PackageInstaller r0 = r0.getPackageInstaller()     // Catch:{ Exception -> 0x0038 }
            java.util.List r0 = r0.getAllSessions()     // Catch:{ Exception -> 0x0038 }
            java.util.Iterator r1 = r0.iterator()
        L_0x0014:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.Object r0 = r1.next()
            android.content.pm.PackageInstaller$SessionInfo r0 = (android.content.pm.PackageInstaller.SessionInfo) r0
            java.lang.String r0 = r0.getAppPackageName()
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0014
            return r3
        L_0x002b:
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            r0 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo(r4, r0)     // Catch:{  }
            boolean r0 = r0.enabled     // Catch:{  }
            return r0
        L_0x0038:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02620Be.A03(android.content.Context):boolean");
    }
}
