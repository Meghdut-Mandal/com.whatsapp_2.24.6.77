package X;

import android.content.Context;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel$onShapeSelected$1;
import com.whatsapp.expressionstray.stickers.StickerExpressionsFragment;
import com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel;
import com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$onShapeSelected$1;

/* renamed from: X.7Sp  reason: invalid class name and case insensitive filesystem */
public final class C154547Sp extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ StickerExpressionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154547Sp(StickerExpressionsFragment stickerExpressionsFragment) {
        super(1);
        this.this$0 = stickerExpressionsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass040 A00;
        C005502l r4;
        C009003v stickerExpressionsViewModel$onShapeSelected$1;
        AnonymousClass6AC r7 = (AnonymousClass6AC) obj;
        AnonymousClass00C.A0D(r7, 0);
        StickerExpressionsFragment stickerExpressionsFragment = this.this$0;
        if (C36331k8.A1b(stickerExpressionsFragment.A0Q)) {
            ExpressionsSearchViewModel expressionsSearchViewModel = stickerExpressionsFragment.A0C;
            if (expressionsSearchViewModel != null) {
                Context A0a = stickerExpressionsFragment.A0a();
                A00 = C109325Xd.A00(expressionsSearchViewModel);
                r4 = expressionsSearchViewModel.A0I;
                stickerExpressionsViewModel$onShapeSelected$1 = new ExpressionsSearchViewModel$onShapeSelected$1(A0a, expressionsSearchViewModel, r7, (C023509x) null);
            }
            return AnonymousClass0AJ.A00;
        }
        StickerExpressionsViewModel A03 = StickerExpressionsFragment.A03(stickerExpressionsFragment);
        Context A0a2 = stickerExpressionsFragment.A0a();
        A00 = C109325Xd.A00(A03);
        r4 = A03.A0d;
        stickerExpressionsViewModel$onShapeSelected$1 = new StickerExpressionsViewModel$onShapeSelected$1(A0a2, A03, r7, (C023509x) null);
        C36381kD.A1R(r4, stickerExpressionsViewModel$onShapeSelected$1, A00);
        return AnonymousClass0AJ.A00;
    }
}
