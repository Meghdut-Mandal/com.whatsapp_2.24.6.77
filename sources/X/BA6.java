package X;

public class BA6 implements AnonymousClass04S {
    public Object A00;
    public final int A01;

    public BA6(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass012 r1, C001600r r2, int i) {
        r2.A08(r1, new BA6(r1, i));
    }

    public static void A01(AnonymousClass012 r1, C001600r r2, Object obj, int i) {
        r2.A08(r1, new BA6(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: X.8W7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: com.whatsapp.biz.catalog.view.activity.ProductListActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: X.9dH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v78, resolved type: X.6Uh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: X.8W7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: X.8W7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v79, resolved type: X.9dH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v80, resolved type: X.9dH} */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0429, code lost:
        if (r5.A0Q.A0S() == null) goto L_0x042b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0450, code lost:
        r0 = new X.C1497072l(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0455, code lost:
        r4.Boy(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0458, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0522, code lost:
        X.C167717yg.A01(r1, java.lang.Boolean.valueOf(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0529, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0566, code lost:
        r0 = r3.A01;
        r2 = null;
        r1 = r0.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x056b, code lost:
        if (r1 != null) goto L_0x058c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x056d, code lost:
        r1 = X.C36431kI.A0S();
        r0.A08 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x058c, code lost:
        X.C167717yg.A01(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x058f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x060e, code lost:
        r4.A0C(new X.BAK(r2, r5, r1), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0616, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0977, code lost:
        if (r9.booleanValue() == false) goto L_0x0979;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0a4f, code lost:
        r5.postDelayed(r4, 2000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0a54, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0abb, code lost:
        r1.setText(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0abe, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x0957  */
    /* JADX WARNING: Removed duplicated region for block: B:510:0x09a1 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BTH(java.lang.Object r18) {
        /*
            r17 = this;
            r2 = r18
            r1 = r17
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x0574;
                case 1: goto L_0x0557;
                case 2: goto L_0x053d;
                case 3: goto L_0x04dd;
                case 4: goto L_0x049e;
                case 5: goto L_0x047e;
                case 6: goto L_0x0a2f;
                case 7: goto L_0x0a1a;
                case 8: goto L_0x0009;
                case 9: goto L_0x0009;
                case 10: goto L_0x0474;
                case 11: goto L_0x045b;
                case 12: goto L_0x0a0e;
                case 13: goto L_0x0aa4;
                case 14: goto L_0x0406;
                case 15: goto L_0x03e8;
                case 16: goto L_0x03d5;
                case 17: goto L_0x09d8;
                case 18: goto L_0x091a;
                case 19: goto L_0x08cd;
                case 20: goto L_0x0357;
                case 21: goto L_0x02e8;
                case 22: goto L_0x08c5;
                case 23: goto L_0x0867;
                case 24: goto L_0x000f;
                case 25: goto L_0x07e5;
                case 26: goto L_0x02b7;
                case 27: goto L_0x0009;
                case 28: goto L_0x0009;
                case 29: goto L_0x0009;
                case 30: goto L_0x06f6;
                case 31: goto L_0x0299;
                case 32: goto L_0x0009;
                case 33: goto L_0x0269;
                case 34: goto L_0x06e4;
                case 35: goto L_0x025b;
                case 36: goto L_0x01f6;
                case 37: goto L_0x0674;
                case 38: goto L_0x0170;
                case 39: goto L_0x0656;
                case 40: goto L_0x0644;
                case 41: goto L_0x0617;
                case 42: goto L_0x0136;
                case 43: goto L_0x0605;
                case 44: goto L_0x05fb;
                case 45: goto L_0x006c;
                case 46: goto L_0x05f1;
                case 47: goto L_0x0590;
                case 48: goto L_0x0056;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A00
            X.C36331k8.A1J(r0, r2)
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r3 = r1.A00
            com.whatsapp.biz.cart.view.fragment.CartFragment r3 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r3
            com.whatsapp.mentions.MentionableEntry r0 = r3.A0p
            java.lang.String r0 = r0.getStringText()
            java.lang.String r8 = r0.trim()
            com.whatsapp.mentions.MentionableEntry r1 = r3.A0p
            java.lang.String r0 = ""
            r1.setText(r0)
            X.7yb r6 = r3.A0P
            X.01I r4 = r3.A0i()
            X.01L r4 = (X.AnonymousClass01L) r4
            X.7zo r5 = r3.A0O
            X.9Xp r7 = r3.A0W
            X.185 r0 = r6.A0L
            com.whatsapp.jid.UserJid r2 = r6.A0O
            X.3L0 r0 = r0.A02(r2)
            if (r0 == 0) goto L_0x004b
            java.lang.String r9 = r0.A08
            if (r9 == 0) goto L_0x004b
            X.C167697yb.A01(r4, r5, r6, r7, r8, r9)
        L_0x0041:
            X.7yS r0 = r3.A0Q
            X.6Uh r2 = r0.A02
            X.0wU r4 = r2.A0B
            r1 = 44
            goto L_0x0450
        L_0x004b:
            X.164 r1 = r6.A0G
            com.whatsapp.jobqueue.job.GetVNameCertificateJob r0 = new com.whatsapp.jobqueue.job.GetVNameCertificateJob
            r0.<init>(r2)
            r1.A01(r0)
            goto L_0x0041
        L_0x0056:
            java.lang.Object r1 = r1.A00
            X.8VJ r1 = (X.AnonymousClass8VJ) r1
            java.util.List r2 = (java.util.List) r2
            boolean r0 = X.C36401kF.A1a(r2)
            r1.A04 = r0
            r1.A03 = r2
            if (r0 == 0) goto L_0x000e
            com.whatsapp.jid.UserJid r0 = r1.A06
            X.AnonymousClass8VJ.A01(r1, r0)
            return
        L_0x006c:
            java.lang.Object r4 = r1.A00
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r4 = (com.whatsapp.biz.catalog.view.activity.ProductListActivity) r4
            int r1 = X.AnonymousClass000.A0I(r2)
            r2 = 8
            r5 = 0
            if (r1 == 0) goto L_0x0a58
            r7 = 1
            if (r1 == r7) goto L_0x0a58
            r0 = 2
            if (r1 == r0) goto L_0x0a58
            r0 = 3
            java.lang.String r6 = "plm_details_view_tag"
            if (r1 == r0) goto L_0x0116
            r0 = 4
            if (r1 == r0) goto L_0x00a9
            r0 = 5
            if (r1 != r0) goto L_0x000e
            X.7zp r0 = r4.A0F
            boolean r1 = r0.A0L()
            java.util.List r0 = r0.A05
            int r0 = r0.size()
            if (r1 == 0) goto L_0x009a
            int r0 = r0 + -1
        L_0x009a:
            if (r0 != 0) goto L_0x00d2
            android.view.View r0 = r4.A00
            r0.setVisibility(r5)
        L_0x00a1:
            r4.A0P = r5
        L_0x00a3:
            X.3L6 r0 = r4.A0L
            r0.A05(r6, r5)
            return
        L_0x00a9:
            X.0FM r0 = r4.A02
            r0.hide()
            android.view.View r0 = r4.A00
            r0.setVisibility(r2)
            X.4t3 r0 = r4.A04
            if (r0 == 0) goto L_0x00ba
            r0.A0N()
        L_0x00ba:
            X.7zp r0 = r4.A0F
            boolean r2 = r0.A0L()
            java.util.List r0 = r0.A05
            int r1 = r0.size()
            if (r2 == 0) goto L_0x00ca
            int r1 = r1 + -1
        L_0x00ca:
            X.0FM r0 = r4.A01
            if (r1 <= 0) goto L_0x010d
            r0.hide()
            goto L_0x010a
        L_0x00d2:
            X.4t3 r0 = r4.A04
            if (r0 == 0) goto L_0x00dc
            boolean r0 = r0.A0W()
            if (r0 != 0) goto L_0x00a3
        L_0x00dc:
            android.view.View r0 = r4.A00
            r0.setVisibility(r2)
            X.4t3 r3 = r4.A04
            if (r3 != 0) goto L_0x0107
            android.view.View r2 = r4.A00
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131891605(0x7f121595, float:1.9417935E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 4000(0xfa0, float:5.605E-42)
            X.4t3 r3 = X.C99304t3.A01(r2, r1, r0)
            r2 = 2131893722(0x7f121dda, float:1.9422229E38)
            r1 = 39
            X.2hx r0 = new X.2hx
            r0.<init>(r4, r1)
            r3.A0Y(r0, r2)
            r4.A04 = r3
        L_0x0107:
            r3.A0P()
        L_0x010a:
            r4.A0P = r7
            goto L_0x00a3
        L_0x010d:
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L_0x00a3
            X.0FM r0 = r4.A01
            goto L_0x0131
        L_0x0116:
            android.view.View r0 = r4.A00
            r0.setVisibility(r2)
            X.4t3 r0 = r4.A04
            if (r0 == 0) goto L_0x0122
            r0.A0N()
        L_0x0122:
            X.0FM r0 = r4.A01
            r0.hide()
            X.0FM r0 = r4.A02
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L_0x00a1
            X.0FM r0 = r4.A02
        L_0x0131:
            r0.show()
            goto L_0x00a1
        L_0x0136:
            java.lang.Object r3 = r1.A00
            com.whatsapp.biz.catalog.view.activity.CatalogListActivity r3 = (com.whatsapp.biz.catalog.view.activity.CatalogListActivity) r3
            java.lang.String r2 = (java.lang.String) r2
            r3.Bnv()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "success"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0a71
            com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet r0 = r3.A08
            if (r0 == 0) goto L_0x0154
            r0.A1p()
        L_0x0154:
            X.1Ws r1 = r3.A0B
            com.whatsapp.jid.UserJid r0 = r3.A0L
            boolean r0 = r1.A0G(r0)
            if (r0 == 0) goto L_0x0165
            X.1Ws r1 = r3.A0B
            com.whatsapp.jid.UserJid r0 = r3.A0L
            r1.A0D(r0)
        L_0x0165:
            X.6Pg r1 = r3.A0C
            com.whatsapp.jid.UserJid r0 = r3.A0L
            r1.A03(r0)
            com.whatsapp.biz.catalog.view.activity.CatalogListActivity.A01(r3)
            return
        L_0x0170:
            java.lang.Object r4 = r1.A00
            com.whatsapp.biz.catalog.view.activity.CatalogListActivity r4 = (com.whatsapp.biz.catalog.view.activity.CatalogListActivity) r4
            X.3Bc r2 = (X.C61243Bc) r2
            r0 = 2131428651(0x7f0b052b, float:1.8478953E38)
            android.view.View r5 = r4.findViewById(r0)
            X.0ts r3 = r4.A00
            java.lang.CharSequence r0 = r2.A00(r4)
            java.lang.String r1 = r0.toString()
            X.9RN r0 = new X.9RN
            r0.<init>(r5, r3, r1)
            r4.A09 = r0
            X.7yT r1 = r4.A06
            com.whatsapp.jid.UserJid r0 = r4.A0L
            r2 = 0
            X.AnonymousClass00C.A0D(r0, r2)
            X.0v0 r1 = r1.A0A
            java.lang.String r0 = r0.getRawString()
            java.lang.String r0 = r1.A0l(r0)
            if (r0 != 0) goto L_0x000e
            X.0yC r1 = r4.A0D
            r0 = 1534(0x5fe, float:2.15E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x01b0
            com.whatsapp.biz.catalog.view.activity.CatalogListActivity.A0G(r4, r2)
            return
        L_0x01b0:
            X.0v0 r0 = r4.A09
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r0)
            java.lang.String r6 = "product_share_tool_tip_show_count"
            r5 = 0
            int r1 = r0.getInt(r6, r2)
            r0 = 5
            if (r1 >= r0) goto L_0x000e
            X.9RN r0 = r4.A09
            if (r0 == 0) goto L_0x000e
            X.17Y r3 = r4.A05
            r0 = 13
            X.AVW r2 = new X.AVW
            r2.<init>(r4, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.A0I(r2, r0)
            X.0v0 r2 = r4.A09
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r2)
            int r0 = r0.getInt(r6, r5)
            int r1 = r0 + 1
            if (r1 < 0) goto L_0x0a92
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r2)
            X.C36341k9.A0v(r0, r6, r1)
            X.17Y r3 = r4.A05
            r0 = 14
            X.AVW r2 = new X.AVW
            r2.<init>(r4, r0)
            r0 = 4500(0x1194, double:2.2233E-320)
            r3.A0I(r2, r0)
            return
        L_0x01f6:
            java.lang.Object r5 = r1.A00
            X.155 r5 = (X.AnonymousClass155) r5
            X.0oj r2 = (X.C16170oj) r2
            boolean r0 = r2 instanceof X.A9J
            if (r0 == 0) goto L_0x0223
            X.A9J r2 = (X.A9J) r2
            com.whatsapp.jid.UserJid r4 = r2.A00
            java.lang.String r3 = r2.A01
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.biz.catalog.view.activity.CatalogCategoryTabsActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "selected_category_parent_id"
        L_0x0215:
            r2.putExtra(r0, r3)
            java.lang.String r0 = "business_owner_jid"
            r2.putExtra(r0, r4)
            X.1Dv r0 = r5.A01
            r0.A06(r5, r2)
            return
        L_0x0223:
            boolean r0 = r2 instanceof X.A9I
            if (r0 == 0) goto L_0x023d
            X.A9I r2 = (X.A9I) r2
            com.whatsapp.jid.UserJid r4 = r2.A00
            java.lang.String r3 = "catalog_category_dummy_root_id"
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.catalogcategory.view.activity.CatalogAllCategoryActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "category_parent_id"
            goto L_0x0215
        L_0x023d:
            boolean r0 = r2 instanceof X.A9K
            if (r0 == 0) goto L_0x000e
            X.A9K r2 = (X.A9K) r2
            com.whatsapp.jid.UserJid r6 = r2.A00
            java.lang.String r9 = r2.A01
            java.lang.String r10 = r2.A02
            r11 = 0
            java.lang.Integer r7 = X.C36361kB.A0i()
            r8 = r7
            android.content.Intent r2 = X.AnonymousClass190.A0v(r5, r6, r7, r8, r9, r10, r11)
            X.1Dv r1 = r5.A01
            r0 = 3000(0xbb8, float:4.204E-42)
            r1.A09(r5, r2, r0)
            return
        L_0x025b:
            java.lang.Object r0 = r1.A00
            com.whatsapp.biz.catalog.view.activity.CatalogListActivity r0 = (com.whatsapp.biz.catalog.view.activity.CatalogListActivity) r0
            java.lang.String r2 = (java.lang.String) r2
            com.whatsapp.WaTextView r0 = r0.A04
            if (r0 == 0) goto L_0x000e
            r0.setText(r2)
            return
        L_0x0269:
            java.lang.Object r4 = r1.A00
            com.whatsapp.biz.catalog.view.activity.CatalogListActivity r4 = (com.whatsapp.biz.catalog.view.activity.CatalogListActivity) r4
            com.whatsapp.WaTextView r0 = r4.A05
            if (r0 == 0) goto L_0x0285
            android.content.res.Resources r3 = r4.getResources()
            r1 = 2131887600(0x7f1205f0, float:1.9409812E38)
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r2)
            java.lang.String r1 = r3.getString(r1, r0)
            com.whatsapp.WaTextView r0 = r4.A05
            r0.setText(r1)
        L_0x0285:
            com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet r2 = r4.A08
            if (r2 == 0) goto L_0x000e
            X.7yT r0 = r4.A06
            X.00r r0 = r0.A04
            java.lang.Object r1 = r0.A04()
            java.lang.String r1 = (java.lang.String) r1
            X.7yT r0 = r4.A06
            X.C167637yT.A01(r0, r2, r1)
            return
        L_0x0299:
            java.lang.Object r1 = r1.A00
            com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet r1 = (com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet) r1
            boolean r0 = X.AnonymousClass000.A1X(r2)
            if (r0 == 0) goto L_0x000e
            X.7ym r0 = r1.A08
            X.00r r0 = r0.A04
            java.lang.Object r0 = r0.A04()
            X.9X7 r0 = (X.AnonymousClass9X7) r0
            if (r0 == 0) goto L_0x000e
            X.B0w r1 = r1.A0G
            java.lang.String r0 = r0.A04
            r1.Bd8(r0)
            return
        L_0x02b7:
            java.lang.Object r3 = r1.A00
            com.whatsapp.biz.cart.view.fragment.CartFragment r3 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r3
            boolean r4 = X.AnonymousClass000.A1X(r2)
            android.view.View r1 = r3.A03
            int r0 = X.C36351kA.A00(r4)
            r1.setVisibility(r0)
            X.7zo r3 = r3.A0O
            r2 = 0
        L_0x02cb:
            java.util.List r1 = r3.A0C
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x000e
            java.lang.Object r1 = r1.get(r2)
            X.9EB r1 = (X.AnonymousClass9EB) r1
            boolean r0 = r1 instanceof X.AnonymousClass8VM
            if (r0 == 0) goto L_0x02e5
            X.8VM r1 = (X.AnonymousClass8VM) r1
            r1.A01 = r4
            r3.A07(r2)
            return
        L_0x02e5:
            int r2 = r2 + 1
            goto L_0x02cb
        L_0x02e8:
            java.lang.Object r5 = r1.A00
            com.whatsapp.biz.cart.view.fragment.CartFragment r5 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r5
            X.8ym r2 = (X.C187938ym) r2
            X.7yL r1 = r5.A0R
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x0301
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0301
            X.8ym r0 = X.C187938ym.NO_CHANGES
            if (r2 == r0) goto L_0x000e
            r0 = 0
            com.whatsapp.biz.cart.view.fragment.CartFragment.A05(r0, r2, r5)
            return
        L_0x0301:
            X.7yS r0 = r5.A0Q
            X.08S r0 = r0.A01
            java.lang.Object r0 = r0.A04()
            X.9fx r0 = (X.C199779fx) r0
            if (r0 == 0) goto L_0x0355
            boolean r6 = r0.A01
        L_0x030f:
            X.7yL r4 = r5.A0R
            r3 = 0
            X.AnonymousClass00C.A0D(r2, r3)
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x031d
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x033b
        L_0x031d:
            X.9fn r0 = r4.A00
            r1 = 0
            if (r0 == 0) goto L_0x0329
            boolean r0 = r0.A01
            X.9fn r1 = new X.9fn
            r1.<init>(r2, r0)
        L_0x0329:
            r4.A00 = r1
            r4.A01 = r3
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x033b
            if (r1 == 0) goto L_0x033b
            X.1Rs r0 = r4.A03
            r0.A0D(r1)
            r0 = 0
            r4.A00 = r0
        L_0x033b:
            if (r6 == 0) goto L_0x000e
            X.7yS r0 = r5.A0Q
            X.6Dt r0 = r0.A0S()
            if (r0 == 0) goto L_0x000e
            X.7yS r0 = r5.A0Q
            r3 = 1
            X.6Uh r2 = r0.A02
            X.0wU r4 = r2.A0B
            r1 = 11
            X.75B r0 = new X.75B
            r0.<init>((int) r1, (java.lang.Object) r2, (boolean) r3)
            goto L_0x0455
        L_0x0355:
            r6 = 0
            goto L_0x030f
        L_0x0357:
            java.lang.Object r8 = r1.A00
            com.whatsapp.biz.cart.view.fragment.CartFragment r8 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r8
            X.5Zk r2 = (X.C109865Zk) r2
            X.7yL r5 = r8.A0R
            r4 = 0
            X.AnonymousClass00C.A0D(r2, r4)
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x03b4
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x03b4
            boolean r0 = r2 instanceof X.C102194zS
            if (r0 == 0) goto L_0x000e
            boolean r0 = r2 instanceof X.C102174zQ
            r7 = 0
            if (r0 == 0) goto L_0x03ac
            r6 = 2131888513(0x7f120981, float:1.9411663E38)
            r5 = 1
            java.lang.Object[] r4 = new java.lang.Object[r5]
            X.4zQ r2 = (X.C102174zQ) r2
            X.0ts r3 = r8.A0g
            X.AnonymousClass00C.A0D(r3, r7)
            X.6Tk r1 = r2.A00
            java.math.BigDecimal r0 = r2.A01
            java.lang.String r0 = r1.A03(r3, r0, r5)
            X.AnonymousClass00C.A08(r0)
            r4[r7] = r0
            java.lang.String r1 = r8.A0o(r6, r4)
        L_0x0392:
            android.view.View r0 = r8.A0d()
            X.4t3 r1 = X.C99304t3.A01(r0, r1, r7)
            r2 = 2131433835(0x7f0b196b, float:1.8489467E38)
            android.view.ViewGroup r0 = r1.A0H
            android.view.View r0 = r0.findViewById(r2)
            if (r0 == 0) goto L_0x0a99
            r1.A0U(r0)
            r1.A0P()
            return
        L_0x03ac:
            r0 = 2131888512(0x7f120980, float:1.9411661E38)
            java.lang.String r1 = r8.A0n(r0)
            goto L_0x0392
        L_0x03b4:
            X.9fn r0 = r5.A00
            r3 = 0
            if (r0 == 0) goto L_0x03c2
            boolean r1 = r2 instanceof X.C102194zS
            X.8ym r0 = r0.A00
            X.9fn r3 = new X.9fn
            r3.<init>(r0, r1)
        L_0x03c2:
            r5.A00 = r3
            r5.A02 = r4
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x000e
            if (r3 == 0) goto L_0x000e
            X.1Rs r0 = r5.A03
            r0.A0D(r3)
            r0 = 0
            r5.A00 = r0
            return
        L_0x03d5:
            java.lang.Object r1 = r1.A00
            com.whatsapp.biz.cart.view.fragment.CartFragment r1 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r1
            boolean r0 = X.AnonymousClass000.A1X(r2)
            if (r0 == 0) goto L_0x000e
            android.widget.TextView r1 = r1.A04
            if (r1 == 0) goto L_0x000e
            r0 = 2131893998(0x7f121eee, float:1.9422788E38)
            goto L_0x0abb
        L_0x03e8:
            java.lang.Object r3 = r1.A00
            com.whatsapp.biz.cart.view.fragment.CartFragment r3 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r3
            boolean r0 = X.AnonymousClass000.A1X(r2)
            if (r0 == 0) goto L_0x000e
            X.7yb r1 = r3.A0P
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x03fd
            X.00s r0 = r1.A08
            X.C36331k8.A13(r0)
        L_0x03fd:
            X.3L6 r2 = r3.A0s
            r1 = 0
            java.lang.String r0 = "cart_view_tag"
            r2.A05(r0, r1)
            return
        L_0x0406:
            java.lang.Object r5 = r1.A00
            com.whatsapp.biz.cart.view.fragment.CartFragment r5 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r5
            boolean r0 = X.AnonymousClass000.A1X(r2)
            if (r0 == 0) goto L_0x000e
            X.7yS r0 = r5.A0Q
            X.08S r0 = r0.A01
            java.lang.Object r0 = r0.A04()
            X.9fx r0 = (X.C199779fx) r0
            if (r0 == 0) goto L_0x0459
            boolean r0 = r0.A01
        L_0x041e:
            X.7yL r4 = r5.A0R
            if (r0 == 0) goto L_0x042b
            X.7yS r0 = r5.A0Q
            X.6Dt r0 = r0.A0S()
            r3 = 1
            if (r0 != 0) goto L_0x042c
        L_0x042b:
            r3 = 0
        L_0x042c:
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x0443
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x0443
            X.8ym r2 = X.C187938ym.NO_CHANGES
            r1 = 0
            X.9fn r0 = new X.9fn
            r0.<init>(r2, r1)
            r4.A00 = r0
            r0 = 1
            r4.A01 = r0
            r4.A02 = r3
        L_0x0443:
            X.7yb r1 = r5.A0P
            r0 = 0
            r1.A00 = r0
            r1.A01 = r0
            X.9dH r2 = r1.A0I
            X.0wU r4 = r2.A0N
            r1 = 43
        L_0x0450:
            X.72l r0 = new X.72l
            r0.<init>(r2, r1)
        L_0x0455:
            r4.Boy(r0)
            return
        L_0x0459:
            r0 = 0
            goto L_0x041e
        L_0x045b:
            java.lang.Object r1 = r1.A00
            com.whatsapp.biz.cart.view.fragment.CartFragment r1 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r1
            boolean r0 = X.AnonymousClass000.A1X(r2)
            if (r0 == 0) goto L_0x000e
            r2 = 0
            r1.A12 = r2
            r0 = 1
            com.whatsapp.biz.cart.view.fragment.CartFragment.A09(r1, r0)
            X.3L6 r1 = r1.A0s
            java.lang.String r0 = "order_creates_tag"
            r1.A05(r0, r2)
            return
        L_0x0474:
            java.lang.Object r0 = r1.A00
            android.app.Dialog r0 = (android.app.Dialog) r0
            if (r0 == 0) goto L_0x000e
            r0.show()
            return
        L_0x047e:
            boolean r0 = X.AnonymousClass000.A1X(r2)
            if (r0 == 0) goto L_0x000e
            java.lang.Object r1 = r1.A00
            androidx.biometric.BiometricFragment r1 = (androidx.biometric.BiometricFragment) r1
            r0 = 1
            r1.A1a(r0)
            r1.A1Y()
            X.7yg r0 = r1.A01
            r2 = 0
            X.00s r1 = r0.A0E
            if (r1 != 0) goto L_0x0522
            X.00s r1 = X.C36431kI.A0S()
            r0.A0E = r1
            goto L_0x0522
        L_0x049e:
            boolean r0 = X.AnonymousClass000.A1X(r2)
            if (r0 == 0) goto L_0x000e
            java.lang.Object r2 = r1.A00
            androidx.biometric.BiometricFragment r2 = (androidx.biometric.BiometricFragment) r2
            boolean r0 = r2.A1d()
            if (r0 == 0) goto L_0x04b8
            androidx.biometric.BiometricFragment.A05(r2)
        L_0x04b1:
            X.7yg r1 = r2.A01
            r0 = 0
            r1.A0V(r0)
            return
        L_0x04b8:
            X.7yg r0 = r2.A01
            java.lang.CharSequence r1 = r0.A0G
            if (r1 != 0) goto L_0x04c8
            X.9Mu r0 = r0.A06
            if (r0 == 0) goto L_0x04d5
            java.lang.CharSequence r1 = r0.A01
            if (r1 != 0) goto L_0x04c8
            java.lang.String r1 = ""
        L_0x04c8:
            r0 = 13
            androidx.biometric.BiometricFragment.A07(r2, r1, r0)
            r2.A1Y()
            r0 = 2
            r2.A1a(r0)
            goto L_0x04b1
        L_0x04d5:
            r0 = 2131896491(0x7f1228ab, float:1.9427845E38)
            java.lang.String r1 = r2.A0n(r0)
            goto L_0x04c8
        L_0x04dd:
            boolean r0 = X.AnonymousClass000.A1X(r2)
            if (r0 == 0) goto L_0x000e
            java.lang.Object r3 = r1.A00
            androidx.biometric.BiometricFragment r3 = (androidx.biometric.BiometricFragment) r3
            boolean r0 = androidx.biometric.BiometricFragment.A09(r3)
            if (r0 == 0) goto L_0x0508
            r0 = 2131889607(0x7f120dc7, float:1.9413882E38)
            java.lang.String r2 = r3.A0n(r0)
            if (r2 != 0) goto L_0x04fd
            r0 = 2131896491(0x7f1228ab, float:1.9427845E38)
            java.lang.String r2 = r3.A0n(r0)
        L_0x04fd:
            X.7yg r1 = r3.A01
            r0 = 2
            r1.A0T(r0)
            X.7yg r0 = r3.A01
            r0.A0U(r2)
        L_0x0508:
            X.7yg r1 = r3.A01
            boolean r0 = r1.A0I
            if (r0 != 0) goto L_0x052a
            java.lang.String r1 = "BiometricFragment"
            java.lang.String r0 = "Failure not sent to client. Client is not awaiting a result."
            android.util.Log.w(r1, r0)
        L_0x0515:
            X.7yg r0 = r3.A01
            r2 = 0
            X.00s r1 = r0.A0D
            if (r1 != 0) goto L_0x0522
            X.00s r1 = X.C36431kI.A0S()
            r0.A0D = r1
        L_0x0522:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            X.C167717yg.A01(r1, r0)
            return
        L_0x052a:
            java.util.concurrent.Executor r2 = r1.A0H
            if (r2 != 0) goto L_0x0533
            X.AYq r2 = new X.AYq
            r2.<init>()
        L_0x0533:
            r1 = 0
            X.759 r0 = new X.759
            r0.<init>((androidx.biometric.BiometricFragment) r3, (int) r1)
            r2.execute(r0)
            goto L_0x0515
        L_0x053d:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L_0x000e
            java.lang.Object r3 = r1.A00
            androidx.biometric.BiometricFragment r3 = (androidx.biometric.BiometricFragment) r3
            boolean r0 = androidx.biometric.BiometricFragment.A09(r3)
            if (r0 == 0) goto L_0x0566
            X.7yg r1 = r3.A01
            r0 = 2
            r1.A0T(r0)
            X.7yg r0 = r3.A01
            r0.A0U(r2)
            goto L_0x0566
        L_0x0557:
            X.9Th r2 = (X.C195249Th) r2
            if (r2 == 0) goto L_0x000e
            java.lang.Object r3 = r1.A00
            androidx.biometric.BiometricFragment r3 = (androidx.biometric.BiometricFragment) r3
            int r1 = r2.A00
            java.lang.CharSequence r0 = r2.A01
            r3.A1b(r1, r0)
        L_0x0566:
            X.7yg r0 = r3.A01
            r2 = 0
            X.00s r1 = r0.A08
            if (r1 != 0) goto L_0x058c
            X.00s r1 = X.C36431kI.A0S()
            r0.A08 = r1
            goto L_0x058c
        L_0x0574:
            X.9G0 r2 = (X.AnonymousClass9G0) r2
            if (r2 == 0) goto L_0x000e
            java.lang.Object r0 = r1.A00
            androidx.biometric.BiometricFragment r0 = (androidx.biometric.BiometricFragment) r0
            androidx.biometric.BiometricFragment.A06(r0, r2)
            X.7yg r0 = r0.A01
            r2 = 0
            X.00s r1 = r0.A0A
            if (r1 != 0) goto L_0x058c
            X.00s r1 = X.C36431kI.A0S()
            r0.A0A = r1
        L_0x058c:
            X.C167717yg.A01(r1, r2)
            return
        L_0x0590:
            java.lang.Object r7 = r1.A00
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r7 = (com.whatsapp.biz.catalog.view.activity.ProductListActivity) r7
            java.util.List r2 = (java.util.List) r2
            X.7y9 r1 = r7.A0B
            X.0ts r0 = r7.A00
            java.lang.String r0 = r1.A0S(r0, r2)
            r7.A0N = r0
            X.7zp r0 = r7.A0F
            java.util.List r0 = r0.A04
            java.util.HashSet r8 = X.C167497y9.A02(r0, r2)
            X.7zp r1 = r7.A0F
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            java.util.List r0 = r1.A04
            r0.clear()
            r0.addAll(r2)
            X.7zp r6 = r7.A0F
            java.util.List r5 = r6.A05
            int r4 = r5.size()
            r3 = 0
        L_0x05bf:
            if (r3 >= r4) goto L_0x05dd
            java.lang.Object r1 = r5.get(r3)
            X.AyP r1 = (X.C22913AyP) r1
            boolean r0 = r1 instanceof X.A96
            if (r0 == 0) goto L_0x05da
            X.A96 r1 = (X.A96) r1
            X.9up r0 = r1.A00
            java.lang.String r0 = r0.A0F
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x05da
            r6.A07(r3)
        L_0x05da:
            int r3 = r3 + 1
            goto L_0x05bf
        L_0x05dd:
            r7.invalidateOptionsMenu()
            int r0 = r2.size()
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            r7.A0O = r0
            com.whatsapp.biz.catalog.view.activity.ProductListActivity.A07(r7)
            com.whatsapp.biz.catalog.view.activity.ProductListActivity.A01(r7)
            return
        L_0x05f1:
            java.lang.Object r5 = r1.A00
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r5 = (com.whatsapp.biz.catalog.view.activity.ProductListActivity) r5
            X.1KK r4 = r5.A08
            com.whatsapp.jid.UserJid r3 = r5.A0J
            r1 = 4
            goto L_0x060e
        L_0x05fb:
            java.lang.Object r0 = r1.A00
            X.8W7 r0 = (X.AnonymousClass8W7) r0
            java.util.List r2 = (java.util.List) r2
            r0.A3i(r2)
            return
        L_0x0605:
            java.lang.Object r5 = r1.A00
            X.8W7 r5 = (X.AnonymousClass8W7) r5
            X.1KK r4 = r5.A03
            com.whatsapp.jid.UserJid r3 = r5.A0L
            r1 = 2
        L_0x060e:
            X.BAK r0 = new X.BAK
            r0.<init>(r2, r5, r1)
            r4.A0C(r0, r3)
            return
        L_0x0617:
            java.lang.Object r5 = r1.A00
            com.whatsapp.biz.catalog.view.activity.CatalogListActivity r5 = (com.whatsapp.biz.catalog.view.activity.CatalogListActivity) r5
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            X.8VJ r4 = r5.A0H
            java.lang.Boolean r0 = r4.A01
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 != 0) goto L_0x0640
            r4.A01 = r2
            r3 = 0
            java.util.List r2 = r4.A00
            int r1 = r2.size()
        L_0x0630:
            if (r3 >= r1) goto L_0x0640
            java.lang.Object r0 = r2.get(r3)
            boolean r0 = r0 instanceof X.AnonymousClass8WQ
            if (r0 == 0) goto L_0x063d
            r4.A07(r3)
        L_0x063d:
            int r3 = r3 + 1
            goto L_0x0630
        L_0x0640:
            com.whatsapp.biz.catalog.view.activity.CatalogListActivity.A0F(r5)
            return
        L_0x0644:
            java.lang.Object r1 = r1.A00
            X.8W7 r1 = (X.AnonymousClass8W7) r1
            boolean r0 = X.AnonymousClass000.A1X(r2)
            X.8VJ r1 = r1.A0H
            r1.A05 = r0
            com.whatsapp.jid.UserJid r0 = r1.A06
            X.AnonymousClass8VJ.A01(r1, r0)
            return
        L_0x0656:
            java.lang.Object r5 = r1.A00
            com.whatsapp.biz.catalog.view.activity.CatalogListActivity r5 = (com.whatsapp.biz.catalog.view.activity.CatalogListActivity) r5
            boolean r1 = X.AnonymousClass000.A1X(r2)
            r4 = 0
            r0 = 1
            com.whatsapp.wds.components.button.WDSButton r3 = r5.A0J
            r2 = 2131893243(0x7f121bfb, float:1.9421257E38)
            if (r1 == 0) goto L_0x066a
            r2 = 2131887595(0x7f1205eb, float:1.9409802E38)
        L_0x066a:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = r5.A0P
            r1[r4] = r0
            X.C36341k9.A0s(r5, r3, r1, r2)
            return
        L_0x0674:
            java.lang.Object r4 = r1.A00
            com.whatsapp.biz.catalog.view.activity.CatalogListActivity r4 = (com.whatsapp.biz.catalog.view.activity.CatalogListActivity) r4
            X.9uZ r2 = (X.C207109uZ) r2
            androidx.recyclerview.widget.RecyclerView r5 = r4.A00
            X.8VJ r3 = r4.A0H
            X.A8V r1 = new X.A8V
            r1.<init>(r4)
            X.4nC r0 = new X.4nC
            r0.<init>(r4, r5, r1, r3)
            r5.A0t(r0)
            X.9tg r5 = r2.A02
            r7 = 0
            if (r5 == 0) goto L_0x06e1
            java.lang.String r7 = r5.A00
            java.lang.String r0 = r5.A01
            java.lang.String r6 = r5.A02
        L_0x0696:
            X.8VJ r3 = r4.A0H
            r1 = 1
            if (r7 == 0) goto L_0x06a7
            if (r0 == 0) goto L_0x06a7
            X.9Oz r0 = r3.A0A
            java.lang.String r0 = r0.A00(r7, r6)
            r3.A01 = r0
            r3.A02 = r6
        L_0x06a7:
            boolean r0 = r3.A06
            if (r0 == r1) goto L_0x06ba
            r3.A06 = r1
            java.util.List r0 = r3.A00
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x06ba
            com.whatsapp.jid.UserJid r0 = r3.A06
            X.AnonymousClass8VJ.A01(r3, r0)
        L_0x06ba:
            androidx.recyclerview.widget.RecyclerView r1 = r4.A00
            r3 = 0
            X.B6w r0 = new X.B6w
            r0.<init>(r4, r3)
            r1.A0v(r0)
            X.7yT r1 = r4.A06
            com.whatsapp.jid.UserJid r0 = r4.A0L
            X.AnonymousClass00C.A0D(r0, r3)
            if (r5 == 0) goto L_0x06db
            java.lang.String r3 = r5.A00
            if (r3 == 0) goto L_0x06db
            X.0v0 r1 = r1.A0A
            java.lang.String r0 = r0.getRawString()
            r1.A1i(r0, r3)
        L_0x06db:
            X.7yT r0 = r4.A06
            r0.A0S(r2)
            return
        L_0x06e1:
            r0 = r7
            r6 = r7
            goto L_0x0696
        L_0x06e4:
            java.lang.Object r4 = r1.A00
            com.whatsapp.biz.catalog.view.activity.CatalogListActivity r4 = (com.whatsapp.biz.catalog.view.activity.CatalogListActivity) r4
            java.lang.String r2 = (java.lang.String) r2
            X.9fJ r3 = r4.A0A
            r1 = 0
            X.B8G r0 = new X.B8G
            r0.<init>(r4, r1)
            r3.A01(r4, r0, r2)
            return
        L_0x06f6:
            java.lang.Object r3 = r1.A00
            com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet r3 = (com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet) r3
            X.9X7 r2 = (X.AnonymousClass9X7) r2
            com.whatsapp.WaEditText r0 = r3.A04
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x071e
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r2.A04
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x071e
            com.whatsapp.WaEditText r0 = r3.A04
            r0.setText(r1)
            com.whatsapp.WaEditText r1 = r3.A04
            int r0 = r1.length()
            r1.setSelection(r0)
        L_0x071e:
            android.content.Context r12 = r3.A1D()
            com.whatsapp.TextEmojiLabel r0 = r3.A03
            if (r0 == 0) goto L_0x078d
            if (r12 == 0) goto L_0x078d
            X.9VU r11 = r2.A00
            X.3Bc r9 = r11.A00
            r10 = 2
            r8 = 1
            r7 = 0
            r4 = 3
            r0 = 2131887701(0x7f120655, float:1.9410017E38)
            java.lang.String r6 = r3.A0n(r0)
            r0 = 5
            android.text.Spannable[] r5 = new android.text.Spannable[r0]
            java.lang.CharSequence r1 = r9.A00(r12)
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r1)
            r5[r7] = r0
            java.lang.String r1 = r11.A01
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r1)
            r5[r8] = r0
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r1)
            r5[r10] = r0
            java.lang.CharSequence r1 = r9.A00(r12)
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r1)
            r5[r4] = r0
            r8 = 4
            r0 = 2131896681(0x7f122969, float:1.942823E38)
            java.lang.String r16 = "https://faq.whatsapp.com/general/security-and-privacy/about-sharing-your-information-with-businesses-on-whatsapp"
            java.lang.String r0 = r3.A0n(r0)
            android.text.SpannableStringBuilder r4 = X.C36441kJ.A0P(r0)
            X.17Y r14 = r3.A01
            X.0yb r15 = r3.A09
            X.1e2 r13 = r3.A02
            X.21s r11 = new X.21s
            r11.<init>(r12, r13, r14, r15, r16)
            int r1 = r0.length()
            r0 = 33
            r4.setSpan(r11, r7, r1, r0)
            r5[r8] = r4
            android.text.SpannableStringBuilder r1 = X.AnonymousClass6YV.A04(r6, r5)
            com.whatsapp.TextEmojiLabel r0 = r3.A03
            r0.setText(r1)
        L_0x078d:
            android.content.Context r4 = r3.A1D()
            com.whatsapp.WaTextView r1 = r3.A06
            if (r1 == 0) goto L_0x07a0
            if (r4 == 0) goto L_0x07a0
            X.3Bc r0 = r2.A02
            java.lang.CharSequence r0 = r0.A00(r4)
            r1.setText(r0)
        L_0x07a0:
            android.content.Context r4 = r3.A1D()
            com.whatsapp.WaTextView r1 = r3.A07
            if (r1 == 0) goto L_0x07b3
            if (r4 == 0) goto L_0x07b3
            X.3Bc r0 = r2.A03
            java.lang.CharSequence r0 = r0.A00(r4)
            r1.setText(r0)
        L_0x07b3:
            android.content.Context r4 = r3.A1D()
            com.whatsapp.WaTextView r1 = r3.A05
            if (r1 == 0) goto L_0x07c6
            if (r4 == 0) goto L_0x07c6
            X.3Bc r0 = r2.A01
            java.lang.CharSequence r0 = r0.A00(r4)
            r1.setText(r0)
        L_0x07c6:
            boolean r0 = r2.A05
            if (r0 == 0) goto L_0x07ce
            r3.A1q()
            return
        L_0x07ce:
            com.whatsapp.TextEmojiLabel r1 = r3.A03
            r0 = 0
            r1.setVisibility(r0)
            com.whatsapp.WaTextView r1 = r3.A05
            r0 = 8
            r1.setVisibility(r0)
            com.whatsapp.WaEditText r0 = r3.A04
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.clearColorFilter()
            return
        L_0x07e5:
            java.lang.Object r5 = r1.A00
            com.whatsapp.biz.cart.view.fragment.CartFragment r5 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r5
            X.9uZ r2 = (X.C207109uZ) r2
            X.7zo r6 = r5.A0O
            r6.A00 = r2
            java.util.List r0 = r6.A0C
            int r4 = r0.size()
            java.util.List r0 = X.AnonymousClass0D3.A0I
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r1 = 0
            X.0Ca r0 = r6.A01
            r0.A04(r3, r1, r4)
            X.7yb r4 = r5.A0P
            int r8 = r5.A02
            int r9 = r5.A01
            X.7zo r0 = r5.A0O
            java.util.ArrayList r1 = r0.A0M()
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x084d
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x084d
            r0 = 1
            r4.A00 = r0
            java.util.ArrayList r7 = X.C36401kF.A0v(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x0820:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0832
            X.6B4 r0 = X.C165617ti.A0M(r1)
            X.9up r0 = r0.A02
            java.lang.String r0 = r0.A0F
            r7.add(r0)
            goto L_0x0820
        L_0x0832:
            X.9dH r3 = r4.A0I
            com.whatsapp.jid.UserJid r6 = r4.A0O
            X.9UB r1 = r4.A0K
            java.util.Set r0 = X.AnonymousClass96V.A00()
            X.9W6 r5 = r1.A00(r2, r0)
            X.9Wu r4 = new X.9Wu
            r4.<init>(r5, r6, r7, r8, r9)
            X.8V9 r1 = r3.A0F
            X.B1n r0 = r3.A0M
            r1.A03(r4, r0)
            return
        L_0x084d:
            X.3L6 r3 = r5.A0s
            X.7zo r0 = r5.A0O
            int r0 = r0.A0L()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "cart_view_tag"
            java.lang.String r0 = "ProductsCount"
            r3.A03(r2, r0, r1)
            X.3L6 r1 = r5.A0s
            r0 = 1
            r1.A05(r2, r0)
            return
        L_0x0867:
            java.lang.Object r4 = r1.A00
            com.whatsapp.biz.cart.view.fragment.CartFragment r4 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r4
            X.9fn r2 = (X.C199689fn) r2
            X.01I r0 = r4.A0i()
            X.14u r0 = (X.C225314u) r0
            r0.Bnv()
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x08a5
            X.1qm r3 = X.AnonymousClass3LW.A04(r4)
            r0 = 0
            r3.A0r(r0)
            r0 = 2131888512(0x7f120980, float:1.9411661E38)
            r3.A0c(r0)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            X.9x8 r0 = X.C207799x8.A00
            r3.A0m(r4, r0, r1)
            X.0FM r3 = r3.create()
        L_0x0894:
            X.8ym r2 = r2.A00
            X.8ym r0 = X.C187938ym.NO_CHANGES
            if (r2 == r0) goto L_0x08a7
            r1 = 10
            X.BA6 r0 = new X.BA6
            r0.<init>(r3, r1)
            com.whatsapp.biz.cart.view.fragment.CartFragment.A05(r0, r2, r4)
            return
        L_0x08a5:
            r3 = 0
            goto L_0x0894
        L_0x08a7:
            if (r3 == 0) goto L_0x08ad
            r3.show()
            return
        L_0x08ad:
            android.view.View r2 = r4.A0d()
            android.content.Context r1 = r4.A0a()
            r0 = 2131887631(0x7f12060f, float:1.9409875E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 0
            X.4t3 r0 = X.C99304t3.A01(r2, r1, r0)
            r0.A0P()
            return
        L_0x08c5:
            java.lang.Object r0 = r1.A00
            com.whatsapp.biz.cart.view.fragment.CartFragment r0 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r0
            com.whatsapp.biz.cart.view.fragment.CartFragment.A07(r0)
            return
        L_0x08cd:
            java.lang.Object r3 = r1.A00
            com.whatsapp.biz.cart.view.fragment.CartFragment r3 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r3
            android.util.Pair r2 = (android.util.Pair) r2
            X.7zo r5 = r3.A0O
            java.lang.Object r7 = r2.first
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r2.second
            java.lang.Number r6 = (java.lang.Number) r6
            if (r7 == 0) goto L_0x0913
            if (r6 == 0) goto L_0x0913
            r4 = 0
        L_0x08e2:
            java.util.List r1 = r5.A0C
            int r0 = r1.size()
            if (r4 >= r0) goto L_0x0913
            java.lang.Object r1 = r1.get(r4)
            X.9EB r1 = (X.AnonymousClass9EB) r1
            boolean r0 = r1 instanceof X.AnonymousClass8VL
            if (r0 == 0) goto L_0x0917
            X.8VL r1 = (X.AnonymousClass8VL) r1
            X.6B4 r2 = r1.A00
            X.9up r0 = r2.A02
            java.lang.String r0 = r0.A0F
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0917
            int r0 = r6.intValue()
            long r0 = (long) r0
            r2.A00 = r0
            java.util.List r0 = X.AnonymousClass0D3.A0I
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            X.0Ca r1 = r5.A01
            r0 = 1
            r1.A04(r2, r4, r0)
        L_0x0913:
            com.whatsapp.biz.cart.view.fragment.CartFragment.A06(r3)
            return
        L_0x0917:
            int r4 = r4 + 1
            goto L_0x08e2
        L_0x091a:
            java.lang.Object r4 = r1.A00
            com.whatsapp.biz.cart.view.fragment.CartFragment r4 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r4
            java.util.List r2 = (java.util.List) r2
            X.7zo r6 = r4.A0O
            X.7yb r0 = r4.A0P
            X.00s r0 = r0.A07
            java.lang.Object r9 = r0.A04()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            r6.A01 = r0
            java.util.List r5 = r6.A0C
            int r3 = r5.size()
        L_0x0939:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x09a3
            java.lang.Object r1 = r5.get(r3)
            boolean r0 = r1 instanceof X.AnonymousClass8VO
            if (r0 != 0) goto L_0x094b
            boolean r0 = r1 instanceof X.AnonymousClass8VL
            if (r0 == 0) goto L_0x0939
            int r3 = r3 + 1
        L_0x094b:
            X.8VO r7 = X.C168167zo.A01(r6, r3)
            int r3 = r5.size()
        L_0x0953:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x09a1
            java.lang.Object r1 = r5.get(r3)
            boolean r0 = r1 instanceof X.AnonymousClass8VP
            if (r0 != 0) goto L_0x0969
            boolean r0 = r1 instanceof X.AnonymousClass8VL
            if (r0 != 0) goto L_0x0967
            boolean r0 = r1 instanceof X.AnonymousClass8VO
            if (r0 == 0) goto L_0x0953
        L_0x0967:
            int r3 = r3 + 1
        L_0x0969:
            X.8VP r8 = X.C168167zo.A00(r6, r3)
            r5.clear()
            if (r9 == 0) goto L_0x0979
            boolean r0 = r9.booleanValue()
            r1 = 1
            if (r0 != 0) goto L_0x097a
        L_0x0979:
            r1 = 0
        L_0x097a:
            X.8VM r0 = new X.8VM
            r0.<init>(r1)
            r5.add(r0)
            java.util.Iterator r3 = r2.iterator()
        L_0x0986:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x09a5
            X.6B4 r2 = X.C165617ti.A0M(r3)
            X.9up r0 = r2.A02
            int r0 = r0.A00
            if (r0 != 0) goto L_0x0986
            java.util.Date r1 = r6.A01
            X.8VL r0 = new X.8VL
            r0.<init>(r2, r1)
            r5.add(r0)
            goto L_0x0986
        L_0x09a1:
            r3 = -1
            goto L_0x0969
        L_0x09a3:
            r3 = -1
            goto L_0x094b
        L_0x09a5:
            if (r7 == 0) goto L_0x09aa
            r5.add(r7)
        L_0x09aa:
            if (r8 == 0) goto L_0x09af
            r5.add(r8)
        L_0x09af:
            r6.A06()
            X.7yb r0 = r4.A0P
            X.9dH r3 = r0.A0I
            X.00s r0 = r3.A00
            if (r0 == 0) goto L_0x09cf
            java.lang.Object r0 = r0.A04()
            if (r0 == 0) goto L_0x09cf
            X.00s r1 = r3.A00
            if (r1 == 0) goto L_0x09cb
            java.lang.Object r0 = r1.A04()
            r1.A0C(r0)
        L_0x09cb:
            com.whatsapp.biz.cart.view.fragment.CartFragment.A06(r4)
            return
        L_0x09cf:
            X.1KK r2 = r3.A0C
            com.whatsapp.jid.UserJid r1 = r3.A0K
            r0 = 3
            X.BAG.A00(r2, r1, r3, r0)
            goto L_0x09cb
        L_0x09d8:
            java.lang.Object r6 = r1.A00
            com.whatsapp.biz.cart.view.fragment.CartFragment r6 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r6
            java.lang.String r2 = (java.lang.String) r2
            X.7zo r5 = r6.A0O
            r4 = 0
        L_0x09e1:
            java.util.List r3 = r5.A0C
            int r0 = r3.size()
            if (r4 >= r0) goto L_0x0a07
            java.lang.Object r1 = r3.get(r4)
            X.9EB r1 = (X.AnonymousClass9EB) r1
            boolean r0 = r1 instanceof X.AnonymousClass8VL
            if (r0 == 0) goto L_0x0a0b
            X.8VL r1 = (X.AnonymousClass8VL) r1
            X.6B4 r0 = r1.A00
            X.9up r0 = r0.A02
            java.lang.String r0 = r0.A0F
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0a0b
            r3.remove(r4)
            r5.A09(r4)
        L_0x0a07:
            com.whatsapp.biz.cart.view.fragment.CartFragment.A06(r6)
            return
        L_0x0a0b:
            int r4 = r4 + 1
            goto L_0x09e1
        L_0x0a0e:
            java.lang.Object r1 = r1.A00
            com.whatsapp.biz.cart.view.fragment.CartFragment r1 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r1
            boolean r0 = X.AnonymousClass000.A1X(r2)
            com.whatsapp.biz.cart.view.fragment.CartFragment.A09(r1, r0)
            return
        L_0x0a1a:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.Object r0 = r1.A00
            androidx.biometric.FingerprintDialogFragment r0 = (androidx.biometric.FingerprintDialogFragment) r0
            android.os.Handler r5 = r0.A05
            java.lang.Runnable r4 = r0.A06
            r5.removeCallbacks(r4)
            android.widget.TextView r0 = r0.A02
            if (r0 == 0) goto L_0x0a4f
            r0.setText(r2)
            goto L_0x0a4f
        L_0x0a2f:
            java.lang.Number r2 = (java.lang.Number) r2
            java.lang.Object r3 = r1.A00
            androidx.biometric.FingerprintDialogFragment r3 = (androidx.biometric.FingerprintDialogFragment) r3
            android.os.Handler r5 = r3.A05
            java.lang.Runnable r4 = r3.A06
            r5.removeCallbacks(r4)
            int r2 = r2.intValue()
            r3.A1h(r2)
            android.widget.TextView r1 = r3.A02
            if (r1 == 0) goto L_0x0a4f
            r0 = 2
            if (r2 != r0) goto L_0x0a55
            int r0 = r3.A00
        L_0x0a4c:
            r1.setTextColor(r0)
        L_0x0a4f:
            r0 = 2000(0x7d0, double:9.88E-321)
            r5.postDelayed(r4, r0)
            return
        L_0x0a55:
            int r0 = r3.A01
            goto L_0x0a4c
        L_0x0a58:
            android.view.View r0 = r4.A00
            r0.setVisibility(r2)
            X.4t3 r0 = r4.A04
            if (r0 == 0) goto L_0x0a64
            r0.A0N()
        L_0x0a64:
            X.0FM r0 = r4.A01
            r0.hide()
            X.0FM r0 = r4.A02
            r0.hide()
            r4.A0P = r5
            return
        L_0x0a71:
            java.lang.String r0 = "unserviceable_location"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0a80
            r0 = 2131895241(0x7f1223c9, float:1.942531E38)
        L_0x0a7c:
            r3.BO5(r0)
            return
        L_0x0a80:
            java.lang.String r0 = "invalid_postcode"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0a8e
            com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet r0 = r3.A08
            r0.A1q()
            return
        L_0x0a8e:
            r0 = 2131894457(0x7f1220b9, float:1.942372E38)
            goto L_0x0a7c
        L_0x0a92:
            java.lang.String r0 = "Show count must be greater than or equal to 0"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0a99:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unable to find anchor view with id: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r0, r1, r2)
            throw r0
        L_0x0aa4:
            java.lang.Object r3 = r1.A00
            com.whatsapp.biz.cart.view.fragment.CartFragment r3 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r3
            boolean r0 = X.AnonymousClass000.A1X(r2)
            com.whatsapp.WaTextView r1 = r3.A0H
            if (r0 == 0) goto L_0x0abf
            r0 = 2131896234(0x7f1227aa, float:1.9427323E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r3.A11
            r0 = 2131894035(0x7f121f13, float:1.9422863E38)
        L_0x0abb:
            r1.setText(r0)
            return
        L_0x0abf:
            r0 = 2131896231(0x7f1227a7, float:1.9427317E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r3.A11
            r0 = 2131893995(0x7f121eeb, float:1.9422782E38)
            goto L_0x0abb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BA6.BTH(java.lang.Object):void");
    }
}
