package X;

import java.util.List;

/* renamed from: X.622  reason: invalid class name */
public class AnonymousClass622 {
    public final AnonymousClass6V4 A00;
    public final AnonymousClass6FV A01;

    public void A00() {
        AnonymousClass6FV r3 = this.A01;
        C1268365v r1 = r3.A03;
        if (C36401kF.A1a(r1.A00)) {
            List list = r3.A04;
            C129196Ft A002 = r1.A00(list);
            C129196Ft r0 = r3.A01;
            if (r0 != null && !list.contains(r0)) {
                r3.A01 = null;
            }
            if (A002 instanceof AnonymousClass5Ci) {
                this.A00.A04();
            }
            this.A00.A03();
        }
    }

    public AnonymousClass622(AnonymousClass6V4 r1, AnonymousClass6FV r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
