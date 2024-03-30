package X;

/* renamed from: X.AtB  reason: case insensitive filesystem */
public class C22707AtB extends C21755AZj {
    public static final byte[] A04 = {105, 0, 114, 34, 100, -55, 4, 35, -115, 58, -37, -106, 70, -23, 42, -60, 24, -2, -84, -108, 0, -19, 7, 18, -64, -122, -36, -62, -17, 76, -87, 43};
    public long A00 = 0;
    public AZr A01;
    public boolean A02;
    public final C22705At9 A03;

    public C22707AtB(B35 b35) {
        super(b35);
        this.A03 = new C22705At9(b35, b35.B8o() * 8);
    }

    public int BmM(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = this.A03.A00;
        A01(bArr, bArr2, i, i3, i2);
        return i3;
    }

    public void reset() {
        this.A00 = 0;
        this.A03.reset();
    }

    public String B8R() {
        String B8R = this.A03.B8R();
        StringBuilder A0u = AnonymousClass000.A0u();
        int indexOf = B8R.indexOf(47);
        C165577te.A1O(B8R, A0u, 0, indexOf);
        A0u.append("/G");
        return AnonymousClass000.A0q(C165607th.A0o(indexOf, B8R), A0u);
    }

    public int B8o() {
        return this.A03.A00;
    }

    public void BKQ(C16590pl r3, boolean z) {
        this.A00 = 0;
        this.A03.BKQ(r3, z);
        this.A02 = z;
        if (r3 instanceof C21760AZs) {
            r3 = ((C21760AZs) r3).A00;
        }
        if (r3 instanceof C21759AZn) {
            r3 = ((C21759AZn) r3).A01;
        }
        if (r3 instanceof C21757AZl) {
            r3 = null;
        }
        this.A01 = (AZr) r3;
    }
}
