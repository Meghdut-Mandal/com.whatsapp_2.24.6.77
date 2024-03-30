package X;

/* renamed from: X.At4  reason: case insensitive filesystem */
public class C22700At4 extends AnonymousClass9g1 {
    public int A00;
    public int A01;
    public B3G A02;

    public static byte[] A00(C22700At4 at4, int i, int i2) {
        byte[] bArr;
        byte[] bArr2;
        int length;
        int length2;
        C22700At4 at42 = at4;
        int i3 = at42.A01;
        byte[] bArr3 = new byte[i3];
        byte[] bArr4 = new byte[i2];
        int i4 = 0;
        while (i4 != i3) {
            i4 = C165617ti.A07(bArr3, i, i4);
        }
        byte[] bArr5 = at42.A02;
        if (bArr5 == null || (length2 = bArr5.length) == 0) {
            bArr = new byte[0];
        } else {
            int i5 = i3 * (((length2 + i3) - 1) / i3);
            bArr = new byte[i5];
            for (int i6 = 0; i6 != i5; i6++) {
                C165617ti.A0h(bArr5, bArr, i6 % length2, i6);
            }
        }
        byte[] bArr6 = at42.A01;
        if (bArr6 == null || (length = bArr6.length) == 0) {
            bArr2 = new byte[0];
        } else {
            int i7 = i3 * (((length + i3) - 1) / i3);
            bArr2 = new byte[i7];
            for (int i8 = 0; i8 != i7; i8++) {
                C165617ti.A0h(bArr6, bArr2, i8 % length, i8);
            }
        }
        int length3 = bArr.length;
        int length4 = bArr2.length;
        int i9 = length3 + length4;
        byte[] bArr7 = new byte[i9];
        System.arraycopy(bArr, 0, bArr7, 0, length3);
        System.arraycopy(bArr2, 0, bArr7, length3, length4);
        byte[] bArr8 = new byte[i3];
        int i10 = at42.A00;
        int i11 = ((i2 + i10) - 1) / i10;
        byte[] bArr9 = new byte[i10];
        for (int i12 = 1; i12 <= i11; i12++) {
            B3G b3g = at42.A02;
            b3g.update(bArr3, 0, i3);
            b3g.update(bArr7, 0, i9);
            b3g.B5n(bArr9, 0);
            for (int i13 = 1; i13 < at42.A00; i13++) {
                b3g.update(bArr9, 0, i10);
                b3g.B5n(bArr9, 0);
            }
            for (int i14 = 0; i14 != i3; i14++) {
                C165617ti.A0h(bArr9, bArr8, i14 % i10, i14);
            }
            for (int i15 = 0; i15 != i9 / i3; i15++) {
                int i16 = i3 * i15;
                int i17 = (i3 + i16) - 1;
                int i18 = (bArr8[i3 - 1] & 255) + (bArr7[i17] & 255) + 1;
                bArr7[i17] = (byte) i18;
                int i19 = i18 >>> 8;
                for (int i20 = i3 - 2; i20 >= 0; i20--) {
                    int i21 = i16 + i20;
                    int i22 = i19 + (bArr8[i20] & 255) + (bArr7[i21] & 255);
                    bArr7[i21] = (byte) i22;
                    i19 = i22 >>> 8;
                }
            }
            if (i12 == i11) {
                int i23 = (i12 - 1) * i10;
                System.arraycopy(bArr9, 0, bArr4, i23, i2 - i23);
            } else {
                System.arraycopy(bArr9, 0, bArr4, (i12 - 1) * i10, i10);
            }
        }
        return bArr4;
    }

    public C22700At4(B3G b3g) {
        this.A02 = b3g;
        if (b3g instanceof C23129B6k) {
            this.A00 = b3g.BB8();
            this.A01 = ((C23129B6k) b3g).B96();
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Digest ");
        A0u.append(b3g.B8R());
        throw AnonymousClass000.A0c(" unsupported", A0u);
    }
}
