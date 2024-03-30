package X;

import android.net.Uri;

/* renamed from: X.2r6  reason: invalid class name and case insensitive filesystem */
public abstract class C53302r6 {
    public static Uri A00(C134766bZ r2, int i) {
        String str;
        StringBuilder sb = new StringBuilder("https://");
        if (i != 0) {
            if (i == 1) {
                sb.append("www.instagram.com/");
                str = r2.A01;
            }
            return Uri.parse(sb.toString());
        }
        sb.append("www.facebook.com/");
        str = r2.A02;
        sb.append(str);
        return Uri.parse(sb.toString());
    }
}
