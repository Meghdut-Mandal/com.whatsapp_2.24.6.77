package com.whatsapp.stickers.stickerpack;

import X.AnonymousClass000;
import X.AnonymousClass00S;
import X.AnonymousClass040;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AK;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass68B;
import X.C009003v;
import X.C023509x;
import X.C159707jn;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.stickerpack.StickerPackDownloader$downloadStickersInParallel$1", f = "StickerPackDownloader.kt", i = {}, l = {259}, m = "invokeSuspend", n = {}, s = {})
public final class StickerPackDownloader$downloadStickersInParallel$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C159707jn $batchStickerDownloadListener;
    public final /* synthetic */ AnonymousClass040 $downloadScope;
    public final /* synthetic */ AnonymousClass00S $onStickerDownloaded;
    public final /* synthetic */ AnonymousClass68B $stickerPack;
    public int label;
    public final /* synthetic */ StickerPackDownloader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPackDownloader$downloadStickersInParallel$1(AnonymousClass68B r2, C159707jn r3, StickerPackDownloader stickerPackDownloader, C023509x r5, AnonymousClass00S r6, AnonymousClass040 r7) {
        super(2, r5);
        this.this$0 = stickerPackDownloader;
        this.$downloadScope = r7;
        this.$stickerPack = r2;
        this.$batchStickerDownloadListener = r3;
        this.$onStickerDownloaded = r6;
    }

    public final C023509x create(Object obj, C023509x r9) {
        return new StickerPackDownloader$downloadStickersInParallel$1(this.$stickerPack, this.$batchStickerDownloadListener, this.this$0, r9, this.$onStickerDownloaded, this.$downloadScope);
    }

    public final Object invokeSuspend(Object obj) {
        Object A01;
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            StickerPackDownloader stickerPackDownloader = this.this$0;
            AnonymousClass040 r8 = this.$downloadScope;
            AnonymousClass68B r3 = this.$stickerPack;
            C159707jn r4 = this.$batchStickerDownloadListener;
            AnonymousClass00S r7 = this.$onStickerDownloaded;
            this.label = 1;
            A01 = StickerPackDownloader.A01(r3, r4, stickerPackDownloader, this, r7, r8);
            if (A01 == r2) {
                return r2;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
            A01 = ((AnonymousClass0AK) obj).value;
        } else {
            throw AnonymousClass000.A0e();
        }
        return new AnonymousClass0AK(A01);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerPackDownloader$downloadStickersInParallel$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
