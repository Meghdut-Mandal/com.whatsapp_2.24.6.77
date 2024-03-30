package X;

import com.whatsapp.catalogcategory.view.CategoryThumbnailLoader;
import com.whatsapp.catalogcategory.view.fragment.CatalogAllCategoryFragment;

/* renamed from: X.AhR  reason: case insensitive filesystem */
public final class C22142AhR extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ CatalogAllCategoryFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22142AhR(CatalogAllCategoryFragment catalogAllCategoryFragment) {
        super(0);
        this.this$0 = catalogAllCategoryFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        CatalogAllCategoryFragment catalogAllCategoryFragment = this.this$0;
        C115875ja r0 = catalogAllCategoryFragment.A02;
        if (r0 != null) {
            return new CategoryThumbnailLoader(catalogAllCategoryFragment, (C196089Xp) r0.A00.A00.A0L.get());
        }
        throw C36331k8.A0d("thumbnailLoaderFactory");
    }
}
