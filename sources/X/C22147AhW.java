package X;

import android.os.Bundle;
import com.whatsapp.catalogcategory.view.fragment.CatalogAllCategoryFragment;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.AhW  reason: case insensitive filesystem */
public final class C22147AhW extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ CatalogSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22147AhW(CatalogSearchFragment catalogSearchFragment) {
        super(0);
        this.this$0 = catalogSearchFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        UserJid userJid = (UserJid) this.this$0.A0M.getValue();
        C187808yZ r3 = C187808yZ.CATALOG_SEARCH_FLOW;
        C36321k7.A0w("catalog_category_dummy_root_id", userJid);
        Bundle A07 = AnonymousClass001.A07();
        A07.putString("parent_category_id", "catalog_category_dummy_root_id");
        A07.putParcelable("category_biz_id", userJid);
        A07.putString("category_display_context", "CATALOG_SEARCH_FLOW");
        CatalogAllCategoryFragment catalogAllCategoryFragment = new CatalogAllCategoryFragment();
        catalogAllCategoryFragment.A17(A07);
        return catalogAllCategoryFragment;
    }
}
