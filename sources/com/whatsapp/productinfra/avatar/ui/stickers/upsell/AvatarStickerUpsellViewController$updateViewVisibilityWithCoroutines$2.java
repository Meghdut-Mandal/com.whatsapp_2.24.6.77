package com.whatsapp.productinfra.avatar.ui.stickers.upsell;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$2", f = "AvatarStickerUpsellViewController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$2 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ AvatarStickerUpsellViewController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$2(AvatarStickerUpsellViewController avatarStickerUpsellViewController, C023509x r3) {
        super(2, r3);
        this.this$0 = avatarStickerUpsellViewController;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            this.this$0.A01.setVisibility(8);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }
}
