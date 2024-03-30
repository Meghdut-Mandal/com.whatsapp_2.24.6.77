package X;

import java.security.SecureRandom;

/* renamed from: X.9Tx  reason: invalid class name and case insensitive filesystem */
public class C195349Tx {
    public int A00;
    public SecureRandom A01;

    public byte[] A01() {
        byte[] bArr = new byte[this.A00];
        this.A01.nextBytes(bArr);
        return bArr;
    }

    public void A00(C192709Ig r2) {
        this.A01 = r2.A01;
        this.A00 = (r2.A00 + 7) / 8;
    }
}
