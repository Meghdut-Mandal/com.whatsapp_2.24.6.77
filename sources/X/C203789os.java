package X;

import java.math.BigInteger;
import java.security.cert.CRLSelector;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.9os  reason: invalid class name and case insensitive filesystem */
public class C203789os {
    public static final Class A00 = AnonymousClass11t.A00("java.security.cert.PKIXRevocationChecker", C203789os.class);
    public static final String A01 = C22634As0.A05.A01;
    public static final String A02 = C22634As0.A06.A01;
    public static final String A03 = C22634As0.A0B.A01;
    public static final String A04 = C22634As0.A08.A01;
    public static final String A05 = C22634As0.A0C.A01;
    public static final String A06 = C22634As0.A0G.A01;
    public static final String A07 = C22634As0.A0K.A01;
    public static final String A08 = C22634As0.A0L.A01;
    public static final String A09 = C22634As0.A0N.A01;
    public static final String A0A = C22634As0.A0P.A01;
    public static final String A0B = C22634As0.A0Q.A01;
    public static final String A0C = C22634As0.A0U.A01;
    public static final String[] A0D = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0060 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0A(java.security.PublicKey r11, java.security.cert.CertPath r12, java.security.cert.X509Certificate r13, java.util.Date r14, X.C22641As7 r15, X.B20 r16, X.AXM r17, int r18, boolean r19) {
        /*
            r10 = r14
            java.lang.String r2 = "Could not validate certificate: "
            r8 = r12
            r12 = r18
            java.security.cert.X509Certificate r4 = X.C165577te.A0n(r8, r12)
            r7 = r11
            r11 = r17
            if (r19 != 0) goto L_0x0029
            java.security.cert.PKIXParameters r0 = r11.A01     // Catch:{ GeneralSecurityException -> 0x0021 }
            java.lang.String r1 = r0.getSigProvider()     // Catch:{ GeneralSecurityException -> 0x0021 }
            java.lang.String r0 = X.C203669oV.A01     // Catch:{ GeneralSecurityException -> 0x0021 }
            if (r1 != 0) goto L_0x001d
            r4.verify(r7)     // Catch:{ GeneralSecurityException -> 0x0021 }
            goto L_0x0029
        L_0x001d:
            r4.verify(r7, r1)     // Catch:{ GeneralSecurityException -> 0x0021 }
            goto L_0x0029
        L_0x0021:
            r1 = move-exception
            java.lang.String r0 = "Could not validate certificate signature."
            X.Abv r0 = X.C21871Abv.A00(r0, r1, r8, r12)
            throw r0
        L_0x0029:
            int r1 = r11.A00     // Catch:{ 91s -> 0x00d0 }
            java.lang.String r0 = X.C203669oV.A01     // Catch:{ 91s -> 0x00d0 }
            java.lang.String r6 = "Date of cert gen extension could not be read."
            r0 = 1
            if (r0 != r1) goto L_0x0076
            if (r18 <= 0) goto L_0x0076
            java.util.List r1 = r8.getCertificates()     // Catch:{ 91s -> 0x00d0 }
            int r0 = r18 - r0
            java.lang.Object r5 = r1.get(r0)     // Catch:{ 91s -> 0x00d0 }
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5     // Catch:{ 91s -> 0x00d0 }
            if (r0 != 0) goto L_0x0072
            r3 = 0
            java.security.cert.X509Certificate r1 = X.C165577te.A0n(r8, r0)     // Catch:{ IOException -> 0x0065, IllegalArgumentException -> 0x0060 }
            X.122 r0 = X.B4I.A07     // Catch:{ IOException -> 0x0065, IllegalArgumentException -> 0x0060 }
            java.lang.String r0 = r0.A01     // Catch:{ IOException -> 0x0065, IllegalArgumentException -> 0x0060 }
            byte[] r0 = r1.getExtensionValue(r0)     // Catch:{ IOException -> 0x0065, IllegalArgumentException -> 0x0060 }
            if (r0 == 0) goto L_0x0072
            X.121 r0 = X.AnonymousClass121.A00(r0)     // Catch:{ IOException -> 0x0065, IllegalArgumentException -> 0x0060 }
            X.AsL r0 = X.C22655AsL.A05(r0)     // Catch:{ IOException -> 0x0065, IllegalArgumentException -> 0x0060 }
            if (r0 == 0) goto L_0x0072
            java.util.Date r10 = r0.A0I()     // Catch:{ ParseException -> 0x006a }
            goto L_0x0076
        L_0x0060:
            X.91s r0 = X.C1890191s.A00(r6, r3)     // Catch:{ 91s -> 0x00d0 }
            goto L_0x0071
        L_0x0065:
            X.91s r0 = X.C1890191s.A00(r6, r3)     // Catch:{ 91s -> 0x00d0 }
            goto L_0x0071
        L_0x006a:
            r1 = move-exception
            java.lang.String r0 = "Date from date of cert gen extension could not be parsed."
            X.91s r0 = X.C1890191s.A00(r0, r1)     // Catch:{ 91s -> 0x00d0 }
        L_0x0071:
            throw r0     // Catch:{ 91s -> 0x00d0 }
        L_0x0072:
            java.util.Date r10 = r5.getNotBefore()     // Catch:{ 91s -> 0x00d0 }
        L_0x0076:
            r4.checkValidity(r10)     // Catch:{ CertificateExpiredException -> 0x00c2, CertificateNotYetValidException -> 0x00b4 }
            r0 = r16
            if (r16 == 0) goto L_0x0089
            X.9NL r6 = new X.9NL
            r9 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.BKg(r6)
            r0.check(r4)
        L_0x0089:
            X.As7 r2 = X.C201789kO.A01(r4)
            boolean r0 = r2.equals(r15)
            if (r0 == 0) goto L_0x0094
            return
        L_0x0094:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "IssuerName("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ") does not match SubjectName("
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = ") of signing certificate."
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            r0 = 0
            X.Abv r0 = X.C21871Abv.A00(r1, r0, r8, r12)
            throw r0
        L_0x00b4:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            java.lang.String r0 = X.C36331k8.A0i(r2, r0, r1)
            X.Abv r0 = X.C21871Abv.A00(r0, r1, r8, r12)
            throw r0
        L_0x00c2:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            java.lang.String r0 = X.C36331k8.A0i(r2, r0, r1)
            X.Abv r0 = X.C21871Abv.A00(r0, r1, r8, r12)
            throw r0
        L_0x00d0:
            r1 = move-exception
            java.lang.String r0 = "Could not validate time of certificate."
            X.Abv r0 = X.C21871Abv.A00(r0, r1, r8, r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203789os.A0A(java.security.PublicKey, java.security.cert.CertPath, java.security.cert.X509Certificate, java.util.Date, X.As7, X.B20, X.AXM, int, boolean):void");
    }

    public static AXN A07(CertPath certPath, Set set, AXN axn, List[] listArr, int i, int i2, boolean z) {
        List[] listArr2;
        C22603ArV arV;
        String str;
        C22603ArV arV2;
        CertPath certPath2 = certPath;
        AXN axn2 = axn;
        List<? extends Certificate> certificates = certPath2.getCertificates();
        int i3 = i;
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i3);
        int size = certificates.size();
        int i4 = size - i;
        try {
            String str2 = A03;
            C22656AsM A042 = C22656AsM.A04(C203669oV.A05(str2, x509Certificate));
            if (A042 == null || axn == null) {
                return null;
            }
            Enumeration A0I = A042.A0I();
            HashSet A16 = C36441kJ.A16();
            while (true) {
                listArr2 = listArr;
                if (!A0I.hasMoreElements()) {
                    break;
                }
                Object nextElement = A0I.nextElement();
                if (nextElement == null || (nextElement instanceof C22603ArV)) {
                    arV2 = (C22603ArV) nextElement;
                } else {
                    arV2 = new C22603ArV(C22656AsM.A04(nextElement));
                }
                String str3 = arV2.A00.A01;
                A16.add(str3);
                if (!"2.5.29.32.0".equals(str3)) {
                    try {
                        HashSet A022 = C203669oV.A02(arV2.A01);
                        int i5 = i4 - 1;
                        List list = listArr[i5];
                        int i6 = 0;
                        while (true) {
                            if (i6 >= list.size()) {
                                List list2 = listArr[i5];
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= list2.size()) {
                                        break;
                                    }
                                    AXN axn3 = (AXN) list2.get(i7);
                                    if ("2.5.29.32.0".equals(axn3.getValidPolicy())) {
                                        HashSet A162 = C36441kJ.A16();
                                        A162.add(str3);
                                        AXN axn4 = new AXN(str3, axn3, AnonymousClass001.A0I(), A162, A022, i4, false);
                                        axn3.A01.add(axn4);
                                        axn4.A00 = axn3;
                                        listArr[i4].add(axn4);
                                        break;
                                    }
                                    i7++;
                                }
                            } else {
                                AXN axn5 = (AXN) list.get(i6);
                                if (axn5.getExpectedPolicies().contains(str3)) {
                                    HashSet A163 = C36441kJ.A16();
                                    A163.add(str3);
                                    AXN axn6 = new AXN(str3, axn5, AnonymousClass001.A0I(), A163, A022, i4, false);
                                    axn5.A01.add(axn6);
                                    axn6.A00 = axn5;
                                    listArr[i4].add(axn6);
                                    break;
                                }
                                i6++;
                            }
                        }
                    } catch (CertPathValidatorException e) {
                        throw C21871Abv.A00("Policy qualifier info set could not be build.", e, certPath2, i3);
                    }
                }
            }
            Set set2 = set;
            if (set2.isEmpty() || set2.contains("2.5.29.32.0")) {
                set2.clear();
                set2.addAll(A16);
            } else {
                HashSet A164 = C36441kJ.A16();
                for (Object next : set2) {
                    if (A16.contains(next)) {
                        A164.add(next);
                    }
                }
                set2.clear();
                set2.addAll(A164);
            }
            if (i2 > 0 || ((i4 < size || z) && C165607th.A1W(x509Certificate))) {
                Enumeration A0I2 = A042.A0I();
                while (true) {
                    if (!A0I2.hasMoreElements()) {
                        break;
                    }
                    Object nextElement2 = A0I2.nextElement();
                    if (nextElement2 == null || (nextElement2 instanceof C22603ArV)) {
                        arV = (C22603ArV) nextElement2;
                    } else {
                        arV = new C22603ArV(C22656AsM.A04(nextElement2));
                    }
                    if ("2.5.29.32.0".equals(arV.A00.A01)) {
                        HashSet A023 = C203669oV.A02(arV.A01);
                        List list3 = listArr[i4 - 1];
                        for (int i8 = 0; i8 < list3.size(); i8++) {
                            AXN axn7 = (AXN) list3.get(i8);
                            for (Object next2 : axn7.getExpectedPolicies()) {
                                if (next2 instanceof String) {
                                    str = (String) next2;
                                } else if (next2 instanceof AnonymousClass122) {
                                    str = ((AnonymousClass122) next2).A01;
                                }
                                Iterator children = axn7.getChildren();
                                boolean z2 = false;
                                while (children.hasNext()) {
                                    if (str.equals(((AXN) children.next()).getValidPolicy())) {
                                        z2 = true;
                                    }
                                }
                                if (!z2) {
                                    HashSet A165 = C36441kJ.A16();
                                    A165.add(str);
                                    AXN axn8 = new AXN(str, axn7, AnonymousClass001.A0I(), A165, A023, i4, false);
                                    axn7.A01.add(axn8);
                                    axn8.A00 = axn7;
                                    listArr[i4].add(axn8);
                                }
                            }
                        }
                    }
                }
            }
            for (int i9 = i4 - 1; i9 >= 0; i9--) {
                List list4 = listArr[i9];
                for (int i10 = 0; i10 < list4.size(); i10++) {
                    AXN axn9 = (AXN) list4.get(i10);
                    if (!C36401kF.A1a(axn9.A01) && (axn2 = C203669oV.A06(axn2, axn9, listArr2)) == null) {
                        break;
                    }
                }
            }
            Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs == null) {
                return axn2;
            }
            boolean contains = criticalExtensionOIDs.contains(str2);
            List list5 = listArr[i4];
            for (int i11 = 0; i11 < list5.size(); i11++) {
                ((AXN) list5.get(i11)).A02 = contains;
            }
            return axn2;
        } catch (C1890191s e2) {
            throw C21871Abv.A00("Could not read certificate policies extension from certificate.", e2, certPath2, i3);
        }
    }

    public static AXN A09(CertPath certPath, AXN axn, List[] listArr, int i, int i2) {
        boolean z;
        C22603ArV arV;
        CertPath certPath2 = certPath;
        AXN axn2 = axn;
        List<? extends Certificate> certificates = certPath2.getCertificates();
        int i3 = i;
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i3);
        int A062 = C36421kH.A06(certificates, i3);
        try {
            C22656AsM A042 = C22656AsM.A04(C203669oV.A05(A0B, x509Certificate));
            if (A042 != null) {
                HashMap A0J = AnonymousClass001.A0J();
                HashSet A16 = C36441kJ.A16();
                for (int i4 = 0; i4 < A042.A0H(); i4++) {
                    C22656AsM asM = (C22656AsM) A042.A0J(i4);
                    String str = ((AnonymousClass122) asM.A0J(0)).A01;
                    String str2 = ((AnonymousClass122) asM.A0J(1)).A01;
                    if (!A0J.containsKey(str)) {
                        HashSet A162 = C36441kJ.A16();
                        A162.add(str2);
                        A0J.put(str, A162);
                        A16.add(str);
                    } else {
                        ((Set) A0J.get(str)).add(str2);
                    }
                }
                Iterator it = A16.iterator();
                while (it.hasNext()) {
                    String A0C2 = AnonymousClass001.A0C(it);
                    List[] listArr2 = listArr;
                    Iterator it2 = listArr[A062].iterator();
                    if (i2 > 0) {
                        while (true) {
                            if (!it2.hasNext()) {
                                Iterator it3 = listArr[A062].iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    AXN axn3 = (AXN) it3.next();
                                    if ("2.5.29.32.0".equals(axn3.getValidPolicy())) {
                                        HashSet hashSet = null;
                                        try {
                                            String str3 = A03;
                                            Enumeration A0I = ((C22656AsM) C203669oV.A05(str3, x509Certificate)).A0I();
                                            while (true) {
                                                if (!A0I.hasMoreElements()) {
                                                    break;
                                                }
                                                try {
                                                    Object nextElement = A0I.nextElement();
                                                    if (nextElement == null || (nextElement instanceof C22603ArV)) {
                                                        arV = (C22603ArV) nextElement;
                                                    } else {
                                                        arV = new C22603ArV(C22656AsM.A04(nextElement));
                                                    }
                                                    if ("2.5.29.32.0".equals(arV.A00.A01)) {
                                                        try {
                                                            hashSet = C203669oV.A02(arV.A01);
                                                            break;
                                                        } catch (CertPathValidatorException e) {
                                                            throw C21871Abv.A00("Policy qualifier info set could not be decoded.", e, certPath2, i3);
                                                        }
                                                    }
                                                } catch (Exception e2) {
                                                    throw new CertPathValidatorException("Policy information could not be decoded.", e2, certPath2, i3);
                                                }
                                            }
                                            if (x509Certificate.getCriticalExtensionOIDs() != null) {
                                                z = x509Certificate.getCriticalExtensionOIDs().contains(str3);
                                            } else {
                                                z = false;
                                            }
                                            AXN axn4 = (AXN) axn3.getParent();
                                            if ("2.5.29.32.0".equals(axn4.getValidPolicy())) {
                                                AXN axn5 = new AXN(A0C2, axn4, AnonymousClass001.A0I(), (Set) A0J.get(A0C2), hashSet, A062, z);
                                                axn4.A01.add(axn5);
                                                axn5.A00 = axn4;
                                                listArr[A062].add(axn5);
                                            }
                                        } catch (C1890191s e3) {
                                            throw C21871Abv.A00("Certificate policies extension could not be decoded.", e3, certPath2, i3);
                                        }
                                    }
                                }
                            } else {
                                AXN axn6 = (AXN) it2.next();
                                if (axn6.getValidPolicy().equals(A0C2)) {
                                    axn6.A05 = (Set) A0J.get(A0C2);
                                    break;
                                }
                            }
                        }
                    } else {
                        while (it2.hasNext()) {
                            AXN axn7 = (AXN) it2.next();
                            if (axn7.getValidPolicy().equals(A0C2)) {
                                ((AXN) axn7.getParent()).A01.remove(axn7);
                                it2.remove();
                                for (int i5 = A062 - 1; i5 >= 0; i5--) {
                                    List list = listArr[i5];
                                    for (int i6 = 0; i6 < list.size(); i6++) {
                                        AXN axn8 = (AXN) list.get(i6);
                                        if (!C36401kF.A1a(axn8.A01) && (axn2 = C203669oV.A06(axn2, axn8, listArr2)) == null) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return axn2;
        } catch (C1890191s e4) {
            throw C21871Abv.A00("Policy mappings extension could not be decoded.", e4, certPath2, i3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x017d, code lost:
        if (java.util.Arrays.equals(r13, r8) != false) goto L_0x017f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x024c A[Catch:{ Exception -> 0x0426 }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x03a9 A[Catch:{ Exception -> 0x0426 }] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0515 A[Catch:{ Exception -> 0x0693 }] */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0646 A[Catch:{ Exception -> 0x0693 }] */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x01eb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x0348 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0H(java.security.cert.CertPath r24, X.AnonymousClass9Y9 r25, int r26) {
        /*
            r3 = r24
            r2 = r26
            java.security.cert.X509Certificate r1 = X.C165577te.A0n(r3, r2)
            java.lang.String r0 = A09     // Catch:{ Exception -> 0x069c }
            X.121 r0 = X.C203669oV.A05(r0, r1)     // Catch:{ Exception -> 0x069c }
            X.AsM r0 = X.C22656AsM.A04(r0)     // Catch:{ Exception -> 0x069c }
            if (r0 == 0) goto L_0x069b
            X.AsM r0 = X.C22656AsM.A04(r0)     // Catch:{ Exception -> 0x069c }
            X.Arb r5 = new X.Arb     // Catch:{ Exception -> 0x069c }
            r5.<init>(r0)     // Catch:{ Exception -> 0x069c }
            X.Arf[] r1 = r5.A01
            r26 = r25
            if (r1 == 0) goto L_0x042e
            int r10 = r1.length
            X.Arf[] r9 = new X.C22613Arf[r10]
            r0 = 0
            java.lang.System.arraycopy(r1, r0, r9, r0, r10)
            r0 = r26
            X.9oH r6 = r0.A00     // Catch:{ Exception -> 0x0426 }
            java.util.HashMap r8 = X.AnonymousClass001.A0J()     // Catch:{ Exception -> 0x0426 }
            r7 = 0
        L_0x0033:
            if (r7 == r10) goto L_0x0058
            r4 = r9[r7]     // Catch:{ Exception -> 0x0426 }
            X.As6 r0 = r4.A00     // Catch:{ Exception -> 0x0426 }
            int r0 = r0.A00     // Catch:{ Exception -> 0x0426 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0426 }
            java.lang.Object r0 = r8.get(r1)     // Catch:{ Exception -> 0x0426 }
            if (r0 != 0) goto L_0x004c
            java.util.HashSet r0 = X.C36441kJ.A16()     // Catch:{ Exception -> 0x0426 }
            r8.put(r1, r0)     // Catch:{ Exception -> 0x0426 }
        L_0x004c:
            java.lang.Object r0 = r8.get(r1)     // Catch:{ Exception -> 0x0426 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x0426 }
            r0.add(r4)     // Catch:{ Exception -> 0x0426 }
            int r7 = r7 + 1
            goto L_0x0033
        L_0x0058:
            java.util.Iterator r25 = X.C36371kC.A10(r8)     // Catch:{ Exception -> 0x0426 }
        L_0x005c:
            boolean r0 = r25.hasNext()     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x042e
            java.util.Map$Entry r1 = X.AnonymousClass000.A11(r25)     // Catch:{ Exception -> 0x0426 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ Exception -> 0x0426 }
            int r4 = X.C90514aH.A0H(r0)     // Catch:{ Exception -> 0x0426 }
            if (r4 == 0) goto L_0x03cf
            r0 = 1
            if (r4 == r0) goto L_0x031a
            r0 = 2
            if (r4 == r0) goto L_0x02ca
            r0 = 4
            if (r4 == r0) goto L_0x0272
            r0 = 6
            if (r4 == r0) goto L_0x01bd
            r0 = 7
            if (r4 != r0) goto L_0x041b
            java.util.Set r0 = r6.A09     // Catch:{ Exception -> 0x0426 }
            r24 = r0
            java.lang.Object r0 = r1.getValue()     // Catch:{ Exception -> 0x0426 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x0426 }
            java.util.HashSet r12 = X.C36441kJ.A16()     // Catch:{ Exception -> 0x0426 }
            java.util.Iterator r23 = r0.iterator()     // Catch:{ Exception -> 0x0426 }
        L_0x0091:
            boolean r0 = r23.hasNext()     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x01b9
            java.lang.Object r0 = r23.next()     // Catch:{ Exception -> 0x0426 }
            X.Arf r0 = (X.C22613Arf) r0     // Catch:{ Exception -> 0x0426 }
            X.As6 r0 = r0.A00     // Catch:{ Exception -> 0x0426 }
            X.11z r0 = r0.A01     // Catch:{ Exception -> 0x0426 }
            byte[] r11 = X.C22659AsP.A03(r0)     // Catch:{ Exception -> 0x0426 }
            if (r24 != 0) goto L_0x00ad
            if (r11 == 0) goto L_0x0091
            r12.add(r11)     // Catch:{ Exception -> 0x0426 }
            goto L_0x0091
        L_0x00ad:
            java.util.Iterator r22 = r24.iterator()     // Catch:{ Exception -> 0x0426 }
        L_0x00b1:
            boolean r0 = r22.hasNext()     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x0091
            java.lang.Object r4 = r22.next()     // Catch:{ Exception -> 0x0426 }
            byte[] r4 = (byte[]) r4     // Catch:{ Exception -> 0x0426 }
            int r1 = r4.length     // Catch:{ Exception -> 0x0426 }
            int r0 = r11.length     // Catch:{ Exception -> 0x0426 }
            if (r1 != r0) goto L_0x017f
            r15 = 2
            int r1 = r1 / r15
            byte[] r10 = new byte[r1]     // Catch:{ Exception -> 0x0426 }
            byte[] r9 = new byte[r1]     // Catch:{ Exception -> 0x0426 }
            r8 = 0
            java.lang.System.arraycopy(r4, r8, r10, r8, r1)     // Catch:{ Exception -> 0x0426 }
            java.lang.System.arraycopy(r4, r1, r9, r8, r1)     // Catch:{ Exception -> 0x0426 }
            byte[] r7 = new byte[r1]     // Catch:{ Exception -> 0x0426 }
            byte[] r4 = new byte[r1]     // Catch:{ Exception -> 0x0426 }
            java.lang.System.arraycopy(r11, r8, r7, r8, r1)     // Catch:{ Exception -> 0x0426 }
            java.lang.System.arraycopy(r11, r1, r4, r8, r1)     // Catch:{ Exception -> 0x0426 }
            r0 = 4
            byte[][] r1 = new byte[r0][]     // Catch:{ Exception -> 0x0426 }
            X.C90494aF.A1H(r10, r9, r1)     // Catch:{ Exception -> 0x0426 }
            r1[r15] = r7     // Catch:{ Exception -> 0x0426 }
            r0 = 3
            r1[r0] = r4     // Catch:{ Exception -> 0x0426 }
            r10 = 0
            r13 = r1[r8]     // Catch:{ Exception -> 0x0426 }
            r21 = 1
            r14 = r1[r21]     // Catch:{ Exception -> 0x0426 }
            r20 = 2
            r19 = r1[r15]     // Catch:{ Exception -> 0x0426 }
            r18 = 3
            r17 = r1[r0]     // Catch:{ Exception -> 0x0426 }
            int r9 = r13.length     // Catch:{ Exception -> 0x0426 }
            byte[] r0 = new byte[r9]     // Catch:{ Exception -> 0x0426 }
            r16 = r0
            byte[] r8 = new byte[r9]     // Catch:{ Exception -> 0x0426 }
            byte[] r7 = new byte[r9]     // Catch:{ Exception -> 0x0426 }
            byte[] r4 = new byte[r9]     // Catch:{ Exception -> 0x0426 }
            r15 = 0
        L_0x00fe:
            if (r15 >= r9) goto L_0x0125
            byte r1 = r13[r15]     // Catch:{ Exception -> 0x0426 }
            byte r0 = r14[r15]     // Catch:{ Exception -> 0x0426 }
            r1 = r1 & r0
            byte r0 = (byte) r1     // Catch:{ Exception -> 0x0426 }
            r16[r15] = r0     // Catch:{ Exception -> 0x0426 }
            byte r1 = r13[r15]     // Catch:{ Exception -> 0x0426 }
            byte r0 = r14[r15]     // Catch:{ Exception -> 0x0426 }
            r1 = r1 & r0
            int r0 = ~r0     // Catch:{ Exception -> 0x0426 }
            X.C165587tf.A1T(r8, r1, r0, r15)     // Catch:{ Exception -> 0x0426 }
            byte r1 = r19[r15]     // Catch:{ Exception -> 0x0426 }
            byte r0 = r17[r15]     // Catch:{ Exception -> 0x0426 }
            r1 = r1 & r0
            byte r0 = (byte) r1     // Catch:{ Exception -> 0x0426 }
            r7[r15] = r0     // Catch:{ Exception -> 0x0426 }
            byte r1 = r19[r15]     // Catch:{ Exception -> 0x0426 }
            byte r0 = r17[r15]     // Catch:{ Exception -> 0x0426 }
            r1 = r1 & r0
            int r0 = ~r0     // Catch:{ Exception -> 0x0426 }
            X.C165587tf.A1T(r4, r1, r0, r15)     // Catch:{ Exception -> 0x0426 }
            int r15 = r15 + 1
            goto L_0x00fe
        L_0x0125:
            r0 = 4
            byte[][] r9 = new byte[r0][]     // Catch:{ Exception -> 0x0426 }
            r9[r10] = r16     // Catch:{ Exception -> 0x0426 }
            r9[r21] = r8     // Catch:{ Exception -> 0x0426 }
            r9[r20] = r7     // Catch:{ Exception -> 0x0426 }
            r9[r18] = r4     // Catch:{ Exception -> 0x0426 }
            r13 = r9[r21]     // Catch:{ Exception -> 0x0426 }
            r8 = r9[r18]     // Catch:{ Exception -> 0x0426 }
            r7 = 0
        L_0x0135:
            int r0 = r13.length     // Catch:{ Exception -> 0x0426 }
            if (r7 >= r0) goto L_0x0146
            byte r4 = r13[r7]     // Catch:{ Exception -> 0x0426 }
            r1 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r1
            byte r0 = r8[r7]     // Catch:{ Exception -> 0x0426 }
            r1 = r1 & r0
            if (r4 < r1) goto L_0x0147
            int r7 = r7 + 1
            goto L_0x0135
        L_0x0146:
            r13 = r8
        L_0x0147:
            r15 = r9[r10]     // Catch:{ Exception -> 0x0426 }
            r8 = r9[r20]     // Catch:{ Exception -> 0x0426 }
            r7 = 0
        L_0x014c:
            int r0 = r15.length     // Catch:{ Exception -> 0x0426 }
            if (r7 >= r0) goto L_0x015f
            byte r4 = r15[r7]     // Catch:{ Exception -> 0x0426 }
            r1 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r1
            byte r0 = r8[r7]     // Catch:{ Exception -> 0x0426 }
            r1 = r1 & r0
            if (r4 <= r1) goto L_0x015b
            goto L_0x015e
        L_0x015b:
            int r7 = r7 + 1
            goto L_0x014c
        L_0x015e:
            r8 = r15
        L_0x015f:
            boolean r0 = java.util.Arrays.equals(r8, r13)     // Catch:{ Exception -> 0x0426 }
            if (r0 != 0) goto L_0x0186
            r7 = 0
        L_0x0166:
            int r0 = r8.length     // Catch:{ Exception -> 0x0426 }
            if (r7 >= r0) goto L_0x0179
            byte r4 = r8[r7]     // Catch:{ Exception -> 0x0426 }
            r1 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r1
            byte r0 = r13[r7]     // Catch:{ Exception -> 0x0426 }
            r1 = r1 & r0
            if (r4 <= r1) goto L_0x0175
            goto L_0x0178
        L_0x0175:
            int r7 = r7 + 1
            goto L_0x0166
        L_0x0178:
            r13 = r8
        L_0x0179:
            boolean r0 = java.util.Arrays.equals(r13, r8)     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x0186
        L_0x017f:
            java.util.Set r0 = java.util.Collections.EMPTY_SET     // Catch:{ Exception -> 0x0426 }
        L_0x0181:
            r12.addAll(r0)     // Catch:{ Exception -> 0x0426 }
            goto L_0x00b1
        L_0x0186:
            r8 = r9[r10]     // Catch:{ Exception -> 0x0426 }
            r7 = r9[r20]     // Catch:{ Exception -> 0x0426 }
            int r13 = r8.length     // Catch:{ Exception -> 0x0426 }
            byte[] r9 = new byte[r13]     // Catch:{ Exception -> 0x0426 }
            r4 = 0
        L_0x018e:
            if (r4 >= r13) goto L_0x019a
            byte r1 = r8[r4]     // Catch:{ Exception -> 0x0426 }
            byte r0 = r7[r4]     // Catch:{ Exception -> 0x0426 }
            X.C165587tf.A1T(r9, r1, r0, r4)     // Catch:{ Exception -> 0x0426 }
            int r4 = r4 + 1
            goto L_0x018e
        L_0x019a:
            int r8 = r14.length     // Catch:{ Exception -> 0x0426 }
            byte[] r7 = new byte[r8]     // Catch:{ Exception -> 0x0426 }
            r4 = 0
        L_0x019e:
            if (r4 >= r8) goto L_0x01aa
            byte r1 = r14[r4]     // Catch:{ Exception -> 0x0426 }
            byte r0 = r17[r4]     // Catch:{ Exception -> 0x0426 }
            X.C165587tf.A1T(r7, r1, r0, r4)     // Catch:{ Exception -> 0x0426 }
            int r4 = r4 + 1
            goto L_0x019e
        L_0x01aa:
            int r0 = r13 * 2
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x0426 }
            java.lang.System.arraycopy(r9, r10, r0, r10, r13)     // Catch:{ Exception -> 0x0426 }
            java.lang.System.arraycopy(r7, r10, r0, r13, r13)     // Catch:{ Exception -> 0x0426 }
            java.util.Set r0 = java.util.Collections.singleton(r0)     // Catch:{ Exception -> 0x0426 }
            goto L_0x0181
        L_0x01b9:
            r6.A09 = r12     // Catch:{ Exception -> 0x0426 }
            goto L_0x005c
        L_0x01bd:
            java.util.Set r7 = r6.A0B     // Catch:{ Exception -> 0x0426 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ Exception -> 0x0426 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x0426 }
            java.util.HashSet r4 = X.C36441kJ.A16()     // Catch:{ Exception -> 0x0426 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ Exception -> 0x0426 }
        L_0x01cd:
            boolean r0 = r14.hasNext()     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x026e
            java.lang.Object r0 = r14.next()     // Catch:{ Exception -> 0x0426 }
            X.Arf r0 = (X.C22613Arf) r0     // Catch:{ Exception -> 0x0426 }
            X.As6 r0 = r0.A00     // Catch:{ Exception -> 0x0426 }
            java.lang.String r1 = X.C22640As6.A00(r0)     // Catch:{ Exception -> 0x0426 }
            if (r7 != 0) goto L_0x01e7
            if (r1 == 0) goto L_0x01cd
            r4.add(r1)     // Catch:{ Exception -> 0x0426 }
            goto L_0x01cd
        L_0x01e7:
            java.util.Iterator r13 = r7.iterator()     // Catch:{ Exception -> 0x0426 }
        L_0x01eb:
            boolean r0 = r13.hasNext()     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x01cd
            java.lang.String r8 = X.AnonymousClass001.A0C(r13)     // Catch:{ Exception -> 0x0426 }
            r12 = 64
            int r0 = r8.indexOf(r12)     // Catch:{ Exception -> 0x0426 }
            java.lang.String r11 = "."
            r10 = -1
            if (r0 == r10) goto L_0x021a
            java.lang.String r9 = X.C165607th.A0o(r0, r8)     // Catch:{ Exception -> 0x0426 }
            int r0 = r1.indexOf(r12)     // Catch:{ Exception -> 0x0426 }
            if (r0 != r10) goto L_0x0246
            boolean r0 = r1.startsWith(r11)     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x0215
            boolean r0 = X.C203549oH.A06(r9, r1)     // Catch:{ Exception -> 0x0426 }
            goto L_0x024a
        L_0x0215:
            boolean r0 = r9.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0426 }
            goto L_0x024a
        L_0x021a:
            boolean r9 = r8.startsWith(r11)     // Catch:{ Exception -> 0x0426 }
            int r0 = r1.indexOf(r12)     // Catch:{ Exception -> 0x0426 }
            if (r9 == 0) goto L_0x0230
            if (r0 == r10) goto L_0x024d
            r0 = 0
            java.lang.String r0 = r1.substring(r0)     // Catch:{ Exception -> 0x0426 }
            boolean r0 = X.C203549oH.A06(r0, r8)     // Catch:{ Exception -> 0x0426 }
            goto L_0x0267
        L_0x0230:
            if (r0 == r10) goto L_0x023b
            java.lang.String r0 = X.C165607th.A0o(r0, r1)     // Catch:{ Exception -> 0x0426 }
            boolean r0 = r0.equalsIgnoreCase(r8)     // Catch:{ Exception -> 0x0426 }
            goto L_0x0267
        L_0x023b:
            boolean r0 = r1.startsWith(r11)     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x0246
            boolean r0 = X.C203549oH.A06(r8, r1)     // Catch:{ Exception -> 0x0426 }
            goto L_0x024a
        L_0x0246:
            boolean r0 = r8.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0426 }
        L_0x024a:
            if (r0 == 0) goto L_0x01eb
            goto L_0x025f
        L_0x024d:
            boolean r0 = r1.startsWith(r11)     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x0263
            boolean r0 = X.C203549oH.A06(r8, r1)     // Catch:{ Exception -> 0x0426 }
            if (r0 != 0) goto L_0x025f
            boolean r0 = r8.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x0263
        L_0x025f:
            r4.add(r8)     // Catch:{ Exception -> 0x0426 }
            goto L_0x01eb
        L_0x0263:
            boolean r0 = X.C203549oH.A06(r1, r8)     // Catch:{ Exception -> 0x0426 }
        L_0x0267:
            if (r0 == 0) goto L_0x01eb
            r4.add(r1)     // Catch:{ Exception -> 0x0426 }
            goto L_0x01eb
        L_0x026e:
            r6.A0B = r4     // Catch:{ Exception -> 0x0426 }
            goto L_0x005c
        L_0x0272:
            java.util.Set r9 = r6.A06     // Catch:{ Exception -> 0x0426 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ Exception -> 0x0426 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x0426 }
            java.util.HashSet r8 = X.C36441kJ.A16()     // Catch:{ Exception -> 0x0426 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ Exception -> 0x0426 }
        L_0x0282:
            boolean r0 = r10.hasNext()     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x02c6
            java.lang.Object r0 = r10.next()     // Catch:{ Exception -> 0x0426 }
            X.Arf r0 = (X.C22613Arf) r0     // Catch:{ Exception -> 0x0426 }
            X.As6 r0 = r0.A00     // Catch:{ Exception -> 0x0426 }
            X.11z r0 = r0.A01     // Catch:{ Exception -> 0x0426 }
            X.121 r0 = r0.Bve()     // Catch:{ Exception -> 0x0426 }
            X.AsM r7 = X.C22656AsM.A04(r0)     // Catch:{ Exception -> 0x0426 }
            if (r9 != 0) goto L_0x02a2
            if (r7 == 0) goto L_0x0282
            r8.add(r7)     // Catch:{ Exception -> 0x0426 }
            goto L_0x0282
        L_0x02a2:
            java.util.Iterator r4 = r9.iterator()     // Catch:{ Exception -> 0x0426 }
        L_0x02a6:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x0282
            java.lang.Object r1 = r4.next()     // Catch:{ Exception -> 0x0426 }
            X.AsM r1 = (X.C22656AsM) r1     // Catch:{ Exception -> 0x0426 }
            boolean r0 = X.C203549oH.A08(r7, r1)     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x02bc
            r8.add(r7)     // Catch:{ Exception -> 0x0426 }
            goto L_0x02a6
        L_0x02bc:
            boolean r0 = X.C203549oH.A08(r1, r7)     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x02a6
            r8.add(r1)     // Catch:{ Exception -> 0x0426 }
            goto L_0x02a6
        L_0x02c6:
            r6.A06 = r8     // Catch:{ Exception -> 0x0426 }
            goto L_0x005c
        L_0x02ca:
            java.util.Set r10 = r6.A07     // Catch:{ Exception -> 0x0426 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ Exception -> 0x0426 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x0426 }
            java.util.HashSet r9 = X.C36441kJ.A16()     // Catch:{ Exception -> 0x0426 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ Exception -> 0x0426 }
        L_0x02da:
            boolean r0 = r8.hasNext()     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x0316
            java.lang.Object r0 = r8.next()     // Catch:{ Exception -> 0x0426 }
            X.Arf r0 = (X.C22613Arf) r0     // Catch:{ Exception -> 0x0426 }
            X.As6 r0 = r0.A00     // Catch:{ Exception -> 0x0426 }
            java.lang.String r7 = X.C22640As6.A00(r0)     // Catch:{ Exception -> 0x0426 }
            if (r10 != 0) goto L_0x02f4
            if (r7 == 0) goto L_0x02da
            r9.add(r7)     // Catch:{ Exception -> 0x0426 }
            goto L_0x02da
        L_0x02f4:
            java.util.Iterator r4 = r10.iterator()     // Catch:{ Exception -> 0x0426 }
        L_0x02f8:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x02da
            java.lang.String r1 = X.AnonymousClass001.A0C(r4)     // Catch:{ Exception -> 0x0426 }
            boolean r0 = X.C203549oH.A06(r1, r7)     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x030c
            r9.add(r1)     // Catch:{ Exception -> 0x0426 }
            goto L_0x02f8
        L_0x030c:
            boolean r0 = X.C203549oH.A06(r7, r1)     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x02f8
            r9.add(r7)     // Catch:{ Exception -> 0x0426 }
            goto L_0x02f8
        L_0x0316:
            r6.A07 = r9     // Catch:{ Exception -> 0x0426 }
            goto L_0x005c
        L_0x031a:
            java.util.Set r8 = r6.A08     // Catch:{ Exception -> 0x0426 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ Exception -> 0x0426 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x0426 }
            java.util.HashSet r7 = X.C36441kJ.A16()     // Catch:{ Exception -> 0x0426 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ Exception -> 0x0426 }
        L_0x032a:
            boolean r0 = r14.hasNext()     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x03cb
            java.lang.Object r0 = r14.next()     // Catch:{ Exception -> 0x0426 }
            X.Arf r0 = (X.C22613Arf) r0     // Catch:{ Exception -> 0x0426 }
            X.As6 r0 = r0.A00     // Catch:{ Exception -> 0x0426 }
            java.lang.String r4 = X.C22640As6.A00(r0)     // Catch:{ Exception -> 0x0426 }
            if (r8 != 0) goto L_0x0344
            if (r4 == 0) goto L_0x032a
            r7.add(r4)     // Catch:{ Exception -> 0x0426 }
            goto L_0x032a
        L_0x0344:
            java.util.Iterator r13 = r8.iterator()     // Catch:{ Exception -> 0x0426 }
        L_0x0348:
            boolean r0 = r13.hasNext()     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x032a
            java.lang.String r1 = X.AnonymousClass001.A0C(r13)     // Catch:{ Exception -> 0x0426 }
            r12 = 64
            int r0 = r4.indexOf(r12)     // Catch:{ Exception -> 0x0426 }
            java.lang.String r11 = "."
            r10 = -1
            if (r0 == r10) goto L_0x0377
            java.lang.String r9 = X.C165607th.A0o(r0, r4)     // Catch:{ Exception -> 0x0426 }
            int r0 = r1.indexOf(r12)     // Catch:{ Exception -> 0x0426 }
            if (r0 != r10) goto L_0x03a3
            boolean r0 = r1.startsWith(r11)     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x0372
            boolean r0 = X.C203549oH.A06(r9, r1)     // Catch:{ Exception -> 0x0426 }
            goto L_0x03a7
        L_0x0372:
            boolean r0 = r9.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0426 }
            goto L_0x03a7
        L_0x0377:
            boolean r9 = r4.startsWith(r11)     // Catch:{ Exception -> 0x0426 }
            int r0 = r1.indexOf(r12)     // Catch:{ Exception -> 0x0426 }
            if (r9 == 0) goto L_0x038d
            if (r0 == r10) goto L_0x03aa
            r0 = 0
            java.lang.String r0 = r1.substring(r0)     // Catch:{ Exception -> 0x0426 }
            boolean r0 = X.C203549oH.A06(r0, r4)     // Catch:{ Exception -> 0x0426 }
            goto L_0x03c4
        L_0x038d:
            if (r0 == r10) goto L_0x0398
            java.lang.String r0 = X.C165607th.A0o(r0, r1)     // Catch:{ Exception -> 0x0426 }
            boolean r0 = r0.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x0426 }
            goto L_0x03c4
        L_0x0398:
            boolean r0 = r1.startsWith(r11)     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x03a3
            boolean r0 = X.C203549oH.A06(r4, r1)     // Catch:{ Exception -> 0x0426 }
            goto L_0x03a7
        L_0x03a3:
            boolean r0 = r4.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0426 }
        L_0x03a7:
            if (r0 == 0) goto L_0x0348
            goto L_0x03bc
        L_0x03aa:
            boolean r0 = r1.startsWith(r11)     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x03c0
            boolean r0 = X.C203549oH.A06(r4, r1)     // Catch:{ Exception -> 0x0426 }
            if (r0 != 0) goto L_0x03bc
            boolean r0 = r4.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x03c0
        L_0x03bc:
            r7.add(r4)     // Catch:{ Exception -> 0x0426 }
            goto L_0x0348
        L_0x03c0:
            boolean r0 = X.C203549oH.A06(r1, r4)     // Catch:{ Exception -> 0x0426 }
        L_0x03c4:
            if (r0 == 0) goto L_0x0348
            r7.add(r1)     // Catch:{ Exception -> 0x0426 }
            goto L_0x0348
        L_0x03cb:
            r6.A08 = r7     // Catch:{ Exception -> 0x0426 }
            goto L_0x005c
        L_0x03cf:
            java.util.Set r8 = r6.A0A     // Catch:{ Exception -> 0x0426 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ Exception -> 0x0426 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x0426 }
            java.util.HashSet r7 = X.C36441kJ.A16()     // Catch:{ Exception -> 0x0426 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ Exception -> 0x0426 }
        L_0x03df:
            boolean r0 = r9.hasNext()     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x0417
            java.lang.Object r0 = r9.next()     // Catch:{ Exception -> 0x0426 }
            X.Arf r0 = (X.C22613Arf) r0     // Catch:{ Exception -> 0x0426 }
            X.As6 r0 = r0.A00     // Catch:{ Exception -> 0x0426 }
            X.11z r0 = r0.A01     // Catch:{ Exception -> 0x0426 }
            X.Arc r4 = X.C22610Arc.A00(r0)     // Catch:{ Exception -> 0x0426 }
            if (r8 != 0) goto L_0x03fb
            if (r4 == 0) goto L_0x03df
            r7.add(r4)     // Catch:{ Exception -> 0x0426 }
            goto L_0x03df
        L_0x03fb:
            java.util.Iterator r1 = r8.iterator()     // Catch:{ Exception -> 0x0426 }
        L_0x03ff:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x03df
            java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x0426 }
            X.Arc r0 = X.C22610Arc.A00(r0)     // Catch:{ Exception -> 0x0426 }
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x03ff
            r7.add(r4)     // Catch:{ Exception -> 0x0426 }
            goto L_0x03ff
        L_0x0417:
            r6.A0A = r7     // Catch:{ Exception -> 0x0426 }
            goto L_0x005c
        L_0x041b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0426 }
            java.lang.String r0 = "Unknown tag encountered: "
            java.lang.IllegalStateException r0 = X.C90464aC.A0R(r0, r1, r4)     // Catch:{ Exception -> 0x0426 }
            throw r0     // Catch:{ Exception -> 0x0426 }
        L_0x0426:
            r1 = move-exception
            java.lang.String r0 = "Permitted subtrees cannot be build from name constraints extension."
            X.Abv r0 = X.C21871Abv.A00(r0, r1, r3, r2)
            throw r0
        L_0x042e:
            X.Arf[] r1 = r5.A00
            if (r1 == 0) goto L_0x069b
            int r7 = r1.length
            X.Arf[] r6 = new X.C22613Arf[r7]
            r0 = 0
            java.lang.System.arraycopy(r1, r0, r6, r0, r7)
            r5 = 0
        L_0x043a:
            if (r5 == r7) goto L_0x069b
            r1 = r6[r5]     // Catch:{ Exception -> 0x0693 }
            r0 = r26
            X.9oH r8 = r0.A00     // Catch:{ Exception -> 0x0693 }
            X.As6 r9 = r1.A00     // Catch:{ Exception -> 0x0693 }
            int r4 = r9.A00     // Catch:{ Exception -> 0x0693 }
            if (r4 == 0) goto L_0x0673
            r0 = 1
            if (r4 == r0) goto L_0x05ca
            r0 = 2
            if (r4 == r0) goto L_0x058c
            r0 = 4
            if (r4 == r0) goto L_0x0543
            r0 = 6
            if (r4 == r0) goto L_0x0499
            r0 = 7
            if (r4 != r0) goto L_0x0688
            java.util.Set r1 = r8.A03     // Catch:{ Exception -> 0x0693 }
            X.11z r0 = r9.A01     // Catch:{ Exception -> 0x0693 }
            byte[] r11 = X.C22659AsP.A03(r0)     // Catch:{ Exception -> 0x0693 }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x0693 }
            if (r0 == 0) goto L_0x0468
            if (r11 == 0) goto L_0x0495
            goto L_0x0492
        L_0x0468:
            java.util.HashSet r10 = X.C36441kJ.A16()     // Catch:{ Exception -> 0x0693 }
            java.util.Iterator r9 = r1.iterator()     // Catch:{ Exception -> 0x0693 }
        L_0x0470:
            boolean r0 = r9.hasNext()     // Catch:{ Exception -> 0x0693 }
            if (r0 == 0) goto L_0x0490
            java.lang.Object r4 = r9.next()     // Catch:{ Exception -> 0x0693 }
            byte[] r4 = (byte[]) r4     // Catch:{ Exception -> 0x0693 }
            java.util.HashSet r1 = X.C36441kJ.A16()     // Catch:{ Exception -> 0x0693 }
            boolean r0 = java.util.Arrays.equals(r4, r11)     // Catch:{ Exception -> 0x0693 }
            r1.add(r4)     // Catch:{ Exception -> 0x0693 }
            if (r0 != 0) goto L_0x048c
            r1.add(r11)     // Catch:{ Exception -> 0x0693 }
        L_0x048c:
            r10.addAll(r1)     // Catch:{ Exception -> 0x0693 }
            goto L_0x0470
        L_0x0490:
            r1 = r10
            goto L_0x0495
        L_0x0492:
            r1.add(r11)     // Catch:{ Exception -> 0x0693 }
        L_0x0495:
            r8.A03 = r1     // Catch:{ Exception -> 0x0693 }
            goto L_0x0684
        L_0x0499:
            java.util.Set r1 = r8.A05     // Catch:{ Exception -> 0x0693 }
            java.lang.String r9 = X.C22640As6.A00(r9)     // Catch:{ Exception -> 0x0693 }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x0693 }
            if (r0 == 0) goto L_0x04a9
            if (r9 == 0) goto L_0x053f
            goto L_0x053c
        L_0x04a9:
            java.util.HashSet r4 = X.C36441kJ.A16()     // Catch:{ Exception -> 0x0693 }
            java.util.Iterator r14 = r1.iterator()     // Catch:{ Exception -> 0x0693 }
        L_0x04b1:
            boolean r0 = r14.hasNext()     // Catch:{ Exception -> 0x0693 }
            if (r0 == 0) goto L_0x053a
            java.lang.String r1 = X.AnonymousClass001.A0C(r14)     // Catch:{ Exception -> 0x0693 }
            r13 = 64
            int r0 = r1.indexOf(r13)     // Catch:{ Exception -> 0x0693 }
            java.lang.String r12 = "."
            r11 = -1
            if (r0 == r11) goto L_0x04e0
            java.lang.String r10 = X.C165607th.A0o(r0, r1)     // Catch:{ Exception -> 0x0693 }
            int r0 = r9.indexOf(r13)     // Catch:{ Exception -> 0x0693 }
            if (r0 != r11) goto L_0x050f
            boolean r0 = r9.startsWith(r12)     // Catch:{ Exception -> 0x0693 }
            if (r0 == 0) goto L_0x04db
            boolean r0 = X.C203549oH.A06(r10, r9)     // Catch:{ Exception -> 0x0693 }
            goto L_0x050c
        L_0x04db:
            boolean r0 = r10.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x0693 }
            goto L_0x050c
        L_0x04e0:
            boolean r10 = r1.startsWith(r12)     // Catch:{ Exception -> 0x0693 }
            int r0 = r9.indexOf(r13)     // Catch:{ Exception -> 0x0693 }
            if (r10 == 0) goto L_0x04f6
            if (r0 == r11) goto L_0x051a
            r0 = 0
            java.lang.String r0 = r9.substring(r0)     // Catch:{ Exception -> 0x0693 }
            boolean r0 = X.C203549oH.A06(r0, r1)     // Catch:{ Exception -> 0x0693 }
            goto L_0x0513
        L_0x04f6:
            if (r0 == r11) goto L_0x0502
            r0 = 0
            java.lang.String r0 = r9.substring(r0)     // Catch:{ Exception -> 0x0693 }
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0693 }
            goto L_0x0513
        L_0x0502:
            boolean r0 = r9.startsWith(r12)     // Catch:{ Exception -> 0x0693 }
            if (r0 == 0) goto L_0x050f
            boolean r0 = X.C203549oH.A06(r1, r9)     // Catch:{ Exception -> 0x0693 }
        L_0x050c:
            if (r0 == 0) goto L_0x0516
            goto L_0x052c
        L_0x050f:
            boolean r0 = r1.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x0693 }
        L_0x0513:
            if (r0 == 0) goto L_0x0516
            goto L_0x0535
        L_0x0516:
            r4.add(r1)     // Catch:{ Exception -> 0x0693 }
            goto L_0x052c
        L_0x051a:
            boolean r0 = r9.startsWith(r12)     // Catch:{ Exception -> 0x0693 }
            if (r0 == 0) goto L_0x0530
            boolean r0 = X.C203549oH.A06(r1, r9)     // Catch:{ Exception -> 0x0693 }
            if (r0 != 0) goto L_0x052c
            boolean r0 = r1.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x0693 }
            if (r0 == 0) goto L_0x0530
        L_0x052c:
            r4.add(r9)     // Catch:{ Exception -> 0x0693 }
            goto L_0x04b1
        L_0x0530:
            boolean r0 = X.C203549oH.A06(r9, r1)     // Catch:{ Exception -> 0x0693 }
            goto L_0x0513
        L_0x0535:
            r4.add(r1)     // Catch:{ Exception -> 0x0693 }
            goto L_0x04b1
        L_0x053a:
            r1 = r4
            goto L_0x053f
        L_0x053c:
            r1.add(r9)     // Catch:{ Exception -> 0x0693 }
        L_0x053f:
            r8.A05 = r1     // Catch:{ Exception -> 0x0693 }
            goto L_0x0684
        L_0x0543:
            java.util.Set r1 = r8.A00     // Catch:{ Exception -> 0x0693 }
            X.11z r0 = r9.A01     // Catch:{ Exception -> 0x0693 }
            X.121 r10 = r0.Bve()     // Catch:{ Exception -> 0x0693 }
            X.AsM r10 = (X.C22656AsM) r10     // Catch:{ Exception -> 0x0693 }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x0693 }
            if (r0 == 0) goto L_0x0556
            if (r10 == 0) goto L_0x0588
            goto L_0x0585
        L_0x0556:
            java.util.HashSet r9 = X.C36441kJ.A16()     // Catch:{ Exception -> 0x0693 }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ Exception -> 0x0693 }
        L_0x055e:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x0693 }
            if (r0 == 0) goto L_0x0583
            java.lang.Object r0 = r4.next()     // Catch:{ Exception -> 0x0693 }
            X.AsM r1 = X.C22656AsM.A04(r0)     // Catch:{ Exception -> 0x0693 }
            boolean r0 = X.C203549oH.A08(r10, r1)     // Catch:{ Exception -> 0x0693 }
            if (r0 == 0) goto L_0x0576
            r9.add(r1)     // Catch:{ Exception -> 0x0693 }
            goto L_0x055e
        L_0x0576:
            boolean r0 = X.C203549oH.A08(r1, r10)     // Catch:{ Exception -> 0x0693 }
            if (r0 != 0) goto L_0x057f
            r9.add(r1)     // Catch:{ Exception -> 0x0693 }
        L_0x057f:
            r9.add(r10)     // Catch:{ Exception -> 0x0693 }
            goto L_0x055e
        L_0x0583:
            r1 = r9
            goto L_0x0588
        L_0x0585:
            r1.add(r10)     // Catch:{ Exception -> 0x0693 }
        L_0x0588:
            r8.A00 = r1     // Catch:{ Exception -> 0x0693 }
            goto L_0x0684
        L_0x058c:
            java.util.Set r1 = r8.A01     // Catch:{ Exception -> 0x0693 }
            java.lang.String r10 = X.C22640As6.A00(r9)     // Catch:{ Exception -> 0x0693 }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x0693 }
            if (r0 == 0) goto L_0x059b
            if (r10 == 0) goto L_0x05c6
            goto L_0x05c3
        L_0x059b:
            java.util.HashSet r9 = X.C36441kJ.A16()     // Catch:{ Exception -> 0x0693 }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ Exception -> 0x0693 }
        L_0x05a3:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x0693 }
            if (r0 == 0) goto L_0x05c1
            java.lang.String r1 = X.AnonymousClass001.A0C(r4)     // Catch:{ Exception -> 0x0693 }
            boolean r0 = X.C203549oH.A06(r1, r10)     // Catch:{ Exception -> 0x0693 }
            if (r0 != 0) goto L_0x05bd
            boolean r0 = X.C203549oH.A06(r10, r1)     // Catch:{ Exception -> 0x0693 }
            r9.add(r1)     // Catch:{ Exception -> 0x0693 }
            if (r0 == 0) goto L_0x05bd
            goto L_0x05a3
        L_0x05bd:
            r9.add(r10)     // Catch:{ Exception -> 0x0693 }
            goto L_0x05a3
        L_0x05c1:
            r1 = r9
            goto L_0x05c6
        L_0x05c3:
            r1.add(r10)     // Catch:{ Exception -> 0x0693 }
        L_0x05c6:
            r8.A01 = r1     // Catch:{ Exception -> 0x0693 }
            goto L_0x0684
        L_0x05ca:
            java.util.Set r1 = r8.A02     // Catch:{ Exception -> 0x0693 }
            java.lang.String r9 = X.C22640As6.A00(r9)     // Catch:{ Exception -> 0x0693 }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x0693 }
            if (r0 == 0) goto L_0x05da
            if (r9 == 0) goto L_0x0670
            goto L_0x066d
        L_0x05da:
            java.util.HashSet r4 = X.C36441kJ.A16()     // Catch:{ Exception -> 0x0693 }
            java.util.Iterator r14 = r1.iterator()     // Catch:{ Exception -> 0x0693 }
        L_0x05e2:
            boolean r0 = r14.hasNext()     // Catch:{ Exception -> 0x0693 }
            if (r0 == 0) goto L_0x066b
            java.lang.String r1 = X.AnonymousClass001.A0C(r14)     // Catch:{ Exception -> 0x0693 }
            r13 = 64
            int r0 = r1.indexOf(r13)     // Catch:{ Exception -> 0x0693 }
            java.lang.String r12 = "."
            r11 = -1
            if (r0 == r11) goto L_0x0611
            java.lang.String r10 = X.C165607th.A0o(r0, r1)     // Catch:{ Exception -> 0x0693 }
            int r0 = r9.indexOf(r13)     // Catch:{ Exception -> 0x0693 }
            if (r0 != r11) goto L_0x0640
            boolean r0 = r9.startsWith(r12)     // Catch:{ Exception -> 0x0693 }
            if (r0 == 0) goto L_0x060c
            boolean r0 = X.C203549oH.A06(r10, r9)     // Catch:{ Exception -> 0x0693 }
            goto L_0x063d
        L_0x060c:
            boolean r0 = r10.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x0693 }
            goto L_0x063d
        L_0x0611:
            boolean r10 = r1.startsWith(r12)     // Catch:{ Exception -> 0x0693 }
            int r0 = r9.indexOf(r13)     // Catch:{ Exception -> 0x0693 }
            if (r10 == 0) goto L_0x0627
            if (r0 == r11) goto L_0x064b
            r0 = 0
            java.lang.String r0 = r9.substring(r0)     // Catch:{ Exception -> 0x0693 }
            boolean r0 = X.C203549oH.A06(r0, r1)     // Catch:{ Exception -> 0x0693 }
            goto L_0x0644
        L_0x0627:
            if (r0 == r11) goto L_0x0633
            r0 = 0
            java.lang.String r0 = r9.substring(r0)     // Catch:{ Exception -> 0x0693 }
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0693 }
            goto L_0x0644
        L_0x0633:
            boolean r0 = r9.startsWith(r12)     // Catch:{ Exception -> 0x0693 }
            if (r0 == 0) goto L_0x0640
            boolean r0 = X.C203549oH.A06(r1, r9)     // Catch:{ Exception -> 0x0693 }
        L_0x063d:
            if (r0 == 0) goto L_0x0647
            goto L_0x065d
        L_0x0640:
            boolean r0 = r1.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x0693 }
        L_0x0644:
            if (r0 == 0) goto L_0x0647
            goto L_0x0666
        L_0x0647:
            r4.add(r1)     // Catch:{ Exception -> 0x0693 }
            goto L_0x065d
        L_0x064b:
            boolean r0 = r9.startsWith(r12)     // Catch:{ Exception -> 0x0693 }
            if (r0 == 0) goto L_0x0661
            boolean r0 = X.C203549oH.A06(r1, r9)     // Catch:{ Exception -> 0x0693 }
            if (r0 != 0) goto L_0x065d
            boolean r0 = r1.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x0693 }
            if (r0 == 0) goto L_0x0661
        L_0x065d:
            r4.add(r9)     // Catch:{ Exception -> 0x0693 }
            goto L_0x05e2
        L_0x0661:
            boolean r0 = X.C203549oH.A06(r9, r1)     // Catch:{ Exception -> 0x0693 }
            goto L_0x0644
        L_0x0666:
            r4.add(r1)     // Catch:{ Exception -> 0x0693 }
            goto L_0x05e2
        L_0x066b:
            r1 = r4
            goto L_0x0670
        L_0x066d:
            r1.add(r9)     // Catch:{ Exception -> 0x0693 }
        L_0x0670:
            r8.A02 = r1     // Catch:{ Exception -> 0x0693 }
            goto L_0x0684
        L_0x0673:
            java.util.Set r4 = r8.A04     // Catch:{ Exception -> 0x0693 }
            X.11z r0 = r9.A01     // Catch:{ Exception -> 0x0693 }
            X.Arc r1 = X.C22610Arc.A00(r0)     // Catch:{ Exception -> 0x0693 }
            java.util.HashSet r0 = X.C90524aI.A0k(r4)     // Catch:{ Exception -> 0x0693 }
            r0.add(r1)     // Catch:{ Exception -> 0x0693 }
            r8.A04 = r0     // Catch:{ Exception -> 0x0693 }
        L_0x0684:
            int r5 = r5 + 1
            goto L_0x043a
        L_0x0688:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0693 }
            java.lang.String r0 = "Unknown tag encountered: "
            java.lang.IllegalStateException r0 = X.C90464aC.A0R(r0, r1, r4)     // Catch:{ Exception -> 0x0693 }
            throw r0     // Catch:{ Exception -> 0x0693 }
        L_0x0693:
            r1 = move-exception
            java.lang.String r0 = "Excluded subtrees cannot be build from name constraints extension."
            X.Abv r0 = X.C21871Abv.A00(r0, r1, r3, r2)
            throw r0
        L_0x069b:
            return
        L_0x069c:
            r1 = move-exception
            java.lang.String r0 = "Name constraints extension could not be decoded."
            X.Abv r0 = X.C21871Abv.A00(r0, r1, r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203789os.A0H(java.security.cert.CertPath, X.9Y9, int):void");
    }

    public static int A00(CertPath certPath, int i, int i2) {
        try {
            C22656AsM A042 = C22656AsM.A04(C203669oV.A05(A0A, C165577te.A0n(certPath, i)));
            if (A042 != null) {
                Enumeration A0I = A042.A0I();
                while (true) {
                    if (!A0I.hasMoreElements()) {
                        break;
                    }
                    try {
                        C22658AsO A022 = C22658AsO.A02(A0I.nextElement());
                        if (A022.A00 == 0) {
                            int A0H = C22654AsK.A02(A022).A0H();
                            if (A0H < i2) {
                                return A0H;
                            }
                        }
                    } catch (IllegalArgumentException e) {
                        throw C21871Abv.A00("Policy constraints extension contents cannot be decoded.", e, certPath, i);
                    }
                }
            }
            return i2;
        } catch (Exception e2) {
            throw C21871Abv.A00("Policy constraints extension cannot be decoded.", e2, certPath, i);
        }
    }

    public static int A01(CertPath certPath, int i, int i2) {
        try {
            C22656AsM A042 = C22656AsM.A04(C203669oV.A05(A0A, C165577te.A0n(certPath, i)));
            if (A042 != null) {
                Enumeration A0I = A042.A0I();
                while (true) {
                    if (!A0I.hasMoreElements()) {
                        break;
                    }
                    try {
                        C22658AsO A022 = C22658AsO.A02(A0I.nextElement());
                        if (A022.A00 == 1) {
                            int A0H = C22654AsK.A02(A022).A0H();
                            if (A0H < i2) {
                                return A0H;
                            }
                        }
                    } catch (IllegalArgumentException e) {
                        throw C21871Abv.A00("Policy constraints extension contents cannot be decoded.", e, certPath, i);
                    }
                }
            }
            return i2;
        } catch (Exception e2) {
            throw C21871Abv.A00("Policy constraints extension cannot be decoded.", e2, certPath, i);
        }
    }

    public static int A02(CertPath certPath, int i, int i2) {
        int A0H;
        try {
            C22654AsK A012 = C22654AsK.A01(C203669oV.A05(A06, C165577te.A0n(certPath, i)));
            if (A012 == null || (A0H = A012.A0H()) >= i2) {
                return i2;
            }
            return A0H;
        } catch (Exception e) {
            throw C21871Abv.A00("Inhibit any-policy extension cannot be decoded.", e, certPath, i);
        }
    }

    public static int A03(CertPath certPath, int i, int i2) {
        C22654AsK asK;
        int intValue;
        try {
            C22619Arl A002 = C22619Arl.A00(C203669oV.A05(A02, C165577te.A0n(certPath, i)));
            if (A002 == null || (asK = A002.A01) == null || (intValue = new BigInteger(asK.A00).intValue()) >= i2) {
                return i2;
            }
            return intValue;
        } catch (Exception e) {
            throw C21871Abv.A00("Basic constraints extension cannot be decoded.", e, certPath, i);
        }
    }

    public static int A04(CertPath certPath, int i, int i2) {
        try {
            C22656AsM A042 = C22656AsM.A04(C203669oV.A05(A0A, C165577te.A0n(certPath, i)));
            if (A042 != null) {
                Enumeration A0I = A042.A0I();
                while (A0I.hasMoreElements()) {
                    C22658AsO asO = (C22658AsO) A0I.nextElement();
                    if (asO.A00 == 0) {
                        try {
                            if (C22654AsK.A02(asO).A0H() == 0) {
                                return 0;
                            }
                        } catch (Exception e) {
                            throw C21871Abv.A00("Policy constraints requireExplicitPolicy field could not be decoded.", e, certPath, i);
                        }
                    }
                }
            }
            return i2;
        } catch (C1890191s e2) {
            throw C21871Abv.A00("Policy constraints could not be decoded.", e2, certPath, i);
        }
    }

    public static HashSet A05(Date date, List list, List list2, C21794AaR aaR) {
        X509Certificate x509Certificate;
        HashSet A16 = C36441kJ.A16();
        try {
            A0J(A16, list2, aaR);
            A0J(A16, list, aaR);
            HashSet A162 = C36441kJ.A16();
            Iterator it = A16.iterator();
            while (it.hasNext()) {
                X509CRL x509crl = (X509CRL) it.next();
                if (x509crl.getNextUpdate().after(date)) {
                    CRLSelector cRLSelector = aaR.A00;
                    if (cRLSelector instanceof X509CRLSelector) {
                        x509Certificate = ((X509CRLSelector) cRLSelector).getCertificateChecking();
                    } else {
                        x509Certificate = null;
                    }
                    if (x509Certificate == null || x509crl.getThisUpdate().before(x509Certificate.getNotAfter())) {
                        A162.add(x509crl);
                    }
                }
            }
            return A162;
        } catch (C1890191s e) {
            throw C1890191s.A00("Exception obtaining complete CRLs.", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r10.isEmpty() != false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x011d, code lost:
        if (r13 != null) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x011f, code lost:
        r8 = r8 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0121, code lost:
        if (r8 < 0) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0123, code lost:
        r3 = r14[r8];
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x012a, code lost:
        if (r2 >= r3.size()) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x012c, code lost:
        r1 = (X.AXN) r3.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0138, code lost:
        if (X.C36401kF.A1a(r1.A01) != false) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x013a, code lost:
        r13 = X.C203669oV.A06(r13, r1, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x013e, code lost:
        r2 = r2 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AXN A06(java.security.cert.CertPath r9, java.util.Set r10, java.util.Set r11, X.AXM r12, X.AXN r13, java.util.List[] r14, int r15) {
        /*
            java.util.List r0 = r9.getCertificates()
            int r8 = r0.size()
            java.lang.String r4 = "Explicit policy requested but none available."
            r2 = 0
            if (r13 != 0) goto L_0x001b
            java.security.cert.PKIXParameters r0 = r12.A01
            boolean r0 = r0.isExplicitPolicyRequired()
            if (r0 == 0) goto L_0x001a
            X.Abv r0 = X.C21871Abv.A00(r4, r2, r9, r15)
            throw r0
        L_0x001a:
            return r2
        L_0x001b:
            java.lang.String r0 = X.C203669oV.A01
            if (r10 == 0) goto L_0x002e
            java.lang.String r0 = "2.5.29.32.0"
            boolean r0 = r10.contains(r0)
            if (r0 != 0) goto L_0x002e
            boolean r1 = r10.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x002f
        L_0x002e:
            r0 = 1
        L_0x002f:
            java.lang.String r3 = "2.5.29.32.0"
            if (r0 == 0) goto L_0x00b9
            java.security.cert.PKIXParameters r0 = r12.A01
            boolean r0 = r0.isExplicitPolicyRequired()
            if (r0 == 0) goto L_0x0141
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x00b4
            java.util.HashSet r6 = X.C36441kJ.A16()
            r5 = 0
        L_0x0046:
            int r0 = r14.length
            if (r5 >= r0) goto L_0x007a
            r4 = r14[r5]
            r2 = 0
        L_0x004c:
            int r0 = r4.size()
            if (r2 >= r0) goto L_0x0077
            java.lang.Object r1 = r4.get(r2)
            X.AXN r1 = (X.AXN) r1
            java.lang.String r0 = r1.getValidPolicy()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0074
            java.util.Iterator r1 = r1.getChildren()
        L_0x0066:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0074
            java.lang.Object r0 = r1.next()
            r6.add(r0)
            goto L_0x0066
        L_0x0074:
            int r2 = r2 + 1
            goto L_0x004c
        L_0x0077:
            int r5 = r5 + 1
            goto L_0x0046
        L_0x007a:
            java.util.Iterator r1 = r6.iterator()
        L_0x007e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0092
            java.lang.Object r0 = r1.next()
            X.AXN r0 = (X.AXN) r0
            java.lang.String r0 = r0.getValidPolicy()
            r11.contains(r0)
            goto L_0x007e
        L_0x0092:
            int r8 = r8 + -1
            if (r8 < 0) goto L_0x0141
            r3 = r14[r8]
            r2 = 0
        L_0x0099:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x0092
            java.lang.Object r1 = r3.get(r2)
            X.AXN r1 = (X.AXN) r1
            java.util.List r0 = r1.A01
            boolean r0 = X.C36401kF.A1a(r0)
            if (r0 != 0) goto L_0x00b1
            X.AXN r13 = X.C203669oV.A06(r13, r1, r14)
        L_0x00b1:
            int r2 = r2 + 1
            goto L_0x0099
        L_0x00b4:
            X.Abv r0 = X.C21871Abv.A00(r4, r2, r9, r15)
            throw r0
        L_0x00b9:
            java.util.HashSet r7 = X.C36441kJ.A16()
            r6 = 0
        L_0x00be:
            int r0 = r14.length
            if (r6 >= r0) goto L_0x00fe
            r5 = r14[r6]
            r4 = 0
        L_0x00c4:
            int r0 = r5.size()
            if (r4 >= r0) goto L_0x00fb
            java.lang.Object r1 = r5.get(r4)
            X.AXN r1 = (X.AXN) r1
            java.lang.String r0 = r1.getValidPolicy()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00f8
            java.util.Iterator r2 = r1.getChildren()
        L_0x00de:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f8
            java.lang.Object r1 = r2.next()
            X.AXN r1 = (X.AXN) r1
            java.lang.String r0 = r1.getValidPolicy()
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x00de
            r7.add(r1)
            goto L_0x00de
        L_0x00f8:
            int r4 = r4 + 1
            goto L_0x00c4
        L_0x00fb:
            int r6 = r6 + 1
            goto L_0x00be
        L_0x00fe:
            java.util.Iterator r2 = r7.iterator()
        L_0x0102:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x011d
            java.lang.Object r1 = r2.next()
            X.AXN r1 = (X.AXN) r1
            java.lang.String r0 = r1.getValidPolicy()
            boolean r0 = r10.contains(r0)
            if (r0 != 0) goto L_0x0102
            X.AXN r13 = X.C203669oV.A06(r13, r1, r14)
            goto L_0x0102
        L_0x011d:
            if (r13 == 0) goto L_0x0141
        L_0x011f:
            int r8 = r8 + -1
            if (r8 < 0) goto L_0x0141
            r3 = r14[r8]
            r2 = 0
        L_0x0126:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x011f
            java.lang.Object r1 = r3.get(r2)
            X.AXN r1 = (X.AXN) r1
            java.util.List r0 = r1.A01
            boolean r0 = X.C36401kF.A1a(r0)
            if (r0 != 0) goto L_0x013e
            X.AXN r13 = X.C203669oV.A06(r13, r1, r14)
        L_0x013e:
            int r2 = r2 + 1
            goto L_0x0126
        L_0x0141:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203789os.A06(java.security.cert.CertPath, java.util.Set, java.util.Set, X.AXM, X.AXN, java.util.List[], int):X.AXN");
    }

    public static AXN A08(CertPath certPath, AXN axn, int i) {
        try {
            if (C22656AsM.A04(C203669oV.A05(A03, C165577te.A0n(certPath, i))) == null) {
                return null;
            }
            return axn;
        } catch (C1890191s e) {
            throw C21871Abv.A00("Could not read certificate policies extension from certificate.", e, certPath, i);
        }
    }

    public static void A0C(CertPath certPath, int i) {
        try {
            C22656AsM A042 = C22656AsM.A04(C203669oV.A05(A0B, C165577te.A0n(certPath, i)));
            if (A042 != null) {
                int i2 = 0;
                while (i2 < A042.A0H()) {
                    try {
                        C22656AsM A043 = C22656AsM.A04(A042.A0J(i2));
                        AnonymousClass122 A012 = AnonymousClass122.A01(A043.A0J(0));
                        AnonymousClass122 A013 = AnonymousClass122.A01(C22656AsM.A03(A043));
                        if ("2.5.29.32.0".equals(A012.A01)) {
                            throw new CertPathValidatorException("IssuerDomainPolicy is anyPolicy", (Throwable) null, certPath, i);
                        } else if (!"2.5.29.32.0".equals(A013.A01)) {
                            i2++;
                        } else {
                            throw new CertPathValidatorException("SubjectDomainPolicy is anyPolicy", (Throwable) null, certPath, i);
                        }
                    } catch (Exception e) {
                        throw C21871Abv.A00("Policy mappings extension contents could not be decoded.", e, certPath, i);
                    }
                }
            }
        } catch (C1890191s e2) {
            throw C21871Abv.A00("Policy mappings extension could not be decoded.", e2, certPath, i);
        }
    }

    public static void A0D(CertPath certPath, int i) {
        try {
            C22619Arl A002 = C22619Arl.A00(C203669oV.A05(A02, C165577te.A0n(certPath, i)));
            if (A002 != null) {
                C22653AsJ asJ = A002.A00;
                if (asJ == null || asJ.A00 == 0) {
                    throw new CertPathValidatorException("Not a CA certificate", (Throwable) null, certPath, i);
                }
                return;
            }
            throw new CertPathValidatorException("Intermediate certificate lacks BasicConstraints", (Throwable) null, certPath, i);
        } catch (Exception e) {
            throw C21871Abv.A00("Basic constraints extension cannot be decoded.", e, certPath, i);
        }
    }

    public static void A0E(CertPath certPath, int i) {
        boolean[] keyUsage = C165577te.A0n(certPath, i).getKeyUsage();
        if (keyUsage == null) {
            return;
        }
        if (keyUsage.length <= 5 || !keyUsage[5]) {
            throw C21871Abv.A00("Issuer certificate keyusage extension is critical and does not permit key signing.", (Throwable) null, certPath, i);
        }
    }

    public static void A0F(CertPath certPath, List list, Set set, int i) {
        Certificate certificate = (Certificate) certPath.getCertificates().get(i);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(certificate, set);
            } catch (CertPathValidatorException e) {
                throw new CertPathValidatorException(e.getMessage(), e.getCause(), certPath, i);
            }
        }
        if (!set.isEmpty()) {
            throw C21871Abv.A00(AnonymousClass000.A0l(set, "Certificate has unsupported critical extension: ", AnonymousClass000.A0u()), (Throwable) null, certPath, i);
        }
    }

    public static void A0G(CertPath certPath, List list, Set set, int i) {
        Certificate certificate = (Certificate) certPath.getCertificates().get(i);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(certificate, set);
            } catch (CertPathValidatorException e) {
                throw C21871Abv.A00(e.getMessage(), e, certPath, i);
            } catch (Exception e2) {
                throw new CertPathValidatorException("Additional certificate path checker failed.", e2, certPath, i);
            }
        }
        if (!set.isEmpty()) {
            throw C21871Abv.A00(AnonymousClass000.A0l(set, "Certificate has unsupported critical extension: ", AnonymousClass000.A0u()), (Throwable) null, certPath, i);
        }
    }

    public static void A0I(CertPath certPath, AnonymousClass9Y9 r14, int i, boolean z) {
        C1890291t r2;
        C22631Arx arx;
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i);
        int size = certificates.size();
        int i2 = size - i;
        String str = C203669oV.A01;
        if (!C165607th.A1W(x509Certificate) || (i2 >= size && !z)) {
            try {
                C22656AsM A042 = C22656AsM.A04(C201789kO.A02(x509Certificate));
                try {
                    C203549oH r1 = r14.A00;
                    r1.A0B(C22641As7.A01(A042));
                    try {
                        r1.A0A(C22641As7.A01(A042));
                        try {
                            AnonymousClass121 A052 = C203669oV.A05(A0C, x509Certificate);
                            if (A052 != null) {
                                arx = new C22631Arx(C22656AsM.A04(A052));
                            } else {
                                arx = null;
                            }
                            C22641As7 A012 = C22641As7.A01(A042);
                            AnonymousClass122 r11 = C22691Asv.A0D;
                            C22633Arz[] arzArr = A012.A02;
                            int length = arzArr.length;
                            C22633Arz[] arzArr2 = new C22633Arz[length];
                            int i3 = 0;
                            for (int i4 = 0; i4 != length; i4++) {
                                C22633Arz arz = arzArr[i4];
                                C22657AsN asN = arz.A00;
                                int length2 = asN.A00.length;
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= length2) {
                                        break;
                                    } else if (C22624Arq.A00(asN.A00[i5]).A01.A0G(r11)) {
                                        arzArr2[i3] = arz;
                                        i3++;
                                        break;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                            if (i3 < length) {
                                C22633Arz[] arzArr3 = new C22633Arz[i3];
                                System.arraycopy(arzArr2, 0, arzArr3, 0, i3);
                                arzArr2 = arzArr3;
                            }
                            int i6 = 0;
                            int i7 = 0;
                            while (i7 != arzArr2.length) {
                                C22640As6 as6 = new C22640As6(((B0I) arzArr2[i7].A0A().A00).BHz());
                                try {
                                    r14.A01(as6);
                                    r14.A00(as6);
                                    i7++;
                                } catch (C1890291t e) {
                                    throw new CertPathValidatorException("Subtree check for certificate subject alternative email failed.", e, certPath, i);
                                }
                            }
                            if (arx != null) {
                                try {
                                    C22640As6[] as6Arr = arx.A00;
                                    int length3 = as6Arr.length;
                                    C22640As6[] as6Arr2 = new C22640As6[length3];
                                    System.arraycopy(as6Arr, 0, as6Arr2, 0, length3);
                                    while (i6 < length3) {
                                        try {
                                            r14.A01(as6Arr2[i6]);
                                            r14.A00(as6Arr2[i6]);
                                            i6++;
                                        } catch (C1890291t e2) {
                                            throw new CertPathValidatorException("Subtree check for certificate subject alternative name failed.", e2, certPath, i);
                                        }
                                    }
                                } catch (Exception e3) {
                                    throw new CertPathValidatorException("Subject alternative name contents could not be decoded.", e3, certPath, i);
                                }
                            }
                        } catch (Exception e4) {
                            throw new CertPathValidatorException("Subject alternative name extension could not be decoded.", e4, certPath, i);
                        }
                    } catch (C1888891d e5) {
                        r2 = new C1890291t(e5.getMessage(), e5);
                        throw r2;
                    }
                } catch (C1888891d e6) {
                    try {
                        r2 = new C1890291t(e6.getMessage(), e6);
                        throw r2;
                    } catch (C1890291t e7) {
                        throw new CertPathValidatorException("Subtree check for certificate subject failed.", e7, certPath, i);
                    }
                }
            } catch (Exception e8) {
                throw new CertPathValidatorException("Exception extracting subject name when checking subtrees.", e8, certPath, i);
            }
        }
    }

    public static void A0J(HashSet hashSet, List list, C21794AaR aaR) {
        C1890191s r4 = null;
        boolean z = false;
        for (Object next : list) {
            if (next instanceof B0L) {
                try {
                    hashSet.addAll(((B0L) next).BDp(aaR));
                } catch (C21810Aal e) {
                    r4 = C1890191s.A00("Exception searching in X.509 CRL store.", e);
                }
            } else {
                try {
                    hashSet.addAll(((CertStore) next).getCRLs(new C21877Ac3(aaR)));
                } catch (CertStoreException e2) {
                    r4 = C1890191s.A00("Exception searching in X.509 CRL store.", e2);
                }
            }
            z = true;
        }
        if (!z && r4 != null) {
            throw r4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03b9, code lost:
        if (r1 != null) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03bb, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03c3, code lost:
        throw X.C1890191s.A00("Cannot verify delta CRL.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x040b, code lost:
        if (X.C22630Arw.A00(r0).A02 == false) goto L_0x040d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:495:0x00e9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0158 A[Catch:{ Exception -> 0x072d, 91s -> 0x0735 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0B(java.security.PublicKey r28, java.security.cert.X509Certificate r29, java.security.cert.X509Certificate r30, java.util.Date r31, java.util.Date r32, java.util.List r33, X.C22629Arv r34, X.AnonymousClass9NL r35, X.AXM r36, X.C22844Awt r37, X.C192719Ih r38, X.C201969kn r39) {
        /*
            r27 = r32
            long r3 = r27.getTime()
            long r1 = r31.getTime()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0753
            java.lang.String r0 = X.C203669oV.A01
            java.security.cert.X509CRLSelector r2 = new java.security.cert.X509CRLSelector
            r2.<init>()
            java.util.HashSet r1 = X.C36441kJ.A16()     // Catch:{ 91s -> 0x074b }
            r17 = r29
            X.As7 r0 = X.C201789kO.A00(r17)     // Catch:{ 91s -> 0x074b }
            r1.add(r0)     // Catch:{ 91s -> 0x074b }
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()     // Catch:{ 91s -> 0x074b }
            r26 = r34
            r0 = r26
            X.Arx r10 = r0.A01     // Catch:{ 91s -> 0x074b }
            if (r10 == 0) goto L_0x0058
            X.As6[] r4 = r10.A00     // Catch:{ 91s -> 0x074b }
            int r1 = r4.length     // Catch:{ 91s -> 0x074b }
            X.As6[] r5 = new X.C22640As6[r1]     // Catch:{ 91s -> 0x074b }
            r0 = 0
            java.lang.System.arraycopy(r4, r0, r5, r0, r1)     // Catch:{ 91s -> 0x074b }
            r4 = 0
        L_0x0038:
            int r0 = r5.length     // Catch:{ 91s -> 0x074b }
            if (r4 >= r0) goto L_0x006e
            r0 = r5[r4]     // Catch:{ 91s -> 0x074b }
            int r1 = r0.A00     // Catch:{ 91s -> 0x074b }
            r0 = 4
            if (r1 != r0) goto L_0x0055
            r0 = r5[r4]     // Catch:{ IOException -> 0x0743 }
            X.11z r0 = r0.A01     // Catch:{ IOException -> 0x0743 }
            X.121 r0 = r0.Bve()     // Catch:{ IOException -> 0x0743 }
            byte[] r0 = r0.A08()     // Catch:{ IOException -> 0x0743 }
            X.As7 r0 = X.C22641As7.A01(r0)     // Catch:{ IOException -> 0x0743 }
            r3.add(r0)     // Catch:{ IOException -> 0x0743 }
        L_0x0055:
            int r4 = r4 + 1
            goto L_0x0038
        L_0x0058:
            X.As4 r0 = r0.A00     // Catch:{ 91s -> 0x074b }
            if (r0 == 0) goto L_0x073b
            java.util.Iterator r1 = r1.iterator()     // Catch:{ 91s -> 0x074b }
        L_0x0060:
            boolean r0 = r1.hasNext()     // Catch:{ 91s -> 0x074b }
            if (r0 == 0) goto L_0x006e
            java.lang.Object r0 = r1.next()     // Catch:{ 91s -> 0x074b }
            r3.add(r0)     // Catch:{ 91s -> 0x074b }
            goto L_0x0060
        L_0x006e:
            java.util.Iterator r1 = r3.iterator()     // Catch:{ 91s -> 0x074b }
        L_0x0072:
            boolean r0 = r1.hasNext()     // Catch:{ 91s -> 0x074b }
            if (r0 == 0) goto L_0x008f
            java.lang.Object r0 = r1.next()     // Catch:{ IOException -> 0x0086 }
            X.120 r0 = (X.AnonymousClass120) r0     // Catch:{ IOException -> 0x0086 }
            byte[] r0 = r0.A08()     // Catch:{ IOException -> 0x0086 }
            r2.addIssuerName(r0)     // Catch:{ IOException -> 0x0086 }
            goto L_0x0072
        L_0x0086:
            r1 = move-exception
            java.lang.String r0 = "Cannot decode CRL issuer information."
            X.91s r0 = X.C1890191s.A00(r0, r1)     // Catch:{ 91s -> 0x074b }
            goto L_0x074a
        L_0x008f:
            if (r29 == 0) goto L_0x0096
            r0 = r17
            r2.setCertificateChecking(r0)
        L_0x0096:
            X.9Mr r1 = new X.9Mr
            r1.<init>(r2)
            r0 = 1
            r1.A01 = r0
            X.AaR r3 = new X.AaR
            r3.<init>(r1)
            r15 = r36
            java.security.cert.PKIXParameters r0 = r15.A01
            r25 = r0
            java.util.List r2 = r25.getCertStores()
            java.util.List r0 = r15.A04
            r24 = r0
            r1 = r0
            r0 = r27
            java.util.HashSet r1 = A05(r0, r2, r1, r3)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00e0
            java.lang.String r3 = "\""
            java.lang.String r0 = "No CRLs found for issuer \""
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0v(r0)
            X.9gd r1 = X.C22689Ast.A0j
            X.As7 r0 = X.C201789kO.A01(r17)
            java.lang.String r0 = r1.A01(r0)
            java.lang.String r3 = X.AnonymousClass000.A0p(r0, r3, r2)
            r0 = r35
            java.security.cert.CertPath r2 = r0.A02
            int r1 = r0.A00
            X.Abu r0 = new X.Abu
            r0.<init>(r3, r2, r1)
            throw r0
        L_0x00e0:
            java.util.Iterator r19 = r1.iterator()
            r9 = 0
            r23 = r9
            r18 = 0
        L_0x00e9:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0738
            r11 = r38
            int r1 = r11.A00
            r0 = 11
            if (r1 != r0) goto L_0x0738
            r0 = r39
            int r1 = r0.A00
            X.9kn r8 = X.C201969kn.A01
            int r0 = r8.A00
            if (r1 == r0) goto L_0x0738
            java.lang.Object r7 = r19.next()     // Catch:{ 91s -> 0x0735 }
            java.security.cert.X509CRL r7 = (java.security.cert.X509CRL) r7     // Catch:{ 91s -> 0x0735 }
            java.lang.String r6 = A07     // Catch:{ Exception -> 0x072d }
            X.121 r0 = X.C203669oV.A05(r6, r7)     // Catch:{ Exception -> 0x072d }
            X.Arw r2 = X.C22630Arw.A00(r0)     // Catch:{ Exception -> 0x072d }
            if (r2 == 0) goto L_0x0114
            goto L_0x0123
        L_0x0114:
            r0 = r26
            X.Asn r1 = r0.A02     // Catch:{ 91s -> 0x0735 }
            if (r1 == 0) goto L_0x014e
            X.9kn r0 = new X.9kn     // Catch:{ 91s -> 0x0735 }
            r0.<init>((X.C22683Asn) r1)     // Catch:{ 91s -> 0x0735 }
            if (r2 != 0) goto L_0x015a
            r2 = r8
            goto L_0x0137
        L_0x0123:
            X.Asn r1 = r2.A01     // Catch:{ 91s -> 0x0735 }
            if (r1 == 0) goto L_0x0114
            r0 = r26
            X.Asn r3 = r0.A02     // Catch:{ 91s -> 0x0735 }
            if (r3 == 0) goto L_0x0159
            X.9kn r0 = new X.9kn     // Catch:{ 91s -> 0x0735 }
            r0.<init>((X.C22683Asn) r3)     // Catch:{ 91s -> 0x0735 }
            X.9kn r2 = new X.9kn     // Catch:{ 91s -> 0x0735 }
            r2.<init>((X.C22683Asn) r1)     // Catch:{ 91s -> 0x0735 }
        L_0x0137:
            r1 = 0
            X.9kn r8 = new X.9kn     // Catch:{ 91s -> 0x0735 }
            r8.<init>((int) r1)     // Catch:{ 91s -> 0x0735 }
            int r0 = r0.A00     // Catch:{ 91s -> 0x0735 }
            int r1 = r2.A00     // Catch:{ 91s -> 0x0735 }
            r1 = r1 & r0
            X.9kn r0 = new X.9kn     // Catch:{ 91s -> 0x0735 }
            r0.<init>((int) r1)     // Catch:{ 91s -> 0x0735 }
            int r1 = r8.A00     // Catch:{ 91s -> 0x0735 }
            int r0 = r0.A00     // Catch:{ 91s -> 0x0735 }
            r0 = r0 | r1
            r8.A00 = r0     // Catch:{ 91s -> 0x0735 }
        L_0x014e:
            int r1 = r8.A00     // Catch:{ 91s -> 0x0735 }
            r0 = r39
            int r0 = r0.A00     // Catch:{ 91s -> 0x0735 }
            r0 = r0 ^ r1
            r0 = r0 | r1
            if (r0 == 0) goto L_0x00e9
            goto L_0x0162
        L_0x0159:
            r0 = r8
        L_0x015a:
            X.Asn r1 = r2.A01     // Catch:{ 91s -> 0x0735 }
            X.9kn r2 = new X.9kn     // Catch:{ 91s -> 0x0735 }
            r2.<init>((X.C22683Asn) r1)     // Catch:{ 91s -> 0x0735 }
            goto L_0x0137
        L_0x0162:
            java.security.cert.X509CertSelector r1 = new java.security.cert.X509CertSelector     // Catch:{ 91s -> 0x072a }
            r1.<init>()     // Catch:{ 91s -> 0x072a }
            if (r7 == 0) goto L_0x071d
            javax.security.auth.x500.X500Principal r0 = r7.getIssuerX500Principal()     // Catch:{ IOException -> 0x0722 }
            X.As7 r0 = X.C201789kO.A03(r0)     // Catch:{ IOException -> 0x0722 }
            byte[] r0 = r0.A08()     // Catch:{ IOException -> 0x0722 }
            r1.setSubject(r0)     // Catch:{ IOException -> 0x0722 }
            X.9Fx r0 = new X.9Fx     // Catch:{ 91s -> 0x072a }
            r0.<init>(r1)     // Catch:{ 91s -> 0x072a }
            java.security.cert.CertSelector r0 = r0.A00     // Catch:{ 91s -> 0x072a }
            X.AaQ r2 = new X.AaQ     // Catch:{ 91s -> 0x072a }
            r2.<init>(r0)     // Catch:{ 91s -> 0x072a }
            java.util.LinkedHashSet r1 = X.C36441kJ.A17()     // Catch:{ 91s -> 0x072a }
            java.util.List r0 = r15.A05     // Catch:{ 91s -> 0x0715 }
            X.C203669oV.A09(r1, r0, r2)     // Catch:{ 91s -> 0x0715 }
            java.util.List r0 = r25.getCertStores()     // Catch:{ 91s -> 0x0715 }
            X.C203669oV.A09(r1, r0, r2)     // Catch:{ 91s -> 0x0715 }
            r0 = r30
            r1.add(r0)     // Catch:{ 91s -> 0x072a }
            java.util.Iterator r16 = r1.iterator()     // Catch:{ 91s -> 0x072a }
            java.util.ArrayList r14 = X.AnonymousClass001.A0I()     // Catch:{ 91s -> 0x072a }
            java.util.ArrayList r13 = X.AnonymousClass001.A0I()     // Catch:{ 91s -> 0x072a }
        L_0x01a5:
            boolean r0 = r16.hasNext()     // Catch:{ 91s -> 0x072a }
            r12 = 0
            if (r0 == 0) goto L_0x023d
            java.lang.Object r5 = r16.next()     // Catch:{ 91s -> 0x072a }
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5     // Catch:{ 91s -> 0x072a }
            r0 = r30
            boolean r0 = r5.equals(r0)     // Catch:{ 91s -> 0x072a }
            if (r0 == 0) goto L_0x01c3
            r14.add(r5)     // Catch:{ 91s -> 0x072a }
            r0 = r28
            r13.add(r0)     // Catch:{ 91s -> 0x072a }
            goto L_0x01a5
        L_0x01c3:
            java.lang.Class r0 = A00     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
            r4 = 1
            if (r0 == 0) goto L_0x021d
            X.Abt r3 = new X.Abt     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
            r3.<init>(r4)     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
        L_0x01cd:
            java.security.cert.X509CertSelector r1 = new java.security.cert.X509CertSelector     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
            r1.<init>()     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
            r1.setCertificate(r5)     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
            X.9dA r2 = new X.9dA     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
            r2.<init>((X.AXM) r15)     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
            X.9Fx r0 = new X.9Fx     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
            r0.<init>(r1)     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
            java.security.cert.CertSelector r1 = r0.A00     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
            X.AaQ r0 = new X.AaQ     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
            r0.<init>(r1)     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
            r2.A06 = r0     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
            r0 = r33
            boolean r0 = r0.contains(r5)     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
            if (r0 == 0) goto L_0x021a
            r2.A07 = r12     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
        L_0x01f2:
            X.AXM r1 = new X.AXM     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
            r1.<init>(r2)     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
            X.9cP r0 = new X.9cP     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
            r0.<init>((X.AXM) r1)     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
            X.AXL r1 = new X.AXL     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
            r1.<init>(r0)     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
            java.security.cert.CertPathBuilderResult r0 = r3.engineBuild(r1)     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
            java.security.cert.CertPath r0 = r0.getCertPath()     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
            java.util.List r0 = r0.getCertificates()     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
            r14.add(r5)     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
            r1 = r37
            java.security.PublicKey r0 = X.C203669oV.A00(r0, r1, r12)     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
            r13.add(r0)     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
            goto L_0x01a5
        L_0x021a:
            r2.A07 = r4     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
            goto L_0x01f2
        L_0x021d:
            X.Abs r3 = new X.Abs     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
            r3.<init>(r4)     // Catch:{ CertPathBuilderException -> 0x0235, CertPathValidatorException -> 0x022d, Exception -> 0x0223 }
            goto L_0x01cd
        L_0x0223:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ 91s -> 0x072a }
            X.91s r0 = X.C1890191s.A00(r0, r9)     // Catch:{ 91s -> 0x072a }
            throw r0     // Catch:{ 91s -> 0x072a }
        L_0x022d:
            r1 = move-exception
            java.lang.String r0 = "Public key of issuer certificate of CRL could not be retrieved."
            X.91s r0 = X.C1890191s.A00(r0, r1)     // Catch:{ 91s -> 0x072a }
            throw r0     // Catch:{ 91s -> 0x072a }
        L_0x0235:
            r1 = move-exception
            java.lang.String r0 = "CertPath for CRL signer failed to validate."
            X.91s r0 = X.C1890191s.A00(r0, r1)     // Catch:{ 91s -> 0x072a }
            throw r0     // Catch:{ 91s -> 0x072a }
        L_0x023d:
            java.util.HashSet r3 = X.C36441kJ.A16()     // Catch:{ 91s -> 0x072a }
            r4 = 0
        L_0x0242:
            int r0 = r14.size()     // Catch:{ 91s -> 0x072a }
            if (r12 >= r0) goto L_0x026d
            java.lang.Object r0 = r14.get(r12)     // Catch:{ 91s -> 0x072a }
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0     // Catch:{ 91s -> 0x072a }
            boolean[] r2 = r0.getKeyUsage()     // Catch:{ 91s -> 0x072a }
            if (r2 == 0) goto L_0x0263
            int r1 = r2.length     // Catch:{ 91s -> 0x072a }
            r0 = 6
            if (r1 <= r0) goto L_0x025c
            boolean r0 = r2[r0]     // Catch:{ 91s -> 0x072a }
            if (r0 != 0) goto L_0x0263
        L_0x025c:
            java.lang.String r0 = "Issuer certificate key usage extension does not permit CRL signing."
            X.91s r4 = X.C1890191s.A00(r0, r9)     // Catch:{ 91s -> 0x072a }
            goto L_0x026a
        L_0x0263:
            java.lang.Object r0 = r13.get(r12)     // Catch:{ 91s -> 0x072a }
            r3.add(r0)     // Catch:{ 91s -> 0x072a }
        L_0x026a:
            int r12 = r12 + 1
            goto L_0x0242
        L_0x026d:
            boolean r0 = r3.isEmpty()     // Catch:{ 91s -> 0x072a }
            if (r0 == 0) goto L_0x027c
            if (r4 != 0) goto L_0x027c
            java.lang.String r0 = "Cannot find a valid issuer certificate."
            X.91s r0 = X.C1890191s.A00(r0, r9)     // Catch:{ 91s -> 0x072a }
            throw r0     // Catch:{ 91s -> 0x072a }
        L_0x027c:
            boolean r0 = r3.isEmpty()     // Catch:{ 91s -> 0x072a }
            if (r0 == 0) goto L_0x0285
            if (r4 == 0) goto L_0x0285
            throw r4     // Catch:{ 91s -> 0x072a }
        L_0x0285:
            java.util.Iterator r2 = r3.iterator()     // Catch:{ 91s -> 0x072a }
            r1 = 0
        L_0x028a:
            boolean r0 = r2.hasNext()     // Catch:{ 91s -> 0x072a }
            if (r0 == 0) goto L_0x070e
            java.lang.Object r12 = r2.next()     // Catch:{ 91s -> 0x072a }
            java.security.PublicKey r12 = (java.security.PublicKey) r12     // Catch:{ 91s -> 0x072a }
            r7.verify(r12)     // Catch:{ Exception -> 0x029a }
            goto L_0x029c
        L_0x029a:
            r1 = move-exception
            goto L_0x028a
        L_0x029c:
            boolean r0 = r15.A0B     // Catch:{ 91s -> 0x072a }
            r22 = r0
            if (r0 == 0) goto L_0x03dc
            java.util.List r2 = r25.getCertStores()     // Catch:{ 91s -> 0x072a }
            java.security.cert.X509CRLSelector r4 = new java.security.cert.X509CRLSelector     // Catch:{ 91s -> 0x070b }
            r4.<init>()     // Catch:{ 91s -> 0x070b }
            javax.security.auth.x500.X500Principal r0 = r7.getIssuerX500Principal()     // Catch:{ IOException -> 0x03d4 }
            X.As7 r0 = X.C201789kO.A03(r0)     // Catch:{ IOException -> 0x03d4 }
            byte[] r0 = r0.A08()     // Catch:{ IOException -> 0x03d4 }
            r4.addIssuerName(r0)     // Catch:{ IOException -> 0x03d4 }
            java.lang.String r0 = X.C203669oV.A00     // Catch:{ Exception -> 0x03cc }
            X.121 r0 = X.C203669oV.A05(r0, r7)     // Catch:{ Exception -> 0x03cc }
            r5 = 0
            if (r0 == 0) goto L_0x02d0
            X.AsK r0 = X.C22654AsK.A01(r0)     // Catch:{ Exception -> 0x03cc }
            byte[] r3 = r0.A00     // Catch:{ Exception -> 0x03cc }
            r0 = 1
            java.math.BigInteger r1 = new java.math.BigInteger     // Catch:{ Exception -> 0x03cc }
            r1.<init>(r0, r3)     // Catch:{ Exception -> 0x03cc }
            goto L_0x02d1
        L_0x02d0:
            r1 = r9
        L_0x02d1:
            java.lang.String r0 = X.C203669oV.A01     // Catch:{ Exception -> 0x03c4 }
            byte[] r21 = r7.getExtensionValue(r0)     // Catch:{ Exception -> 0x03c4 }
            if (r1 == 0) goto L_0x02e3
            r13 = 1
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r13)     // Catch:{ 91s -> 0x070b }
            java.math.BigInteger r5 = r1.add(r0)     // Catch:{ 91s -> 0x070b }
        L_0x02e3:
            r4.setMinCRLNumber(r5)     // Catch:{ 91s -> 0x070b }
            X.9Mr r0 = new X.9Mr     // Catch:{ 91s -> 0x070b }
            r0.<init>(r4)     // Catch:{ 91s -> 0x070b }
            byte[] r3 = X.AnonymousClass124.A02(r21)     // Catch:{ 91s -> 0x070b }
            r0.A03 = r3     // Catch:{ 91s -> 0x070b }
            r3 = 1
            r0.A02 = r3     // Catch:{ 91s -> 0x070b }
            r0.A00 = r1     // Catch:{ 91s -> 0x070b }
            X.AaR r13 = new X.AaR     // Catch:{ 91s -> 0x070b }
            r13.<init>(r0)     // Catch:{ 91s -> 0x070b }
            r1 = r24
            r0 = r27
            java.util.HashSet r20 = A05(r0, r2, r1, r13)     // Catch:{ 91s -> 0x070b }
            boolean r0 = r20.isEmpty()     // Catch:{ 91s -> 0x070b }
            if (r0 == 0) goto L_0x037c
            java.lang.String r0 = "org.spongycastle.x509.enableCRLDP"
            boolean r0 = X.C200679hw.A01(r0)     // Catch:{ 91s -> 0x070b }
            if (r0 == 0) goto L_0x037c
            java.lang.String r1 = "X.509"
            r0 = r37
            X.AaJ r0 = (X.C21786AaJ) r0     // Catch:{ Exception -> 0x036c }
            java.security.Provider r0 = r0.A00     // Catch:{ Exception -> 0x036c }
            java.security.cert.CertificateFactory r16 = java.security.cert.CertificateFactory.getInstance(r1, r0)     // Catch:{ Exception -> 0x036c }
            X.Arn r0 = X.C22621Arn.A00(r21)     // Catch:{ 91s -> 0x070b }
            X.Arv[] r5 = r0.A0A()     // Catch:{ 91s -> 0x070b }
            r4 = 0
        L_0x0326:
            int r0 = r5.length     // Catch:{ 91s -> 0x070b }
            if (r4 >= r0) goto L_0x037c
            r0 = r5[r4]     // Catch:{ 91s -> 0x070b }
            X.As4 r1 = r0.A00     // Catch:{ 91s -> 0x070b }
            if (r1 == 0) goto L_0x0369
            int r0 = r1.A00     // Catch:{ 91s -> 0x070b }
            if (r0 != 0) goto L_0x0369
            X.11z r0 = r1.A01     // Catch:{ 91s -> 0x070b }
            X.As6[] r3 = X.C22631Arx.A00(r0)     // Catch:{ 91s -> 0x070b }
            r2 = 0
        L_0x033a:
            int r0 = r3.length     // Catch:{ 91s -> 0x070b }
            if (r2 >= r0) goto L_0x0369
            r14 = r3[r4]     // Catch:{ 91s -> 0x070b }
            int r1 = r14.A00     // Catch:{ 91s -> 0x070b }
            r0 = 6
            if (r1 != r0) goto L_0x0366
            X.11z r0 = r14.A01     // Catch:{ Exception -> 0x0366 }
            X.B0I r0 = (X.B0I) r0     // Catch:{ Exception -> 0x0366 }
            java.lang.String r0 = r0.BHz()     // Catch:{ Exception -> 0x0366 }
            java.net.URI r14 = new java.net.URI     // Catch:{ Exception -> 0x0366 }
            r14.<init>(r0)     // Catch:{ Exception -> 0x0366 }
            r1 = r16
            r0 = r27
            X.AUz r0 = X.C201859kZ.A01(r14, r1, r0)     // Catch:{ Exception -> 0x0366 }
            java.util.List r14 = java.util.Collections.EMPTY_LIST     // Catch:{ Exception -> 0x0366 }
            java.util.List r1 = java.util.Collections.singletonList(r0)     // Catch:{ Exception -> 0x0366 }
            r0 = r27
            java.util.HashSet r20 = A05(r0, r14, r1, r13)     // Catch:{ Exception -> 0x0366 }
            goto L_0x0369
        L_0x0366:
            int r2 = r2 + 1
            goto L_0x033a
        L_0x0369:
            int r4 = r4 + 1
            goto L_0x0326
        L_0x036c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 91s -> 0x070b }
            java.lang.String r0 = "cannot create certificate factory: "
            java.lang.String r0 = X.C36331k8.A0i(r0, r1, r2)     // Catch:{ 91s -> 0x070b }
            X.91s r0 = X.C1890191s.A00(r0, r2)     // Catch:{ 91s -> 0x070b }
            throw r0     // Catch:{ 91s -> 0x070b }
        L_0x037c:
            java.util.HashSet r2 = X.C36441kJ.A16()     // Catch:{ 91s -> 0x070b }
            java.util.Iterator r4 = r20.iterator()     // Catch:{ 91s -> 0x070b }
        L_0x0384:
            boolean r0 = r4.hasNext()     // Catch:{ 91s -> 0x070b }
            if (r0 == 0) goto L_0x03a2
            java.lang.Object r1 = r4.next()     // Catch:{ 91s -> 0x070b }
            java.security.cert.X509CRL r1 = (java.security.cert.X509CRL) r1     // Catch:{ 91s -> 0x070b }
            java.util.Set r3 = r1.getCriticalExtensionOIDs()     // Catch:{ 91s -> 0x070b }
            if (r3 == 0) goto L_0x0384
            java.lang.String r0 = A05     // Catch:{ 91s -> 0x070b }
            boolean r0 = r3.contains(r0)     // Catch:{ 91s -> 0x070b }
            if (r0 == 0) goto L_0x0384
            r2.add(r1)     // Catch:{ 91s -> 0x070b }
            goto L_0x0384
        L_0x03a2:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ 91s -> 0x070b }
            r1 = r9
        L_0x03a7:
            boolean r0 = r2.hasNext()     // Catch:{ 91s -> 0x070b }
            if (r0 == 0) goto L_0x03b9
            java.lang.Object r14 = r2.next()     // Catch:{ 91s -> 0x070b }
            java.security.cert.X509CRL r14 = (java.security.cert.X509CRL) r14     // Catch:{ 91s -> 0x070b }
            r14.verify(r12)     // Catch:{ Exception -> 0x03b7 }
            goto L_0x03dd
        L_0x03b7:
            r1 = move-exception
            goto L_0x03a7
        L_0x03b9:
            if (r1 != 0) goto L_0x03bd
            r14 = r9
            goto L_0x03dd
        L_0x03bd:
            java.lang.String r0 = "Cannot verify delta CRL."
            X.91s r0 = X.C1890191s.A00(r0, r1)     // Catch:{ 91s -> 0x070b }
            throw r0     // Catch:{ 91s -> 0x070b }
        L_0x03c4:
            r1 = move-exception
            java.lang.String r0 = "Issuing distribution point extension value could not be read."
            X.91s r0 = X.C1890191s.A00(r0, r1)     // Catch:{ 91s -> 0x070b }
            throw r0     // Catch:{ 91s -> 0x070b }
        L_0x03cc:
            r1 = move-exception
            java.lang.String r0 = "CRL number extension could not be extracted from CRL."
            X.91s r0 = X.C1890191s.A00(r0, r1)     // Catch:{ 91s -> 0x070b }
            throw r0     // Catch:{ 91s -> 0x070b }
        L_0x03d4:
            r1 = move-exception
            java.lang.String r0 = "Cannot extract issuer from CRL."
            X.91s r0 = X.C1890191s.A00(r0, r1)     // Catch:{ 91s -> 0x070b }
            throw r0     // Catch:{ 91s -> 0x070b }
        L_0x03dc:
            r14 = r9
        L_0x03dd:
            int r1 = r15.A00     // Catch:{ 91s -> 0x070b }
            r0 = 1
            if (r1 == r0) goto L_0x03fd
            java.util.Date r0 = r17.getNotAfter()     // Catch:{ 91s -> 0x0708 }
            long r3 = r0.getTime()     // Catch:{ 91s -> 0x0708 }
            java.util.Date r0 = r7.getThisUpdate()     // Catch:{ 91s -> 0x0708 }
            long r1 = r0.getTime()     // Catch:{ 91s -> 0x0708 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x03fd
            java.lang.String r0 = "No valid CRL for current time found."
            X.91s r0 = X.C1890191s.A00(r0, r9)     // Catch:{ 91s -> 0x0708 }
            throw r0     // Catch:{ 91s -> 0x0708 }
        L_0x03fd:
            X.121 r0 = X.C203669oV.A05(r6, r7)     // Catch:{ 91s -> 0x0708 }
            r4 = 0
            if (r0 == 0) goto L_0x040d
            X.Arw r0 = X.C22630Arw.A00(r0)     // Catch:{ 91s -> 0x0708 }
            boolean r0 = r0.A02     // Catch:{ 91s -> 0x0708 }
            r13 = 1
            if (r0 != 0) goto L_0x040e
        L_0x040d:
            r13 = 0
        L_0x040e:
            javax.security.auth.x500.X500Principal r0 = r7.getIssuerX500Principal()     // Catch:{ IOException -> 0x06f8 }
            X.As7 r0 = X.C201789kO.A03(r0)     // Catch:{ IOException -> 0x06f8 }
            byte[] r3 = r0.A08()     // Catch:{ IOException -> 0x06f8 }
            if (r10 == 0) goto L_0x045e
            X.As6[] r0 = r10.A00     // Catch:{ 91s -> 0x0708 }
            int r2 = r0.length     // Catch:{ 91s -> 0x0708 }
            X.As6[] r1 = new X.C22640As6[r2]     // Catch:{ 91s -> 0x0708 }
            java.lang.System.arraycopy(r0, r4, r1, r4, r2)     // Catch:{ 91s -> 0x0708 }
            r12 = 0
        L_0x0425:
            if (r4 >= r2) goto L_0x044c
            r0 = r1[r4]     // Catch:{ 91s -> 0x0708 }
            int r5 = r0.A00     // Catch:{ 91s -> 0x0708 }
            r0 = 4
            if (r5 != r0) goto L_0x0441
            r0 = r1[r4]     // Catch:{ IOException -> 0x0444 }
            X.11z r0 = r0.A01     // Catch:{ IOException -> 0x0444 }
            X.121 r0 = r0.Bve()     // Catch:{ IOException -> 0x0444 }
            byte[] r0 = r0.A08()     // Catch:{ IOException -> 0x0444 }
            boolean r0 = java.util.Arrays.equals(r0, r3)     // Catch:{ IOException -> 0x0444 }
            if (r0 == 0) goto L_0x0441
            r12 = 1
        L_0x0441:
            int r4 = r4 + 1
            goto L_0x0425
        L_0x0444:
            r1 = move-exception
            java.lang.String r0 = "CRL issuer information from distribution point cannot be decoded."
            X.91s r0 = X.C1890191s.A00(r0, r1)     // Catch:{ 91s -> 0x0708 }
            throw r0     // Catch:{ 91s -> 0x0708 }
        L_0x044c:
            if (r12 == 0) goto L_0x0457
            if (r13 != 0) goto L_0x0477
            java.lang.String r0 = "Distribution point contains cRLIssuer field but CRL is not indirect."
            X.91s r0 = X.C1890191s.A00(r0, r9)     // Catch:{ 91s -> 0x0708 }
            throw r0     // Catch:{ 91s -> 0x0708 }
        L_0x0457:
            java.lang.String r0 = "CRL issuer of CRL does not match CRL issuer of distribution point."
            X.91s r0 = X.C1890191s.A00(r0, r9)     // Catch:{ 91s -> 0x0708 }
            throw r0     // Catch:{ 91s -> 0x0708 }
        L_0x045e:
            javax.security.auth.x500.X500Principal r0 = r7.getIssuerX500Principal()     // Catch:{ 91s -> 0x0708 }
            X.As7 r1 = X.C201789kO.A03(r0)     // Catch:{ 91s -> 0x0708 }
            X.As7 r0 = X.C201789kO.A00(r17)     // Catch:{ 91s -> 0x0708 }
            boolean r0 = r1.equals(r0)     // Catch:{ 91s -> 0x0708 }
            if (r0 != 0) goto L_0x0477
            java.lang.String r0 = "Cannot find matching CRL issuer for certificate."
            X.91s r0 = X.C1890191s.A00(r0, r9)     // Catch:{ 91s -> 0x0708 }
            throw r0     // Catch:{ 91s -> 0x0708 }
        L_0x0477:
            X.121 r0 = X.C203669oV.A05(r6, r7)     // Catch:{ Exception -> 0x06f0 }
            X.Arw r13 = X.C22630Arw.A00(r0)     // Catch:{ Exception -> 0x06f0 }
            if (r13 == 0) goto L_0x05dd
            X.As4 r0 = r13.A00     // Catch:{ 91s -> 0x0708 }
            if (r0 == 0) goto L_0x0592
            X.Arw r0 = X.C22630Arw.A00(r13)     // Catch:{ 91s -> 0x0708 }
            X.As4 r3 = r0.A00     // Catch:{ 91s -> 0x0708 }
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()     // Catch:{ 91s -> 0x0708 }
            int r2 = r3.A00     // Catch:{ 91s -> 0x0708 }
            r5 = 0
            if (r2 != 0) goto L_0x04a6
            X.11z r0 = r3.A01     // Catch:{ 91s -> 0x0708 }
            X.As6[] r4 = X.C22631Arx.A00(r0)     // Catch:{ 91s -> 0x0708 }
            r1 = 0
        L_0x049b:
            int r0 = r4.length     // Catch:{ 91s -> 0x0708 }
            if (r1 >= r0) goto L_0x04a6
            r0 = r4[r1]     // Catch:{ 91s -> 0x0708 }
            r12.add(r0)     // Catch:{ 91s -> 0x0708 }
            int r1 = r1 + 1
            goto L_0x049b
        L_0x04a6:
            r0 = 1
            if (r2 != r0) goto L_0x04e8
            X.9lB r2 = new X.9lB     // Catch:{ 91s -> 0x0708 }
            r2.<init>()     // Catch:{ 91s -> 0x0708 }
            javax.security.auth.x500.X500Principal r1 = r7.getIssuerX500Principal()     // Catch:{ Exception -> 0x04ce }
            X.As7 r1 = X.C201789kO.A03(r1)     // Catch:{ Exception -> 0x04ce }
            X.AsM r1 = X.C22656AsM.A04(r1)     // Catch:{ Exception -> 0x04ce }
            java.util.Enumeration r4 = r1.A0I()     // Catch:{ Exception -> 0x04ce }
        L_0x04be:
            boolean r1 = r4.hasMoreElements()     // Catch:{ Exception -> 0x04ce }
            if (r1 == 0) goto L_0x04d6
            java.lang.Object r1 = r4.nextElement()     // Catch:{ Exception -> 0x04ce }
            X.11z r1 = (X.C219411z) r1     // Catch:{ Exception -> 0x04ce }
            r2.A06(r1)     // Catch:{ Exception -> 0x04ce }
            goto L_0x04be
        L_0x04ce:
            r1 = move-exception
            java.lang.String r0 = "Could not read CRL issuer."
            X.91s r0 = X.C1890191s.A00(r0, r1)     // Catch:{ 91s -> 0x0708 }
            throw r0     // Catch:{ 91s -> 0x0708 }
        L_0x04d6:
            X.11z r1 = r3.A01     // Catch:{ 91s -> 0x0708 }
            X.Asf r1 = X.C202169lB.A01(r1, r2)     // Catch:{ 91s -> 0x0708 }
            X.As7 r2 = X.C22641As7.A01(r1)     // Catch:{ 91s -> 0x0708 }
            X.As6 r1 = new X.As6     // Catch:{ 91s -> 0x0708 }
            r1.<init>((X.C22641As7) r2)     // Catch:{ 91s -> 0x0708 }
            r12.add(r1)     // Catch:{ 91s -> 0x0708 }
        L_0x04e8:
            r1 = r26
            X.As4 r4 = r1.A00     // Catch:{ 91s -> 0x0708 }
            java.lang.String r3 = "No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point."
            if (r4 == 0) goto L_0x056e
            int r1 = r4.A00     // Catch:{ 91s -> 0x0708 }
            if (r1 != 0) goto L_0x04fb
            X.11z r0 = r4.A01     // Catch:{ 91s -> 0x0708 }
            X.As6[] r2 = X.C22631Arx.A00(r0)     // Catch:{ 91s -> 0x0708 }
            goto L_0x0552
        L_0x04fb:
            if (r1 != r0) goto L_0x0569
            if (r10 == 0) goto L_0x0500
            goto L_0x050e
        L_0x0500:
            X.As6[] r2 = new X.C22640As6[r0]     // Catch:{ 91s -> 0x0708 }
            X.As7 r1 = X.C201789kO.A00(r17)     // Catch:{ Exception -> 0x0561 }
            X.As6 r0 = new X.As6     // Catch:{ Exception -> 0x0561 }
            r0.<init>((X.C22641As7) r1)     // Catch:{ Exception -> 0x0561 }
            r2[r5] = r0     // Catch:{ Exception -> 0x0561 }
            goto L_0x0516
        L_0x050e:
            X.As6[] r1 = r10.A00     // Catch:{ 91s -> 0x0708 }
            int r0 = r1.length     // Catch:{ 91s -> 0x0708 }
            X.As6[] r2 = new X.C22640As6[r0]     // Catch:{ 91s -> 0x0708 }
            java.lang.System.arraycopy(r1, r5, r2, r5, r0)     // Catch:{ 91s -> 0x0708 }
        L_0x0516:
            int r0 = r2.length     // Catch:{ 91s -> 0x0708 }
            if (r5 >= r0) goto L_0x0552
            r0 = r2[r5]     // Catch:{ 91s -> 0x0708 }
            X.11z r0 = r0.A01     // Catch:{ 91s -> 0x0708 }
            X.121 r0 = r0.Bve()     // Catch:{ 91s -> 0x0708 }
            X.AsM r0 = X.C22656AsM.A04(r0)     // Catch:{ 91s -> 0x0708 }
            java.util.Enumeration r16 = r0.A0I()     // Catch:{ 91s -> 0x0708 }
            X.9lB r1 = new X.9lB     // Catch:{ 91s -> 0x0708 }
            r1.<init>()     // Catch:{ 91s -> 0x0708 }
        L_0x052e:
            boolean r0 = r16.hasMoreElements()     // Catch:{ 91s -> 0x0708 }
            if (r0 == 0) goto L_0x053e
            java.lang.Object r0 = r16.nextElement()     // Catch:{ 91s -> 0x0708 }
            X.11z r0 = (X.C219411z) r0     // Catch:{ 91s -> 0x0708 }
            r1.A06(r0)     // Catch:{ 91s -> 0x0708 }
            goto L_0x052e
        L_0x053e:
            X.11z r0 = r4.A01     // Catch:{ 91s -> 0x0708 }
            X.Asf r0 = X.C202169lB.A01(r0, r1)     // Catch:{ 91s -> 0x0708 }
            X.As7 r1 = X.C22641As7.A01(r0)     // Catch:{ 91s -> 0x0708 }
            X.As6 r0 = new X.As6     // Catch:{ 91s -> 0x0708 }
            r0.<init>((X.C22641As7) r1)     // Catch:{ 91s -> 0x0708 }
            r2[r5] = r0     // Catch:{ 91s -> 0x0708 }
            int r5 = r5 + 1
            goto L_0x0516
        L_0x0552:
            r1 = 0
        L_0x0553:
            int r0 = r2.length     // Catch:{ 91s -> 0x0708 }
            if (r1 >= r0) goto L_0x0569
            r0 = r2[r1]     // Catch:{ 91s -> 0x0708 }
            boolean r0 = r12.contains(r0)     // Catch:{ 91s -> 0x0708 }
            if (r0 != 0) goto L_0x0592
            int r1 = r1 + 1
            goto L_0x0553
        L_0x0561:
            r1 = move-exception
            java.lang.String r0 = "Could not read certificate issuer."
            X.91s r0 = X.C1890191s.A00(r0, r1)     // Catch:{ 91s -> 0x0708 }
            throw r0     // Catch:{ 91s -> 0x0708 }
        L_0x0569:
            X.91s r0 = X.C1890191s.A00(r3, r9)     // Catch:{ 91s -> 0x0708 }
            throw r0     // Catch:{ 91s -> 0x0708 }
        L_0x056e:
            if (r10 == 0) goto L_0x058b
            X.As6[] r0 = r10.A00     // Catch:{ 91s -> 0x0708 }
            int r2 = r0.length     // Catch:{ 91s -> 0x0708 }
            X.As6[] r1 = new X.C22640As6[r2]     // Catch:{ 91s -> 0x0708 }
            java.lang.System.arraycopy(r0, r5, r1, r5, r2)     // Catch:{ 91s -> 0x0708 }
            r4 = 0
        L_0x0579:
            if (r4 >= r2) goto L_0x0586
            r0 = r1[r4]     // Catch:{ 91s -> 0x0708 }
            boolean r0 = r12.contains(r0)     // Catch:{ 91s -> 0x0708 }
            if (r0 != 0) goto L_0x0592
            int r4 = r4 + 1
            goto L_0x0579
        L_0x0586:
            X.91s r0 = X.C1890191s.A00(r3, r9)     // Catch:{ 91s -> 0x0708 }
            throw r0     // Catch:{ 91s -> 0x0708 }
        L_0x058b:
            java.lang.String r0 = "Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint."
            X.91s r0 = X.C1890191s.A00(r0, r9)     // Catch:{ 91s -> 0x0708 }
            throw r0     // Catch:{ 91s -> 0x0708 }
        L_0x0592:
            java.lang.String r1 = A02     // Catch:{ Exception -> 0x05d5 }
            r0 = r17
            X.121 r0 = X.C203669oV.A05(r1, r0)     // Catch:{ Exception -> 0x05d5 }
            X.Arl r1 = X.C22619Arl.A00(r0)     // Catch:{ Exception -> 0x05d5 }
            if (r29 == 0) goto L_0x05c3
            boolean r0 = r13.A05     // Catch:{ 91s -> 0x0708 }
            if (r0 == 0) goto L_0x05b5
            if (r1 == 0) goto L_0x05b5
            X.AsJ r0 = r1.A00     // Catch:{ 91s -> 0x0708 }
            if (r0 == 0) goto L_0x05b5
            byte r0 = r0.A00     // Catch:{ 91s -> 0x0708 }
            if (r0 == 0) goto L_0x05b5
            java.lang.String r0 = "CA Cert CRL only contains user certificates."
            X.91s r0 = X.C1890191s.A00(r0, r9)     // Catch:{ 91s -> 0x0708 }
            throw r0     // Catch:{ 91s -> 0x0708 }
        L_0x05b5:
            boolean r0 = r13.A04     // Catch:{ 91s -> 0x0708 }
            if (r0 == 0) goto L_0x05c3
            if (r1 == 0) goto L_0x05ce
            X.AsJ r0 = r1.A00     // Catch:{ 91s -> 0x0708 }
            if (r0 == 0) goto L_0x05ce
            byte r0 = r0.A00     // Catch:{ 91s -> 0x0708 }
            if (r0 == 0) goto L_0x05ce
        L_0x05c3:
            boolean r0 = r13.A03     // Catch:{ 91s -> 0x0708 }
            if (r0 == 0) goto L_0x05dd
            java.lang.String r0 = "onlyContainsAttributeCerts boolean is asserted."
            X.91s r0 = X.C1890191s.A00(r0, r9)     // Catch:{ 91s -> 0x0708 }
            throw r0     // Catch:{ 91s -> 0x0708 }
        L_0x05ce:
            java.lang.String r0 = "End CRL only contains CA certificates."
            X.91s r0 = X.C1890191s.A00(r0, r9)     // Catch:{ 91s -> 0x0708 }
            throw r0     // Catch:{ 91s -> 0x0708 }
        L_0x05d5:
            r1 = move-exception
            java.lang.String r0 = "Basic constraints extension could not be decoded."
            X.91s r0 = X.C1890191s.A00(r0, r1)     // Catch:{ 91s -> 0x0708 }
            throw r0     // Catch:{ 91s -> 0x0708 }
        L_0x05dd:
            if (r14 == 0) goto L_0x0677
            boolean r0 = r14.hasUnsupportedCriticalExtension()     // Catch:{ 91s -> 0x0708 }
            if (r0 != 0) goto L_0x0663
            X.121 r0 = X.C203669oV.A05(r6, r7)     // Catch:{ Exception -> 0x065b }
            X.Arw r2 = X.C22630Arw.A00(r0)     // Catch:{ Exception -> 0x065b }
            if (r22 == 0) goto L_0x0677
            javax.security.auth.x500.X500Principal r0 = r14.getIssuerX500Principal()     // Catch:{ 91s -> 0x0708 }
            X.As7 r1 = X.C201789kO.A03(r0)     // Catch:{ 91s -> 0x0708 }
            javax.security.auth.x500.X500Principal r0 = r7.getIssuerX500Principal()     // Catch:{ 91s -> 0x0708 }
            X.As7 r0 = X.C201789kO.A03(r0)     // Catch:{ 91s -> 0x0708 }
            boolean r0 = r1.equals(r0)     // Catch:{ 91s -> 0x0708 }
            if (r0 == 0) goto L_0x0654
            X.121 r0 = X.C203669oV.A05(r6, r14)     // Catch:{ Exception -> 0x064c }
            X.Arw r0 = X.C22630Arw.A00(r0)     // Catch:{ Exception -> 0x064c }
            if (r2 != 0) goto L_0x0612
            if (r0 != 0) goto L_0x0645
            goto L_0x0618
        L_0x0612:
            boolean r0 = r2.equals(r0)     // Catch:{ 91s -> 0x0708 }
            if (r0 == 0) goto L_0x0645
        L_0x0618:
            java.lang.String r0 = A01     // Catch:{ 91s -> 0x063d }
            X.121 r1 = X.C203669oV.A05(r0, r7)     // Catch:{ 91s -> 0x063d }
            X.121 r0 = X.C203669oV.A05(r0, r14)     // Catch:{ 91s -> 0x0635 }
            if (r1 == 0) goto L_0x062e
            if (r0 == 0) goto L_0x0627
            goto L_0x066a
        L_0x0627:
            java.lang.String r0 = "Delta CRL authority key identifier is null."
            X.91s r0 = X.C1890191s.A00(r0, r9)     // Catch:{ 91s -> 0x0708 }
            throw r0     // Catch:{ 91s -> 0x0708 }
        L_0x062e:
            java.lang.String r0 = "CRL authority key identifier is null."
            X.91s r0 = X.C1890191s.A00(r0, r9)     // Catch:{ 91s -> 0x0708 }
            throw r0     // Catch:{ 91s -> 0x0708 }
        L_0x0635:
            r1 = move-exception
            java.lang.String r0 = "Authority key identifier extension could not be extracted from delta CRL."
            X.91s r0 = X.C1890191s.A00(r0, r1)     // Catch:{ 91s -> 0x0708 }
            throw r0     // Catch:{ 91s -> 0x0708 }
        L_0x063d:
            r1 = move-exception
            java.lang.String r0 = "Authority key identifier extension could not be extracted from complete CRL."
            X.91s r0 = X.C1890191s.A00(r0, r1)     // Catch:{ 91s -> 0x0708 }
            throw r0     // Catch:{ 91s -> 0x0708 }
        L_0x0645:
            java.lang.String r0 = "Issuing distribution point extension from delta CRL and complete CRL does not match."
            X.91s r0 = X.C1890191s.A00(r0, r9)     // Catch:{ 91s -> 0x0708 }
            throw r0     // Catch:{ 91s -> 0x0708 }
        L_0x064c:
            r1 = move-exception
            java.lang.String r0 = "Issuing distribution point extension from delta CRL could not be decoded."
            X.91s r0 = X.C1890191s.A00(r0, r1)     // Catch:{ 91s -> 0x0708 }
            throw r0     // Catch:{ 91s -> 0x0708 }
        L_0x0654:
            java.lang.String r0 = "Complete CRL issuer does not match delta CRL issuer."
            X.91s r0 = X.C1890191s.A00(r0, r9)     // Catch:{ 91s -> 0x0708 }
            throw r0     // Catch:{ 91s -> 0x0708 }
        L_0x065b:
            r1 = move-exception
            java.lang.String r0 = "Issuing distribution point extension could not be decoded."
            X.91s r0 = X.C1890191s.A00(r0, r1)     // Catch:{ 91s -> 0x0708 }
            throw r0     // Catch:{ 91s -> 0x0708 }
        L_0x0663:
            java.lang.String r0 = "delta CRL has unsupported critical extensions"
            X.91s r0 = X.C1890191s.A00(r0, r9)     // Catch:{ 91s -> 0x0708 }
            throw r0     // Catch:{ 91s -> 0x0708 }
        L_0x066a:
            boolean r0 = r1.A0G(r0)     // Catch:{ 91s -> 0x0708 }
            if (r0 == 0) goto L_0x06e9
            r1 = r17
            r0 = r27
            X.C203669oV.A07(r1, r14, r0, r11)     // Catch:{ 91s -> 0x0708 }
        L_0x0677:
            int r1 = r11.A00     // Catch:{ 91s -> 0x0708 }
            r0 = 11
            if (r1 != r0) goto L_0x0684
            r1 = r17
            r0 = r27
            X.C203669oV.A07(r1, r7, r0, r11)     // Catch:{ 91s -> 0x0708 }
        L_0x0684:
            int r1 = r11.A00     // Catch:{ 91s -> 0x0708 }
            r0 = 8
            if (r1 != r0) goto L_0x068e
            r0 = 11
            r11.A00 = r0     // Catch:{ 91s -> 0x0708 }
        L_0x068e:
            r0 = r39
            int r0 = r0.A00     // Catch:{ 91s -> 0x0708 }
            int r1 = r8.A00     // Catch:{ 91s -> 0x0708 }
            r1 = r1 | r0
            r0 = r39
            r0.A00 = r1     // Catch:{ 91s -> 0x0708 }
            java.util.Set r0 = r7.getCriticalExtensionOIDs()     // Catch:{ 91s -> 0x0708 }
            if (r0 == 0) goto L_0x06be
            java.util.HashSet r1 = X.C90524aI.A0k(r0)     // Catch:{ 91s -> 0x0708 }
            X.122 r0 = X.C22634As0.A0K     // Catch:{ 91s -> 0x0708 }
            java.lang.String r0 = r0.A01     // Catch:{ 91s -> 0x0708 }
            r1.remove(r0)     // Catch:{ 91s -> 0x0708 }
            X.122 r0 = X.C22634As0.A0C     // Catch:{ 91s -> 0x0708 }
            java.lang.String r0 = r0.A01     // Catch:{ 91s -> 0x0708 }
            r1.remove(r0)     // Catch:{ 91s -> 0x0708 }
            boolean r0 = r1.isEmpty()     // Catch:{ 91s -> 0x0708 }
            if (r0 != 0) goto L_0x06be
            java.lang.String r0 = "CRL contains unsupported critical extensions."
            X.91s r0 = X.C1890191s.A00(r0, r9)     // Catch:{ 91s -> 0x0708 }
            throw r0     // Catch:{ 91s -> 0x0708 }
        L_0x06be:
            if (r14 == 0) goto L_0x06e5
            java.util.Set r0 = r14.getCriticalExtensionOIDs()     // Catch:{ 91s -> 0x0708 }
            if (r0 == 0) goto L_0x06e5
            java.util.HashSet r1 = X.C90524aI.A0k(r0)     // Catch:{ 91s -> 0x0708 }
            X.122 r0 = X.C22634As0.A0K     // Catch:{ 91s -> 0x0708 }
            java.lang.String r0 = r0.A01     // Catch:{ 91s -> 0x0708 }
            r1.remove(r0)     // Catch:{ 91s -> 0x0708 }
            X.122 r0 = X.C22634As0.A0C     // Catch:{ 91s -> 0x0708 }
            java.lang.String r0 = r0.A01     // Catch:{ 91s -> 0x0708 }
            r1.remove(r0)     // Catch:{ 91s -> 0x0708 }
            boolean r0 = r1.isEmpty()     // Catch:{ 91s -> 0x0708 }
            if (r0 != 0) goto L_0x06e5
            java.lang.String r0 = "Delta CRL contains unsupported critical extension."
            X.91s r0 = X.C1890191s.A00(r0, r9)     // Catch:{ 91s -> 0x0708 }
            throw r0     // Catch:{ 91s -> 0x0708 }
        L_0x06e5:
            r18 = 1
            goto L_0x00e9
        L_0x06e9:
            java.lang.String r0 = "Delta CRL authority key identifier does not match complete CRL authority key identifier."
            X.91s r0 = X.C1890191s.A00(r0, r9)     // Catch:{ 91s -> 0x0708 }
            throw r0     // Catch:{ 91s -> 0x0708 }
        L_0x06f0:
            r1 = move-exception
            java.lang.String r0 = "Issuing distribution point extension could not be decoded."
            X.91s r0 = X.C1890191s.A00(r0, r1)     // Catch:{ 91s -> 0x0708 }
            throw r0     // Catch:{ 91s -> 0x0708 }
        L_0x06f8:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 91s -> 0x0708 }
            java.lang.String r0 = "Exception encoding CRL issuer: "
            java.lang.String r0 = X.C36331k8.A0i(r0, r1, r2)     // Catch:{ 91s -> 0x0708 }
            X.91s r0 = X.C1890191s.A00(r0, r2)     // Catch:{ 91s -> 0x0708 }
            throw r0     // Catch:{ 91s -> 0x0708 }
        L_0x0708:
            r23 = move-exception
            goto L_0x00e9
        L_0x070b:
            r23 = move-exception
            goto L_0x00e9
        L_0x070e:
            java.lang.String r0 = "Cannot verify CRL."
            X.91s r0 = X.C1890191s.A00(r0, r1)     // Catch:{ 91s -> 0x072a }
            throw r0     // Catch:{ 91s -> 0x072a }
        L_0x0715:
            r1 = move-exception
            java.lang.String r0 = "Issuer certificate for CRL cannot be searched."
            X.91s r0 = X.C1890191s.A00(r0, r1)     // Catch:{ 91s -> 0x072a }
            throw r0     // Catch:{ 91s -> 0x072a }
        L_0x071d:
            java.lang.IllegalStateException r0 = X.C165617ti.A0V()     // Catch:{ IOException -> 0x0722 }
            throw r0     // Catch:{ IOException -> 0x0722 }
        L_0x0722:
            r1 = move-exception
            java.lang.String r0 = "Subject criteria for certificate selector to find issuer certificate for CRL could not be set."
            X.91s r0 = X.C1890191s.A00(r0, r1)     // Catch:{ 91s -> 0x072a }
            throw r0     // Catch:{ 91s -> 0x072a }
        L_0x072a:
            r23 = move-exception
            goto L_0x00e9
        L_0x072d:
            r1 = move-exception
            java.lang.String r0 = "Issuing distribution point extension could not be decoded."
            X.91s r0 = X.C1890191s.A00(r0, r1)     // Catch:{ 91s -> 0x0735 }
            throw r0     // Catch:{ 91s -> 0x0735 }
        L_0x0735:
            r23 = move-exception
            goto L_0x00e9
        L_0x0738:
            if (r18 == 0) goto L_0x075a
            return
        L_0x073b:
            java.lang.String r1 = "CRL issuer is omitted from distribution point but no distributionPoint field present."
            r0 = 0
            X.91s r0 = X.C1890191s.A00(r1, r0)     // Catch:{ 91s -> 0x074b }
            goto L_0x074a
        L_0x0743:
            r1 = move-exception
            java.lang.String r0 = "CRL issuer information from distribution point cannot be decoded."
            X.91s r0 = X.C1890191s.A00(r0, r1)     // Catch:{ 91s -> 0x074b }
        L_0x074a:
            throw r0     // Catch:{ 91s -> 0x074b }
        L_0x074b:
            r1 = move-exception
            java.lang.String r0 = "Could not get issuer information from distribution point."
            X.91s r0 = X.C1890191s.A00(r0, r1)
            throw r0
        L_0x0753:
            java.lang.String r1 = "Validation time is in future."
            r0 = 0
            X.91s r23 = X.C1890191s.A00(r1, r0)
        L_0x075a:
            throw r23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203789os.A0B(java.security.PublicKey, java.security.cert.X509Certificate, java.security.cert.X509Certificate, java.util.Date, java.util.Date, java.util.List, X.Arv, X.9NL, X.AXM, X.Awt, X.9Ih, X.9kn):void");
    }
}
