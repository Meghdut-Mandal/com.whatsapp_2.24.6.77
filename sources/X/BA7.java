package X;

import java.util.AbstractCollection;

public class BA7 implements AnonymousClass04S {
    public Object A00;
    public final int A01;

    public BA7(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass012 r1, C001600r r2, int i) {
        r2.A08(r1, new BA7(r1, i));
    }

    public static void A01(AnonymousClass012 r1, C001600r r2, Object obj, int i) {
        r2.A08(r1, new BA7(obj, i));
    }

    public static void A02(String str, AbstractCollection abstractCollection, int i, int i2) {
        abstractCollection.add(new AnonymousClass8WE(i, str, i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02c9, code lost:
        if (r1 == false) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x03e6, code lost:
        if (r3.length() == 0) goto L_0x03e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0424, code lost:
        if (r3.length() == 0) goto L_0x0426;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x04b2, code lost:
        if (r0 == false) goto L_0x0472;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x06af, code lost:
        if (r4.A0h.A0T(r4.A0U, r4.A00) == false) goto L_0x06b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x07f8, code lost:
        com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x07fb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0818, code lost:
        r5.setText(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x081b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x08b2, code lost:
        r2.setOnClickListener(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x08b5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x08e1, code lost:
        r1.setText(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x08e4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BTH(java.lang.Object r21) {
        /*
            r20 = this;
            r9 = r21
            r1 = r20
            int r0 = r1.A01
            switch(r0) {
                case 1: goto L_0x0274;
                case 2: goto L_0x04bf;
                case 3: goto L_0x04cd;
                case 4: goto L_0x0504;
                case 5: goto L_0x0629;
                case 6: goto L_0x065e;
                case 7: goto L_0x0698;
                case 8: goto L_0x06b7;
                case 9: goto L_0x06e5;
                case 10: goto L_0x000f;
                case 11: goto L_0x06ef;
                case 12: goto L_0x07bb;
                case 13: goto L_0x001d;
                case 14: goto L_0x07cd;
                case 15: goto L_0x07cd;
                case 16: goto L_0x0009;
                case 17: goto L_0x0009;
                case 18: goto L_0x0035;
                case 19: goto L_0x0150;
                case 20: goto L_0x07d5;
                case 21: goto L_0x07e9;
                case 22: goto L_0x0181;
                case 23: goto L_0x07fc;
                case 24: goto L_0x081c;
                case 25: goto L_0x085c;
                case 26: goto L_0x0009;
                case 27: goto L_0x0009;
                case 28: goto L_0x0009;
                case 29: goto L_0x0009;
                case 30: goto L_0x0009;
                case 31: goto L_0x0009;
                case 32: goto L_0x0009;
                case 33: goto L_0x0009;
                case 34: goto L_0x0009;
                case 35: goto L_0x0009;
                case 36: goto L_0x0009;
                case 37: goto L_0x0866;
                case 38: goto L_0x0009;
                case 39: goto L_0x0009;
                case 40: goto L_0x0009;
                case 41: goto L_0x0009;
                case 42: goto L_0x0009;
                case 43: goto L_0x0009;
                case 44: goto L_0x088e;
                case 45: goto L_0x0239;
                case 46: goto L_0x08a7;
                case 47: goto L_0x08b6;
                case 48: goto L_0x0009;
                case 49: goto L_0x0262;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A00
            X.C36331k8.A1J(r0, r9)
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = X.AnonymousClass000.A1X(r9)
            if (r0 == 0) goto L_0x000e
            X.AnonymousClass0XN.A00(r1)
            return
        L_0x001d:
            java.lang.Object r3 = r1.A00
            com.whatsapp.biz.product.view.activity.ProductDetailActivity r3 = (com.whatsapp.biz.product.view.activity.ProductDetailActivity) r3
            com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet r2 = r3.A04
            if (r2 == 0) goto L_0x000e
            X.7yT r0 = r3.A03
            X.00r r0 = r0.A04
            java.lang.Object r1 = r0.A04()
            java.lang.String r1 = (java.lang.String) r1
            X.7yT r0 = r3.A03
            X.C167637yT.A01(r0, r2, r1)
            return
        L_0x0035:
            java.lang.Object r7 = r1.A00
            com.whatsapp.biz.product.view.fragment.ProductMoreInfoFragment r7 = (com.whatsapp.biz.product.view.fragment.ProductMoreInfoFragment) r7
            X.9te r9 = (X.C206589te) r9
            r6 = 2131887220(0x7f120474, float:1.940904E38)
            java.lang.String r3 = r9.A01
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            com.whatsapp.TextEmojiLabel r2 = r7.A04
            if (r0 != 0) goto L_0x014b
            java.lang.String r0 = "N/A"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0141
            android.content.Context r1 = r7.A0a()
            r0 = 2131887229(0x7f12047d, float:1.940906E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x005b:
            r2.setText(r0)
        L_0x005e:
            java.lang.String r0 = "IN"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x000e
            java.lang.String r1 = "N/A"
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L_0x000e
            androidx.constraintlayout.widget.Group r0 = r7.A03
            r2 = 0
            r0.setVisibility(r2)
            androidx.constraintlayout.widget.Group r0 = r7.A01
            r0.setVisibility(r2)
            java.lang.String r3 = r9.A02
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            com.whatsapp.TextEmojiLabel r0 = r7.A06
            if (r2 != 0) goto L_0x013c
            r0.setText(r3)
        L_0x0086:
            X.9tx r3 = r9.A00
            if (r3 == 0) goto L_0x00c6
            java.lang.String r4 = r3.A04
            if (r4 == 0) goto L_0x0094
            int r0 = r4.length()
            if (r0 != 0) goto L_0x00d3
        L_0x0094:
            java.lang.String r0 = r3.A05
            if (r0 == 0) goto L_0x009e
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00d3
        L_0x009e:
            java.lang.String r0 = r3.A02
            if (r0 == 0) goto L_0x00a8
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00d3
        L_0x00a8:
            java.lang.String r0 = r3.A00
            if (r0 == 0) goto L_0x00b2
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00d3
        L_0x00b2:
            java.lang.String r0 = r3.A03
            if (r0 == 0) goto L_0x00bc
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00d3
        L_0x00bc:
            java.lang.String r0 = r3.A01
            if (r0 == 0) goto L_0x00c6
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00d3
        L_0x00c6:
            r2 = 0
        L_0x00c7:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            com.whatsapp.TextEmojiLabel r0 = r7.A05
            if (r1 != 0) goto L_0x08d3
            r0.setText(r2)
            return
        L_0x00d3:
            java.lang.String r2 = r3.A01
            if (r2 == 0) goto L_0x0139
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L_0x0130
            android.content.Context r1 = r7.A0a()
            r0 = 2131887229(0x7f12047d, float:1.940906E38)
            java.lang.String r2 = r1.getString(r0)
        L_0x00e8:
            r0 = 6
            java.lang.String[] r8 = new java.lang.String[r0]
            r0 = 0
            r8[r0] = r4
            r1 = 1
            java.lang.String r0 = r3.A05
            r8[r1] = r0
            r1 = 2
            java.lang.String r0 = r3.A02
            r8[r1] = r0
            r1 = 3
            java.lang.String r0 = r3.A00
            r8[r1] = r0
            r1 = 4
            java.lang.String r0 = r3.A03
            r8[r1] = r0
            r0 = 5
            r8[r0] = r2
            java.lang.String r5 = ", "
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            r3 = 6
            r2 = 0
        L_0x010d:
            r1 = r8[r2]
            if (r1 == 0) goto L_0x0127
            java.lang.String r0 = r1.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0127
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x0124
            r4.append(r5)
        L_0x0124:
            r4.append(r1)
        L_0x0127:
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x010d
            java.lang.String r2 = r4.toString()
            goto L_0x00c7
        L_0x0130:
            X.1M4 r1 = r7.A0A
            X.0ts r0 = r7.A09
            java.lang.String r2 = r1.A03(r0, r2)
            goto L_0x00e8
        L_0x0139:
            java.lang.String r2 = ""
            goto L_0x00e8
        L_0x013c:
            r0.setText(r6)
            goto L_0x0086
        L_0x0141:
            X.1M4 r1 = r7.A0A
            X.0ts r0 = r7.A09
            java.lang.String r0 = r1.A03(r0, r3)
            goto L_0x005b
        L_0x014b:
            r2.setText(r6)
            goto L_0x005e
        L_0x0150:
            java.lang.Object r3 = r1.A00
            com.whatsapp.biz.product.view.fragment.ProductMoreInfoFragment r3 = (com.whatsapp.biz.product.view.fragment.ProductMoreInfoFragment) r3
            int r2 = X.AnonymousClass000.A0I(r9)
            android.widget.ProgressBar r0 = r3.A00
            r1 = 8
            r0.setVisibility(r1)
            com.whatsapp.WaTextView r0 = r3.A07
            r0.setVisibility(r1)
            androidx.constraintlayout.widget.Group r0 = r3.A02
            r0.setVisibility(r1)
            r1 = 0
            if (r2 == 0) goto L_0x017e
            r0 = 1
            if (r2 == r0) goto L_0x017b
            r0 = 2
            if (r2 == r0) goto L_0x08d7
            r0 = 3
            if (r2 != r0) goto L_0x000e
            com.whatsapp.WaTextView r0 = r3.A07
        L_0x0177:
            r0.setVisibility(r1)
            return
        L_0x017b:
            androidx.constraintlayout.widget.Group r0 = r3.A02
            goto L_0x0177
        L_0x017e:
            android.widget.ProgressBar r0 = r3.A00
            goto L_0x0177
        L_0x0181:
            java.lang.Object r5 = r1.A00
            X.8Wd r5 = (X.C174338Wd) r5
            X.9HI r9 = (X.AnonymousClass9HI) r9
            com.whatsapp.jid.UserJid r2 = r9.A00
            java.lang.String r1 = r9.A01
            com.whatsapp.jid.UserJid r0 = r5.A0M
            boolean r0 = X.C1901797e.A00(r2, r0)
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r5.A0R
            boolean r0 = X.C1901797e.A00(r1, r0)
            if (r0 == 0) goto L_0x000e
            boolean r0 = r9 instanceof X.AnonymousClass8WB
            java.lang.String r4 = "view_collection_details_tag"
            if (r0 == 0) goto L_0x0209
            X.8WB r9 = (X.AnonymousClass8WB) r9
            boolean r3 = r9.A01
            X.1Ws r2 = r5.A0C
            com.whatsapp.jid.UserJid r1 = r5.A0M
            java.lang.String r0 = r5.A0R
            X.9Wv r7 = r2.A05(r1, r0)
            if (r7 == 0) goto L_0x01c4
            java.lang.String r2 = r7.A02
            r5.A0T = r2
            X.07B r1 = r5.getSupportActionBar()
            if (r1 == 0) goto L_0x01c4
            r0 = 1
            r1.A0U(r0)
            if (r2 == 0) goto L_0x01c4
            r1.A0Q(r2)
        L_0x01c4:
            java.lang.String r0 = r5.A0R
            java.lang.String r6 = "catalog_products_all_items_collection_id"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x01f9
            X.8VI r7 = r5.A0I
            r2 = 0
            X.1Ws r1 = r5.A0C
            com.whatsapp.jid.UserJid r0 = r5.A0M
            java.util.List r0 = r1.A09(r0)
            r7.A0R(r2, r0)
        L_0x01dc:
            X.1KK r2 = r5.A04
            com.whatsapp.jid.UserJid r1 = r5.A0M
            r0 = 5
            X.BAG.A00(r2, r1, r5, r0)
            java.lang.String r0 = r5.A0R
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x000e
            if (r3 != 0) goto L_0x000e
            boolean r0 = r9.A00
            if (r0 == 0) goto L_0x000e
            X.3L6 r1 = r5.A0O
            r0 = 1
            r1.A05(r4, r0)
            return
        L_0x01f9:
            if (r7 == 0) goto L_0x01dc
            java.util.List r1 = r7.A04
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01dc
            X.8VI r0 = r5.A0I
            r0.A0R(r7, r1)
            goto L_0x01dc
        L_0x0209:
            boolean r0 = r9 instanceof X.AnonymousClass8WA
            if (r0 == 0) goto L_0x000e
            X.8WA r9 = (X.AnonymousClass8WA) r9
            int r1 = r9.A00
            X.8VI r0 = r5.A0I
            r0.A0Q(r1)
            r0 = 404(0x194, float:5.66E-43)
            r3 = 0
            if (r1 != r0) goto L_0x0229
            r2 = 2131887926(0x7f120736, float:1.9410473E38)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            X.6om r0 = new X.6om
            r0.<init>(r5)
            r5.A35(r0, r3, r2, r1)
        L_0x0229:
            java.lang.String r1 = r5.A0R
            java.lang.String r0 = "catalog_products_all_items_collection_id"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x000e
            X.3L6 r0 = r5.A0O
            r0.A05(r4, r3)
            return
        L_0x0239:
            java.lang.Object r2 = r1.A00
            X.8ZY r2 = (X.AnonymousClass8ZY) r2
            X.00s r0 = r2.A0M
            r0.A0D(r9)
            X.3T1 r0 = r2.A0K
            boolean r1 = r2.A06
            X.3Qa r0 = r0.A1J
            boolean r0 = r0.equals(r9)
            r2.A06 = r0
            if (r0 == r1) goto L_0x0254
            r0 = 0
            X.AnonymousClass8ZY.A0E(r2, r0)
        L_0x0254:
            boolean r0 = r2.A06
            if (r0 != 0) goto L_0x000e
            if (r1 == 0) goto L_0x000e
            X.4Uw r0 = r2.A0c
            if (r0 == 0) goto L_0x000e
            r0.Bdt()
            return
        L_0x0262:
            java.lang.Object r1 = r1.A00
            X.8Ta r1 = (X.C173788Ta) r1
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r9 == 0) goto L_0x000e
            boolean r0 = r9.booleanValue()
            if (r0 == 0) goto L_0x08e5
            r1.A3l()
            return
        L_0x0274:
            java.lang.Object r7 = r1.A00
            com.whatsapp.biz.compliance.view.BusinessComplianceDetailActivity r7 = (com.whatsapp.biz.compliance.view.BusinessComplianceDetailActivity) r7
            X.9ty r9 = (X.C206789ty) r9
            androidx.recyclerview.widget.RecyclerView r0 = r7.A03
            r6 = 1
            X.C36351kA.A1F(r0, r6)
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            r1 = 2131887210(0x7f12046a, float:1.940902E38)
            X.8WD r0 = new X.8WD
            r0.<init>(r1)
            r5.add(r0)
            if (r9 == 0) goto L_0x04b5
            java.lang.String r8 = r9.A03
            if (r8 == 0) goto L_0x029b
            int r0 = r8.length()
            if (r0 != 0) goto L_0x02b7
        L_0x029b:
            java.lang.String r0 = r9.A04
            if (r0 == 0) goto L_0x02a5
            int r0 = r0.length()
            if (r0 != 0) goto L_0x02b7
        L_0x02a5:
            java.lang.String r0 = r9.A05
            if (r0 == 0) goto L_0x02af
            int r0 = r0.length()
            if (r0 != 0) goto L_0x02b7
        L_0x02af:
            X.9tf r0 = r9.A00
            if (r0 != 0) goto L_0x02b7
            X.9tq r0 = r9.A01
            if (r0 == 0) goto L_0x04b5
        L_0x02b7:
            r0 = 2131887220(0x7f120474, float:1.940904E38)
            java.lang.String r4 = r7.getString(r0)
            java.lang.Boolean r0 = r9.A02
            if (r0 == 0) goto L_0x02cb
            boolean r1 = r0.booleanValue()
            r0 = 2131887216(0x7f120470, float:1.9409033E38)
            if (r1 != 0) goto L_0x02ce
        L_0x02cb:
            r0 = 2131887215(0x7f12046f, float:1.940903E38)
        L_0x02ce:
            java.lang.String r11 = r7.getString(r0)
            java.lang.String r10 = r9.A04
            java.lang.String r12 = "Other"
            boolean r0 = r12.equals(r10)
            r3 = 0
            r2 = 2
            if (r0 == 0) goto L_0x0453
            r10 = 2131887217(0x7f120471, float:1.9409035E38)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r0 = r9.A05
        L_0x02e5:
            r1[r3] = r0
            java.lang.String r10 = X.C36391kE.A0v(r7, r11, r1, r6, r10)
        L_0x02eb:
            X.AnonymousClass00C.A0D(r4, r6)
            X.8WE[] r2 = new X.AnonymousClass8WE[r2]
            r1 = 2131887206(0x7f120466, float:1.9409013E38)
            if (r8 == 0) goto L_0x02fb
            int r0 = r8.length()
            if (r0 != 0) goto L_0x02fc
        L_0x02fb:
            r8 = r4
        L_0x02fc:
            X.8WE r0 = new X.8WE
            r0.<init>(r1, r8, r3)
            r2[r3] = r0
            r1 = 2131896371(0x7f122833, float:1.9427601E38)
            if (r10 == 0) goto L_0x030e
            int r0 = r10.length()
            if (r0 != 0) goto L_0x030f
        L_0x030e:
            r10 = r4
        L_0x030f:
            X.8WE r0 = new X.8WE
            r0.<init>(r1, r10, r3)
            java.util.List r0 = X.C36341k9.A0m(r0, r2, r6)
            r5.addAll(r0)
        L_0x031b:
            r1 = 2131887208(0x7f120468, float:1.9409017E38)
            X.8WD r0 = new X.8WD
            r0.<init>(r1)
            r5.add(r0)
            if (r9 == 0) goto L_0x034a
            X.9tf r10 = r9.A00
            if (r10 == 0) goto L_0x034a
            java.lang.String r8 = r10.A00
            if (r8 == 0) goto L_0x0336
            int r0 = r8.length()
            if (r0 != 0) goto L_0x0417
        L_0x0336:
            java.lang.String r0 = r10.A01
            if (r0 == 0) goto L_0x0340
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0417
        L_0x0340:
            java.lang.String r0 = r10.A02
            if (r0 == 0) goto L_0x034a
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0417
        L_0x034a:
            X.8WC r0 = new X.8WC
            r0.<init>()
            r5.add(r0)
        L_0x0352:
            r1 = 2131887219(0x7f120473, float:1.9409039E38)
            X.8WD r0 = new X.8WD
            r0.<init>(r1)
            r5.add(r0)
            if (r9 == 0) goto L_0x038b
            X.9tq r8 = r9.A01
            if (r8 == 0) goto L_0x038b
            java.lang.String r2 = r8.A03
            if (r2 == 0) goto L_0x036d
            int r0 = r2.length()
            if (r0 != 0) goto L_0x03ca
        L_0x036d:
            java.lang.String r0 = r8.A00
            if (r0 == 0) goto L_0x0377
            int r0 = r0.length()
            if (r0 != 0) goto L_0x03ca
        L_0x0377:
            java.lang.String r0 = r8.A01
            if (r0 == 0) goto L_0x0381
            int r0 = r0.length()
            if (r0 != 0) goto L_0x03ca
        L_0x0381:
            java.lang.String r0 = r8.A02
            if (r0 == 0) goto L_0x038b
            int r0 = r0.length()
            if (r0 != 0) goto L_0x03ca
        L_0x038b:
            X.8WC r0 = new X.8WC
            r0.<init>()
            r5.add(r0)
        L_0x0393:
            X.0ts r0 = r7.A00
            X.7zZ r1 = new X.7zZ
            r1.<init>(r0, r5)
            androidx.recyclerview.widget.RecyclerView r0 = r7.A03
            r0.setAdapter(r1)
            r1 = 2130968821(0x7f0400f5, float:1.7546306E38)
            r0 = 2131099943(0x7f060127, float:1.7812253E38)
            int r3 = X.C36351kA.A01(r7, r1, r0)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131168254(0x7f070bfe, float:1.7950805E38)
            int r2 = X.C36441kJ.A05(r1, r0)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131168260(0x7f070c04, float:1.7950817E38)
            int r0 = X.C36441kJ.A05(r1, r0)
            X.4nE r1 = new X.4nE
            r1.<init>(r3, r2, r0)
            androidx.recyclerview.widget.RecyclerView r0 = r7.A03
            r0.A0t(r1)
            return
        L_0x03ca:
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            r1 = 0
            if (r2 == 0) goto L_0x03dd
            int r0 = r2.length()
            if (r0 == 0) goto L_0x03dd
            r0 = 2131887218(0x7f120472, float:1.9409037E38)
            A02(r2, r4, r0, r1)
        L_0x03dd:
            java.lang.String r3 = r8.A02
            if (r3 == 0) goto L_0x03e8
            int r1 = r3.length()
            r0 = 0
            if (r1 != 0) goto L_0x03e9
        L_0x03e8:
            r0 = 1
        L_0x03e9:
            r2 = 2
            if (r0 != 0) goto L_0x03f2
            r0 = 2131887223(0x7f120477, float:1.9409047E38)
            A02(r3, r4, r0, r2)
        L_0x03f2:
            java.lang.String r1 = r8.A01
            if (r1 == 0) goto L_0x0402
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0402
            r0 = 2131887221(0x7f120475, float:1.9409043E38)
            A02(r1, r4, r0, r2)
        L_0x0402:
            java.lang.String r1 = r8.A00
            if (r1 == 0) goto L_0x0412
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0412
            r0 = 2131887212(0x7f12046c, float:1.9409025E38)
            A02(r1, r4, r0, r6)
        L_0x0412:
            r5.addAll(r4)
            goto L_0x0393
        L_0x0417:
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.lang.String r3 = r10.A02
            if (r3 == 0) goto L_0x0426
            int r1 = r3.length()
            r0 = 0
            if (r1 != 0) goto L_0x0427
        L_0x0426:
            r0 = 1
        L_0x0427:
            r2 = 2
            if (r0 != 0) goto L_0x0430
            r0 = 2131887223(0x7f120477, float:1.9409047E38)
            A02(r3, r4, r0, r2)
        L_0x0430:
            java.lang.String r1 = r10.A01
            if (r1 == 0) goto L_0x0440
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0440
            r0 = 2131887221(0x7f120475, float:1.9409043E38)
            A02(r1, r4, r0, r2)
        L_0x0440:
            if (r8 == 0) goto L_0x044e
            int r0 = r8.length()
            if (r0 == 0) goto L_0x044e
            r0 = 2131887212(0x7f12046c, float:1.9409025E38)
            A02(r8, r4, r0, r6)
        L_0x044e:
            r5.addAll(r4)
            goto L_0x0352
        L_0x0453:
            java.lang.String r1 = "Partnership"
            boolean r0 = r1.equals(r10)
            if (r0 == 0) goto L_0x0469
            r10 = 2131887217(0x7f120471, float:1.9409035E38)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r0 = 2131887226(0x7f12047a, float:1.9409053E38)
            java.lang.String r0 = r7.getString(r0)
            goto L_0x02e5
        L_0x0469:
            if (r10 == 0) goto L_0x0472
            int r0 = r10.hashCode()
            switch(r0) {
                case -1651459356: goto L_0x04ab;
                case -43127437: goto L_0x04a1;
                case 76517104: goto L_0x0499;
                case 805310027: goto L_0x048f;
                case 1005132448: goto L_0x0485;
                case 2051634630: goto L_0x047b;
                default: goto L_0x0472;
            }
        L_0x0472:
            r1 = 2131887220(0x7f120474, float:1.940904E38)
        L_0x0475:
            java.lang.String r10 = r7.getString(r1)
            goto L_0x02eb
        L_0x047b:
            java.lang.String r0 = "Public Company"
            boolean r0 = r10.equals(r0)
            r1 = 2131887228(0x7f12047c, float:1.9409057E38)
            goto L_0x04b2
        L_0x0485:
            java.lang.String r0 = "Private Company"
            boolean r0 = r10.equals(r0)
            r1 = 2131887227(0x7f12047b, float:1.9409055E38)
            goto L_0x04b2
        L_0x048f:
            java.lang.String r0 = "Limited liability partnership"
            boolean r0 = r10.equals(r0)
            r1 = 2131887222(0x7f120476, float:1.9409045E38)
            goto L_0x04b2
        L_0x0499:
            boolean r0 = r10.equals(r12)
            r1 = 2131887225(0x7f120479, float:1.9409051E38)
            goto L_0x04b2
        L_0x04a1:
            java.lang.String r0 = "Sole proprietorship"
            boolean r0 = r10.equals(r0)
            r1 = 2131887230(0x7f12047e, float:1.9409061E38)
            goto L_0x04b2
        L_0x04ab:
            boolean r0 = r10.equals(r1)
            r1 = 2131887226(0x7f12047a, float:1.9409053E38)
        L_0x04b2:
            if (r0 != 0) goto L_0x0475
            goto L_0x0472
        L_0x04b5:
            X.8WC r0 = new X.8WC
            r0.<init>()
            r5.add(r0)
            goto L_0x031b
        L_0x04bf:
            java.lang.Object r1 = r1.A00
            android.view.View r1 = (android.view.View) r1
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r9)
            r1.setEnabled(r0)
            return
        L_0x04cd:
            java.lang.Object r3 = r1.A00
            com.whatsapp.biz.order.view.fragment.OrderDetailFragment r3 = (com.whatsapp.biz.order.view.fragment.OrderDetailFragment) r3
            android.util.Pair r9 = (android.util.Pair) r9
            android.widget.ProgressBar r1 = r3.A00
            r0 = 8
            r1.setVisibility(r0)
            int r1 = X.C36381kD.A04(r9)
            r0 = 404(0x194, float:5.66E-43)
            r2 = 2131891830(0x7f121676, float:1.9418391E38)
            if (r1 == r0) goto L_0x04e8
            r2 = 2131887631(0x7f12060f, float:1.9409875E38)
        L_0x04e8:
            android.view.View r1 = r3.A0d()
            android.content.Context r0 = r3.A0a()
            java.lang.String r0 = r0.getString(r2)
            r2 = 0
            X.4t3 r0 = X.C99304t3.A01(r1, r0, r2)
            r0.A0P()
            X.3L6 r1 = r3.A0N
            java.lang.String r0 = "order_view_tag"
            r1.A05(r0, r2)
            return
        L_0x0504:
            java.lang.Object r5 = r1.A00
            com.whatsapp.biz.order.view.fragment.OrderDetailFragment r5 = (com.whatsapp.biz.order.view.fragment.OrderDetailFragment) r5
            X.9Ww r9 = (X.C195939Ww) r9
            android.widget.ProgressBar r1 = r5.A00
            r0 = 8
            r1.setVisibility(r0)
            java.util.List r4 = r9.A04
            java.math.BigDecimal r7 = java.math.BigDecimal.ZERO
            java.util.Iterator r10 = r4.iterator()
            r8 = 0
            r6 = r8
        L_0x051b:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0538
            java.lang.Object r3 = r10.next()
            X.9tP r3 = (X.C206439tP) r3
            java.math.BigDecimal r2 = r3.A02
            if (r2 == 0) goto L_0x0537
            X.6Tk r1 = r3.A01
            if (r1 == 0) goto L_0x0537
            if (r6 == 0) goto L_0x0566
            boolean r0 = r1.equals(r6)
            if (r0 != 0) goto L_0x0566
        L_0x0537:
            r7 = r8
        L_0x0538:
            X.6Dt r14 = r9.A01
            java.math.BigDecimal r6 = X.C202099l2.A00(r14, r7, r8, r4)
            if (r7 == 0) goto L_0x0549
            if (r6 == 0) goto L_0x0549
            int r0 = r6.compareTo(r7)
            if (r0 <= 0) goto L_0x0549
            r6 = r7
        L_0x0549:
            X.9l2 r0 = r5.A0D
            java.lang.String r18 = r0.A03(r7, r6, r4)
            X.7zn r3 = r5.A0B
            java.util.Iterator r1 = r4.iterator()
            r8 = 0
        L_0x0556:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0580
            java.lang.Object r0 = r1.next()
            X.9tP r0 = (X.C206439tP) r0
            int r0 = r0.A00
            int r8 = r8 + r0
            goto L_0x0556
        L_0x0566:
            r6 = r1
            X.AnonymousClass00C.A0B(r7)
            int r1 = r3.A00
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1)
            java.math.BigDecimal r0 = r2.multiply(r0)
            X.AnonymousClass00C.A08(r0)
            java.math.BigDecimal r7 = r7.add(r0)
            X.AnonymousClass00C.A08(r7)
            goto L_0x051b
        L_0x0580:
            X.9l2 r0 = r5.A0D
            r2 = 1
            java.lang.String r17 = r0.A04(r6, r4, r2)
            X.7yJ r7 = r5.A0C
            r6 = 0
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r9.A00
            long r0 = r10.toMillis(r0)
            X.0wo r9 = r7.A09
            long r0 = r9.A08(r0)
            X.0ts r10 = r7.A0B
            java.text.DateFormat r11 = X.C20040wv.A0C(r10, r2)
            java.util.Date r9 = new java.util.Date
            r9.<init>(r0)
            java.lang.String r13 = r11.format(r9)
            java.lang.String r11 = X.AnonymousClass3UM.A00(r10, r0)
            X.0wG r7 = r7.A0A
            android.content.res.Resources r12 = X.C36421kH.A0B(r7)
            r9 = 2131891946(0x7f1216ea, float:1.9418626E38)
            java.lang.Object[] r7 = X.C36411kG.A1b(r13)
            java.lang.String r7 = X.C36411kG.A0w(r12, r11, r7, r2, r9)
            X.AnonymousClass00C.A08(r7)
            java.lang.String r9 = X.AnonymousClass3UM.A01(r10, r7, r0)
            r0 = 5
            X.AnonymousClass00C.A0D(r9, r0)
            java.util.List r7 = r3.A06
            r7.clear()
            X.8VM r0 = new X.8VM
            r0.<init>(r6)
            r0.A00 = r8
            r7.add(r0)
            java.util.Iterator r6 = r4.iterator()
        L_0x05da:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x05f2
            java.lang.Object r1 = r6.next()
            X.9tP r1 = (X.C206439tP) r1
            X.AnonymousClass00C.A0B(r1)
            X.8VK r0 = new X.8VK
            r0.<init>(r1)
            r7.add(r0)
            goto L_0x05da
        L_0x05f2:
            r15 = 0
            r19 = 1
            X.8VP r13 = new X.8VP
            r16 = r15
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r7.add(r13)
            X.0yC r1 = r3.A04
            r0 = 4893(0x131d, float:6.857E-42)
            boolean r1 = r1.A0E(r0)
            X.8VN r0 = new X.8VN
            r0.<init>(r9, r1)
            r7.add(r0)
            r3.A06()
            X.3L6 r6 = r5.A0N
            int r0 = r4.size()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "order_view_tag"
            java.lang.String r0 = "ProductsCount"
            r6.A03(r1, r0, r3)
            X.3L6 r0 = r5.A0N
            r0.A05(r1, r2)
            return
        L_0x0629:
            java.lang.Object r3 = r1.A00
            com.whatsapp.biz.order.view.fragment.OrderDetailFragment r3 = (com.whatsapp.biz.order.view.fragment.OrderDetailFragment) r3
            boolean r2 = X.AnonymousClass000.A1X(r9)
            com.whatsapp.WaTextView r1 = r3.A07
            r0 = 2131896235(0x7f1227ab, float:1.9427326E38)
            if (r2 == 0) goto L_0x08e1
            r0 = 2131896234(0x7f1227aa, float:1.9427323E38)
            r1.setText(r0)
            X.1RJ r1 = r3.A0S
            r0 = 0
            r1.A03(r0)
            X.1RJ r0 = r3.A0S
            android.view.View r1 = r0.A01()
            r0 = 2131431729(0x7f0b1131, float:1.8485195E38)
            android.view.View r2 = r1.findViewById(r0)
            com.whatsapp.wds.components.button.WDSButton r2 = (com.whatsapp.wds.components.button.WDSButton) r2
            r3.A0U = r2
            r0 = 45
            X.2hx r1 = new X.2hx
            r1.<init>(r3, r0)
            goto L_0x08b2
        L_0x065e:
            java.lang.Object r7 = r1.A00
            X.8WH r7 = (X.AnonymousClass8WH) r7
            boolean r6 = X.AnonymousClass000.A1X(r9)
            java.util.List r1 = r7.A10
            if (r1 == 0) goto L_0x068c
            java.lang.String r0 = r7.A0y
            long r3 = X.C167497y9.A01(r0, r1)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x068c
            r3 = 0
            r0 = 1
            com.whatsapp.wds.components.button.WDSButton r5 = r7.A0u
            r2 = 2131893243(0x7f121bfb, float:1.9421257E38)
            if (r6 == 0) goto L_0x0682
            r2 = 2131887595(0x7f1205eb, float:1.9409802E38)
        L_0x0682:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = r7.A0v
            java.lang.String r0 = X.C36391kE.A0v(r7, r0, r1, r3, r2)
            goto L_0x0818
        L_0x068c:
            com.whatsapp.wds.components.button.WDSButton r1 = r7.A0u
            r0 = 2131887598(0x7f1205ee, float:1.9409808E38)
            if (r6 == 0) goto L_0x08e1
            r0 = 2131887599(0x7f1205ef, float:1.940981E38)
            goto L_0x08e1
        L_0x0698:
            java.lang.Object r4 = r1.A00
            X.8WH r4 = (X.AnonymousClass8WH) r4
            boolean r0 = X.AnonymousClass000.A1X(r9)
            android.view.View r3 = r4.A03
            if (r0 == 0) goto L_0x06b1
            X.7yU r2 = r4.A0h
            int r1 = r4.A00
            X.9up r0 = r4.A0U
            boolean r1 = r2.A0T(r0, r1)
            r0 = 0
            if (r1 != 0) goto L_0x06b3
        L_0x06b1:
            r0 = 8
        L_0x06b3:
            r3.setVisibility(r0)
            return
        L_0x06b7:
            java.lang.Object r2 = r1.A00
            X.8WH r2 = (X.AnonymousClass8WH) r2
            java.util.List r9 = (java.util.List) r9
            r2.A10 = r9
            X.7y9 r1 = r2.A0P
            X.0ts r0 = r2.A00
            java.lang.String r0 = r1.A0S(r0, r9)
            r2.A0v = r0
            r0 = 2131428633(0x7f0b0519, float:1.8478916E38)
            android.widget.TextView r1 = X.C36391kE.A0Q(r2, r0)
            if (r1 == 0) goto L_0x06d7
            java.lang.String r0 = r2.A0v
            r1.setText(r0)
        L_0x06d7:
            X.AnonymousClass8WH.A0H(r2, r9)
            X.7yU r3 = r2.A0h
            com.whatsapp.jid.UserJid r2 = r2.A0q
            X.0wU r1 = r3.A0L
            r0 = 0
            X.C1501874h.A01(r1, r3, r2, r0)
            return
        L_0x06e5:
            java.lang.Object r0 = r1.A00
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r9 = (java.lang.String) r9
            r0.setText(r9)
            return
        L_0x06ef:
            java.lang.Object r4 = r1.A00
            com.whatsapp.biz.product.view.activity.ProductDetailActivity r4 = (com.whatsapp.biz.product.view.activity.ProductDetailActivity) r4
            boolean r0 = X.AnonymousClass000.A1X(r9)
            if (r0 == 0) goto L_0x0796
            X.4t3 r0 = r4.A00
            if (r0 == 0) goto L_0x0700
            r0.A0N()
        L_0x0700:
            X.1Ws r5 = r4.A0S
            java.lang.String r7 = r4.A0y
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            monitor-enter(r5)
            java.util.Map r2 = r5.A03     // Catch:{ all -> 0x0793 }
            java.lang.Object r6 = r2.get(r7)     // Catch:{ all -> 0x0793 }
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6     // Catch:{ all -> 0x0793 }
            java.util.Map r1 = r5.A02     // Catch:{ all -> 0x0793 }
            X.69b r0 = new X.69b     // Catch:{ all -> 0x0793 }
            r0.<init>(r6, r7)     // Catch:{ all -> 0x0793 }
            r1.remove(r0)     // Catch:{ all -> 0x0793 }
            r2.remove(r7)     // Catch:{ all -> 0x0793 }
            if (r6 == 0) goto L_0x0786
            java.util.Map r0 = r5.A01     // Catch:{ all -> 0x0793 }
            java.lang.Object r8 = r0.get(r6)     // Catch:{ all -> 0x0793 }
            X.9ct r8 = (X.C198089ct) r8     // Catch:{ all -> 0x0793 }
            if (r8 == 0) goto L_0x0786
            java.util.List r3 = r8.A04     // Catch:{ all -> 0x0793 }
            int r2 = r3.size()     // Catch:{ all -> 0x0793 }
            r1 = 0
        L_0x0731:
            if (r1 >= r2) goto L_0x0744
            java.lang.Object r0 = r3.get(r1)     // Catch:{ all -> 0x0793 }
            X.9up r0 = (X.C207269up) r0     // Catch:{ all -> 0x0793 }
            java.lang.String r0 = r0.A0F     // Catch:{ all -> 0x0793 }
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x0793 }
            if (r0 == 0) goto L_0x077e
            r3.remove(r1)     // Catch:{ all -> 0x0793 }
        L_0x0744:
            java.util.Map r0 = r8.A05     // Catch:{ all -> 0x0793 }
            java.util.Iterator r8 = X.AnonymousClass000.A0z(r0)     // Catch:{ all -> 0x0793 }
        L_0x074a:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0793 }
            if (r0 == 0) goto L_0x0781
            java.lang.Object r3 = r8.next()     // Catch:{ all -> 0x0793 }
            X.9VT r3 = (X.AnonymousClass9VT) r3     // Catch:{ all -> 0x0793 }
            X.9Wv r0 = r3.A01     // Catch:{ all -> 0x0793 }
            java.util.List r0 = r0.A04     // Catch:{ all -> 0x0793 }
            int r2 = r0.size()     // Catch:{ all -> 0x0793 }
            r1 = 0
        L_0x075f:
            if (r1 >= r2) goto L_0x074a
            X.9Wv r0 = r3.A01     // Catch:{ all -> 0x0793 }
            java.util.List r0 = r0.A04     // Catch:{ all -> 0x0793 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0793 }
            X.9up r0 = (X.C207269up) r0     // Catch:{ all -> 0x0793 }
            java.lang.String r0 = r0.A0F     // Catch:{ all -> 0x0793 }
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x0793 }
            if (r0 == 0) goto L_0x077b
            X.9Wv r0 = r3.A01     // Catch:{ all -> 0x0793 }
            java.util.List r0 = r0.A04     // Catch:{ all -> 0x0793 }
            r0.remove(r1)     // Catch:{ all -> 0x0793 }
            goto L_0x074a
        L_0x077b:
            int r1 = r1 + 1
            goto L_0x075f
        L_0x077e:
            int r1 = r1 + 1
            goto L_0x0731
        L_0x0781:
            X.1Wr r0 = r5.A00     // Catch:{ all -> 0x0793 }
            r0.A00(r6)     // Catch:{ all -> 0x0793 }
        L_0x0786:
            monitor-exit(r5)
            r0 = 0
            r4.A0U = r0
            X.1KK r2 = r4.A0I
            com.whatsapp.jid.UserJid r1 = r4.A0q
            r0 = 4
            X.BAG.A00(r2, r1, r4, r0)
            return
        L_0x0793:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0796:
            android.view.View r2 = r4.A00
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131891605(0x7f121595, float:1.9417935E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 4000(0xfa0, float:5.605E-42)
            X.4t3 r3 = X.C99304t3.A01(r2, r1, r0)
            r2 = 2131893722(0x7f121dda, float:1.9422229E38)
            r1 = 1
            X.2iE r0 = new X.2iE
            r0.<init>(r4, r1)
            r3.A0Y(r0, r2)
            r4.A00 = r3
            r3.A0P()
            return
        L_0x07bb:
            java.lang.Object r3 = r1.A00
            com.whatsapp.biz.product.view.activity.ProductDetailActivity r3 = (com.whatsapp.biz.product.view.activity.ProductDetailActivity) r3
            java.lang.String r9 = (java.lang.String) r9
            X.9fJ r2 = r3.A06
            r1 = 1
            X.B8G r0 = new X.B8G
            r0.<init>(r3, r1)
            r2.A01(r3, r0, r9)
            return
        L_0x07cd:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1c()
            return
        L_0x07d5:
            java.lang.Object r1 = r1.A00
            com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel r1 = (com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel) r1
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.AnonymousClass00C.A0B(r9)
            boolean r0 = r9.booleanValue()
            r1.A07 = r0
            goto L_0x07f8
        L_0x07e9:
            java.lang.Object r1 = r1.A00
            com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel r1 = (com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel) r1
            java.util.List r9 = (java.util.List) r9
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.AnonymousClass00C.A0B(r9)
            r1.A05 = r9
        L_0x07f8:
            com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel.A01(r1)
            return
        L_0x07fc:
            java.lang.Object r4 = r1.A00
            X.8Wd r4 = (X.C174338Wd) r4
            boolean r1 = X.AnonymousClass000.A1X(r9)
            r3 = 0
            r0 = 1
            com.whatsapp.wds.components.button.WDSButton r5 = r4.A0P
            r2 = 2131893243(0x7f121bfb, float:1.9421257E38)
            if (r1 == 0) goto L_0x0810
            r2 = 2131887595(0x7f1205eb, float:1.9409802E38)
        L_0x0810:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = r4.A0Q
            java.lang.String r0 = X.C36391kE.A0v(r4, r0, r1, r3, r2)
        L_0x0818:
            r5.setText(r0)
            return
        L_0x081c:
            java.lang.Object r3 = r1.A00
            X.8Wd r3 = (X.C174338Wd) r3
            java.util.List r9 = (java.util.List) r9
            X.7y9 r1 = r3.A0A
            X.0ts r0 = r3.A00
            java.lang.String r0 = r1.A0S(r0, r9)
            r3.A0Q = r0
            X.8VI r0 = r3.A0I
            java.util.List r0 = r0.A07
            java.util.HashSet r1 = X.C167497y9.A02(r0, r9)
            X.8VI r0 = r3.A0I
            java.util.List r0 = r0.A07
            r0.clear()
            r0.addAll(r9)
            java.util.Iterator r2 = r1.iterator()
        L_0x0842:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0852
            java.lang.String r1 = X.AnonymousClass001.A0C(r2)
            X.1cM r0 = r3.A0B
            r0.A00(r1)
            goto L_0x0842
        L_0x0852:
            X.C174338Wd.A07(r3)
            X.C174338Wd.A01(r3)
            r3.invalidateOptionsMenu()
            return
        L_0x085c:
            java.lang.Object r0 = r1.A00
            X.8VI r0 = (X.AnonymousClass8VI) r0
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r0.A0T(r9)
            return
        L_0x0866:
            java.lang.Object r3 = r1.A00
            com.whatsapp.catalogcategory.view.fragment.CatalogCategoryExpandableGroupsListFragment r3 = (com.whatsapp.catalogcategory.view.fragment.CatalogCategoryExpandableGroupsListFragment) r3
            X.00T r0 = r3.A08
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel r2 = (com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel) r2
            X.7vc r0 = r3.A04
            if (r0 != 0) goto L_0x087d
            java.lang.String r0 = "expandableListAdapter"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x087d:
            java.util.List r1 = r0.A00
            com.whatsapp.jid.UserJid r0 = r3.A05
            if (r0 != 0) goto L_0x088a
            java.lang.String r0 = "bizJid"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x088a:
            r2.A0S(r0, r1)
            return
        L_0x088e:
            java.lang.Object r0 = r1.A00
            X.8Yv r0 = (X.C174888Yv) r0
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            com.whatsapp.components.button.ThumbnailButton r1 = r0.A08
            if (r9 == 0) goto L_0x08a0
            r1.setImageBitmap(r9)
            r0 = 0
        L_0x089c:
            r1.setVisibility(r0)
            return
        L_0x08a0:
            r0 = 0
            r1.setImageDrawable(r0)
            r0 = 8
            goto L_0x089c
        L_0x08a7:
            java.lang.Object r2 = r1.A00
            android.view.View r2 = (android.view.View) r2
            r0 = 35
            X.3YF r1 = new X.3YF
            r1.<init>(r2, r9, r0)
        L_0x08b2:
            r2.setOnClickListener(r1)
            return
        L_0x08b6:
            java.lang.Object r4 = r1.A00
            X.8Ye r4 = (X.C174718Ye) r4
            android.content.res.Resources r3 = r4.getResources()
            r1 = 2131893124(0x7f121b84, float:1.9421016E38)
            java.lang.Object[] r0 = X.AnonymousClass001.A0L()
            r2 = 0
            java.lang.String r1 = X.C36411kG.A0w(r3, r9, r0, r2, r1)
            android.widget.TextView r0 = r4.A00
            r0.setText(r1)
            r4.setVisibility(r2)
            return
        L_0x08d3:
            r0.setText(r6)
            return
        L_0x08d7:
            androidx.constraintlayout.widget.Group r0 = r3.A02
            r0.setVisibility(r1)
            com.whatsapp.TextEmojiLabel r1 = r3.A04
            r0 = 2131887220(0x7f120474, float:1.940904E38)
        L_0x08e1:
            r1.setText(r0)
            return
        L_0x08e5:
            r1.finish()
            X.17Y r2 = r1.A05
            r1 = 2131889558(0x7f120d96, float:1.9413783E38)
            r0 = 1
            r2.A06(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BA7.BTH(java.lang.Object):void");
    }
}
