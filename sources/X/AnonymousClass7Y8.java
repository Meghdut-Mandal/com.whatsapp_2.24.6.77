package X;

import com.whatsapp.expressionstray.stickers.StickerExpressionsFragment;

/* renamed from: X.7Y8  reason: invalid class name */
public final class AnonymousClass7Y8 extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ StickerExpressionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7Y8(StickerExpressionsFragment stickerExpressionsFragment) {
        super(2);
        this.this$0 = stickerExpressionsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C135066c4 r5 = (C135066c4) obj;
        C125385zp r4 = (C125385zp) obj2;
        C36321k7.A0w(r5, r4);
        AnonymousClass6O1 A1k = this.this$0.A1k();
        int i = 10;
        if (this.this$0.A0C != null) {
            i = 9;
        }
        A1k.A02(32, 4, i);
        r5.A05 = Integer.valueOf(C36421kH.A01(AnonymousClass00C.A0J(r4.A00(), "all") ? 1 : 0));
        StickerExpressionsFragment stickerExpressionsFragment = this.this$0;
        AnonymousClass3DC r2 = stickerExpressionsFragment.A0F;
        if (r2 != null) {
            r2.A00(stickerExpressionsFragment.A0h(), r4, r5, C36431kI.A1E(AnonymousClass3TE.A00(stickerExpressionsFragment, "rawChatJid")), C36331k8.A1b(this.this$0.A0Q));
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0d("longClickStickerInfoDialog");
    }
}
