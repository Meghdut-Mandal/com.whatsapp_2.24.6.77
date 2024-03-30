package X;

import java.util.Comparator;

/* renamed from: X.3xS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C81713xS implements Comparator {
    public static final /* synthetic */ C81713xS A00 = new C81713xS();

    public final int compare(Object obj, Object obj2) {
        AnonymousClass3T1 r5 = (AnonymousClass3T1) obj;
        AnonymousClass3T1 r6 = (AnonymousClass3T1) obj2;
        int compare = Long.compare(r5.A0I, r6.A0I);
        if (compare == 0) {
            return Long.compare(r5.A1O, r6.A1O);
        }
        return compare;
    }
}
