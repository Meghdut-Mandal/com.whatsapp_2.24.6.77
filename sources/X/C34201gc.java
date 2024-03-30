package X;

import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.1gc  reason: invalid class name and case insensitive filesystem */
public abstract class C34201gc {
    public static volatile int A00 = -1;

    public static int A00(Context context) {
        int i;
        if (A00 == 0) {
            return A00;
        }
        try {
            i = C02610Bd.A00.A02(context, 12451000);
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("google-utils/checkGooglePlayServicesStatus/unexpected exception/");
            sb.append(e);
            Log.e(sb.toString());
            i = 8;
        }
        A00 = i;
        return i;
    }
}
