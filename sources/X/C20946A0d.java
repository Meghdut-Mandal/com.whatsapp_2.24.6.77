package X;

/* renamed from: X.A0d  reason: case insensitive filesystem */
public final class C20946A0d implements B2G {
    public B5Q A00;
    public B2G A01;
    public final C20944A0b A02;
    public final C209329zp A03;

    public static void A00(C20946A0d a0d) {
        long BG6 = a0d.A01.BG6();
        C20944A0b a0b = a0d.A02;
        a0b.A01(BG6);
        C199519fS BFz = a0d.A01.BFz();
        if (!BFz.equals(a0b.A01)) {
            a0b.Brd(BFz);
            a0d.A03.A0Q(BFz);
        }
    }

    public C199519fS BFz() {
        B2G b2g = this.A01;
        if (b2g != null) {
            return b2g.BFz();
        }
        return this.A02.A01;
    }

    public long BG6() {
        B5Q b5q = this.A00;
        if (b5q == null || b5q.BLh() || (!this.A00.BMw() && this.A00.BK4())) {
            return this.A02.BG6();
        }
        return this.A01.BG6();
    }

    public C199519fS Brd(C199519fS r2) {
        B2G b2g = this.A01;
        if (b2g != null) {
            r2 = b2g.Brd(r2);
        }
        this.A02.Brd(r2);
        this.A03.A0Q(r2);
        return r2;
    }

    public C20946A0d(C209329zp r2, B40 b40) {
        this.A03 = r2;
        this.A02 = new C20944A0b(b40);
    }
}
