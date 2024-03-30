package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.AZy  reason: case insensitive filesystem */
public class C21765AZy implements B3H {
    public int A00;
    public int A01;
    public B35 A02;
    public byte[] A03;
    public byte[] A04;
    public byte[] A05;
    public byte[] A06;
    public byte[] A07;
    public byte[] A08;

    private byte[] A00(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int i = length;
        int i2 = 0;
        while (true) {
            i--;
            if (i >= 0) {
                byte b = bArr[i] & 255;
                C165587tf.A1T(bArr2, i2, b << 1, i);
                i2 = (b >>> 7) & 1;
            } else {
                byte b2 = (-i2) & 255;
                int i3 = length - 3;
                byte b3 = bArr2[i3];
                byte[] bArr3 = this.A06;
                C165607th.A1R(bArr2, b3, bArr3[1] & b2, i3);
                int i4 = length - 2;
                C165607th.A1R(bArr2, bArr3[2] & b2, bArr2[i4], i4);
                int i5 = length - 1;
                C165607th.A1R(bArr2, b2 & bArr3[3], bArr2[i5], i5);
                return bArr2;
            }
        }
    }

    public int BDk() {
        return this.A01;
    }

    public void BwT(byte b) {
        int i = this.A00;
        byte[] bArr = this.A04;
        if (i == bArr.length) {
            this.A02.BmM(bArr, this.A05, 0, 0);
            this.A00 = 0;
            i = 0;
        }
        this.A00 = i + 1;
        bArr[i] = b;
    }

    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.A04;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                this.A00 = 0;
                this.A02.reset();
                return;
            }
        }
    }

    public int B5n(byte[] bArr, int i) {
        byte[] bArr2;
        B35 b35 = this.A02;
        int B8o = b35.B8o();
        int i2 = this.A00;
        if (i2 == B8o) {
            bArr2 = this.A07;
        } else {
            new C21775Aa8().B0e(this.A04, i2);
            bArr2 = this.A08;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr3 = this.A05;
            int length = bArr3.length;
            byte[] bArr4 = this.A04;
            if (i3 < length) {
                C165587tf.A1U(bArr4, bArr2, i3);
                i3++;
            } else {
                b35.BmM(bArr4, bArr3, 0, 0);
                int i4 = this.A01;
                System.arraycopy(bArr3, 0, bArr, i, i4);
                reset();
                return i4;
            }
        }
    }

    public void BKO(C16590pl r5) {
        if (r5 == null || (r5 instanceof AZr)) {
            B35 b35 = this.A02;
            b35.BKQ(r5, true);
            byte[] bArr = this.A03;
            byte[] bArr2 = new byte[bArr.length];
            b35.BmM(bArr, bArr2, 0, 0);
            byte[] A002 = A00(bArr2);
            this.A07 = A002;
            this.A08 = A00(A002);
            reset();
            return;
        }
        throw AnonymousClass001.A08("CMac mode only permits key to be set.");
    }

    public void update(byte[] bArr, int i, int i2) {
        if (i2 >= 0) {
            B35 b35 = this.A02;
            int B8o = b35.B8o();
            int i3 = this.A00;
            int i4 = B8o - i3;
            if (i2 > i4) {
                byte[] bArr2 = this.A04;
                System.arraycopy(bArr, i, bArr2, i3, i4);
                byte[] bArr3 = this.A05;
                b35.BmM(bArr2, bArr3, 0, 0);
                this.A00 = 0;
                i2 -= i4;
                i += i4;
                while (i2 > B8o) {
                    b35.BmM(bArr, bArr3, i, 0);
                    i2 -= B8o;
                    i += B8o;
                }
            }
            System.arraycopy(bArr, i, this.A04, this.A00, i2);
            this.A00 += i2;
            return;
        }
        throw AnonymousClass001.A08("Can't have a negative input length!");
    }

    public C21765AZy(B35 b35) {
        int B8o = b35.B8o();
        int i = B8o * 8;
        if (i % 8 != 0) {
            throw AnonymousClass001.A08("MAC size must be multiple of 8");
        } else if (i <= i) {
            this.A02 = new C21749AZd(b35);
            this.A01 = i / 8;
            int i2 = 135;
            switch (i) {
                case 64:
                case 320:
                    i2 = 27;
                    break;
                case 128:
                case 192:
                    break;
                case 160:
                    i2 = 45;
                    break;
                case 224:
                    i2 = 777;
                    break;
                case 256:
                    i2 = 1061;
                    break;
                case 384:
                    i2 = 4109;
                    break;
                case 448:
                    i2 = 2129;
                    break;
                case 512:
                    i2 = 293;
                    break;
                case 768:
                    i2 = 655377;
                    break;
                case EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH:
                    i2 = 524355;
                    break;
                case EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH:
                    i2 = 548865;
                    break;
                default:
                    throw AnonymousClass000.A0d("Unknown block size for CMAC: ", AnonymousClass000.A0u(), i);
            }
            byte[] bArr = new byte[4];
            C202779me.A02(bArr, i2, 0);
            this.A06 = bArr;
            this.A05 = new byte[B8o];
            this.A04 = new byte[B8o];
            this.A03 = new byte[B8o];
            this.A00 = 0;
        } else {
            throw AnonymousClass000.A0d("MAC size must be less or equal to ", AnonymousClass000.A0u(), i);
        }
    }
}
