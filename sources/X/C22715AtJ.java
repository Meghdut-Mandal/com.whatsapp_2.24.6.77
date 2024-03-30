package X;

/* renamed from: X.AtJ  reason: case insensitive filesystem */
public class C22715AtJ extends C21790AaN {
    public C22715AtJ() {
    }

    public C22715AtJ(C22715AtJ atJ) {
        super(atJ);
    }

    public B21 B3i() {
        return new C22715AtJ(this);
    }

    public String B8R() {
        return "SHA-384";
    }

    public int BB8() {
        return 48;
    }

    public void BoU(B21 b21) {
        super.A04((C21790AaN) b21);
    }

    public void reset() {
        super.reset();
        this.A02 = -3766243637369397544L;
        this.A03 = 7105036623409894663L;
        this.A04 = -7973340178411365097L;
        this.A05 = 1526699215303891257L;
        this.A06 = 7436329637833083697L;
        this.A07 = -8163818279084223215L;
        this.A0C = -2662702644619276377L;
        this.A0D = 5167115440072839076L;
    }

    public int B5n(byte[] bArr, int i) {
        C21790AaN.A02(this, bArr, i);
        reset();
        return 48;
    }
}
