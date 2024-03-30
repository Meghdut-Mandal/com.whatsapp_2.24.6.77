package X;

import android.net.Uri;

public final class A0L implements B39 {
    public long A00;
    public long A01;
    public B5Y A02;
    public byte[] A03;

    public void B0p(B2E b2e) {
    }

    public Uri BIj() {
        return null;
    }

    public long Bks(C202189lD r3) {
        return -1;
    }

    public void cancel() {
        throw null;
    }

    public void close() {
    }

    public int read(byte[] bArr, int i, int i2) {
        int min;
        long j = this.A01;
        if (j == 0 || (min = Math.min(i2, (int) j)) <= 0) {
            return -1;
        }
        System.arraycopy(this.A03, (int) this.A00, bArr, i, min);
        long j2 = (long) min;
        this.A00 += j2;
        this.A01 -= j2;
        return min;
    }
}
