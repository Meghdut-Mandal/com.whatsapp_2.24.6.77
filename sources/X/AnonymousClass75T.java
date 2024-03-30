package X;

import java.util.Comparator;

/* renamed from: X.75T  reason: invalid class name */
public final class AnonymousClass75T implements Comparator {
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass641 r6 = (AnonymousClass641) obj;
        AnonymousClass641 r7 = (AnonymousClass641) obj2;
        C36321k7.A0w(r6, r7);
        long j = r6.A00;
        long j2 = r7.A00;
        if (j == j2) {
            return r6.A03 - r7.A03;
        }
        if (j < j2) {
            return -1;
        }
        return 1;
    }
}
