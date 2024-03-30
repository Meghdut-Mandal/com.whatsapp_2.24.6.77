package X;

import java.util.Comparator;

/* renamed from: X.75g  reason: invalid class name and case insensitive filesystem */
public final class C1504375g implements Comparator {
    public static final C1504375g A00 = new C1504375g();

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass6QC r3 = (AnonymousClass6QC) ((AnonymousClass011) obj).first;
        float f = r3.A03;
        AnonymousClass6QC r2 = (AnonymousClass6QC) ((AnonymousClass011) obj2).first;
        int compare = Float.compare(f, r2.A03);
        if (compare == 0) {
            return Float.compare(r3.A00, r2.A00);
        }
        return compare;
    }
}
