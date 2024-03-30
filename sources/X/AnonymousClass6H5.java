package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: X.6H5  reason: invalid class name */
public abstract class AnonymousClass6H5 {
    public static String A00(String str) {
        if (str == null) {
            return null;
        }
        try {
            return A01(C90524aI.A0j(str));
        } catch (MalformedURLException e) {
            Log.w("redactedversion/not-url", e);
            int length = str.length();
            if (length <= 25) {
                return "***";
            }
            return AnonymousClass000.A0p(str.substring(0, length - 25), "***", AnonymousClass000.A0u());
        }
    }

    public static String A01(URL url) {
        String str;
        int length;
        if (url == null) {
            return null;
        }
        String path = url.getPath();
        if (path == null || (length = path.length()) <= 25) {
            str = "";
        } else {
            str = path.substring(0, length - 25);
        }
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder authority = builder.scheme(url.getProtocol()).authority(url.getHost());
        StringBuilder A0v = AnonymousClass000.A0v(str);
        A0v.append("***");
        C18740tg.A06(path);
        authority.path(AnonymousClass000.A0q(path.substring(path.length() - 4), A0v)).encodedQuery(url.getQuery());
        return C90474aD.A0b(builder);
    }
}
