package X;

import java.util.Arrays;
import javax.security.auth.Destroyable;

public class AZ7 implements Destroyable {
    public boolean A00;
    public final byte[] A01;

    public void destroy() {
        if (!this.A00) {
            Arrays.fill(this.A01, (byte) 0);
            this.A00 = true;
        }
    }

    public AZ7(byte[] bArr) {
        this.A01 = bArr;
    }

    public boolean isDestroyed() {
        return this.A00;
    }
}
