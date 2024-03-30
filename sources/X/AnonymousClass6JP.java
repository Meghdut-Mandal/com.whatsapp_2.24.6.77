package X;

import java.math.BigInteger;

/* renamed from: X.6JP  reason: invalid class name */
public class AnonymousClass6JP {
    public final C000100b A00;

    public static String A00(BigInteger bigInteger) {
        if (bigInteger != null) {
            try {
                byte[] byteArray = bigInteger.toByteArray();
                int length = byteArray.length;
                if (length >= 4) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    for (int i = length - 1; i >= length - 4; i--) {
                        A0u.append(String.format("%02X", new Object[]{Byte.valueOf(byteArray[i])}));
                    }
                    return A0u.toString();
                }
            } catch (Exception e) {
                C36321k7.A1J(e, "PAY: JweCompactSerializer/getCertID: ", AnonymousClass000.A0u());
                return null;
            }
        }
        return null;
    }

    public AnonymousClass6JP(C000100b r1) {
        this.A00 = r1;
    }
}
