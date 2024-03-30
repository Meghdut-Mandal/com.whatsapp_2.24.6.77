package X;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;

public class A0J implements B39 {
    public Uri A00;
    public final B39 A01;

    public /* synthetic */ void cancel() {
        throw null;
    }

    public long Bks(C202189lD r3) {
        this.A00 = r3.A04;
        return this.A01.Bks(r3);
    }

    public void close() {
        this.A01.close();
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.A01.read(bArr, i, i2);
        } catch (IOException e) {
            throw e;
        }
    }

    public A0J(B39 b39) {
        this.A01 = b39;
    }

    public void B0p(B2E b2e) {
        Objects.requireNonNull(b2e);
        this.A01.B0p(b2e);
    }

    public Uri BIj() {
        return this.A00;
    }
}
