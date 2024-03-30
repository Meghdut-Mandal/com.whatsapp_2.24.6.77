package X;

import java.util.Comparator;
import java.util.Iterator;

/* renamed from: X.3x1  reason: invalid class name and case insensitive filesystem */
public class C81443x1 implements Comparator {
    public final C220412q A00;
    public final C230917d A01;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass147 r1;
        C65073Qp r9 = (C65073Qp) obj;
        C65073Qp r10 = (C65073Qp) obj2;
        AnonymousClass147 r4 = null;
        if (r9 == null || r9.A02 != 1) {
            r1 = null;
        } else {
            r1 = C65533Sl.A01(r9.A06());
        }
        if (r10 != null && r10.A02 == 1) {
            r4 = C65533Sl.A01(r10.A06());
        }
        if (r1 == null) {
            if (r4 == null) {
                return 0;
            }
            return -1;
        } else if (r4 == null) {
            return 1;
        } else {
            C230917d r7 = this.A01;
            Iterator it = r7.A02(r1).iterator();
            long j = 0;
            while (it.hasNext()) {
                long A08 = this.A00.A08(((AnonymousClass3QK) it.next()).A02);
                if (A08 > j) {
                    j = A08;
                }
            }
            Iterator it2 = r7.A02(r4).iterator();
            long j2 = 0;
            while (it2.hasNext()) {
                long A082 = this.A00.A08(((AnonymousClass3QK) it2.next()).A02);
                if (A082 > j2) {
                    j2 = A082;
                }
            }
            return Long.compare(j2, j);
        }
    }

    public C81443x1(C220412q r1, C230917d r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
