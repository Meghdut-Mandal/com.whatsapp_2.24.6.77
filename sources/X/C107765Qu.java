package X;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* renamed from: X.5Qu  reason: invalid class name and case insensitive filesystem */
public final class C107765Qu extends FilterInputStream {
    public long A00;
    public long A01 = -1;

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.A01 = this.A00;
    }

    public final synchronized void reset() {
        IOException iOException;
        if (!this.in.markSupported()) {
            iOException = C90524aI.A0X("Mark not supported");
        } else if (this.A01 != -1) {
            this.in.reset();
            this.A00 = this.A01;
        } else {
            iOException = C90524aI.A0X("Mark not set");
        }
        throw iOException;
    }

    public final int available() {
        return (int) Math.min((long) this.in.available(), this.A00);
    }

    public final int read(byte[] bArr, int i, int i2) {
        long j = this.A00;
        if (j == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.A00 -= (long) read;
        }
        return read;
    }

    public final long skip(long j) {
        long skip = this.in.skip(Math.min(j, this.A00));
        this.A00 -= skip;
        return skip;
    }

    public C107765Qu(InputStream inputStream) {
        super(inputStream);
        Objects.requireNonNull(inputStream);
        this.A00 = 1048577;
    }

    public final int read() {
        if (this.A00 == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.A00--;
        }
        return read;
    }
}
