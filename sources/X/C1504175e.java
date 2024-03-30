package X;

import java.util.Comparator;

/* renamed from: X.75e  reason: invalid class name and case insensitive filesystem */
public final class C1504175e implements Comparator {
    public static final C1504175e A00 = new C1504175e();

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass6QC A05 = ((AnonymousClass6WV) obj).A05();
        AnonymousClass6QC A052 = ((AnonymousClass6WV) obj2).A05();
        int compare = Float.compare(A05.A01, A052.A01);
        if (compare != 0) {
            return compare;
        }
        int compare2 = Float.compare(A05.A03, A052.A03);
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = Float.compare(A05.A00, A052.A00);
        if (compare3 == 0) {
            return Float.compare(A05.A02, A052.A02);
        }
        return compare3;
    }
}
