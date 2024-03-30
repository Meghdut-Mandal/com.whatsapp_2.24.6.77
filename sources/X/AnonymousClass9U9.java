package X;

/* renamed from: X.9U9  reason: invalid class name */
public final class AnonymousClass9U9 {
    public int A00;
    public int A01;
    public final byte[] A02;

    public int A00() {
        return ((this.A02.length - this.A01) * 8) - this.A00;
    }

    public int A01(int i) {
        if (i <= 0 || i > 32 || i > A00()) {
            throw AnonymousClass001.A08(String.valueOf(i));
        }
        int i2 = this.A00;
        byte b = 0;
        if (i2 > 0) {
            int i3 = 8 - i2;
            int i4 = i3;
            if (i < i3) {
                i4 = i;
            }
            int i5 = i3 - i4;
            byte[] bArr = this.A02;
            int i6 = this.A01;
            int i7 = (((255 >> (8 - i4)) << i5) & bArr[i6]) >> i5;
            i -= i4;
            i2 += i4;
            this.A00 = i2;
            if (i2 == 8) {
                this.A00 = 0;
                i2 = 0;
                this.A01 = i6 + 1;
            }
            b = i7;
            if (i <= 0) {
                return b;
            }
        }
        while (i >= 8) {
            byte[] bArr2 = this.A02;
            int i8 = this.A01;
            b = (bArr2[i8] & 255) | (b << 8);
            this.A01 = i8 + 1;
            i -= 8;
        }
        if (i <= 0) {
            return b;
        }
        int i9 = 8 - i;
        int i10 = (b << i) | ((((255 >> i9) << i9) & this.A02[this.A01]) >> i9);
        this.A00 = i2 + i;
        return i10;
    }

    public AnonymousClass9U9(byte[] bArr) {
        this.A02 = bArr;
    }
}
