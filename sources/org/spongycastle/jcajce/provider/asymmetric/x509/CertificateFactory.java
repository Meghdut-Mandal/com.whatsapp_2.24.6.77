package org.spongycastle.jcajce.provider.asymmetric.x509;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass122;
import X.C165567td;
import X.C187118xI;
import X.C1903097w;
import X.C198509dg;
import X.C21786AaJ;
import X.C21866Abq;
import X.C21873Aby;
import X.C219311y;
import X.C219411z;
import X.C22606ArY;
import X.C22616Ari;
import X.C22643As9;
import X.C22656AsM;
import X.C22657AsN;
import X.C22658AsO;
import X.C22721AtP;
import X.C22723AtR;
import X.C22844Awt;
import X.C36331k8;
import X.C90524aI;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CertificateFactory extends CertificateFactorySpi {
    public static final C198509dg A07 = new C198509dg("CERTIFICATE");
    public static final C198509dg A08 = new C198509dg("CRL");
    public static final C198509dg A09 = new C198509dg("PKCS7");
    public int A00 = 0;
    public int A01 = 0;
    public InputStream A02 = null;
    public InputStream A03 = null;
    public C22657AsN A04 = null;
    public C22657AsN A05 = null;
    public final C22844Awt A06 = new C21786AaJ();

    public CertPath engineGenerateCertPath(InputStream inputStream, String str) {
        return new C21866Abq(inputStream, str);
    }

    public Iterator engineGetCertPathEncodings() {
        return C21866Abq.A00.iterator();
    }

    private C22721AtP A00() {
        C22606ArY arY;
        C22657AsN asN = this.A04;
        if (asN == null) {
            return null;
        }
        int i = this.A00;
        C219411z[] r1 = asN.A00;
        if (i >= r1.length) {
            return null;
        }
        this.A00 = i + 1;
        C219411z r12 = r1[i];
        if (r12 instanceof C22606ArY) {
            arY = (C22606ArY) r12;
        } else if (r12 != null) {
            arY = new C22606ArY(C22656AsM.A04(r12));
        } else {
            arY = null;
        }
        return new C22721AtP(arY, this.A06);
    }

    private C22721AtP A01(C22656AsM asM) {
        C22643As9 as9;
        if (asM == null) {
            return null;
        }
        if (asM.A0H() <= 1 || !(asM.A0J(0) instanceof AnonymousClass122) || !asM.A0J(0).equals(C219311y.A2K)) {
            return new C22721AtP(new C22606ArY(C22656AsM.A04(asM)), this.A06);
        }
        C22656AsM A052 = C22656AsM.A05((C22658AsO) asM.A0J(1), true);
        if (A052 != null) {
            as9 = new C22643As9(C22656AsM.A04(A052));
        } else {
            as9 = null;
        }
        this.A04 = as9.A01;
        return A00();
    }

    private C22723AtR A02() {
        C219411z r1;
        C22657AsN asN = this.A05;
        if (asN == null) {
            return null;
        }
        do {
            int i = this.A01;
            C219411z[] r12 = asN.A00;
            if (i >= r12.length) {
                return null;
            }
            this.A01 = i + 1;
            r1 = r12[i];
        } while (!(r1 instanceof C22656AsM));
        return new C22723AtR(C22616Ari.A00(r1), this.A06);
    }

    private C22723AtR A03(C22656AsM asM) {
        C22643As9 as9;
        if (asM == null) {
            return null;
        }
        if (asM.A0H() <= 1 || !(asM.A0J(0) instanceof AnonymousClass122) || !asM.A0J(0).equals(C219311y.A2K)) {
            return new C22723AtR(C22616Ari.A00(asM), this.A06);
        }
        C22656AsM A052 = C22656AsM.A05((C22658AsO) asM.A0J(1), true);
        if (A052 != null) {
            as9 = new C22643As9(C22656AsM.A04(A052));
        } else {
            as9 = null;
        }
        this.A05 = as9.A00;
        return A02();
    }

    public CRL engineGenerateCRL(InputStream inputStream) {
        InputStream inputStream2 = this.A02;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.A02 = inputStream;
            this.A04 = null;
            this.A00 = 0;
        }
        try {
            C22657AsN asN = this.A04;
            if (asN == null) {
                if (!inputStream.markSupported()) {
                    inputStream = C90524aI.A0P(C1903097w.A00(inputStream));
                }
                inputStream.mark(1);
                int read = inputStream.read();
                if (read == -1) {
                    return null;
                }
                inputStream.reset();
                if (read != 48) {
                    return A01(A08.A01(inputStream));
                }
                return A01(C22656AsM.A04(new C187118xI(inputStream, true).A06()));
            } else if (this.A00 != asN.A00.length) {
                return A00();
            } else {
                this.A04 = null;
                this.A00 = 0;
                return null;
            }
        } catch (CRLException e) {
            throw e;
        } catch (Exception e2) {
            throw new CRLException(e2.toString());
        }
    }

    public Certificate engineGenerateCertificate(InputStream inputStream) {
        InputStream inputStream2 = this.A03;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.A03 = inputStream;
            this.A05 = null;
            this.A01 = 0;
        }
        try {
            C22657AsN asN = this.A05;
            if (asN == null) {
                if (!inputStream.markSupported()) {
                    inputStream = C90524aI.A0P(C1903097w.A00(inputStream));
                }
                inputStream.mark(1);
                int read = inputStream.read();
                if (read == -1) {
                    return null;
                }
                inputStream.reset();
                if (read != 48) {
                    return A03(A07.A01(inputStream));
                }
                return A03(C22656AsM.A04(new C187118xI(inputStream).A06()));
            } else if (this.A01 != asN.A00.length) {
                return A02();
            } else {
                this.A05 = null;
                this.A01 = 0;
                return null;
            }
        } catch (Exception e) {
            throw new C21873Aby(C36331k8.A0i("parsing issue: ", AnonymousClass000.A0u(), e), e, this);
        }
    }

    public Collection engineGenerateCertificates(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ArrayList A0I = AnonymousClass001.A0I();
        while (true) {
            Certificate engineGenerateCertificate = engineGenerateCertificate(bufferedInputStream);
            if (engineGenerateCertificate == null) {
                return A0I;
            }
            A0I.add(engineGenerateCertificate);
        }
    }

    public Collection engineGenerateCRLs(InputStream inputStream) {
        ArrayList A0I = AnonymousClass001.A0I();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        while (true) {
            CRL engineGenerateCRL = engineGenerateCRL(bufferedInputStream);
            if (engineGenerateCRL == null) {
                return A0I;
            }
            A0I.add(engineGenerateCRL);
        }
    }

    public CertPath engineGenerateCertPath(List list) {
        for (Object next : list) {
            if (next != null && !(next instanceof X509Certificate)) {
                StringBuilder A0u = AnonymousClass000.A0u();
                C165567td.A1M(next, "list contains non X509Certificate object while creating CertPath\n", A0u);
                throw new CertificateException(A0u.toString());
            }
        }
        return new C21866Abq(list);
    }

    public CertPath engineGenerateCertPath(InputStream inputStream) {
        return new C21866Abq(inputStream, "PkiPath");
    }
}
