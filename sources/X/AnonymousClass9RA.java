package X;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.9RA  reason: invalid class name */
public class AnonymousClass9RA {
    public final byte[] A00;
    public final C201249jC A01;

    public AnonymousClass9U0 A00(C21665AUh aUh, C120595rl r8) {
        byte[] A03 = C200529hY.A03(r8.A00, aUh);
        C201249jC r4 = this.A01;
        byte[] bArr = this.A00;
        try {
            byte[][] A012 = C200539hZ.A01(C201249jC.A01(r4, C165587tf.A0q(bArr).doFinal(A03), "WhisperRatchet".getBytes(), 64), 32, 32);
            return new AnonymousClass9U0(new AnonymousClass9RA(r4, A012[0]), new C201119iu(r4, A012[1], 0));
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw C90524aI.A0Y(e);
        }
    }

    public AnonymousClass9RA(C201249jC r1, byte[] bArr) {
        this.A01 = r1;
        this.A00 = bArr;
    }
}
