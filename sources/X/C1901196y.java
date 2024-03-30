package X;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: X.96y  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C1901196y {
    public static boolean A00(Uri uri, B2Y b2y) {
        String queryParameter = uri.getQueryParameter(b2y.B9L());
        String B8p = b2y.B8p();
        if (TextUtils.isEmpty(B8p) || TextUtils.isEmpty(queryParameter) || !B8p.contains(queryParameter)) {
            return false;
        }
        return true;
    }
}
