package X;

import android.os.SystemClock;
import android.util.Log;
import java.util.List;

/* renamed from: X.9lj  reason: invalid class name and case insensitive filesystem */
public abstract class C202389lj {
    public static final AnonymousClass9VB A00 = new AnonymousClass9VB();

    public static void A00() {
        SystemClock.elapsedRealtime();
        List list = A00.A00;
        if (0 < list.size()) {
            list.get(0);
            throw AnonymousClass001.A0A("getLoggerHandler");
        }
    }

    public static void A01(Exception exc) {
        A00();
        if (C112775eR.A00) {
            C202399lk.A00(new C1497572q(exc, 9));
        }
    }

    public static void A02(String str, String str2) {
        StringBuilder A0v = AnonymousClass000.A0v(str);
        A0v.append(": ");
        A0v.append(str2);
        A0v.toString();
        A00();
        if (C112775eR.A00) {
            Log.e(str, str2);
        }
    }

    public static void A03(String str, String str2) {
        StringBuilder A0v = AnonymousClass000.A0v(str);
        A0v.append(": ");
        A0v.append(str2);
        A0v.toString();
        A00();
        if (C112775eR.A00) {
            Log.w(str, str2);
        }
    }
}
