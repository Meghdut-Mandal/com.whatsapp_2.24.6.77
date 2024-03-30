package X;

import java.io.InputStream;

/* renamed from: X.Asr  reason: case insensitive filesystem */
public class C22687Asr extends C187408xp {
    public boolean A00 = true;
    public int A01;
    public int A02;
    public boolean A03 = false;

    public static boolean A00(C22687Asr asr) {
        if (!asr.A03 && asr.A00 && asr.A01 == 0 && asr.A02 == 0) {
            asr.A03 = true;
            asr.A01();
        }
        return asr.A03;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (this.A00 || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.A03) {
            return -1;
        }
        InputStream inputStream = this.A01;
        int read = inputStream.read(bArr, i + 2, i2 - 2);
        if (read >= 0) {
            bArr[C165617ti.A07(bArr, this.A01, i)] = (byte) this.A02;
            this.A01 = inputStream.read();
            int read2 = inputStream.read();
            this.A02 = read2;
            if (read2 >= 0) {
                return read + 2;
            }
            throw C165617ti.A0T();
        }
        throw C165617ti.A0T();
    }

    public C22687Asr(InputStream inputStream, int i) {
        super(inputStream, i);
        this.A01 = inputStream.read();
        int read = inputStream.read();
        this.A02 = read;
        if (read >= 0) {
            A00(this);
            return;
        }
        throw C165617ti.A0T();
    }

    public int read() {
        if (A00(this)) {
            return -1;
        }
        int read = this.A01.read();
        if (read >= 0) {
            int i = this.A01;
            this.A01 = this.A02;
            this.A02 = read;
            return i;
        }
        throw C165617ti.A0T();
    }
}
