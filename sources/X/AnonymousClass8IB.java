package X;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.UnsafeUtil;
import java.io.OutputStream;
import java.util.Objects;

/* renamed from: X.8IB  reason: invalid class name */
public final class AnonymousClass8IB extends CodedOutputStream {
    public int A00;
    public int A01;
    public final int A02;
    public final byte[] A03;
    public final OutputStream A04;

    public static void A03(AnonymousClass8IB r4) {
        r4.A04.write(r4.A03, 0, r4.A00);
        r4.A00 = 0;
    }

    public static void A04(AnonymousClass8IB r2, int i) {
        if (r2.A02 - r2.A00 < i) {
            A03(r2);
        }
    }

    public final void A0M(int i) {
        byte[] bArr = this.A03;
        int i2 = this.A00;
        int i3 = i2 + 1;
        this.A00 = i3;
        C165597tg.A1N(bArr, i, i2);
        int i4 = i3 + 1;
        this.A00 = i4;
        C165597tg.A1N(bArr, i >> 8, i3);
        int i5 = i4 + 1;
        this.A00 = i5;
        C165597tg.A1N(bArr, i >> 16, i4);
        this.A00 = i5 + 1;
        C165597tg.A1N(bArr, i >> 24, i5);
        this.A01 += 4;
    }

    public final void A0N(int i) {
        byte[] bArr;
        int i2;
        int i3;
        byte[] bArr2;
        long j;
        if (CodedOutputStream.A01) {
            long j2 = (long) this.A00;
            while (true) {
                int i4 = i & -128;
                bArr2 = this.A03;
                int i5 = this.A00;
                this.A00 = i5 + 1;
                j = (long) i5;
                if (i4 == 0) {
                    break;
                }
                UnsafeUtil.A09(bArr2, j, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            UnsafeUtil.A09(bArr2, j, (byte) i);
            i3 = this.A01 + ((int) (((long) this.A00) - j2));
        } else {
            while (true) {
                int i6 = i & -128;
                bArr = this.A03;
                i2 = this.A00;
                this.A00 = i2 + 1;
                if (i6 == 0) {
                    break;
                }
                C165597tg.A1O(bArr, i, i2);
                this.A01++;
                i >>>= 7;
            }
            bArr[i2] = (byte) i;
            i3 = this.A01 + 1;
        }
        this.A01 = i3;
    }

    public final void A0O(long j) {
        byte[] bArr = this.A03;
        int i = this.A00;
        int i2 = i + 1;
        this.A00 = i2;
        int A022 = C165617ti.A02((int) (j & 255), bArr, i, i2);
        this.A00 = A022;
        int A023 = C165617ti.A02((int) ((j >> 8) & 255), bArr, i2, A022);
        this.A00 = A023;
        int A024 = C165617ti.A02((int) ((j >> 16) & 255), bArr, A022, A023);
        this.A00 = A024;
        int A025 = C165617ti.A02((int) (255 & (j >> 24)), bArr, A023, A024);
        this.A00 = A025;
        C165577te.A0t(j, bArr, 32, A024);
        int i3 = A025 + 1;
        this.A00 = i3;
        C165577te.A0t(j, bArr, 40, A025);
        int i4 = i3 + 1;
        this.A00 = i4;
        C165577te.A0t(j, bArr, 48, i3);
        this.A00 = i4 + 1;
        C165577te.A0t(j, bArr, 56, i4);
        this.A01 += 8;
    }

    public final void A0P(long j) {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        byte[] bArr2;
        int i4;
        if (CodedOutputStream.A01) {
            long j2 = (long) this.A00;
            while (true) {
                int i5 = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
                bArr2 = this.A03;
                i4 = this.A00;
                this.A00 = i4 + 1;
                if (i5 == 0) {
                    break;
                }
                UnsafeUtil.A09(bArr2, (long) i4, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            UnsafeUtil.A09(bArr2, (long) i4, (byte) ((int) j));
            i3 = this.A01 + ((int) (((long) this.A00) - j2));
        } else {
            while (true) {
                int i6 = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
                bArr = this.A03;
                i = this.A00;
                this.A00 = i + 1;
                i2 = (int) j;
                if (i6 == 0) {
                    break;
                }
                C165597tg.A1O(bArr, i2, i);
                this.A01++;
                j >>>= 7;
            }
            bArr[i] = (byte) i2;
            i3 = this.A01 + 1;
        }
        this.A01 = i3;
    }

    public void A0Q(byte[] bArr, int i, int i2) {
        int i3 = this.A02;
        int i4 = this.A00;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.A03, i4, i2);
            this.A00 += i2;
        } else {
            byte[] bArr2 = this.A03;
            System.arraycopy(bArr, i, bArr2, i4, i5);
            int i6 = i + i5;
            i2 -= i5;
            this.A00 = i3;
            this.A01 += i5;
            A03(this);
            if (i2 <= i3) {
                System.arraycopy(bArr, i6, bArr2, 0, i2);
                this.A00 = i2;
            } else {
                this.A04.write(bArr, i6, i2);
            }
        }
        this.A01 += i2;
    }

    public AnonymousClass8IB(OutputStream outputStream, int i) {
        if (i >= 0) {
            int max = Math.max(i, 20);
            this.A03 = new byte[max];
            this.A02 = max;
            Objects.requireNonNull(outputStream, "out");
            this.A04 = outputStream;
            return;
        }
        throw AnonymousClass001.A08("bufferSize must be >= 0");
    }
}
