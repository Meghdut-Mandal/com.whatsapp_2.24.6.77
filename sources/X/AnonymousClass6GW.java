package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.6GW  reason: invalid class name */
public abstract class AnonymousClass6GW {
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(android.content.Context r7, java.lang.String r8) {
        /*
            java.util.List r0 = X.C113685fw.A00
            boolean r0 = r0.contains(r8)
            r3 = 0
            if (r0 == 0) goto L_0x00d5
            android.content.pm.PackageManager r1 = r7.getPackageManager()     // Catch:{ RuntimeException -> 0x00ca }
            if (r1 == 0) goto L_0x00d5
            r0 = 4160(0x1040, float:5.83E-42)
            android.content.pm.PackageInfo r6 = r1.getPackageInfo(r8, r0)     // Catch:{ RuntimeException -> 0x00ca }
            if (r6 == 0) goto L_0x00d5
            android.content.pm.ApplicationInfo r2 = r6.applicationInfo
            if (r2 == 0) goto L_0x00d5
            boolean r0 = r2.enabled
            if (r0 == 0) goto L_0x00d5
            android.content.pm.Signature[] r0 = r6.signatures
            if (r0 == 0) goto L_0x00d5
            int r1 = r0.length
            r0 = 1
            if (r1 != r0) goto L_0x00d5
            int r1 = r2.flags
            r0 = r1 & 1
            if (r0 != 0) goto L_0x0032
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x0032
            return r3
        L_0x0032:
            java.lang.String r0 = r6.packageName
            java.lang.String r4 = "com.oculus.horizon"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x005a
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x005a
            java.lang.String[] r5 = r6.requestedPermissions
            if (r5 == 0) goto L_0x00d5
            int[] r2 = r6.requestedPermissionsFlags
            if (r2 == 0) goto L_0x00d5
            r1 = 0
        L_0x004b:
            int r0 = r5.length
            if (r1 >= r0) goto L_0x005a
            int r0 = r2.length
            if (r1 >= r0) goto L_0x005a
            r0 = r2[r1]
            r0 = r0 & 2
            if (r0 == 0) goto L_0x00d5
            int r1 = r1 + 1
            goto L_0x004b
        L_0x005a:
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NameNotFoundException -> 0x00d5 }
            if (r2 == 0) goto L_0x00d5
            android.content.pm.Signature[] r0 = r6.signatures
            r0 = r0[r3]
            byte[] r1 = r0.toByteArray()
            int r0 = r1.length
            r2.update(r1, r3, r0)
            byte[] r1 = r2.digest()
            r0 = 11
            java.lang.String r2 = android.util.Base64.encodeToString(r1, r0)     // Catch:{  }
            if (r2 == 0) goto L_0x00d5
            android.content.pm.ApplicationInfo r0 = r7.getApplicationInfo()     // Catch:{ RuntimeException -> 0x007f }
            goto L_0x0089
        L_0x007f:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 == 0) goto L_0x00d4
            r0 = 0
        L_0x0089:
            r7.getApplicationContext()
            if (r0 == 0) goto L_0x0095
            int r0 = r0.flags
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0095
            r3 = 1
        L_0x0095:
            boolean r0 = r4.equals(r8)
            if (r0 == 0) goto L_0x00a7
            if (r3 == 0) goto L_0x00a4
            java.lang.String r0 = "Xo8WBi6jzSxKDVR4drqm84yr9iU"
        L_0x009f:
            boolean r1 = r0.equals(r2)
            return r1
        L_0x00a4:
            java.lang.String r0 = "Sr9mhPKOEwo6NysnYn803dZ3UiY"
            goto L_0x009f
        L_0x00a7:
            java.lang.String r0 = "com.facebook.services.dev"
            boolean r0 = r0.equals(r8)
            r1 = 1
            if (r0 == 0) goto L_0x00bb
            if (r3 == 0) goto L_0x00c8
            java.lang.String r0 = "7XE60X540nq3JXIiFpcVSgM8diY"
        L_0x00b4:
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c8
            return r1
        L_0x00bb:
            java.lang.String r0 = "com.facebook.services"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x00c8
            if (r3 != 0) goto L_0x00c8
            java.lang.String r0 = "e6fv6XFRr-tXEDJmsSANhagF19Y"
            goto L_0x00b4
        L_0x00c8:
            r1 = 0
            return r1
        L_0x00ca:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 == 0) goto L_0x00d4
            return r3
        L_0x00d4:
            throw r1
        L_0x00d5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6GW.A01(android.content.Context, java.lang.String):boolean");
    }

    public static void A00(Context context, Intent intent) {
        PendingIntent A03 = C65743Th.A03(context, C36431kI.A0D().setPackage(context.getPackageName()), 0);
        Bundle A07 = AnonymousClass001.A07();
        A07.putParcelable("auth_pending_intent", A03);
        intent.putExtra("auth_bundle", A07);
    }
}
