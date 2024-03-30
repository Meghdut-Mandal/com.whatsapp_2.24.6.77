package X;

import android.net.Uri;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: X.83D  reason: invalid class name */
public final class AnonymousClass83D extends A0K implements B39 {
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;

    public AnonymousClass83D() {
        super(false);
    }

    public void close() {
        this.A01 = null;
        try {
            RandomAccessFile randomAccessFile = this.A02;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                A01();
            }
        } catch (IOException e) {
            throw new AnonymousClass5R1(e);
        } catch (Throwable th) {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                A01();
            }
            throw th;
        }
    }

    public long Bks(C202189lD r8) {
        try {
            C196289Yq.A01("fileSrcReadOpen");
            Uri uri = r8.A04;
            this.A01 = uri;
            A02();
            RandomAccessFile randomAccessFile = new RandomAccessFile(uri.getPath(), "r");
            this.A02 = randomAccessFile;
            long j = r8.A03;
            randomAccessFile.seek(j);
            long j2 = r8.A02;
            if (j2 == -1) {
                j2 = this.A02.length() - j;
            }
            this.A00 = j2;
            if (j2 >= 0) {
                C196289Yq.A00();
                this.A03 = true;
                A04(r8);
                return this.A00;
            }
            throw C165617ti.A0T();
        } catch (IOException e) {
            throw new AnonymousClass5R1(e);
        } catch (Throwable th) {
            C196289Yq.A00();
            throw th;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            return -1;
        }
        try {
            C196289Yq.A01("fileSrcReadRAF");
            int read = this.A02.read(bArr, i, (int) Math.min(this.A00, (long) i2));
            C196289Yq.A00();
            if (read <= 0) {
                return read;
            }
            this.A00 -= (long) read;
            A03(read);
            return read;
        } catch (IOException e) {
            throw new AnonymousClass5R1(e);
        } catch (Throwable th) {
            C196289Yq.A00();
            throw th;
        }
    }

    public Uri BIj() {
        return this.A01;
    }
}
