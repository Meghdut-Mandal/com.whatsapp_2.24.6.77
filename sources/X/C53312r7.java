package X;

import android.webkit.URLUtil;

/* renamed from: X.2r7  reason: invalid class name and case insensitive filesystem */
public abstract class C53312r7 {
    public static String A00(String str) {
        if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
            return str;
        }
        return AnonymousClass000.A0p("https://", str, AnonymousClass000.A0u());
    }
}
