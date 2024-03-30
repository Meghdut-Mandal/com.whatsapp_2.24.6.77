package com.whatsapp.wabloks.base;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass01I;
import X.AnonymousClass02E;
import X.AnonymousClass3PT;
import X.AnonymousClass65A;
import X.AnonymousClass6JI;
import X.AnonymousClass6MO;
import X.AnonymousClass6NR;
import X.AnonymousClass6PY;
import X.AnonymousClass6WZ;
import X.AnonymousClass6XK;
import X.AnonymousClass7fJ;
import X.C012005e;
import X.C100674vP;
import X.C116655kw;
import X.C120335rL;
import X.C1258461m;
import X.C1265064h;
import X.C133266Xn;
import X.C158077fl;
import X.C159757js;
import X.C160377ku;
import X.C165207t3;
import X.C36331k8;
import X.C36361kB;
import X.C61973Ef;
import X.C64603Oq;
import X.C95474lE;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.facebook.rendercore.RootHostView;
import com.whatsapp.R;
import com.whatsapp.bloks.WAViewpointLifecycleController;
import com.whatsapp.inappsupport.ui.ContextualHelpBkScreenFragment;
import com.whatsapp.inappsupport.ui.SupportBkScreenFragment;
import com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment;
import java.util.List;
import java.util.Objects;

public abstract class BkFragment extends AnonymousClass02E {
    public static final Integer A08 = C36361kB.A0i();
    public static final Integer A09 = 578497046;
    public RootHostView A00;
    public AnonymousClass6PY A01;
    public AnonymousClass6XK A02;
    public AnonymousClass65A A03;
    public C1258461m A04;
    public AnonymousClass005 A05;
    public C159757js A06;
    public C95474lE A07;

    public void A1a() {
    }

    public final void A1b(C158077fl r7) {
        if (r7.B7y() != null) {
            AnonymousClass65A r4 = this.A03;
            AnonymousClass6MO r3 = AnonymousClass6MO.A01;
            C160377ku B7y = r7.B7y();
            AnonymousClass6JI.A00(C100674vP.A00(C133266Xn.A00(AnonymousClass6NR.A00().A00, new SparseArray(), (AnonymousClass6WZ) null, r4, (String) null), B7y, (List) null), r3, B7y);
        }
    }

    private void A03() {
        C1265064h B8t = this.A06.B8t();
        AnonymousClass01I A0h = A0h();
        Objects.requireNonNull(A0h);
        B8t.A00(A0h.getApplicationContext(), (AnonymousClass7fJ) this.A05.get(), this.A03);
    }

    public static void A05(BkFragment bkFragment) {
        if (bkFragment.A0A == null) {
            bkFragment.A17(AnonymousClass001.A07());
        }
    }

    public void A17(Bundle bundle) {
        if (this.A0A == null) {
            super.A17(bundle);
            return;
        }
        throw AnonymousClass001.A09("arguments already set");
    }

    public void A1J() {
        AnonymousClass6PY r1 = this.A01;
        if (r1 != null) {
            r1.A01();
            this.A01 = null;
        }
        this.A00 = null;
        super.A1J();
    }

    public int A1Y() {
        if ((this instanceof BkBottomSheetContentFragment) || (this instanceof BkScreenFragmentWithCustomPreloadScreens) || (this instanceof BkScreenFragment)) {
            return R.id.bloks_container;
        }
        boolean z = this instanceof SupportBkScreenFragment;
        return R.id.bloks_container;
    }

    public void A1Z() {
        if (this instanceof BkScreenFragment) {
            ((BkScreenFragment) this).A1e();
        } else if (this instanceof SupportBkScreenFragment) {
            SupportBkScreenFragment supportBkScreenFragment = (SupportBkScreenFragment) this;
            C36331k8.A0y(supportBkScreenFragment.A01);
            C36361kB.A14(supportBkScreenFragment.A00);
        } else if (this instanceof ContextualHelpBkScreenFragment) {
            ContextualHelpBkScreenFragment contextualHelpBkScreenFragment = (ContextualHelpBkScreenFragment) this;
            C36331k8.A0y(contextualHelpBkScreenFragment.A01);
            C36361kB.A14(contextualHelpBkScreenFragment.A00);
        }
    }

    public void A1L() {
        super.A1L();
        A03();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1Q(android.os.Bundle r10) {
        /*
            r9 = this;
            super.A1Q(r10)
            java.lang.Integer r4 = X.C36381kD.A0m()
            java.lang.String r2 = "START_RENDER"
            r1 = r9
            boolean r3 = r9 instanceof com.whatsapp.wabloks.base.BkScreenFragmentWithCustomPreloadScreens
            if (r3 == 0) goto L_0x0098
            com.whatsapp.wabloks.base.BkScreenFragmentWithCustomPreloadScreens r1 = (com.whatsapp.wabloks.base.BkScreenFragmentWithCustomPreloadScreens) r1
            X.66C r1 = r1.A03
        L_0x0012:
            if (r1 == 0) goto L_0x001b
            int r0 = r4.intValue()
            r1.A01(r2, r0)
        L_0x001b:
            X.02E r2 = r9.A0I
            X.01I r1 = r9.A0h()
            boolean r0 = r2 instanceof X.C159757js
            if (r0 == 0) goto L_0x008b
            X.7js r2 = (X.C159757js) r2
            r9.A06 = r2
        L_0x0029:
            X.7js r0 = r9.A06
            X.65A r0 = r0.BJB()
            r9.A03 = r0
            r9.A03()
            X.04H r1 = X.C36441kJ.A0b(r9)
            boolean r0 = r9 instanceof com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment
            if (r0 != 0) goto L_0x0088
            if (r3 == 0) goto L_0x006f
            java.lang.Class<com.whatsapp.wabloks.base.GenericBkLayoutViewModelWithReload> r0 = com.whatsapp.wabloks.base.GenericBkLayoutViewModelWithReload.class
        L_0x0040:
            X.04R r2 = r1.A00(r0)
            X.4lE r2 = (X.C95474lE) r2
            r9.A07 = r2
            X.6XK r3 = r9.A02
            if (r3 == 0) goto L_0x00a2
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x006e
            r0 = 1
            r2.A02 = r0
            X.00s r1 = X.C36431kI.A0S()
            r2.A01 = r1
            r2.A00 = r1
            r0 = 0
            X.71J r2 = new X.71J
            r2.<init>(r1, r0)
            X.5vX r1 = new X.5vX
            r1.<init>()
            r1.A01 = r3
            r0 = 5
            r1.A00 = r0
            r2.BfE(r1)
        L_0x006e:
            return
        L_0x006f:
            boolean r0 = r9 instanceof com.whatsapp.wabloks.base.BkScreenFragment
            if (r0 != 0) goto L_0x0088
            boolean r0 = r9 instanceof com.whatsapp.shops.ShopsBkFragment
            if (r0 == 0) goto L_0x007a
            java.lang.Class<com.whatsapp.shops.ShopsBkLayoutViewModel> r0 = com.whatsapp.shops.ShopsBkLayoutViewModel.class
            goto L_0x0040
        L_0x007a:
            boolean r0 = r9 instanceof com.whatsapp.inappsupport.ui.SupportBkScreenFragment
            if (r0 != 0) goto L_0x0085
            boolean r0 = r9 instanceof com.whatsapp.inappsupport.ui.ContextualHelpBkScreenFragment
            if (r0 != 0) goto L_0x0085
            java.lang.Class<com.whatsapp.authgraphql.ui.CommonViewModel> r0 = com.whatsapp.authgraphql.ui.CommonViewModel.class
            goto L_0x0040
        L_0x0085:
            java.lang.Class<com.whatsapp.inappsupport.ui.SupportBkLayoutViewModel> r0 = com.whatsapp.inappsupport.ui.SupportBkLayoutViewModel.class
            goto L_0x0040
        L_0x0088:
            java.lang.Class<com.whatsapp.wabloks.base.GenericBkLayoutViewModel> r0 = com.whatsapp.wabloks.base.GenericBkLayoutViewModel.class
            goto L_0x0040
        L_0x008b:
            boolean r0 = r1 instanceof X.C159757js
            if (r0 == 0) goto L_0x0094
            X.7js r1 = (X.C159757js) r1
            r9.A06 = r1
            goto L_0x0029
        L_0x0094:
            r1.finish()
            goto L_0x0029
        L_0x0098:
            boolean r0 = r9 instanceof com.whatsapp.wabloks.base.BkScreenFragment
            if (r0 == 0) goto L_0x001b
            com.whatsapp.wabloks.base.BkScreenFragment r1 = (com.whatsapp.wabloks.base.BkScreenFragment) r1
            X.66C r1 = r1.A01
            goto L_0x0012
        L_0x00a2:
            android.os.Bundle r0 = r9.A0b()
            java.lang.String r2 = "screen_name"
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x00e7
            android.os.Bundle r1 = r9.A0b()
            java.lang.String r0 = "screen_params"
            java.lang.String r7 = r1.getString(r0)
            android.os.Bundle r1 = r9.A0b()
            java.lang.String r0 = "qpl_params"
            java.lang.String r8 = r1.getString(r0)
            X.4lE r3 = r9.A07
            X.65A r4 = r9.A03
            android.os.Bundle r0 = r9.A0b()
            java.lang.String r6 = r0.getString(r2)
            if (r6 == 0) goto L_0x00e0
            android.os.Bundle r1 = r9.A0b()
            java.lang.String r0 = "screen_cache_config"
            android.os.Parcelable r5 = r1.getParcelable(r0)
            X.6bn r5 = (X.C134906bn) r5
            r3.A0T(r4, r5, r6, r7, r8)
            return
        L_0x00e0:
            java.lang.String r0 = "BkFragment is missing screen name"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x00e7:
            if (r10 == 0) goto L_0x00f1
            X.01I r0 = r9.A0i()
            r0.onBackPressed()
            return
        L_0x00f1:
            java.lang.String r0 = "data missing for init"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wabloks.base.BkFragment.A1Q(android.os.Bundle):void");
    }

    public void A1S(Bundle bundle, View view) {
        this.A00 = (RootHostView) C012005e.A02(view, A1Y());
        String string = A0b().getString("data_module_job_id");
        String string2 = A0b().getString("data_module_namespace");
        if (!(string == null || string2 == null)) {
            C120335rL r0 = (C120335rL) this.A03.A00().get(R.id.bloks_data_module_namespace_manager);
            Objects.requireNonNull(r0);
            r0.A00 = string;
            r0.A01 = string2;
        }
        C95474lE r02 = this.A07;
        r02.A0S();
        r02.A00.A08(A0m(), new C165207t3(this, 6));
        if (C116655kw.A00(this.A03)) {
            WAViewpointLifecycleController wAViewpointLifecycleController = new WAViewpointLifecycleController();
            this.A0P.A04(wAViewpointLifecycleController);
            this.A03.A07.set(false);
            C64603Oq r3 = this.A03.A02;
            View rootView = view.getRootView();
            if (rootView != null) {
                C64603Oq.A00(new C61973Ef(rootView, r3.A01), wAViewpointLifecycleController, r3, new AnonymousClass3PT());
            }
        }
    }

    public void A1c(String str) {
        A05(this);
        A0b().putString("screen_name", str);
    }
}
