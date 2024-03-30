package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity;

/* renamed from: X.B6w  reason: case insensitive filesystem */
public class C23137B6w extends AnonymousClass0UE {
    public Object A00;
    public final int A01;

    public C23137B6w(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A03(RecyclerView recyclerView, int i) {
        if (4 - this.A01 != 0) {
            super.A03(recyclerView, i);
        } else {
            ((IndiaUpiBankPickerActivity) this.A00).A0C = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0133, code lost:
        r1 = (com.whatsapp.biz.catalog.view.activity.CatalogListActivity) r8.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(androidx.recyclerview.widget.RecyclerView r9, int r10, int r11) {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L_0x0130;
                case 1: goto L_0x00b4;
                case 2: goto L_0x0086;
                case 3: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A04(r9, r10, r11)
        L_0x0008:
            return
        L_0x0009:
            if (r11 <= 0) goto L_0x0008
            java.lang.Object r6 = r8.A00
            com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment r6 = (com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment) r6
            androidx.recyclerview.widget.RecyclerView r0 = r6.A00
            X.AnonymousClass00C.A0B(r0)
            X.0CP r0 = r0.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            if (r0 == 0) goto L_0x0008
            int r2 = r0.A0L()
            int r1 = r0.A0M()
            int r0 = r0.A1T()
            int r2 = r2 + r0
            int r1 = r1 - r2
            r0 = 4
            if (r1 > r0) goto L_0x0008
            X.8VI r0 = r6.A1Z()
            boolean r0 = r0.A0P()
            if (r0 != 0) goto L_0x0008
            boolean r0 = r6 instanceof com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment
            if (r0 == 0) goto L_0x0151
            com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment r6 = (com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment) r6
            X.8VI r0 = r6.A1Z()
            boolean r0 = r0.A0P()
            if (r0 != 0) goto L_0x0008
            com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment r1 = r6.A03
            if (r1 == 0) goto L_0x0008
            X.00T r0 = r1.A0Q
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel r4 = (com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel) r4
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel r0 = (com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel) r0
            X.00r r0 = r0.A00
            java.lang.Object r3 = r0.A04()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x0065
            java.lang.String r3 = ""
        L_0x0065:
            X.00T r0 = r1.A0M
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.9uZ r1 = r1.A0C
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)
            X.1KP r0 = r4.A03
            boolean r0 = r0.A01(r1)
            if (r0 != 0) goto L_0x0149
            X.8XW r1 = X.AnonymousClass8XW.A00
            X.8Xa r0 = new X.8Xa
            r0.<init>(r1)
            com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel.A01(r4, r0)
            return
        L_0x0086:
            java.lang.Object r3 = r8.A00
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r3 = (com.whatsapp.biz.catalog.view.activity.ProductListActivity) r3
            com.whatsapp.biz.catalog.view.activity.ProductListActivity.A01(r3)
            X.7zp r0 = r3.A0F
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L_0x0008
            X.0CP r0 = r9.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            if (r0 == 0) goto L_0x0008
            int r2 = r0.A0L()
            int r1 = r0.A0M()
            int r0 = r0.A1T()
            int r2 = r2 + r0
            int r1 = r1 - r2
            r0 = 4
            if (r1 > r0) goto L_0x0008
            X.7y7 r0 = r3.A0G
            r0.A0S()
            return
        L_0x00b4:
            int r0 = r9.getScrollState()
            if (r0 == 0) goto L_0x0008
            X.0CP r0 = r9.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r2 = r0.A0L()
            int r1 = r0.A0M()
            int r0 = r0.A1T()
            int r2 = r2 + r0
            int r1 = r1 - r2
            r0 = 4
            if (r1 > r0) goto L_0x0008
            java.lang.Object r0 = r8.A00
            X.8W7 r0 = (X.AnonymousClass8W7) r0
            X.7yA r2 = r0.A0I
            com.whatsapp.jid.UserJid r4 = r0.A0L
            r7 = 0
            X.AnonymousClass00C.A0D(r4, r7)
            X.1KP r1 = r2.A0M
            X.9uZ r0 = r2.A00
            boolean r0 = r1.A03(r0, r4)
            if (r0 == 0) goto L_0x011c
            X.1Ws r0 = r2.A0I
            X.9VS r0 = r0.A03(r4)
            if (r0 == 0) goto L_0x00f3
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x011c
        L_0x00f3:
            X.9lS r3 = r2.A0L
            int r5 = r2.A05
            X.0wQ r0 = r3.A08
            boolean r0 = r0.A0M(r4)
            int r0 = X.C36371kC.A00(r0)
            int r6 = r0 * 4
            X.9UB r1 = r3.A0G
            java.util.Set r0 = X.AnonymousClass96V.A00()
            X.AnZ r2 = new X.AnZ
            r2.<init>(r3, r4, r5, r6, r7)
            r1.A01(r4, r0, r2)
        L_0x0111:
            r1 = 38
            X.AVa r0 = new X.AVa
            r0.<init>(r8, r9, r1)
            r9.post(r0)
            return
        L_0x011c:
            X.9lS r3 = r2.A0L
            int r2 = r2.A05
            X.0wQ r0 = r3.A08
            boolean r1 = r0.A0M(r4)
            r0 = 1
            if (r1 == 0) goto L_0x012a
            r0 = 4
        L_0x012a:
            int r0 = r0 * 6
            X.C202279lS.A01(r3, r4, r2, r0, r7)
            goto L_0x0111
        L_0x0130:
            r0 = 5
            if (r11 <= r0) goto L_0x0141
            java.lang.Object r1 = r8.A00
            com.whatsapp.biz.catalog.view.activity.CatalogListActivity r1 = (com.whatsapp.biz.catalog.view.activity.CatalogListActivity) r1
            X.9RN r0 = r1.A09
            if (r0 == 0) goto L_0x0141
            r0.A00()
            r0 = 0
            r1.A09 = r0
        L_0x0141:
            java.lang.Object r0 = r8.A00
            com.whatsapp.biz.catalog.view.activity.CatalogListActivity r0 = (com.whatsapp.biz.catalog.view.activity.CatalogListActivity) r0
            com.whatsapp.biz.catalog.view.activity.CatalogListActivity.A07(r0)
            return
        L_0x0149:
            X.9cb r1 = r4.A05
            X.8ya r0 = X.C187818ya.CONTINUE
            X.C197919cb.A00(r0, r1, r2, r3)
            return
        L_0x0151:
            com.whatsapp.businessproductlist.view.fragment.CollectionProductListFragment r6 = (com.whatsapp.businessproductlist.view.fragment.CollectionProductListFragment) r6
            X.00T r0 = r6.A0G
            java.lang.Object r5 = r0.getValue()
            X.4ke r5 = (X.C95354ke) r5
            com.whatsapp.jid.UserJid r4 = r6.A1a()
            java.lang.String r3 = r6.A1c()
            int r1 = r6.A00
            r0 = -1
            boolean r2 = X.C36381kD.A1U(r1, r0)
            X.9lS r1 = r5.A00
            X.5ks r0 = r5.A01
            int r0 = r0.A00
            r1.A04(r0, r4, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23137B6w.A04(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
