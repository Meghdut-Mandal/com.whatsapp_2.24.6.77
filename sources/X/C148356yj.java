package X;

import android.net.Uri;

/* renamed from: X.6yj  reason: invalid class name and case insensitive filesystem */
public class C148356yj implements AnonymousClass7hT {
    public final String A00;
    public final Uri A01;
    public final String A02;

    public String B7t(C1265864p r6, boolean z) {
        Uri uri = this.A01;
        if (!"PSA".equals(uri.getQueryParameter("category"))) {
            return this.A02;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        Uri.Builder encodedAuthority = buildUpon.scheme("https").encodedAuthority(r6.A02);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("wa/static");
        encodedAuthority.encodedPath(AnonymousClass000.A0q(uri.getEncodedPath(), A0u));
        String str = r6.A03;
        if (str != null) {
            C148366yk.A02(buildUpon, "_nc_cat", str);
        }
        return C90474aD.A0b(buildUpon);
    }

    public C148356yj(String str) {
        this.A02 = str;
        Uri parse = Uri.parse(str);
        this.A01 = parse;
        String authority = parse.getAuthority();
        C18740tg.A06(authority);
        this.A00 = authority;
    }
}
