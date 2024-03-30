package X;

public class BAC implements AnonymousClass04S {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0130, code lost:
        if (r9 != null) goto L_0x0132;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BTH(java.lang.Object r15) {
        /*
            r14 = this;
            r9 = r15
            int r0 = r14.A03
            if (r0 == 0) goto L_0x0034
            java.lang.Object r5 = r14.A00
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r4 = r14.A01
            com.whatsapp.group.GroupMembershipApprovalRequestsFragment r4 = (com.whatsapp.group.GroupMembershipApprovalRequestsFragment) r4
            java.lang.Object r3 = r14.A02
            android.view.View r3 = (android.view.View) r3
            java.util.List r9 = (java.util.List) r9
            r2 = 0
            r1 = 1
            r0 = 8
            r5.setVisibility(r0)
            r4.A10(r1)
            r3.setVisibility(r2)
            X.7zh r0 = r4.A1Y()
            X.AnonymousClass00C.A0B(r9)
            X.AnonymousClass00C.A0D(r9, r2)
            r0.A01 = r9
            X.7zh r0 = r4.A1Y()
            r0.A06()
        L_0x0033:
            return
        L_0x0034:
            java.lang.Object r3 = r14.A00
            com.whatsapp.biz.product.view.activity.ProductDetailActivity r3 = (com.whatsapp.biz.product.view.activity.ProductDetailActivity) r3
            java.lang.Object r1 = r14.A01
            java.lang.Object r2 = r14.A02
            X.9uZ r9 = (X.C207109uZ) r9
            X.7yU r5 = r3.A0h
            X.3Km r0 = r5.A0D
            java.lang.String r4 = r0.A00(r9)
            java.lang.String r0 = "UNBLOCKED"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0053
            X.00s r0 = r5.A03
            r0.A0D(r4)
        L_0x0053:
            X.7yU r5 = r3.A0h
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x0130
            if (r9 != 0) goto L_0x0132
            X.A8p r4 = r5.A0G
            X.AI7 r0 = r4.A02
            r0.A00(r4)
            r0 = 1
            r5.A00 = r0
        L_0x0065:
            com.whatsapp.biz.catalog.view.CatalogMediaCard r7 = r3.A0a
            r5 = 8
            r4 = 0
            if (r7 == 0) goto L_0x00c5
            X.7yU r8 = r3.A0h
            r13 = 1
            if (r9 == 0) goto L_0x012c
            boolean r0 = r9.A0Y
            if (r0 == 0) goto L_0x012c
            int r6 = r8.A02
            if (r6 == r13) goto L_0x0088
            r0 = 9
            if (r6 == r0) goto L_0x0088
            if (r6 == r5) goto L_0x0088
            r0 = 5
            if (r6 == r0) goto L_0x0088
            r0 = 6
            if (r6 == r0) goto L_0x0088
            r0 = 7
            if (r6 != r0) goto L_0x012c
        L_0x0088:
            boolean r0 = r8.A01
            if (r0 != 0) goto L_0x012c
            r7.setVisibility(r4)
            com.whatsapp.biz.catalog.view.CatalogMediaCard r8 = r3.A0a
            com.whatsapp.jid.UserJid r10 = r3.A0q
            boolean r12 = X.AnonymousClass000.A1V(r1)
            java.lang.String r11 = r3.A0y
            r8.A02(r9, r10, r11, r12, r13)
            r0 = 2131431141(0x7f0b0ee5, float:1.8484003E38)
            android.view.View r7 = r3.findViewById(r0)
            r0 = 2131432933(0x7f0b15e5, float:1.8487637E38)
            android.view.View r6 = r3.findViewById(r0)
            r1 = 2130968913(0x7f040151, float:1.7546493E38)
            r0 = 2131100079(0x7f0601af, float:1.781253E38)
            int r1 = X.C36351kA.A01(r3, r1, r0)
            r7.setBackgroundColor(r1)
            r0 = 2131429619(0x7f0b08f3, float:1.8480916E38)
            X.C36341k9.A13(r3, r0, r4)
            com.whatsapp.biz.catalog.view.CatalogMediaCard r0 = r3.A0a
            r0.setBackgroundColor(r1)
            r6.setBackgroundColor(r1)
        L_0x00c5:
            if (r2 == 0) goto L_0x00e7
            X.0wQ r1 = r3.A02
            com.whatsapp.jid.UserJid r0 = r3.A0q
            boolean r0 = r1.A0M(r0)
            if (r0 != 0) goto L_0x00e7
            r0 = 2131429057(0x7f0b06c1, float:1.8479776E38)
            com.whatsapp.TextEmojiLabel r2 = X.C36421kH.A0I(r3, r0)
            if (r9 == 0) goto L_0x00e7
            if (r2 == 0) goto L_0x00e7
            java.lang.String r1 = r9.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0125
            r2.setVisibility(r5)
        L_0x00e7:
            X.1KP r2 = r3.A05
            r1 = 1
            java.lang.String r0 = "postcode"
            boolean r0 = X.AnonymousClass1KP.A00(r2, r9, r0, r1)
            if (r0 == 0) goto L_0x0111
            X.7yT r0 = r3.A03
            X.00r r1 = r0.A04
            r0 = 13
            X.BA7.A00(r3, r1, r0)
            X.7yT r0 = r3.A03
            X.00r r2 = r0.A02
            int r0 = r2.A00
            if (r0 > 0) goto L_0x010c
            r1 = 2
            X.BAD r0 = new X.BAD
            r0.<init>(r9, r3, r1)
            r2.A08(r3, r0)
        L_0x010c:
            X.7yT r0 = r3.A03
            r0.A0S(r9)
        L_0x0111:
            androidx.fragment.app.FragmentContainerView r0 = r3.A0A
            if (r0 == 0) goto L_0x0033
            X.1KP r0 = r3.A05
            boolean r0 = r0.A02(r9)
            androidx.fragment.app.FragmentContainerView r1 = r3.A0A
            int r0 = X.C36351kA.A00(r0)
            r1.setVisibility(r0)
            return
        L_0x0125:
            r2.A0I(r1)
            r2.setVisibility(r4)
            goto L_0x00e7
        L_0x012c:
            r7.setVisibility(r5)
            goto L_0x00c5
        L_0x0130:
            if (r9 == 0) goto L_0x0065
        L_0x0132:
            r3.A3i()
            X.7y9 r0 = r3.A0P
            r0.A0T()
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BAC.BTH(java.lang.Object):void");
    }

    public BAC(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
