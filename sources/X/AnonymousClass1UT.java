package X;

import com.whatsapp.util.Log;

/* renamed from: X.1UT  reason: invalid class name */
public abstract class AnonymousClass1UT {
    public static final void A00(String str) {
        AnonymousClass00C.A0D(str, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("[XFAM] ");
        sb.append(str);
        Log.i(sb.toString());
    }

    public static final void A01(String str, Throwable th) {
        AnonymousClass00C.A0D(str, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("[XFAM] ");
        sb.append(str);
        String obj = sb.toString();
        if (th != null) {
            Log.e(obj, th);
        } else {
            Log.e(obj);
        }
    }
}
