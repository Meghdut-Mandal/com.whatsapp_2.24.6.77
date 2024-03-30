package X;

import androidx.core.view.inputmethod.InputContentInfoCompat;
import com.whatsapp.util.Log;

/* renamed from: X.3Od  reason: invalid class name and case insensitive filesystem */
public class C64483Od {
    public static final String[] A01 = {"image/gif", "video/x.looping_mp4", "image/jpeg", "image/jpg", "image/png", "image/webp.wasticker"};
    public InputContentInfoCompat A00;

    public C593133l A00(InputContentInfoCompat inputContentInfoCompat, int i) {
        try {
            InputContentInfoCompat inputContentInfoCompat2 = this.A00;
            if (inputContentInfoCompat2 != null) {
                inputContentInfoCompat2.releasePermission();
            }
        } catch (Exception e) {
            Log.e("conversation/InputContentInfoCompat#releasePermission() failed.", e);
        } catch (Throwable th) {
            this.A00 = null;
            throw th;
        }
        this.A00 = null;
        String[] strArr = A01;
        int i2 = 0;
        do {
            String str = strArr[i2];
            if (inputContentInfoCompat.getDescription().hasMimeType(str)) {
                if ((i & 1) != 0) {
                    try {
                        inputContentInfoCompat.requestPermission();
                    } catch (Exception e2) {
                        Log.e("conversation/InputContentInfoCompat#requestPermission() failed.", e2);
                        return null;
                    }
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("conversation/onCommitContent: ");
                C36321k7.A1a(A0u, inputContentInfoCompat.getContentUri().toString());
                this.A00 = inputContentInfoCompat;
                return new C593133l(str, inputContentInfoCompat.getContentUri());
            }
            i2++;
        } while (i2 < 6);
        return null;
    }
}
