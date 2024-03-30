package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: X.9jm  reason: invalid class name and case insensitive filesystem */
public final class C201519jm {
    public int A00;
    public int A01;
    public long A02;
    public byte[] A03 = new byte[65536];
    public final long A04;
    public final B39 A05;
    public final byte[] A06 = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];

    public void A02(int i) {
        int min = Math.min(this.A00, i);
        A01(this, min);
        while (min < i) {
            if (min != -1) {
                min = A00(this, this.A06, -min, Math.min(i, ZipDecompressor.UNZIP_BUFFER_SIZE + min), min, false);
            } else {
                return;
            }
        }
        if (min != -1) {
            this.A02 += (long) min;
        }
    }

    public void A03(byte[] bArr, int i, int i2) {
        if (A04(i2, false)) {
            System.arraycopy(this.A03, this.A01 - i2, bArr, i, i2);
        }
    }

    public boolean A04(int i, boolean z) {
        int i2 = i;
        int i3 = this.A01 + i;
        byte[] bArr = this.A03;
        int length = bArr.length;
        if (i3 > length) {
            this.A03 = Arrays.copyOf(bArr, C165607th.A03(length * 2, i3 + 524288, 65536 + i3));
        }
        int i4 = this.A00;
        int i5 = this.A01;
        int i6 = i4 - i5;
        while (i6 < i) {
            i6 = A00(this, this.A03, i5, i2, i6, z);
            if (i6 == -1) {
                return false;
            }
            i5 = this.A01;
            this.A00 = i5 + i6;
        }
        this.A01 = i5 + i;
        return true;
    }

    public boolean A05(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        int i4 = this.A00;
        byte[] bArr2 = bArr;
        int i5 = i;
        int i6 = i2;
        if (i4 == 0) {
            i3 = 0;
        } else {
            i3 = Math.min(i4, i2);
            System.arraycopy(this.A03, 0, bArr, i, i3);
            A01(this, i3);
        }
        while (true) {
            if (i3 < i2) {
                if (i3 == -1) {
                    break;
                }
                i3 = A00(this, bArr2, i5, i6, i3, z);
            } else if (i3 != -1) {
                this.A02 += (long) i3;
                if (i3 == -1) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static void A01(C201519jm r5, int i) {
        int i2 = r5.A00 - i;
        r5.A00 = i2;
        r5.A01 = 0;
        byte[] bArr = r5.A03;
        byte[] bArr2 = bArr;
        if (i2 < bArr.length - 524288) {
            bArr2 = new byte[(65536 + i2)];
        }
        System.arraycopy(bArr, i, bArr2, 0, i2);
        r5.A03 = bArr2;
    }

    public C201519jm(B39 b39, long j, long j2) {
        this.A05 = b39;
        this.A02 = j;
        this.A04 = j2;
    }

    public static int A00(C201519jm r1, byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int read = r1.A05.read(bArr, i + i3, i2 - i3);
            if (read != -1) {
                return i3 + read;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw C165617ti.A0T();
        }
        throw new InterruptedIOException();
    }
}
