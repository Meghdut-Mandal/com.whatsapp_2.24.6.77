package X;

import java.util.Comparator;

/* renamed from: X.3xY  reason: invalid class name and case insensitive filesystem */
public class C81773xY implements Comparator {
    public final C81553xC A00;

    public static AnonymousClass3QK A00(C65073Qp r6) {
        if (r6 == null || C36441kJ.A0l(r6.A06()) == null || r6.A08() == null) {
            return null;
        }
        return new AnonymousClass3QK(AnonymousClass6SZ.A00(r6.A06()), r6.A08(), r6.A02, 0);
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass3QK A002 = A00((C65073Qp) obj);
        AnonymousClass3QK A003 = A00((C65073Qp) obj2);
        if (A002 == null) {
            if (A003 == null) {
                return 0;
            }
            return -1;
        } else if (A003 == null) {
            return 1;
        } else {
            return this.A00.compare(A002, A003);
        }
    }

    public C81773xY(C220412q r2) {
        this.A00 = new C81553xC(r2);
    }
}
