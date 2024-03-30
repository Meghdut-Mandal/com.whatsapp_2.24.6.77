package org.apache.xml.security.utils;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.OutputStream;

public class UnsyncByteArrayOutputStream extends OutputStream {
    public static ThreadLocal a = new ThreadLocal() {
        public synchronized Object initialValue() {
            return new byte[DefaultCrypto.BUFFER_SIZE];
        }
    };
    public byte[] b = ((byte[]) a.get());
    public int c = DefaultCrypto.BUFFER_SIZE;
    public int d = 0;

    private void a(int i) {
        int i2 = this.c;
        while (i > i2) {
            i2 <<= 2;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.b, 0, bArr, 0, this.d);
        this.b = bArr;
        this.c = i2;
    }

    public byte[] a() {
        int i = this.d;
        byte[] bArr = new byte[i];
        System.arraycopy(this.b, 0, bArr, 0, i);
        return bArr;
    }

    public void b() {
        this.d = 0;
    }

    public void write(int i) {
        int i2 = this.d + 1;
        if (i2 > this.c) {
            a(i2);
        }
        byte[] bArr = this.b;
        int i3 = this.d;
        this.d = i3 + 1;
        bArr[i3] = (byte) i;
    }

    public void write(byte[] bArr) {
        int i = this.d;
        int length = bArr.length;
        int i2 = i + length;
        if (i2 > this.c) {
            a(i2);
        }
        System.arraycopy(bArr, 0, this.b, this.d, length);
        this.d = i2;
    }

    public void write(byte[] bArr, int i, int i2) {
        int i3 = this.d + i2;
        if (i3 > this.c) {
            a(i3);
        }
        System.arraycopy(bArr, i, this.b, this.d, i2);
        this.d = i3;
    }
}
