package X;

import android.util.Log;
import java.util.Set;

/* renamed from: X.6GP  reason: invalid class name */
public abstract class AnonymousClass6GP {
    public static void A00(String str) {
        Set set = C112605eA.A00;
        if (!set.contains(str)) {
            Log.w("LOTTIE", str, (Throwable) null);
            set.add(str);
        }
    }

    public static void A01(String str, Throwable th) {
        Set set = C112605eA.A00;
        if (!set.contains(str)) {
            Log.w("LOTTIE", str, th);
            set.add(str);
        }
    }
}
