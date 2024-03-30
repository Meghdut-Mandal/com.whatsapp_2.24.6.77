package X;

import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: X.9eP  reason: invalid class name and case insensitive filesystem */
public class C198919eP {
    public static byte[] A06 = {87, 65, 77, 5, 1, 0, 0, 2};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public final C20900yL A04;
    public final RandomAccessFile A05;

    public final int A00(byte[] bArr, int i) {
        int i2 = this.A00;
        int i3 = this.A02;
        if (i > i2 - i3) {
            return 0;
        }
        try {
            RandomAccessFile randomAccessFile = this.A05;
            randomAccessFile.seek(this.A03 + ((long) i3));
            randomAccessFile.write(bArr, 0, i);
            this.A02 += i;
            return i;
        } catch (IOException unused) {
            C20900yL r1 = this.A04;
            r1.A01 = C36371kC.A0m();
            r1.A05();
            return 0;
        }
    }

    public C198919eP(C20900yL r5, RandomAccessFile randomAccessFile, int i, int i2, int i3) {
        this.A05 = randomAccessFile;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A04 = r5;
        long j = 256;
        if (i != 0) {
            try {
                randomAccessFile.seek(60);
                j = 256 + ((long) randomAccessFile.readInt());
            } catch (Exception unused) {
            }
        }
        this.A03 = j;
    }
}
