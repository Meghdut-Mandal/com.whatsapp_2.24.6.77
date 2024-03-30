package X;

/* renamed from: X.A1w  reason: case insensitive filesystem */
public class C20982A1w implements C23064B2n {
    public C201589jv A00;
    public AnonymousClass9ST A01;
    public A23 A02;
    public C20981A1v A03;
    public final C198549dl A04 = C198549dl.A01;
    public final C198549dl A05;

    public final void release() {
        this.A00 = null;
    }

    public final void B1T(AnonymousClass9ST r3) {
        AnonymousClass9ST r0 = this.A01;
        if (!(r0 == null || r0 == r3)) {
            this.A04.A00(C188278zK.A02);
        }
        this.A01 = r3;
    }

    public final void B5N() {
        A23 a23 = this.A02;
        if (a23 != null) {
            a23.B5N();
            this.A02 = null;
        }
        this.A01 = null;
        C20981A1v a1v = this.A03;
        if (a1v != null) {
            a1v.B5N();
            this.A03 = null;
        }
    }

    public final void BKM(C201589jv r3) {
        C201589jv r0 = this.A00;
        if (!(r0 == null || r0 == r3)) {
            this.A04.A00(C188278zK.A04);
        }
        this.A00 = r3;
    }

    public C20982A1w(C198549dl r2) {
        this.A05 = r2;
    }

    public C20982A1w() {
    }
}
