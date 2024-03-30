package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1Dp  reason: invalid class name and case insensitive filesystem */
public final class C24741Dp {
    public final C19630wG A00;

    public C24741Dp(C19630wG r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final File A00(String str, int i) {
        String str2 = null;
        File file = new File(new File(this.A00.A00.getFilesDir(), "privacy_disclosure"), String.valueOf(i));
        if (file.exists() || file.mkdirs()) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                str2 = parse.getLastPathSegment();
            }
            return new File(file, str2);
        }
        Log.e("PrivacyDisclosureFileCache/getPrivacyDisclosureDir can not make directory");
        return null;
    }
}
