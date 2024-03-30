package X;

import android.content.Context;
import com.whatsapp.R;
import java.text.DecimalFormat;
import java.util.Locale;

/* renamed from: X.5aE  reason: invalid class name and case insensitive filesystem */
public abstract class C110165aE {
    public static String A00(Context context, Locale locale, float f) {
        int i;
        Object[] objArr;
        Object valueOf;
        DecimalFormat decimalFormat;
        String str;
        if (AnonymousClass6W7.A03(locale)) {
            int A06 = C90514aH.A06(f, 1.09f);
            float f2 = ((float) A06) / 1760.0f;
            if (A06 < 325) {
                Object[] objArr2 = new Object[1];
                AnonymousClass000.A1L(objArr2, A06, 0);
                return context.getString(R.string.f12nameremoved, objArr2);
            }
            if (f2 < 1000.0f) {
                str = "0.#";
            } else {
                decimalFormat = new DecimalFormat();
                str = "#,###";
            }
            decimalFormat.applyPattern(str);
            return C36391kE.A0v(context, decimalFormat.format((double) f2), new Object[1], 0, R.string.f12nameremoved);
        }
        if (f < 1000.0f) {
            i = R.string.f12nameremoved;
            objArr = new Object[1];
            valueOf = Integer.valueOf(Math.round(f));
        } else {
            int i2 = (f > 10000.0f ? 1 : (f == 10000.0f ? 0 : -1));
            float f3 = f / 1000.0f;
            if (i2 < 0) {
                return C36391kE.A0v(context, String.format(Locale.US, "%.1f", new Object[]{Double.valueOf((double) f3)}), new Object[1], 0, R.string.f12nameremoved);
            }
            int round = Math.round(f3);
            i = R.string.f12nameremoved;
            objArr = new Object[1];
            valueOf = String.valueOf(round);
        }
        return C36391kE.A0v(context, valueOf, objArr, 0, i);
    }
}
