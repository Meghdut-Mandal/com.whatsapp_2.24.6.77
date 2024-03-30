package X;

import com.whatsapp.catalogcategory.view.CategoryThumbnailLoader;
import com.whatsapp.catalogcategory.view.fragment.CatalogCategoryExpandableGroupsListFragment;

/* renamed from: X.AhT  reason: case insensitive filesystem */
public final class C22144AhT extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ CatalogCategoryExpandableGroupsListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22144AhT(CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment) {
        super(0);
        this.this$0 = catalogCategoryExpandableGroupsListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment = this.this$0;
        C115875ja r0 = catalogCategoryExpandableGroupsListFragment.A03;
        if (r0 != null) {
            return new CategoryThumbnailLoader(catalogCategoryExpandableGroupsListFragment, (C196089Xp) r0.A00.A00.A0L.get());
        }
        throw C36331k8.A0d("thumbnailLoaderFactory");
    }
}
