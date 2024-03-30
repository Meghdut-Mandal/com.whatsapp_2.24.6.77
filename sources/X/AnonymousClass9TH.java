package X;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.9TH  reason: invalid class name */
public class AnonymousClass9TH {
    public static byte[] A00(AnonymousClass9TH r2, C21224ADg aDg, String str, byte[] bArr, byte[] bArr2) {
        return r2.A02(bArr2, C203439o1.A0A(str, bArr, aDg.A04), aDg.A04);
    }

    public byte[] A01(byte[] bArr, byte[] bArr2) {
        String replace = "SHA-256".replace("-", "");
        try {
            Mac instance = Mac.getInstance(C36321k7.A0D("Hmac", replace));
            instance.init(new SecretKeySpec(bArr, C36321k7.A0D("Hmac", replace)));
            return instance.doFinal(bArr2);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw C90524aI.A0Y(e);
        }
    }

    public byte[] A02(byte[] bArr, byte[] bArr2, int i) {
        String replace = "SHA-256".replace("-", "");
        try {
            int ceil = (int) Math.ceil(((double) i) / ((double) 32));
            byte[] bArr3 = new byte[0];
            ByteArrayOutputStream A0Q = C90524aI.A0Q();
            for (int i2 = 1; i2 < ceil + 1; i2++) {
                Mac instance = Mac.getInstance(C36321k7.A0D("Hmac", replace));
                instance.init(new SecretKeySpec(bArr, C36321k7.A0D("Hmac", replace)));
                instance.update(bArr3);
                if (bArr2 != null) {
                    instance.update(bArr2);
                }
                instance.update((byte) i2);
                bArr3 = instance.doFinal();
                int min = Math.min(i, bArr3.length);
                A0Q.write(bArr3, 0, min);
                i -= min;
            }
            return A0Q.toByteArray();
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw C90524aI.A0Y(e);
        }
    }
}
