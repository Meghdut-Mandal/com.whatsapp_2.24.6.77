package X;

import android.view.View;

/* renamed from: X.6ch  reason: invalid class name and case insensitive filesystem */
public class C135436ch implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C135436ch(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.8WH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: X.8Wd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: X.8WH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: X.8WH} */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x037b, code lost:
        if (r3.A0Q.A05() == false) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c4, code lost:
        r0 = new X.C1264964g();
        r0.A02 = r1;
        r2.A08(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ce, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r1.A1b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01c4, code lost:
        r1.A0C(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01c7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ec, code lost:
        r4.Btm(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ef, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r15) {
        /*
            r14 = this;
            int r0 = r14.A01
            switch(r0) {
                case 0: goto L_0x0125;
                case 1: goto L_0x012d;
                case 2: goto L_0x0005;
                case 3: goto L_0x0135;
                case 4: goto L_0x017e;
                case 5: goto L_0x01dd;
                case 6: goto L_0x01f0;
                case 7: goto L_0x000d;
                case 8: goto L_0x0203;
                case 9: goto L_0x020b;
                case 10: goto L_0x0046;
                case 11: goto L_0x004f;
                case 12: goto L_0x021c;
                case 13: goto L_0x021c;
                case 14: goto L_0x0227;
                case 15: goto L_0x0235;
                case 16: goto L_0x0243;
                case 17: goto L_0x024b;
                case 18: goto L_0x0253;
                case 19: goto L_0x006f;
                case 20: goto L_0x026f;
                case 21: goto L_0x0278;
                case 22: goto L_0x0280;
                case 23: goto L_0x02b8;
                case 24: goto L_0x0005;
                case 25: goto L_0x0005;
                case 26: goto L_0x02c8;
                case 27: goto L_0x02d7;
                case 28: goto L_0x014a;
                case 29: goto L_0x01ce;
                case 30: goto L_0x02e3;
                case 31: goto L_0x02fd;
                case 32: goto L_0x0305;
                case 33: goto L_0x00ba;
                case 34: goto L_0x034a;
                case 35: goto L_0x0352;
                case 36: goto L_0x00af;
                case 37: goto L_0x038a;
                case 38: goto L_0x00cf;
                case 39: goto L_0x03c6;
                case 40: goto L_0x0005;
                case 41: goto L_0x03f8;
                case 42: goto L_0x0116;
                case 43: goto L_0x0400;
                case 44: goto L_0x040e;
                case 45: goto L_0x0005;
                case 46: goto L_0x0005;
                case 47: goto L_0x041b;
                case 48: goto L_0x042a;
                case 49: goto L_0x043f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r14.A00
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
        L_0x0009:
            r1.A1b()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r6 = r14.A00
            com.whatsapp.biz.product.view.fragment.ProductBottomSheet r6 = (com.whatsapp.biz.product.view.fragment.ProductBottomSheet) r6
            com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel r0 = r6.A08
            if (r0 != 0) goto L_0x001a
            java.lang.RuntimeException r0 = X.C36331k8.A0a()
            throw r0
        L_0x001a:
            com.whatsapp.jid.UserJid r5 = r0.A03
            if (r5 == 0) goto L_0x000c
            X.9up r0 = r0.A02
            if (r0 == 0) goto L_0x0044
            java.lang.String r4 = r0.A0F
        L_0x0024:
            r3 = 1
            com.whatsapp.biz.cart.view.fragment.CartFragment r2 = new com.whatsapp.biz.cart.view.fragment.CartFragment
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "extra_business_id"
            r1.putParcelable(r0, r5)
            java.lang.String r0 = "extra_entry_point"
            r1.putInt(r0, r3)
            java.lang.String r0 = "extra_product_id"
            r1.putString(r0, r4)
            r2.A17(r1)
            X.AnonymousClass3LQ.A01(r2, r6)
            return
        L_0x0044:
            r4 = 0
            goto L_0x0024
        L_0x0046:
            java.lang.Object r1 = r14.A00
            com.whatsapp.bizintegrity.utils.BizIntegrityFragment r1 = (com.whatsapp.bizintegrity.utils.BizIntegrityFragment) r1
            boolean r0 = r1 instanceof com.whatsapp.bizintegrity.marketingoptout.MarketingReOptInFragment
            if (r0 == 0) goto L_0x0009
            return
        L_0x004f:
            java.lang.Object r1 = r14.A00
            com.whatsapp.bizintegrity.utils.BizIntegrityFragment r1 = (com.whatsapp.bizintegrity.utils.BizIntegrityFragment) r1
            boolean r0 = r1 instanceof com.whatsapp.bizintegrity.marketingoptout.MarketingReOptInFragment
            if (r0 == 0) goto L_0x0065
            com.whatsapp.bizintegrity.marketingoptout.MarketingReOptInFragment r1 = (com.whatsapp.bizintegrity.marketingoptout.MarketingReOptInFragment) r1
            X.1NP r5 = r1.A01
            com.whatsapp.jid.UserJid r4 = r1.A02
            java.lang.String r3 = r1.A03
            r2 = 1
            r0 = 0
            r5.A02(r4, r0, r3, r2)
            goto L_0x0009
        L_0x0065:
            boolean r0 = r1 instanceof com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment
            if (r0 == 0) goto L_0x0463
            com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment r1 = (com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment) r1
            r0 = 1
            r1.A03 = r0
            goto L_0x0009
        L_0x006f:
            java.lang.Object r1 = r14.A00
            X.1yc r1 = (X.C42311yc) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.00T r0 = r1.A04
            java.lang.Object r5 = r0.getValue()
            com.whatsapp.bonsai.discovery.BonsaiDiscoveryViewModel r5 = (com.whatsapp.bonsai.discovery.BonsaiDiscoveryViewModel) r5
            X.0om r4 = r1.A00
            if (r4 == 0) goto L_0x04aa
            boolean r0 = r4 instanceof X.C69563dj
            if (r0 == 0) goto L_0x000c
            X.3dj r4 = (X.C69563dj) r4
            X.6E1 r3 = r4.A00
            X.0yW r2 = r5.A05
            X.2Qh r1 = new X.2Qh
            r1.<init>()
            r0 = 31
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            java.lang.String r0 = r3.A08
            r1.A04 = r0
            r0 = 36
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A02 = r0
            r2.Bly(r1)
            X.00s r1 = r5.A02
            X.141 r0 = r4.A01
            X.AnonymousClass3R7.A01(r1, r0)
            return
        L_0x00af:
            java.lang.Object r0 = r14.A00
            com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity r0 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity) r0
            X.6jV r2 = r0.A03
            if (r2 == 0) goto L_0x000c
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00c4
        L_0x00ba:
            java.lang.Object r0 = r14.A00
            com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity r0 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity) r0
            X.6jV r2 = r0.A03
            if (r2 == 0) goto L_0x000c
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x00c4:
            X.64g r0 = new X.64g
            r0.<init>()
            r0.A02 = r1
            r2.A08(r0)
            return
        L_0x00cf:
            java.lang.Object r1 = r14.A00
            X.51F r1 = (X.AnonymousClass51F) r1
            com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity r1 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity) r1
            X.6jV r0 = r1.A03
            if (r0 == 0) goto L_0x000c
            X.4kp r5 = r1.A3i()
            X.6WY r0 = r0.A0R
            X.6Ch r0 = r0.A06()
            X.6c5 r0 = r0.A04
            X.6bv r4 = r0.A00()
            X.00s r1 = r5.A02
            r0 = 2
            X.C36341k9.A16(r1, r0)
            X.6pD r6 = r5.A0J
            X.6Eo r0 = r5.A0L
            java.lang.Integer r7 = r0.A03()
            r10 = 11
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r11 = 68
            r12 = 1
            r9 = 0
            r6.A08(r7, r8, r9, r10, r11, r12)
            X.7Y4 r3 = new X.7Y4
            r3.<init>(r5)
            X.0wU r2 = r5.A0X
            r1 = 22
            X.74n r0 = new X.74n
            r0.<init>(r5, r4, r3, r1)
            r2.Boy(r0)
            return
        L_0x0116:
            java.lang.Object r0 = r14.A00
            com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment r0 = (com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment) r0
            r0.A1b()
            X.4Sr r0 = r0.A02
            if (r0 == 0) goto L_0x000c
            r0.BSI()
            return
        L_0x0125:
            java.lang.Object r0 = r14.A00
            X.3nP r0 = (X.C75543nP) r0
            X.C75543nP.A00(r0)
            return
        L_0x012d:
            java.lang.Object r0 = r14.A00
            X.14u r0 = (X.C225314u) r0
            r0.onBackPressed()
            return
        L_0x0135:
            java.lang.Object r3 = r14.A00
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.report.ReportActivity"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        L_0x014a:
            java.lang.Object r1 = r14.A00
            X.5E8 r1 = (X.AnonymousClass5E8) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.5lA r0 = r1.A00
            X.4kj r4 = r0.A00
            r3 = 0
            r4.A00 = r3
            X.08S r2 = r4.A05
            java.lang.Object r0 = r2.A04()
            if (r0 == 0) goto L_0x0177
            java.util.ArrayList r1 = X.C90504aG.A0t(r2)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0177
            java.lang.Object r0 = r1.get(r3)
            boolean r0 = r0 instanceof X.AnonymousClass5E8
            if (r0 == 0) goto L_0x0177
            r1.remove(r3)
            r2.A0C(r1)
        L_0x0177:
            X.1Rs r1 = r4.A0I
            java.lang.Integer r0 = X.C36361kB.A0j()
            goto L_0x01c4
        L_0x017e:
            java.lang.Object r3 = r14.A00
            X.8WH r3 = (X.AnonymousClass8WH) r3
            X.3L6 r2 = r3.A0s
            r1 = 774774794(0x2e2e200a, float:3.9591476E-11)
            java.lang.String r4 = "cart_add_tag"
            java.lang.String r0 = "ProductBaseActivity"
            r2.A00(r1, r4, r0)
            X.3L6 r2 = r3.A0s
            X.0wQ r1 = r3.A02
            com.whatsapp.jid.UserJid r0 = r3.A0q
            boolean r0 = r1.A0M(r0)
            r1 = r0 ^ 1
            java.lang.String r0 = "IsConsumer"
            r2.A04(r4, r0, r1)
            X.3L6 r2 = r3.A0s
            java.lang.String r1 = "EntryPoint"
            java.lang.String r0 = "Product"
            r2.A03(r4, r1, r0)
            X.9up r1 = r3.A0U
            X.9up r0 = r3.A0T
            X.9up r4 = X.C109915Zp.A00(r1, r0)
            X.7yU r0 = r3.A0h
            com.whatsapp.jid.UserJid r5 = r3.A0q
            java.lang.String r6 = r3.A0x
            java.lang.String r7 = r3.A0z
            java.lang.String r8 = r3.A0w
            r9 = 1
            if (r4 != 0) goto L_0x01c8
            X.00s r1 = r0.A07
            java.lang.Boolean r0 = X.C36371kC.A0m()
        L_0x01c4:
            r1.A0C(r0)
            return
        L_0x01c8:
            X.9Uf r3 = r0.A0C
            r3.A01(r4, r5, r6, r7, r8, r9)
            return
        L_0x01ce:
            java.lang.Object r4 = r14.A00
            X.8Wd r4 = (X.C174338Wd) r4
            X.3Ba r3 = r4.A0N
            com.whatsapp.jid.UserJid r2 = r4.A0M
            r1 = 2
            r0 = 0
            com.whatsapp.biz.cart.view.fragment.CartFragment r0 = r3.A00(r2, r0, r1)
            goto L_0x01ec
        L_0x01dd:
            java.lang.Object r4 = r14.A00
            X.8WH r4 = (X.AnonymousClass8WH) r4
            X.3Ba r3 = r4.A0r
            com.whatsapp.jid.UserJid r2 = r4.A0q
            java.lang.String r1 = r4.A0y
            r0 = 1
            com.whatsapp.biz.cart.view.fragment.CartFragment r0 = r3.A00(r2, r1, r0)
        L_0x01ec:
            r4.Btm(r0)
            return
        L_0x01f0:
            java.lang.Object r0 = r14.A00
            com.whatsapp.biz.product.view.fragment.ProductBottomSheet r0 = (com.whatsapp.biz.product.view.fragment.ProductBottomSheet) r0
            com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel r2 = r0.A08
            if (r2 != 0) goto L_0x01fd
            java.lang.RuntimeException r0 = X.C36331k8.A0a()
            throw r0
        L_0x01fd:
            r0 = 1
            r2.A0S(r0)
            return
        L_0x0203:
            java.lang.Object r0 = r14.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1c()
            return
        L_0x020b:
            java.lang.Object r1 = r14.A00
            com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment r1 = (com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment) r1
            r0 = 2131427983(0x7f0b028f, float:1.8477598E38)
            android.view.View r0 = r15.findViewById(r0)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment.A03(r0, r1)
            return
        L_0x021c:
            java.lang.Object r0 = r14.A00
            X.00S r0 = (X.AnonymousClass00S) r0
            X.C36341k9.A1D(r0)
            r0.invoke()
            return
        L_0x0227:
            java.lang.Object r1 = r14.A00
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            boolean r0 = r1.isChecked()
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
        L_0x0235:
            java.lang.Object r0 = r14.A00
            X.62d r0 = (X.C1259962d) r0
            r1 = 0
            r2 = 0
            r5 = 0
            r3 = 0
            r4 = 0
            r0.A00(r1, r2, r3, r4, r5)
            return
        L_0x0243:
            java.lang.Object r0 = r14.A00
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.show()
            return
        L_0x024b:
            java.lang.Object r0 = r14.A00
            X.50g r0 = (X.C1025050g) r0
            r0.onBackPressed()
            return
        L_0x0253:
            java.lang.Object r2 = r14.A00
            com.whatsapp.bonsai.BonsaiSystemMessageBottomSheet r2 = (com.whatsapp.bonsai.BonsaiSystemMessageBottomSheet) r2
            X.00T r0 = r2.A00
            r0.getValue()
            X.01I r1 = r2.A0h()
            if (r1 == 0) goto L_0x026b
            java.lang.String r0 = "https://www.facebook.com/privacy/guide/genai?entry_point=whatsapp_genai"
            android.content.Intent r0 = X.C36331k8.A04(r0)
            r1.startActivity(r0)
        L_0x026b:
            r2.A1c()
            return
        L_0x026f:
            java.lang.Object r1 = r14.A00
            X.5NC r1 = (X.AnonymousClass5NC) r1
            r0 = 0
            X.AnonymousClass5NC.A04(r1, r0)
            return
        L_0x0278:
            java.lang.Object r0 = r14.A00
            com.whatsapp.bonsai.waitlist.BonsaiWaitlistBottomSheet r0 = (com.whatsapp.bonsai.waitlist.BonsaiWaitlistBottomSheet) r0
            r0.A1m()
            return
        L_0x0280:
            java.lang.Object r3 = r14.A00
            com.whatsapp.bridge.wfs.ui.LinkedUsersActivity r3 = (com.whatsapp.bridge.wfs.ui.LinkedUsersActivity) r3
            X.3TX r2 = r3.A0N
            java.lang.String r1 = "wfs"
            java.lang.String r0 = "wrong_number"
            r2.A07(r1, r0)
            java.util.Map r1 = r3.A03
            if (r1 == 0) goto L_0x02b1
            r0 = 551495536(0x20df2770, float:3.7803767E-19)
            java.lang.Object r1 = X.C36371kC.A0r(r1, r0)
            if (r1 == 0) goto L_0x02ac
            X.1UN r1 = (X.AnonymousClass1UN) r1
            java.lang.String r0 = "NOT_YOU"
            r1.A04(r0)
            r1.A00()
            android.content.Intent r0 = X.AnonymousClass190.A0C(r3)
            r3.startActivity(r0)
            return
        L_0x02ac:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()
            throw r0
        L_0x02b1:
            java.lang.String r0 = "xFamilyUserFlowLoggers"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02b8:
            java.lang.Object r1 = r14.A00
            com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity r1 = (com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity) r1
            com.whatsapp.businessapisearch.view.fragment.BusinessApiHomeFragment r0 = r1.A03
            if (r0 == 0) goto L_0x02c4
            r0.A1Z()
            return
        L_0x02c4:
            r1.onBackPressed()
            return
        L_0x02c8:
            java.lang.Object r1 = r14.A00
            X.5EK r1 = (X.AnonymousClass5EK) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.02t r0 = r1.A03
            X.AnonymousClass00C.A0B(r15)
            r0.invoke(r15)
            return
        L_0x02d7:
            java.lang.Object r1 = r14.A00
            X.5Dt r1 = (X.C105205Dt) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.7fr r0 = r1.A01
            r0.BfU(r1)
            return
        L_0x02e3:
            java.lang.Object r2 = r14.A00
            X.66F r2 = (X.AnonymousClass66F) r2
            java.util.List r0 = X.AnonymousClass0D3.A0I
            boolean r0 = r2 instanceof X.C1025550q
            if (r0 == 0) goto L_0x02f7
            X.7j6 r1 = r2.A00
            X.50q r2 = (X.C1025550q) r2
            X.6BG r0 = r2.A00
            r1.BZN(r0)
            return
        L_0x02f7:
            X.7j6 r0 = r2.A00
            r0.Bfb()
            return
        L_0x02fd:
            java.lang.Object r0 = r14.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
        L_0x0305:
            java.lang.Object r2 = r14.A00
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity r2 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity) r2
            java.util.TimerTask r0 = r2.A0B
            if (r0 == 0) goto L_0x0310
            r0.cancel()
        L_0x0310:
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment r4 = r2.A05
            if (r4 == 0) goto L_0x033e
            android.os.Bundle r3 = r4.A0A
            if (r3 == 0) goto L_0x0348
            r1 = -1
            java.lang.String r0 = "ARG_PREVIOUS_SCREEN"
            int r0 = r3.getInt(r0, r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L_0x0323:
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r1 = r4.A08
            int r0 = r1.A01
            r9 = 1
            boolean r0 = X.AnonymousClass000.A1S(r0, r9)
            X.6pD r3 = r1.A0M
            r7 = 1
            r8 = 31
            if (r0 == 0) goto L_0x0336
            r7 = 2
            r8 = 30
        L_0x0336:
            java.lang.Integer r4 = X.C129006Eo.A00(r1)
            r6 = 0
            r3.A08(r4, r5, r6, r7, r8, r9)
        L_0x033e:
            X.5Jw r1 = r2.A04
            r0 = 1
            r1.A05(r0)
            r2.onBackPressed()
            return
        L_0x0348:
            r5 = 0
            goto L_0x0323
        L_0x034a:
            java.lang.Object r0 = r14.A00
            com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity r0 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity) r0
            r0.onBackPressed()
            return
        L_0x0352:
            java.lang.Object r0 = r14.A00
            X.51F r0 = (X.AnonymousClass51F) r0
            X.4kp r3 = r0.A3i()
            X.6pD r4 = r3.A0J
            X.6Eo r0 = r3.A0L
            java.lang.Integer r5 = r0.A03()
            r8 = 11
            r9 = 69
            r10 = 1
            r6 = 0
            r7 = r6
            r4.A08(r5, r6, r7, r8, r9, r10)
            boolean r0 = r0.A04()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x037d
            X.0yE r0 = r3.A0Q
            boolean r0 = r0.A05()
            r2 = 0
            if (r0 != 0) goto L_0x037e
        L_0x037d:
            r2 = 1
        L_0x037e:
            X.1Rs r1 = r3.A0W
            r0 = 7
            if (r2 == 0) goto L_0x0384
            r0 = 2
        L_0x0384:
            X.C36341k9.A16(r1, r0)
            r3.A0D = r10
            return
        L_0x038a:
            java.lang.Object r3 = r14.A00
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity r3 = (com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity) r3
            X.6Za r0 = r3.A0A
            boolean r0 = r0.A0D
            if (r0 != 0) goto L_0x03c2
            X.0v0 r0 = r3.A09
            java.lang.String[] r1 = X.AnonymousClass1P6.A09
            boolean r0 = X.AnonymousClass3US.A0A(r0, r1)
            if (r0 == 0) goto L_0x03c2
            boolean r0 = X.AnonymousClass3US.A09(r3, r1)
            if (r0 != 0) goto L_0x03c2
            X.6Za r2 = r3.A0A
            r1 = 0
            X.7pf r0 = new X.7pf
            r0.<init>(r3, r1)
            r2.A02(r0)
            X.6Za r0 = r3.A0A
            r2 = 1
            r0.A0E = r2
            X.5DR r0 = r0.A0J
            X.9Qj r0 = r0.A03
            android.content.SharedPreferences$Editor r1 = X.C90474aD.A0H(r0)
            java.lang.String r0 = "DIRECTORY_LOCATION_INFO_SHOWN"
            X.C36331k8.A0w(r1, r0, r2)
            return
        L_0x03c2:
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity.A0J(r3)
            return
        L_0x03c6:
            java.lang.Object r3 = r14.A00
            com.whatsapp.businessdirectory.view.custom.ClearLocationDialogFragment r3 = (com.whatsapp.businessdirectory.view.custom.ClearLocationDialogFragment) r3
            X.66G r2 = r3.A00
            monitor-enter(r2)
            X.5DR r1 = r2.A00     // Catch:{ all -> 0x03f5 }
            r1.A00()     // Catch:{ all -> 0x03f5 }
            r0 = 0
            r1.A02(r0)     // Catch:{ all -> 0x03f5 }
            java.util.Set r0 = r2.A01     // Catch:{ all -> 0x03f3 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x03f3 }
        L_0x03dc:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x03f3 }
            if (r0 == 0) goto L_0x03ee
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x03f3 }
            X.6qm r0 = (X.C143576qm) r0     // Catch:{ all -> 0x03f3 }
            X.7lI r0 = r0.A07     // Catch:{ all -> 0x03f3 }
            r0.Bwx()     // Catch:{ all -> 0x03f3 }
            goto L_0x03dc
        L_0x03ee:
            monitor-exit(r2)
            r3.A1b()
            return
        L_0x03f3:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x03f5 }
        L_0x03f5:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x03f8:
            java.lang.Object r0 = r14.A00
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            return
        L_0x0400:
            java.lang.Object r2 = r14.A00
            X.6qg r2 = (X.C143516qg) r2
            X.5zC r1 = r2.A09
            r0 = 11
            r1.A03 = r0
            r2.A0B()
            return
        L_0x040e:
            java.lang.Object r2 = r14.A00
            X.6qh r2 = (X.C143526qh) r2
            X.5yM r1 = r2.A06
            r0 = 5
            r1.A02 = r0
            r2.A0A()
            return
        L_0x041b:
            java.lang.Object r1 = r14.A00
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryLocationErrorDialog r1 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryLocationErrorDialog) r1
            X.7kx r0 = r1.A02
            if (r0 == 0) goto L_0x0426
            r0.BaI()
        L_0x0426:
            r0 = 1
            r1.A03 = r0
            return
        L_0x042a:
            java.lang.Object r2 = r14.A00
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment r2 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment) r2
            com.google.android.material.chip.Chip r1 = r2.A00
            r0 = 8
            r1.setVisibility(r0)
            X.4km r0 = r2.A0B
            X.6qb r0 = r0.A0N
            X.4kv r0 = r0.A00
            r0.A0F()
            return
        L_0x043f:
            java.lang.Object r1 = r14.A00
            X.5E4 r1 = (X.AnonymousClass5E4) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.5pX r2 = r1.A00
            X.6PX r1 = r2.A01
            X.6pD r3 = r1.A03
            X.6Eo r0 = r1.A05
            java.lang.Integer r4 = r0.A03()
            r7 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r8 = 34
            r9 = 5
            r6 = 0
            r3.A08(r4, r5, r6, r7, r8, r9)
            X.6cB r0 = r2.A00
            r1.A03(r0)
            return
        L_0x0463:
            com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutFragment r1 = (com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutFragment) r1
            r1.A1b()
            X.1NT r3 = r1.A01
            com.whatsapp.jid.UserJid r0 = r1.A02
            r10 = 2131625441(0x7f0e05e1, float:1.887809E38)
            r11 = 2131896735(0x7f12299f, float:1.942834E38)
            r2 = 2131896733(0x7f12299d, float:1.9428336E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r12 = 2131896734(0x7f12299e, float:1.9428338E38)
            r2 = 2131896732(0x7f12299c, float:1.9428334E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            r5 = 0
            X.5yA r4 = new X.5yA
            r7 = r5
            r6 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            X.0yC r12 = r3.A06
            X.17Y r7 = r3.A01
            X.1Dv r6 = r3.A00
            X.0yb r11 = r3.A04
            X.1NP r8 = r3.A02
            X.1Cd r10 = r3.A03
            com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment r5 = new com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment
            r9 = r4
            r13 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            X.01z r1 = r1.A0l()
            java.lang.String r0 = X.AnonymousClass000.A0k(r5)
            r5.A1f(r1, r0)
            return
        L_0x04aa:
            java.lang.String r0 = "bot"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135436ch.onClick(android.view.View):void");
    }
}
