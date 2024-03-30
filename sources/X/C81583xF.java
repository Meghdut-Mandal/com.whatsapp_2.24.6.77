package X;

import java.util.Comparator;

/* renamed from: X.3xF  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C81583xF implements Comparator {
    public static final /* synthetic */ C81583xF A00 = new C81583xF();

    public final int compare(Object obj, Object obj2) {
        AnonymousClass3T1 r6 = (AnonymousClass3T1) obj;
        AnonymousClass3T1 r7 = (AnonymousClass3T1) obj2;
        int i = (r7.A1O > r6.A1O ? 1 : (r7.A1O == r6.A1O ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return AnonymousClass00C.A00(r7.A1I, r6.A1I);
        }
        return 1;
    }
}
