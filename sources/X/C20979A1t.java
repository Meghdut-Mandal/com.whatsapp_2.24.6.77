package X;

/* renamed from: X.A1t  reason: case insensitive filesystem */
public class C20979A1t implements C23064B2n {
    public int A00 = 0;
    public C201589jv A01;
    public AnonymousClass9ST A02;
    public C20982A1w A03;
    public final C198549dl A04;
    public final C23012B0d A05;
    public final AnonymousClass9CW A06;

    public C20979A1t(C198549dl r3, C23012B0d b0d) {
        this.A04 = r3;
        this.A06 = new AnonymousClass9CW(r3);
        this.A05 = b0d;
    }

    public void B5N() {
        this.A02 = null;
        C23012B0d b0d = this.A05;
        if (b0d instanceof C23064B2n) {
            ((C23064B2n) b0d).B5N();
        }
        C20982A1w a1w = this.A03;
        if (a1w != null) {
            a1w.B5N();
            this.A03.A00 = null;
            this.A03 = null;
        }
    }

    public void release() {
        this.A01 = null;
        C23012B0d b0d = this.A05;
        if (b0d instanceof C23064B2n) {
            ((C23064B2n) b0d).release();
        }
    }

    public void B1T(AnonymousClass9ST r3) {
        this.A02 = r3;
        C23012B0d b0d = this.A05;
        if (b0d instanceof C23064B2n) {
            ((C23064B2n) b0d).B1T(r3);
        }
    }

    public void BKM(C201589jv r3) {
        this.A01 = r3;
        C23012B0d b0d = this.A05;
        if (b0d instanceof C23064B2n) {
            ((C23064B2n) b0d).BKM(r3);
        }
    }
}
