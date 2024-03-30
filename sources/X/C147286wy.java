package X;

import java.security.PublicKey;
import javax.crypto.Cipher;

/* renamed from: X.6wy  reason: invalid class name and case insensitive filesystem */
public class C147286wy implements C22969AzL {
    public final byte[] A00;

    public byte[] B6U(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.A00;
        int length = bArr3.length;
        int length2 = bArr.length;
        if (length >= length2) {
            try {
                PublicKey A0l = C90464aC.A0l(bArr3);
                Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                instance.init(1, A0l);
                return instance.doFinal(bArr);
            } catch (Exception e) {
                throw AnonymousClass001.A0B(e);
            }
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("PAY: RsaKey encrypt: payload length is ");
            A0u.append(length2);
            A0u.append(" bytes while key can encrypt at most ");
            A0u.append(length);
            throw C90524aI.A0Y(C24611Dc.A01("RsaKey", AnonymousClass000.A0q(" bytes", A0u)));
        }
    }

    public C147286wy(byte[] bArr) {
        this.A00 = bArr;
    }
}
