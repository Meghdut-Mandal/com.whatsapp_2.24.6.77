package X;

import java.io.EOFException;
import java.io.InputStream;

/* renamed from: X.Ass  reason: case insensitive filesystem */
public class C22688Ass extends C187408xp {
    public static final byte[] A02 = new byte[0];
    public int A00;
    public final int A01;

    public C22688Ass(InputStream inputStream, int i, int i2) {
        super(inputStream, i2);
        this.A01 = i;
        this.A00 = i;
        if (i == 0) {
            A01();
        }
    }

    public static StringBuilder A00(C22688Ass ass) {
        StringBuilder sb = new StringBuilder();
        sb.append("DEF length ");
        sb.append(ass.A01);
        return sb;
    }

    public byte[] A02() {
        int read;
        int i = this.A00;
        if (i == 0) {
            return A02;
        }
        int i2 = this.A00;
        if (i < i2) {
            byte[] bArr = new byte[i];
            InputStream inputStream = this.A01;
            int i3 = 0;
            do {
                read = inputStream.read(bArr, i3, i - i3);
                if (read < 0 || (i3 = i3 + read) >= i) {
                    int i4 = i - i3;
                    this.A00 = i4;
                }
                read = inputStream.read(bArr, i3, i - i3);
                break;
            } while ((i3 = i3 + read) >= i);
            int i42 = i - i3;
            this.A00 = i42;
            if (i42 == 0) {
                A01();
                return bArr;
            }
            throw new EOFException(AnonymousClass000.A0r(" object truncated by ", A00(this), i42));
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("corrupted stream - out of bounds length found: ");
        A0u.append(i);
        throw C90524aI.A0X(AnonymousClass000.A0r(" >= ", A0u, i2));
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3 = this.A00;
        if (i3 == 0) {
            return -1;
        }
        int read = this.A01.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            int i4 = this.A00 - read;
            this.A00 = i4;
            if (i4 != 0) {
                return read;
            }
            A01();
            return read;
        }
        StringBuilder A002 = A00(this);
        A002.append(" object truncated by ");
        throw new EOFException(C36381kD.A10(A002, this.A00));
    }

    public int read() {
        if (this.A00 == 0) {
            return -1;
        }
        int read = this.A01.read();
        if (read >= 0) {
            int i = this.A00 - 1;
            this.A00 = i;
            if (i != 0) {
                return read;
            }
            A01();
            return read;
        }
        StringBuilder A002 = A00(this);
        A002.append(" object truncated by ");
        throw new EOFException(C36381kD.A10(A002, this.A00));
    }
}
