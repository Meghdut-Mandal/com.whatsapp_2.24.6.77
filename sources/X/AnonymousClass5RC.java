package X;

import java.io.InputStream;

/* renamed from: X.5RC  reason: invalid class name */
public class AnonymousClass5RC extends InputStream {
    public boolean A00;
    public final InputStream A01;
    public final InputStream A02;

    public synchronized void mark(int i) {
        throw AnonymousClass001.A0D();
    }

    public boolean markSupported() {
        return false;
    }

    public synchronized void reset() {
        throw AnonymousClass001.A0D();
    }

    public int available() {
        if (this.A00) {
            return this.A02.available();
        }
        return this.A01.available() + this.A02.available();
    }

    public void close() {
        this.A01.close();
        this.A02.close();
    }

    public int read(byte[] bArr, int i, int i2) {
        if (!this.A00) {
            int read = this.A01.read(bArr, i, i2);
            if (read >= 0) {
                return read;
            }
            this.A00 = true;
        }
        return this.A02.read(bArr, i, i2);
    }

    public long skip(long j) {
        if (this.A00) {
            return this.A02.skip(j);
        }
        long skip = this.A01.skip(j);
        if (skip >= j) {
            return skip;
        }
        this.A00 = true;
        return skip + this.A02.skip(j - skip);
    }

    public AnonymousClass5RC(InputStream inputStream, InputStream inputStream2) {
        this.A01 = inputStream;
        this.A02 = inputStream2;
    }

    public int read() {
        if (!this.A00) {
            int read = this.A01.read();
            if (read >= 0) {
                return read;
            }
            this.A00 = true;
        }
        return this.A02.read();
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }
}
