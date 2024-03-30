package X;

import android.content.ContentUris;
import android.net.Uri;
import android.text.TextUtils;

@Deprecated
/* renamed from: X.1U4  reason: invalid class name */
public abstract class AnonymousClass1U4 {
    public static final Uri A00;
    public static final String A01;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("com.whatsapp");
        sb.append(".provider.contact");
        String obj = sb.toString();
        A01 = obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("content://");
        sb2.append(obj);
        sb2.append("/contacts");
        A00 = Uri.parse(sb2.toString());
    }

    public static Uri A00(AnonymousClass141 r3) {
        return ContentUris.withAppendedId(A00, r3.A0I());
    }

    public static boolean A01(Uri uri) {
        if (uri == null || !TextUtils.equals(uri.getScheme(), "content") || !TextUtils.equals(uri.getAuthority(), A01)) {
            return false;
        }
        return true;
    }
}
