package X;

import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Iterator;

/* renamed from: X.7pV  reason: invalid class name and case insensitive filesystem */
public class C163007pV extends InputStream {
    public Object A00;
    public Object A01;
    public final int A02;

    public C163007pV(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void close() {
        if (this.A02 != 0) {
            super.close();
        } else {
            ((InputStream) this.A00).close();
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        if (1 - this.A02 != 0) {
            return super.read(bArr, i, i2);
        }
        return ((RandomAccessFile) this.A01).read(bArr, i, i2);
    }

    public int read() {
        if (this.A02 != 0) {
            return ((RandomAccessFile) this.A01).read();
        }
        return C36341k9.A0A((Iterator) this.A01);
    }

    public int read(byte[] bArr) {
        if (1 - this.A02 != 0) {
            return super.read(bArr);
        }
        return ((RandomAccessFile) this.A01).read(bArr);
    }
}
