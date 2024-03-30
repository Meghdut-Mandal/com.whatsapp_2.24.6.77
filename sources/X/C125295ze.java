package X;

import com.whatsapp.util.Log;

/* renamed from: X.5ze  reason: invalid class name and case insensitive filesystem */
public final class C125295ze {
    public void A00(String str, String str2, Throwable th, boolean z) {
        AnonymousClass00C.A0D(str2, 1);
        StringBuilder A0v = AnonymousClass000.A0v(str);
        A0v.append(' ');
        A0v.append(str2);
        A0v.append("; Fail Harder = ");
        A0v.append(z);
        Log.e(AnonymousClass000.A0r("; Sample Frequency = ", A0v, -1), th);
    }
}
