package X;

import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.biz.cart.view.fragment.PromotionApplicationFragment;

/* renamed from: X.7S0  reason: invalid class name */
public final class AnonymousClass7S0 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ PromotionApplicationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7S0(PromotionApplicationFragment promotionApplicationFragment) {
        super(1);
        this.this$0 = promotionApplicationFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        TextInputLayout textInputLayout;
        C109865Zk r3 = (C109865Zk) obj;
        AnonymousClass01I A0i = this.this$0.A0i();
        AnonymousClass00C.A0E(A0i, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
        ((C225314u) A0i).Bnv();
        if (r3 instanceof C102204zT) {
            this.this$0.A1b();
        } else if (r3 instanceof C102194zS) {
            PromotionApplicationFragment promotionApplicationFragment = this.this$0;
            C21060yb r1 = promotionApplicationFragment.A02;
            if (!(r1 == null || (textInputLayout = promotionApplicationFragment.A00) == null)) {
                AnonymousClass3T3.A02(textInputLayout, r1);
            }
            PromotionApplicationFragment.A03((C102194zS) r3, this.this$0);
        }
        return AnonymousClass0AJ.A00;
    }
}
