package X;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* renamed from: X.63H  reason: invalid class name */
public final class AnonymousClass63H {
    public final ApplicationInfo A00;
    public final String A01;
    public final String A02;
    public final PackageInfo A03;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r1 = r5.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C128106Ax A00() {
        /*
            r5 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 0
            r2 = 1
            r4 = 0
            r0 = 28
            if (r1 < r0) goto L_0x003c
            android.content.pm.PackageInfo r1 = r5.A03
            android.content.pm.SigningInfo r0 = r1.signingInfo
            if (r0 == 0) goto L_0x003c
            boolean r3 = r0.hasMultipleSigners()
            android.content.pm.SigningInfo r0 = r1.signingInfo
            boolean r2 = r0.hasPastSigningCertificates()
            android.content.pm.SigningInfo r0 = r1.signingInfo
            if (r3 == 0) goto L_0x0037
            android.content.pm.Signature[] r0 = r0.getApkContentsSigners()
        L_0x0021:
            if (r0 == 0) goto L_0x005c
            java.util.List r0 = X.C90494aF.A0j(r0)
            java.util.List r1 = X.C007103b.A0V(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x005c
            X.6Ax r0 = new X.6Ax
            r0.<init>(r1, r3, r2)
            return r0
        L_0x0037:
            android.content.pm.Signature[] r0 = r0.getSigningCertificateHistory()
            goto L_0x0021
        L_0x003c:
            android.content.pm.PackageInfo r0 = r5.A03
            android.content.pm.Signature[] r0 = r0.signatures
            if (r0 == 0) goto L_0x005c
            java.util.List r0 = X.C90494aF.A0j(r0)
            java.util.List r1 = X.C007103b.A0V(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x005c
            int r0 = r1.size()
            if (r0 > r2) goto L_0x0057
            r2 = 0
        L_0x0057:
            X.6Ax r4 = new X.6Ax
            r4.<init>(r1, r2, r3)
        L_0x005c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass63H.A00():X.6Ax");
    }

    public AnonymousClass63H(PackageInfo packageInfo) {
        this.A03 = packageInfo;
        String str = packageInfo.packageName;
        this.A01 = str == null ? "" : str;
        String str2 = packageInfo.versionName;
        this.A02 = str2 == null ? "" : str2;
        this.A00 = packageInfo.applicationInfo;
    }
}
