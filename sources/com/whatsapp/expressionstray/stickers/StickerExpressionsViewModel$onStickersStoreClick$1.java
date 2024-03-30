package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass000;
import X.AnonymousClass05J;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass2N3;
import X.AnonymousClass55B;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$onStickersStoreClick$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {978}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$onStickersStoreClick$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$onStickersStoreClick$1(StickerExpressionsViewModel stickerExpressionsViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = stickerExpressionsViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new StickerExpressionsViewModel$onStickersStoreClick$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new StickerExpressionsViewModel$onStickersStoreClick$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            this.this$0.A0N.Bly(new AnonymousClass2N3());
            AnonymousClass05J r1 = this.this$0.A0f;
            AnonymousClass55B r0 = AnonymousClass55B.A00;
            this.label = 1;
            if (r1.B6N(r0, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
