package com.whatsapp.businessproductlist.view.fragment;

import X.A9P;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass4PE;
import X.AnonymousClass4PG;
import X.AnonymousClass6VE;
import X.AnonymousClass8VI;
import X.AnonymousClass95K;
import X.AnonymousClass9Y1;
import X.B76;
import X.B77;
import X.C167537yE;
import X.C178358fo;
import X.C187948yn;
import X.C18820ts;
import X.C194289Oy;
import X.C195559Ux;
import X.C196089Xp;
import X.C19770wU;
import X.C22113Agy;
import X.C22114Agz;
import X.C22115Ah0;
import X.C22909AyL;
import X.C22924Aya;
import X.C29461Ws;
import X.C31771cM;
import X.C36331k8;
import X.C36431kI;
import X.C61223Ba;
import X.C88374Sl;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;

public abstract class BusinessProductListBaseFragment extends Hilt_BusinessProductListBaseFragment {
    public RecyclerView A00;
    public C22909AyL A01;
    public C178358fo A02;
    public AnonymousClass6VE A03;
    public AnonymousClass4PE A04;
    public C31771cM A05;
    public C29461Ws A06;
    public AnonymousClass9Y1 A07;
    public C196089Xp A08;
    public AnonymousClass8VI A09;
    public C187948yn A0A = C187948yn.PLM;
    public C22924Aya A0B;
    public C18820ts A0C;
    public UserJid A0D;
    public C61223Ba A0E;
    public C19770wU A0F;
    public WDSButton A0G;
    public final C194289Oy A0H = new B76(this, 5);
    public final AnonymousClass4PG A0I = new A9P();
    public final C88374Sl A0J = new AnonymousClass95K(this, 2);
    public final AnonymousClass00T A0K = C36431kI.A1I(new C22113Agy(this));
    public final AnonymousClass00T A0L = C36431kI.A1I(new C22114Agz(this));
    public final AnonymousClass00T A0M = C36431kI.A1I(new C22115Ah0(this));
    public final C195559Ux A0N = new B77(this, 3);

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.product_list);
        AnonymousClass00C.A0E(findViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        this.A00 = (RecyclerView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.view_cart_button);
        AnonymousClass00C.A0E(findViewById2, "null cannot be cast to non-null type com.whatsapp.wds.components.button.WDSButton");
        this.A0G = (WDSButton) findViewById2;
        return inflate;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.02E] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1O(android.content.Context r4) {
        /*
            r3 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            super.A1O(r4)
            boolean r0 = r4 instanceof X.C22924Aya
            r2 = 0
            if (r0 == 0) goto L_0x0030
            r0 = r4
            X.Aya r0 = (X.C22924Aya) r0
        L_0x000f:
            r3.A0B = r0
            if (r0 != 0) goto L_0x0032
            X.02E r1 = r3.A0I
            boolean r0 = r1 instanceof X.C22924Aya
            if (r0 == 0) goto L_0x001c
            r2 = r1
            X.Aya r2 = (X.C22924Aya) r2
        L_0x001c:
            r3.A0B = r2
            if (r2 != 0) goto L_0x0032
            java.lang.StringBuilder r1 = X.C36381kD.A11(r4)
            java.lang.String r0 = " must implement BusinessProductListBaseFragment.BusinessProductListHost"
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>(r1)
            throw r0
        L_0x0030:
            r0 = r2
            goto L_0x000f
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment.A1O(android.content.Context):void");
    }

    /* JADX WARNING: type inference failed for: r0v28, types: [X.8VI] */
    /* JADX WARNING: type inference failed for: r11v3, types: [X.8Wg] */
    /* JADX WARNING: type inference failed for: r5v5, types: [com.whatsapp.businessproductlist.view.adapter.BusinessProductListAdapter] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1S(android.os.Bundle r30, android.view.View r31) {
        /*
            r29 = this;
            r0 = 0
            r1 = r31
            X.AnonymousClass00C.A0D(r1, r0)
            r2 = r29
            boolean r0 = r2 instanceof com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment
            if (r0 == 0) goto L_0x00e6
            r4 = r2
            com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment r4 = (com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment) r4
            X.9Dp r0 = r4.A00
            if (r0 == 0) goto L_0x015f
            com.whatsapp.jid.UserJid r20 = r4.A1a()
            X.4Sl r5 = r4.A0J
            X.A9Q r3 = new X.A9Q
            r3.<init>(r4)
            X.1ds r1 = r0.A00
            X.0tq r0 = r1.A02
            X.17Y r8 = X.C36351kA.A0M(r0)
            X.0wQ r9 = X.C36351kA.A0N(r0)
            X.1Dv r7 = X.C36351kA.A0J(r0)
            X.9lS r10 = X.C165607th.A0Q(r0)
            X.16D r15 = X.C36341k9.A0R(r0)
            X.171 r17 = X.C36341k9.A0S(r0)
            X.0ts r18 = X.C36341k9.A0T(r0)
            X.185 r16 = X.C36371kC.A0U(r0)
            X.1My r1 = r1.A00
            X.004 r1 = r1.A0L
            java.lang.Object r1 = r1.get()
            X.9Xp r1 = (X.C196089Xp) r1
            X.0yC r19 = X.C36341k9.A0V(r0)
            X.1KP r12 = X.C18800tq.A2v(r0)
            com.whatsapp.businessproductlist.view.adapter.BusinessProductListAdapter r0 = new com.whatsapp.businessproductlist.view.adapter.BusinessProductListAdapter
            r13 = r3
            r14 = r5
            r11 = r1
            r5 = r0
            r6 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x005e:
            r2.A09 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r2.A00
            X.AnonymousClass00C.A0B(r1)
            X.8VI r0 = r2.A1Z()
            r1.setAdapter(r0)
            androidx.recyclerview.widget.RecyclerView r3 = r2.A00
            X.AnonymousClass00C.A0B(r3)
            r1 = 3
            X.B6w r0 = new X.B6w
            r0.<init>(r2, r1)
            r3.A0v(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r2.A00
            X.AnonymousClass00C.A0B(r1)
            r0 = 0
            r1.setItemAnimator(r0)
            X.00T r5 = r2.A0K
            java.lang.Object r0 = r5.getValue()
            X.7yE r0 = (X.C167537yE) r0
            X.00r r4 = r0.A01
            X.0Ab r3 = r2.A0m()
            X.AlK r1 = new X.AlK
            r1.<init>(r2)
            r0 = 26
            X.BA7.A01(r3, r4, r1, r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A0G
            X.AnonymousClass00C.A0B(r1)
            r0 = 15
            X.C48892iE.A00(r1, r2, r0)
            X.8fo r1 = r2.A02
            if (r1 == 0) goto L_0x0158
            X.9Oy r0 = r2.A0H
            r1.registerObserver(r0)
            java.lang.Object r0 = r5.getValue()
            X.7yE r0 = (X.C167537yE) r0
            X.00r r4 = r0.A00
            X.0Ab r3 = r2.A0m()
            X.AlI r1 = new X.AlI
            r1.<init>(r2)
            r0 = 28
            X.BA7.A01(r3, r4, r1, r0)
            X.00T r5 = r2.A0L
            java.lang.Object r0 = r5.getValue()
            X.7y9 r0 = (X.C167497y9) r0
            X.00s r4 = r0.A00
            X.0Ab r3 = r2.A0m()
            X.AlJ r1 = new X.AlJ
            r1.<init>(r2)
            r0 = 27
            X.BA7.A01(r3, r4, r1, r0)
            java.lang.Object r0 = r5.getValue()
            X.7y9 r0 = (X.C167497y9) r0
            r0.A0T()
            return
        L_0x00e6:
            r14 = r2
            com.whatsapp.businessproductlist.view.fragment.CollectionProductListFragment r14 = (com.whatsapp.businessproductlist.view.fragment.CollectionProductListFragment) r14
            X.0yC r13 = r14.A0B
            if (r13 == 0) goto L_0x01aa
            X.1Dv r12 = r14.A01
            if (r12 == 0) goto L_0x01a3
            X.9lS r11 = r14.A06
            if (r11 == 0) goto L_0x019c
            X.16D r10 = r14.A08
            if (r10 == 0) goto L_0x0195
            X.17Y r9 = r14.A02
            if (r9 == 0) goto L_0x018e
            X.0wQ r8 = r14.A03
            if (r8 == 0) goto L_0x0187
            X.185 r7 = r14.A09
            if (r7 == 0) goto L_0x0180
            X.171 r6 = r14.A0A
            if (r6 == 0) goto L_0x0179
            X.0ts r5 = r14.A0C
            if (r5 == 0) goto L_0x0174
            X.4Sl r0 = r14.A0J
            r17 = r0
            X.4PG r0 = r14.A0I
            r16 = r0
            X.1KP r4 = r14.A07
            if (r4 == 0) goto L_0x016d
            java.lang.String r15 = r14.A0F
            java.lang.String r28 = r14.A1c()
            int r3 = r14.A00
            r1 = -1
            r0 = 897451937(0x357e07a1, float:9.4633475E-7)
            if (r3 == r1) goto L_0x012a
            r0 = 897451370(0x357e056a, float:9.463025E-7)
        L_0x012a:
            X.9ED r3 = new X.9ED
            r3.<init>(r0)
            X.9Xp r1 = r14.A08
            if (r1 == 0) goto L_0x0166
            com.whatsapp.jid.UserJid r26 = r14.A1a()
            X.8Wg r0 = new X.8Wg
            r23 = r6
            r24 = r5
            r25 = r13
            r27 = r15
            r18 = r4
            r19 = r16
            r20 = r17
            r21 = r10
            r22 = r7
            r13 = r9
            r14 = r8
            r15 = r11
            r16 = r3
            r17 = r1
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x005e
        L_0x0158:
            java.lang.String r0 = "cartObservers"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x015f:
            java.lang.String r0 = "adapterFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0166:
            java.lang.String r0 = "loadSession"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x016d:
            java.lang.String r0 = "catalogFeaturesEnableManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0174:
            java.lang.RuntimeException r0 = X.C36321k7.A09()
            throw r0
        L_0x0179:
            java.lang.String r0 = "waContactNames"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0180:
            java.lang.String r0 = "verifiedNameManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0187:
            java.lang.String r0 = "meManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x018e:
            java.lang.String r0 = "globalUI"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0195:
            java.lang.String r0 = "contactManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x019c:
            java.lang.String r0 = "catalogManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01a3:
            java.lang.String r0 = "activityUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01aa:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment.A1S(android.os.Bundle, android.view.View):void");
    }

    public static final void A03(BusinessProductListBaseFragment businessProductListBaseFragment, boolean z) {
        WDSButton wDSButton;
        int i;
        if (!z || businessProductListBaseFragment.A1Z().A07.isEmpty()) {
            wDSButton = businessProductListBaseFragment.A0G;
            AnonymousClass00C.A0B(wDSButton);
            i = 8;
        } else {
            wDSButton = businessProductListBaseFragment.A0G;
            AnonymousClass00C.A0B(wDSButton);
            i = 0;
        }
        wDSButton.setVisibility(i);
    }

    public void A1H() {
        C196089Xp r0 = this.A08;
        if (r0 != null) {
            r0.A00();
            C178358fo r1 = this.A02;
            if (r1 != null) {
                r1.unregisterObserver(this.A0H);
                C31771cM r12 = this.A05;
                if (r12 != null) {
                    r12.unregisterObserver(this.A0N);
                    super.A1H();
                    return;
                }
                throw C36331k8.A0d("productObservers");
            }
            throw C36331k8.A0d("cartObservers");
        }
        throw C36331k8.A0d("loadSession");
    }

    public final AnonymousClass8VI A1Z() {
        AnonymousClass8VI r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("adapter");
    }

    public final UserJid A1a() {
        UserJid userJid = this.A0D;
        if (userJid != null) {
            return userJid;
        }
        throw C36331k8.A0d("bizJid");
    }

    public void A19() {
        super.A19();
        this.A0B = null;
    }

    public void A1L() {
        super.A1L();
        ((C167537yE) this.A0K.getValue()).A02.A00();
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        A10(true);
        Bundle A0b = A0b();
        Parcelable parcelable = A0b.getParcelable("category_biz_id");
        AnonymousClass00C.A0B(parcelable);
        UserJid userJid = (UserJid) parcelable;
        AnonymousClass00C.A0D(userJid, 0);
        this.A0D = userJid;
        this.A0A = C187948yn.values()[A0b.getInt("business_product_list_entry_point")];
        C31771cM r1 = this.A05;
        if (r1 != null) {
            r1.registerObserver(this.A0N);
            return;
        }
        throw C36331k8.A0d("productObservers");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (r1.canScrollVertically(1) == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1b() {
        /*
            r3 = this;
            android.view.View r1 = r3.A0d()
            r0 = 2131434019(0x7f0b1a23, float:1.848984E38)
            android.view.View r2 = X.C36361kB.A0F(r1, r0)
            X.8VI r0 = r3.A1Z()
            java.util.List r0 = r0.A07
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0024
            androidx.recyclerview.widget.RecyclerView r1 = r3.A00
            X.AnonymousClass00C.A0B(r1)
            r0 = 1
            boolean r1 = r1.canScrollVertically(r0)
            r0 = 0
            if (r1 != 0) goto L_0x0026
        L_0x0024:
            r0 = 8
        L_0x0026:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment.A1b():void");
    }
}
