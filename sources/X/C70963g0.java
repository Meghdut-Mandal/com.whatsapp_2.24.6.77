package X;

/* renamed from: X.3g0  reason: invalid class name and case insensitive filesystem */
public class C70963g0 implements AnonymousClass4Q7 {
    public final C220412q A00;
    public final AnonymousClass1LU A01;
    public final C20810yC A02;

    public boolean B7L(AnonymousClass11F r4) {
        if (this.A02.A0E(1608)) {
            if (r4 == null) {
                return false;
            }
            C220412q r1 = this.A00;
            if (r1.A02(r4) == 0 || r1.A0N(r4) || r1.A0Q(r4)) {
                return false;
            }
        } else if (this.A00.A02(r4) == 0) {
            return false;
        }
        return true;
    }

    public C70963g0(C220412q r1, AnonymousClass1LU r2, C20810yC r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
