package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.cert.CRLException;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.PolicyQualifierInfo;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.security.interfaces.DSAKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.9oV  reason: invalid class name and case insensitive filesystem */
public abstract class C203669oV {
    public static final String A00 = C22634As0.A09.A01;
    public static final String A01 = C22634As0.A0K.A01;
    public static final String A02 = C22634As0.A05.A01;

    public static TrustAnchor A01(String str, X509Certificate x509Certificate, Set set) {
        X509CertSelector x509CertSelector = new X509CertSelector();
        X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
        x509CertSelector.setSubject(issuerX500Principal);
        Iterator it = set.iterator();
        TrustAnchor trustAnchor = null;
        Exception e = null;
        C22641As7 as7 = null;
        PublicKey publicKey = null;
        while (it.hasNext() && trustAnchor == null) {
            trustAnchor = (TrustAnchor) it.next();
            if (trustAnchor.getTrustedCert() != null) {
                if (x509CertSelector.match(trustAnchor.getTrustedCert())) {
                    publicKey = trustAnchor.getTrustedCert().getPublicKey();
                }
                trustAnchor = null;
            } else {
                if (!(trustAnchor.getCA() == null || trustAnchor.getCAName() == null || trustAnchor.getCAPublicKey() == null)) {
                    if (as7 == null) {
                        as7 = C22641As7.A01(issuerX500Principal.getEncoded());
                    }
                    try {
                        if (as7.equals(C22641As7.A01(trustAnchor.getCA().getEncoded()))) {
                            publicKey = trustAnchor.getCAPublicKey();
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
                trustAnchor = null;
            }
            if (publicKey != null) {
                if (str == null) {
                    try {
                        x509Certificate.verify(publicKey);
                    } catch (Exception e2) {
                        e = e2;
                        trustAnchor = null;
                        publicKey = null;
                    }
                } else {
                    x509Certificate.verify(publicKey, str);
                }
            }
        }
        if (trustAnchor != null || e == null) {
            return trustAnchor;
        }
        throw C1890191s.A00("TrustAnchor found but certificate validation failed.", e);
    }

    public static LinkedHashSet A03(X509Certificate x509Certificate, List list, List list2) {
        C22605ArX arX;
        byte[] bArr;
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(C201789kO.A01(x509Certificate).A08());
            try {
                byte[] extensionValue = x509Certificate.getExtensionValue(A02);
                if (extensionValue != null) {
                    byte[] A03 = C22659AsP.A03(extensionValue);
                    if (A03 instanceof C22605ArX) {
                        arX = (C22605ArX) A03;
                    } else if (A03 != null) {
                        arX = new C22605ArX(C22656AsM.A04(A03));
                    } else {
                        arX = null;
                    }
                    C22659AsP asP = arX.A02;
                    if (asP != null) {
                        bArr = asP.A00;
                    } else {
                        bArr = null;
                    }
                    if (bArr != null) {
                        x509CertSelector.setSubjectKeyIdentifier(new C22644AsA(bArr).A08());
                    }
                }
            } catch (Exception unused) {
            }
            C21793AaQ aaQ = new C21793AaQ(new C192159Fx(x509CertSelector).A00);
            LinkedHashSet A17 = C36441kJ.A17();
            try {
                A09(A17, list, aaQ);
                A09(A17, list2, aaQ);
                return A17;
            } catch (C1890191s e) {
                throw C1890191s.A00("Issuer certificate cannot be searched.", e);
            }
        } catch (Exception e2) {
            throw C1890191s.A00("Subject criteria for certificate selector to find issuer certificate could not be set.", e2);
        }
    }

    public static Set A04(AXL axl) {
        X509Certificate x509Certificate;
        AXM axm = axl.A02;
        C21793AaQ aaQ = axm.A09;
        LinkedHashSet A17 = C36441kJ.A17();
        try {
            A09(A17, axm.A05, aaQ);
            A09(A17, axm.A01.getCertStores(), aaQ);
            if (!A17.isEmpty()) {
                return A17;
            }
            CertSelector certSelector = aaQ.A00;
            if (certSelector instanceof X509CertSelector) {
                x509Certificate = ((X509CertSelector) certSelector).getCertificate();
            } else {
                x509Certificate = null;
            }
            if (x509Certificate != null) {
                return Collections.singleton(x509Certificate);
            }
            throw new CertPathBuilderException("No certificate found matching targetConstraints.");
        } catch (C1890191s e) {
            throw new C21867Abr(e);
        }
    }

    public static void A07(Object obj, X509CRL x509crl, Date date, C192719Ih r10) {
        X509CRLEntry x509CRLEntry;
        int i;
        try {
            byte[] extensionValue = x509crl.getExtensionValue(C22634As0.A0K.A01);
            if (extensionValue != null && C22630Arw.A00(C22659AsP.A03(extensionValue)).A02) {
                x509CRLEntry = x509crl.getRevokedCertificate(((X509Certificate) obj).getSerialNumber());
                if (x509CRLEntry != null) {
                    X500Principal certificateIssuer = x509CRLEntry.getCertificateIssuer();
                    if (certificateIssuer == null) {
                        certificateIssuer = x509crl.getIssuerX500Principal();
                    }
                    if (!C201789kO.A00(obj).equals(C201789kO.A03(certificateIssuer))) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (!C201789kO.A00(obj).equals(C201789kO.A03(x509crl.getIssuerX500Principal())) || (x509CRLEntry = x509crl.getRevokedCertificate(((X509Certificate) obj).getSerialNumber())) == null) {
                return;
            }
            if (x509CRLEntry.hasExtensions()) {
                if (!x509CRLEntry.hasUnsupportedCriticalExtension()) {
                    try {
                        C22652AsI A012 = C22652AsI.A01(A05(C22634As0.A0T.A01, x509CRLEntry));
                        if (A012 != null) {
                            i = A012.A0H();
                            if (date.getTime() < x509CRLEntry.getRevocationDate().getTime() || i == 0 || i == 1 || i == 2 || i == 10) {
                                r10.A00 = i;
                                r10.A01 = x509CRLEntry.getRevocationDate();
                            }
                            return;
                        }
                    } catch (Exception e) {
                        throw C1890191s.A00("Reason code CRL entry extension could not be decoded.", e);
                    }
                } else {
                    throw C1890191s.A00("CRL entry has unsupported critical extensions.", (Throwable) null);
                }
            }
            i = 0;
            if (date.getTime() < x509CRLEntry.getRevocationDate().getTime()) {
            }
            r10.A00 = i;
            r10.A01 = x509CRLEntry.getRevocationDate();
        } catch (Exception e2) {
            throw new C21865Abp(e2);
        } catch (CRLException e3) {
            throw C1890191s.A00("Failed check for indirect CRL.", e3);
        }
    }

    public static PublicKey A00(List list, C22844Awt awt, int i) {
        DSAKey dSAKey;
        PublicKey publicKey = ((Certificate) list.get(i)).getPublicKey();
        boolean z = publicKey instanceof DSAPublicKey;
        DSAPublicKey dSAPublicKey = publicKey;
        if (z) {
            DSAPublicKey dSAPublicKey2 = (DSAPublicKey) publicKey;
            DSAParams params = dSAPublicKey2.getParams();
            dSAPublicKey = dSAPublicKey2;
            if (params == null) {
                do {
                    i++;
                    if (i < list.size()) {
                        PublicKey publicKey2 = ((Certificate) list.get(i)).getPublicKey();
                        if (publicKey2 instanceof DSAPublicKey) {
                            dSAKey = (DSAKey) publicKey2;
                        } else {
                            throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
                        }
                    } else {
                        throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
                    }
                } while (dSAKey.getParams() == null);
                DSAParams params2 = dSAKey.getParams();
                try {
                    return KeyFactory.getInstance("DSA", ((C21786AaJ) awt).A00).generatePublic(new DSAPublicKeySpec(dSAPublicKey2.getY(), params2.getP(), params2.getQ(), params2.getG()));
                } catch (Exception e) {
                    throw C90514aH.A0s(e.getMessage());
                }
            }
        }
        return dSAPublicKey;
    }

    public static final HashSet A02(C22656AsM asM) {
        HashSet A16 = C36441kJ.A16();
        if (asM != null) {
            ByteArrayOutputStream A0Q = C90524aI.A0Q();
            C200179gm r3 = new C200179gm(A0Q);
            Enumeration A0I = asM.A0I();
            while (A0I.hasMoreElements()) {
                try {
                    C219411z r0 = (C219411z) A0I.nextElement();
                    if (r0 != null) {
                        r3.A03(r0.Bve(), true);
                        A16.add(new PolicyQualifierInfo(A0Q.toByteArray()));
                        A0Q.reset();
                    } else {
                        throw C90524aI.A0X("null object detected");
                    }
                } catch (IOException e) {
                    throw new C21871Abv("Policy qualifier info cannot be decoded.", e);
                }
            }
        }
        return A16;
    }

    public static AnonymousClass121 A05(String str, X509Extension x509Extension) {
        byte[] extensionValue = x509Extension.getExtensionValue(str);
        if (extensionValue == null) {
            return null;
        }
        try {
            return AnonymousClass121.A00(C22659AsP.A03(extensionValue));
        } catch (Exception e) {
            throw C1890191s.A00(AnonymousClass000.A0p("exception processing extension ", str, AnonymousClass000.A0u()), e);
        }
    }

    public static AXN A06(AXN axn, AXN axn2, List[] listArr) {
        AXN axn3 = (AXN) axn2.getParent();
        if (axn != null) {
            if (axn3 == null) {
                for (int i = 0; i < listArr.length; i++) {
                    listArr[i] = AnonymousClass001.A0I();
                }
            } else {
                axn3.A01.remove(axn2);
                A0A(axn2, listArr);
                return axn;
            }
        }
        return null;
    }

    public static void A08(PublicKey publicKey) {
        try {
            C22611Ard.A00(publicKey.getEncoded());
        } catch (Exception e) {
            throw new C21871Abv("Subject public key cannot be decoded.", e);
        }
    }

    public static void A09(LinkedHashSet linkedHashSet, List list, C21793AaQ aaQ) {
        for (Object next : list) {
            if (next instanceof B0L) {
                try {
                    linkedHashSet.addAll(((B0L) next).BDp(aaQ));
                } catch (C21810Aal e) {
                    throw C1890191s.A00("Problem while picking certificates from X.509 store.", e);
                }
            } else {
                try {
                    linkedHashSet.addAll(((CertStore) next).getCertificates(new C21878Ac4(aaQ)));
                } catch (CertStoreException e2) {
                    throw C1890191s.A00("Problem while picking certificates from certificate store.", e2);
                }
            }
        }
    }

    public static void A0A(AXN axn, List[] listArr) {
        listArr[axn.getDepth()].remove(axn);
        if (C36401kF.A1a(axn.A01)) {
            Iterator children = axn.getChildren();
            while (children.hasNext()) {
                A0A((AXN) children.next(), listArr);
            }
        }
    }
}
