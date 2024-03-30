package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C15390nG;
import X.C164237rU;
import X.C90464aC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsFragment$observeStarredStickerSideEffects$1", f = "StickerExpressionsFragment.kt", i = {}, l = {435}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsFragment$observeStarredStickerSideEffects$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ StickerExpressionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsFragment$observeStarredStickerSideEffects$1(StickerExpressionsFragment stickerExpressionsFragment, C023509x r3) {
        super(2, r3);
        this.this$0 = stickerExpressionsFragment;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new StickerExpressionsFragment$observeStarredStickerSideEffects$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new StickerExpressionsFragment$observeStarredStickerSideEffects$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C15390nG A0p = C90464aC.A0p(this.this$0, StickerExpressionsFragment.A03(this.this$0).A0T.A00);
            C164237rU r0 = new C164237rU(this.this$0, 20);
            this.label = 1;
            if (A0p.B36(this, r0) == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
