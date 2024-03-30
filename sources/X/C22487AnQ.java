package X;

import com.whatsapp.R;
import com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.AnQ  reason: case insensitive filesystem */
public final class C22487AnQ extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ String $productId;
    public final /* synthetic */ UserJid $productOwnerJid;
    public final /* synthetic */ ProductBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22487AnQ(ProductBottomSheetViewModel productBottomSheetViewModel, UserJid userJid, String str) {
        super(1);
        this.this$0 = productBottomSheetViewModel;
        this.$productOwnerJid = userJid;
        this.$productId = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass9W6 r4 = (AnonymousClass9W6) obj;
        if (r4 == null) {
            ProductBottomSheetViewModel productBottomSheetViewModel = this.this$0;
            C198909eO r2 = productBottomSheetViewModel.A0M;
            C198909eO.A00(r2, new C22465An4(r2, AnonymousClass000.A1V(productBottomSheetViewModel.A02)));
        }
        ProductBottomSheetViewModel productBottomSheetViewModel2 = this.this$0;
        productBottomSheetViewModel2.A0K.A0A(new AnonymousClass9NZ(r4, this.$productOwnerJid, Integer.valueOf(C36441kJ.A05(productBottomSheetViewModel2.A0C.getResources(), R.dimen.f7nameremoved)), Integer.valueOf(C36441kJ.A05(this.this$0.A0C.getResources(), R.dimen.f7nameremoved)), this.$productId, this.this$0.A0J.A02, false));
        return AnonymousClass0AJ.A00;
    }
}
