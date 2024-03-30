package X;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: X.9f2  reason: invalid class name and case insensitive filesystem */
public final class C199269f2 {
    public final String A00;

    public static String A00(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                String join = TextUtils.join(", ", objArr);
                StringBuilder A0v = AnonymousClass000.A0v(str2);
                A0v.append(" [");
                str2 = C165567td.A0Y(join, A0v);
            }
        }
        return AnonymousClass000.A0p(" : ", str2, AnonymousClass000.A0v(str));
    }

    public final void A01(String str, Throwable th, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", A00(this.A00, str, objArr), th);
        }
    }

    public final void A02(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", A00(this.A00, str, objArr));
        }
    }

    public C199269f2(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UID: [");
        A0u.append(myUid);
        A0u.append("]  PID: [");
        A0u.append(myPid);
        this.A00 = AnonymousClass000.A0q("] ", A0u).concat(str);
    }
}
