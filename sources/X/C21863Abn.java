package X;

import java.security.MessageDigest;

/* renamed from: X.Abn  reason: case insensitive filesystem */
public abstract class C21863Abn extends MessageDigest {
    public int A00;
    public B3G A01;

    public C21863Abn(B3G b3g) {
        super(b3g.B8R());
        this.A01 = b3g;
        this.A00 = b3g.BB8();
    }

    public byte[] engineDigest() {
        byte[] bArr = new byte[this.A00];
        this.A01.B5n(bArr, 0);
        return bArr;
    }

    public int engineGetDigestLength() {
        return this.A00;
    }

    public void engineReset() {
        this.A01.reset();
    }

    public void engineUpdate(byte b) {
        this.A01.BwT(b);
    }

    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.A01.update(bArr, i, i2);
    }
}
