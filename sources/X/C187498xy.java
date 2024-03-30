package X;

import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;

/* renamed from: X.8xy  reason: invalid class name and case insensitive filesystem */
public class C187498xy extends OutputStream {
    public Signature A00;

    public C187498xy(Signature signature) {
        this.A00 = signature;
    }

    public void write(byte[] bArr, int i, int i2) {
        try {
            this.A00.update(bArr, i, i2);
        } catch (SignatureException e) {
            throw C90524aI.A0X(e.getMessage());
        }
    }

    public void write(int i) {
        try {
            this.A00.update((byte) i);
        } catch (SignatureException e) {
            throw C90524aI.A0X(e.getMessage());
        }
    }

    public void write(byte[] bArr) {
        try {
            this.A00.update(bArr);
        } catch (SignatureException e) {
            throw C90524aI.A0X(e.getMessage());
        }
    }
}
