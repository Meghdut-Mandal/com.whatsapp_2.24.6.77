package com.whatsapp.stickers.avatars;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass68B;
import X.C009003v;
import X.C023509x;
import X.C106105Ij;
import X.C106125Il;
import X.C124575yQ;
import X.C18000sQ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.avatars.AvatarStickerPackFlowImpl$stickerPackFlow$1$observer$1$onStickerPackDownloadFailed$1", f = "AvatarStickerPackFlowImpl.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerPackFlowImpl$stickerPackFlow$1$observer$1$onStickerPackDownloadFailed$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C18000sQ $$this$callbackFlow;
    public int label;
    public final /* synthetic */ C124575yQ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerPackFlowImpl$stickerPackFlow$1$observer$1$onStickerPackDownloadFailed$1(C124575yQ r2, C023509x r3, C18000sQ r4) {
        super(2, r3);
        this.this$0 = r2;
        this.$$this$callbackFlow = r4;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new AvatarStickerPackFlowImpl$stickerPackFlow$1$observer$1$onStickerPackDownloadFailed$1(this.this$0, r5, this.$$this$callbackFlow);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C124575yQ r3 = this.this$0;
            this.label = 1;
            obj = AnonymousClass0A2.A00(this, r3.A05, new AvatarStickerPackFlowImpl$getStickerPackWithStickers$2(r3, (C023509x) null));
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        AnonymousClass68B r6 = (AnonymousClass68B) obj;
        if (r6 != null) {
            this.$$this$callbackFlow.BwE(new C106105Ij(r6));
        } else {
            this.$$this$callbackFlow.BwE(new C106125Il("onStickerPackDownloadFailed"));
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickerPackFlowImpl$stickerPackFlow$1$observer$1$onStickerPackDownloadFailed$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
