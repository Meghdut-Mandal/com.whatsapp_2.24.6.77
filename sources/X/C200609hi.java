package X;

/* renamed from: X.9hi  reason: invalid class name and case insensitive filesystem */
public class C200609hi implements C22935Ayl {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C200609hi(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj3;
        this.A01 = obj2;
        this.A02 = obj4;
        this.A03 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BR0(java.util.List r10) {
        /*
            r9 = this;
            int r0 = r9.A04
            switch(r0) {
                case 0: goto L_0x001f;
                case 1: goto L_0x0084;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r9.A00
            com.whatsapp.payments.ui.BrazilPayBloksActivity r4 = (com.whatsapp.payments.ui.BrazilPayBloksActivity) r4
            java.lang.Object r3 = r9.A01
            X.8b4 r3 = (X.C175798b4) r3
            java.lang.Object r2 = r9.A02
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r1 = r9.A03
            X.6C8 r1 = (X.AnonymousClass6C8) r1
            r0 = 0
            com.whatsapp.payments.ui.BrazilPayBloksActivity.A0K(r3, r4, r0, r2)
            java.lang.String r0 = "on_success"
            r1.A01(r0, r2)
        L_0x001e:
            return
        L_0x001f:
            java.lang.Object r2 = r9.A00
            X.B7M r2 = (X.B7M) r2
            java.lang.Object r0 = r9.A01
            X.8b6 r0 = (X.C175818b6) r0
            java.lang.Object r4 = r9.A02
            X.8az r4 = (X.C175748az) r4
            java.lang.Object r3 = r9.A03
            X.AzR r3 = (X.C22975AzR) r3
            if (r0 == 0) goto L_0x0048
            X.6c7 r0 = r0.A08
            boolean r0 = X.C202349ld.A02(r0)
            if (r0 != 0) goto L_0x0048
            java.lang.Object r0 = r2.A00
            X.8gK r0 = (X.AnonymousClass8gK) r0
            X.1EZ r1 = r0.A03
            java.lang.String r0 = "add_bank"
            X.1Ea r0 = r1.A04(r0)
            r1.A0A(r0)
        L_0x0048:
            java.lang.Object r2 = r2.A00
            X.8gK r2 = (X.AnonymousClass8gK) r2
            X.AzJ r1 = r2.A01
            if (r1 == 0) goto L_0x001e
            if (r4 == 0) goto L_0x001e
            r0 = 0
            r1.BeO(r4, r0)
            X.8bF r0 = r4.A08
            X.8b6 r0 = (X.C175818b6) r0
            if (r0 == 0) goto L_0x001e
            boolean r0 = X.C175818b6.A00(r0)
            if (r0 == 0) goto L_0x001e
            X.1EZ r1 = r2.A03
            java.lang.String r0 = "2fa"
            X.1Ea r0 = r1.A04(r0)
            r1.A0A(r0)
            X.B8z r3 = (X.C23191B8z) r3
            int r0 = r3.A01
            java.lang.Object r1 = r3.A00
            int r0 = 2 - r0
            if (r0 == 0) goto L_0x007f
            com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity r1 = (com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity) r1
            X.9Q4 r0 = r1.A0D
        L_0x007b:
            r0.A00(r1)
            return
        L_0x007f:
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity r1 = (com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity) r1
            X.9Q4 r0 = r1.A0M
            goto L_0x007b
        L_0x0084:
            java.lang.Object r8 = r9.A00
            com.whatsapp.payments.ui.BrazilPayBloksActivity r8 = (com.whatsapp.payments.ui.BrazilPayBloksActivity) r8
            java.lang.Object r7 = r9.A01
            java.util.AbstractList r7 = (java.util.AbstractList) r7
            java.lang.Object r4 = r9.A02
            X.6C8 r4 = (X.AnonymousClass6C8) r4
            java.lang.Object r5 = r9.A03
            java.util.Map r5 = (java.util.Map) r5
            int r6 = X.C165587tf.A04(r8, r7)
            X.9jE r0 = r8.A07
            org.json.JSONArray r3 = r0.A02(r7)
            boolean r0 = X.C201269jE.A01(r7)
            if (r0 == 0) goto L_0x00ab
            r1 = 0
            r0 = -233(0xffffffffffffff17, float:NaN)
            X.C179158jJ.A0j(r4, r1, r0)
            return
        L_0x00ab:
            if (r3 == 0) goto L_0x00d7
            int r2 = com.whatsapp.payments.ui.BrazilPayBloksActivity.A07(r7)
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "default_selected_position"
            r5.put(r0, r1)
            X.0yC r0 = r8.A0D
            boolean r0 = r0.A0E(r6)
            if (r0 == 0) goto L_0x00ce
            r0 = -1
            if (r2 == r0) goto L_0x00ce
            java.lang.Object r0 = r7.get(r2)
            X.AUm r0 = (X.C21669AUm) r0
            com.whatsapp.payments.ui.BrazilPayBloksActivity.A0L(r0, r5)
        L_0x00ce:
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = "verify_methods"
            r5.put(r0, r1)
        L_0x00d7:
            java.lang.String r0 = "on_success"
            r4.A01(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200609hi.BR0(java.util.List):void");
    }
}
