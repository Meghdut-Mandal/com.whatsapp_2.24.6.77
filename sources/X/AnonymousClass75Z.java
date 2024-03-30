package X;

import java.util.Collection;
import java.util.Comparator;

/* renamed from: X.75Z  reason: invalid class name */
public final class AnonymousClass75Z implements Comparator {
    public final /* synthetic */ C123745x1 A00;
    public final /* synthetic */ C130896Mv A01;
    public final /* synthetic */ Collection A02;
    public final /* synthetic */ AnonymousClass040 A03;

    public AnonymousClass75Z(C123745x1 r1, C130896Mv r2, Collection collection, AnonymousClass040 r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = collection;
    }

    public final int compare(Object obj, Object obj2) {
        C130896Mv r6 = this.A01;
        AnonymousClass040 r5 = this.A03;
        C123745x1 r4 = this.A00;
        Collection collection = this.A02;
        Object obj3 = C130896Mv.A00(r4, r6, collection, r5).get(obj);
        int i = Integer.MAX_VALUE;
        if (obj3 == null) {
            obj3 = Integer.MAX_VALUE;
        }
        Integer num = (Integer) obj3;
        Object obj4 = C130896Mv.A00(r4, r6, collection, r5).get(obj2);
        if (obj4 != null) {
            i = obj4;
        }
        return C05590Qh.A00(num, i);
    }
}
