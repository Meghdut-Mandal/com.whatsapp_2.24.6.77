package X;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: X.5Qs  reason: invalid class name */
public final class AnonymousClass5Qs extends FilterInputStream {
    public int A00;

    public int read(byte[] bArr, int i, int i2) {
        int i3 = this.A00;
        if (i3 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i, Math.min(i2, i3));
        if (read < 0) {
            return read;
        }
        this.A00 -= read;
        return read;
    }

    public long skip(long j) {
        int skip = (int) super.skip(Math.min(j, (long) this.A00));
        if (skip >= 0) {
            this.A00 -= skip;
        }
        return (long) skip;
    }

    public AnonymousClass5Qs(InputStream inputStream, int i) {
        super(inputStream);
        this.A00 = i;
    }

    public int available() {
        return Math.min(super.available(), this.A00);
    }

    public int read() {
        if (this.A00 <= 0) {
            return -1;
        }
        int read = super.read();
        if (read < 0) {
            return read;
        }
        this.A00--;
        return read;
    }
}
