package X;

public class BAD implements AnonymousClass04S {
    public Object A00;
    public Object A01;
    public final int A02;

    public BAD(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02b0, code lost:
        if (r3.A0P == null) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        if (r3.A0N == null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012b, code lost:
        if (r3.A0Q == null) goto L_0x012d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BTH(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A02
            switch(r0) {
                case 0: goto L_0x029f;
                case 1: goto L_0x006e;
                case 2: goto L_0x00d1;
                case 3: goto L_0x0118;
                case 4: goto L_0x0144;
                case 5: goto L_0x0154;
                case 6: goto L_0x0191;
                case 7: goto L_0x01d3;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r5 = r11.A01
            X.7zf r5 = (X.C168077zf) r5
            java.util.List r12 = (java.util.List) r12
            java.util.HashMap r4 = X.AnonymousClass001.A0J()
            java.util.Iterator r3 = r12.iterator()
        L_0x0013:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r1 = r3.next()
            X.AyP r1 = (X.C22913AyP) r1
            boolean r0 = r1 instanceof X.A96
            if (r0 == 0) goto L_0x0013
            X.A96 r1 = (X.A96) r1
            X.9up r1 = r1.A00
            java.util.List r2 = r1.A07
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0013
            java.lang.String r1 = r1.A0F
            java.lang.Object r0 = X.C36391kE.A0t(r2)
            r4.put(r1, r0)
            goto L_0x0013
        L_0x0039:
            r3 = 0
        L_0x003a:
            java.util.List r1 = r5.A0D
            int r0 = r1.size()
            if (r3 >= r0) goto L_0x0303
            java.lang.Object r2 = r1.get(r3)
            X.9FT r2 = (X.AnonymousClass9FT) r2
            boolean r0 = r2 instanceof X.C179398k4
            if (r0 == 0) goto L_0x006b
            X.8k4 r2 = (X.C179398k4) r2
            X.9uJ r0 = r2.A01
            java.lang.String r1 = r0.A00()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x006b
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L_0x006b
            java.lang.Object r0 = r4.get(r1)
            X.9tv r0 = (X.C206759tv) r0
            r2.A00 = r0
            r5.A07(r3)
        L_0x006b:
            int r3 = r3 + 1
            goto L_0x003a
        L_0x006e:
            java.lang.Object r3 = r11.A00
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r3 = (com.whatsapp.biz.catalog.view.activity.ProductListActivity) r3
            java.lang.Object r4 = r11.A01
            android.view.MenuItem r4 = (android.view.MenuItem) r4
            boolean r2 = X.AnonymousClass000.A1X(r12)
            if (r2 == 0) goto L_0x0081
            java.lang.String r1 = r3.A0N
            r0 = 1
            if (r1 != 0) goto L_0x0082
        L_0x0081:
            r0 = 0
        L_0x0082:
            r4.setVisible(r0)
            X.7zp r1 = r3.A0F
            boolean r0 = r1.A02
            if (r2 == r0) goto L_0x0090
            r1.A02 = r2
            r1.A06()
        L_0x0090:
            com.whatsapp.biz.catalog.view.activity.ProductListActivity.A07(r3)
            boolean r0 = r3.A0Q
            if (r0 != 0) goto L_0x0303
            X.9Jp r4 = r3.A0C
            if (r4 == 0) goto L_0x0303
            r0 = 1
            r3.A0Q = r0
            X.9Y1 r2 = r3.A0D
            X.9Sx r1 = new X.9Sx
            r1.<init>()
            X.C193039Jp.A00(r1, r4, r2)
            r0 = 4
            X.C36401kF.A1F(r1, r0)
            r0 = 23
            X.C36411kG.A1G(r1, r0)
            X.7y7 r0 = r3.A0G
            X.9Uf r0 = r0.A04
            X.00r r0 = r0.A03
            X.C195209Sx.A00(r0, r1)
            com.whatsapp.jid.UserJid r0 = r3.A0J
            r1.A00 = r0
            X.7y9 r0 = r3.A0B
            X.00s r0 = r0.A00
            java.lang.Object r0 = r0.A04()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r1.A01 = r0
            r2.A03(r1)
            r0 = 0
            r3.A0C = r0
            return
        L_0x00d1:
            java.lang.Object r2 = r11.A00
            com.whatsapp.biz.product.view.activity.ProductDetailActivity r2 = (com.whatsapp.biz.product.view.activity.ProductDetailActivity) r2
            java.lang.Object r1 = r11.A01
            X.9uZ r1 = (X.C207109uZ) r1
            java.lang.String r12 = (java.lang.String) r12
            r2.Bnv()
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0303
            java.lang.String r0 = "success"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x00f7
            com.whatsapp.biz.product.view.activity.ProductDetailActivity.A01(r2, r1)
            com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet r0 = r2.A04
            if (r0 == 0) goto L_0x0303
            r0.A1p()
            return
        L_0x00f7:
            java.lang.String r0 = "unserviceable_location"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0106
            r0 = 2131895241(0x7f1223c9, float:1.942531E38)
        L_0x0102:
            r2.BO5(r0)
            return
        L_0x0106:
            java.lang.String r0 = "invalid_postcode"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0114
            com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet r0 = r2.A04
            r0.A1q()
            return
        L_0x0114:
            r0 = 2131894457(0x7f1220b9, float:1.942372E38)
            goto L_0x0102
        L_0x0118:
            java.lang.Object r3 = r11.A00
            X.8Wd r3 = (X.C174338Wd) r3
            java.lang.Object r2 = r11.A01
            android.view.MenuItem r2 = (android.view.MenuItem) r2
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r0 = r12.booleanValue()
            if (r0 == 0) goto L_0x012d
            java.lang.String r1 = r3.A0Q
            r0 = 1
            if (r1 != 0) goto L_0x012e
        L_0x012d:
            r0 = 0
        L_0x012e:
            r2.setVisible(r0)
            X.8VI r1 = r3.A0I
            java.lang.Boolean r0 = r1.A01
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0140
            r1.A01 = r12
            r1.A06()
        L_0x0140:
            X.C174338Wd.A07(r3)
            return
        L_0x0144:
            java.lang.Object r1 = r11.A00
            X.9j8 r1 = (X.C201239j8) r1
            java.lang.Object r0 = r11.A01
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            boolean r0 = r0.isChecked()
            X.C201239j8.A01(r1, r0)
            return
        L_0x0154:
            java.lang.Object r5 = r11.A01
            X.7zb r5 = (X.C168037zb) r5
            java.util.List r12 = (java.util.List) r12
            java.util.HashMap r4 = X.AnonymousClass001.A0J()
            java.util.Iterator r3 = r12.iterator()
        L_0x0162:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0188
            java.lang.Object r1 = r3.next()
            X.AyP r1 = (X.C22913AyP) r1
            boolean r0 = r1 instanceof X.A96
            if (r0 == 0) goto L_0x0162
            X.A96 r1 = (X.A96) r1
            X.9up r1 = r1.A00
            java.util.List r2 = r1.A07
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0162
            java.lang.String r1 = r1.A0F
            java.lang.Object r0 = X.C36391kE.A0t(r2)
            r4.put(r1, r0)
            goto L_0x0162
        L_0x0188:
            java.util.Map r0 = r5.A00
            r0.putAll(r4)
            r5.A06()
            return
        L_0x0191:
            java.lang.Object r3 = r11.A00
            X.9fV r3 = (X.C199549fV) r3
            java.lang.Object r2 = r11.A01
            androidx.fragment.app.DialogFragment r2 = (androidx.fragment.app.DialogFragment) r2
            int r1 = X.AnonymousClass000.A0I(r12)
            r0 = 1
            if (r1 == r0) goto L_0x01c3
            r0 = 2
            if (r1 == r0) goto L_0x01b8
            r0 = 3
            if (r1 == r0) goto L_0x01af
            r0 = 4
            if (r1 == r0) goto L_0x01b4
            java.lang.String r0 = "None event received"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x01af:
            java.lang.String r0 = "Dismiss event received"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x01b4:
            r2.A1b()
            return
        L_0x01b8:
            java.lang.String r0 = "Invite sent event received"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.A1b()
            java.lang.Runnable r0 = r3.A01
            goto L_0x01cd
        L_0x01c3:
            java.lang.String r0 = "Start pay flow event received"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.A1b()
            java.lang.Runnable r0 = r3.A02
        L_0x01cd:
            if (r0 == 0) goto L_0x0303
            r0.run()
            return
        L_0x01d3:
            java.lang.Object r3 = r11.A00
            com.whatsapp.payments.ui.mapper.register.IndiaUpiCreateCustomNumberActivity r3 = (com.whatsapp.payments.ui.mapper.register.IndiaUpiCreateCustomNumberActivity) r3
            java.lang.Object r5 = r11.A01
            X.6c7 r5 = (X.C135086c7) r5
            X.97J r12 = (X.AnonymousClass97J) r12
            boolean r0 = r12 instanceof X.C179308ju
            if (r0 != 0) goto L_0x0279
            boolean r0 = r12 instanceof X.C179318jv
            if (r0 != 0) goto L_0x0279
            boolean r0 = r12 instanceof X.C179328jw
            if (r0 == 0) goto L_0x0207
            com.whatsapp.CircularProgressBar r1 = r3.A02
            if (r1 != 0) goto L_0x01f4
            java.lang.String r0 = "progressBar"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01f4:
            r0 = 0
            r1.setVisibility(r0)
            com.whatsapp.wds.components.button.WDSButton r0 = r3.A06
            if (r0 != 0) goto L_0x0203
            java.lang.String r0 = "continueButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0203:
            X.C36391kE.A1K(r0)
            return
        L_0x0207:
            boolean r0 = r12 instanceof X.C179288js
            if (r0 == 0) goto L_0x0270
            X.AnonymousClass00C.A0B(r12)
            X.8js r12 = (X.C179288js) r12
            r0 = 0
            X.6Ps[] r0 = new X.C131606Ps[r0]
            r2 = 0
            X.6Ps r6 = new X.6Ps
            r6.<init>(r2, r0)
            int r4 = r12.A00
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "payments_error_code"
            r6.A03(r0, r1)
            java.lang.String r1 = r12.A02
            java.lang.String r0 = "payments_error_text"
            r6.A03(r0, r1)
            X.AF7 r5 = r3.A05
            if (r5 == 0) goto L_0x0269
            java.lang.Integer r7 = X.C36371kC.A0o()
            r0 = 51
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            java.lang.String r10 = X.C36331k8.A0e(r3)
            java.lang.String r9 = "create_numeric_upi_alias"
            r5.BOp(r6, r7, r8, r9, r10)
            com.whatsapp.payments.ui.mapper.register.IndiaUpiCreateCustomNumberActivity.A07(r3)
            X.AEA r0 = r3.A04
            if (r0 == 0) goto L_0x0262
            X.9fr r1 = r0.A03(r2, r4)
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0256
            r0 = 2131892408(0x7f1218b8, float:1.9419563E38)
            r1.A00 = r0
        L_0x0256:
            com.whatsapp.LegacyMessageDialogFragment r1 = X.C199729fr.A00(r3, r1)
            X.01z r0 = r3.getSupportFragmentManager()
            r1.A1f(r0, r2)
            return
        L_0x0262:
            java.lang.String r0 = "indiaUpiErrorHelper"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0269:
            java.lang.String r0 = "fieldStatsLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0270:
            com.whatsapp.payments.ui.mapper.register.IndiaUpiCreateCustomNumberActivity.A07(r3)
            java.lang.String r0 = "Unexpected value for indiaUpiMapperLinkEvent"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0279:
            com.whatsapp.payments.ui.mapper.register.IndiaUpiCreateCustomNumberActivity.A07(r3)
            if (r5 == 0) goto L_0x0303
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r4 = "extra_referral_screen"
            java.lang.String r2 = r0.getStringExtra(r4)
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity> r0 = com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity.class
            android.content.Intent r1 = X.C36441kJ.A0H(r3, r0)
            java.lang.String r0 = "extra_payment_name"
            r1.putExtra(r0, r5)
            r1.putExtra(r4, r2)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r1.setFlags(r0)
            r3.startActivity(r1)
            return
        L_0x029f:
            java.lang.Object r3 = r11.A00
            X.8W7 r3 = (X.AnonymousClass8W7) r3
            java.lang.Object r2 = r11.A01
            android.view.MenuItem r2 = (android.view.MenuItem) r2
            boolean r0 = X.AnonymousClass000.A1X(r12)
            if (r0 == 0) goto L_0x02b2
            java.lang.String r1 = r3.A0P
            r0 = 1
            if (r1 != 0) goto L_0x02b3
        L_0x02b2:
            r0 = 0
        L_0x02b3:
            r2.setVisible(r0)
            boolean r0 = r3.A0R
            if (r0 != 0) goto L_0x0303
            X.9Jp r0 = r3.A0C
            if (r0 == 0) goto L_0x0303
            r0 = 1
            r3.A0R = r0
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r0 = "source"
            java.io.Serializable r4 = r1.getSerializableExtra(r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            X.9Y1 r2 = r3.A0D
            X.9Sx r1 = new X.9Sx
            r1.<init>()
            X.9Jp r0 = r3.A0C
            X.C193039Jp.A00(r1, r0, r2)
            r0 = 4
            X.C36401kF.A1F(r1, r0)
            r0 = 23
            X.C36411kG.A1G(r1, r0)
            com.whatsapp.jid.UserJid r0 = r3.A0L
            r1.A00 = r0
            X.7yA r0 = r3.A0I
            X.9Uf r0 = r0.A0E
            X.00r r0 = r0.A03
            X.C195209Sx.A00(r0, r1)
            r1.A07 = r4
            X.7y9 r0 = r3.A08
            X.00s r0 = r0.A00
            java.lang.Object r0 = r0.A04()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r1.A01 = r0
            r2.A03(r1)
            r0 = 0
            r3.A0C = r0
        L_0x0303:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BAD.BTH(java.lang.Object):void");
    }
}
