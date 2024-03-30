package X;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.03X  reason: invalid class name */
public abstract class AnonymousClass03X extends AnonymousClass03W {
    public static final void A08(List list, Comparator comparator) {
        AnonymousClass00C.A0D(list, 0);
        AnonymousClass00C.A0D(comparator, 1);
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
