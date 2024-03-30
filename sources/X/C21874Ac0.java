package X;

import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.PKIXRevocationChecker;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Ac0  reason: case insensitive filesystem */
public class C21874Ac0 extends PKIXRevocationChecker implements B20 {
    public static final Map A04;
    public AnonymousClass9NL A00;
    public final C22844Awt A01;
    public final C21782AaF A02;
    public final C21783AaG A03;

    public C21874Ac0(C22844Awt awt) {
        this.A01 = awt;
        this.A02 = new C21782AaF(awt);
        this.A03 = new C21783AaG(awt, this);
    }

    public void BKg(AnonymousClass9NL r2) {
        this.A00 = r2;
        this.A02.BKg(r2);
        this.A03.BKg(r2);
    }

    public void check(Certificate certificate, Collection collection) {
        X509Certificate x509Certificate = (X509Certificate) certificate;
        if (!getOptions().contains(PKIXRevocationChecker.Option.ONLY_END_ENTITY) || x509Certificate.getBasicConstraints() == -1) {
            if (getOptions().contains(PKIXRevocationChecker.Option.PREFER_CRLS)) {
                try {
                    this.A02.check(certificate);
                } catch (C21870Abu e) {
                    e = e;
                    if (!getOptions().contains(PKIXRevocationChecker.Option.NO_FALLBACK)) {
                        this.A03.check(certificate);
                        return;
                    }
                    throw e;
                }
            } else {
                try {
                    this.A03.check(certificate);
                } catch (C21870Abu e2) {
                    e = e2;
                    if (!getOptions().contains(PKIXRevocationChecker.Option.NO_FALLBACK)) {
                        this.A02.check(certificate);
                        return;
                    }
                    throw e;
                }
            }
        }
    }

    public Set getSupportedExtensions() {
        return null;
    }

    public void init(boolean z) {
        this.A00 = null;
        C21782AaF aaF = this.A02;
        if (!z) {
            aaF.A01 = null;
            aaF.A00 = new Date();
            C21783AaG aaG = this.A03;
            aaG.A01 = null;
            aaG.A02 = C200679hw.A01("ocsp.enable");
            aaG.A00 = C200679hw.A00("ocsp.responderURL");
            return;
        }
        throw new CertPathValidatorException("forward checking not supported");
    }

    public boolean isForwardCheckingSupported() {
        return false;
    }

    public List getSoftFailExceptions() {
        Map map = C21783AaG.A05;
        return null;
    }

    static {
        HashMap A0J = AnonymousClass001.A0J();
        A04 = A0J;
        A0J.put(C165617ti.A0f("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        A0J.put(C219311y.A2D, "SHA224WITHRSA");
        A0J.put(C219311y.A2E, "SHA256WITHRSA");
        C165577te.A1L(C219311y.A2F, A0J);
        C165577te.A1K(B4L.A0G, A0J);
    }
}
