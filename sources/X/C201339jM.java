package X;

/* renamed from: X.9jM  reason: invalid class name and case insensitive filesystem */
public final class C201339jM {
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public C201339jM(byte[] bArr) {
        int length = bArr.length;
        this.A03 = bArr;
        this.A01 = length;
    }

    public int A01(int i) {
        int i2 = this.A00 + i;
        this.A00 = i2;
        int i3 = 0;
        while (i2 > 8) {
            i2 -= 8;
            this.A00 = i2;
            byte[] bArr = this.A03;
            int i4 = this.A02;
            this.A02 = i4 + 1;
            i3 |= (bArr[i4] & 255) << i2;
        }
        byte[] bArr2 = this.A03;
        int i5 = this.A02;
        int i6 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i5] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.A00 = 0;
            this.A02 = i5 + 1;
        }
        A00(this);
        return i6;
    }

    public static void A00(C201339jM r2) {
        boolean z;
        int i;
        int i2 = r2.A02;
        if (i2 < 0 || (i2 >= (i = r2.A01) && !(i2 == i && r2.A00 == 0))) {
            z = false;
        } else {
            z = true;
        }
        C200319h9.A02(z);
    }

    public boolean A02() {
        byte[] bArr = this.A03;
        int i = this.A02;
        byte b = bArr[i];
        int i2 = this.A00;
        boolean A1P = AnonymousClass000.A1P(b & (128 >> i2));
        int i3 = i2 + 1;
        this.A00 = i3;
        if (i3 == 8) {
            this.A00 = 0;
            this.A02 = i + 1;
        }
        A00(this);
        return A1P;
    }

    public C201339jM() {
    }
}
