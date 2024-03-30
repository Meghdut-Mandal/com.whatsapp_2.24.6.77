package X;

import android.net.Uri;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;

/* renamed from: X.2t7  reason: invalid class name and case insensitive filesystem */
public abstract class C54542t7 {
    public static String A00(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME.equals(uri.getScheme())) {
            if (!"chat".equals(uri.getHost())) {
                return null;
            }
            String queryParameter = uri.getQueryParameter("code");
            if (queryParameter != null) {
                return queryParameter;
            }
        } else if (!"http".equals(uri.getScheme()) && !"https".equals(uri.getScheme())) {
            return null;
        } else {
            if (!AnonymousClass000.A0q(".whatsapp.com", AnonymousClass000.A0v("chat")).equals(uri.getHost())) {
                if (!"whatsapp.com".equals(uri.getHost()) || !"chat".equals(uri.getLastPathSegment())) {
                    return null;
                }
                return uri.getQueryParameter("code");
            }
        }
        return uri.getLastPathSegment();
    }
}
