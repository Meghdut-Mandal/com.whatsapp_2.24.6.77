package X;

import android.net.Uri;
import android.util.Base64;
import java.util.Objects;

public final class A0I implements B39 {
    public AnonymousClass83F A00;

    public Uri BIj() {
        return null;
    }

    public void cancel() {
        throw null;
    }

    public long Bks(C202189lD r3) {
        return this.A00.Bks(r3);
    }

    public void close() {
        this.A00.close();
    }

    public int read(byte[] bArr, int i, int i2) {
        return this.A00.read(bArr, i, i2);
    }

    public A0I(String str, String str2) {
        byte[] bArr;
        if (str.isEmpty() || str2.isEmpty()) {
            bArr = new byte[0];
        } else {
            byte[] decode = Base64.decode(str2, 0);
            byte[] decode2 = Base64.decode(str, 0);
            int length = decode2.length;
            int length2 = decode.length;
            bArr = new byte[(length + length2)];
            System.arraycopy(decode2, 0, bArr, 0, length);
            System.arraycopy(decode, 0, bArr, length, length2);
        }
        this.A00 = new AnonymousClass83F(bArr);
    }

    public void B0p(B2E b2e) {
        Objects.requireNonNull(b2e);
        this.A00.B0p(b2e);
    }
}
