package X;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0MA  reason: invalid class name */
public final class AnonymousClass0MA extends AnonymousClass0X1 {
    public static final Class A00 = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ AnonymousClass0MA(AnonymousClass0OU r2) {
    }

    public final void A00(Object obj, long j) {
        Object unmodifiableList;
        AnonymousClass0V5 r3 = AnonymousClass0Z6.A00;
        List list = (List) r3.A02(obj, j);
        if (list instanceof C17840s9) {
            unmodifiableList = ((C17840s9) list).Byl();
        } else if (!A00.isAssignableFrom(list.getClass())) {
            unmodifiableList = Collections.unmodifiableList(list);
        } else {
            return;
        }
        r3.A07(obj, j, unmodifiableList);
    }

    public final void A01(Object obj, Object obj2, long j) {
        AbstractList r1;
        AnonymousClass0V5 r3 = AnonymousClass0Z6.A00;
        List list = (List) r3.A02(obj2, j);
        int size = list.size();
        List list2 = (List) r3.A02(obj, j);
        if (list2.isEmpty()) {
            if (list2 instanceof C17840s9) {
                list2 = new AnonymousClass0M2(size);
            } else {
                list2 = new ArrayList(size);
            }
            r3.A07(obj, j, list2);
        } else {
            if (A00.isAssignableFrom(list2.getClass())) {
                r1 = new ArrayList(list2.size() + size);
                r1.addAll(list2);
            } else if (list2 instanceof C13340ji) {
                C17840s9 r0 = AnonymousClass0M2.A01;
                r1 = new AnonymousClass0M2(list2.size() + size);
                r1.addAll(r1.size(), list2);
            }
            r3.A07(obj, j, r1);
            list2 = r1;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0) {
            if (size3 > 0) {
                list2.addAll(list);
            }
            list = list2;
        }
        r3.A07(obj, j, list);
    }

    public AnonymousClass0MA() {
    }
}
