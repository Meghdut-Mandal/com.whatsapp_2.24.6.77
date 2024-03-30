package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6Ql  reason: invalid class name and case insensitive filesystem */
public abstract class C131766Ql {
    public static int A00(AnonymousClass7fI r3, List list) {
        for (int i = 0; i < list.size(); i++) {
            C140456lc A0K = C90504aG.A0K(list, i);
            if (A0K.A0Y() != null && r3.BvX(A0K)) {
                return i;
            }
        }
        return -1;
    }

    public static Pair A01(C140456lc r6, AnonymousClass7fI r7) {
        Object obj;
        int i;
        int[] A00 = AnonymousClass6NR.A01().A00(r6.A04);
        int length = A00.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                obj = Collections.EMPTY_LIST;
                i = -1;
                break;
            }
            int i3 = A00[i2];
            List A0c = r6.A0c(i3);
            i = A00(r7, A0c);
            if (i >= 0) {
                obj = C36441kJ.A15(A0c);
                r6.A05.put(i3, obj);
                break;
            }
            i2++;
        }
        return C36341k9.A0I(obj, i);
    }

    public static ArrayList A02(List list) {
        ArrayList A0r = C36361kB.A0r(list);
        for (int i = 0; i < list.size(); i++) {
            C140456lc A0K = C90504aG.A0K(list, i);
            if (A0K != null) {
                if (A0K.A04 == 13346) {
                    List A0d = A0K.A0d(32);
                    for (int i2 = 0; i2 < A0d.size(); i2++) {
                        A0r.add(A0d.get(i2));
                    }
                } else {
                    A0r.add(A0K);
                }
            }
        }
        return A0r;
    }
}
