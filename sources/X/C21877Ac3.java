package X;

import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.X509CRLSelector;

/* renamed from: X.Ac3  reason: case insensitive filesystem */
public class C21877Ac3 extends X509CRLSelector {
    public final C21794AaR A00;

    public boolean match(CRL crl) {
        C21794AaR aaR = this.A00;
        if (aaR == null) {
            return AnonymousClass000.A1V(crl);
        }
        return aaR.BPQ(crl);
    }

    public C21877Ac3(C21794AaR aaR) {
        this.A00 = aaR;
        CRLSelector cRLSelector = aaR.A00;
        if (cRLSelector instanceof X509CRLSelector) {
            X509CRLSelector x509CRLSelector = (X509CRLSelector) cRLSelector;
            setCertificateChecking(x509CRLSelector.getCertificateChecking());
            setDateAndTime(x509CRLSelector.getDateAndTime());
            setIssuers(x509CRLSelector.getIssuers());
            setMinCRLNumber(x509CRLSelector.getMinCRL());
            setMaxCRLNumber(x509CRLSelector.getMaxCRL());
        }
    }
}
