package X;

/* renamed from: X.AtK  reason: case insensitive filesystem */
public class C22716AtK extends C21790AaN {
    public C22716AtK() {
    }

    public C22716AtK(C22716AtK atK) {
        super(atK);
    }

    public B21 B3i() {
        return new C22716AtK(this);
    }

    public String B8R() {
        return "SHA-512";
    }

    public int BB8() {
        return 64;
    }

    public void BoU(B21 b21) {
        A04((C21790AaN) b21);
    }

    public void reset() {
        super.reset();
        this.A02 = 7640891576956012808L;
        this.A03 = -4942790177534073029L;
        this.A04 = 4354685564936845355L;
        this.A05 = -6534734903238641935L;
        this.A06 = 5840696475078001361L;
        this.A07 = -7276294671716946913L;
        this.A0C = 2270897969802886507L;
        this.A0D = 6620516959819538809L;
    }

    public int B5n(byte[] bArr, int i) {
        C21790AaN.A02(this, bArr, i);
        C202779me.A03(bArr, i + 48, this.A0C);
        C202779me.A03(bArr, i + 56, this.A0D);
        reset();
        return 64;
    }
}
