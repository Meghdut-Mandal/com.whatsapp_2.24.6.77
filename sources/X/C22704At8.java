package X;

/* renamed from: X.At8  reason: case insensitive filesystem */
public class C22704At8 extends C21755AZj {
    public int A00;
    public byte[] A01;
    public byte[] A02;
    public byte[] A03;
    public final int A04;
    public final B35 A05;

    public int B8o() {
        return this.A04;
    }

    public int BmM(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = this.A04;
        A01(bArr, bArr2, i, i3, i2);
        return i3;
    }

    public void reset() {
        byte[] bArr = this.A03;
        System.arraycopy(bArr, 0, this.A02, 0, bArr.length);
        this.A00 = 0;
        this.A05.reset();
    }

    public void BKQ(C16590pl r7, boolean z) {
        if (r7 instanceof C21760AZs) {
            C21760AZs aZs = (C21760AZs) r7;
            byte[] bArr = aZs.A01;
            int length = bArr.length;
            byte[] bArr2 = this.A03;
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
            this.A05.BKQ(r7, true);
        }
    }

    public C22704At8(B35 b35, int i) {
        super(b35);
        if (i > b35.B8o() * 8 || i < 8 || i % 8 != 0) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("0FB");
            A0u.append(i);
            throw AnonymousClass000.A0c(" not supported", A0u);
        }
        this.A05 = b35;
        this.A04 = i / 8;
        int B8o = b35.B8o();
        this.A03 = new byte[B8o];
        this.A02 = new byte[B8o];
        this.A01 = new byte[B8o];
    }

    public String B8R() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C165597tg.A1J(A0u, this.A05);
        A0u.append("/OFB");
        return C36381kD.A10(A0u, this.A04 * 8);
    }
}
