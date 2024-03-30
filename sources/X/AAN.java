package X;

public class AAN implements B0z {
    public final C20050ww A00;
    public final C19630wG A01;
    public final AE0 A02;
    public final AnonymousClass1EU A03;
    public final AnonymousClass1EZ A04;
    public final C29231Vv A05;

    public AAN(C20050ww r1, C19630wG r2, AE0 ae0, AnonymousClass1EZ r4, C29231Vv r5, AnonymousClass1EU r6) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r6;
        this.A04 = r4;
        this.A02 = ae0;
        this.A05 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        r2 = X.C202159l8.A0F.A0C;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B0s(java.lang.String r5, java.util.List r6) {
        /*
            r4 = this;
            java.util.Iterator r3 = r6.iterator()
        L_0x0004:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x004f
            X.9un r0 = X.C165607th.A0S(r3)
            X.8bF r1 = r0.A08
            boolean r0 = r1 instanceof X.C175818b6
            if (r0 == 0) goto L_0x0028
            X.8b6 r1 = (X.C175818b6) r1
            boolean r0 = X.C175818b6.A00(r1)
            if (r0 == 0) goto L_0x0004
            X.1EU r0 = r4.A03
            X.1EY r1 = r0.A02(r5)
            java.lang.String r0 = "2fa"
            r1.A0B(r0)
            goto L_0x0004
        L_0x0028:
            boolean r0 = r1 instanceof X.C175878bD
            if (r0 == 0) goto L_0x0004
            X.8bD r1 = (X.C175878bD) r1
            java.lang.String r0 = r1.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0004
            X.6c7 r0 = r1.A00
            boolean r0 = X.C202349ld.A02(r0)
            if (r0 != 0) goto L_0x0004
            X.9l8 r0 = X.C202159l8.A0F
            X.1Ea[] r2 = r0.A0C
            int r0 = r2.length
            if (r0 <= 0) goto L_0x0004
            X.1Vv r1 = r4.A05
            int r0 = r0 + -1
            r0 = r2[r0]
            r1.A0A(r0)
            goto L_0x0004
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AAN.B0s(java.lang.String, java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0102, code lost:
        if (r0 != null) goto L_0x0104;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C207249un B1i(X.C207249un r8) {
        /*
            r7 = this;
            int r1 = r8.A09()
            r0 = 5
            X.8bF r2 = r8.A08
            if (r0 != r1) goto L_0x0066
            X.8bD r2 = (X.C175878bD) r2
            if (r2 == 0) goto L_0x0065
            X.1EU r0 = r7.A03
            X.16S r1 = X.C165617ti.A0O(r0)
            java.lang.String r0 = r8.A0A
            X.9un r0 = r1.A07(r0)
            if (r0 == 0) goto L_0x0039
            X.8bF r1 = r0.A08
            if (r1 == 0) goto L_0x0039
            X.8bD r1 = (X.C175878bD) r1
            X.6c7 r0 = r2.A00
            boolean r0 = X.C202349ld.A02(r0)
            if (r0 == 0) goto L_0x002d
            X.6c7 r0 = r1.A00
            r2.A00 = r0
        L_0x002d:
            java.lang.String r0 = r2.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r1.A02
            r2.A02 = r0
        L_0x0039:
            X.6c7 r0 = r2.A00
            boolean r0 = X.C202349ld.A02(r0)
            if (r0 == 0) goto L_0x004f
            X.AE0 r0 = r7.A02
            X.6c7 r1 = r0.A08()
            boolean r0 = r1.A02()
            if (r0 != 0) goto L_0x004f
            r2.A00 = r1
        L_0x004f:
            java.lang.String r0 = r2.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0065
            X.AE0 r0 = r7.A02
            java.lang.String r1 = r0.A0E()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0065
            r2.A02 = r1
        L_0x0065:
            return r8
        L_0x0066:
            X.8b6 r2 = (X.C175818b6) r2
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: beforeMethodAdded got methodData: "
            r3.append(r0)
            if (r2 == 0) goto L_0x0181
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "vpa: "
            r1.append(r0)
            X.6c7 r0 = r2.A08
            r1.append(r0)
            java.lang.String r0 = " image: "
            r1.append(r0)
            java.lang.String r0 = r2.A03
            r1.append(r0)
            java.lang.String r0 = " supportPhoneNumber: "
            r1.append(r0)
            java.lang.String r0 = r2.A0C
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
        L_0x0096:
            X.C36321k7.A1a(r3, r0)
            if (r2 == 0) goto L_0x0065
            java.lang.String r0 = r2.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0106
            java.lang.String r4 = r2.A03
            java.lang.String r1 = "BankLogos"
            X.0wG r0 = r7.A01
            android.content.Context r6 = r0.A00
            java.io.File r0 = r6.getCacheDir()
            java.io.File r3 = X.C36441kJ.A0w(r0, r1)
            boolean r0 = r3.mkdirs()
            if (r0 != 0) goto L_0x00c4
            boolean r0 = r3.isDirectory()
            if (r0 != 0) goto L_0x00c4
            java.lang.String r0 = "PAY: IndiaUpiStorageObserver/imageUrlToByteArray unable to create bank logos cache directory"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00c4:
            r0 = 1048576(0x100000, double:5.180654E-318)
            X.6Tn r5 = new X.6Tn
            r5.<init>(r3, r0)
            java.lang.String r4 = X.C18750th.A04(r4)
            X.C18740tg.A06(r4)
            android.content.res.Resources r3 = r6.getResources()
            r0 = 2131167836(0x7f070a5c, float:1.7949957E38)
            r1 = 2131167836(0x7f070a5c, float:1.7949957E38)
            int r3 = r3.getDimensionPixelSize(r0)
            android.content.res.Resources r0 = r6.getResources()
            int r1 = r0.getDimensionPixelSize(r1)
            r0 = 0
            android.graphics.Bitmap r4 = r5.A02(r4, r3, r1, r0)
            r5.A05(r0)
            if (r4 == 0) goto L_0x0178
            java.io.ByteArrayOutputStream r3 = X.C90524aI.A0Q()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            r0 = 100
            r4.compress(r1, r0, r3)
            byte[] r0 = r3.toByteArray()
            if (r0 == 0) goto L_0x0178
        L_0x0104:
            r8.A0D = r0
        L_0x0106:
            X.1EU r0 = r7.A03
            X.16S r1 = X.C165617ti.A0O(r0)
            java.lang.String r0 = r8.A0A
            X.9un r0 = r1.A07(r0)
            if (r0 == 0) goto L_0x0140
            X.8bF r1 = r0.A08
            if (r1 == 0) goto L_0x0140
            X.8b6 r1 = (X.C175818b6) r1
            X.6c7 r0 = r2.A08
            boolean r0 = X.C202349ld.A02(r0)
            if (r0 == 0) goto L_0x0126
            X.6c7 r0 = r1.A08
            r2.A08 = r0
        L_0x0126:
            java.lang.String r0 = r2.A0E
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0132
            java.lang.String r0 = r1.A0E
            r2.A0E = r0
        L_0x0132:
            X.6c7 r0 = r2.A02
            boolean r0 = X.C202349ld.A02(r0)
            if (r0 == 0) goto L_0x0140
            X.6c7 r0 = r1.A08()
            r2.A02 = r0
        L_0x0140:
            X.6c7 r0 = r2.A08
            boolean r0 = X.C202349ld.A02(r0)
            if (r0 == 0) goto L_0x0156
            X.AE0 r0 = r7.A02
            X.6c7 r1 = r0.A08()
            boolean r0 = r1.A02()
            if (r0 != 0) goto L_0x0156
            r2.A08 = r1
        L_0x0156:
            java.lang.String r0 = r2.A0E
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x016c
            X.AE0 r0 = r7.A02
            java.lang.String r1 = r0.A0E()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x016c
            r2.A0E = r1
        L_0x016c:
            X.AE0 r6 = r7.A02
            X.6c7 r1 = r2.A08
            java.lang.String r0 = r2.A0E
            java.lang.String r5 = r2.A09
            java.lang.String r4 = r2.A0D
            monitor-enter(r6)
            goto L_0x0185
        L_0x0178:
            java.lang.String r1 = r2.A03
            X.0ww r0 = r7.A00
            byte[] r0 = X.C203449o2.A09(r0, r1)
            goto L_0x0104
        L_0x0181:
            java.lang.String r0 = "null"
            goto L_0x0096
        L_0x0185:
            X.1Db r3 = r6.A01     // Catch:{ JSONException -> 0x01b2 }
            org.json.JSONObject r2 = X.C165567td.A0h(r3)     // Catch:{ JSONException -> 0x01b2 }
            X.AE0.A02(r1, r6, r0, r2)     // Catch:{ JSONException -> 0x01b2 }
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x01b2 }
            if (r0 != 0) goto L_0x01ae
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x01b2 }
            if (r0 != 0) goto L_0x01ae
            X.AE0.A03(r6, r5, r4, r2)     // Catch:{ JSONException -> 0x01b2 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ JSONException -> 0x01b2 }
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs updated psp: "
            r1.append(r0)     // Catch:{ JSONException -> 0x01b2 }
            r1.append(r5)     // Catch:{ JSONException -> 0x01b2 }
            java.lang.String r0 = " transactionPrefix: "
            X.C36321k7.A1Q(r0, r4, r1)     // Catch:{ JSONException -> 0x01b2 }
        L_0x01ae:
            X.C165577te.A1B(r3, r2)     // Catch:{ JSONException -> 0x01b2 }
            goto L_0x01b8
        L_0x01b2:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs updateHandleDeviceBinding threw: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x01ba }
        L_0x01b8:
            monitor-exit(r6)
            return r8
        L_0x01ba:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AAN.B1i(X.9un):X.9un");
    }
}
