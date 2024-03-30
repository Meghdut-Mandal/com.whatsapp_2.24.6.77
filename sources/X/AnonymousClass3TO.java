package X;

import android.net.Uri;
import com.whatsapp.R;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.3TO  reason: invalid class name */
public abstract class AnonymousClass3TO {
    public static final List A00;
    public static final List A01;
    public static final List A02 = C36381kD.A13("instagram.com", "www.instagram.com");
    public static final List A03 = C36381kD.A13("lassovideos.com", "www.lassovideos.com");
    public static final List A04 = C36381kD.A13("netflix.com", "www.netflix.com");
    public static final List A05 = C36381kD.A13("sharechat.com", "www.sharechat.com");
    public static final List A06 = C36381kD.A13("streamable.com", "www.streamable.com");

    public static final int A00(int i) {
        if (i == 2) {
            return R.drawable.ic_pip_facebook;
        }
        if (i == 3) {
            return R.drawable.ic_pip_instagram;
        }
        if (i == 4) {
            return R.drawable.ic_pip_youtube;
        }
        if (i == 5) {
            return R.drawable.ic_pip_facebook;
        }
        if (i == 6) {
            return R.drawable.ic_pip_lasso;
        }
        if (i != 8) {
            return -1;
        }
        return R.drawable.ic_pip_sharechat;
    }

    public static final int A01(AnonymousClass1DU r5, String str) {
        C36331k8.A1I(r5, str);
        Uri parse = Uri.parse(AnonymousClass1DU.A01(str));
        AnonymousClass00C.A0B(parse);
        if (A03(parse, A01)) {
            return 5;
        }
        List list = A00;
        if (A03(parse, list) && "1".equalsIgnoreCase(parse.getQueryParameter("fw"))) {
            return 5;
        }
        if (A03(parse, list)) {
            return 2;
        }
        if (A03(parse, A02)) {
            return 3;
        }
        if (A03(parse, A06)) {
            return 1;
        }
        AnonymousClass00C.A0D(parse, 0);
        String A022 = A02(parse);
        if (A022 != null && A022.length() != 0) {
            return 4;
        }
        if (A03(parse, A03)) {
            return 6;
        }
        if (A03(parse, A04)) {
            return 7;
        }
        return C36381kD.A00(A03(parse, A05) ? 1 : 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (X.AnonymousClass099.A0O(X.C36431kI.A1D(r0, r1), "shorts", false) == true) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A02(android.net.Uri r4) {
        /*
            r2 = 0
            if (r4 == 0) goto L_0x002e
            java.lang.String r1 = r4.getHost()
            if (r1 == 0) goto L_0x002e
            java.lang.String r0 = "m.youtube.com"
            r3 = 1
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = "www.youtube.com"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = "youtube.com"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = "youtu.be"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x002e
        L_0x002a:
            java.lang.String r2 = r4.getLastPathSegment()
        L_0x002e:
            return r2
        L_0x002f:
            java.lang.String r1 = r4.getPath()
            if (r1 == 0) goto L_0x0048
            java.util.Locale r0 = java.util.Locale.US
            X.AnonymousClass00C.A09(r0)
            java.lang.String r2 = X.C36431kI.A1D(r0, r1)
            java.lang.String r1 = "shorts"
            r0 = 0
            boolean r0 = X.AnonymousClass099.A0O(r2, r1, r0)
            if (r0 != r3) goto L_0x0048
            goto L_0x002a
        L_0x0048:
            java.lang.String r0 = "v"
            java.lang.String r2 = r4.getQueryParameter(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TO.A02(android.net.Uri):java.lang.String");
    }

    public static final boolean A03(Uri uri, List list) {
        String str = null;
        if (uri != null) {
            str = uri.getHost();
        }
        if (uri == null || str == null) {
            return false;
        }
        for (Object next : list) {
            if (str.equalsIgnoreCase((String) next)) {
                if (next != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    static {
        List asList = Arrays.asList(new String[]{"facebook.com", "www.facebook.com", "m.facebook.com"});
        AnonymousClass00C.A08(asList);
        A00 = asList;
        List asList2 = Arrays.asList(new String[]{"fbwat.ch", "www.fbwat.ch", "fb.watch", "www.fb.watch"});
        AnonymousClass00C.A08(asList2);
        A01 = asList2;
    }
}
