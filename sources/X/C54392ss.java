package X;

import android.net.Uri;

/* renamed from: X.2ss  reason: invalid class name and case insensitive filesystem */
public abstract class C54392ss {
    public static final String A00(String str, String... strArr) {
        int length = strArr.length;
        if (length % 2 != 0) {
            C36321k7.A1S("gdrive-util/append-query-parameters/odd number of params - ", AnonymousClass000.A0u(), length);
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (int i = 0; i < length; i += 2) {
            buildUpon.appendQueryParameter(strArr[i], strArr[i + 1]);
        }
        return C36381kD.A0y(buildUpon.build());
    }
}
