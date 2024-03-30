package X;

import android.net.Uri;
import com.whatsapp.Mp4Ops;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class A0M implements B39 {
    public C132246Su A00;
    public FileInputStream A01;
    public boolean A02;
    public long A03 = 0;
    public final B5V A04;
    public final File A05;
    public final C19700wN A06;
    public final Mp4Ops A07;
    public final AnonymousClass1AV A08;
    public final C19630wG A09;

    public void B0p(B2E b2e) {
    }

    public /* synthetic */ void cancel() {
        throw null;
    }

    public Uri BIj() {
        return this.A04.BIj();
    }

    public long Bks(C202189lD r24) {
        long j;
        C202189lD r5 = r24;
        long j2 = r5.A03;
        this.A03 = j2;
        if (this.A02) {
            File file = this.A05;
            long length = file.length();
            if (this.A03 < length) {
                FileInputStream fileInputStream = new FileInputStream(file);
                this.A01 = fileInputStream;
                fileInputStream.skip(this.A03);
                j = (length - this.A03) + 0;
                Uri uri = r5.A04;
                byte[] bArr = r5.A08;
                r5 = new C202189lD(uri, new C199149em(), r5.A06, bArr, r5.A00, length, length, -1);
            }
            j = 0;
        } else {
            if (j2 != 0) {
                Uri uri2 = r5.A04;
                byte[] bArr2 = r5.A08;
                r5 = new C202189lD(uri2, new C199149em(), r5.A06, bArr2, r5.A00, 0, 0, -1);
            }
            j = 0;
        }
        long Bks = j + this.A04.Bks(r5);
        if (Bks >= 0 && !this.A02) {
            C19630wG r3 = this.A09;
            Mp4Ops mp4Ops = this.A07;
            this.A00 = new C132246Su(this.A06, mp4Ops, this.A08, r3, this.A05, Bks);
        }
        return Bks;
    }

    public void close() {
        this.A04.close();
        FileInputStream fileInputStream = this.A01;
        if (fileInputStream != null) {
            fileInputStream.close();
            this.A01 = null;
        }
        this.A03 = 0;
    }

    public int read(byte[] bArr, int i, int i2) {
        FileInputStream fileInputStream;
        if (this.A00 != null) {
            if (!this.A02) {
                byte[] bArr2 = new byte[256];
                File file = this.A05;
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                while (this.A00.A00 == 0) {
                    try {
                        fileOutputStream.write(bArr2, 0, this.A04.read(bArr2, 0, 256));
                        fileOutputStream.flush();
                        if (!this.A00.A02(file.length())) {
                            this.A02 = AnonymousClass000.A1O(this.A00.A00);
                        }
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                        throw th;
                    }
                }
                if (this.A02) {
                    fileOutputStream.close();
                } else {
                    throw C90524aI.A0X("Mp4StreamCheckedHeroDataSource/Mp4StreamCheck not successful");
                }
            }
            File file2 = this.A05;
            long length = file2.length();
            if (length <= 0) {
                throw C90524aI.A0X("Mp4StreamCheckedHeroDataSource/videoHeadForStreamCheck is empty");
            } else if (this.A03 < length) {
                FileInputStream fileInputStream2 = this.A01;
                if (fileInputStream2 == null) {
                    fileInputStream2 = new FileInputStream(file2);
                    this.A01 = fileInputStream2;
                }
                int read = fileInputStream2.read(bArr, i, i2);
                long j = this.A03 + ((long) read);
                this.A03 = j;
                if (j >= length && (fileInputStream = this.A01) != null) {
                    fileInputStream.close();
                    this.A01 = null;
                }
                return read;
            } else {
                int read2 = this.A04.read(bArr, i, i2);
                this.A03 += (long) read2;
                return read2;
            }
        } else {
            throw C90524aI.A0X("Mp4StreamCheckedHeroDataSource/Mp4StreamCheck not initialized");
        }
    }

    public A0M(C19700wN r7, Mp4Ops mp4Ops, AnonymousClass1AV r9, C19630wG r10, String str) {
        this.A07 = mp4Ops;
        this.A06 = r7;
        this.A09 = r10;
        this.A08 = r9;
        A0H a0h = new A0H(str);
        this.A04 = new AnonymousClass83J(a0h.A00, (B2E) null, a0h.A01, 8000, 8000);
        this.A05 = C36441kJ.A0w(r10.A00.getExternalCacheDir(), C36361kB.A0l());
    }
}
