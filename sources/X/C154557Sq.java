package X;

import com.whatsapp.expressionstray.stickers.StickerExpressionsFragment;

/* renamed from: X.7Sq  reason: invalid class name and case insensitive filesystem */
public final class C154557Sq extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ StickerExpressionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154557Sq(StickerExpressionsFragment stickerExpressionsFragment) {
        super(1);
        this.this$0 = stickerExpressionsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        AnonymousClass00C.A0D(str, 0);
        StickerExpressionsFragment stickerExpressionsFragment = this.this$0;
        if (stickerExpressionsFragment.A0L != null) {
            stickerExpressionsFragment.A1C(AnonymousClass190.A1D(stickerExpressionsFragment.A0i(), str, "info_dialog"));
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0X();
    }
}
