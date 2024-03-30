package X;

import java.util.AbstractMap;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.7qv  reason: invalid class name and case insensitive filesystem */
public class C163887qv implements Comparator {
    public Object A00;
    public Object A01;
    public final int A02;

    public C163887qv(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final int compare(Object obj, Object obj2) {
        int i;
        switch (this.A02) {
            case 0:
                int compare = ((Comparator) this.A01).compare(obj, obj2);
                if (compare == 0) {
                    return ((Comparator) this.A00).compare(((AnonymousClass6WV) obj).A04, ((AnonymousClass6WV) obj2).A04);
                }
                return compare;
            case 1:
                AnonymousClass6MO A04 = C1273868b.A04(C1273868b.A03(obj), obj2, 1);
                Object A002 = AnonymousClass6JI.A00((C100674vP) this.A01, A04, (C160377ku) this.A00);
                if (A002 instanceof Integer) {
                    return AnonymousClass000.A0I(A002);
                }
                AnonymousClass6RS.A01("bk.action.array.SortedArray", "Got non-integer result while evaluating comparator predicate");
                return 0;
            case 2:
                List list = (List) this.A01;
                Number number = (Number) obj2;
                C140456lc A03 = C133296Xs.A03((C157827ek) list.get(((Number) obj).intValue()));
                if (A03 != null) {
                    i = A03.A0T(81, 0);
                } else {
                    i = 0;
                }
                C140456lc A032 = C133296Xs.A03((C157827ek) list.get(number.intValue()));
                int i2 = 0;
                if (A032 != null) {
                    i2 = A032.A0T(81, 0);
                }
                return Integer.compare(i, i2);
            default:
                int compare2 = ((Comparator) this.A01).compare(obj, obj2);
                if (compare2 != 0) {
                    return compare2;
                }
                AbstractMap abstractMap = (AbstractMap) this.A00;
                return C05590Qh.A00((Comparable) abstractMap.get(obj), (Comparable) abstractMap.get(obj2));
        }
    }
}
