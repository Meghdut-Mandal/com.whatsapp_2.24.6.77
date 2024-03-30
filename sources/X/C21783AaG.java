package X;

import java.io.IOException;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.Extension;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.AaG  reason: case insensitive filesystem */
public class C21783AaG implements B20 {
    public static final Map A05;
    public String A00;
    public AnonymousClass9NL A01;
    public boolean A02;
    public final C22844Awt A03;
    public final C21874Ac0 A04;

    public C21783AaG(C22844Awt awt, C21874Ac0 ac0) {
        this.A04 = ac0;
        this.A03 = awt;
    }

    public void BKg(AnonymousClass9NL r2) {
        this.A01 = r2;
        this.A02 = C200679hw.A01("ocsp.enable");
        this.A00 = C200679hw.A00("ocsp.responderURL");
    }

    private C22615Arh A00(C22654AsK asK, C22632Ary ary, C22616Ari ari) {
        try {
            C22844Awt awt = this.A03;
            AnonymousClass122 r2 = ary.A01;
            String A1A = C36431kI.A1A(r2, AnonymousClass9A2.A00);
            if (A1A == null) {
                A1A = r2.A01;
            }
            MessageDigest instance = MessageDigest.getInstance(A1A, ((C21786AaJ) awt).A00);
            C22617Arj arj = ari.A03;
            return new C22615Arh(asK, new C22644AsA(instance.digest(arj.A06.A09("DER"))), new C22644AsA(instance.digest(arj.A09.A00.A0H())), ary);
        } catch (Exception e) {
            throw new CertPathValidatorException(AnonymousClass000.A0l(e, "problem creating ID: ", AnonymousClass000.A0u()), e);
        }
    }

    private C22616Ari A01() {
        try {
            return C22616Ari.A00(this.A01.A03.getEncoded());
        } catch (Exception e) {
            throw AnonymousClass9NL.A00(C36331k8.A0i("cannot process signing cert: ", AnonymousClass000.A0u(), e), e, this.A01);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e1, code lost:
        if (r3 == false) goto L_0x00e3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e6 A[Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ee A[Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f7 A[Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x018e A[Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ab A[Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }, RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(java.security.cert.X509Certificate r11, X.C22614Arg r12, X.AnonymousClass9NL r13, X.C22844Awt r14, byte[] r15) {
        /*
            java.lang.String r2 = "OCSP response failure: "
            X.AsM r0 = r12.A00     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            X.Ary r5 = r12.A03     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            X.11z r4 = r5.A00     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            if (r4 == 0) goto L_0x0046
            X.ArI r3 = X.C22590ArI.A00     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            if (r3 == r4) goto L_0x0046
            X.121 r1 = r4.Bve()     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            boolean r1 = r3.A0F(r1)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            if (r1 != 0) goto L_0x0046
            X.122 r3 = r5.A01     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            X.122 r1 = X.C219311y.A0I     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            boolean r1 = r3.A0G(r1)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            if (r1 == 0) goto L_0x0046
            X.Ary r1 = X.C22626Ars.A06     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            boolean r1 = r4 instanceof X.C22626Ars     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            if (r1 == 0) goto L_0x0039
            X.Ars r4 = (X.C22626Ars) r4     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
        L_0x002a:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            X.Ary r1 = r4.A00     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            X.122 r3 = r1.A01     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            java.util.Map r1 = X.AnonymousClass9A2.A00     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            java.lang.String r6 = X.C36431kI.A1A(r3, r1)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            goto L_0x0043
        L_0x0039:
            X.AsM r1 = X.C22656AsM.A04(r4)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            X.Ars r4 = new X.Ars     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            r4.<init>(r1)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            goto L_0x002a
        L_0x0043:
            if (r6 != 0) goto L_0x005a
            goto L_0x0058
        L_0x0046:
            java.util.Map r4 = A05     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            X.122 r3 = r5.A01     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            boolean r1 = r4.containsKey(r3)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            if (r1 == 0) goto L_0x0055
            java.lang.String r1 = X.C36431kI.A1A(r3, r4)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            goto L_0x0083
        L_0x0055:
            java.lang.String r1 = r3.A01     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            goto L_0x0083
        L_0x0058:
            java.lang.String r6 = r3.A01     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
        L_0x005a:
            r1 = 45
            int r4 = r6.indexOf(r1)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            if (r4 <= 0) goto L_0x007a
            java.lang.String r1 = "SHA3"
            boolean r1 = r6.startsWith(r1)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            if (r1 != 0) goto L_0x007a
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            r1 = 0
            X.C165577te.A1O(r6, r3, r1, r4)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            java.lang.String r1 = X.C165607th.A0o(r4, r6)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            java.lang.String r6 = X.AnonymousClass000.A0q(r1, r3)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
        L_0x007a:
            r5.append(r6)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            java.lang.String r1 = "WITHRSAANDMGF1"
            java.lang.String r1 = X.AnonymousClass000.A0q(r1, r5)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
        L_0x0083:
            X.AaJ r14 = (X.C21786AaJ) r14     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            java.security.Provider r8 = r14.A00     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            java.security.Signature r6 = java.security.Signature.getInstance(r1, r8)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            java.security.cert.X509Certificate r1 = r13.A03     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            X.Art r5 = r12.A02     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            X.As2 r3 = r5.A01     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            X.11z r10 = r3.A00     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            boolean r9 = r10 instanceof X.C22659AsP     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            if (r9 == 0) goto L_0x00ab
            r3 = r10
            X.AsP r3 = (X.C22659AsP) r3     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            byte[] r7 = r3.A00     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            if (r7 == 0) goto L_0x00ab
            java.lang.String r3 = "SHA1"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r3, r8)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            if (r11 == 0) goto L_0x00f0
            boolean r3 = A02(r4, r11, r7)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            goto L_0x00e8
        L_0x00ab:
            X.9gd r7 = X.C22690Asu.A00     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            if (r9 == 0) goto L_0x00b1
            r3 = 0
            goto L_0x00b5
        L_0x00b1:
            X.As7 r3 = X.C22641As7.A01(r10)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
        L_0x00b5:
            X.As7 r4 = X.C22641As7.A02(r3, r7)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            if (r11 == 0) goto L_0x00ce
            javax.security.auth.x500.X500Principal r3 = r11.getSubjectX500Principal()     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            byte[] r3 = r3.getEncoded()     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            X.As7 r3 = X.C22641As7.A02(r3, r7)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            boolean r3 = r4.equals(r3)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            if (r3 == 0) goto L_0x00ce
            goto L_0x00ea
        L_0x00ce:
            if (r1 == 0) goto L_0x00e3
            javax.security.auth.x500.X500Principal r3 = r1.getSubjectX500Principal()     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            byte[] r3 = r3.getEncoded()     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            X.As7 r3 = X.C22641As7.A02(r3, r7)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            boolean r3 = r4.equals(r3)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
        L_0x00e0:
            r11 = r1
            if (r3 != 0) goto L_0x00ea
        L_0x00e3:
            r11 = 0
            if (r0 != 0) goto L_0x00ea
            goto L_0x01ba
        L_0x00e8:
            if (r3 == 0) goto L_0x00f0
        L_0x00ea:
            r4 = 0
            r3 = 0
            if (r11 == 0) goto L_0x00f7
            goto L_0x0172
        L_0x00f0:
            if (r1 == 0) goto L_0x00e3
            boolean r3 = A02(r4, r1, r7)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            goto L_0x00e0
        L_0x00f7:
            java.lang.String r7 = "X.509"
            java.security.cert.CertificateFactory r7 = java.security.cert.CertificateFactory.getInstance(r7, r8)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            X.11z r0 = r0.A0J(r4)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            X.121 r0 = r0.Bve()     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            byte[] r0 = r0.A08()     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            java.io.ByteArrayInputStream r0 = X.C90524aI.A0P(r0)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            java.security.cert.Certificate r7 = r7.generateCertificate(r0)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            java.security.PublicKey r0 = r1.getPublicKey()     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            r7.verify(r0)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            java.util.Date r0 = r13.A04     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            long r0 = r0.getTime()     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            java.util.Date r11 = new java.util.Date     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            r11.<init>(r0)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            r7.checkValidity(r11)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            if (r9 == 0) goto L_0x013c
            r0 = r10
            X.AsP r0 = (X.C22659AsP) r0     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            byte[] r1 = r0.A00     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            if (r1 == 0) goto L_0x013c
            java.lang.String r0 = "SHA1"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0, r8)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            boolean r0 = A02(r0, r7, r1)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            goto L_0x015a
        L_0x013c:
            X.9gd r8 = X.C22690Asu.A00     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            if (r9 == 0) goto L_0x0142
            r0 = 0
            goto L_0x0146
        L_0x0142:
            X.As7 r0 = X.C22641As7.A01(r10)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
        L_0x0146:
            X.As7 r1 = X.C22641As7.A02(r0, r8)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            javax.security.auth.x500.X500Principal r0 = r7.getSubjectX500Principal()     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            byte[] r0 = r0.getEncoded()     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            X.As7 r0 = X.C22641As7.A02(r0, r8)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            boolean r0 = r1.equals(r0)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
        L_0x015a:
            if (r0 == 0) goto L_0x01b3
            java.util.List r1 = r7.getExtendedKeyUsage()     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            if (r1 == 0) goto L_0x01ac
            X.Ark r0 = X.C22618Ark.A02     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            X.122 r0 = r0.A00     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            java.lang.String r0 = r0.A01     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            boolean r0 = r1.contains(r0)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            if (r0 == 0) goto L_0x01ac
            r6.initVerify(r7)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            goto L_0x0179
        L_0x0172:
            java.security.PublicKey r0 = r11.getPublicKey()     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            r6.initVerify(r0)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
        L_0x0179:
            java.lang.String r0 = "DER"
            byte[] r0 = r5.A09(r0)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            r6.update(r0)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            X.ArE r0 = r12.A01     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            byte[] r0 = r0.A0H()     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            boolean r0 = r6.verify(r0)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            if (r0 == 0) goto L_0x01ab
            if (r15 == 0) goto L_0x01a9
            X.Ara r1 = r5.A02     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            X.122 r0 = X.B4G.A06     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            X.As0 r0 = X.C22608Ara.A00(r0, r1)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            X.AsP r0 = r0.A01     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            byte[] r0 = r0.A00     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            boolean r0 = java.util.Arrays.equals(r15, r0)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            if (r0 != 0) goto L_0x01a9
            java.lang.String r0 = "nonce mismatch in OCSP response"
            java.security.cert.CertPathValidatorException r1 = X.AnonymousClass9NL.A00(r0, r3, r13)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            goto L_0x01c1
        L_0x01a9:
            r0 = 1
            return r0
        L_0x01ab:
            return r4
        L_0x01ac:
            java.lang.String r0 = "responder certificate not valid for signing OCSP responses"
            java.security.cert.CertPathValidatorException r1 = X.AnonymousClass9NL.A00(r0, r3, r13)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            goto L_0x01c1
        L_0x01b3:
            java.lang.String r0 = "responder certificate does not match responderID"
            java.security.cert.CertPathValidatorException r1 = X.AnonymousClass9NL.A00(r0, r3, r13)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            goto L_0x01c1
        L_0x01ba:
            java.lang.String r0 = "OCSP responder certificate not found"
            java.security.cert.CertPathValidatorException r1 = new java.security.cert.CertPathValidatorException     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
            r1.<init>(r0)     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
        L_0x01c1:
            throw r1     // Catch:{ CertPathValidatorException -> 0x01de, GeneralSecurityException -> 0x01d0, IOException -> 0x01c2 }
        L_0x01c2:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            java.lang.String r0 = X.C36331k8.A0i(r2, r0, r1)
            java.security.cert.CertPathValidatorException r0 = X.AnonymousClass9NL.A00(r0, r1, r13)
            throw r0
        L_0x01d0:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            java.lang.String r0 = X.C36331k8.A0i(r2, r0, r1)
            java.security.cert.CertPathValidatorException r0 = X.AnonymousClass9NL.A00(r0, r1, r13)
            throw r0
        L_0x01de:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21783AaG.A03(java.security.cert.X509Certificate, X.Arg, X.9NL, X.Awt, byte[]):boolean");
    }

    public void check(Certificate certificate) {
        boolean z;
        byte[] bArr;
        C22594ArM arM;
        C22614Arg arg;
        C22597ArP arP;
        Throwable A002;
        C22595ArN arN;
        C22600ArS arS;
        X509Certificate x509Certificate = (X509Certificate) certificate;
        C21874Ac0 ac0 = this.A04;
        Map ocspResponses = ac0.getOcspResponses();
        URI ocspResponder = ac0.getOcspResponder();
        if (ocspResponder == null) {
            String str = this.A00;
            if (str != null) {
                try {
                    ocspResponder = new URI(str);
                } catch (URISyntaxException e) {
                    throw AnonymousClass9NL.A00(C36331k8.A0i("configuration error: ", AnonymousClass000.A0u(), e), e, this.A01);
                }
            } else {
                byte[] extensionValue = x509Certificate.getExtensionValue(C22634As0.A04.A01);
                ocspResponder = null;
                if (extensionValue != null) {
                    byte[] A032 = C22659AsP.A03(extensionValue);
                    if (A032 instanceof C22600ArS) {
                        arS = (C22600ArS) A032;
                    } else if (A032 != null) {
                        arS = new C22600ArS(C22656AsM.A04(A032));
                    } else {
                        arS = null;
                    }
                    C22620Arm[] armArr = arS.A00;
                    int length = armArr.length;
                    C22620Arm[] armArr2 = new C22620Arm[length];
                    System.arraycopy(armArr, 0, armArr2, 0, length);
                    int i = 0;
                    while (true) {
                        if (i == length) {
                            break;
                        }
                        C22620Arm arm = armArr2[i];
                        if (C22620Arm.A03.A0G(arm.A00)) {
                            C22640As6 as6 = arm.A01;
                            if (as6.A00 == 6) {
                                try {
                                    ocspResponder = new URI(((B0I) as6.A01).BHz());
                                    break;
                                } catch (URISyntaxException unused) {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                        i++;
                    }
                }
            }
        }
        if (ocspResponses.get(x509Certificate) != null || ocspResponder == null) {
            List ocspExtensions = ac0.getOcspExtensions();
            bArr = null;
            for (int i2 = 0; i2 != ocspExtensions.size(); i2++) {
                Extension extension = (Extension) ocspExtensions.get(i2);
                byte[] value = extension.getValue();
                AnonymousClass122 r0 = B4G.A00;
                if ("1.3.6.1.5.5.7.48.1.2".equals(extension.getId())) {
                    bArr = value;
                }
            }
            z = false;
        } else if (this.A00 == null && ac0.getOcspResponder() == null && !this.A02) {
            AnonymousClass9NL r02 = this.A01;
            throw new C21870Abu("OCSP disabled by \"ocsp.enable\" setting", r02.A02, r02.A00);
        } else {
            try {
                ocspResponses.put(x509Certificate, C196859ae.A00(ocspResponder, ac0.getOcspResponderCert(), ac0.getOcspExtensions(), A00(new C22654AsK(x509Certificate.getSerialNumber()), new C22632Ary(AnonymousClass128.A07), A01()), this.A01, this.A03).A08());
                bArr = null;
                z = true;
            } catch (IOException e2) {
                AnonymousClass9NL r03 = this.A01;
                throw new CertPathValidatorException("unable to encode OCSP response", e2, r03.A02, r03.A00);
            }
        }
        if (!ocspResponses.isEmpty()) {
            Object obj = ocspResponses.get(x509Certificate);
            if (obj instanceof C22594ArM) {
                arM = (C22594ArM) obj;
            } else if (obj != null) {
                arM = new C22594ArM(C22656AsM.A04(obj));
            } else {
                arM = null;
            }
            C22654AsK asK = new C22654AsK(x509Certificate.getSerialNumber());
            if (arM != null) {
                C22652AsI asI = arM.A00.A00;
                if (asI.A0H() == 0) {
                    C22607ArZ arZ = arM.A01;
                    if (arZ == null) {
                        arZ = null;
                    }
                    if (arZ.A00.A0G(B4G.A02)) {
                        try {
                            byte[] bArr2 = arZ.A01.A00;
                            if (bArr2 instanceof C22614Arg) {
                                arg = (C22614Arg) bArr2;
                            } else if (bArr2 != null) {
                                arg = new C22614Arg(C22656AsM.A04(bArr2));
                            } else {
                                arg = null;
                            }
                            if (!z) {
                                if (!A03(ac0.getOcspResponderCert(), arg, this.A01, this.A03, bArr)) {
                                    return;
                                }
                            }
                            C22627Art art = arg.A02;
                            C22654AsK asK2 = C22627Art.A06;
                            if (art == null) {
                                art = null;
                            }
                            C22656AsM asM = art.A00;
                            C22615Arh arh = null;
                            for (int i3 = 0; i3 != asM.A0H(); i3++) {
                                C219411z A0J = asM.A0J(i3);
                                if (A0J instanceof C22597ArP) {
                                    arP = (C22597ArP) A0J;
                                } else if (A0J != null) {
                                    arP = new C22597ArP(C22656AsM.A04(A0J));
                                } else {
                                    arP = null;
                                }
                                C22615Arh arh2 = arP.A01;
                                if (asK.A0G(arh2.A02)) {
                                    C22655AsL asL = arP.A00;
                                    if (asL == null || !new Date(this.A01.A04.getTime()).after(asL.A0I())) {
                                        if (arh == null || !arh.A03.equals(arh2.A03)) {
                                            arh = A00(asK, arh2.A03, A01());
                                        }
                                        if (arh.equals(arh2)) {
                                            C22637As3 as3 = arP.A02;
                                            int i4 = as3.A00;
                                            if (i4 == 0) {
                                                return;
                                            }
                                            if (i4 == 1) {
                                                C219411z r5 = as3.A01;
                                                if (r5 instanceof C22595ArN) {
                                                    arN = (C22595ArN) r5;
                                                } else if (r5 != null) {
                                                    arN = new C22595ArN(C22656AsM.A04(r5));
                                                } else {
                                                    arN = null;
                                                }
                                                C22628Aru aru = arN.A01;
                                                StringBuilder A0u = AnonymousClass000.A0u();
                                                A0u.append("certificate revoked, reason=(");
                                                A0u.append(aru);
                                                A0u.append("), date=");
                                                A002 = AnonymousClass9NL.A00(AnonymousClass000.A0o(arN.A00.A0I(), A0u), (Throwable) null, this.A01);
                                            } else {
                                                A002 = AnonymousClass9NL.A00("certificate revoked, details unknown", (Throwable) null, this.A01);
                                            }
                                        }
                                    } else {
                                        A002 = new C21871Abv();
                                    }
                                    throw A002;
                                }
                            }
                        } catch (CertPathValidatorException e3) {
                            throw e3;
                        } catch (Exception e4) {
                            AnonymousClass9NL r04 = this.A01;
                            throw new CertPathValidatorException("unable to process OCSP response", e4, r04.A02, r04.A00);
                        }
                    }
                } else {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("OCSP response failed: ");
                    throw AnonymousClass9NL.A00(AnonymousClass000.A0o(new BigInteger(asI.A00), A0u2), (Throwable) null, this.A01);
                }
            } else {
                AnonymousClass9NL r05 = this.A01;
                throw new C21870Abu("no OCSP response found for certificate", r05.A02, r05.A00);
            }
        } else {
            AnonymousClass9NL r06 = this.A01;
            throw new C21870Abu("no OCSP response found for any certificate", r06.A02, r06.A00);
        }
    }

    static {
        HashMap A0J = AnonymousClass001.A0J();
        A05 = A0J;
        A0J.put(C165617ti.A0f("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        A0J.put(C219311y.A2D, "SHA224WITHRSA");
        A0J.put(C219311y.A2E, "SHA256WITHRSA");
        C165577te.A1L(C219311y.A2F, A0J);
        C165577te.A1K(B4L.A0G, A0J);
    }

    public static boolean A02(MessageDigest messageDigest, Certificate certificate, byte[] bArr) {
        return Arrays.equals(bArr, messageDigest.digest(C22611Ard.A00(certificate.getPublicKey().getEncoded()).A00.A0H()));
    }
}
