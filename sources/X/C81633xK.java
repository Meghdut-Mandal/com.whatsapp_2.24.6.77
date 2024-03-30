package X;

import java.util.Comparator;

/* renamed from: X.3xK  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C81633xK implements Comparator {
    public static final /* synthetic */ C81633xK A00 = new C81633xK();

    public final int compare(Object obj, Object obj2) {
        AnonymousClass3QN r6 = (AnonymousClass3QN) obj;
        AnonymousClass3QN r7 = (AnonymousClass3QN) obj2;
        int i = r6.A01;
        int i2 = r7.A01;
        if (i > i2) {
            return -1;
        }
        if (i >= i2) {
            long j = r6.A02;
            long j2 = r7.A02;
            if (j > j2) {
                return -1;
            }
            if (j < j2) {
                return 1;
            }
            return 0;
        }
        return 1;
    }
}
