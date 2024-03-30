package X;

import android.content.Context;
import android.content.res.Configuration;
import com.whatsapp.R;
import java.util.Map;

/* renamed from: X.14h  reason: invalid class name and case insensitive filesystem */
public abstract class C224314h {
    public static Boolean A00;
    public static final AnonymousClass00T A01 = new AnonymousClass00U(C224414i.A00);

    public static final int A00(Context context) {
        AnonymousClass00C.A0D(context, 0);
        return C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved);
    }

    public static final void A02(boolean z, Configuration configuration) {
        AnonymousClass00C.A0D(configuration, 0);
        if (C222013h.A03) {
            boolean z2 = false;
            if ((configuration.uiMode & 48) == 32) {
                z2 = true;
            }
            if (z || !AnonymousClass00C.A0J(Boolean.valueOf(z2), A00)) {
                C224514j.A00.clear();
                A00 = Boolean.valueOf(z2);
            }
        }
    }

    public static final int A01(Context context, int i) {
        int i2;
        Number number = (Number) ((Map) A01.getValue()).get(Integer.valueOf(i));
        if (number != null) {
            i2 = number.intValue();
        } else {
            i2 = R.color.f6nameremoved;
        }
        return C224514j.A00(context, i, i2);
    }
}
