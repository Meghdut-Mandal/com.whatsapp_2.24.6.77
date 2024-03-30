package X;

import android.net.Uri;

/* renamed from: X.3N4  reason: invalid class name */
public class AnonymousClass3N4 {
    public final Uri A00;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r0 != false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass3N4 A00(java.lang.String r5) {
        /*
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = r5.toLowerCase(r2)
            java.lang.String r3 = "https://wa.me/"
            boolean r0 = r1.startsWith(r3)
            if (r0 != 0) goto L_0x0030
            java.lang.String r0 = "http://wa.me/"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0030
            java.lang.String r0 = "wa.me/"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0030
            java.lang.String r0 = "/"
            boolean r0 = r5.startsWith(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            if (r0 == 0) goto L_0x00a8
            java.lang.String r0 = "https://wa.me"
        L_0x002c:
            java.lang.String r5 = X.AnonymousClass000.A0p(r0, r5, r1)
        L_0x0030:
            java.lang.String r1 = r5.toLowerCase(r2)
            boolean r0 = r1.startsWith(r3)
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "http://wa.me/"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "wa.me/"
            boolean r0 = r1.startsWith(r0)
            r1 = 0
            if (r0 == 0) goto L_0x004c
        L_0x004b:
            r1 = 1
        L_0x004c:
            r4 = 0
            if (r1 == 0) goto L_0x009e
            java.lang.String r1 = "wa.me"
            boolean r0 = r5.startsWith(r1)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = "https://wa.me"
            java.lang.String r5 = r5.replace(r1, r0)
        L_0x005d:
            android.net.Uri r3 = android.net.Uri.parse(r5)
            java.lang.String r0 = r3.getHost()
            if (r0 != 0) goto L_0x009f
            r2 = r4
        L_0x0068:
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L_0x009e
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r0 = "https"
            android.net.Uri$Builder r0 = r1.scheme(r0)
            android.net.Uri$Builder r1 = r0.encodedAuthority(r2)
            java.lang.String r0 = r3.getEncodedPath()
            android.net.Uri$Builder r1 = r1.encodedPath(r0)
            java.lang.String r0 = r3.getEncodedQuery()
            android.net.Uri$Builder r1 = r1.encodedQuery(r0)
            java.lang.String r0 = r3.getEncodedFragment()
            android.net.Uri$Builder r0 = r1.encodedFragment(r0)
            android.net.Uri r0 = r0.build()
            X.3N4 r4 = new X.3N4
            r4.<init>(r0)
        L_0x009e:
            return r4
        L_0x009f:
            java.lang.String r0 = r3.getHost()
            java.lang.String r2 = r0.toLowerCase(r2)
            goto L_0x0068
        L_0x00a8:
            r0 = r3
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3N4.A00(java.lang.String):X.3N4");
    }

    public AnonymousClass3N4(Uri uri) {
        this.A00 = uri;
    }
}
