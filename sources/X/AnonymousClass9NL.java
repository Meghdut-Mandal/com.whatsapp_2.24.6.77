package X;

import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.X509Certificate;
import java.util.Date;

/* renamed from: X.9NL  reason: invalid class name */
public class AnonymousClass9NL {
    public final int A00;
    public final PublicKey A01;
    public final CertPath A02;
    public final X509Certificate A03;
    public final Date A04;
    public final AXM A05;

    public AnonymousClass9NL(PublicKey publicKey, CertPath certPath, X509Certificate x509Certificate, Date date, AXM axm, int i) {
        this.A05 = axm;
        this.A04 = date;
        this.A02 = certPath;
        this.A00 = i;
        this.A03 = x509Certificate;
        this.A01 = publicKey;
    }

    public static CertPathValidatorException A00(String str, Throwable th, AnonymousClass9NL r5) {
        return new CertPathValidatorException(str, th, r5.A02, r5.A00);
    }
}
