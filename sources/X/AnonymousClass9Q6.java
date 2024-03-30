package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.9Q6  reason: invalid class name */
public class AnonymousClass9Q6 {
    public byte[] A00;

    public void A00(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(this.A00);
            this.A00 = instance.digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw C90524aI.A0Y(e);
        }
    }

    public AnonymousClass9Q6(byte[] bArr) {
        try {
            this.A00 = bArr.length > 32 ? MessageDigest.getInstance("SHA-256").digest(bArr) : bArr;
        } catch (NoSuchAlgorithmException e) {
            throw C90524aI.A0Y(e);
        }
    }
}
