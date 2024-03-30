package X;

import android.util.Log;

/* renamed from: X.5Yr  reason: invalid class name and case insensitive filesystem */
public abstract class C109725Yr {
    public static void A00(String str, Throwable th, Object... objArr) {
        if (Log.isLoggable("Vision", 6)) {
            boolean A1a = C90494aF.A1a("Vision");
            String format = String.format(str, objArr);
            if (A1a) {
                Log.e("Vision", format, th);
                return;
            }
            String valueOf = String.valueOf(th);
            StringBuilder A0i = C90464aC.A0i(valueOf, C90474aD.A05(format) + 2);
            A0i.append(format);
            Log.e("Vision", AnonymousClass000.A0p(": ", valueOf, A0i));
        }
    }
}
