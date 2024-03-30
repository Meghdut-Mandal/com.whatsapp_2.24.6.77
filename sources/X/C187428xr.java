package X;

import java.io.InputStream;

/* renamed from: X.8xr  reason: invalid class name and case insensitive filesystem */
public class C187428xr extends InputStream {
    public boolean A00 = false;
    public final InputStream A01;
    public final C21767Aa0 A02;
    public final C21766AZz A03;

    public void close() {
        this.A01.close();
    }

    public int read(byte[] bArr, int i, int i2) {
        if (this.A00) {
            return -1;
        }
        byte[] bArr2 = bArr;
        int i3 = i;
        int read = this.A01.read(bArr, i, i2);
        if (read == -1) {
            this.A03.B5n(bArr, i);
            this.A00 = true;
            return 16;
        }
        if (read > 0) {
            this.A02.A03(bArr2, bArr, i3, read, i);
            this.A03.update(bArr, i, read);
        }
        return read;
    }

    public C187428xr(InputStream inputStream, byte[] bArr, byte[] bArr2) {
        C21766AZz aZz = new C21766AZz();
        this.A03 = aZz;
        this.A01 = inputStream;
        C21767Aa0 A002 = C200419hN.A00(bArr, bArr2);
        this.A02 = A002;
        byte[] bArr3 = new byte[32];
        A002.A03(bArr3, bArr3, 0, 32, 0);
        aZz.BKO(new AZr(bArr3));
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read() {
        byte[] bArr = new byte[1];
        while (true) {
            int read = read(bArr, 0, 1);
            if (read == -1) {
                return -1;
            }
            if (read != 0) {
                return bArr[0];
            }
            Thread.yield();
        }
    }
}
