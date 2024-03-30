package X;

import java.util.List;

/* renamed from: X.0M9  reason: invalid class name */
public final class AnonymousClass0M9 extends AnonymousClass0X1 {
    public /* synthetic */ AnonymousClass0M9(AnonymousClass0OV r2) {
    }

    public final void A00(Object obj, long j) {
        ((C13330jh) ((C17850sA) AnonymousClass0Z6.A00.A02(obj, j))).A00 = false;
    }

    public final void A01(Object obj, Object obj2, long j) {
        AnonymousClass0V5 r5 = AnonymousClass0Z6.A00;
        C17850sA r4 = (C17850sA) r5.A02(obj, j);
        List list = (List) r5.A02(obj2, j);
        int size = r4.size();
        int size2 = list.size();
        if (size > 0) {
            if (size2 > 0) {
                if (!((C13330jh) r4).A00) {
                    r4 = r4.Byg(size2 + size);
                }
                r4.addAll(list);
            }
            list = r4;
        }
        r5.A07(obj, j, list);
    }

    public AnonymousClass0M9() {
    }
}
