package X;

import java.security.cert.Certificate;
import java.security.cert.CertificateException;

/* renamed from: X.5fZ  reason: invalid class name and case insensitive filesystem */
public abstract class C113455fZ {
    public static Certificate A00;

    static {
        try {
            A00 = AnonymousClass6HT.A01("signer.crt");
        } catch (CertificateException unused) {
        }
    }
}
