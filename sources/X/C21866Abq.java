package X;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.security.NoSuchProviderException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.Abq  reason: case insensitive filesystem */
public class C21866Abq extends CertPath {
    public static final List A00;
    public List certificates;
    public final C22844Awt helper;

    public Iterator getEncodings() {
        return A00.iterator();
    }

    public C21866Abq(InputStream inputStream, String str) {
        super("X.509");
        CertificateException certificateException;
        C21786AaJ aaJ = new C21786AaJ();
        this.helper = aaJ;
        try {
            if (str.equalsIgnoreCase("PkiPath")) {
                AnonymousClass121 A06 = new C187118xI(inputStream).A06();
                if (A06 instanceof C22656AsM) {
                    Enumeration A0I = ((C22656AsM) A06).A0I();
                    this.certificates = AnonymousClass001.A0I();
                    CertificateFactory instance = CertificateFactory.getInstance("X.509", aaJ.A00);
                    while (A0I.hasMoreElements()) {
                        this.certificates.add(0, instance.generateCertificate(C90524aI.A0P(C165597tg.A1V((C219411z) A0I.nextElement()))));
                    }
                    this.certificates = A00(this.certificates);
                    return;
                }
                certificateException = new CertificateException("input stream does not contain a ASN1 SEQUENCE while reading PkiPath encoded data to load CertPath");
            } else if (str.equalsIgnoreCase("PKCS7") || str.equalsIgnoreCase("PEM")) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                this.certificates = AnonymousClass001.A0I();
                CertificateFactory instance2 = CertificateFactory.getInstance("X.509", aaJ.A00);
                while (true) {
                    Certificate generateCertificate = instance2.generateCertificate(bufferedInputStream);
                    if (generateCertificate == null) {
                        break;
                    }
                    this.certificates.add(generateCertificate);
                }
                this.certificates = A00(this.certificates);
                return;
            } else {
                certificateException = new CertificateException(AnonymousClass000.A0p("unsupported encoding: ", str, AnonymousClass000.A0u()));
            }
            throw certificateException;
        } catch (IOException e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            C165567td.A1M(e, "IOException throw while decoding CertPath:\n", A0u);
            throw new CertificateException(A0u.toString());
        } catch (NoSuchProviderException e2) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            C165567td.A1M(e2, "SpongyCastle provider not found while trying to get a CertificateFactory:\n", A0u2);
            throw new CertificateException(A0u2.toString());
        }
    }

    public List getCertificates() {
        return C165577te.A0q(this.certificates);
    }

    public byte[] getEncoded(String str) {
        C219411z r1;
        char[] cArr;
        int length;
        int i;
        if (str.equalsIgnoreCase("PkiPath")) {
            C202169lB r2 = new C202169lB();
            List list = this.certificates;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r2.A06(A01((X509Certificate) listIterator.previous()));
            }
            r1 = new C22675Asf(r2);
        } else {
            int i2 = 0;
            if (str.equalsIgnoreCase("PKCS7")) {
                C22642As8 as8 = new C22642As8((C219411z) null, C219311y.A07);
                C202169lB r22 = new C202169lB();
                while (i2 != this.certificates.size()) {
                    r22.A06(A01((X509Certificate) this.certificates.get(i2)));
                    i2++;
                }
                r1 = new C22642As8(new C22643As9(new C22654AsK(1), new C22678Asi(), new C22678Asi(r22), new C22678Asi(), as8), C219311y.A2K);
            } else if (str.equalsIgnoreCase("PEM")) {
                ByteArrayOutputStream A0Q = C90524aI.A0Q();
                C187068xB r8 = new C187068xB(new OutputStreamWriter(A0Q));
                while (i2 != this.certificates.size()) {
                    try {
                        C197689cD r23 = new C197689cD(((X509Certificate) this.certificates.get(i2)).getEncoded());
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("-----BEGIN ");
                        A0u.append("CERTIFICATE");
                        r8.write(AnonymousClass000.A0q("-----", A0u));
                        r8.newLine();
                        List list2 = r23.A00;
                        if (!list2.isEmpty()) {
                            Iterator it = list2.iterator();
                            if (it.hasNext()) {
                                it.next();
                                throw AnonymousClass001.A0A("getName");
                            }
                            r8.newLine();
                        }
                        byte[] A002 = C196869af.A00(r23.A01);
                        int i3 = 0;
                        while (true) {
                            int length2 = A002.length;
                            if (i3 >= length2) {
                                break;
                            }
                            int i4 = 0;
                            while (true) {
                                cArr = r8.A00;
                                length = cArr.length;
                                if (i4 == length || (i = i3 + i4) >= length2) {
                                    r8.write(cArr, 0, i4);
                                    r8.newLine();
                                    i3 += length;
                                } else {
                                    cArr[i4] = (char) A002[i];
                                    i4++;
                                }
                            }
                            r8.write(cArr, 0, i4);
                            r8.newLine();
                            i3 += length;
                        }
                        StringBuilder A0u2 = AnonymousClass000.A0u();
                        AnonymousClass000.A1D("-----END ", "CERTIFICATE", "-----", A0u2);
                        r8.write(A0u2.toString());
                        r8.newLine();
                        i2++;
                    } catch (Exception unused) {
                        throw new CertificateEncodingException("can't encode certificate for PEM encoded path");
                    }
                }
                r8.close();
                return A0Q.toByteArray();
            } else {
                throw new CertificateEncodingException(AnonymousClass000.A0p("unsupported encoding: ", str, AnonymousClass000.A0u()));
            }
        }
        try {
            return C165597tg.A1V(r1);
        } catch (IOException e) {
            throw new CertificateEncodingException(AnonymousClass000.A0l(e, "Exception thrown: ", AnonymousClass000.A0u()));
        }
    }

    static {
        ArrayList A0I = AnonymousClass001.A0I();
        A0I.add("PkiPath");
        A0I.add("PEM");
        A0I.add("PKCS7");
        A00 = Collections.unmodifiableList(A0I);
    }

    public static List A00(List list) {
        if (list.size() >= 2) {
            X500Principal issuerX500Principal = ((X509Certificate) C36391kE.A0t(list)).getIssuerX500Principal();
            int i = 1;
            while (i != list.size()) {
                if (issuerX500Principal.equals(((X509Certificate) list.get(i)).getSubjectX500Principal())) {
                    issuerX500Principal = ((X509Certificate) list.get(i)).getIssuerX500Principal();
                    i++;
                } else {
                    ArrayList A0r = C36361kB.A0r(list);
                    ArrayList A15 = C36441kJ.A15(list);
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        X509Certificate x509Certificate = (X509Certificate) list.get(i2);
                        X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
                        int i3 = 0;
                        while (true) {
                            if (i3 != list.size()) {
                                if (((X509Certificate) list.get(i3)).getIssuerX500Principal().equals(subjectX500Principal)) {
                                    break;
                                }
                                i3++;
                            } else {
                                A0r.add(x509Certificate);
                                list.remove(i2);
                                break;
                            }
                        }
                    }
                    if (A0r.size() <= 1) {
                        for (int i4 = 0; i4 != A0r.size(); i4++) {
                            X500Principal issuerX500Principal2 = ((X509Certificate) A0r.get(i4)).getIssuerX500Principal();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= list.size()) {
                                    break;
                                }
                                X509Certificate x509Certificate2 = (X509Certificate) list.get(i5);
                                if (issuerX500Principal2.equals(x509Certificate2.getSubjectX500Principal())) {
                                    A0r.add(x509Certificate2);
                                    list.remove(i5);
                                    break;
                                }
                                i5++;
                            }
                        }
                        if (list.size() <= 0) {
                            return A0r;
                        }
                    }
                    return A15;
                }
            }
        }
        return list;
    }

    public static AnonymousClass121 A01(X509Certificate x509Certificate) {
        try {
            return new C187118xI(x509Certificate.getEncoded()).A06();
        } catch (Exception e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            C165567td.A1M(e, "Exception while encoding certificate: ", A0u);
            throw new CertificateEncodingException(A0u.toString());
        }
    }

    public C21866Abq(List list) {
        super("X.509");
        this.helper = new C21786AaJ();
        this.certificates = A00(C36441kJ.A15(list));
    }

    public byte[] getEncoded() {
        Iterator it = A00.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (next instanceof String) {
            return getEncoded((String) next);
        }
        return null;
    }
}
