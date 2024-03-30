package X;

import com.whatsapp.expressionstray.stickers.StickerExpressionsFragment;

/* renamed from: X.7Lt  reason: invalid class name and case insensitive filesystem */
public final class C152767Lt extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ StickerExpressionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C152767Lt(StickerExpressionsFragment stickerExpressionsFragment) {
        super(0);
        this.this$0 = stickerExpressionsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        StickerExpressionsFragment stickerExpressionsFragment = this.this$0;
        stickerExpressionsFragment.A1k().A02(C36401kF.A0i(), 1, 10);
        AnonymousClass3XM r3 = (AnonymousClass3XM) C001400p.A00(C000800j.NONE, new AnonymousClass4G1(stickerExpressionsFragment)).getValue();
        C130686Ma r2 = stickerExpressionsFragment.A0G;
        if (r2 != null) {
            r2.A00(stickerExpressionsFragment.A0i(), r3, 11);
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0d("funStickerBottomSheetProvider");
    }
}
