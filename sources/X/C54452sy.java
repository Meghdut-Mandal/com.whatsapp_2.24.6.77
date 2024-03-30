package X;

import android.content.Context;
import android.content.res.Resources;
import com.whatsapp.R;
import java.util.Iterator;

/* renamed from: X.2sy  reason: invalid class name and case insensitive filesystem */
public abstract class C54452sy {
    public static String A00(Context context, AnonymousClass39E r7) {
        Iterator A0y = AnonymousClass000.A0y(r7.A02);
        int i = 0;
        int i2 = 0;
        while (A0y.hasNext()) {
            int A0I = AnonymousClass000.A0I(C36351kA.A0u(A0y));
            if (A0I == 419 || A0I == 412) {
                i++;
            } else if (A0I == 417) {
                i2++;
            }
        }
        if (i > 0) {
            Resources resources = context.getResources();
            int i3 = R.plurals.f10nameremoved;
            if (i2 > 0) {
                i3 = R.plurals.f10nameremoved;
                i += i2;
            }
            return C36321k7.A0B(resources, i, 0, i3);
        } else if (i2 > 0) {
            return C36321k7.A0B(context.getResources(), i2, 0, R.plurals.f10nameremoved);
        } else {
            return null;
        }
    }
}
