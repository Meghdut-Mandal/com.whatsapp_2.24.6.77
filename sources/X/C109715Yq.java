package X;

import android.webkit.MimeTypeMap;

/* renamed from: X.5Yq  reason: invalid class name and case insensitive filesystem */
public abstract class C109715Yq {
    public static final String A00(String str, String str2) {
        String fileExtensionFromUrl;
        int A08;
        AnonymousClass00C.A0D(str2, 1);
        if (!(str == null || (fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str)) == null)) {
            if (fileExtensionFromUrl.length() == 0 && (A08 = AnonymousClass099.A08(str, '.', str.length() - 1)) >= 0) {
                fileExtensionFromUrl = C90494aF.A0d(str, A08 + 1);
            }
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        return str2;
    }
}
