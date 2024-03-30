package org.apache.xml.security.utils;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.OutputStream;

public class UnsyncBufferedOutputStream extends OutputStream {
    public static ThreadLocal d = new ThreadLocal() {
        public synchronized Object initialValue() {
            return new byte[DefaultCrypto.BUFFER_SIZE];
        }
    };
    public final OutputStream a;
    public final byte[] b = ((byte[]) d.get());
    public int c = 0;

    public UnsyncBufferedOutputStream(OutputStream outputStream) {
        this.a = outputStream;
    }

    private final void a() {
        int i = this.c;
        if (i > 0) {
            this.a.write(this.b, 0, i);
        }
        this.c = 0;
    }

    public void close() {
        flush();
    }

    public void flush() {
        a();
        this.a.flush();
    }

    public void write(int i) {
        if (this.c >= 8192) {
            a();
        }
        byte[] bArr = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        int i3 = this.c + i2;
        if (i3 > 8192) {
            a();
            if (i2 > 8192) {
                this.a.write(bArr, i, i2);
                return;
            }
            i3 = i2;
        }
        System.arraycopy(bArr, i, this.b, this.c, i2);
        this.c = i3;
    }
}
