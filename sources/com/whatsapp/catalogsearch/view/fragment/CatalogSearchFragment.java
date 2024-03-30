package com.whatsapp.catalogsearch.view.fragment;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass02E;
import X.AnonymousClass185;
import X.AnonymousClass1KK;
import X.AnonymousClass1KP;
import X.AnonymousClass3L0;
import X.AnonymousClass3LE;
import X.AnonymousClass6UC;
import X.AnonymousClass7SW;
import X.AnonymousClass8XL;
import X.AnonymousClass8XM;
import X.AnonymousClass8XZ;
import X.AnonymousClass96D;
import X.AnonymousClass96H;
import X.BA7;
import X.C001600r;
import X.C135456cj;
import X.C152527Kv;
import X.C152547Kx;
import X.C157967fa;
import X.C163347q3;
import X.C18820ts;
import X.C197189bH;
import X.C19770wU;
import X.C207109uZ;
import X.C22146AhV;
import X.C22148AhX;
import X.C22149AhY;
import X.C22374Alb;
import X.C22375Alc;
import X.C224514j;
import X.C22924Aya;
import X.C26421Kc;
import X.C34081gQ;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36381kD;
import X.C36391kE;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C90514aH;
import X.C99304t3;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;

public final class CatalogSearchFragment extends Hilt_CatalogSearchFragment implements C22924Aya {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public TextView A05;
    public TextView A06;
    public Toolbar A07;
    public AnonymousClass1KK A08;
    public C26421Kc A09;
    public C197189bH A0A;
    public AnonymousClass96D A0B;
    public C207109uZ A0C;
    public AnonymousClass185 A0D;
    public C18820ts A0E;
    public AnonymousClass3LE A0F;
    public C19770wU A0G;
    public WDSButton A0H;
    public MenuItem A0I;
    public View A0J;
    public View A0K;
    public boolean A0L;
    public final AnonymousClass00T A0M = C36431kI.A1I(new C152527Kv(this));
    public final AnonymousClass00T A0N = C36431kI.A1I(new C22146AhV(this));
    public final AnonymousClass00T A0O = C36431kI.A1I(new C22148AhX(this));
    public final AnonymousClass00T A0P = C36431kI.A1I(new C22149AhY(this));
    public final AnonymousClass00T A0Q = C36431kI.A1I(new C152547Kx(this));

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        this.A01 = inflate.findViewById(R.id.container_catalog_search);
        this.A02 = inflate.findViewById(R.id.search_call_to_action);
        this.A05 = C36391kE.A0P(inflate, R.id.search_call_to_action_text);
        this.A0J = inflate.findViewById(R.id.search_child_categories_fragment_holder);
        this.A0K = inflate.findViewById(R.id.search_child_products_fragment_holder);
        this.A04 = inflate.findViewById(R.id.search_results_error_view_holder);
        this.A06 = C36391kE.A0P(inflate, R.id.search_results_error_view_text);
        this.A0H = (WDSButton) inflate.findViewById(R.id.search_results_error_view_retry_btn);
        return inflate;
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        this.A07 = (Toolbar) A0i().findViewById(R.id.toolbar);
        View findViewById = A0i().findViewById(R.id.search_holder);
        this.A03 = findViewById;
        if (this.A07 == null || findViewById == null) {
            throw AnonymousClass001.A09("Required @layout/toolbar_with_search not found in host activity");
        }
        AnonymousClass01I A0i = A0i();
        C18820ts r5 = this.A0E;
        if (r5 != null) {
            this.A0F = new AnonymousClass3LE(A0i, this.A03, new AnonymousClass6UC(this, 2), this.A07, r5);
            View view2 = this.A02;
            if (view2 != null) {
                C135456cj.A01(view2, this, 42);
                C34081gQ.A02(view2);
            }
            AnonymousClass00T r52 = this.A0Q;
            BA7.A01(A0m(), (C001600r) C36381kD.A0p(((CatalogSearchViewModel) r52.getValue()).A07), new C22374Alb(this), 42);
            BA7.A01(A0m(), ((CatalogSearchViewModel) r52.getValue()).A00, new AnonymousClass7SW(this), 43);
            BA7.A01(A0m(), ((CatalogSearchViewModel) r52.getValue()).A01, new C22375Alc(this), 41);
            WDSButton wDSButton = this.A0H;
            if (wDSButton != null) {
                C135456cj.A01(wDSButton, this, 43);
                return;
            }
            return;
        }
        throw C36321k7.A09();
    }

    public boolean A1X(MenuItem menuItem) {
        View findViewById;
        AnonymousClass00C.A0D(menuItem, 0);
        if (R.id.menuitem_search != menuItem.getItemId()) {
            return false;
        }
        View view = this.A01;
        if (view != null) {
            view.setVisibility(0);
        }
        AnonymousClass3LE r0 = this.A0F;
        if (r0 == null) {
            throw C36331k8.A0d("searchToolbarHelper");
        }
        r0.A06(false);
        CatalogSearchViewModel catalogSearchViewModel = (CatalogSearchViewModel) this.A0Q.getValue();
        AnonymousClass00T r2 = this.A0M;
        UserJid userJid = (UserJid) r2.getValue();
        int i = this.A00;
        C207109uZ r7 = this.A0C;
        AnonymousClass00C.A0D(userJid, 0);
        AnonymousClass1KP r5 = catalogSearchViewModel.A03;
        CatalogSearchViewModel.A01(catalogSearchViewModel, new AnonymousClass8XZ(AnonymousClass1KP.A00(r5, r7, "categories", r5.A01.A0E(1514))));
        C197189bH r72 = catalogSearchViewModel.A02;
        int i2 = 2;
        if (i == 0) {
            i2 = 1;
        } else if (i == 1) {
            i2 = 3;
        } else if (i != 2) {
            i2 = -1;
        }
        C197189bH.A00(r72, userJid, Integer.valueOf(i2), (Integer) null, (String) null, 1);
        catalogSearchViewModel.A04.A01.A0D("");
        View view2 = this.A03;
        if (!(view2 == null || (findViewById = view2.findViewById(R.id.search_back)) == null)) {
            C135456cj.A01(findViewById, this, 41);
        }
        View view3 = this.A03;
        if (view3 != null) {
            view3.setBackgroundResource(R.drawable.search_background);
        }
        AnonymousClass3LE r02 = this.A0F;
        if (r02 == null) {
            throw C36331k8.A0d("searchToolbarHelper");
        }
        TextView A0M2 = C36341k9.A0M(r02.A00, R.id.search_src_text);
        A0M2.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(500)});
        C36331k8.A0r(A0a(), A0M2, C224514j.A00(A0M2.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        A0M2.setHintTextColor(AnonymousClass00F.A00(A0a(), R.color.f6nameremoved));
        A0M2.setTextSize(0, C36341k9.A0G(this).getDimension(R.dimen.f7nameremoved));
        AnonymousClass185 r1 = this.A0D;
        if (r1 != null) {
            AnonymousClass3L0 A022 = r1.A02((UserJid) r2.getValue());
            if (A022 != null) {
                A0M2.setHint(A0o(R.string.f12nameremoved, A022.A08));
            }
            AnonymousClass3LE r03 = this.A0F;
            if (r03 == null) {
                throw C36331k8.A0d("searchToolbarHelper");
            }
            r03.A00.A04 = new C163347q3(this, 3);
            return true;
        }
        throw C36331k8.A0d("verifiedNameManager");
    }

    public void BXZ(int i) {
    }

    public static final C99304t3 A00(CatalogSearchFragment catalogSearchFragment, AnonymousClass96H r5) {
        int i;
        if (r5 instanceof AnonymousClass8XM) {
            i = R.string.f12nameremoved;
        } else if (r5 instanceof AnonymousClass8XL) {
            i = R.string.f12nameremoved;
        } else {
            throw C36441kJ.A18();
        }
        String A0a = C36421kH.A0a(catalogSearchFragment, i);
        if (catalogSearchFragment.A0B != null) {
            String A0a2 = C36421kH.A0a(catalogSearchFragment, R.string.f12nameremoved);
            C99304t3 A012 = C99304t3.A01(catalogSearchFragment.A0d(), A0a, 4000);
            A012.A0Z(A0a2, new C135456cj(A012, 40));
            return A012;
        }
        throw C36331k8.A0d("config");
    }

    public static final void A05(CatalogSearchFragment catalogSearchFragment) {
        CatalogSearchProductListFragment catalogSearchProductListFragment;
        AnonymousClass3LE r0 = catalogSearchFragment.A0F;
        if (r0 == null) {
            throw C36331k8.A0d("searchToolbarHelper");
        }
        r0.A00.getVisibility();
        AnonymousClass3LE r02 = catalogSearchFragment.A0F;
        if (r02 == null) {
            throw C36331k8.A0d("searchToolbarHelper");
        }
        r02.A00.clearFocus();
        AnonymousClass02E A0N2 = catalogSearchFragment.A0k().A0N("SEARCH_RESULT_LIST_FRAGMENT");
        if ((A0N2 instanceof CatalogSearchProductListFragment) && (catalogSearchProductListFragment = (CatalogSearchProductListFragment) A0N2) != null) {
            catalogSearchProductListFragment.A1c();
        }
    }

    public void A1H() {
        C26421Kc r1 = this.A09;
        if (r1 != null) {
            r1.unregisterObserver(this.A0N.getValue());
            super.A1H();
            return;
        }
        throw C36331k8.A0d("businessProfileObservers");
    }

    public void A1Z(boolean z) {
        View view = this.A01;
        if (view != null && view.getVisibility() == 0) {
            View view2 = this.A01;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            AnonymousClass3LE r0 = this.A0F;
            if (r0 == null) {
                throw C36331k8.A0d("searchToolbarHelper");
            }
            r0.A05(z);
            UserJid userJid = (UserJid) this.A0M.getValue();
            AnonymousClass00C.A0D(userJid, 0);
            C197189bH.A00(((CatalogSearchViewModel) this.A0Q.getValue()).A02, userJid, (Integer) null, (Integer) null, (String) null, 7);
        }
    }

    public boolean A1a() {
        View view = this.A01;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        A1Z(true);
        AnonymousClass01I A0i = A0i();
        if (A0i instanceof C157967fa) {
            ((C157967fa) A0i).BTC();
        }
        return true;
    }

    public static final void A03(Bundle bundle, CatalogSearchFragment catalogSearchFragment) {
        catalogSearchFragment.A0L = bundle.getBoolean("all_category_has_navigated_to_category_tabs", C90514aH.A1Y(bundle));
    }

    public static final void A06(CatalogSearchFragment catalogSearchFragment, String str) {
        A05(catalogSearchFragment);
        AnonymousClass00T r4 = catalogSearchFragment.A0Q;
        AnonymousClass00T r2 = catalogSearchFragment.A0M;
        ((CatalogSearchViewModel) r4.getValue()).A0S(catalogSearchFragment.A0C, (UserJid) r2.getValue(), str);
        UserJid userJid = (UserJid) r2.getValue();
        AnonymousClass00C.A0D(userJid, 0);
        C197189bH.A00(((CatalogSearchViewModel) r4.getValue()).A02, userJid, (Integer) null, (Integer) null, (String) null, 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment r5, java.lang.String r6, X.AnonymousClass00S r7, boolean r8) {
        /*
            X.01z r0 = r5.A0k()
            X.02E r2 = r0.A0N(r6)
            if (r2 != 0) goto L_0x000d
            if (r8 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.String r0 = "SEARCH_CATEGORY_FRAGMENT"
            boolean r4 = r6.equals(r0)
            r3 = 8
            r1 = 1
            if (r4 == 0) goto L_0x0025
            android.view.View r0 = r5.A0J
            if (r0 == 0) goto L_0x0036
            if (r8 == r1) goto L_0x0032
            if (r8 == 0) goto L_0x0033
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x0025:
            android.view.View r0 = r5.A0K
            if (r0 == 0) goto L_0x0036
            if (r8 == r1) goto L_0x0032
            if (r8 == 0) goto L_0x0033
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x0032:
            r3 = 0
        L_0x0033:
            r0.setVisibility(r3)
        L_0x0036:
            if (r2 != 0) goto L_0x003e
            java.lang.Object r2 = r7.invoke()
            X.02E r2 = (X.AnonymousClass02E) r2
        L_0x003e:
            X.01z r0 = r5.A0k()
            X.09Y r1 = new X.09Y
            r1.<init>(r0)
            boolean r0 = r2.A12()
            if (r0 != 0) goto L_0x0058
            r0 = 2131433589(0x7f0b1875, float:1.8488968E38)
            if (r4 == 0) goto L_0x0055
            r0 = 2131433588(0x7f0b1874, float:1.8488966E38)
        L_0x0055:
            r1.A0E(r2, r6, r0)
        L_0x0058:
            if (r8 == 0) goto L_0x0061
            r1.A09(r2)
        L_0x005d:
            r1.A03()
            return
        L_0x0061:
            r1.A07(r2)
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment.A07(com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment, java.lang.String, X.00S, boolean):void");
    }

    public void A1B() {
        super.A1B();
        if (this.A0L) {
            this.A0L = false;
            A1Z(false);
        }
    }

    public void A1J() {
        super.A1J();
        View view = this.A02;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
        WDSButton wDSButton = this.A0H;
        if (wDSButton != null) {
            wDSButton.setOnClickListener((View.OnClickListener) null);
        }
        this.A0I = null;
        this.A07 = null;
        this.A03 = null;
        this.A01 = null;
        this.A05 = null;
        this.A02 = null;
        this.A0J = null;
        this.A0K = null;
        this.A04 = null;
        this.A06 = null;
        this.A0H = null;
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        A10(true);
        this.A00 = A0b().getInt("search_entry_point");
        this.A0C = (C207109uZ) A0b().getParcelable("business_profile");
        C26421Kc r1 = this.A09;
        if (r1 != null) {
            r1.registerObserver(this.A0N.getValue());
            return;
        }
        throw C36331k8.A0d("businessProfileObservers");
    }

    public void A1U(Menu menu, MenuInflater menuInflater) {
        boolean A1a = C36331k8.A1a(menu, menuInflater);
        MenuItem findItem = menu.findItem(R.id.menuitem_search);
        this.A0I = findItem;
        if (findItem != null) {
            findItem.setVisible(A1a);
        }
    }
}
