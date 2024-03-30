package X;

/* renamed from: X.ArW  reason: case insensitive filesystem */
public class C22604ArW extends AnonymousClass120 {
    public C22608Ara A00;
    public C22656AsM A01;

    public C22608Ara A0A() {
        if (this.A00 == null) {
            C22656AsM asM = this.A01;
            if (asM.A0H() == 3) {
                this.A00 = C22608Ara.A01(asM.A0J(2));
            }
        }
        return this.A00;
    }

    public AnonymousClass121 Bve() {
        return this.A01;
    }

    public C22604ArW(C22656AsM asM) {
        if (asM.A0H() < 2 || asM.A0H() > 3) {
            throw C22656AsM.A01(asM);
        }
        this.A01 = asM;
    }
}
