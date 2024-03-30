package X;

import android.content.Context;
import android.text.Spanned;
import com.whatsapp.R;

/* renamed from: X.3Mb  reason: invalid class name and case insensitive filesystem */
public abstract class C63953Mb {
    public static final Spanned A00(Context context, int i) {
        AnonymousClass00C.A0D(context, 0);
        Object[] A0L = AnonymousClass001.A0L();
        A0L[0] = AnonymousClass14B.A03(context, R.color.f6nameremoved);
        Spanned A01 = AnonymousClass14B.A01(context, A0L, i);
        AnonymousClass00C.A08(A01);
        return A01;
    }

    public static final Spanned A01(Context context, String str, String str2) {
        AnonymousClass00C.A0D(str, 1);
        Object[] A1Q = C36441kJ.A1Q();
        A1Q[0] = str;
        A1Q[1] = AnonymousClass14B.A03(context, R.color.f6nameremoved);
        A1Q[2] = str2;
        Spanned A01 = AnonymousClass14B.A01(context, A1Q, R.string.f12nameremoved);
        AnonymousClass00C.A08(A01);
        return A01;
    }
}
