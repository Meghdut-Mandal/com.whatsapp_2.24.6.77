package X;

import com.whatsapp.util.Log;
import java.security.MessageDigest;

/* renamed from: X.9hN  reason: invalid class name and case insensitive filesystem */
public abstract class C200419hN {
    public static byte[] A02(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        C21767Aa0 A00 = A00(bArr, bArr2);
        C21766AZz aZz = new C21766AZz();
        byte[] bArr4 = new byte[32];
        A00.A03(bArr4, bArr4, 0, 32, 0);
        aZz.BKO(new AZr(bArr4));
        byte[] bArr5 = bArr3;
        int length = bArr3.length;
        int max = Math.max(length - 16, 0);
        byte[] bArr6 = new byte[16];
        byte[] bArr7 = new byte[16];
        byte[] bArr8 = new byte[max];
        aZz.update(bArr3, 16, max);
        aZz.B5n(bArr6, 0);
        System.arraycopy(bArr3, 0, bArr7, 0, Math.min(length, 16));
        if (MessageDigest.isEqual(bArr6, bArr7)) {
            A00.A03(bArr5, bArr8, 16, max, 0);
            return bArr8;
        }
        Log.w("XSalsa20Poly1305/decrypt Presented MAC doesn't match calculated MAC (MAC prepended)");
        throw new C21821Aax();
    }

    public static C21767Aa0 A00(byte[] bArr, byte[] bArr2) {
        C21767Aa0 aa0 = new C21767Aa0();
        C21760AZs aZs = new C21760AZs(new AZr(bArr), bArr2);
        byte[] bArr3 = aZs.A01;
        if (bArr3.length == 24) {
            C16590pl r1 = aZs.A00;
            if (r1 == null) {
                boolean z = aa0.A04;
                StringBuilder A0u = AnonymousClass000.A0u();
                if (z) {
                    A0u.append("XSalsa20");
                    throw AnonymousClass000.A0c(" doesn't support re-init with null key", A0u);
                }
                A0u.append("XSalsa20");
                throw AnonymousClass000.A0g(" KeyParameter can not be null for first initialisation", A0u);
            } else if (r1 instanceof AZr) {
                byte[] bArr4 = ((AZr) r1).A00;
                if (bArr4.length == 32) {
                    int i = 16;
                    int[] iArr = aa0.A06;
                    int[] iArr2 = C21767Aa0.A08;
                    iArr[0] = iArr2[4];
                    iArr[5] = iArr2[5];
                    iArr[10] = iArr2[6];
                    iArr[15] = iArr2[7];
                    int i2 = 0;
                    int i3 = 0;
                    do {
                        i3++;
                        iArr[i3] = C165577te.A0B(bArr4, i2);
                        i2 += 4;
                    } while (i3 < 4);
                    int i4 = 0;
                    do {
                        iArr[i4 + 11] = C165577te.A0B(bArr4, i);
                        i += 4;
                        i4++;
                    } while (i4 < 4);
                    int i5 = 0;
                    int i6 = 0;
                    do {
                        iArr[i6 + 6] = C165577te.A0B(bArr3, i5);
                        i5 += 4;
                        i6++;
                    } while (i6 < 2);
                    int i7 = 8;
                    int i8 = 0;
                    do {
                        iArr[i8 + 8] = C165577te.A0B(bArr3, i7);
                        i7 += 4;
                        i8++;
                    } while (i8 < 2);
                    int[] iArr3 = new int[16];
                    C21767Aa0.A02(iArr, iArr3);
                    A01(0, 1, iArr3, iArr);
                    A01(5, 2, iArr3, iArr);
                    A01(10, 3, iArr3, iArr);
                    A01(15, 4, iArr3, iArr);
                    A01(6, 11, iArr3, iArr);
                    A01(7, 12, iArr3, iArr);
                    A01(8, 13, iArr3, iArr);
                    A01(9, 14, iArr3, iArr);
                    int i9 = 16;
                    int i10 = 0;
                    do {
                        iArr[i10 + 6] = C165577te.A0B(bArr3, i9);
                        i9 += 4;
                        i10++;
                    } while (i10 < 2);
                    int i11 = 0;
                    aa0.A03 = 0;
                    aa0.A00 = 0;
                    aa0.A01 = 0;
                    aa0.A02 = 0;
                    iArr[9] = 0;
                    iArr[8] = 0;
                    byte[] bArr5 = aa0.A05;
                    int[] iArr4 = aa0.A07;
                    C21767Aa0.A02(iArr, iArr4);
                    int i12 = 0;
                    do {
                        C165587tf.A1S(bArr5, iArr4[i12], i11);
                        i11 += 4;
                        i12++;
                    } while (i12 < 16);
                    aa0.A04 = true;
                    return aa0;
                }
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("XSalsa20");
                throw AnonymousClass000.A0c(" requires a 256 bit key", A0u2);
            } else {
                StringBuilder A0u3 = AnonymousClass000.A0u();
                A0u3.append("XSalsa20");
                throw AnonymousClass000.A0c(" Init parameters must contain a KeyParameter (or null for re-init)", A0u3);
            }
        } else {
            StringBuilder A0u4 = AnonymousClass000.A0u();
            A0u4.append("XSalsa20");
            A0u4.append(" requires exactly ");
            A0u4.append(24);
            throw AnonymousClass000.A0c(" bytes of IV", A0u4);
        }
    }

    public static void A01(int i, int i2, int[] iArr, int[] iArr2) {
        iArr2[i2] = iArr[i] - iArr2[i];
    }

    public static byte[] A03(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        C21767Aa0 A00 = A00(bArr, bArr2);
        C21766AZz aZz = new C21766AZz();
        byte[] bArr4 = new byte[32];
        A00.A03(bArr4, bArr4, 0, 32, 0);
        int length = bArr3.length;
        byte[] bArr5 = new byte[(length + 16)];
        A00.A03(bArr3, bArr5, 0, length, 16);
        aZz.BKO(new AZr(bArr4));
        aZz.update(bArr5, 16, length);
        aZz.B5n(bArr5, 0);
        return bArr5;
    }
}
