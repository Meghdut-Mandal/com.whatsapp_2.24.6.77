package X;

import com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.Agz  reason: case insensitive filesystem */
public final class C22114Agz extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ BusinessProductListBaseFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22114Agz(BusinessProductListBaseFragment businessProductListBaseFragment) {
        super(0);
        this.this$0 = businessProductListBaseFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        BusinessProductListBaseFragment businessProductListBaseFragment = this.this$0;
        UserJid A1a = businessProductListBaseFragment.A1a();
        AnonymousClass4PE r0 = this.this$0.A04;
        if (r0 != null) {
            return C165577te.A0M(businessProductListBaseFragment, r0, A1a);
        }
        throw C36331k8.A0d("cartMenuViewModelFactory");
    }
}
