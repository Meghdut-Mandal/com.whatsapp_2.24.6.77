package X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.security.auth.Destroyable;

public class AZ9 implements Destroyable {
    public final AtomicBoolean A00 = C36431kI.A1H();
    public final byte[] A01;
    public final byte[] A02;

    public void destroy() {
        if (this.A00.compareAndSet(false, true)) {
            Arrays.fill(this.A01, (byte) 0);
            Arrays.fill(this.A02, (byte) 0);
        }
    }

    public AZ9(byte[] bArr, byte[] bArr2) {
        this.A02 = bArr;
        this.A01 = bArr2;
    }

    public static AZ9 A00() {
        C160777lZ r0 = C131336Oq.A00().A00;
        byte[] B7p = r0.B7p();
        return new AZ9(r0.generatePublicKey(B7p), B7p);
    }
}
