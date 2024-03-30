package X;

import android.net.Uri;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: X.3Lk  reason: invalid class name and case insensitive filesystem */
public abstract class C63783Lk {
    public static String A00(AnonymousClass1DU r4, String str) {
        try {
            String host = new URL(str).getHost();
            C36321k7.A0w(r4, str);
            Uri parse = Uri.parse(AnonymousClass1DU.A01(str));
            AnonymousClass00C.A0B(parse);
            boolean z = true;
            if (!AnonymousClass3TO.A03(parse, AnonymousClass3TO.A01)) {
                if (!AnonymousClass3TO.A03(parse, AnonymousClass3TO.A00) || !"1".equalsIgnoreCase(parse.getQueryParameter("fw"))) {
                    z = false;
                }
            }
            if (!z) {
                return host;
            }
            StringBuilder A0v = AnonymousClass000.A0v(host);
            A0v.append("/watch");
            return A0v.toString();
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0033, code lost:
        r0 = r5.A03.A02.A0J((r2 = r4.A0a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r0 = r4.A0V;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(X.AnonymousClass3T1 r4, X.AnonymousClass1SV r5, boolean r6) {
        /*
            r3 = 0
            if (r6 == 0) goto L_0x0043
            X.3BG r0 = r4.A0V
            r1 = 1
            if (r0 == 0) goto L_0x000d
            int r0 = r0.A01
            if (r0 != r1) goto L_0x000d
        L_0x000c:
            return r1
        L_0x000d:
            X.3L1 r2 = r4.A0a
            if (r2 == 0) goto L_0x0043
            java.lang.String r0 = r2.A04
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = r2.A07
            if (r0 == 0) goto L_0x0043
        L_0x0019:
            int r0 = r2.A01
            if (r0 <= 0) goto L_0x0043
            int r0 = r2.A00
            if (r0 <= 0) goto L_0x0043
            boolean r0 = r2.A09
            if (r0 != 0) goto L_0x002f
            X.3Qa r0 = r4.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x000c
            boolean r0 = r4.A1Y
            if (r0 != 0) goto L_0x000c
        L_0x002f:
            boolean r0 = r4 instanceof X.AnonymousClass2bV
            if (r0 == 0) goto L_0x0043
            X.1SX r0 = r5.A03
            X.0y0 r0 = r0.A02
            java.io.File r0 = r0.A0J(r2)
            if (r0 == 0) goto L_0x0043
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x000c
        L_0x0043:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63783Lk.A01(X.3T1, X.1SV, boolean):boolean");
    }
}
