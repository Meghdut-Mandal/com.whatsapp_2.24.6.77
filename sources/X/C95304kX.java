package X;

import android.os.Bundle;
import com.whatsapp.businessproductlist.view.fragment.CollectionProductListFragment;
import com.whatsapp.catalogcategory.view.fragment.CatalogCategoryExpandableGroupsListFragment;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.4kX  reason: invalid class name and case insensitive filesystem */
public final class C95304kX extends C03890Ih {
    public List A00;

    public C95304kX(AnonymousClass01z r2) {
        super(r2, 1);
    }

    public /* bridge */ /* synthetic */ CharSequence A0F(int i) {
        List list = this.A00;
        if (list != null) {
            return ((AnonymousClass6CI) list.get(i)).A02;
        }
        throw C36331k8.A0d("tabItemsList");
    }

    public int A0H() {
        List list = this.A00;
        if (list != null) {
            return list.size();
        }
        throw C36331k8.A0d("tabItemsList");
    }

    public AnonymousClass02E A0L(int i) {
        List list = this.A00;
        if (list == null) {
            throw C36331k8.A0d("tabItemsList");
        }
        AnonymousClass6CI r1 = (AnonymousClass6CI) list.get(i);
        if (r1.A03) {
            UserJid userJid = r1.A00;
            String str = r1.A01;
            Bundle A07 = AnonymousClass001.A07();
            A07.putParcelable("category_biz_id", userJid);
            A07.putString("collection-id", str);
            A07.putString("collection-index", (String) null);
            A07.putInt("business_product_list_entry_point", 2);
            A07.putInt("category_browsing_entry_point", 3);
            A07.putInt("category_level", 1);
            CollectionProductListFragment collectionProductListFragment = new CollectionProductListFragment();
            collectionProductListFragment.A17(A07);
            return collectionProductListFragment;
        }
        String str2 = r1.A01;
        UserJid userJid2 = r1.A00;
        Bundle A072 = AnonymousClass001.A07();
        A072.putString("parent_category_id", str2);
        A072.putParcelable("category_biz_id", userJid2);
        CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment = new CatalogCategoryExpandableGroupsListFragment();
        catalogCategoryExpandableGroupsListFragment.A17(A072);
        return catalogCategoryExpandableGroupsListFragment;
    }
}
