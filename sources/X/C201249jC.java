package X;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* renamed from: X.9jC  reason: invalid class name and case insensitive filesystem */
public abstract class C201249jC {
    public static C201249jC A00(int i) {
        if (i == 2) {
            return new C22731Auv();
        }
        if (i == 3) {
            return new C22732Auw();
        }
        throw C90524aI.A0Y(AnonymousClass000.A0r("Unknown version: ", AnonymousClass000.A0u(), i));
    }

    public static byte[] A01(C201249jC r8, byte[] bArr, byte[] bArr2, int i) {
        int i2;
        try {
            int ceil = (int) Math.ceil(((double) i) / 32.0d);
            byte[] bArr3 = new byte[0];
            ByteArrayOutputStream A0Q = C90524aI.A0Q();
            if (r8 instanceof C22732Auw) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            int i3 = i2;
            while (i2 < i3 + ceil) {
                Mac A0q = C165587tf.A0q(bArr);
                A0q.update(bArr3);
                if (bArr2 != null) {
                    A0q.update(bArr2);
                }
                A0q.update((byte) i2);
                bArr3 = A0q.doFinal();
                int min = Math.min(i, bArr3.length);
                A0Q.write(bArr3, 0, min);
                i -= min;
                i2++;
            }
            return A0Q.toByteArray();
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw C90524aI.A0Y(e);
        }
    }

    public byte[] A02(byte[] bArr, byte[] bArr2, int i) {
        try {
            return A01(this, C165587tf.A0q(new byte[32]).doFinal(bArr), bArr2, i);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw C90524aI.A0Y(e);
        }
    }
}
