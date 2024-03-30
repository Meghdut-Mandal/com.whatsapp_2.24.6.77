package X;

import java.util.Comparator;

/* renamed from: X.3xL  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C81643xL implements Comparator {
    public static final /* synthetic */ C81643xL A00 = new C81643xL();

    public final int compare(Object obj, Object obj2) {
        AnonymousClass3QN r6 = (AnonymousClass3QN) obj;
        AnonymousClass3QN r7 = (AnonymousClass3QN) obj2;
        int i = r6.A00;
        int i2 = r7.A00;
        if (i <= i2) {
            if (i < i2) {
                return -1;
            }
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
