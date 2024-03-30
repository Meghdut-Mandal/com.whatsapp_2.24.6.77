package X;

/* renamed from: X.62R  reason: invalid class name */
public final class AnonymousClass62R {
    public final Object A00;
    public final C157597dn A01;
    public final AnonymousClass62R A02;

    public final boolean A00() {
        if (this.A01.getValue() != this.A00) {
            return true;
        }
        AnonymousClass62R r0 = this.A02;
        if (r0 == null || !r0.A00()) {
            return false;
        }
        return true;
    }

    public AnonymousClass62R(C157597dn r2, AnonymousClass62R r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r2.getValue();
    }
}
