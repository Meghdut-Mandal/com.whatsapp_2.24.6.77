package X;

/* renamed from: X.9yU  reason: invalid class name and case insensitive filesystem */
public class C208579yU implements C22854Ax4 {
    public final AnonymousClass815 A00;
    public final AnonymousClass815 A01;
    public final AnonymousClass815 A02;
    public final Integer A03;
    public final boolean A04;

    public B0T Bvf(AnonymousClass9Y2 r2, C165737u4 r3, C208409yC r4) {
        return new C208289xz(this, r4);
    }

    public C208579yU(AnonymousClass815 r1, AnonymousClass815 r2, AnonymousClass815 r3, Integer num, boolean z) {
        this.A03 = num;
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
        this.A04 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Trim Path: {start: ");
        A0u.append(this.A02);
        A0u.append(", end: ");
        A0u.append(this.A00);
        A0u.append(", offset: ");
        A0u.append(this.A01);
        return AnonymousClass000.A0q("}", A0u);
    }
}
