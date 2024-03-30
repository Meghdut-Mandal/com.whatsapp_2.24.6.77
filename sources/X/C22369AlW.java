package X;

import com.whatsapp.catalogcategory.view.fragment.CatalogAllCategoryFragment;
import java.util.List;

/* renamed from: X.AlW  reason: case insensitive filesystem */
public final class C22369AlW extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ CatalogAllCategoryFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22369AlW(CatalogAllCategoryFragment catalogAllCategoryFragment) {
        super(1);
        this.this$0 = catalogAllCategoryFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        CatalogAllCategoryFragment catalogAllCategoryFragment = this.this$0;
        AnonymousClass00C.A0B(list);
        C167947zS r0 = catalogAllCategoryFragment.A03;
        if (r0 == null) {
            throw C36331k8.A0d("categoryListAdapter");
        }
        r0.A0M(list);
        return AnonymousClass0AJ.A00;
    }
}
