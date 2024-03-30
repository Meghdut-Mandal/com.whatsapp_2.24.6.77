package X;

/* renamed from: X.1Hv  reason: invalid class name and case insensitive filesystem */
public final class C25831Hv {
    public final C25841Hw A00;
    public final C19460v5 A01;
    public final C19630wG A02;

    public C25831Hv(C19460v5 r2, C19630wG r3, C25841Hw r4) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 3);
        this.A02 = r3;
        this.A00 = r4;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0079, code lost:
        if (r2.startsWith("OPD") != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b9, code lost:
        if (r2.startsWith("SM-A320") != false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (java.lang.Boolean.valueOf(r1) == null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0157, code lost:
        if (r1 >= 1801) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        if (r0 != false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C26381Jy A00() {
        /*
            r6 = this;
            X.1Hw r2 = r6.A00
            X.0v0 r4 = r2.A02
            X.005 r1 = r4.A00
            java.lang.Object r0 = r1.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r3 = "is_chrome_device_cached"
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0025
            java.lang.Object r1 = r1.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            r0 = 0
            boolean r1 = r1.getBoolean(r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 != 0) goto L_0x0044
        L_0x0025:
            android.content.pm.PackageManager r1 = r2.A01     // Catch:{ RuntimeException -> 0x0049 }
            java.lang.String r0 = "org.chromium.arc"
            boolean r0 = r1.hasSystemFeature(r0)     // Catch:{ RuntimeException -> 0x0049 }
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = "org.chromium.arc.device_management"
            boolean r0 = r1.hasSystemFeature(r0)     // Catch:{ RuntimeException -> 0x0049 }
            r1 = 0
            if (r0 == 0) goto L_0x0039
        L_0x0038:
            r1 = 1
        L_0x0039:
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r4)     // Catch:{ RuntimeException -> 0x0049 }
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r3, r1)     // Catch:{ RuntimeException -> 0x0049 }
            r0.apply()     // Catch:{ RuntimeException -> 0x0049 }
        L_0x0044:
            if (r1 == 0) goto L_0x0057
            X.1Jy r0 = X.C26381Jy.DESKTOP
            return r0
        L_0x0049:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 == 0) goto L_0x015e
            java.lang.String r0 = "DeviceUtils/isChromeDevice/DeadObjectException"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0057:
            boolean r0 = r2.A01()
            if (r0 == 0) goto L_0x0060
            X.1Jy r0 = X.C26381Jy.FOLDABLE
            return r0
        L_0x0060:
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "oneplus"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x007e
            java.lang.String r2 = android.os.Build.MODEL
            X.AnonymousClass00C.A09(r2)
            java.lang.String r1 = "OPD"
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            boolean r0 = r2.startsWith(r1)
            if (r0 == 0) goto L_0x00bb
        L_0x007b:
            X.1Jy r0 = X.C26381Jy.TABLET
            return r0
        L_0x007e:
            java.lang.String r0 = "samsung"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x00be
            java.lang.String r2 = android.os.Build.MODEL
            X.AnonymousClass00C.A09(r2)
            java.lang.String r1 = "GT-I920"
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            boolean r0 = r2.startsWith(r1)
            if (r0 != 0) goto L_0x00bb
            java.lang.String r1 = "SM-G965"
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            boolean r0 = r2.startsWith(r1)
            if (r0 != 0) goto L_0x00bb
            java.lang.String r1 = "SM-G988"
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            boolean r0 = r2.startsWith(r1)
            if (r0 != 0) goto L_0x00bb
            java.lang.String r1 = "SM-A320"
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            boolean r0 = r2.startsWith(r1)
            if (r0 == 0) goto L_0x00be
        L_0x00bb:
            X.1Jy r0 = X.C26381Jy.MOBILE
            return r0
        L_0x00be:
            java.lang.String r0 = "huawei"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x00d2
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "lya-al00"
            if (r1 == 0) goto L_0x00d2
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00bb
        L_0x00d2:
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "mar-al00"
            if (r1 == 0) goto L_0x00de
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00bb
        L_0x00de:
            java.lang.String r0 = "vog-tl00"
            if (r1 == 0) goto L_0x00e8
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00bb
        L_0x00e8:
            java.lang.String r0 = "vog-al00"
            if (r1 == 0) goto L_0x00f2
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00bb
        L_0x00f2:
            java.lang.String r0 = "jsn-al00a"
            if (r1 == 0) goto L_0x00fd
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00fd
            goto L_0x00bb
        L_0x00fd:
            java.lang.String r0 = "moto g(100)"
            if (r1 == 0) goto L_0x0108
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0108
            goto L_0x00bb
        L_0x0108:
            java.lang.String r0 = "asus_z01qd"
            if (r1 == 0) goto L_0x0113
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0113
            goto L_0x00bb
        L_0x0113:
            X.0wG r0 = r6.A02
            android.content.Context r5 = r0.A00
            X.AnonymousClass00C.A08(r5)
            X.1Lw r4 = X.C25961Ii.A02(r5)
            if (r4 == 0) goto L_0x015b
            android.content.Context r0 = X.C25981Ik.A00(r5)
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r3 = r0.getConfiguration()
            int r0 = r3.screenLayout
            r2 = r0 & 15
            r0 = 2
            if (r2 > r0) goto L_0x013a
            int r1 = r4.A00
            r0 = 700(0x2bc, float:9.81E-43)
            if (r1 > r0) goto L_0x013a
            goto L_0x00bb
        L_0x013a:
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            java.lang.String r0 = "android.hardware.telephony"
            boolean r0 = r1.hasSystemFeature(r0)
            if (r0 == 0) goto L_0x007b
            int r1 = r3.smallestScreenWidthDp
            r0 = 600(0x258, float:8.41E-43)
            if (r1 >= r0) goto L_0x007b
            r0 = 3
            if (r2 < r0) goto L_0x015b
            int r1 = r4.A00
            r0 = 900(0x384, float:1.261E-42)
            if (r0 > r1) goto L_0x015b
            r0 = 1801(0x709, float:2.524E-42)
            if (r1 >= r0) goto L_0x015b
            goto L_0x007b
        L_0x015b:
            X.1Jy r0 = X.C26381Jy.AMBIGUOUS
            return r0
        L_0x015e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25831Hv.A00():X.1Jy");
    }
}
