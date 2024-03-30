package X;

/* renamed from: X.AtA  reason: case insensitive filesystem */
public class C22706AtA extends C21755AZj {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03 = true;
    public byte[] A04;
    public byte[] A05;
    public byte[] A06;
    public final int A07;
    public final B35 A08;

    public int B8o() {
        return this.A07;
    }

    public void BKQ(C16590pl r7, boolean z) {
        this.A03 = true;
        this.A00 = 0;
        this.A01 = 0;
        if (r7 instanceof C21760AZs) {
            C21760AZs aZs = (C21760AZs) r7;
            byte[] bArr = aZs.A01;
            int length = bArr.length;
            byte[] bArr2 = this.A06;
            int length2 = bArr2.length;
            if (length < length2) {
                int i = length2 - length;
                System.arraycopy(bArr, 0, bArr2, i, length);
                for (int i2 = 0; i2 < i; i2++) {
                    bArr2[i2] = 0;
                }
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, length2);
            }
            reset();
            r7 = aZs.A00;
        } else {
            reset();
        }
        if (r7 != null) {
            this.A08.BKQ(r7, true);
        }
    }

    public int BmM(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = this.A07;
        A01(bArr, bArr2, i, i3, i2);
        return i3;
    }

    public void reset() {
        this.A03 = true;
        this.A00 = 0;
        this.A01 = 0;
        byte[] bArr = this.A06;
        System.arraycopy(bArr, 0, this.A05, 0, bArr.length);
        this.A02 = 0;
        this.A08.reset();
    }

    public C22706AtA(B35 b35) {
        super(b35);
        this.A08 = b35;
        int B8o = b35.B8o();
        this.A07 = B8o;
        if (B8o == 8) {
            int B8o2 = b35.B8o();
            this.A06 = new byte[B8o2];
            this.A05 = new byte[B8o2];
            this.A04 = new byte[B8o2];
            return;
        }
        throw AnonymousClass001.A08("GCTR only for 64 bit block ciphers");
    }

    public String B8R() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C165597tg.A1J(A0u, this.A08);
        return AnonymousClass000.A0q("/GCTR", A0u);
    }
}
