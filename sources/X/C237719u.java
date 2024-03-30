package X;

import java.util.Comparator;

/* renamed from: X.19u  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C237719u implements Comparator {
    public static final /* synthetic */ C237719u A00 = new C237719u();

    public final int compare(Object obj, Object obj2) {
        AnonymousClass3SB r8 = (AnonymousClass3SB) obj;
        AnonymousClass3SB r9 = (AnonymousClass3SB) obj2;
        long j = r8.A01;
        if ((j == 0 && r9.A01 == 0) || (j != 0 && r9.A01 != 0)) {
            return Long.compare(r9.A00, r8.A00);
        }
        if (j != 0) {
            return 1;
        }
        return -1;
    }
}
