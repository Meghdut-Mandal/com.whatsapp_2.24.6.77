package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Arrays;

/* renamed from: X.1D8  reason: invalid class name */
public class AnonymousClass1D8 {
    public final C19700wN A00;

    public AnonymousClass1D8(C19700wN r1) {
        this.A00 = r1;
    }

    public String A00(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("DirectPathUtils/direct_path Receive an empty direct path. Stacktrace: ");
                sb.append(Arrays.toString(Thread.currentThread().getStackTrace()));
                Log.e(sb.toString());
            }
            return null;
        }
        Uri parse = Uri.parse(str);
        if (parse.getQueryParameter("oe") != null && parse.getQueryParameter("oh") != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DirectPathUtils/direct_path missing signature or expiry ");
        sb2.append(str);
        Log.e(sb2.toString());
        this.A00.A0E("DirectPathUtils/verifyDirectPath", "missing signature or expiry", true);
        return null;
    }
}
