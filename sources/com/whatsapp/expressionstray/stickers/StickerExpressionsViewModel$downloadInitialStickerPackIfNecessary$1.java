package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import X.C36341k9;
import X.C36371kC;
import X.C80243v5;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$downloadInitialStickerPackIfNecessary$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$downloadInitialStickerPackIfNecessary$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$downloadInitialStickerPackIfNecessary$1(StickerExpressionsViewModel stickerExpressionsViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = stickerExpressionsViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new StickerExpressionsViewModel$downloadInitialStickerPackIfNecessary$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new StickerExpressionsViewModel$downloadInitialStickerPackIfNecessary$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            if (!C36371kC.A1U(C36341k9.A0E(this.this$0.A0C), "sticker_picker_initial_download")) {
                StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
                stickerExpressionsViewModel.A0Q.A00(C80243v5.A00(stickerExpressionsViewModel, 12));
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }
}
