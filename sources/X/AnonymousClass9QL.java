package X;

/* renamed from: X.9QL  reason: invalid class name */
public abstract class AnonymousClass9QL {
    public final AnonymousClass5S5 A00;
    public final AnonymousClass5RX A01;

    public int hashCode() {
        int i = 0;
        int A0J = AnonymousClass000.A0J(this.A00) * 31;
        AnonymousClass5RX r0 = this.A01;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return A0J + i;
    }

    public AnonymousClass9QL(C197529br r2) {
        this.A00 = r2.A00;
        this.A01 = r2.A01;
    }
}
