package X;

import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathChecker;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.PKIXRevocationChecker;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.Abx  reason: case insensitive filesystem */
public class C21872Abx extends CertPathValidatorSpi {
    public final C22844Awt A00;
    public final boolean A01;

    public C21872Abx() {
        this(false);
    }

    public C21872Abx(boolean z) {
        this.A00 = new C21786AaJ();
        this.A01 = z;
    }

    public static void A00(X509Certificate x509Certificate) {
        if (x509Certificate instanceof C22843Aws) {
            RuntimeException e = null;
            try {
                if (((C21879Ac5) ((C22843Aws) x509Certificate)).c.A03 != null) {
                    return;
                }
            } catch (RuntimeException e2) {
                e = e2;
            }
            throw C1890191s.A00("unable to process TBSCertificate", e);
        }
        try {
            C22617Arj.A00(x509Certificate.getTBSCertificate());
        } catch (CertificateEncodingException e3) {
            throw C1890191s.A00("unable to process TBSCertificate", e3);
        } catch (IllegalArgumentException e4) {
            throw C1890191s.A00(e4.getMessage(), (Throwable) null);
        }
    }

    public /* bridge */ /* synthetic */ CertPathChecker engineGetRevocationChecker() {
        return new C21874Ac0(this.A00);
    }

    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) {
        AXM axm;
        C22641As7 as7;
        PublicKey publicKey;
        HashSet A16;
        HashSet A162;
        CertPathParameters certPathParameters2 = certPathParameters;
        if (certPathParameters2 instanceof PKIXParameters) {
            axm = new AXM(new C198259dA((PKIXParameters) certPathParameters2));
        } else if (certPathParameters2 instanceof AXL) {
            axm = ((AXL) certPathParameters2).A02;
        } else if (certPathParameters2 instanceof AXM) {
            axm = (AXM) certPathParameters2;
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Parameters must be a ");
            C165597tg.A1F(PKIXParameters.class, A0u);
            throw C165617ti.A0c(AnonymousClass000.A0q(" instance.", A0u));
        }
        Set set = axm.A08;
        if (set != null) {
            CertPath certPath2 = certPath;
            List<? extends Certificate> certificates = certPath2.getCertificates();
            int size = certificates.size();
            X509Certificate x509Certificate = null;
            if (!certificates.isEmpty()) {
                Date date = new Date();
                String str = C203669oV.A01;
                Date date2 = axm.A03;
                if (date2 != null) {
                    date = new Date(date2.getTime());
                }
                PKIXParameters pKIXParameters = axm.A01;
                Set<String> initialPolicies = pKIXParameters.getInitialPolicies();
                try {
                    TrustAnchor A012 = C203669oV.A01(pKIXParameters.getSigProvider(), (X509Certificate) certificates.get(C36421kH.A06(certificates, 1)), set);
                    if (A012 != null) {
                        A00(A012.getTrustedCert());
                        C198259dA r1 = new C198259dA(axm);
                        r1.A05 = Collections.singleton(A012);
                        AXM axm2 = new AXM(r1);
                        ArrayList A0I = AnonymousClass001.A0I();
                        PKIXParameters pKIXParameters2 = axm2.A01;
                        B20 b20 = null;
                        for (PKIXCertPathChecker next : pKIXParameters2.getCertPathCheckers()) {
                            next.init(false);
                            if (!(next instanceof PKIXRevocationChecker)) {
                                A0I.add(next);
                            } else if (b20 != null) {
                                throw new CertPathValidatorException("only one PKIXRevocationChecker allowed");
                            } else if (next instanceof B20) {
                                b20 = (B20) next;
                            } else {
                                b20 = new C21781AaE(next);
                            }
                        }
                        if (axm2.A0A && b20 == null) {
                            b20 = new C21874Ac0(this.A00);
                        }
                        int i = size + 1;
                        ArrayList[] arrayListArr = new ArrayList[i];
                        for (int i2 = 0; i2 < i; i2++) {
                            arrayListArr[i2] = AnonymousClass001.A0I();
                        }
                        HashSet A163 = C36441kJ.A16();
                        A163.add("2.5.29.32.0");
                        AXN axn = new AXN("2.5.29.32.0", (PolicyNode) null, AnonymousClass001.A0I(), A163, C36441kJ.A16(), 0, false);
                        arrayListArr[0].add(axn);
                        AnonymousClass9Y9 r17 = new AnonymousClass9Y9();
                        HashSet A164 = C36441kJ.A16();
                        int i3 = i;
                        if (pKIXParameters2.isExplicitPolicyRequired()) {
                            i3 = 0;
                        }
                        int i4 = i;
                        if (pKIXParameters2.isAnyPolicyInhibited()) {
                            i4 = 0;
                        }
                        if (pKIXParameters2.isPolicyMappingInhibited()) {
                            i = 0;
                        }
                        X509Certificate trustedCert = A012.getTrustedCert();
                        if (trustedCert != null) {
                            try {
                                as7 = C201789kO.A02(trustedCert);
                                publicKey = trustedCert.getPublicKey();
                            } catch (RuntimeException e) {
                                throw C21871Abv.A00("Subject of trust anchor could not be (re)encoded.", e, certPath2, -1);
                            }
                        } else {
                            as7 = C201789kO.A03(A012.getCA());
                            publicKey = A012.getCAPublicKey();
                        }
                        try {
                            C203669oV.A08(publicKey);
                            C21793AaQ aaQ = axm2.A09;
                            if (aaQ != null) {
                                if (!aaQ.A00.match((Certificate) certificates.get(0))) {
                                    throw C21871Abv.A00("Target certificate in certification path does not match targetConstraints.", (Throwable) null, certPath2, 0);
                                }
                            }
                            int size2 = certificates.size() - 1;
                            int i5 = size;
                            while (size2 >= 0) {
                                int i6 = size - size2;
                                x509Certificate = (X509Certificate) certificates.get(size2);
                                boolean A1S = AnonymousClass000.A1S(size2, C36431kI.A07(certificates));
                                try {
                                    A00(x509Certificate);
                                    C203789os.A0A(publicKey, certPath2, trustedCert, date, as7, b20, axm2, size2, A1S);
                                    boolean z = this.A01;
                                    C203789os.A0I(certPath2, r17, size2, z);
                                    axn = C203789os.A08(certPath2, C203789os.A07(certPath2, A164, axn, arrayListArr, size2, i4, z), size2);
                                    if (i3 > 0 || axn != null) {
                                        if (i6 != size) {
                                            if (x509Certificate == null || x509Certificate.getVersion() != 1) {
                                                C203789os.A0C(certPath2, size2);
                                                axn = C203789os.A09(certPath2, axn, arrayListArr, size2, i);
                                                C203789os.A0H(certPath2, r17, size2);
                                                int A03 = C165567td.A03(certPath2, size2, i3);
                                                int A032 = C165567td.A03(certPath2, size2, i);
                                                int A033 = C165567td.A03(certPath2, size2, i4);
                                                i3 = C203789os.A00(certPath2, size2, A03);
                                                i = C203789os.A01(certPath2, size2, A032);
                                                i4 = C203789os.A02(certPath2, size2, A033);
                                                C203789os.A0D(certPath2, size2);
                                                if (!C165607th.A1W(C165577te.A0n(certPath2, size2))) {
                                                    if (i5 > 0) {
                                                        i5--;
                                                    } else {
                                                        throw C21871Abv.A00("Max path length not greater than zero", (Throwable) null, certPath2, size2);
                                                    }
                                                }
                                                i5 = C203789os.A03(certPath2, size2, i5);
                                                C203789os.A0E(certPath2, size2);
                                                Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
                                                if (criticalExtensionOIDs != null) {
                                                    A162 = C90524aI.A0k(criticalExtensionOIDs);
                                                    C165567td.A1U(A162);
                                                } else {
                                                    A162 = C36441kJ.A16();
                                                }
                                                C203789os.A0F(certPath2, A0I, A162, size2);
                                                as7 = C201789kO.A02(x509Certificate);
                                                try {
                                                    publicKey = C203669oV.A00(certPath2.getCertificates(), this.A00, size2);
                                                    C203669oV.A08(publicKey);
                                                    trustedCert = x509Certificate;
                                                } catch (CertPathValidatorException e2) {
                                                    throw new CertPathValidatorException("Next working key could not be retrieved.", e2, certPath2, size2);
                                                }
                                            } else if (i6 != 1 || !x509Certificate.equals(A012.getTrustedCert())) {
                                                throw new CertPathValidatorException("Version 1 certificates can't be used as CA ones.", (Throwable) null, certPath2, size2);
                                            }
                                        }
                                        size2--;
                                    } else {
                                        throw C21871Abv.A00("No valid policy tree found when one expected.", (Throwable) null, certPath2, size2);
                                    }
                                } catch (C1890191s e3) {
                                    throw new CertPathValidatorException(e3.getMessage(), e3._underlyingException, certPath2, size2);
                                }
                            }
                            Class cls = C203789os.A00;
                            if (!C165607th.A1W(x509Certificate) && i3 != 0) {
                                i3--;
                            }
                            int i7 = size2 + 1;
                            int A04 = C203789os.A04(certPath2, i7, i3);
                            Set<String> criticalExtensionOIDs2 = x509Certificate.getCriticalExtensionOIDs();
                            if (criticalExtensionOIDs2 != null) {
                                A16 = C90524aI.A0k(criticalExtensionOIDs2);
                                C165567td.A1U(A16);
                                A16.remove(C203789os.A04);
                                A16.remove(C22634As0.A0E.A01);
                            } else {
                                A16 = C36441kJ.A16();
                            }
                            C203789os.A0G(certPath2, A0I, A16, i7);
                            AXN A06 = C203789os.A06(certPath2, initialPolicies, A164, axm2, axn, arrayListArr, i7);
                            if (A04 > 0 || A06 != null) {
                                return new PKIXCertPathValidatorResult(A012, A06, x509Certificate.getPublicKey());
                            }
                            throw new CertPathValidatorException("Path processing failed on policy.", (Throwable) null, certPath2, size2);
                        } catch (CertPathValidatorException e4) {
                            throw C21871Abv.A00("Algorithm identifier of public key of trust anchor could not be read.", e4, certPath2, -1);
                        }
                    } else {
                        throw new CertPathValidatorException("Trust anchor for certification path not found.", (Throwable) null, certPath2, -1);
                    }
                } catch (C1890191s e5) {
                    throw new CertPathValidatorException(e5.getMessage(), e5._underlyingException, certPath2, C36421kH.A06(certificates, 1));
                }
            } else {
                throw new CertPathValidatorException("Certification path is empty.", (Throwable) null, certPath2, -1);
            }
        } else {
            throw C165617ti.A0c("trustAnchors is null, this is not allowed for certification path validation.");
        }
    }
}
