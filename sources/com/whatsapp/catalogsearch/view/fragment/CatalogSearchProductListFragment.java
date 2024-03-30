package com.whatsapp.catalogsearch.view.fragment;

import X.AnonymousClass00T;
import X.AnonymousClass1KK;
import X.AnonymousClass1KP;
import X.AnonymousClass8VI;
import X.C152557Ky;
import X.C191599Dp;
import X.C36431kI;
import com.whatsapp.businessproductlist.view.adapter.BusinessProductListAdapter;

public final class CatalogSearchProductListFragment extends Hilt_CatalogSearchProductListFragment {
    public C191599Dp A00;
    public AnonymousClass1KK A01;
    public AnonymousClass1KP A02;
    public CatalogSearchFragment A03;
    public final AnonymousClass00T A04 = C36431kI.A1I(new C152557Ky(this));

    /* JADX WARNING: type inference failed for: r1v0, types: [X.02E, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1O(android.content.Context r3) {
        /*
            r2 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            super.A1O(r3)
            boolean r0 = r3 instanceof com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment
            if (r0 != 0) goto L_0x0017
            X.02E r1 = r2.A0I
            boolean r0 = r1 instanceof com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment
            if (r0 == 0) goto L_0x001c
            r3 = r1
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment.CatalogSearchProductListHost"
            X.AnonymousClass00C.A0E(r1, r0)
        L_0x0017:
            com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment r3 = (com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment) r3
            r2.A03 = r3
            return
        L_0x001c:
            java.lang.StringBuilder r1 = X.C36381kD.A11(r3)
            java.lang.String r0 = " or parentFragment must implement CatalogSearchProductListFragment.CatalogSearchProductListHost"
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment.A1O(android.content.Context):void");
    }

    public final void A1c() {
        AnonymousClass8VI A1Z = A1Z();
        if (A1Z instanceof BusinessProductListAdapter) {
            A1Z.A00.clear();
            A1Z.A07.clear();
            A1Z.A06();
        }
    }
}
