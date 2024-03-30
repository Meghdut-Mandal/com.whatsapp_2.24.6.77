package X;

import com.whatsapp.stickers.flow.StickerPackFlow;

/* renamed from: X.7OA  reason: invalid class name */
public final class AnonymousClass7OA extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C162907pL $observer;
    public final /* synthetic */ StickerPackFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7OA(C162907pL r2, StickerPackFlow stickerPackFlow) {
        super(0);
        this.this$0 = stickerPackFlow;
        this.$observer = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        this.this$0.A04.unregisterObserver(this.$observer);
        return AnonymousClass0AJ.A00;
    }
}
