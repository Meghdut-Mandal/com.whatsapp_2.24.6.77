package X;

/* renamed from: X.AZw  reason: case insensitive filesystem */
public class C21763AZw implements B3H {
    public int A00;
    public B3G A01;
    public byte[] A02 = new byte[64];
    public byte[] A03 = new byte[64];

    public C21763AZw(B3G b3g) {
        this.A01 = b3g;
        this.A00 = b3g.BB8();
    }

    public int B5n(byte[] bArr, int i) {
        int i2 = this.A00;
        byte[] bArr2 = new byte[i2];
        B3G b3g = this.A01;
        b3g.B5n(bArr2, 0);
        b3g.update(this.A03, 0, 64);
        b3g.update(bArr2, 0, i2);
        int B5n = b3g.B5n(bArr, i);
        reset();
        return B5n;
    }

    public int BDk() {
        return this.A00;
    }

    public void BwT(byte b) {
        this.A01.BwT(b);
    }

    public void reset() {
        B3G b3g = this.A01;
        b3g.reset();
        b3g.update(this.A02, 0, 64);
    }

    public void update(byte[] bArr, int i, int i2) {
        this.A01.update(bArr, i, i2);
    }

    public void BKO(C16590pl r8) {
        byte[] bArr;
        int i;
        B3G b3g = this.A01;
        b3g.reset();
        byte[] bArr2 = ((AZr) r8).A00;
        int length = bArr2.length;
        if (length <= 64) {
            bArr = this.A02;
            System.arraycopy(bArr2, 0, bArr, 0, length);
            while (true) {
                i = 64;
                if (length >= 64) {
                    break;
                }
                bArr[length] = 0;
                length++;
            }
        } else {
            b3g.update(bArr2, 0, length);
            bArr = this.A02;
            b3g.B5n(bArr, 0);
            int i2 = this.A00;
            while (true) {
                i = 64;
                if (i2 >= 64) {
                    break;
                }
                bArr[i2] = 0;
                i2++;
            }
        }
        byte[] bArr3 = new byte[64];
        this.A03 = bArr3;
        System.arraycopy(bArr, 0, bArr3, 0, 64);
        int i3 = 0;
        do {
            i3 = C165617ti.A07(bArr, bArr[i3] ^ 54, i3);
        } while (i3 < i);
        int i4 = 0;
        while (true) {
            byte[] bArr4 = this.A03;
            if (i4 < i) {
                i4 = C165617ti.A07(bArr4, bArr4[i4] ^ 92, i4);
            } else {
                b3g.update(bArr, 0, i);
                return;
            }
        }
    }
}
