package X;

/* renamed from: X.67K  reason: invalid class name */
public class AnonymousClass67K {
    public final int A00;
    public final int A01;
    public final AnonymousClass66H A02;
    public final C1268065r A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass67K r5 = (AnonymousClass67K) obj;
            if (this.A01 != r5.A01 || this.A00 != r5.A00 || !C1901797e.A00(this.A03, r5.A03) || !C1901797e.A00(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        AnonymousClass000.A1J(objArr, this.A01);
        AnonymousClass000.A1K(objArr, this.A00);
        objArr[2] = this.A03;
        return AnonymousClass000.A0M(this.A02, objArr, 3);
    }

    public AnonymousClass67K(AnonymousClass66H r1, C1268065r r2, int i, int i2) {
        this.A01 = i;
        this.A03 = r2;
        this.A02 = r1;
        this.A00 = i2;
    }
}
