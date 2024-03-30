package X;

/* renamed from: X.66k  reason: invalid class name and case insensitive filesystem */
public final class C1269666k {
    public boolean A00;
    public final C1272267l A01;
    public final /* synthetic */ C1496071z A02;

    public C1269666k(C1272267l r1, C1496071z r2) {
        this.A02 = r2;
        this.A01 = r1;
    }

    public C107815Qz A00() {
        C107815Qz r0;
        synchronized (this.A02) {
            C1272267l r1 = this.A01;
            if (r1.A01 == this) {
                r0 = new C107815Qz(this, C90524aI.A0W(r1.A01()));
            } else {
                throw new IllegalStateException();
            }
        }
        return r0;
    }

    public void A01() {
        boolean z = this.A00;
        C1496071z r1 = this.A02;
        if (z) {
            C1496071z.A03(this, r1, false);
            r1.A0C(this.A01.A03);
            return;
        }
        C1496071z.A03(this, r1, true);
    }
}
