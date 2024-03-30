package X;

import java.util.Arrays;
import javax.security.auth.Destroyable;

public class AZ8 implements Destroyable {
    public boolean A00;
    public final byte[] A01;

    public void destroy() {
        if (!this.A00) {
            Arrays.fill(this.A01, (byte) 0);
            this.A00 = true;
        }
    }

    public AZ8(byte[] bArr) {
        int length = bArr.length;
        if (length == 32) {
            this.A01 = bArr;
            return;
        }
        throw AnonymousClass000.A0d("Wrong length: ", AnonymousClass000.A0u(), length);
    }

    public byte[] A00() {
        return this.A01;
    }

    public boolean isDestroyed() {
        return this.A00;
    }
}
