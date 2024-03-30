package X;

import java.util.Comparator;

/* renamed from: X.75f  reason: invalid class name and case insensitive filesystem */
public final class C1504275f implements Comparator {
    public static final C1504275f A00 = new C1504275f();

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass6QC A05 = ((AnonymousClass6WV) obj).A05();
        AnonymousClass6QC A052 = ((AnonymousClass6WV) obj2).A05();
        int compare = Float.compare(A052.A02, A05.A02);
        if (compare != 0) {
            return compare;
        }
        int compare2 = Float.compare(A05.A03, A052.A03);
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = Float.compare(A05.A00, A052.A00);
        if (compare3 == 0) {
            return Float.compare(A052.A01, A05.A01);
        }
        return compare3;
    }
}
