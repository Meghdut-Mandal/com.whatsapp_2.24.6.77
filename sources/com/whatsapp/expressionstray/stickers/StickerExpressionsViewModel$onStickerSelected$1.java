package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass000;
import X.AnonymousClass05J;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass555;
import X.AnonymousClass55P;
import X.AnonymousClass63V;
import X.AnonymousClass6O1;
import X.C009003v;
import X.C023509x;
import X.C135066c4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$onStickerSelected$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {1009}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$onStickerSelected$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ int $position;
    public final /* synthetic */ C135066c4 $sticker;
    public final /* synthetic */ Integer $stickerSendOrigin;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$onStickerSelected$1(StickerExpressionsViewModel stickerExpressionsViewModel, C135066c4 r3, Integer num, C023509x r5, int i) {
        super(2, r5);
        this.this$0 = stickerExpressionsViewModel;
        this.$sticker = r3;
        this.$stickerSendOrigin = num;
        this.$position = i;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new StickerExpressionsViewModel$onStickerSelected$1(this.this$0, this.$sticker, this.$stickerSendOrigin, r8, this.$position);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass05J r4 = this.this$0.A0f;
            AnonymousClass555 r0 = new AnonymousClass555(this.$sticker, this.$stickerSendOrigin, this.$position);
            this.label = 1;
            if (r4.B6N(r0, this) == r6) {
                return r6;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        AnonymousClass63V r1 = this.this$0.A0I;
        AnonymousClass55P r02 = AnonymousClass55P.A00;
        r1.A00(r02, r02, 7);
        AnonymousClass6O1.A00(this.this$0.A0G, 32, 10);
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerExpressionsViewModel$onStickerSelected$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
