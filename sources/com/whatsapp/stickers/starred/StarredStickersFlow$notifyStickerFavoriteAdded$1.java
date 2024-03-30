package com.whatsapp.stickers.starred;

import X.AnonymousClass000;
import X.AnonymousClass05J;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass5L2;
import X.AnonymousClass5L3;
import X.C007103b;
import X.C009003v;
import X.C023509x;
import X.C130566Lo;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.starred.StarredStickersFlow$notifyStickerFavoriteAdded$1", f = "StarredStickersFlow.kt", i = {}, l = {163, 166}, m = "invokeSuspend", n = {}, s = {})
public final class StarredStickersFlow$notifyStickerFavoriteAdded$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ boolean $isAvatarSticker;
    public final /* synthetic */ Collection $starredStickers;
    public int label;
    public final /* synthetic */ C130566Lo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StarredStickersFlow$notifyStickerFavoriteAdded$1(C130566Lo r2, Collection collection, C023509x r4, boolean z) {
        super(2, r4);
        this.$isAvatarSticker = z;
        this.this$0 = r2;
        this.$starredStickers = collection;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new StarredStickersFlow$notifyStickerFavoriteAdded$1(this.this$0, this.$starredStickers, r6, this.$isAvatarSticker);
    }

    public final Object invokeSuspend(Object obj) {
        Object r0;
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            boolean z = this.$isAvatarSticker;
            AnonymousClass05J r2 = this.this$0.A00;
            List A0Y = C007103b.A0Y(this.$starredStickers);
            if (z) {
                r0 = new AnonymousClass5L2(A0Y);
                this.label = 1;
            } else {
                r0 = new AnonymousClass5L3(A0Y);
                this.label = 2;
            }
            if (r2.B6N(r0, this) == r6) {
                return r6;
            }
        } else if (i == 1 || i == 2) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StarredStickersFlow$notifyStickerFavoriteAdded$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
