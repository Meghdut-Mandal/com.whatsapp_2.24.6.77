package X;

import com.whatsapp.biz.product.view.fragment.ProductBottomSheet;
import com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.AlG  reason: case insensitive filesystem */
public final class C22353AlG extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ ProductBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22353AlG(ProductBottomSheet productBottomSheet) {
        super(1);
        this.this$0 = productBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        AnonymousClass00C.A0D(str, 0);
        ProductBottomSheet productBottomSheet = this.this$0;
        ProductBottomSheetViewModel productBottomSheetViewModel = productBottomSheet.A08;
        if (productBottomSheetViewModel == null) {
            throw C36331k8.A0a();
        }
        UserJid userJid = productBottomSheet.A0A;
        if (userJid == null) {
            throw C36331k8.A0d("productOwnerJid");
        }
        productBottomSheetViewModel.A0T(userJid, str);
        if (!productBottomSheetViewModel.A06.getAndSet(true)) {
            C64183Mz.A00(productBottomSheetViewModel.A0L, userJid, 45);
        }
        return AnonymousClass0AJ.A00;
    }
}
