package X;

import com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment;

/* renamed from: X.Ah0  reason: case insensitive filesystem */
public final class C22115Ah0 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ BusinessProductListBaseFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22115Ah0(BusinessProductListBaseFragment businessProductListBaseFragment) {
        super(0);
        this.this$0 = businessProductListBaseFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        BusinessProductListBaseFragment businessProductListBaseFragment = this.this$0;
        C22909AyL ayL = businessProductListBaseFragment.A01;
        if (ayL != null) {
            return ayL.B3r(businessProductListBaseFragment.A1a());
        }
        throw C36331k8.A0d("activeCartRepositoryFactory");
    }
}
