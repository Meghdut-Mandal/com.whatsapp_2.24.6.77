package X;

import android.util.Log;

/* renamed from: X.6RS  reason: invalid class name */
public abstract class AnonymousClass6RS {
    public static volatile C140366lT A00;

    public static void A00(C1271967i r4, String str, String str2, Throwable th) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[");
        A0u.append(str);
        Log.e("Whatsapp", AnonymousClass000.A0q("] ", A0u), th);
        Log.e("Whatsapp", C90464aC.A0e("[", str, "] "), th);
        if (A00 != null) {
            C140366lT.A00(r4, A00, str2, th);
        }
    }

    public static void A01(String str, String str2) {
        StringBuilder A0p = C90484aE.A0p();
        A0p.append(str);
        Log.e("Whatsapp", AnonymousClass000.A0p("] ", str2, A0p));
        A00((C1271967i) null, str, str2, (Throwable) null);
    }

    public static void A02(String str, Throwable th) {
        StringBuilder A0p = C90484aE.A0p();
        A0p.append(str);
        Log.e("Whatsapp", AnonymousClass000.A0l(th, "] ", A0p));
        A00((C1271967i) null, str, "", th);
    }
}
