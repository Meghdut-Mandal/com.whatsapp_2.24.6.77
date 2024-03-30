package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.whatsapp.biz.BusinessProfileExtraFieldsActivity;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;
import com.whatsapp.businessproductlist.view.fragment.CollectionProductListFragment;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.jid.UserJid;
import java.util.List;

public class BAG implements AnonymousClass7fY {
    public Object A00;
    public final int A01;

    public BAG(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass1KK r1, UserJid userJid, Object obj, int i) {
        r1.A0C(new BAG(obj, i), userJid);
    }

    public final void BSQ(C207109uZ r6) {
        C001700s r1;
        AnonymousClass3TW r0;
        switch (this.A01) {
            case 0:
                BusinessProfileExtraFieldsActivity businessProfileExtraFieldsActivity = (BusinessProfileExtraFieldsActivity) this.A00;
                if (r6 != null && (r0 = businessProfileExtraFieldsActivity.A00) != null) {
                    r0.A04(r6);
                    return;
                }
                return;
            case 1:
                if (r6 == null) {
                    AnonymousClass8VH r4 = (AnonymousClass8VH) this.A00;
                    r4.A01.A0E(new C21105A8q(r4), r4.A00, (String) null);
                    return;
                }
                ((AnonymousClass8VH) this.A00).A05(r6);
                return;
            case 2:
                C198329dH r02 = (C198329dH) this.A00;
                if (r6 != null && (r1 = r02.A05) != null) {
                    C36341k9.A19(r1, r6.A0Y);
                    return;
                }
                return;
            case 3:
                C001700s r03 = ((C198329dH) this.A00).A00;
                if (r03 != null) {
                    r03.A0C(r6);
                    return;
                }
                return;
            case 4:
                ProductDetailActivity.A01((ProductDetailActivity) this.A00, r6);
                return;
            case 5:
                C174338Wd r3 = (C174338Wd) this.A00;
                AnonymousClass8VI r2 = r3.A0I;
                if (r6 != r2.A00) {
                    r2.A00 = r6;
                    AnonymousClass0CP layoutManager = r3.A02.getLayoutManager();
                    if (layoutManager instanceof LinearLayoutManager) {
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                        int A1T = linearLayoutManager.A1T();
                        r3.A0I.A0A(A1T, (linearLayoutManager.A1V() - A1T) + 1);
                        return;
                    }
                    r2.A0A(0, r2.A00.size());
                    return;
                }
                return;
            case 6:
                CollectionProductListFragment collectionProductListFragment = (CollectionProductListFragment) this.A00;
                collectionProductListFragment.A1Z().A00 = r6;
                C29461Ws r22 = collectionProductListFragment.A06;
                if (r22 != null) {
                    C195929Wv A05 = r22.A05(collectionProductListFragment.A1a(), collectionProductListFragment.A1c());
                    if (AnonymousClass00C.A0J(collectionProductListFragment.A1c(), "catalog_products_all_items_collection_id")) {
                        AnonymousClass8VI A1Z = collectionProductListFragment.A1Z();
                        C29461Ws r12 = collectionProductListFragment.A06;
                        if (r12 != null) {
                            A1Z.A0R((C195929Wv) null, r12.A09(collectionProductListFragment.A1a()));
                        } else {
                            throw C36331k8.A0d("catalogCacheManager");
                        }
                    } else if (A05 != null) {
                        List list = A05.A04;
                        if (C36401kF.A1a(list)) {
                            collectionProductListFragment.A1Z().A0R(A05, list);
                        }
                    }
                    AnonymousClass00C.A0B(collectionProductListFragment.A0B);
                    return;
                }
                throw C36331k8.A0d("catalogCacheManager");
            case 7:
                ((CatalogSearchFragment) this.A00).A0C = r6;
                return;
            default:
                C167797yq r04 = (C167797yq) this.A00;
                r04.A02 = r6;
                C167797yq.A03(r04);
                return;
        }
    }
}
