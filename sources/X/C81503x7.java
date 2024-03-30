package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.3x7  reason: invalid class name and case insensitive filesystem */
public class C81503x7 implements Comparator {
    public final C19730wQ A00;
    public final AnonymousClass171 A01;
    public final Collator A02;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C62523Gm r8 = (C62523Gm) obj;
        C62523Gm r9 = (C62523Gm) obj2;
        AnonymousClass141 r6 = r8.A02;
        if (r6 == null) {
            r6 = new AnonymousClass141(r8.A03);
        }
        AnonymousClass141 r5 = r9.A02;
        if (r5 == null) {
            r5 = new AnonymousClass141(r9.A03);
        }
        C19730wQ r0 = this.A00;
        boolean A1X = C36361kB.A1X(r0, r6);
        if (A1X == C36361kB.A1X(r0, r5) && (A1X = AnonymousClass000.A1P(r8.A00)) == AnonymousClass000.A1P(r9.A00)) {
            Collator collator = this.A02;
            AnonymousClass171 r2 = this.A01;
            return C81783xZ.A00(r2.A0E(r6, 7, false, false), r2.A0E(r5, 7, false, false), collator);
        } else if (A1X) {
            return -1;
        } else {
            return 1;
        }
    }

    public C81503x7(C19730wQ r2, AnonymousClass171 r3) {
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r3.A0Z();
    }
}
