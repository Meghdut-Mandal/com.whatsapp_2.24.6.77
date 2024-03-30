package X;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;

public final class AZN implements B6N {
    public final InputStream A00;
    public final C1902897p A01;

    public long Bmp(AU1 au1, long j) {
        String message;
        AnonymousClass00C.A0C(au1, 0);
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i >= 0) {
            try {
                if (!Thread.interrupted()) {
                    C200069gY A04 = au1.A04(1);
                    int i2 = A04.A00;
                    int read = this.A00.read(A04.A06, i2, (int) Math.min(j, (long) (8192 - i2)));
                    if (read == -1) {
                        return -1;
                    }
                    A04.A00 += read;
                    long j2 = (long) read;
                    au1.A00 += j2;
                    return j2;
                }
                C90484aE.A0z();
                throw new InterruptedIOException("interrupted");
            } catch (AssertionError e) {
                if (e.getCause() == null || (message = e.getMessage()) == null || !AnonymousClass099.A0O(message, "getsockname failed", false)) {
                    throw e;
                }
                throw new IOException(e);
            }
        } else {
            throw AnonymousClass001.A08(C36381kD.A0z("byteCount < 0: ", AnonymousClass000.A0u(), j));
        }
    }

    public void close() {
        this.A00.close();
    }

    public AZN(InputStream inputStream, C1902897p r2) {
        this.A00 = inputStream;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("source(");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
