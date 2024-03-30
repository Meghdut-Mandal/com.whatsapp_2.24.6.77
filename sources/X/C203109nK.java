package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Objects;

/* renamed from: X.9nK  reason: invalid class name and case insensitive filesystem */
public class C203109nK {
    public static final SecureRandom A04 = new SecureRandom();
    public byte[] A00;
    public final AnonymousClass9OQ A01;
    public final AnonymousClass9NA[] A02;
    public final C193449Lm[] A03;

    public static C203109nK A00(byte[] bArr) {
        byte[] bArr2 = bArr;
        Objects.requireNonNull(bArr2, "bytes may not be null");
        short A022 = A02(bArr2, 0);
        byte b = bArr[2];
        boolean A1P = AnonymousClass000.A1P(b & 128);
        byte b2 = (byte) ((b >> 3) & 15);
        boolean A1P2 = AnonymousClass000.A1P(b & 4);
        boolean A1P3 = AnonymousClass000.A1P(b & 2);
        boolean A1P4 = AnonymousClass000.A1P(b & 1);
        byte b3 = bArr[3];
        byte b4 = b2;
        short s = (short) ((byte) (b3 & 15));
        AnonymousClass9OQ r5 = new AnonymousClass9OQ(b4, A022, s, A02(bArr2, 4), A02(bArr2, 6), A02(bArr2, 8), A02(bArr2, 10), A1P, A1P2, A1P3, A1P4, AnonymousClass000.A1P(b3 & 128));
        int i = 12;
        int i2 = r5.A05;
        C193449Lm[] r8 = new C193449Lm[i2];
        int i3 = 0;
        int i4 = 0;
        while (i4 < i2) {
            Objects.requireNonNull(bArr2, "bytes may not be null");
            C201099is A002 = C201099is.A00(bArr2, i);
            int i5 = A002.A00;
            int i6 = i + i5;
            if (512 >= i6 + 4) {
                r8[i4] = new C193449Lm(A002, i5 + 4, A02(bArr2, i6), A02(bArr2, i6 + 2));
                i += r8[i4].A00;
                i4++;
            } else {
                throw new C221212y("insufficient data");
            }
        }
        int i7 = r5.A03;
        AnonymousClass9NA[] r52 = new AnonymousClass9NA[i7];
        while (i3 < i7) {
            Objects.requireNonNull(bArr2, "bytes may not be null");
            C201099is A003 = C201099is.A00(bArr2, i);
            int i8 = A003.A00;
            int i9 = i + i8;
            int i10 = i9 + 10;
            if (512 >= i10) {
                short A023 = A02(bArr2, i9);
                short A024 = A02(bArr2, i9 + 2);
                int i11 = i9 + 4;
                byte b5 = ((bArr2[i11] << 24) & -16777216) | ((bArr2[i11 + 1] << 16) & 16711680) | ((bArr2[i11 + 2] << 8) & 65280) | (bArr2[i11 + 3] & 255);
                int A025 = A02(bArr2, i9 + 8);
                if (512 >= i10 + A025) {
                    byte[] bArr3 = new byte[A025];
                    System.arraycopy(bArr2, i10, bArr3, 0, A025);
                    r52[i3] = new AnonymousClass9NA(A003, bArr3, b5, i8 + 10 + A025, A023, A024);
                    i += r52[i3].A00;
                    i3++;
                } else {
                    throw new C221212y("insufficient data");
                }
            } else {
                throw new C221212y("insufficient data");
            }
        }
        C203109nK r2 = new C203109nK(r5, r52, r8);
        r2.A00 = bArr2;
        return r2;
    }

    public static C203109nK A01(C193449Lm[] r15) {
        return new C203109nK(new AnonymousClass9OQ((byte) 0, (short) A04.nextInt(65536), 0, 1, 0, 0, 0, false, false, false, true, false), new AnonymousClass9NA[0], r15);
    }

    public static short A02(byte[] bArr, int i) {
        return (short) (((bArr[i] << 8) & 65280) | (bArr[i + 1] & 255));
    }

    public C203109nK(AnonymousClass9OQ r1, AnonymousClass9NA[] r2, C193449Lm[] r3) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
    }

    public static void A03(OutputStream outputStream, short s) {
        outputStream.write((byte) ((65280 & s) >>> 8));
        outputStream.write((byte) (s & 255));
    }

    public static void A04(byte[] bArr, int i, short s) {
        C165597tg.A1N(bArr, s, C165617ti.A07(bArr, (65280 & s) >>> 8, i));
    }

    public byte[] A05() {
        ByteArrayOutputStream A0Q = C90524aI.A0Q();
        try {
            AnonymousClass9OQ r4 = this.A01;
            byte[] bArr = new byte[12];
            Objects.requireNonNull(bArr, "bytes may not be null");
            A04(bArr, 0, r4.A01);
            int i = 0;
            bArr[2] = 0;
            int i2 = 0;
            if (r4.A0A) {
                i2 = 128;
            }
            byte b = (byte) i2;
            bArr[2] = b;
            byte b2 = (byte) (b | ((byte) ((r4.A00 & 15) << 3)));
            bArr[2] = b2;
            byte b3 = 0;
            if (r4.A07) {
                b3 = 4;
            }
            byte b4 = (byte) (b2 | b3);
            bArr[2] = b4;
            byte A032 = (byte) (b4 | C165587tf.A03(r4.A0B ? 1 : 0));
            bArr[2] = A032;
            C165587tf.A1T(bArr, A032, r4.A09 ? 1 : 0, 2);
            bArr[3] = 0;
            if (r4.A08) {
                i = 128;
            }
            byte b5 = (byte) i;
            bArr[3] = b5;
            C165587tf.A1T(bArr, b5, (byte) (r4.A06 & 15), 3);
            A04(bArr, 4, r4.A05);
            A04(bArr, 6, r4.A03);
            A04(bArr, 8, r4.A04);
            A04(bArr, 10, r4.A02);
            A0Q.write(bArr);
            for (C193449Lm r1 : this.A03) {
                r1.A01.A02(A0Q);
                A03(A0Q, r1.A03);
                A03(A0Q, r1.A02);
            }
            for (AnonymousClass9NA r6 : this.A02) {
                r6.A02.A02(A0Q);
                A03(A0Q, r6.A04);
                A03(A0Q, r6.A03);
                int i3 = r6.A01;
                A0Q.write((i3 >>> 24) & 255);
                A0Q.write((i3 >>> 16) & 255);
                A0Q.write((i3 >>> 8) & 255);
                A0Q.write(i3 & 255);
                byte[] bArr2 = r6.A05;
                A03(A0Q, (short) bArr2.length);
                A0Q.write(bArr2);
            }
            return A0Q.toByteArray();
        } catch (IOException unused) {
            return null;
        }
    }
}
