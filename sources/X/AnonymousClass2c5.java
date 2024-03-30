package X;

/* renamed from: X.2c5  reason: invalid class name */
public class AnonymousClass2c5 extends AnonymousClass2bG {
    public String A00;
    public String A01;

    public void A0o(int i) {
        C18740tg.A0E(AnonymousClass000.A1S(i, 2), "FMessageBlankReply can only be quote message.");
        super.A0o(i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass2c5 r5 = (AnonymousClass2c5) obj;
            if (!C1901797e.A00(this.A00, r5.A00) || !C1901797e.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass2c5(C64933Qa r2, long j) {
        super(r2, 33, j);
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A00;
        return AnonymousClass000.A0L(this.A01, A0M);
    }
}
