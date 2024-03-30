package com.whatsapp.stickers.stickerpack;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C24201Bn;
import com.whatsapp.stickers.avatars.AvatarStickerLocatorImpl$locateOnDeviceAvatarStickerStableIDs$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.stickerpack.StickerPackDownloader$fetchAvatarStickerPackDataWithOnDemand$onDeviceStableIds$1", f = "StickerPackDownloader.kt", i = {}, l = {437}, m = "invokeSuspend", n = {}, s = {})
public final class StickerPackDownloader$fetchAvatarStickerPackDataWithOnDemand$onDeviceStableIds$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ StickerPackDownloader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPackDownloader$fetchAvatarStickerPackDataWithOnDemand$onDeviceStableIds$1(StickerPackDownloader stickerPackDownloader, C023509x r3) {
        super(2, r3);
        this.this$0 = stickerPackDownloader;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new StickerPackDownloader$fetchAvatarStickerPackDataWithOnDemand$onDeviceStableIds$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new StickerPackDownloader$fetchAvatarStickerPackDataWithOnDemand$onDeviceStableIds$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C24201Bn r3 = this.this$0.A07;
            this.label = 1;
            obj = AnonymousClass0A2.A00(this, r3.A07, new AvatarStickerLocatorImpl$locateOnDeviceAvatarStickerStableIDs$2(r3, (C023509x) null));
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return obj;
    }
}
