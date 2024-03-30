package X;

import android.net.Uri;
import android.util.LruCache;
import java.net.URI;

/* renamed from: X.6Wk  reason: invalid class name and case insensitive filesystem */
public abstract class C133036Wk {
    public static final LruCache A00 = new LruCache(20);
    public static final C194249Ou A01 = new C194249Ou();

    public static Uri A00(C157867eo r4, String str) {
        try {
            return A01(str);
        } catch (SecurityException e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Parse uri <sanitized \"");
            A0u.append(A01.A00(str));
            r4.BoD("UriParser", C36371kC.A0z("\"> failed. Fail open: ", A0u, false), e);
            return null;
        }
    }

    public static boolean A04(String str, String str2) {
        if (str != null && !str.equals("")) {
            return str.equals(str2);
        }
        if (str2 == null || str2.equals("")) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ee, code lost:
        if (r1.contains("_") != false) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f0, code lost:
        r1 = r2.getHost();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f8, code lost:
        if (r3.getHost() != null) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fa, code lost:
        if (r1 == null) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fc, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0103, code lost:
        if (r1.contains("_") != false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0105, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0106, code lost:
        A02(r2, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0109, code lost:
        return r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00d3 */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e6 A[Catch:{ URISyntaxException -> 0x010a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.net.Uri A01(java.lang.String r11) {
        /*
            android.net.Uri r2 = android.net.Uri.parse(r11)
            java.lang.String r5 = r2.getScheme()
            r4 = 1
            if (r5 == 0) goto L_0x003d
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x003d
            int r1 = r5.length()
            r0 = 30
            if (r1 > r0) goto L_0x002b
            r4 = 0
            android.util.LruCache r0 = A00
            java.lang.Object r0 = r0.get(r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x002b
            boolean r3 = r0.booleanValue()
        L_0x0028:
            if (r3 != 0) goto L_0x0078
            goto L_0x003f
        L_0x002b:
            java.lang.String r0 = "([a-zA-Z][a-zA-Z0-9+.-]*)?"
            boolean r3 = r5.matches(r0)
            if (r4 != 0) goto L_0x0028
            android.util.LruCache r1 = A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.put(r5, r0)
            goto L_0x0028
        L_0x003d:
            r3 = 1
            goto L_0x0028
        L_0x003f:
            java.net.URI r2 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0093 }
            r2.<init>(r11)     // Catch:{ URISyntaxException -> 0x0093 }
            boolean r0 = r2.isOpaque()
            if (r0 == 0) goto L_0x006f
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r0 = r2.getScheme()
            android.net.Uri$Builder r1 = r1.scheme(r0)
            java.lang.String r0 = r2.getRawSchemeSpecificPart()
            android.net.Uri$Builder r1 = r1.encodedOpaquePart(r0)
            java.lang.String r0 = r2.getRawFragment()
            android.net.Uri$Builder r0 = r1.encodedFragment(r0)
            android.net.Uri r1 = r0.build()
            A03(r11, r2, r1)
            return r1
        L_0x006f:
            android.net.Uri r1 = X.C90464aC.A0D(r2)
            r0 = 0
            A02(r1, r2, r0)
            return r1
        L_0x0078:
            boolean r0 = r2.isOpaque()
            if (r0 == 0) goto L_0x00b1
            java.lang.String r4 = r2.getScheme()     // Catch:{ URISyntaxException -> 0x0093 }
            java.lang.String r3 = r2.getSchemeSpecificPart()     // Catch:{ URISyntaxException -> 0x0093 }
            java.lang.String r1 = r2.getFragment()     // Catch:{ URISyntaxException -> 0x0093 }
            java.net.URI r0 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0093 }
            r0.<init>(r4, r3, r1)     // Catch:{ URISyntaxException -> 0x0093 }
            A03(r11, r0, r2)
            return r2
        L_0x0093:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Parsing url <sanitized \""
            r1.append(r0)
            X.9Ou r0 = A01
            java.lang.String r0 = r0.A00(r11)
            r1.append(r0)
            java.lang.String r0 = "\"> caused exception"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.SecurityException r1 = new java.lang.SecurityException
            r1.<init>(r0)
            throw r1
        L_0x00b1:
            java.lang.String r4 = r2.getScheme()     // Catch:{ URISyntaxException -> 0x00d3 }
            java.lang.String r5 = r2.getUserInfo()     // Catch:{ URISyntaxException -> 0x00d3 }
            java.lang.String r6 = r2.getHost()     // Catch:{ URISyntaxException -> 0x00d3 }
            int r7 = r2.getPort()     // Catch:{ URISyntaxException -> 0x00d3 }
            java.lang.String r8 = r2.getPath()     // Catch:{ URISyntaxException -> 0x00d3 }
            java.lang.String r9 = r2.getQuery()     // Catch:{ URISyntaxException -> 0x00d3 }
            java.lang.String r10 = r2.getFragment()     // Catch:{ URISyntaxException -> 0x00d3 }
            java.net.URI r3 = new java.net.URI     // Catch:{ URISyntaxException -> 0x00d3 }
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ URISyntaxException -> 0x00d3 }
            goto L_0x00f0
        L_0x00d3:
            java.lang.String r0 = r2.toString()     // Catch:{ URISyntaxException -> 0x010a }
            java.net.URI r3 = new java.net.URI     // Catch:{ URISyntaxException -> 0x010a }
            r3.<init>(r0)     // Catch:{ URISyntaxException -> 0x010a }
            java.lang.String r1 = r2.getHost()     // Catch:{ URISyntaxException -> 0x010a }
            java.lang.String r0 = r3.getHost()     // Catch:{ URISyntaxException -> 0x010a }
            if (r0 != 0) goto L_0x010a
            if (r1 == 0) goto L_0x010a
            java.lang.String r0 = "_"
            boolean r0 = r1.contains(r0)     // Catch:{ URISyntaxException -> 0x010a }
            if (r0 == 0) goto L_0x010a
        L_0x00f0:
            java.lang.String r1 = r2.getHost()
            java.lang.String r0 = r3.getHost()
            if (r0 != 0) goto L_0x0105
            if (r1 == 0) goto L_0x0105
            java.lang.String r0 = "_"
            boolean r1 = r1.contains(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0106
        L_0x0105:
            r0 = 0
        L_0x0106:
            A02(r2, r3, r0)
            return r2
        L_0x010a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Parsing url <sanitized \""
            r1.append(r0)
            X.9Ou r0 = A01
            java.lang.String r0 = r0.A00(r11)
            r1.append(r0)
            java.lang.String r0 = "\"> caused exception"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.SecurityException r1 = new java.lang.SecurityException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133036Wk.A01(java.lang.String):android.net.Uri");
    }

    public static void A02(Uri uri, URI uri2, boolean z) {
        boolean A04 = A04(uri2.getScheme(), uri.getScheme());
        boolean A042 = A04(uri2.getAuthority(), uri.getAuthority());
        boolean A043 = A04(uri2.getPath(), uri.getPath());
        if (!A04 || !A042 || !A043) {
            String str = "";
            if (!A04) {
                StringBuilder A0v = AnonymousClass000.A0v(str);
                A0v.append("javaUri scheme: \"");
                A0v.append(uri2.getScheme());
                A0v.append("\". androidUri scheme: \"");
                str = AnonymousClass000.A0p(uri.getScheme(), "\".", A0v);
            }
            if (!z && !A042) {
                StringBuilder A0v2 = AnonymousClass000.A0v(str);
                A0v2.append("javaUri authority: \"");
                A0v2.append(uri2.getAuthority());
                A0v2.append("\". androidUri authority: \"");
                str = AnonymousClass000.A0p(uri.getAuthority(), "\".", A0v2);
            }
            if (!A043) {
                StringBuilder A0v3 = AnonymousClass000.A0v(str);
                A0v3.append("javaUri path: \"");
                A0v3.append(uri2.getPath());
                A0v3.append("\". androidUri path: \"");
                str = AnonymousClass000.A0p(uri.getPath(), "\".", A0v3);
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            String A0c = C90494aF.A0c(uri2, "java uri <sanitized \"", A0u);
            C194249Ou r1 = A01;
            A0u.append(r1.A00(A0c));
            A0u.append(r1.A00(C90494aF.A0c(uri, "\"> not equal to android uri <sanitized \"", A0u)));
            A0u.append("\">. Debug info ");
            A0u.append(str);
            throw new SecurityException(AnonymousClass000.A0q(".", A0u));
        }
    }

    public static void A03(String str, URI uri, Uri uri2) {
        boolean A04 = A04(uri.getScheme(), uri2.getScheme());
        boolean A042 = A04(uri.getSchemeSpecificPart(), uri2.getSchemeSpecificPart());
        if (!A04 || !A042) {
            StringBuilder A0u = AnonymousClass000.A0u();
            String A0c = C90494aF.A0c(uri, "java uri <sanitized \"", A0u);
            C194249Ou r1 = A01;
            A0u.append(r1.A00(A0c));
            A0u.append(r1.A00(C90494aF.A0c(uri2, "\"> not equal to android uri <sanitized \"", A0u)));
            A0u.append("\"> from original <sanitized \"");
            A0u.append(r1.A00(str));
            throw new SecurityException(AnonymousClass000.A0q("\">", A0u));
        }
    }
}
