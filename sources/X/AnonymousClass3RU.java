package X;

import android.content.SharedPreferences;
import java.io.File;

/* renamed from: X.3RU  reason: invalid class name */
public class AnonymousClass3RU {
    public static File A00;

    public static synchronized File A00(C20690y0 r9, C19890wg r10, C25471Gl r11, String str, int i) {
        File file;
        synchronized (AnonymousClass3RU.class) {
            A00 = AnonymousClass1GW.A0G(r9, r10, r11, str, 0, i);
            SharedPreferences.Editor A0G = C36381kD.A0G(r10, C19430v1.A0A);
            A0G.putString("external_file_image", A00.getAbsolutePath());
            A0G.apply();
            file = A00;
        }
        return file;
    }

    public static synchronized File A01(C19890wg r3) {
        File file;
        String A0t;
        synchronized (AnonymousClass3RU.class) {
            if (A00 == null && (A0t = C36371kC.A0t(r3.A00(C19430v1.A0A), "external_file_image")) != null) {
                A00 = new File(A0t);
            }
            file = A00;
        }
        return file;
    }
}
