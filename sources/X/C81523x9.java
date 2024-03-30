package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.3x9  reason: invalid class name and case insensitive filesystem */
public final class C81523x9 implements Comparator {
    public final C19730wQ A00;
    public final AnonymousClass171 A01;
    public final Collator A02;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass378 r9 = (AnonymousClass378) obj;
        AnonymousClass378 r10 = (AnonymousClass378) obj2;
        C36331k8.A1I(r9, r10);
        AnonymousClass141 r6 = r9.A00;
        AnonymousClass141 r4 = r10.A00;
        C19730wQ r0 = this.A00;
        boolean A1X = C36361kB.A1X(r0, r6);
        if (A1X == C36361kB.A1X(r0, r4)) {
            C52382pL r1 = r9.A02;
            C52382pL r02 = C52382pL.OWNER;
            A1X = C36361kB.A1a(r1, r02);
            C52382pL r2 = r10.A02;
            if (A1X == C36361kB.A1a(r2, r02)) {
                C52382pL r03 = C52382pL.ADMIN;
                boolean A1a = C36361kB.A1a(r1, r03);
                if (A1a == C36361kB.A1a(r2, r03)) {
                    Collator collator = this.A02;
                    AnonymousClass171 r22 = this.A01;
                    return C81783xZ.A00(r22.A0E(r6, 7, false, false), r22.A0E(r4, 7, false, false), collator);
                } else if (A1a) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
        if (A1X) {
            return -1;
        }
        return 1;
    }

    public C81523x9(C19730wQ r2, AnonymousClass171 r3) {
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r3.A0Z();
    }
}
