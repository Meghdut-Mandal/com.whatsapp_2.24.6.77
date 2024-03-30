package X;

import android.net.Uri;
import java.util.Map;
import java.util.Objects;

public class A0O implements B5V {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public boolean A05;
    public byte[] A06;
    public C202189lD A07;
    public final int A08;
    public final B5V A09;
    public final int A0A;

    private int A00() {
        C202189lD r11 = this.A07;
        boolean z = true;
        if (r11 != null) {
            long j = r11.A02;
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            long j2 = (long) this.A0A;
            long j3 = j2;
            if (i > 0) {
                j2 = Math.min(j2, j - (this.A04 - r11.A03));
            }
            Uri uri = r11.A04;
            byte[] bArr = r11.A08;
            long j4 = this.A03;
            long j5 = this.A04;
            String str = r11.A06;
            int i2 = r11.A00;
            long Bks = this.A09.Bks(new C202189lD(uri, r11.A05, str, bArr, i2, j4, j5, j2));
            if (Bks < 0 || Bks >= j3) {
                z = false;
            }
            this.A05 = z;
            return (int) Bks;
        }
        throw new AnonymousClass83L(new C202189lD(Uri.EMPTY), "No DataSpec when calling openInnder", 1);
    }

    public Map BGn() {
        return this.A09.BGn();
    }

    public Uri BIj() {
        return this.A09.BIj();
    }

    public long Bks(C202189lD r6) {
        this.A07 = r6;
        this.A06 = new byte[this.A08];
        this.A03 = r6.A01;
        this.A04 = r6.A03;
        int A002 = A00();
        this.A02 = A002;
        this.A00 = 0;
        if (A002 >= 0 && A002 < this.A0A) {
            return (long) A002;
        }
        long j = r6.A02;
        if (j < 0) {
            return -1;
        }
        return j;
    }

    public void cancel() {
        this.A09.cancel();
    }

    public void close() {
        this.A09.close();
        this.A07 = null;
        this.A06 = null;
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        byte[] bArr2 = this.A06;
        if (bArr2 == null || this.A00 < i2) {
            int i6 = 0;
            if (bArr2 == null || (i5 = this.A00) <= 0) {
                i3 = i2;
            } else {
                System.arraycopy(bArr2, this.A01, bArr, i, i5);
                int i7 = this.A00;
                i += i7;
                i3 = i2 - i7;
                this.A00 = 0;
            }
            do {
                int i8 = this.A02;
                if (i8 > 0) {
                    int read = this.A09.read(bArr, i, i3);
                    if (read == -1) {
                        this.A02 = 0;
                        i8 = 0;
                    } else {
                        i += read;
                        i3 -= read;
                        this.A02 -= read;
                        long j = (long) read;
                        this.A04 += j;
                        this.A03 += j;
                    }
                }
                byte[] bArr3 = this.A06;
                if (bArr3 != null) {
                    int i9 = this.A00;
                    if (i4 + i9 <= this.A08) {
                        int i10 = this.A01;
                        if (i10 > 0) {
                            if (i9 > 0) {
                                System.arraycopy(bArr3, i10, bArr3, 0, i9);
                            }
                            this.A01 = 0;
                        }
                        while (true) {
                            i4 = this.A02;
                            if (i4 <= 0) {
                                break;
                            }
                            int read2 = this.A09.read(this.A06, this.A00, i4);
                            if (read2 == -1) {
                                this.A02 = 0;
                                i4 = 0;
                                break;
                            }
                            this.A00 += read2;
                            this.A02 -= read2;
                            long j2 = (long) read2;
                            this.A04 += j2;
                            this.A03 += j2;
                        }
                        if (!this.A05) {
                            this.A09.close();
                            i4 = A00();
                            this.A02 = i4;
                        }
                    }
                    if (this.A00 > 0 || i4 > 0) {
                        int read3 = read(bArr, i, i3);
                        int i11 = i2 - i3;
                        if (read3 != -1) {
                            i6 = read3;
                        }
                        return i11 + i6;
                    }
                    int i12 = i2 - i3;
                    if (i12 > 0) {
                        return i12;
                    }
                    return -1;
                }
                throw new AnonymousClass83L(new C202189lD(Uri.EMPTY), "No internal buffer", 2);
            } while (i3 != 0);
            return i2;
        }
        System.arraycopy(bArr2, this.A01, bArr, i, i2);
        this.A01 += i2;
        this.A00 -= i2;
        return i2;
    }

    public A0O(B5V b5v, int i, int i2) {
        this.A09 = b5v;
        this.A08 = i;
        this.A0A = i2;
    }

    public void B0p(B2E b2e) {
        Objects.requireNonNull(b2e);
        this.A09.B0p(b2e);
    }
}
