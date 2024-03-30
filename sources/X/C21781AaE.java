package X;

import java.security.cert.Certificate;
import java.security.cert.PKIXCertPathChecker;

/* renamed from: X.AaE  reason: case insensitive filesystem */
public class C21781AaE implements B20 {
    public final PKIXCertPathChecker A00;

    public C21781AaE(PKIXCertPathChecker pKIXCertPathChecker) {
        this.A00 = pKIXCertPathChecker;
    }

    public void BKg(AnonymousClass9NL r3) {
        this.A00.init(false);
    }

    public void check(Certificate certificate) {
        this.A00.check(certificate);
    }
}
