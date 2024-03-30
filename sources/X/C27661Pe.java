package X;

/* renamed from: X.1Pe  reason: invalid class name and case insensitive filesystem */
public final class C27661Pe {
    public final C19630wG A00;
    public final C25841Hw A01;
    public final AnonymousClass13J A02;

    public C27661Pe(C19630wG r2, C25841Hw r3, AnonymousClass13J r4) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r4, 3);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        if (r2.startsWith("SM-A320") != false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ec, code lost:
        if (r1 >= 1801) goto L_0x00f1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C51462nr A00() {
        /*
            r5 = this;
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "oneplus"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L_0x0047
            java.lang.String r0 = "samsung"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x004a
            java.lang.String r2 = android.os.Build.MODEL
            X.AnonymousClass00C.A09(r2)
            java.lang.String r1 = "GT-I920"
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            boolean r0 = r2.startsWith(r1)
            if (r0 != 0) goto L_0x0047
            java.lang.String r1 = "SM-G965"
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            boolean r0 = r2.startsWith(r1)
            if (r0 != 0) goto L_0x0047
            java.lang.String r1 = "SM-G988"
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            boolean r0 = r2.startsWith(r1)
            if (r0 != 0) goto L_0x0047
            java.lang.String r1 = "SM-A320"
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            boolean r0 = r2.startsWith(r1)
            if (r0 == 0) goto L_0x004a
        L_0x0047:
            X.2nr r0 = X.C51462nr.PHONE
            return r0
        L_0x004a:
            java.lang.String r0 = "huawei"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x005e
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "lya-al00"
            if (r1 == 0) goto L_0x005e
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0047
        L_0x005e:
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "mar-al00"
            if (r1 == 0) goto L_0x006a
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0047
        L_0x006a:
            java.lang.String r0 = "vog-tl00"
            if (r1 == 0) goto L_0x0074
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0047
        L_0x0074:
            java.lang.String r0 = "vog-al00"
            if (r1 == 0) goto L_0x007e
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0047
        L_0x007e:
            java.lang.String r0 = "jsn-al00a"
            if (r1 == 0) goto L_0x0089
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0089
            goto L_0x0047
        L_0x0089:
            java.lang.String r0 = "moto g(100)"
            if (r1 == 0) goto L_0x0094
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0094
            goto L_0x0047
        L_0x0094:
            java.lang.String r0 = "asus_z01qd"
            if (r1 == 0) goto L_0x009f
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x009f
            goto L_0x0047
        L_0x009f:
            X.1Hw r0 = r5.A01
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x00f1
            X.0wG r0 = r5.A00
            android.content.Context r2 = r0.A00
            X.AnonymousClass00C.A08(r2)
            android.content.pm.PackageManager r1 = r2.getPackageManager()
            java.lang.String r0 = "android.hardware.telephony"
            boolean r0 = r1.hasSystemFeature(r0)
            if (r0 == 0) goto L_0x00ee
            X.1Lw r4 = X.C25961Ii.A02(r2)
            if (r4 == 0) goto L_0x00f1
            android.content.Context r0 = X.C25981Ik.A00(r2)
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r3 = r0.getConfiguration()
            int r0 = r3.screenLayout
            r2 = r0 & 15
            r0 = 2
            if (r2 > r0) goto L_0x00db
            int r1 = r4.A00
            r0 = 700(0x2bc, float:9.81E-43)
            if (r1 > r0) goto L_0x00db
            goto L_0x0047
        L_0x00db:
            int r1 = r3.smallestScreenWidthDp
            r0 = 600(0x258, float:8.41E-43)
            if (r1 >= r0) goto L_0x00ee
            r0 = 3
            if (r2 < r0) goto L_0x00f1
            int r1 = r4.A00
            r0 = 900(0x384, float:1.261E-42)
            if (r0 > r1) goto L_0x00f1
            r0 = 1801(0x709, float:2.524E-42)
            if (r1 >= r0) goto L_0x00f1
        L_0x00ee:
            X.2nr r0 = X.C51462nr.TABLET
            return r0
        L_0x00f1:
            X.2nr r0 = X.C51462nr.AMBIGUOUS
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27661Pe.A00():X.2nr");
    }

    public final boolean A01() {
        C51462nr A002 = A00();
        if (A002 == C51462nr.PHONE || A002 == C51462nr.AMBIGUOUS) {
            return true;
        }
        return false;
    }
}
