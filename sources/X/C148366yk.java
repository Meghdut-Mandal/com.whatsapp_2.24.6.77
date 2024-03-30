package X;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;

/* renamed from: X.6yk  reason: invalid class name and case insensitive filesystem */
public abstract class C148366yk implements AnonymousClass7hT {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public Uri.Builder A03(C1265864p r5) {
        String str = this.A02;
        C18740tg.A06(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https").encodedAuthority(r5.A02).appendPath(this.A03).appendPath(this.A00).appendEncodedPath(AnonymousClass14B.A0A(str)).appendQueryParameter("direct_ip", String.valueOf(C90504aG.A1T(r5.A00) ? 1 : 0));
        return builder;
    }

    public C148366yk(String str, String str2, String str3) {
        String str4;
        if (!TextUtils.isEmpty(str)) {
            str4 = AnonymousClass14B.A0A(str);
        } else {
            str4 = null;
        }
        this.A02 = str4;
        this.A00 = str2;
        this.A03 = str3 == null ? "mms" : str3;
        this.A01 = str;
    }

    public static Uri.Builder A02(Uri.Builder builder, String str, String str2) {
        Uri build = builder.build();
        if (build.getQueryParameter(str) == null) {
            return builder.appendQueryParameter(str, str2);
        }
        builder.clearQuery();
        Iterator<String> it = build.getQueryParameterNames().iterator();
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            if (str.equals(A0C)) {
                builder.appendQueryParameter(A0C, str2);
            } else {
                builder.appendQueryParameter(A0C, build.getQueryParameter(A0C));
            }
        }
        return builder;
    }
}
