package X;

import android.os.Environment;
import com.whatsapp.R;
import java.util.Locale;

/* renamed from: X.3Mu  reason: invalid class name and case insensitive filesystem */
public abstract class C64143Mu {
    public static final AnonymousClass38L[] A00 = {new AnonymousClass38L(4, 1, A00(), R.string.f12nameremoved), new AnonymousClass38L(5, 4, A00(), R.string.f12nameremoved), new AnonymousClass38L(6, 2, A00(), R.string.f12nameremoved), new AnonymousClass38L(0, 1, (String) null, R.string.f12nameremoved), new AnonymousClass38L(1, 4, (String) null, R.string.f12nameremoved), new AnonymousClass38L(2, 2, (String) null, R.string.f12nameremoved)};
    public static final AnonymousClass38L[] A01 = {new AnonymousClass38L(7, 7, A00(), R.string.f12nameremoved), new AnonymousClass38L(3, 7, (String) null, R.string.f12nameremoved), new AnonymousClass38L(1, 4, (String) null, R.string.f12nameremoved)};
    public static final String A02;

    public static final String A00() {
        String str = A02;
        Locale locale = Locale.getDefault();
        AnonymousClass00C.A08(locale);
        return String.valueOf(C36431kI.A1D(locale, str).hashCode());
    }

    static {
        StringBuilder A0u = AnonymousClass000.A0u();
        C36351kA.A1K(Environment.getExternalStorageDirectory(), A0u);
        A02 = AnonymousClass000.A0q("/DCIM/Camera", A0u);
    }
}
