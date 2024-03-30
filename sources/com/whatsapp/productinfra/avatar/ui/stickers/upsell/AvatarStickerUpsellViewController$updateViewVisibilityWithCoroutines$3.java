package com.whatsapp.productinfra.avatar.ui.stickers.upsell;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import X.C36381kD;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$3", f = "AvatarStickerUpsellViewController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$3 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ boolean $hasAvatarConfig;
    public int label;
    public final /* synthetic */ AvatarStickerUpsellViewController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$3(AvatarStickerUpsellViewController avatarStickerUpsellViewController, C023509x r3, boolean z) {
        super(2, r3);
        this.this$0 = avatarStickerUpsellViewController;
        this.$hasAvatarConfig = z;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$3(this.this$0, r5, this.$hasAvatarConfig);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            this.this$0.A01.setVisibility(C36381kD.A00(this.$hasAvatarConfig ? 1 : 0));
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$3) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
