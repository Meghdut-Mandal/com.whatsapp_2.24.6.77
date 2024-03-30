package X;

import com.google.protobuf.UnsafeUtil;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8Sb  reason: invalid class name and case insensitive filesystem */
public final class C173538Sb extends C199639ff {
    public static final Class A00 = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public static List A00(Object obj, long j, int i) {
        AbstractList r1;
        List list = (List) AnonymousClass9Yj.A00(obj, j);
        if (list.isEmpty()) {
            if (list instanceof B6Z) {
                B6Z b6z = AnonymousClass8I1.A01;
                list = new AnonymousClass8I1(C36441kJ.A14(i));
            } else if (!(list instanceof C16130of) || !(list instanceof C23122B6c)) {
                list = C36441kJ.A14(i);
            } else {
                list = ((C23122B6c) list).BQ1(i);
            }
            UnsafeUtil.A07(obj, j, list);
        } else {
            if (C165587tf.A1b(A00, list)) {
                r1 = C165587tf.A0n(list, i);
            } else if (list instanceof C21887AcF) {
                B6Z b6z2 = AnonymousClass8I1.A01;
                r1 = new AnonymousClass8I1(C165587tf.A0n(list, i));
            } else if ((list instanceof C16130of) && (list instanceof C23122B6c)) {
                C23122B6c b6c = (C23122B6c) list;
                if (!((C21886AcE) b6c).A00) {
                    C23122B6c BQ1 = b6c.BQ1(list.size() + i);
                    UnsafeUtil.A07(obj, j, BQ1);
                    return BQ1;
                }
            }
            r1.addAll(list);
            UnsafeUtil.A07(obj, j, r1);
            return r1;
        }
        return list;
    }
}
