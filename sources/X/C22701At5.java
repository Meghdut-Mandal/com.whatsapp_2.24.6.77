package X;

/* renamed from: X.At5  reason: case insensitive filesystem */
public class C22701At5 extends AnonymousClass9g1 {
    public B3H A00;
    public byte[] A01;

    public static byte[] A00(C22701At5 at5, int i) {
        int i2 = i;
        B3H b3h = at5.A00;
        int BDk = b3h.BDk();
        int i3 = ((i2 + BDk) - 1) / BDk;
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[(i3 * BDk)];
        b3h.BKO(new AZr(at5.A01));
        int i4 = 0;
        int i5 = 1;
        while (i5 <= i3) {
            int i6 = 3;
            while (true) {
                byte b = (byte) (bArr[i6] + 1);
                bArr[i6] = b;
                if (b != 0) {
                    break;
                }
                i6--;
            }
            byte[] bArr3 = at5.A02;
            int i7 = at5.A00;
            if (i7 != 0) {
                if (bArr3 != null) {
                    b3h.update(bArr3, 0, bArr3.length);
                }
                b3h.update(bArr, 0, 4);
                byte[] bArr4 = at5.A01;
                b3h.B5n(bArr4, 0);
                int length = bArr4.length;
                System.arraycopy(bArr4, 0, bArr2, i4, length);
                for (int i8 = 1; i8 < i7; i8++) {
                    b3h.update(bArr4, 0, length);
                    b3h.B5n(bArr4, 0);
                    for (int i9 = 0; i9 != length; i9++) {
                        int i10 = i4 + i9;
                        C165607th.A1R(bArr2, bArr4[i9], bArr2[i10], i10);
                    }
                }
                i4 += BDk;
                i5++;
            } else {
                throw AnonymousClass001.A08("iteration count must be at least 1.");
            }
        }
        return bArr2;
    }

    public C22701At5(B3G b3g) {
        C21764AZx aZx = new C21764AZx(b3g);
        this.A00 = aZx;
        this.A01 = new byte[aZx.A01];
    }

    public C22701At5() {
        this(new C22710AtE());
    }
}
