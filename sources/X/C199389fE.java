package X;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.9fE  reason: invalid class name and case insensitive filesystem */
public class C199389fE {
    public static final byte[] A02 = {2};
    public static final byte[] A03 = {1};
    public final int A00;
    public final byte[] A01;

    public C199389fE A00() {
        try {
            return new C199389fE(this.A00 + 1, C165587tf.A0q(this.A01).doFinal(A02));
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw C90524aI.A0Y(e);
        }
    }

    public AnonymousClass9M5 A01() {
        try {
            return new AnonymousClass9M5(this.A00, C165587tf.A0q(this.A01).doFinal(A03));
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw C90524aI.A0Y(e);
        }
    }

    public C199389fE(int i, byte[] bArr) {
        this.A00 = i;
        this.A01 = bArr;
    }
}
