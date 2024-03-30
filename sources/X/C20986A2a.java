package X;

import android.util.Log;

/* renamed from: X.A2a  reason: case insensitive filesystem */
public final class C20986A2a implements C157867eo {
    public void BoD(String str, String str2, Throwable th) {
        AnonymousClass00C.A0D(str2, 1);
        StringBuilder A0v = AnonymousClass000.A0v(str2);
        A0v.append(" [");
        A0v.append(str);
        Log.e("WearableSecureContext", AnonymousClass000.A0t(A0v, ']'), th);
    }
}
