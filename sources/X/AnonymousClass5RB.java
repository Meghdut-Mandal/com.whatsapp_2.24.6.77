package X;

import android.text.TextUtils;
import java.io.InputStream;
import java.util.Locale;

/* renamed from: X.5RB  reason: invalid class name */
public class AnonymousClass5RB extends InputStream {
    public long A00;
    public final long A01;
    public final InputStream A02;

    public int read(byte[] bArr, int i, int i2) {
        long j = this.A00;
        long j2 = this.A01;
        if (((long) i2) + j > j2) {
            i2 = (int) (j2 - j);
        }
        if (i2 <= 0) {
            return -1;
        }
        int read = this.A02.read(bArr, i, i2);
        if (read <= 0) {
            return read;
        }
        this.A00 += (long) read;
        return read;
    }

    public int available() {
        long j = this.A00;
        long j2 = this.A01;
        if (j < j2) {
            return this.A02.available();
        }
        Locale locale = Locale.ENGLISH;
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = Long.valueOf(j2);
        AnonymousClass000.A1M(A0M, 1, j);
        C90494aF.A1J("bounded-input-stream/available size-limit:%d already-read:%d, returning 0", locale, A0M);
        return 0;
    }

    public void close() {
        this.A02.close();
    }

    public void mark(int i) {
        this.A02.mark(i);
    }

    public boolean markSupported() {
        return this.A02.markSupported();
    }

    public void reset() {
        this.A02.reset();
    }

    public long skip(long j) {
        long j2 = this.A00;
        long j3 = this.A01;
        if (j2 + j > j3) {
            Locale locale = Locale.ENGLISH;
            Object[] A0M = AnonymousClass001.A0M();
            AnonymousClass000.A1M(A0M, 0, j);
            AnonymousClass000.A1M(A0M, 1, j3 - j2);
            C90494aF.A1J("bounded-input-stream/skip/bytes-truncated-from-%d-to-%d", locale, A0M);
            j = Math.max(j3 - this.A00, 0);
        }
        return super.skip(j);
    }

    public AnonymousClass5RB(InputStream inputStream, long j) {
        C36321k7.A1V("bounded-input-stream/construct/", AnonymousClass000.A0u(), j);
        TextUtils.join(", ", Thread.currentThread().getStackTrace());
        this.A02 = inputStream;
        this.A01 = j;
    }

    public int read() {
        long j = this.A00;
        long j2 = this.A01;
        if (j >= j2) {
            Locale locale = Locale.ENGLISH;
            Object[] A0M = AnonymousClass001.A0M();
            AnonymousClass000.A1M(A0M, 0, j2);
            AnonymousClass000.A1M(A0M, 1, j);
            C90494aF.A1J("bounded-input-stream/read size-limit:%d already-read:%d, returning -1", locale, A0M);
            return -1;
        }
        int read = this.A02.read();
        if (read < 0) {
            return read;
        }
        this.A00++;
        return read;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }
}
