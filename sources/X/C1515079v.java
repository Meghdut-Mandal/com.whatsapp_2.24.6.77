package X;

import com.whatsapp.stickers.stickerpack.StickerPackDownloader;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.stickerpack.StickerPackDownloader", f = "StickerPackDownloader.kt", i = {}, l = {322}, m = "executeStickerDownloadInParallel-yxL6bBk", n = {}, s = {})
/* renamed from: X.79v  reason: invalid class name and case insensitive filesystem */
public final class C1515079v extends AnonymousClass0A0 {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StickerPackDownloader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1515079v(StickerPackDownloader stickerPackDownloader, C023509x r2) {
        super(r2);
        this.this$0 = stickerPackDownloader;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object A01 = StickerPackDownloader.A01((AnonymousClass68B) null, (C159707jn) null, this.this$0, this, (AnonymousClass00S) null, (AnonymousClass040) null);
        if (A01 != AnonymousClass0AO.COROUTINE_SUSPENDED) {
            return new AnonymousClass0AK(A01);
        }
        return A01;
    }
}
