package X;

import java.util.Date;

/* renamed from: X.AaF  reason: case insensitive filesystem */
public class C21782AaF implements B20 {
    public Date A00 = null;
    public AnonymousClass9NL A01;
    public final C22844Awt A02;

    public C21782AaF(C22844Awt awt) {
        this.A02 = awt;
    }

    public void BKg(AnonymousClass9NL r2) {
        this.A01 = r2;
        this.A00 = new Date();
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0184 A[Catch:{ 91s -> 0x01ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0173 A[Catch:{ 91s -> 0x01ef }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void check(java.security.cert.Certificate r31) {
        /*
            r30 = this;
            r11 = r31
            r10 = r30
            X.9NL r9 = r10.A01     // Catch:{ 91s -> 0x01ef }
            X.AXM r8 = r9.A05     // Catch:{ 91s -> 0x01ef }
            java.util.Date r0 = r10.A00     // Catch:{ 91s -> 0x01ef }
            r21 = r0
            java.util.Date r0 = r9.A04     // Catch:{ 91s -> 0x01ef }
            long r0 = r0.getTime()     // Catch:{ 91s -> 0x01ef }
            java.util.Date r7 = new java.util.Date     // Catch:{ 91s -> 0x01ef }
            r7.<init>(r0)     // Catch:{ 91s -> 0x01ef }
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11     // Catch:{ 91s -> 0x01ef }
            X.9NL r1 = r10.A01     // Catch:{ 91s -> 0x01ef }
            java.security.cert.X509Certificate r0 = r1.A03     // Catch:{ 91s -> 0x01ef }
            r20 = r0
            java.security.PublicKey r0 = r1.A01     // Catch:{ 91s -> 0x01ef }
            r18 = r0
            java.security.cert.CertPath r0 = r1.A02     // Catch:{ 91s -> 0x01ef }
            java.util.List r23 = r0.getCertificates()     // Catch:{ 91s -> 0x01ef }
            X.Awt r0 = r10.A02     // Catch:{ 91s -> 0x01ef }
            r17 = r0
            java.lang.String r0 = X.C203789os.A04     // Catch:{ Exception -> 0x01e0 }
            X.121 r0 = X.C203669oV.A05(r0, r11)     // Catch:{ Exception -> 0x01e0 }
            X.Arn r16 = X.C22621Arn.A00(r0)     // Catch:{ Exception -> 0x01e0 }
            X.9dA r14 = new X.9dA     // Catch:{ 91s -> 0x01ef }
            r14.<init>((X.AXM) r8)     // Catch:{ 91s -> 0x01ef }
            java.util.Map r3 = r8.A06     // Catch:{ 91s -> 0x01d8 }
            if (r16 != 0) goto L_0x0056
            java.util.List r13 = java.util.Collections.EMPTY_LIST     // Catch:{ 91s -> 0x01d8 }
        L_0x0042:
            java.util.Iterator r2 = r13.iterator()     // Catch:{ 91s -> 0x01d8 }
        L_0x0046:
            boolean r0 = r2.hasNext()     // Catch:{ 91s -> 0x01d8 }
            if (r0 == 0) goto L_0x00da
            java.lang.Object r1 = r2.next()     // Catch:{ 91s -> 0x01d8 }
            java.util.List r0 = r14.A01     // Catch:{ 91s -> 0x01d8 }
            r0.add(r1)     // Catch:{ 91s -> 0x01d8 }
            goto L_0x0046
        L_0x0056:
            X.Arv[] r12 = r16.A0A()     // Catch:{ Exception -> 0x01c0 }
            java.util.ArrayList r13 = X.AnonymousClass001.A0I()     // Catch:{ 91s -> 0x01d8 }
            r2 = 0
        L_0x005f:
            int r6 = r12.length     // Catch:{ 91s -> 0x01d8 }
            if (r2 >= r6) goto L_0x0087
            r0 = r12[r2]     // Catch:{ 91s -> 0x01d8 }
            X.As4 r1 = r0.A00     // Catch:{ 91s -> 0x01d8 }
            if (r1 == 0) goto L_0x0084
            int r0 = r1.A00     // Catch:{ 91s -> 0x01d8 }
            if (r0 != 0) goto L_0x0084
            X.11z r0 = r1.A01     // Catch:{ 91s -> 0x01d8 }
            X.As6[] r4 = X.C22631Arx.A00(r0)     // Catch:{ 91s -> 0x01d8 }
            r1 = 0
        L_0x0073:
            int r0 = r4.length     // Catch:{ 91s -> 0x01d8 }
            if (r1 >= r0) goto L_0x0084
            r0 = r4[r1]     // Catch:{ 91s -> 0x01d8 }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ 91s -> 0x01d8 }
            if (r0 == 0) goto L_0x0081
            r13.add(r0)     // Catch:{ 91s -> 0x01d8 }
        L_0x0081:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x0084:
            int r2 = r2 + 1
            goto L_0x005f
        L_0x0087:
            boolean r0 = r13.isEmpty()     // Catch:{ 91s -> 0x01d8 }
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = "org.spongycastle.x509.enableCRLDP"
            boolean r0 = X.C200679hw.A01(r0)     // Catch:{ 91s -> 0x01d8 }
            if (r0 == 0) goto L_0x0042
            java.lang.String r1 = "X.509"
            r0 = r17
            X.AaJ r0 = (X.C21786AaJ) r0     // Catch:{ Exception -> 0x01c8 }
            java.security.Provider r0 = r0.A00     // Catch:{ Exception -> 0x01c8 }
            java.security.cert.CertificateFactory r15 = java.security.cert.CertificateFactory.getInstance(r1, r0)     // Catch:{ Exception -> 0x01c8 }
            r5 = 0
        L_0x00a2:
            if (r5 >= r6) goto L_0x0042
            r0 = r12[r5]     // Catch:{ 91s -> 0x01d8 }
            X.As4 r1 = r0.A00     // Catch:{ 91s -> 0x01d8 }
            if (r1 == 0) goto L_0x00d7
            int r0 = r1.A00     // Catch:{ 91s -> 0x01d8 }
            if (r0 != 0) goto L_0x00d7
            X.11z r0 = r1.A01     // Catch:{ 91s -> 0x01d8 }
            X.As6[] r4 = X.C22631Arx.A00(r0)     // Catch:{ 91s -> 0x01d8 }
            r3 = 0
        L_0x00b5:
            int r0 = r4.length     // Catch:{ 91s -> 0x01d8 }
            if (r3 >= r0) goto L_0x00d7
            r2 = r4[r5]     // Catch:{ 91s -> 0x01d8 }
            int r1 = r2.A00     // Catch:{ 91s -> 0x01d8 }
            r0 = 6
            if (r1 != r0) goto L_0x00d4
            X.11z r0 = r2.A01     // Catch:{ Exception -> 0x00d4 }
            X.B0I r0 = (X.B0I) r0     // Catch:{ Exception -> 0x00d4 }
            java.lang.String r1 = r0.BHz()     // Catch:{ Exception -> 0x00d4 }
            java.net.URI r0 = new java.net.URI     // Catch:{ Exception -> 0x00d4 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00d4 }
            X.AUz r0 = X.C201859kZ.A01(r0, r15, r7)     // Catch:{ Exception -> 0x00d4 }
            r13.add(r0)     // Catch:{ Exception -> 0x00d4 }
            goto L_0x00d7
        L_0x00d4:
            int r3 = r3 + 1
            goto L_0x00b5
        L_0x00d7:
            int r5 = r5 + 1
            goto L_0x00a2
        L_0x00da:
            X.9Ih r3 = new X.9Ih     // Catch:{ 91s -> 0x01ef }
            r3.<init>()     // Catch:{ 91s -> 0x01ef }
            r0 = 0
            X.9kn r2 = new X.9kn     // Catch:{ 91s -> 0x01ef }
            r2.<init>((int) r0)     // Catch:{ 91s -> 0x01ef }
            X.AXM r6 = new X.AXM     // Catch:{ 91s -> 0x01ef }
            r6.<init>(r14)     // Catch:{ 91s -> 0x01ef }
            r5 = 0
            r4 = 11
            if (r16 == 0) goto L_0x0127
            X.Arv[] r12 = r16.A0A()     // Catch:{ Exception -> 0x011e }
            r1 = 0
            r14 = 0
        L_0x00f5:
            int r0 = r12.length     // Catch:{ 91s -> 0x01ef }
            if (r1 >= r0) goto L_0x0128
            int r0 = r3.A00     // Catch:{ 91s -> 0x01ef }
            if (r0 != r4) goto L_0x0128
            int r13 = r2.A00     // Catch:{ 91s -> 0x01ef }
            X.9kn r0 = X.C201969kn.A01     // Catch:{ 91s -> 0x01ef }
            int r0 = r0.A00     // Catch:{ 91s -> 0x01ef }
            if (r13 == r0) goto L_0x0128
            r24 = r12[r1]     // Catch:{ 91s -> 0x0118 }
            r22 = r7
            r25 = r9
            r26 = r6
            r27 = r17
            r28 = r3
            r29 = r2
            r19 = r11
            X.C203789os.A0B(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ 91s -> 0x0118 }
            goto L_0x011a
        L_0x0118:
            r5 = move-exception
            goto L_0x011b
        L_0x011a:
            r14 = 1
        L_0x011b:
            int r1 = r1 + 1
            goto L_0x00f5
        L_0x011e:
            r1 = move-exception
            java.lang.String r0 = "Distribution points could not be read."
            X.91s r0 = X.C1890191s.A00(r0, r1)     // Catch:{ 91s -> 0x01ef }
            goto L_0x01ee
        L_0x0127:
            r14 = 0
        L_0x0128:
            int r0 = r3.A00     // Catch:{ 91s -> 0x01ef }
            if (r0 != r4) goto L_0x016a
            int r1 = r2.A00     // Catch:{ 91s -> 0x01ef }
            X.9kn r0 = X.C201969kn.A01     // Catch:{ 91s -> 0x01ef }
            int r0 = r0.A00     // Catch:{ 91s -> 0x01ef }
            if (r1 == r0) goto L_0x016a
            X.As7 r5 = X.C201789kO.A01(r11)     // Catch:{ RuntimeException -> 0x0161 }
            r0 = 4
            X.As6 r1 = new X.As6     // Catch:{ 91s -> 0x0169 }
            r1.<init>(r5, r0)     // Catch:{ 91s -> 0x0169 }
            X.Arx r0 = new X.Arx     // Catch:{ 91s -> 0x0169 }
            r0.<init>((X.C22640As6) r1)     // Catch:{ 91s -> 0x0169 }
            X.As4 r1 = new X.As4     // Catch:{ 91s -> 0x0169 }
            r1.<init>((X.C219411z) r0)     // Catch:{ 91s -> 0x0169 }
            X.Arv r0 = new X.Arv     // Catch:{ 91s -> 0x0169 }
            r0.<init>((X.C22638As4) r1)     // Catch:{ 91s -> 0x0169 }
            r22 = r7
            r24 = r0
            r25 = r9
            r26 = r8
            r27 = r17
            r28 = r3
            r29 = r2
            r19 = r11
            X.C203789os.A0B(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ 91s -> 0x0169 }
            goto L_0x016f
        L_0x0161:
            r1 = move-exception
            java.lang.String r0 = "Issuer from certificate for CRL could not be reencoded."
            X.91s r0 = X.C1890191s.A00(r0, r1)     // Catch:{ 91s -> 0x0169 }
            throw r0     // Catch:{ 91s -> 0x0169 }
        L_0x0169:
            r5 = move-exception
        L_0x016a:
            if (r14 != 0) goto L_0x016f
            if (r5 != 0) goto L_0x0183
            goto L_0x01e8
        L_0x016f:
            int r0 = r3.A00     // Catch:{ 91s -> 0x01ef }
            if (r0 != r4) goto L_0x0184
            int r1 = r2.A00     // Catch:{ 91s -> 0x01ef }
            X.9kn r0 = X.C201969kn.A01     // Catch:{ 91s -> 0x01ef }
            int r0 = r0.A00     // Catch:{ 91s -> 0x01ef }
            if (r1 != r0) goto L_0x017c
            return
        L_0x017c:
            java.lang.String r1 = "Certificate status could not be determined."
            r0 = 0
            X.91s r5 = X.C1890191s.A00(r1, r0)     // Catch:{ 91s -> 0x01ef }
        L_0x0183:
            throw r5     // Catch:{ 91s -> 0x01ef }
        L_0x0184:
            java.lang.String r0 = "yyyy-MM-dd HH:mm:ss Z"
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch:{ 91s -> 0x01ef }
            r2.<init>(r0)     // Catch:{ 91s -> 0x01ef }
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)     // Catch:{ 91s -> 0x01ef }
            r2.setTimeZone(r0)     // Catch:{ 91s -> 0x01ef }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 91s -> 0x01ef }
            java.lang.String r0 = "Certificate revocation after "
            r1.append(r0)     // Catch:{ 91s -> 0x01ef }
            java.util.Date r0 = r3.A01     // Catch:{ 91s -> 0x01ef }
            java.lang.String r0 = r2.format(r0)     // Catch:{ 91s -> 0x01ef }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ 91s -> 0x01ef }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0v(r0)     // Catch:{ 91s -> 0x01ef }
            java.lang.String r0 = ", reason: "
            r2.append(r0)     // Catch:{ 91s -> 0x01ef }
            java.lang.String[] r1 = X.C203789os.A0D     // Catch:{ 91s -> 0x01ef }
            int r0 = r3.A00     // Catch:{ 91s -> 0x01ef }
            r0 = r1[r0]     // Catch:{ 91s -> 0x01ef }
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r2)     // Catch:{ 91s -> 0x01ef }
            r0 = 0
            X.91s r0 = X.C1890191s.A00(r1, r0)     // Catch:{ 91s -> 0x01ef }
            goto L_0x01ee
        L_0x01c0:
            r1 = move-exception
            java.lang.String r0 = "Distribution points could not be read."
            X.91s r0 = X.C1890191s.A00(r0, r1)     // Catch:{ 91s -> 0x01d8 }
            goto L_0x01d7
        L_0x01c8:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 91s -> 0x01d8 }
            java.lang.String r0 = "cannot create certificate factory: "
            java.lang.String r0 = X.C36331k8.A0i(r0, r1, r2)     // Catch:{ 91s -> 0x01d8 }
            X.91s r0 = X.C1890191s.A00(r0, r2)     // Catch:{ 91s -> 0x01d8 }
        L_0x01d7:
            throw r0     // Catch:{ 91s -> 0x01d8 }
        L_0x01d8:
            r1 = move-exception
            java.lang.String r0 = "No additional CRL locations could be decoded from CRL distribution point extension."
            X.91s r0 = X.C1890191s.A00(r0, r1)     // Catch:{ 91s -> 0x01ef }
            goto L_0x01ee
        L_0x01e0:
            r1 = move-exception
            java.lang.String r0 = "CRL distribution point extension could not be read."
            X.91s r0 = X.C1890191s.A00(r0, r1)     // Catch:{ 91s -> 0x01ef }
            goto L_0x01ee
        L_0x01e8:
            java.lang.String r0 = "No valid CRL found."
            X.91s r0 = X.C1890191s.A00(r0, r5)     // Catch:{ 91s -> 0x01ef }
        L_0x01ee:
            throw r0     // Catch:{ 91s -> 0x01ef }
        L_0x01ef:
            r0 = move-exception
            java.lang.Throwable r2 = r0._underlyingException
            if (r2 != 0) goto L_0x01f5
            r2 = r0
        L_0x01f5:
            java.lang.String r1 = r0.getMessage()
            X.9NL r0 = r10.A01
            java.security.cert.CertPathValidatorException r0 = X.AnonymousClass9NL.A00(r1, r2, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21782AaF.check(java.security.cert.Certificate):void");
    }
}
