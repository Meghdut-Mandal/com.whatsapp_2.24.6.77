package X;

import com.whatsapp.stickers.flow.StickerPackFlow;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.flow.StickerPackFlow", f = "StickerPackFlow.kt", i = {0, 0, 0}, l = {366}, m = "fetchStickerPack", n = {"this", "stickerPack", "downloadingStickerPacks"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: X.7Ar  reason: invalid class name and case insensitive filesystem */
public final class C151727Ar extends AnonymousClass0A0 {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StickerPackFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C151727Ar(StickerPackFlow stickerPackFlow, C023509x r2) {
        super(r2);
        this.this$0 = stickerPackFlow;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A02((AnonymousClass68B) null, this);
    }
}
