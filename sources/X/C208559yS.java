package X;

/* renamed from: X.9yS  reason: invalid class name and case insensitive filesystem */
public class C208559yS implements C22854Ax4 {
    public final AnonymousClass81A A00;
    public final String A01;
    public final boolean A02;
    public final int A03;

    public B0T Bvf(AnonymousClass9Y2 r2, C165737u4 r3, C208409yC r4) {
        return new C208309y1(r3, this, r4);
    }

    public C208559yS(AnonymousClass81A r1, String str, int i, boolean z) {
        this.A01 = str;
        this.A03 = i;
        this.A00 = r1;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ShapePath{name=");
        A0u.append(this.A01);
        A0u.append(", index=");
        A0u.append(this.A03);
        return AnonymousClass000.A0s(A0u);
    }
}
