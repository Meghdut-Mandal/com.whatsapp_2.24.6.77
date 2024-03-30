package X;

import java.util.Objects;

/* renamed from: X.83Z  reason: invalid class name */
public class AnonymousClass83Z extends C20970A1g implements C23103B5a {
    public AnonymousClass9N0 A00 = new AnonymousClass9N0();
    public C20984A1y A01;
    public final C191139Bu A02;
    public final C191149Bv A03;
    public final C23112B5r A04;
    public final C23111B5q A05;

    public AnonymousClass83Z(B3B b3b) {
        super(b3b);
        C23112B5r b5r;
        C191139Bu r3 = new C191139Bu(this);
        this.A02 = r3;
        C191149Bv r2 = new C191149Bv(this);
        this.A03 = r2;
        AnonymousClass94T r1 = C23112B5r.A00;
        if (b3b.BLS(r1)) {
            b5r = (C23112B5r) b3b.B9z(r1);
        } else {
            b5r = null;
        }
        this.A04 = b5r;
        this.A05 = (C23111B5q) b3b.B9z(C23111B5q.A00);
        AnonymousClass94Q r12 = B49.A00;
        B3B b3b2 = this.A00;
        Objects.requireNonNull(b3b2);
        C20984A1y a1y = (C20984A1y) b3b2.BA0(r12);
        this.A01 = a1y;
        if (a1y != null) {
            C23112B5r b5r2 = this.A04;
            if (b5r2 != null) {
                a1y.A04 = b5r2;
            }
            this.A00.A00 = a1y;
            a1y.A02 = r3;
            a1y.A03 = r2;
        }
    }

    public C1691688a BDJ() {
        return C23103B5a.A00;
    }
}
