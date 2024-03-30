package X;

import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathChecker;
import java.security.cert.CertPathParameters;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXCertPathBuilderResult;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.spongycastle.jcajce.provider.asymmetric.x509.CertificateFactory;

/* renamed from: X.Abt  reason: case insensitive filesystem */
public class C21869Abt extends CertPathBuilderSpi {
    public Exception A00;
    public final C22844Awt A01;
    public final boolean A02;

    public C21869Abt() {
        this(false);
    }

    public C21869Abt(boolean z) {
        this.A01 = new C21786AaJ();
        this.A02 = z;
    }

    public CertPathBuilderResult engineBuild(CertPathParameters certPathParameters) {
        AXL axl;
        if (certPathParameters instanceof PKIXBuilderParameters) {
            PKIXBuilderParameters pKIXBuilderParameters = (PKIXBuilderParameters) certPathParameters;
            new C198259dA((PKIXParameters) pKIXBuilderParameters);
            axl = new AXL(new C197809cP(pKIXBuilderParameters));
        } else if (certPathParameters instanceof AXL) {
            axl = (AXL) certPathParameters;
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Parameters must be an instance of ");
            C165597tg.A1F(PKIXBuilderParameters.class, A0u);
            A0u.append(" or ");
            C165597tg.A1F(AXL.class, A0u);
            throw C165617ti.A0c(AnonymousClass000.A0q(".", A0u));
        }
        ArrayList A0I = AnonymousClass001.A0I();
        CertPathBuilderResult certPathBuilderResult = null;
        Iterator it = C203669oV.A04(axl).iterator();
        while (true) {
            if (it.hasNext()) {
                if (certPathBuilderResult != null) {
                    break;
                }
                certPathBuilderResult = A00((X509Certificate) it.next(), A0I, axl);
            } else if (certPathBuilderResult == null) {
                Exception exc = this.A00;
                if (exc == null) {
                    throw new CertPathBuilderException("Unable to find certificate chain.");
                } else if (exc instanceof C1890191s) {
                    throw new CertPathBuilderException(exc.getMessage(), this.A00.getCause());
                } else {
                    throw new CertPathBuilderException("Possible certificate chain could not be validated.", exc);
                }
            }
        }
        return certPathBuilderResult;
    }

    public /* bridge */ /* synthetic */ CertPathChecker engineGetRevocationChecker() {
        return new C21874Ac0(this.A01);
    }

    public CertPathBuilderResult A00(X509Certificate x509Certificate, List list, AXL axl) {
        int i;
        Throwable th;
        C1890191s r0;
        Collection A0I;
        HashSet A16;
        CertPath engineGenerateCertPath;
        CertPathBuilderResult certPathBuilderResult = null;
        if (!list.contains(x509Certificate) && !axl.A01.contains(x509Certificate) && ((i = axl.A00) == -1 || C36431kI.A07(list) <= i)) {
            list.add(x509Certificate);
            try {
                CertificateFactory certificateFactory = new CertificateFactory();
                C21872Abx abx = new C21872Abx(this.A02);
                try {
                    AXM axm = axl.A02;
                    Set set = axm.A08;
                    PKIXParameters pKIXParameters = axm.A01;
                    boolean z = false;
                    try {
                        if (C203669oV.A01(pKIXParameters.getSigProvider(), x509Certificate, set) != null) {
                            z = true;
                        }
                    } catch (Exception unused) {
                    }
                    if (z) {
                        try {
                            engineGenerateCertPath = certificateFactory.engineGenerateCertPath(list);
                        } catch (Exception e) {
                            r0 = C1890191s.A00("Certification path could not be constructed from certificate list.", e);
                            throw r0;
                        }
                        try {
                            PKIXCertPathValidatorResult pKIXCertPathValidatorResult = (PKIXCertPathValidatorResult) abx.engineValidate(engineGenerateCertPath, axl);
                            return new PKIXCertPathBuilderResult(engineGenerateCertPath, pKIXCertPathValidatorResult.getTrustAnchor(), pKIXCertPathValidatorResult.getPolicyTree(), pKIXCertPathValidatorResult.getPublicKey());
                        } catch (Exception e2) {
                            r0 = C1890191s.A00("Certification path could not be validated.", e2);
                            throw r0;
                        }
                    } else {
                        ArrayList A0I2 = AnonymousClass001.A0I();
                        A0I2.addAll(axm.A05);
                        try {
                            byte[] extensionValue = x509Certificate.getExtensionValue(C22634As0.A0J.A01);
                            Map map = axm.A07;
                            if (extensionValue == null) {
                                A0I = Collections.EMPTY_LIST;
                            } else {
                                C22640As6[] A002 = C22631Arx.A00(C22659AsP.A03(extensionValue));
                                A0I = AnonymousClass001.A0I();
                                for (int i2 = 0; i2 != A002.length; i2++) {
                                    map.get(A002[i2]);
                                }
                            }
                            A0I2.addAll(A0I);
                            A16 = C36441kJ.A16();
                        } catch (CertificateParsingException e3) {
                            r0 = C1890191s.A00("No additional X.509 stores can be added from certificate locations.", e3);
                            throw r0;
                        }
                        try {
                            A16.addAll(C203669oV.A03(x509Certificate, pKIXParameters.getCertStores(), A0I2));
                            if (!A16.isEmpty()) {
                                Iterator it = A16.iterator();
                                while (it.hasNext() && certPathBuilderResult == null) {
                                    certPathBuilderResult = A00((X509Certificate) it.next(), list, axl);
                                }
                                if (certPathBuilderResult == null) {
                                    list.remove(x509Certificate);
                                    return certPathBuilderResult;
                                }
                            } else {
                                th = C1890191s.A00("No issuer certificate for certificate in certification path found.", (Throwable) null);
                                throw th;
                            }
                        } catch (C1890191s e4) {
                            r0 = C1890191s.A00("Cannot find issuer certificate for certificate in certification path.", e4);
                            throw r0;
                        }
                    }
                } catch (C1890191s e5) {
                    this.A00 = e5;
                }
            } catch (Exception unused2) {
                th = C90514aH.A0s("Exception creating support classes.");
            }
        }
        return certPathBuilderResult;
    }
}
