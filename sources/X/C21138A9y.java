package X;

/* renamed from: X.A9y  reason: case insensitive filesystem */
public final /* synthetic */ class C21138A9y implements AnonymousClass7gN {
    public final /* synthetic */ C175098Zq A00;
    public final /* synthetic */ C148826zU A01;
    public final /* synthetic */ C46812bi A02;

    public /* synthetic */ C21138A9y(C175098Zq r1, C148826zU r2, C46812bi r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void Bcm(int i) {
        C175098Zq r5 = this.A00;
        C46812bi r4 = this.A02;
        C148826zU r6 = this.A01;
        ((C160497l6) r5.A01.get()).Bnw(r4.A1N);
        C89004Uw r2 = r5.A0c;
        B3D b3d = (B3D) r2;
        if (b3d.B2l(r4, r6.A0P) && b3d.B3a(r4, i, r6.A0P, r6.A0T)) {
            r6.A0O = true;
        } else if (r5.A0E && (r2 instanceof B3D)) {
            b3d.Bx8(r4, (long) r5.A0V.A04(C21100yf.A1B), true);
        }
    }
}
