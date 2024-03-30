package X;

import com.whatsapp.expressionstray.stickers.StickerExpressionsFragment;
import com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel;
import com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$onClickCloseStickerMakerUpsell$1;
import com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$onClickCloseStickersUpsell$1;

/* renamed from: X.7Lu  reason: invalid class name and case insensitive filesystem */
public final class C152777Lu extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ StickerExpressionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C152777Lu(StickerExpressionsFragment stickerExpressionsFragment) {
        super(0);
        this.this$0 = stickerExpressionsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C009003v stickerExpressionsViewModel$onClickCloseStickerMakerUpsell$1;
        C120215r9 r0 = this.this$0.A0M;
        if (r0 != null) {
            boolean A03 = AnonymousClass1Ax.A03(r0.A01, 7314);
            StickerExpressionsViewModel A032 = StickerExpressionsFragment.A03(this.this$0);
            AnonymousClass040 A00 = C109325Xd.A00(A032);
            C005502l r2 = A032.A0d;
            if (!A03) {
                stickerExpressionsViewModel$onClickCloseStickerMakerUpsell$1 = new StickerExpressionsViewModel$onClickCloseStickersUpsell$1(A032, (C023509x) null);
            } else {
                stickerExpressionsViewModel$onClickCloseStickerMakerUpsell$1 = new StickerExpressionsViewModel$onClickCloseStickerMakerUpsell$1(A032, (C023509x) null);
            }
            C36381kD.A1R(r2, stickerExpressionsViewModel$onClickCloseStickerMakerUpsell$1, A00);
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0d("stickerMakerConfigs");
    }
}
