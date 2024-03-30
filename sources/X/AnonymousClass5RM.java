package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.File;
import java.io.RandomAccessFile;
import java.security.MessageDigest;

/* renamed from: X.5RM  reason: invalid class name */
public class AnonymousClass5RM extends RandomAccessFile {
    public long A00;
    public byte[] A01;
    public final MessageDigest A02 = C90504aG.A0s();

    public int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        A00(getFilePointer() - ((long) read), bArr, i, read);
        return read;
    }

    public void write(byte[] bArr, int i, int i2) {
        super.write(bArr, i, i2);
        A00(getFilePointer() - ((long) i2), bArr, i, i2);
    }

    private void A00(long j, byte[] bArr, int i, int i2) {
        if (i2 > 0) {
            long j2 = this.A00;
            if (j2 >= j && j2 < ((long) i2) + j) {
                this.A01 = null;
                int i3 = ((int) (j - j2)) + i2;
                this.A02.update(bArr, (i + i2) - i3, i3);
                this.A00 += (long) i3;
                length();
            }
        }
    }

    public String A01() {
        byte[] bArr = this.A01;
        if (bArr == null) {
            seek(this.A00);
            do {
            } while (read(new byte[DefaultCrypto.BUFFER_SIZE], 0, DefaultCrypto.BUFFER_SIZE) != -1);
            bArr = this.A02.digest();
            this.A01 = bArr;
        }
        return C36441kJ.A13(bArr);
    }

    public AnonymousClass5RM(File file, String str) {
        super(file, str);
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
