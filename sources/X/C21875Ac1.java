package X;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.Ac1  reason: case insensitive filesystem */
public abstract class C21875Ac1 extends X509CRL {
    public String A00;
    public C22606ArY A01;
    public C22844Awt A02;
    public boolean A03;
    public byte[] A04;

    public C21875Ac1(String str, C22606ArY arY, C22844Awt awt, byte[] bArr, boolean z) {
        this.A02 = awt;
        this.A01 = arY;
        this.A00 = str;
        this.A04 = bArr;
        this.A03 = z;
    }

    public Set getCriticalExtensionOIDs() {
        return A00(true);
    }

    public byte[] getEncoded() {
        try {
            return this.A01.A09("DER");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    public Set getNonCriticalExtensionOIDs() {
        return A00(false);
    }

    public String getSigAlgName() {
        return this.A00;
    }

    public byte[] getSigAlgParams() {
        return AnonymousClass124.A02(this.A04);
    }

    public void verify(PublicKey publicKey) {
        A02(publicKey, new C1890591x(this, 0));
    }

    public void verify(PublicKey publicKey, String str) {
        A02(publicKey, new C23233BAp(0, str, this));
    }

    public void verify(PublicKey publicKey, Provider provider) {
        try {
            A02(publicKey, new C23234BAq(provider, this, 0));
        } catch (NoSuchProviderException e) {
            throw new NoSuchAlgorithmException(C36331k8.A0i("provider issue: ", AnonymousClass000.A0u(), e));
        }
    }

    private void A01(PublicKey publicKey, Signature signature, C219411z r6, byte[] bArr) {
        if (r6 != null) {
            C202849ml.A03(signature, r6);
        }
        signature.initVerify(publicKey);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C187498xy(signature), 512);
            this.A01.A04.A07(bufferedOutputStream, "DER");
            bufferedOutputStream.close();
            if (!signature.verify(bArr)) {
                throw new SignatureException("CRL does not verify with supplied public key.");
            }
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    private void A02(PublicKey publicKey, B0K b0k) {
        C22606ArY arY = this.A01;
        C22632Ary ary = arY.A03;
        if (ary.equals(arY.A04.A03)) {
            Map map = C202849ml.A00;
            if (B4Q.A0C.A0G(ary.A01)) {
                C22656AsM A042 = C22656AsM.A04(ary.A00);
                C22656AsM A043 = C22656AsM.A04(C22586ArE.A01(arY.A02).A0H());
                boolean z = false;
                for (int i = 0; i != A043.A0H(); i++) {
                    C22632Ary A002 = C22632Ary.A00(A042.A0J(i));
                    try {
                        A01(publicKey, b0k.B4w(C202849ml.A01(A002)), A002.A00, C22586ArE.A01(A043.A0J(i)).A0H());
                        z = true;
                    } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
                    } catch (SignatureException e) {
                        throw e;
                    }
                }
                if (!z) {
                    throw new InvalidKeyException("no matching key found");
                }
                return;
            }
            Signature B4w = b0k.B4w(this.A00);
            byte[] bArr = this.A04;
            if (bArr == null) {
                A01(publicKey, B4w, (C219411z) null, getSignature());
                return;
            }
            try {
                A01(publicKey, B4w, AnonymousClass121.A00(bArr), getSignature());
            } catch (IOException e2) {
                throw new SignatureException(C36331k8.A0i("cannot decode signature parameters: ", AnonymousClass000.A0u(), e2));
            }
        } else {
            throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
        }
    }

    public byte[] getExtensionValue(String str) {
        C22659AsP asP;
        C22634As0 A002;
        C22608Ara ara = this.A01.A04.A04;
        if (ara == null || (A002 = C22608Ara.A00(C165617ti.A0f(str), ara)) == null) {
            asP = null;
        } else {
            asP = A002.A01;
        }
        if (asP == null) {
            return null;
        }
        try {
            return asP.A08();
        } catch (Exception e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            throw AnonymousClass000.A0g(C90494aF.A0c(e, "error parsing ", A0u), A0u);
        }
    }

    public Principal getIssuerDN() {
        AnonymousClass122 r0 = C22635As1.A0C;
        return new C22692Asw(C22641As7.A01(this.A01.A04.A02.A00));
    }

    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.A01.A04.A02.A08());
        } catch (IOException unused) {
            throw AnonymousClass001.A09("can't encode issuer DN");
        }
    }

    public Date getNextUpdate() {
        C22639As5 as5 = this.A01.A04.A05;
        if (as5 == null) {
            return null;
        }
        return as5.A0B();
    }

    public X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        Enumeration aXo;
        C22634As0 A002;
        C22599ArR arR = this.A01.A04;
        C22656AsM asM = arR.A01;
        if (asM == null) {
            aXo = new C21715AXn(arR);
        } else {
            aXo = new C21716AXo(asM.A0I(), arR);
        }
        C22641As7 as7 = null;
        while (aXo.hasMoreElements()) {
            C22604ArW arW = (C22604ArW) aXo.nextElement();
            C22656AsM asM2 = arW.A01;
            if (C22654AsK.A01(C22656AsM.A02(asM2)).A0I(bigInteger)) {
                return new C21876Ac2(as7, arW, this.A03);
            }
            if (this.A03 && asM2.A0H() == 3 && (A002 = C22608Ara.A00(C22634As0.A0A, arW.A0A())) != null) {
                as7 = C22641As7.A01(C22631Arx.A00(C22634As0.A00(A002))[0].A01);
            }
        }
        return null;
    }

    public String getSigAlgOID() {
        return this.A01.A03.A01.A01;
    }

    public byte[] getSignature() {
        C22586ArE arE = this.A01.A02;
        if (arE.A00 == 0) {
            return AnonymousClass124.A02(arE.A01);
        }
        throw AnonymousClass001.A09("attempt to get non-octet aligned data from BIT STRING");
    }

    public byte[] getTBSCertList() {
        try {
            return this.A01.A04.A09("DER");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    public Date getThisUpdate() {
        return this.A01.A04.A06.A0B();
    }

    public int getVersion() {
        C22654AsK asK = this.A01.A04.A00;
        if (asK == null) {
            return 1;
        }
        return asK.A0H() + 1;
    }

    public String toString() {
        String str;
        String A002;
        Object A003;
        StringBuffer A0x = C165607th.A0x();
        String str2 = AnonymousClass11q.A00;
        A0x.append("              Version: ");
        A0x.append(getVersion());
        A0x.append(str2);
        A0x.append("             IssuerDN: ");
        A0x.append(getIssuerDN());
        A0x.append(str2);
        A0x.append("          This update: ");
        A0x.append(getThisUpdate());
        A0x.append(str2);
        A0x.append("          Next update: ");
        A0x.append(getNextUpdate());
        A0x.append(str2);
        A0x.append("  Signature Algorithm: ");
        A0x.append(this.A00);
        A0x.append(str2);
        C202849ml.A02(str2, A0x, getSignature());
        C22608Ara ara = this.A01.A04.A04;
        if (ara != null) {
            Enumeration elements = ara.A01.elements();
            if (elements.hasMoreElements()) {
                str = "           Extensions: ";
                A0x.append(str);
                A0x.append(str2);
            }
            while (true) {
                if (!elements.hasMoreElements()) {
                    break;
                }
                AnonymousClass122 r5 = (AnonymousClass122) elements.nextElement();
                C22634As0 A004 = C22608Ara.A00(r5, ara);
                C22659AsP asP = A004.A01;
                if (asP == null) {
                    break;
                }
                C187118xI A032 = C187118xI.A03(A0x, asP, A004);
                C187118xI A0322 = C187118xI.A03(A0x, asP, A004);
                try {
                } catch (Exception unused) {
                    A0x.append(r5.A01);
                    A0x.append(" value = ");
                    str = "*****";
                }
                if (r5.A0G(C22634As0.A09)) {
                    A003 = new C22601ArT(new BigInteger(1, C22654AsK.A01(A0322.A06()).A00));
                } else {
                    if (r5.A0G(C22634As0.A0C)) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("Base CRL: ");
                        A002 = AnonymousClass000.A0o(new C22601ArT(new BigInteger(1, C22654AsK.A01(A0322.A06()).A00)), A0u);
                    } else if (r5.A0G(C22634As0.A0K)) {
                        A003 = C22630Arw.A00(A0322.A06());
                    } else if (r5.A0G(C22634As0.A08)) {
                        A003 = C22621Arn.A00(A0322.A06());
                    } else if (r5.A0G(C22634As0.A0F)) {
                        A003 = C22621Arn.A00(A0322.A06());
                    } else {
                        A0x.append(r5.A01);
                        A0x.append(" value = ");
                        A002 = C196359Zi.A00(A0322.A06());
                    }
                    A0x.append(A002);
                    A0x.append(str2);
                }
                A0x.append(A003);
                A0x.append(str2);
                break;
                break;
            }
        }
        Set<? extends X509CRLEntry> revokedCertificates = getRevokedCertificates();
        if (revokedCertificates != null) {
            for (Object append : revokedCertificates) {
                A0x.append(append);
                A0x.append(str2);
            }
        }
        return A0x.toString();
    }

    private HashSet A00(boolean z) {
        C22608Ara ara;
        if (getVersion() != 2 || (ara = this.A01.A04.A04) == null) {
            return null;
        }
        HashSet A16 = C36441kJ.A16();
        Enumeration elements = ara.A01.elements();
        while (elements.hasMoreElements()) {
            AnonymousClass122 r1 = (AnonymousClass122) elements.nextElement();
            if (z == C22608Ara.A00(r1, ara).A02) {
                A16.add(r1.A01);
            }
        }
        return A16;
    }

    public Set getRevokedCertificates() {
        Enumeration aXo;
        C22634As0 A002;
        HashSet A16 = C36441kJ.A16();
        C22599ArR arR = this.A01.A04;
        C22656AsM asM = arR.A01;
        if (asM == null) {
            aXo = new C21715AXn(arR);
        } else {
            aXo = new C21716AXo(asM.A0I(), arR);
        }
        C22641As7 as7 = null;
        while (aXo.hasMoreElements()) {
            C22604ArW arW = (C22604ArW) aXo.nextElement();
            boolean z = this.A03;
            A16.add(new C21876Ac2(as7, arW, z));
            if (z && arW.A01.A0H() == 3 && (A002 = C22608Ara.A00(C22634As0.A0A, arW.A0A())) != null) {
                as7 = C22641As7.A01(C22631Arx.A00(C22634As0.A00(A002))[0].A01);
            }
        }
        if (!A16.isEmpty()) {
            return Collections.unmodifiableSet(A16);
        }
        return null;
    }

    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        criticalExtensionOIDs.remove(C22634As0.A0K.A01);
        criticalExtensionOIDs.remove(C22634As0.A0C.A01);
        return !criticalExtensionOIDs.isEmpty();
    }

    public boolean isRevoked(Certificate certificate) {
        Enumeration aXo;
        C22604ArW arW;
        C22641As7 as7;
        C22634As0 A002;
        if (certificate.getType().equals("X.509")) {
            C22599ArR arR = this.A01.A04;
            C22656AsM asM = arR.A01;
            if (asM == null) {
                aXo = new C21715AXn(arR);
            } else {
                aXo = new C21716AXo(asM.A0I(), arR);
            }
            C22641As7 as72 = arR.A02;
            if (aXo.hasMoreElements()) {
                X509Certificate x509Certificate = (X509Certificate) certificate;
                BigInteger serialNumber = x509Certificate.getSerialNumber();
                while (true) {
                    if (!aXo.hasMoreElements()) {
                        break;
                    }
                    Object nextElement = aXo.nextElement();
                    if (nextElement instanceof C22604ArW) {
                        arW = (C22604ArW) nextElement;
                    } else if (nextElement != null) {
                        arW = new C22604ArW(C22656AsM.A04(nextElement));
                    } else {
                        arW = null;
                    }
                    if (this.A03 && arW.A01.A0H() == 3 && (A002 = C22608Ara.A00(C22634As0.A0A, arW.A0A())) != null) {
                        as72 = C22641As7.A01(C22631Arx.A00(C22634As0.A00(A002))[0].A01);
                    }
                    if (C22654AsK.A01(arW.A01.A0J(0)).A0I(serialNumber)) {
                        if (certificate instanceof X509Certificate) {
                            as7 = C22641As7.A01(x509Certificate.getIssuerX500Principal().getEncoded());
                        } else {
                            try {
                                as7 = C22616Ari.A00(certificate.getEncoded()).A03.A05;
                            } catch (CertificateEncodingException e) {
                                throw AnonymousClass001.A08(C36331k8.A0i("Cannot process certificate: ", AnonymousClass000.A0u(), e));
                            }
                        }
                        if (as72.equals(as7)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        throw AnonymousClass001.A08("X.509 CRL used with non X.509 Cert");
    }
}
