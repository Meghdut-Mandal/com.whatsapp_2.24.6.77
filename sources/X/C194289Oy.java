package X;

import com.whatsapp.biz.catalog.view.activity.ProductListActivity;
import com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel;
import com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment;

/* renamed from: X.9Oy  reason: invalid class name and case insensitive filesystem */
public abstract class C194289Oy {
    public void A00() {
        C195419Uf r0;
        B76 b76 = (B76) this;
        int i = b76.A01;
        Object obj = b76.A00;
        switch (i) {
            case 0:
                r0 = ((AnonymousClass8W7) obj).A0I.A0E;
                break;
            case 1:
                r0 = ((ProductListActivity) obj).A0G.A04;
                break;
            case 2:
                r0 = ((AnonymousClass8WH) obj).A0h.A0C;
                break;
            case 3:
                r0 = ((ProductBottomSheetViewModel) obj).A00;
                if (r0 == null) {
                    return;
                }
                break;
            case 4:
                r0 = ((C174338Wd) obj).A0H.A02;
                break;
            case 5:
                r0 = ((C167537yE) ((BusinessProductListBaseFragment) obj).A0K.getValue()).A02;
                break;
            default:
                r0 = ((C167607yM) obj).A02;
                break;
        }
        r0.A00();
    }
}
