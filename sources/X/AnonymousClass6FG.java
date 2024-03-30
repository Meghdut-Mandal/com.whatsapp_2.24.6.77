package X;

/* renamed from: X.6FG  reason: invalid class name */
public abstract class AnonymousClass6FG {
    public int A00;
    public final int A01;

    public void A00() {
        C128896Ea r0;
        if (this instanceof AnonymousClass5NL) {
            AnonymousClass5NL r1 = (AnonymousClass5NL) this;
            r1.A03 = true;
            r0 = r1.A0A;
        } else {
            AnonymousClass5NM r2 = (AnonymousClass5NM) this;
            if (!r2.A05) {
                r2.A05 = true;
                AnonymousClass6Fk r02 = r2.A04;
                if (r02 != null) {
                    r2.A02 = r02.A06();
                }
                r0 = r2.A0B;
            } else {
                return;
            }
        }
        r0.A02();
    }

    public AnonymousClass6FG(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
