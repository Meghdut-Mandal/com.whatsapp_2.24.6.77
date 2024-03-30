package X;

import javax.security.auth.Destroyable;

public class AZA implements Destroyable {
    public boolean A00;
    public final AZ7 A01;
    public final AZ8 A02;

    public static AZA A01(byte[] bArr) {
        if (bArr.length != 64) {
            return null;
        }
        byte[][] A06 = C203239na.A06(bArr, 32, 32);
        return new AZA(new AZ7(A06[0]), new AZ8(A06[1]));
    }

    public byte[] A02() {
        return C203239na.A05(this.A01.A01, this.A02.A01);
    }

    public void destroy() {
        if (!this.A00) {
            this.A01.destroy();
            this.A02.destroy();
            this.A00 = true;
        }
    }

    public AZA(AZ7 az7, AZ8 az8) {
        this.A02 = az8;
        this.A01 = az7;
    }

    public static AZA A00() {
        C160777lZ r0 = C131336Oq.A00().A00;
        byte[] B7p = r0.B7p();
        return new AZA(new AZ7(B7p), new AZ8(r0.generatePublicKey(B7p)));
    }

    public boolean isDestroyed() {
        return this.A00;
    }
}
