package X;

import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.Ac5  reason: case insensitive filesystem */
public abstract class C21879Ac5 extends X509Certificate implements C22843Aws {
    public C22619Arl basicConstraints;
    public C22844Awt bcHelper;
    public C22616Ari c;
    public boolean[] keyUsage;
    public String sigAlgName;
    public byte[] sigAlgParams;

    public C21879Ac5(String str, C22619Arl arl, C22616Ari ari, C22844Awt awt, byte[] bArr, boolean[] zArr) {
        this.bcHelper = awt;
        this.c = ari;
        this.basicConstraints = arl;
        this.keyUsage = zArr;
        this.sigAlgName = str;
        this.sigAlgParams = bArr;
    }

    public void checkValidity() {
        checkValidity(new Date());
    }

    public byte[] getEncoded() {
        try {
            return this.c.A09("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    public String getSigAlgName() {
        return this.sigAlgName;
    }

    public byte[] getSigAlgParams() {
        return AnonymousClass124.A02(this.sigAlgParams);
    }

    public final void verify(PublicKey publicKey) {
        A02(publicKey, new C1890591x(this, 1));
    }

    public final void verify(PublicKey publicKey, String str) {
        A02(publicKey, new C23233BAp(1, str, this));
    }

    public final void verify(PublicKey publicKey, Provider provider) {
        try {
            A02(publicKey, new C23234BAq(provider, this, 1));
        } catch (NoSuchProviderException e) {
            throw new NoSuchAlgorithmException(C36331k8.A0i("provider issue: ", AnonymousClass000.A0u(), e));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r2.A00 == null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r0 != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r1 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r1.equals(X.C22590ArI.A00) == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01(java.security.PublicKey r5, java.security.Signature r6, X.C219411z r7, byte[] r8) {
        /*
            r4 = this;
            X.Ari r0 = r4.c
            X.Ary r3 = r0.A02
            X.Arj r0 = r0.A03
            X.Ary r2 = r0.A07
            X.122 r1 = r3.A01
            X.122 r0 = r2.A01
            boolean r0 = r1.A0G(r0)
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = "org.spongycastle.x509.allow_absent_equiv_NULL"
            boolean r0 = X.C200679hw.A01(r0)
            if (r0 == 0) goto L_0x0037
            X.11z r1 = r3.A00
            if (r1 != 0) goto L_0x0032
            X.11z r1 = r2.A00
            if (r1 == 0) goto L_0x0043
        L_0x0022:
            X.ArI r0 = X.C22590ArI.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0043
        L_0x002a:
            java.lang.String r0 = "signature algorithm in TBS cert not same as outer cert"
            java.security.cert.CertificateException r1 = new java.security.cert.CertificateException
            r1.<init>(r0)
            throw r1
        L_0x0032:
            X.11z r0 = r2.A00
            if (r0 != 0) goto L_0x0037
            goto L_0x0022
        L_0x0037:
            X.11z r1 = r3.A00
            X.11z r0 = r2.A00
            if (r1 == 0) goto L_0x004a
            boolean r0 = r1.equals(r0)
        L_0x0041:
            if (r0 == 0) goto L_0x002a
        L_0x0043:
            X.C202849ml.A03(r6, r7)
            r6.initVerify(r5)
            goto L_0x0051
        L_0x004a:
            if (r0 == 0) goto L_0x0043
            boolean r0 = r0.equals(r1)
            goto L_0x0041
        L_0x0051:
            X.8xy r1 = new X.8xy     // Catch:{ IOException -> 0x0078 }
            r1.<init>(r6)     // Catch:{ IOException -> 0x0078 }
            r0 = 512(0x200, float:7.175E-43)
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0078 }
            r2.<init>(r1, r0)     // Catch:{ IOException -> 0x0078 }
            X.Ari r0 = r4.c     // Catch:{ IOException -> 0x0078 }
            X.Arj r1 = r0.A03     // Catch:{ IOException -> 0x0078 }
            java.lang.String r0 = "DER"
            r1.A07(r2, r0)     // Catch:{ IOException -> 0x0078 }
            r2.close()     // Catch:{ IOException -> 0x0078 }
            boolean r0 = r6.verify(r8)
            if (r0 == 0) goto L_0x0070
            return
        L_0x0070:
            java.lang.String r0 = "certificate does not verify with supplied key"
            java.security.SignatureException r1 = new java.security.SignatureException
            r1.<init>(r0)
            throw r1
        L_0x0078:
            r0 = move-exception
            java.lang.String r1 = r0.toString()
            java.security.cert.CertificateEncodingException r0 = new java.security.cert.CertificateEncodingException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21879Ac5.A01(java.security.PublicKey, java.security.Signature, X.11z, byte[]):void");
    }

    private void A02(PublicKey publicKey, B0K b0k) {
        C22632Ary ary = this.c.A02;
        Map map = C202849ml.A00;
        boolean A0G = B4Q.A0C.A0G(ary.A01);
        C22632Ary ary2 = this.c.A02;
        if (A0G) {
            C22656AsM A04 = C22656AsM.A04(ary2.A00);
            C22656AsM A042 = C22656AsM.A04(C22586ArE.A01(this.c.A01).A0H());
            boolean z = false;
            for (int i = 0; i != A042.A0H(); i++) {
                C22632Ary A00 = C22632Ary.A00(A04.A0J(i));
                try {
                    A01(publicKey, b0k.B4w(C202849ml.A01(A00)), A00.A00, C22586ArE.A01(A042.A0J(i)).A0H());
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
        A01(publicKey, b0k.B4w(C202849ml.A01(ary2)), this.c.A02.A00, getSignature());
    }

    public static byte[] A03(String str, C22616Ari ari) {
        C22634As0 A00;
        C22659AsP asP;
        C22608Ara ara = ari.A03.A08;
        if (ara == null || (A00 = C22608Ara.A00(C165617ti.A0f(str), ara)) == null || (asP = A00.A01) == null) {
            return null;
        }
        return asP.A00;
    }

    public int getBasicConstraints() {
        C22653AsJ asJ;
        BigInteger bigInteger;
        C22619Arl arl = this.basicConstraints;
        if (arl == null || (asJ = arl.A00) == null || asJ.A00 == 0) {
            return -1;
        }
        C22654AsK asK = arl.A01;
        if (asK == null) {
            return Integer.MAX_VALUE;
        }
        new BigInteger(asK.A00);
        C22654AsK asK2 = this.basicConstraints.A01;
        if (asK2 != null) {
            bigInteger = new BigInteger(asK2.A00);
        } else {
            bigInteger = null;
        }
        return bigInteger.intValue();
    }

    public List getExtendedKeyUsage() {
        byte[] A03 = A03("2.5.29.37", this.c);
        if (A03 == null) {
            return null;
        }
        try {
            C22656AsM A04 = C22656AsM.A04(AnonymousClass121.A00(A03));
            ArrayList A0I = AnonymousClass001.A0I();
            for (int i = 0; i != A04.A0H(); i++) {
                A0I.add(((AnonymousClass122) A04.A0J(i)).A01);
            }
            return Collections.unmodifiableList(A0I);
        } catch (Exception unused) {
            throw new CertificateParsingException("error processing extended key usage extension");
        }
    }

    public byte[] getExtensionValue(String str) {
        C22659AsP asP;
        C22634As0 A00;
        C22608Ara ara = this.c.A03.A08;
        if (ara == null || (A00 = C22608Ara.A00(C165617ti.A0f(str), ara)) == null) {
            asP = null;
        } else {
            asP = A00.A01;
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

    public Collection getIssuerAlternativeNames() {
        return A00(C22634As0.A0J.A01, this.c);
    }

    public Principal getIssuerDN() {
        return new C22692Asw(this.c.A03.A05);
    }

    public boolean[] getIssuerUniqueID() {
        C22586ArE arE = this.c.A03.A03;
        if (arE == null) {
            return null;
        }
        byte[] A0H = arE.A0H();
        int length = (A0H.length * 8) - arE.A00;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = AnonymousClass000.A1P(A0H[i / 8] & (128 >>> (i % 8)));
        }
        return zArr;
    }

    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.c.A03.A05.A09("DER"));
        } catch (IOException unused) {
            throw AnonymousClass001.A09("can't encode issuer DN");
        }
    }

    public boolean[] getKeyUsage() {
        boolean[] zArr = this.keyUsage;
        if (zArr == null) {
            return null;
        }
        return (boolean[]) zArr.clone();
    }

    public Date getNotAfter() {
        return this.c.A03.A0A.A0B();
    }

    public Date getNotBefore() {
        return this.c.A03.A0B.A0B();
    }

    public PublicKey getPublicKey() {
        try {
            C22611Ard ard = this.c.A03.A09;
            Map map = AnonymousClass11n.A00;
            AnonymousClass122 r0 = ard.A01.A01;
            Map map2 = AnonymousClass11n.A00;
            synchronized (map2) {
                map2.get(r0);
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    public BigInteger getSerialNumber() {
        return new BigInteger(this.c.A03.A01.A00);
    }

    public String getSigAlgOID() {
        return this.c.A02.A01.A01;
    }

    public byte[] getSignature() {
        C22586ArE arE = this.c.A01;
        if (arE.A00 == 0) {
            return AnonymousClass124.A02(arE.A01);
        }
        throw AnonymousClass001.A09("attempt to get non-octet aligned data from BIT STRING");
    }

    public Collection getSubjectAlternativeNames() {
        return A00(C22634As0.A0U.A01, this.c);
    }

    public Principal getSubjectDN() {
        return new C22692Asw(this.c.A03.A06);
    }

    public boolean[] getSubjectUniqueID() {
        C22586ArE arE = this.c.A03.A04;
        if (arE == null) {
            return null;
        }
        byte[] A0H = arE.A0H();
        int length = (A0H.length * 8) - arE.A00;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = AnonymousClass000.A1P(A0H[i / 8] & (128 >>> (i % 8)));
        }
        return zArr;
    }

    public X500Principal getSubjectX500Principal() {
        try {
            return new X500Principal(this.c.A03.A06.A09("DER"));
        } catch (IOException unused) {
            throw AnonymousClass001.A09("can't encode subject DN");
        }
    }

    public byte[] getTBSCertificate() {
        try {
            return this.c.A03.A09("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    public int getVersion() {
        return this.c.A03.A02.A0H() + 1;
    }

    public String toString() {
        Object asq;
        StringBuffer A0x = C165607th.A0x();
        String str = AnonymousClass11q.A00;
        A0x.append("  [0]         Version: ");
        A0x.append(getVersion());
        A0x.append(str);
        A0x.append("         SerialNumber: ");
        A0x.append(getSerialNumber());
        A0x.append(str);
        A0x.append("             IssuerDN: ");
        A0x.append(getIssuerDN());
        A0x.append(str);
        A0x.append("           Start Date: ");
        A0x.append(getNotBefore());
        A0x.append(str);
        A0x.append("           Final Date: ");
        A0x.append(getNotAfter());
        A0x.append(str);
        A0x.append("            SubjectDN: ");
        A0x.append(getSubjectDN());
        A0x.append(str);
        A0x.append("           Public Key: ");
        A0x.append(getPublicKey());
        A0x.append(str);
        A0x.append("  Signature Algorithm: ");
        A0x.append(this.sigAlgName);
        A0x.append(str);
        C202849ml.A02(str, A0x, getSignature());
        C22608Ara ara = this.c.A03.A08;
        if (ara != null) {
            Enumeration elements = ara.A01.elements();
            if (elements.hasMoreElements()) {
                A0x.append("       Extensions: \n");
            }
            while (elements.hasMoreElements()) {
                AnonymousClass122 r5 = (AnonymousClass122) elements.nextElement();
                C22634As0 A00 = C22608Ara.A00(r5, ara);
                C22659AsP asP = A00.A01;
                if (asP != null) {
                    C187118xI A03 = C187118xI.A03(A0x, asP, A00);
                    try {
                        if (r5.A0G(C22634As0.A06)) {
                            asq = C22619Arl.A00(A03.A06());
                        } else if (r5.A0G(C22634As0.A0L)) {
                            AnonymousClass121 A06 = A03.A06();
                            if (A06 != null) {
                                asq = new C22602ArU(C22586ArE.A01(A06));
                            } else {
                                asq = null;
                            }
                        } else if (r5.A0G(B4Q.A0R)) {
                            asq = new C22684Aso(C22586ArE.A01(A03.A06()));
                        } else if (r5.A0G(B4Q.A0T)) {
                            asq = new C22685Asp(C22671Asb.A01(A03.A06()));
                        } else if (r5.A0G(B4Q.A0Z)) {
                            asq = new C22686Asq(C22671Asb.A01(A03.A06()));
                        } else {
                            A0x.append(r5.A01);
                            A0x.append(" value = ");
                            A0x.append(C196359Zi.A00(A03.A06()));
                            A0x.append(str);
                        }
                        A0x.append(asq);
                        A0x.append(str);
                    } catch (Exception unused) {
                        A0x.append(r5.A01);
                        A0x.append(" value = ");
                        A0x.append("*****");
                    }
                }
                A0x.append(str);
            }
        }
        return A0x.toString();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Collection A00(java.lang.String r5, X.C22616Ari r6) {
        /*
            byte[] r0 = A03(r5, r6)
            r6 = 0
            if (r0 == 0) goto L_0x0080
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()     // Catch:{ Exception -> 0x0075 }
            X.AsM r0 = X.C22656AsM.A04(r0)     // Catch:{ Exception -> 0x0075 }
            java.util.Enumeration r5 = r0.A0I()     // Catch:{ Exception -> 0x0075 }
        L_0x0013:
            boolean r0 = r5.hasMoreElements()     // Catch:{ Exception -> 0x0075 }
            if (r0 == 0) goto L_0x006a
            java.lang.Object r0 = r5.nextElement()     // Catch:{ Exception -> 0x0075 }
            X.As6 r3 = X.C22640As6.A01(r0)     // Catch:{ Exception -> 0x0075 }
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()     // Catch:{ Exception -> 0x0075 }
            int r0 = r3.A00     // Catch:{ Exception -> 0x0075 }
            X.AnonymousClass000.A1F(r2, r0)     // Catch:{ Exception -> 0x0075 }
            switch(r0) {
                case 0: goto L_0x004e;
                case 1: goto L_0x002d;
                case 2: goto L_0x002d;
                case 3: goto L_0x004e;
                case 4: goto L_0x0053;
                case 5: goto L_0x004e;
                case 6: goto L_0x002d;
                case 7: goto L_0x003f;
                case 8: goto L_0x0036;
                default: goto L_0x002d;
            }     // Catch:{ Exception -> 0x0075 }
        L_0x002d:
            X.11z r0 = r3.A01     // Catch:{ Exception -> 0x0075 }
            X.B0I r0 = (X.B0I) r0     // Catch:{ Exception -> 0x0075 }
            java.lang.String r0 = r0.BHz()     // Catch:{ Exception -> 0x0075 }
            goto L_0x005f
        L_0x0036:
            X.11z r0 = r3.A01     // Catch:{ Exception -> 0x0075 }
            X.122 r0 = X.AnonymousClass122.A01(r0)     // Catch:{ Exception -> 0x0075 }
            java.lang.String r0 = r0.A01     // Catch:{ Exception -> 0x0075 }
            goto L_0x005f
        L_0x003f:
            X.11z r0 = r3.A01     // Catch:{ Exception -> 0x0075 }
            byte[] r0 = X.C22659AsP.A03(r0)     // Catch:{ Exception -> 0x0075 }
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r0)     // Catch:{ UnknownHostException -> 0x0013 }
            java.lang.String r0 = r0.getHostAddress()     // Catch:{ UnknownHostException -> 0x0013 }
            goto L_0x005f
        L_0x004e:
            byte[] r0 = r3.A08()     // Catch:{ Exception -> 0x0075 }
            goto L_0x005f
        L_0x0053:
            X.9gd r1 = X.C22689Ast.A0j     // Catch:{ Exception -> 0x0075 }
            X.11z r0 = r3.A01     // Catch:{ Exception -> 0x0075 }
            X.As7 r0 = X.C22641As7.A02(r0, r1)     // Catch:{ Exception -> 0x0075 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0075 }
        L_0x005f:
            r2.add(r0)     // Catch:{ Exception -> 0x0075 }
            java.util.List r0 = java.util.Collections.unmodifiableList(r2)     // Catch:{ Exception -> 0x0075 }
            r4.add(r0)     // Catch:{ Exception -> 0x0075 }
            goto L_0x0013
        L_0x006a:
            int r0 = r4.size()     // Catch:{ Exception -> 0x0075 }
            if (r0 == 0) goto L_0x0080
            java.util.Collection r0 = java.util.Collections.unmodifiableCollection(r4)     // Catch:{ Exception -> 0x0075 }
            return r0
        L_0x0075:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.security.cert.CertificateParsingException r0 = new java.security.cert.CertificateParsingException
            r0.<init>(r1)
            throw r0
        L_0x0080:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21879Ac5.A00(java.lang.String, X.Ari):java.util.Collection");
    }

    public void checkValidity(Date date) {
        if (date.getTime() > getNotAfter().getTime()) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("certificate expired on ");
            throw new CertificateExpiredException(AnonymousClass000.A0q(this.c.A03.A0A.A0A(), A0u));
        } else if (date.getTime() < getNotBefore().getTime()) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("certificate not valid till ");
            throw new CertificateNotYetValidException(AnonymousClass000.A0q(this.c.A03.A0B.A0A(), A0u2));
        }
    }

    public Set getCriticalExtensionOIDs() {
        if (getVersion() == 3) {
            HashSet A16 = C36441kJ.A16();
            C22608Ara ara = this.c.A03.A08;
            if (ara != null) {
                Enumeration elements = ara.A01.elements();
                while (elements.hasMoreElements()) {
                    AnonymousClass122 r1 = (AnonymousClass122) elements.nextElement();
                    if (C22608Ara.A00(r1, ara).A02) {
                        A16.add(r1.A01);
                    }
                }
                return A16;
            }
        }
        return null;
    }

    public Set getNonCriticalExtensionOIDs() {
        if (getVersion() == 3) {
            HashSet A16 = C36441kJ.A16();
            C22608Ara ara = this.c.A03.A08;
            if (ara != null) {
                Enumeration elements = ara.A01.elements();
                while (elements.hasMoreElements()) {
                    AnonymousClass122 r1 = (AnonymousClass122) elements.nextElement();
                    if (!C22608Ara.A00(r1, ara).A02) {
                        A16.add(r1.A01);
                    }
                }
                return A16;
            }
        }
        return null;
    }

    public boolean hasUnsupportedCriticalExtension() {
        C22608Ara ara;
        if (getVersion() != 3 || (ara = this.c.A03.A08) == null) {
            return false;
        }
        Enumeration elements = ara.A01.elements();
        while (elements.hasMoreElements()) {
            AnonymousClass121 r2 = (AnonymousClass121) elements.nextElement();
            if (!r2.A0G(C22634As0.A0L) && !r2.A0G(C22634As0.A0B) && !r2.A0G(C22634As0.A0Q) && !r2.A0G(C22634As0.A0G) && !r2.A0G(C22634As0.A08) && !r2.A0G(C22634As0.A0K) && !r2.A0G(C22634As0.A0C) && !r2.A0G(C22634As0.A0P) && !r2.A0G(C22634As0.A06) && !r2.A0G(C22634As0.A0U) && !r2.A0G(C22634As0.A0N) && C22608Ara.A00(r2, ara).A02) {
                return true;
            }
        }
        return false;
    }
}
