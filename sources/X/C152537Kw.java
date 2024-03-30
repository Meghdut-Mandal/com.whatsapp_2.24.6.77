package X;

import android.os.Bundle;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment;
import com.whatsapp.jid.Jid;

/* renamed from: X.7Kw  reason: invalid class name and case insensitive filesystem */
public final class C152537Kw extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ CatalogSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C152537Kw(CatalogSearchFragment catalogSearchFragment) {
        super(0);
        this.this$0 = catalogSearchFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Jid jid = (Jid) this.this$0.A0M.getValue();
        AnonymousClass00C.A0D(jid, 0);
        Bundle A07 = AnonymousClass001.A07();
        A07.putParcelable("category_biz_id", jid);
        A07.putInt("business_product_list_entry_point", 3);
        CatalogSearchProductListFragment catalogSearchProductListFragment = new CatalogSearchProductListFragment();
        catalogSearchProductListFragment.A17(A07);
        return catalogSearchProductListFragment;
    }
}
