package X;

import java.io.OutputStream;
import java.io.RandomAccessFile;

/* renamed from: X.5RI  reason: invalid class name */
public class AnonymousClass5RI extends OutputStream {
    public final /* synthetic */ C133176Xc A00;
    public final /* synthetic */ RandomAccessFile A01;

    public AnonymousClass5RI(C133176Xc r1, RandomAccessFile randomAccessFile) {
        this.A00 = r1;
        this.A01 = randomAccessFile;
    }

    public void write(byte[] bArr, int i, int i2) {
        this.A01.write(bArr, i, i2);
    }

    public void write(int i) {
        this.A01.write(i);
    }

    public void write(byte[] bArr) {
        this.A01.write(bArr);
    }
}
