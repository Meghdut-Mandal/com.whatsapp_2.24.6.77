package X;

import java.io.InputStream;

/* renamed from: X.5RD  reason: invalid class name */
public final class AnonymousClass5RD extends InputStream {
    public byte[] A00 = new byte[1];
    public long A01;
    public InputStream A02;

    public boolean markSupported() {
        return false;
    }

    public int available() {
        return this.A02.available();
    }

    public void close() {
        this.A02.close();
    }

    public void mark(int i) {
        throw AnonymousClass001.A09("Can't mark");
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.A02.read(bArr, i, i2);
        this.A01 += (long) read;
        return read;
    }

    public void reset() {
        throw AnonymousClass001.A09("Can't reset");
    }

    public long skip(long j) {
        long skip = this.A02.skip(j);
        this.A01 += skip;
        return skip;
    }

    public AnonymousClass5RD(InputStream inputStream, long j) {
        this.A02 = inputStream;
        this.A01 = j;
    }

    public int read() {
        byte[] bArr = this.A00;
        int read = read(bArr, 0, 1);
        if (read == -1) {
            return -1;
        }
        if (read == 1) {
            return bArr[0] & 255;
        }
        throw C90464aC.A0R("OIS unexpected return value: ", AnonymousClass000.A0u(), read);
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }
}
