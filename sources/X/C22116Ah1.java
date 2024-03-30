package X;

import android.app.Application;
import com.whatsapp.businessproductlist.view.fragment.CollectionProductListFragment;

/* renamed from: X.Ah1  reason: case insensitive filesystem */
public final class C22116Ah1 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ CollectionProductListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22116Ah1(CollectionProductListFragment collectionProductListFragment) {
        super(0);
        this.this$0 = collectionProductListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        CollectionProductListFragment collectionProductListFragment = this.this$0;
        Application application = collectionProductListFragment.A0i().getApplication();
        CollectionProductListFragment collectionProductListFragment2 = this.this$0;
        C202279lS r2 = collectionProductListFragment2.A06;
        if (r2 != null) {
            C198849eI r1 = collectionProductListFragment2.A05;
            if (r1 != null) {
                return C165617ti.A0A(new C138526iF(application, r1, r2), collectionProductListFragment).A00(C95354ke.class);
            }
            throw C36331k8.A0d("categoriesLogger");
        }
        throw C36331k8.A0d("catalogManager");
    }
}
