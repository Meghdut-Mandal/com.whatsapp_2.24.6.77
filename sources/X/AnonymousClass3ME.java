package X;

import android.util.Pair;
import java.util.Iterator;

/* renamed from: X.3ME  reason: invalid class name */
public abstract class AnonymousClass3ME {
    public static Pair A01(C203399nx r4) {
        Iterator it = r4.A0j("error").iterator();
        while (it.hasNext()) {
            C203399nx A0s = C36431kI.A0s(it);
            if (A0s != null) {
                String A0i = A0s.A0i("code", (String) null);
                String A0i2 = A0s.A0i("text", (String) null);
                if (A0i != null) {
                    return C36441kJ.A0Q(Integer.valueOf(AnonymousClass6R8.A00(A0i, 0)), A0i2);
                }
            }
        }
        return null;
    }

    public static int A00(C203399nx r0) {
        Pair A01 = A01(r0);
        if (A01 != null) {
            return C36381kD.A04(A01);
        }
        return 0;
    }
}
