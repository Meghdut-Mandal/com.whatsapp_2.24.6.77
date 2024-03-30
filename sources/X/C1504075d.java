package X;

import java.util.Comparator;

/* renamed from: X.75d  reason: invalid class name and case insensitive filesystem */
public final class C1504075d implements Comparator {
    public static final C1504075d A00 = new C1504075d();

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C137846gp r3 = (C137846gp) obj;
        C137846gp r4 = (C137846gp) obj2;
        int A002 = AnonymousClass00C.A00(r4.A00, r3.A00);
        if (A002 == 0) {
            return AnonymousClass00C.A00(r3.hashCode(), r4.hashCode());
        }
        return A002;
    }
}
