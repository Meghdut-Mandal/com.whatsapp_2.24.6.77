package com.whatsapp.stickers.stickerpack;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass040;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AK;
import X.AnonymousClass0AN;
import X.AnonymousClass5L4;
import X.AnonymousClass5L5;
import X.C009003v;
import X.C009403z;
import X.C023509x;
import X.C111665ce;
import X.C135066c4;
import X.C159707jn;
import X.C24191Bm;
import X.C36321k7;
import X.C36441kJ;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.stickerpack.StickerPackDownloader$executeStickerDownloadInParallel$deferredDownloads$1$1", f = "StickerPackDownloader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerPackDownloader$executeStickerDownloadInParallel$deferredDownloads$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C159707jn $batchStickerDownloadListener;
    public final /* synthetic */ AnonymousClass040 $coroutineScope;
    public final /* synthetic */ AnonymousClass00S $onStickerDownloaded;
    public final /* synthetic */ C135066c4 $sticker;
    public int label;
    public final /* synthetic */ StickerPackDownloader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPackDownloader$executeStickerDownloadInParallel$deferredDownloads$1$1(C135066c4 r2, C159707jn r3, StickerPackDownloader stickerPackDownloader, C023509x r5, AnonymousClass00S r6, AnonymousClass040 r7) {
        super(2, r5);
        this.$batchStickerDownloadListener = r3;
        this.$coroutineScope = r7;
        this.this$0 = stickerPackDownloader;
        this.$sticker = r2;
        this.$onStickerDownloaded = r6;
    }

    public final C023509x create(Object obj, C023509x r9) {
        C159707jn r2 = this.$batchStickerDownloadListener;
        AnonymousClass040 r6 = this.$coroutineScope;
        return new StickerPackDownloader$executeStickerDownloadInParallel$deferredDownloads$1$1(this.$sticker, r2, this.this$0, r9, this.$onStickerDownloaded, r6);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        IllegalStateException A09;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            if (this.$batchStickerDownloadListener.BLM()) {
                C009403z.A03(new CancellationException("cancelled"), this.$coroutineScope);
                A09 = AnonymousClass001.A09("cancelled");
            } else {
                C24191Bm r1 = this.this$0.A09;
                C135066c4 r0 = this.$sticker;
                AnonymousClass00C.A07(r0);
                C111665ce A00 = r1.A00(r0);
                if (A00 instanceof AnonymousClass5L4) {
                    AnonymousClass040 r4 = this.$coroutineScope;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("error: ");
                    String str = ((AnonymousClass5L4) A00).A00;
                    C009403z.A03(new CancellationException(AnonymousClass000.A0q(str, A0u)), r4);
                    A09 = AnonymousClass001.A09(C36321k7.A0D("error: ", str));
                } else if (A00 instanceof AnonymousClass5L5) {
                    this.$onStickerDownloaded.invoke();
                    obj2 = ((AnonymousClass5L5) A00).A00;
                    return new AnonymousClass0AK(obj2);
                } else {
                    throw C36441kJ.A18();
                }
            }
            obj2 = AnonymousClass00C.A02(A09);
            return new AnonymousClass0AK(obj2);
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerPackDownloader$executeStickerDownloadInParallel$deferredDownloads$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
