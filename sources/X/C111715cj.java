package X;

/* renamed from: X.5cj  reason: invalid class name and case insensitive filesystem */
public abstract class C111715cj {
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r11, android.content.Intent r12) {
        /*
            java.lang.ClassLoader r0 = r11.getClassLoader()
            r12.setExtrasClassLoader(r0)
            android.os.Bundle r3 = r12.getExtras()
            if (r3 != 0) goto L_0x0011
            android.os.Bundle r3 = X.AnonymousClass001.A07()
        L_0x0011:
            java.lang.ClassLoader r0 = r11.getClassLoader()
            r3.setClassLoader(r0)
            r4 = 0
            r10 = 0
            android.content.pm.PackageManager r1 = r11.getPackageManager()     // Catch:{ NameNotFoundException | RuntimeException -> 0x002a }
            if (r1 == 0) goto L_0x002a
            java.lang.String r0 = r11.getPackageName()     // Catch:{ NameNotFoundException | RuntimeException -> 0x002a }
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r4)     // Catch:{ NameNotFoundException | RuntimeException -> 0x002a }
            java.lang.String r10 = r0.versionName     // Catch:{ NameNotFoundException | RuntimeException -> 0x002a }
        L_0x002a:
            long r8 = java.lang.System.currentTimeMillis()
            long r6 = android.os.SystemClock.elapsedRealtime()
            org.json.JSONObject r2 = X.C36441kJ.A1B()
            r5 = 0
            java.lang.String r1 = "t"
            java.lang.String r0 = java.lang.Long.toString(r8)     // Catch:{ JSONException -> 0x0060 }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r1 = "r"
            java.lang.String r0 = java.lang.Long.toString(r6)     // Catch:{ JSONException -> 0x0060 }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0060 }
            if (r10 == 0) goto L_0x0050
            java.lang.String r0 = "v"
            r2.put(r0, r10)     // Catch:{ JSONException -> 0x0060 }
        L_0x0050:
            java.lang.String r1 = r2.toString()     // Catch:{  }
            java.lang.String r0 = "UTF-8"
            byte[] r1 = r1.getBytes(r0)     // Catch:{  }
            r0 = 11
            java.lang.String r5 = android.util.Base64.encodeToString(r1, r0)     // Catch:{  }
        L_0x0060:
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = "com.facebook.invalid_class.f4c3b00c"
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r11, r1)
            android.content.Intent r0 = r2.setComponent(r0)
            android.content.Intent r1 = r0.setAction(r5)
            r0 = 1073741824(0x40000000, float:2.0)
            android.app.PendingIntent r1 = X.C65743Th.A00(r11, r4, r1, r0)
            java.lang.String r0 = "_ci_"
            r3.putParcelable(r0, r1)
            r12.putExtras(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111715cj.A00(android.content.Context, android.content.Intent):void");
    }
}
