package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.6C5  reason: invalid class name */
public final class AnonymousClass6C5 {
    public final Integer A00;
    public final PublicKey A01;
    public final X509Certificate A02;
    public final X509Certificate A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6C5) {
                AnonymousClass6C5 r5 = (AnonymousClass6C5) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36351kA.A05(this.A03, C36391kE.A0A(this.A02)) + AnonymousClass000.A0H(this.A01)) * 31) + C36411kG.A09(this.A00);
    }

    public AnonymousClass6C5(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        this.A02 = x509Certificate;
        this.A03 = x509Certificate2;
        this.A01 = publicKey;
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CommonCertificate(encryptionCertificate=");
        A0u.append(this.A02);
        A0u.append(", signature=");
        A0u.append(this.A03);
        A0u.append(", passwordPublicKey=");
        A0u.append(this.A01);
        A0u.append(", passwordKeyId=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
