package com.whatsapp.payments;

import X.AnonymousClass000;
import X.AnonymousClass16U;
import X.AnonymousClass16V;
import X.B66;
import X.C19460v5;
import X.C198699e3;
import X.C202159l8;
import X.C24631De;
import X.C24641Df;
import X.C36321k7;
import com.whatsapp.util.Log;

public class PaymentConfiguration {
    public C198699e3 A00;
    public final C19460v5 A01;
    public final C24631De A02;
    public final C24641Df A03;

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0091, code lost:
        X.C36321k7.A1P("PAY: PaymentConfigurationMap/getPaymentFactory/unmapped factory for country code=", r3, X.AnonymousClass000.A0u());
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c6, code lost:
        if (r3.equals(r0) == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        r3 = new X.C178598gn();
        r0 = r6.get(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if ("UNSET".equalsIgnoreCase(r3) != false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0179, code lost:
        r0 = java.util.Collections.singleton(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x018d, code lost:
        r0 = (X.AnonymousClass004) r0;
        java.util.Objects.requireNonNull(r0);
        r4 = r0.get();
        r0 = java.util.Arrays.asList(new java.lang.String[]{"USD", "PEN", "COP", "ARS", "CLP", "IDR", "ILS", "AED", "TRY", "HKD", "MXN"});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b4, code lost:
        r7 = X.C90524aI.A0k(r0).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c0, code lost:
        if (r7.hasNext() == false) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01c2, code lost:
        r6 = X.AnonymousClass001.A0C(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ca, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01cc, code lost:
        r3.A00.put(X.C165617ti.A0Z(r6), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01d6, code lost:
        r1.A01.add(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C198699e3 A00(java.lang.String r18) {
        /*
            r17 = this;
            r3 = r18
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r16 = 0
            r2 = r17
            if (r0 != 0) goto L_0x0016
            X.9l8 r0 = X.C202159l8.A0E
            java.lang.String r0 = "UNSET"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x0032
        L_0x0016:
            X.1De r0 = r2.A02
            X.9l8 r3 = r0.A02()
            if (r3 != 0) goto L_0x0024
            java.lang.String r0 = "PAY: PaymentConfiguration/initializeFactory/null country code/null default country"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r16
        L_0x0024:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: PaymentConfiguration/initializeFactory/null country code/default country code="
            r1.append(r0)
            java.lang.String r3 = r3.A03
            X.C36321k7.A1Z(r1, r3)
        L_0x0032:
            X.9e3 r1 = r2.A00
            if (r1 == 0) goto L_0x003e
            java.lang.String r0 = r1.A00
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L_0x01dd
        L_0x003e:
            X.0v5 r0 = r2.A01
            java.lang.Object r1 = r0.A02()
            X.9F1 r1 = (X.AnonymousClass9F1) r1
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = "PAY: PaymentConfigurationMap/getPaymentFactory/empty country code"
        L_0x004e:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r1 = r16
        L_0x0053:
            r2.A00 = r1
            if (r1 != 0) goto L_0x01dd
            return r16
        L_0x0058:
            java.lang.String r3 = X.C165617ti.A0Z(r3)
            java.util.Map r6 = r1.A00
            boolean r0 = r6.containsKey(r3)
            if (r0 != 0) goto L_0x006f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: PaymentConfigurationMap/getPaymentFactory/unmapped factory for country code="
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r3, r1)
            goto L_0x004e
        L_0x006f:
            X.9e3 r1 = new X.9e3
            r1.<init>(r3)
            int r15 = r3.hashCode()
            java.lang.String r14 = "MX"
            java.lang.String r13 = "IN"
            java.lang.String r12 = "IL"
            java.lang.String r11 = "ID"
            java.lang.String r10 = "HK"
            java.lang.String r9 = "EC"
            java.lang.String r8 = "CO"
            java.lang.String r7 = "CL"
            java.lang.String r5 = "BR"
            java.lang.String r0 = "AR"
            java.lang.String r4 = "AE"
            switch(r15) {
                case 2084: goto L_0x017e;
                case 2097: goto L_0x00c2;
                case 2128: goto L_0x015f;
                case 2153: goto L_0x014f;
                case 2156: goto L_0x013f;
                case 2206: goto L_0x012f;
                case 2307: goto L_0x011f;
                case 2331: goto L_0x010f;
                case 2339: goto L_0x00ff;
                case 2341: goto L_0x00e4;
                case 2475: goto L_0x00d3;
                case 2549: goto L_0x00c0;
                case 2644: goto L_0x00a2;
                case 2686: goto L_0x009f;
                case 2718: goto L_0x009c;
                default: goto L_0x0091;
            }
        L_0x0091:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: PaymentConfigurationMap/getPaymentFactory/unmapped factory for country code="
            X.C36321k7.A1P(r0, r3, r1)
            r1 = 0
            goto L_0x0053
        L_0x009c:
            java.lang.String r0 = "US"
            goto L_0x00c2
        L_0x009f:
            java.lang.String r0 = "TR"
            goto L_0x00c2
        L_0x00a2:
            java.lang.String r4 = "SG"
            boolean r0 = r3.equals(r4)
            if (r0 == 0) goto L_0x0091
            X.8gp r3 = new X.8gp
            r3.<init>()
            java.lang.Object r0 = r6.get(r4)
            X.004 r0 = (X.AnonymousClass004) r0
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r4 = r0.get()
            java.lang.String r0 = "SGD"
            goto L_0x0179
        L_0x00c0:
            java.lang.String r0 = "PE"
        L_0x00c2:
            boolean r4 = r3.equals(r0)
            if (r4 == 0) goto L_0x0091
            X.8gn r3 = new X.8gn
            r3.<init>()
            java.lang.Object r0 = r6.get(r0)
            goto L_0x018d
        L_0x00d3:
            boolean r0 = r3.equals(r14)
            if (r0 == 0) goto L_0x0091
            X.8gn r3 = new X.8gn
            r3.<init>()
            java.lang.Object r0 = r6.get(r14)
            goto L_0x018d
        L_0x00e4:
            boolean r0 = r3.equals(r13)
            if (r0 == 0) goto L_0x0091
            X.8go r3 = new X.8go
            r3.<init>()
            java.lang.Object r0 = r6.get(r13)
            X.004 r0 = (X.AnonymousClass004) r0
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r4 = r0.get()
            java.lang.String r0 = "INR"
            goto L_0x0179
        L_0x00ff:
            boolean r0 = r3.equals(r12)
            if (r0 == 0) goto L_0x0091
            X.8gn r3 = new X.8gn
            r3.<init>()
            java.lang.Object r0 = r6.get(r12)
            goto L_0x018d
        L_0x010f:
            boolean r0 = r3.equals(r11)
            if (r0 == 0) goto L_0x0091
            X.8gn r3 = new X.8gn
            r3.<init>()
            java.lang.Object r0 = r6.get(r11)
            goto L_0x018d
        L_0x011f:
            boolean r0 = r3.equals(r10)
            if (r0 == 0) goto L_0x0091
            X.8gn r3 = new X.8gn
            r3.<init>()
            java.lang.Object r0 = r6.get(r10)
            goto L_0x018d
        L_0x012f:
            boolean r0 = r3.equals(r9)
            if (r0 == 0) goto L_0x0091
            X.8gn r3 = new X.8gn
            r3.<init>()
            java.lang.Object r0 = r6.get(r9)
            goto L_0x018d
        L_0x013f:
            boolean r0 = r3.equals(r8)
            if (r0 == 0) goto L_0x0091
            X.8gn r3 = new X.8gn
            r3.<init>()
            java.lang.Object r0 = r6.get(r8)
            goto L_0x018d
        L_0x014f:
            boolean r0 = r3.equals(r7)
            if (r0 == 0) goto L_0x0091
            X.8gn r3 = new X.8gn
            r3.<init>()
            java.lang.Object r0 = r6.get(r7)
            goto L_0x018d
        L_0x015f:
            boolean r0 = r3.equals(r5)
            if (r0 == 0) goto L_0x0091
            X.8gm r3 = new X.8gm
            r3.<init>()
            java.lang.Object r0 = r6.get(r5)
            X.004 r0 = (X.AnonymousClass004) r0
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r4 = r0.get()
            java.lang.String r0 = "BRL"
        L_0x0179:
            java.util.Set r0 = java.util.Collections.singleton(r0)
            goto L_0x01b4
        L_0x017e:
            boolean r0 = r3.equals(r4)
            if (r0 == 0) goto L_0x0091
            X.8gn r3 = new X.8gn
            r3.<init>()
            java.lang.Object r0 = r6.get(r4)
        L_0x018d:
            X.004 r0 = (X.AnonymousClass004) r0
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r4 = r0.get()
            java.lang.String r5 = "USD"
            java.lang.String r6 = "PEN"
            java.lang.String r7 = "COP"
            java.lang.String r8 = "ARS"
            java.lang.String r9 = "CLP"
            java.lang.String r10 = "IDR"
            java.lang.String r11 = "ILS"
            java.lang.String r12 = "AED"
            java.lang.String r13 = "TRY"
            java.lang.String r14 = "HKD"
            java.lang.String r15 = "MXN"
            java.lang.String[] r0 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15}
            java.util.List r0 = java.util.Arrays.asList(r0)
        L_0x01b4:
            java.util.HashSet r0 = X.C90524aI.A0k(r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x01bc:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x01d6
            java.lang.String r6 = X.AnonymousClass001.A0C(r7)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x01bc
            java.util.Map r5 = r3.A00
            java.lang.String r0 = X.C165617ti.A0Z(r6)
            r5.put(r0, r4)
            goto L_0x01bc
        L_0x01d6:
            java.util.List r0 = r1.A01
            r0.add(r3)
            goto L_0x0053
        L_0x01dd:
            X.971 r6 = new X.971
            r6.<init>()
            java.util.List r0 = r1.A01
            java.util.Iterator r5 = r0.iterator()
        L_0x01e8:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0218
            java.lang.Object r0 = r5.next()
            X.9F5 r0 = (X.AnonymousClass9F5) r0
            java.util.Map r4 = r0.A00
            java.util.Iterator r3 = X.AnonymousClass000.A0y(r4)
        L_0x01fa:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01e8
            java.util.Map$Entry r1 = X.AnonymousClass000.A11(r3)
            java.lang.Object r0 = r1.getKey()
            java.lang.Object r0 = r4.get(r0)
            X.B66 r0 = (X.B66) r0
            boolean r0 = r0.BNg(r6)
            if (r0 != 0) goto L_0x01fa
            r4.remove(r1)
            goto L_0x01fa
        L_0x0218:
            X.9e3 r0 = r2.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.PaymentConfiguration.A00(java.lang.String):X.9e3");
    }

    public B66 A01() {
        String str;
        C24631De r1 = this.A02;
        C202159l8 A022 = r1.A02();
        if (A022 == null) {
            Log.e("PAY: PaymentConfiguration/getService/null country");
        } else {
            String str2 = A022.A03;
            C198699e3 A002 = A00(str2);
            AnonymousClass16U A012 = r1.A01();
            if (A012 != null) {
                str = ((AnonymousClass16V) A012).A02;
            } else {
                str = null;
            }
            C36321k7.A1P("PAY: PaymentConfiguration/getService/defaulted to countryCode=", str2, AnonymousClass000.A0u());
            if (A002 != null) {
                return A002.A01(str);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01ae, code lost:
        if (r12.equals(r0) != false) goto L_0x03f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01eb, code lost:
        if (r12.equals(r0) != false) goto L_0x03fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        com.whatsapp.util.Log.e("PAY: PaymentConfigurationMap/getPaymentService/currency set/unmapped service for currency");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0228, code lost:
        if (r12.equals(r0) != false) goto L_0x0403;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0265, code lost:
        if (r12.equals(r0) != false) goto L_0x0409;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x02a5, code lost:
        if (r12.equals(r0) != false) goto L_0x040f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        r2 = X.AnonymousClass000.A0u();
        r2.append("PAY: PaymentConfigurationMap/getPaymentService/country=");
        r2.append(r1);
        X.C36321k7.A1Z(r2, "/unmapped service");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x02e2, code lost:
        if (r12.equals(r0) != false) goto L_0x0415;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x02ec, code lost:
        if (r1.equals(r3) != false) goto L_0x03df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0329, code lost:
        if (r12.equals(r0) != false) goto L_0x041a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0371, code lost:
        if (r12.equals(r0) == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0377, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x041f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x037d, code lost:
        switch(r1.hashCode()) {
            case 2084: goto L_0x038b;
            case 2097: goto L_0x0392;
            case 2153: goto L_0x0399;
            case 2156: goto L_0x03a0;
            case 2206: goto L_0x03a7;
            case 2307: goto L_0x03ae;
            case 2331: goto L_0x03b5;
            case 2339: goto L_0x03bc;
            case 2475: goto L_0x03c3;
            case 2549: goto L_0x03ca;
            case 2686: goto L_0x03d1;
            case 2718: goto L_0x03d8;
            default: goto L_0x0380;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0380, code lost:
        r2 = X.AnonymousClass000.A0u();
        r2.append("PAY: PaymentConfigurationMap/getPaymentService/currency set/unmapped service for country=");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x038f, code lost:
        if (r1.equals(r3) != false) goto L_0x03df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0396, code lost:
        if (r1.equals("AR") != false) goto L_0x03e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x039d, code lost:
        if (r1.equals("CL") != false) goto L_0x03eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x03a4, code lost:
        if (r1.equals("CO") != false) goto L_0x03f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x03ab, code lost:
        if (r1.equals("EC") != false) goto L_0x03f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x03b2, code lost:
        if (r1.equals("HK") != false) goto L_0x03fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x03b9, code lost:
        if (r1.equals("ID") != false) goto L_0x0403;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x03c0, code lost:
        if (r1.equals("IL") != false) goto L_0x0409;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x03c7, code lost:
        if (r1.equals("MX") != false) goto L_0x040f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x03ce, code lost:
        if (r1.equals("PE") != false) goto L_0x0415;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x03d5, code lost:
        if (r1.equals("TR") != false) goto L_0x041a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x03dc, code lost:
        if (r1.equals("US") != false) goto L_0x0482;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x03df, code lost:
        r0 = r2.get(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x03e5, code lost:
        r0 = r2.get("AR");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x03eb, code lost:
        r0 = r2.get("CL");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x03f1, code lost:
        r0 = r2.get("CO");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x03f7, code lost:
        r0 = r2.get("EC");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x03fd, code lost:
        r0 = r2.get("HK");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0403, code lost:
        r0 = r2.get("ID");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0409, code lost:
        r0 = r2.get("IL");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x040f, code lost:
        r0 = r2.get("MX");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0415, code lost:
        r0 = r2.get("PE");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x041a, code lost:
        r0 = r2.get("TR");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x041f, code lost:
        r0 = "PAY: PaymentConfigurationMap/getPaymentService/currency set/requires country but is empty";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0435, code lost:
        r2 = X.AnonymousClass000.A0u();
        r2.append("PAY: PaymentConfigurationMap/getPaymentService/country=");
        r2.append(r1);
        r1 = "/unmapped service for currency";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0443, code lost:
        r0 = X.AnonymousClass000.A0q(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0447, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x044b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0470, code lost:
        if (r12.equals(r0) == false) goto L_0x0435;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0473, code lost:
        r2 = X.AnonymousClass000.A0u();
        r2.append("PAY: PaymentConfigurationMap/getPaymentService/country=");
        r2.append(r1);
        r1 = "/requires currency but is empty";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0482, code lost:
        r0 = r2.get("US");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0495, code lost:
        r0 = (X.AnonymousClass004) r0;
        java.util.Objects.requireNonNull(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x04a0, code lost:
        return (X.B66) r0.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b6, code lost:
        if (r12.equals(r0) != false) goto L_0x03df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f3, code lost:
        if (r12.equals(r0) != false) goto L_0x03e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0134, code lost:
        if (r12.equals(r0) != false) goto L_0x03eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0171, code lost:
        if (r12.equals(r0) != false) goto L_0x03f1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.B66 A02(java.lang.String r17, java.lang.String r18) {
        /*
            r16 = this;
            r1 = r17
            r12 = r18
            r0 = r16
            X.0v5 r0 = r0.A01
            java.lang.Object r0 = r0.A02()
            X.9F1 r0 = (X.AnonymousClass9F1) r0
            if (r17 == 0) goto L_0x0014
            java.lang.String r1 = X.C165617ti.A0Z(r1)
        L_0x0014:
            java.util.Map r2 = r0.A00
            boolean r3 = r2.containsKey(r1)
            r0 = 0
            if (r3 != 0) goto L_0x002b
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "PAY: PaymentConfigurationMap/getPaymentFactory/unmapped service for country code="
            java.lang.String r1 = X.AnonymousClass000.A0p(r2, r1, r3)
        L_0x0027:
            com.whatsapp.util.Log.e((java.lang.String) r1)
            return r0
        L_0x002b:
            if (r18 == 0) goto L_0x0031
            java.lang.String r12 = X.C165617ti.A0Z(r12)
        L_0x0031:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            java.lang.String r11 = "US"
            java.lang.String r15 = "TR"
            java.lang.String r14 = "PE"
            java.lang.String r13 = "MX"
            java.lang.String r10 = "IL"
            java.lang.String r9 = "ID"
            java.lang.String r8 = "HK"
            java.lang.String r7 = "EC"
            java.lang.String r6 = "CO"
            java.lang.String r5 = "CL"
            java.lang.String r4 = "AR"
            java.lang.String r3 = "AE"
            if (r0 != 0) goto L_0x005b
            int r0 = r12.hashCode()
            switch(r0) {
                case 64672: goto L_0x033d;
                case 65090: goto L_0x0340;
                case 66044: goto L_0x032d;
                case 66823: goto L_0x0343;
                case 66916: goto L_0x0346;
                case 71585: goto L_0x0349;
                case 72343: goto L_0x034c;
                case 72592: goto L_0x034f;
                case 72653: goto L_0x0352;
                case 76803: goto L_0x0362;
                case 79097: goto L_0x0365;
                case 82032: goto L_0x0487;
                case 83355: goto L_0x0368;
                case 84326: goto L_0x036b;
                default: goto L_0x0056;
            }
        L_0x0056:
            java.lang.String r0 = "PAY: PaymentConfigurationMap/getPaymentService/currency set/unmapped service for currency"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x005b:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0079
            int r0 = r1.hashCode()
            switch(r0) {
                case 2084: goto L_0x007d;
                case 2097: goto L_0x00ba;
                case 2128: goto L_0x00f7;
                case 2153: goto L_0x00fb;
                case 2156: goto L_0x0138;
                case 2206: goto L_0x0175;
                case 2307: goto L_0x01b2;
                case 2331: goto L_0x01ef;
                case 2339: goto L_0x022c;
                case 2341: goto L_0x0269;
                case 2475: goto L_0x026c;
                case 2549: goto L_0x02a9;
                case 2644: goto L_0x02e6;
                case 2686: goto L_0x02f0;
                case 2718: goto L_0x0422;
                default: goto L_0x0068;
            }
        L_0x0068:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: PaymentConfigurationMap/getPaymentService/country="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "/unmapped service"
            X.C36321k7.A1Z(r2, r0)
        L_0x0079:
            r0 = 0
            java.lang.String r1 = "PAY: PaymentConfigurationMap/getPaymentService/unmapped service for country and currency"
            goto L_0x0027
        L_0x007d:
            boolean r0 = r1.equals(r3)
            if (r0 == 0) goto L_0x0068
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0473
            int r0 = r12.hashCode()
            switch(r0) {
                case 64672: goto L_0x0092;
                case 65090: goto L_0x0095;
                case 66823: goto L_0x0098;
                case 66916: goto L_0x009b;
                case 71585: goto L_0x009e;
                case 72343: goto L_0x00a1;
                case 72592: goto L_0x00a4;
                case 76803: goto L_0x00a7;
                case 79097: goto L_0x00aa;
                case 83355: goto L_0x00ad;
                case 84326: goto L_0x00b0;
                default: goto L_0x0090;
            }
        L_0x0090:
            goto L_0x0435
        L_0x0092:
            java.lang.String r0 = "AED"
            goto L_0x00b2
        L_0x0095:
            java.lang.String r0 = "ARS"
            goto L_0x00b2
        L_0x0098:
            java.lang.String r0 = "CLP"
            goto L_0x00b2
        L_0x009b:
            java.lang.String r0 = "COP"
            goto L_0x00b2
        L_0x009e:
            java.lang.String r0 = "HKD"
            goto L_0x00b2
        L_0x00a1:
            java.lang.String r0 = "IDR"
            goto L_0x00b2
        L_0x00a4:
            java.lang.String r0 = "ILS"
            goto L_0x00b2
        L_0x00a7:
            java.lang.String r0 = "MXN"
            goto L_0x00b2
        L_0x00aa:
            java.lang.String r0 = "PEN"
            goto L_0x00b2
        L_0x00ad:
            java.lang.String r0 = "TRY"
            goto L_0x00b2
        L_0x00b0:
            java.lang.String r0 = "USD"
        L_0x00b2:
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x03df
            goto L_0x0435
        L_0x00ba:
            boolean r0 = r1.equals(r4)
            if (r0 == 0) goto L_0x0068
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0473
            int r0 = r12.hashCode()
            switch(r0) {
                case 64672: goto L_0x00cf;
                case 65090: goto L_0x00d2;
                case 66823: goto L_0x00d5;
                case 66916: goto L_0x00d8;
                case 71585: goto L_0x00db;
                case 72343: goto L_0x00de;
                case 72592: goto L_0x00e1;
                case 76803: goto L_0x00e4;
                case 79097: goto L_0x00e7;
                case 83355: goto L_0x00ea;
                case 84326: goto L_0x00ed;
                default: goto L_0x00cd;
            }
        L_0x00cd:
            goto L_0x0435
        L_0x00cf:
            java.lang.String r0 = "AED"
            goto L_0x00ef
        L_0x00d2:
            java.lang.String r0 = "ARS"
            goto L_0x00ef
        L_0x00d5:
            java.lang.String r0 = "CLP"
            goto L_0x00ef
        L_0x00d8:
            java.lang.String r0 = "COP"
            goto L_0x00ef
        L_0x00db:
            java.lang.String r0 = "HKD"
            goto L_0x00ef
        L_0x00de:
            java.lang.String r0 = "IDR"
            goto L_0x00ef
        L_0x00e1:
            java.lang.String r0 = "ILS"
            goto L_0x00ef
        L_0x00e4:
            java.lang.String r0 = "MXN"
            goto L_0x00ef
        L_0x00e7:
            java.lang.String r0 = "PEN"
            goto L_0x00ef
        L_0x00ea:
            java.lang.String r0 = "TRY"
            goto L_0x00ef
        L_0x00ed:
            java.lang.String r0 = "USD"
        L_0x00ef:
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x03e5
            goto L_0x0435
        L_0x00f7:
            java.lang.String r3 = "BR"
            goto L_0x02e8
        L_0x00fb:
            boolean r0 = r1.equals(r5)
            if (r0 == 0) goto L_0x0068
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0473
            int r0 = r12.hashCode()
            switch(r0) {
                case 64672: goto L_0x0110;
                case 65090: goto L_0x0113;
                case 66823: goto L_0x0116;
                case 66916: goto L_0x0119;
                case 71585: goto L_0x011c;
                case 72343: goto L_0x011f;
                case 72592: goto L_0x0122;
                case 76803: goto L_0x0125;
                case 79097: goto L_0x0128;
                case 83355: goto L_0x012b;
                case 84326: goto L_0x012e;
                default: goto L_0x010e;
            }
        L_0x010e:
            goto L_0x0435
        L_0x0110:
            java.lang.String r0 = "AED"
            goto L_0x0130
        L_0x0113:
            java.lang.String r0 = "ARS"
            goto L_0x0130
        L_0x0116:
            java.lang.String r0 = "CLP"
            goto L_0x0130
        L_0x0119:
            java.lang.String r0 = "COP"
            goto L_0x0130
        L_0x011c:
            java.lang.String r0 = "HKD"
            goto L_0x0130
        L_0x011f:
            java.lang.String r0 = "IDR"
            goto L_0x0130
        L_0x0122:
            java.lang.String r0 = "ILS"
            goto L_0x0130
        L_0x0125:
            java.lang.String r0 = "MXN"
            goto L_0x0130
        L_0x0128:
            java.lang.String r0 = "PEN"
            goto L_0x0130
        L_0x012b:
            java.lang.String r0 = "TRY"
            goto L_0x0130
        L_0x012e:
            java.lang.String r0 = "USD"
        L_0x0130:
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x03eb
            goto L_0x0435
        L_0x0138:
            boolean r0 = r1.equals(r6)
            if (r0 == 0) goto L_0x0068
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0473
            int r0 = r12.hashCode()
            switch(r0) {
                case 64672: goto L_0x014d;
                case 65090: goto L_0x0150;
                case 66823: goto L_0x0153;
                case 66916: goto L_0x0156;
                case 71585: goto L_0x0159;
                case 72343: goto L_0x015c;
                case 72592: goto L_0x015f;
                case 76803: goto L_0x0162;
                case 79097: goto L_0x0165;
                case 83355: goto L_0x0168;
                case 84326: goto L_0x016b;
                default: goto L_0x014b;
            }
        L_0x014b:
            goto L_0x0435
        L_0x014d:
            java.lang.String r0 = "AED"
            goto L_0x016d
        L_0x0150:
            java.lang.String r0 = "ARS"
            goto L_0x016d
        L_0x0153:
            java.lang.String r0 = "CLP"
            goto L_0x016d
        L_0x0156:
            java.lang.String r0 = "COP"
            goto L_0x016d
        L_0x0159:
            java.lang.String r0 = "HKD"
            goto L_0x016d
        L_0x015c:
            java.lang.String r0 = "IDR"
            goto L_0x016d
        L_0x015f:
            java.lang.String r0 = "ILS"
            goto L_0x016d
        L_0x0162:
            java.lang.String r0 = "MXN"
            goto L_0x016d
        L_0x0165:
            java.lang.String r0 = "PEN"
            goto L_0x016d
        L_0x0168:
            java.lang.String r0 = "TRY"
            goto L_0x016d
        L_0x016b:
            java.lang.String r0 = "USD"
        L_0x016d:
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x03f1
            goto L_0x0435
        L_0x0175:
            boolean r0 = r1.equals(r7)
            if (r0 == 0) goto L_0x0068
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0473
            int r0 = r12.hashCode()
            switch(r0) {
                case 64672: goto L_0x018a;
                case 65090: goto L_0x018d;
                case 66823: goto L_0x0190;
                case 66916: goto L_0x0193;
                case 71585: goto L_0x0196;
                case 72343: goto L_0x0199;
                case 72592: goto L_0x019c;
                case 76803: goto L_0x019f;
                case 79097: goto L_0x01a2;
                case 83355: goto L_0x01a5;
                case 84326: goto L_0x01a8;
                default: goto L_0x0188;
            }
        L_0x0188:
            goto L_0x0435
        L_0x018a:
            java.lang.String r0 = "AED"
            goto L_0x01aa
        L_0x018d:
            java.lang.String r0 = "ARS"
            goto L_0x01aa
        L_0x0190:
            java.lang.String r0 = "CLP"
            goto L_0x01aa
        L_0x0193:
            java.lang.String r0 = "COP"
            goto L_0x01aa
        L_0x0196:
            java.lang.String r0 = "HKD"
            goto L_0x01aa
        L_0x0199:
            java.lang.String r0 = "IDR"
            goto L_0x01aa
        L_0x019c:
            java.lang.String r0 = "ILS"
            goto L_0x01aa
        L_0x019f:
            java.lang.String r0 = "MXN"
            goto L_0x01aa
        L_0x01a2:
            java.lang.String r0 = "PEN"
            goto L_0x01aa
        L_0x01a5:
            java.lang.String r0 = "TRY"
            goto L_0x01aa
        L_0x01a8:
            java.lang.String r0 = "USD"
        L_0x01aa:
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x03f7
            goto L_0x0435
        L_0x01b2:
            boolean r0 = r1.equals(r8)
            if (r0 == 0) goto L_0x0068
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0473
            int r0 = r12.hashCode()
            switch(r0) {
                case 64672: goto L_0x01c7;
                case 65090: goto L_0x01ca;
                case 66823: goto L_0x01cd;
                case 66916: goto L_0x01d0;
                case 71585: goto L_0x01d3;
                case 72343: goto L_0x01d6;
                case 72592: goto L_0x01d9;
                case 76803: goto L_0x01dc;
                case 79097: goto L_0x01df;
                case 83355: goto L_0x01e2;
                case 84326: goto L_0x01e5;
                default: goto L_0x01c5;
            }
        L_0x01c5:
            goto L_0x0435
        L_0x01c7:
            java.lang.String r0 = "AED"
            goto L_0x01e7
        L_0x01ca:
            java.lang.String r0 = "ARS"
            goto L_0x01e7
        L_0x01cd:
            java.lang.String r0 = "CLP"
            goto L_0x01e7
        L_0x01d0:
            java.lang.String r0 = "COP"
            goto L_0x01e7
        L_0x01d3:
            java.lang.String r0 = "HKD"
            goto L_0x01e7
        L_0x01d6:
            java.lang.String r0 = "IDR"
            goto L_0x01e7
        L_0x01d9:
            java.lang.String r0 = "ILS"
            goto L_0x01e7
        L_0x01dc:
            java.lang.String r0 = "MXN"
            goto L_0x01e7
        L_0x01df:
            java.lang.String r0 = "PEN"
            goto L_0x01e7
        L_0x01e2:
            java.lang.String r0 = "TRY"
            goto L_0x01e7
        L_0x01e5:
            java.lang.String r0 = "USD"
        L_0x01e7:
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x03fd
            goto L_0x0435
        L_0x01ef:
            boolean r0 = r1.equals(r9)
            if (r0 == 0) goto L_0x0068
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0473
            int r0 = r12.hashCode()
            switch(r0) {
                case 64672: goto L_0x0204;
                case 65090: goto L_0x0207;
                case 66823: goto L_0x020a;
                case 66916: goto L_0x020d;
                case 71585: goto L_0x0210;
                case 72343: goto L_0x0213;
                case 72592: goto L_0x0216;
                case 76803: goto L_0x0219;
                case 79097: goto L_0x021c;
                case 83355: goto L_0x021f;
                case 84326: goto L_0x0222;
                default: goto L_0x0202;
            }
        L_0x0202:
            goto L_0x0435
        L_0x0204:
            java.lang.String r0 = "AED"
            goto L_0x0224
        L_0x0207:
            java.lang.String r0 = "ARS"
            goto L_0x0224
        L_0x020a:
            java.lang.String r0 = "CLP"
            goto L_0x0224
        L_0x020d:
            java.lang.String r0 = "COP"
            goto L_0x0224
        L_0x0210:
            java.lang.String r0 = "HKD"
            goto L_0x0224
        L_0x0213:
            java.lang.String r0 = "IDR"
            goto L_0x0224
        L_0x0216:
            java.lang.String r0 = "ILS"
            goto L_0x0224
        L_0x0219:
            java.lang.String r0 = "MXN"
            goto L_0x0224
        L_0x021c:
            java.lang.String r0 = "PEN"
            goto L_0x0224
        L_0x021f:
            java.lang.String r0 = "TRY"
            goto L_0x0224
        L_0x0222:
            java.lang.String r0 = "USD"
        L_0x0224:
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0403
            goto L_0x0435
        L_0x022c:
            boolean r0 = r1.equals(r10)
            if (r0 == 0) goto L_0x0068
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0473
            int r0 = r12.hashCode()
            switch(r0) {
                case 64672: goto L_0x0241;
                case 65090: goto L_0x0244;
                case 66823: goto L_0x0247;
                case 66916: goto L_0x024a;
                case 71585: goto L_0x024d;
                case 72343: goto L_0x0250;
                case 72592: goto L_0x0253;
                case 76803: goto L_0x0256;
                case 79097: goto L_0x0259;
                case 83355: goto L_0x025c;
                case 84326: goto L_0x025f;
                default: goto L_0x023f;
            }
        L_0x023f:
            goto L_0x0435
        L_0x0241:
            java.lang.String r0 = "AED"
            goto L_0x0261
        L_0x0244:
            java.lang.String r0 = "ARS"
            goto L_0x0261
        L_0x0247:
            java.lang.String r0 = "CLP"
            goto L_0x0261
        L_0x024a:
            java.lang.String r0 = "COP"
            goto L_0x0261
        L_0x024d:
            java.lang.String r0 = "HKD"
            goto L_0x0261
        L_0x0250:
            java.lang.String r0 = "IDR"
            goto L_0x0261
        L_0x0253:
            java.lang.String r0 = "ILS"
            goto L_0x0261
        L_0x0256:
            java.lang.String r0 = "MXN"
            goto L_0x0261
        L_0x0259:
            java.lang.String r0 = "PEN"
            goto L_0x0261
        L_0x025c:
            java.lang.String r0 = "TRY"
            goto L_0x0261
        L_0x025f:
            java.lang.String r0 = "USD"
        L_0x0261:
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0409
            goto L_0x0435
        L_0x0269:
            java.lang.String r3 = "IN"
            goto L_0x02e8
        L_0x026c:
            boolean r0 = r1.equals(r13)
            if (r0 == 0) goto L_0x0068
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0473
            int r0 = r12.hashCode()
            switch(r0) {
                case 64672: goto L_0x0281;
                case 65090: goto L_0x0284;
                case 66823: goto L_0x0287;
                case 66916: goto L_0x028a;
                case 71585: goto L_0x028d;
                case 72343: goto L_0x0290;
                case 72592: goto L_0x0293;
                case 76803: goto L_0x0296;
                case 79097: goto L_0x0299;
                case 83355: goto L_0x029c;
                case 84326: goto L_0x029f;
                default: goto L_0x027f;
            }
        L_0x027f:
            goto L_0x0435
        L_0x0281:
            java.lang.String r0 = "AED"
            goto L_0x02a1
        L_0x0284:
            java.lang.String r0 = "ARS"
            goto L_0x02a1
        L_0x0287:
            java.lang.String r0 = "CLP"
            goto L_0x02a1
        L_0x028a:
            java.lang.String r0 = "COP"
            goto L_0x02a1
        L_0x028d:
            java.lang.String r0 = "HKD"
            goto L_0x02a1
        L_0x0290:
            java.lang.String r0 = "IDR"
            goto L_0x02a1
        L_0x0293:
            java.lang.String r0 = "ILS"
            goto L_0x02a1
        L_0x0296:
            java.lang.String r0 = "MXN"
            goto L_0x02a1
        L_0x0299:
            java.lang.String r0 = "PEN"
            goto L_0x02a1
        L_0x029c:
            java.lang.String r0 = "TRY"
            goto L_0x02a1
        L_0x029f:
            java.lang.String r0 = "USD"
        L_0x02a1:
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x040f
            goto L_0x0435
        L_0x02a9:
            boolean r0 = r1.equals(r14)
            if (r0 == 0) goto L_0x0068
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0473
            int r0 = r12.hashCode()
            switch(r0) {
                case 64672: goto L_0x02be;
                case 65090: goto L_0x02c1;
                case 66823: goto L_0x02c4;
                case 66916: goto L_0x02c7;
                case 71585: goto L_0x02ca;
                case 72343: goto L_0x02cd;
                case 72592: goto L_0x02d0;
                case 76803: goto L_0x02d3;
                case 79097: goto L_0x02d6;
                case 83355: goto L_0x02d9;
                case 84326: goto L_0x02dc;
                default: goto L_0x02bc;
            }
        L_0x02bc:
            goto L_0x0435
        L_0x02be:
            java.lang.String r0 = "AED"
            goto L_0x02de
        L_0x02c1:
            java.lang.String r0 = "ARS"
            goto L_0x02de
        L_0x02c4:
            java.lang.String r0 = "CLP"
            goto L_0x02de
        L_0x02c7:
            java.lang.String r0 = "COP"
            goto L_0x02de
        L_0x02ca:
            java.lang.String r0 = "HKD"
            goto L_0x02de
        L_0x02cd:
            java.lang.String r0 = "IDR"
            goto L_0x02de
        L_0x02d0:
            java.lang.String r0 = "ILS"
            goto L_0x02de
        L_0x02d3:
            java.lang.String r0 = "MXN"
            goto L_0x02de
        L_0x02d6:
            java.lang.String r0 = "PEN"
            goto L_0x02de
        L_0x02d9:
            java.lang.String r0 = "TRY"
            goto L_0x02de
        L_0x02dc:
            java.lang.String r0 = "USD"
        L_0x02de:
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0415
            goto L_0x0435
        L_0x02e6:
            java.lang.String r3 = "SG"
        L_0x02e8:
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L_0x03df
            goto L_0x0068
        L_0x02f0:
            boolean r0 = r1.equals(r15)
            if (r0 == 0) goto L_0x0068
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0473
            int r0 = r12.hashCode()
            switch(r0) {
                case 64672: goto L_0x0305;
                case 65090: goto L_0x0308;
                case 66823: goto L_0x030b;
                case 66916: goto L_0x030e;
                case 71585: goto L_0x0311;
                case 72343: goto L_0x0314;
                case 72592: goto L_0x0317;
                case 76803: goto L_0x031a;
                case 79097: goto L_0x031d;
                case 83355: goto L_0x0320;
                case 84326: goto L_0x0323;
                default: goto L_0x0303;
            }
        L_0x0303:
            goto L_0x0435
        L_0x0305:
            java.lang.String r0 = "AED"
            goto L_0x0325
        L_0x0308:
            java.lang.String r0 = "ARS"
            goto L_0x0325
        L_0x030b:
            java.lang.String r0 = "CLP"
            goto L_0x0325
        L_0x030e:
            java.lang.String r0 = "COP"
            goto L_0x0325
        L_0x0311:
            java.lang.String r0 = "HKD"
            goto L_0x0325
        L_0x0314:
            java.lang.String r0 = "IDR"
            goto L_0x0325
        L_0x0317:
            java.lang.String r0 = "ILS"
            goto L_0x0325
        L_0x031a:
            java.lang.String r0 = "MXN"
            goto L_0x0325
        L_0x031d:
            java.lang.String r0 = "PEN"
            goto L_0x0325
        L_0x0320:
            java.lang.String r0 = "TRY"
            goto L_0x0325
        L_0x0323:
            java.lang.String r0 = "USD"
        L_0x0325:
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x041a
            goto L_0x0435
        L_0x032d:
            java.lang.String r0 = "BRL"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "BR"
            java.lang.Object r0 = r2.get(r0)
            goto L_0x0495
        L_0x033d:
            java.lang.String r0 = "AED"
            goto L_0x036d
        L_0x0340:
            java.lang.String r0 = "ARS"
            goto L_0x036d
        L_0x0343:
            java.lang.String r0 = "CLP"
            goto L_0x036d
        L_0x0346:
            java.lang.String r0 = "COP"
            goto L_0x036d
        L_0x0349:
            java.lang.String r0 = "HKD"
            goto L_0x036d
        L_0x034c:
            java.lang.String r0 = "IDR"
            goto L_0x036d
        L_0x034f:
            java.lang.String r0 = "ILS"
            goto L_0x036d
        L_0x0352:
            java.lang.String r0 = "INR"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "IN"
            java.lang.Object r0 = r2.get(r0)
            goto L_0x0495
        L_0x0362:
            java.lang.String r0 = "MXN"
            goto L_0x036d
        L_0x0365:
            java.lang.String r0 = "PEN"
            goto L_0x036d
        L_0x0368:
            java.lang.String r0 = "TRY"
            goto L_0x036d
        L_0x036b:
            java.lang.String r0 = "USD"
        L_0x036d:
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0056
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x041f
            int r0 = r1.hashCode()
            switch(r0) {
                case 2084: goto L_0x038b;
                case 2097: goto L_0x0392;
                case 2153: goto L_0x0399;
                case 2156: goto L_0x03a0;
                case 2206: goto L_0x03a7;
                case 2307: goto L_0x03ae;
                case 2331: goto L_0x03b5;
                case 2339: goto L_0x03bc;
                case 2475: goto L_0x03c3;
                case 2549: goto L_0x03ca;
                case 2686: goto L_0x03d1;
                case 2718: goto L_0x03d8;
                default: goto L_0x0380;
            }
        L_0x0380:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: PaymentConfigurationMap/getPaymentService/currency set/unmapped service for country="
            r2.append(r0)
            goto L_0x0443
        L_0x038b:
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L_0x03df
            goto L_0x0380
        L_0x0392:
            boolean r0 = r1.equals(r4)
            if (r0 != 0) goto L_0x03e5
            goto L_0x0380
        L_0x0399:
            boolean r0 = r1.equals(r5)
            if (r0 != 0) goto L_0x03eb
            goto L_0x0380
        L_0x03a0:
            boolean r0 = r1.equals(r6)
            if (r0 != 0) goto L_0x03f1
            goto L_0x0380
        L_0x03a7:
            boolean r0 = r1.equals(r7)
            if (r0 != 0) goto L_0x03f7
            goto L_0x0380
        L_0x03ae:
            boolean r0 = r1.equals(r8)
            if (r0 != 0) goto L_0x03fd
            goto L_0x0380
        L_0x03b5:
            boolean r0 = r1.equals(r9)
            if (r0 != 0) goto L_0x0403
            goto L_0x0380
        L_0x03bc:
            boolean r0 = r1.equals(r10)
            if (r0 != 0) goto L_0x0409
            goto L_0x0380
        L_0x03c3:
            boolean r0 = r1.equals(r13)
            if (r0 != 0) goto L_0x040f
            goto L_0x0380
        L_0x03ca:
            boolean r0 = r1.equals(r14)
            if (r0 != 0) goto L_0x0415
            goto L_0x0380
        L_0x03d1:
            boolean r0 = r1.equals(r15)
            if (r0 != 0) goto L_0x041a
            goto L_0x0380
        L_0x03d8:
            boolean r0 = r1.equals(r11)
            if (r0 != 0) goto L_0x0482
            goto L_0x0380
        L_0x03df:
            java.lang.Object r0 = r2.get(r3)
            goto L_0x0495
        L_0x03e5:
            java.lang.Object r0 = r2.get(r4)
            goto L_0x0495
        L_0x03eb:
            java.lang.Object r0 = r2.get(r5)
            goto L_0x0495
        L_0x03f1:
            java.lang.Object r0 = r2.get(r6)
            goto L_0x0495
        L_0x03f7:
            java.lang.Object r0 = r2.get(r7)
            goto L_0x0495
        L_0x03fd:
            java.lang.Object r0 = r2.get(r8)
            goto L_0x0495
        L_0x0403:
            java.lang.Object r0 = r2.get(r9)
            goto L_0x0495
        L_0x0409:
            java.lang.Object r0 = r2.get(r10)
            goto L_0x0495
        L_0x040f:
            java.lang.Object r0 = r2.get(r13)
            goto L_0x0495
        L_0x0415:
            java.lang.Object r0 = r2.get(r14)
            goto L_0x0495
        L_0x041a:
            java.lang.Object r0 = r2.get(r15)
            goto L_0x0495
        L_0x041f:
            java.lang.String r0 = "PAY: PaymentConfigurationMap/getPaymentService/currency set/requires country but is empty"
            goto L_0x0447
        L_0x0422:
            boolean r0 = r1.equals(r11)
            if (r0 == 0) goto L_0x0068
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0473
            int r0 = r12.hashCode()
            switch(r0) {
                case 64672: goto L_0x044c;
                case 65090: goto L_0x044f;
                case 66823: goto L_0x0452;
                case 66916: goto L_0x0455;
                case 71585: goto L_0x0458;
                case 72343: goto L_0x045b;
                case 72592: goto L_0x045e;
                case 76803: goto L_0x0461;
                case 79097: goto L_0x0464;
                case 83355: goto L_0x0467;
                case 84326: goto L_0x046a;
                default: goto L_0x0435;
            }
        L_0x0435:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: PaymentConfigurationMap/getPaymentService/country="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r1 = "/unmapped service for currency"
        L_0x0443:
            java.lang.String r0 = X.AnonymousClass000.A0q(r1, r2)
        L_0x0447:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            return r0
        L_0x044c:
            java.lang.String r0 = "AED"
            goto L_0x046c
        L_0x044f:
            java.lang.String r0 = "ARS"
            goto L_0x046c
        L_0x0452:
            java.lang.String r0 = "CLP"
            goto L_0x046c
        L_0x0455:
            java.lang.String r0 = "COP"
            goto L_0x046c
        L_0x0458:
            java.lang.String r0 = "HKD"
            goto L_0x046c
        L_0x045b:
            java.lang.String r0 = "IDR"
            goto L_0x046c
        L_0x045e:
            java.lang.String r0 = "ILS"
            goto L_0x046c
        L_0x0461:
            java.lang.String r0 = "MXN"
            goto L_0x046c
        L_0x0464:
            java.lang.String r0 = "PEN"
            goto L_0x046c
        L_0x0467:
            java.lang.String r0 = "TRY"
            goto L_0x046c
        L_0x046a:
            java.lang.String r0 = "USD"
        L_0x046c:
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0482
            goto L_0x0435
        L_0x0473:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: PaymentConfigurationMap/getPaymentService/country="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r1 = "/requires currency but is empty"
            goto L_0x0443
        L_0x0482:
            java.lang.Object r0 = r2.get(r11)
            goto L_0x0495
        L_0x0487:
            java.lang.String r0 = "SGD"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "SG"
            java.lang.Object r0 = r2.get(r0)
        L_0x0495:
            X.004 r0 = (X.AnonymousClass004) r0
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r0 = r0.get()
            X.B66 r0 = (X.B66) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.PaymentConfiguration.A02(java.lang.String, java.lang.String):X.B66");
    }

    public PaymentConfiguration(C19460v5 r1, C24631De r2, C24641Df r3) {
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = r1;
    }
}
