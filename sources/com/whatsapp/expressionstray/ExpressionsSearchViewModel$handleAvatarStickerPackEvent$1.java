package com.whatsapp.expressionstray;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C106105Ij;
import X.C111425cG;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.ExpressionsSearchViewModel$handleAvatarStickerPackEvent$1", f = "ExpressionsSearchViewModel.kt", i = {}, l = {439}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsSearchViewModel$handleAvatarStickerPackEvent$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C111425cG $event;
    public int label;
    public final /* synthetic */ ExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsSearchViewModel$handleAvatarStickerPackEvent$1(ExpressionsSearchViewModel expressionsSearchViewModel, C111425cG r3, C023509x r4) {
        super(2, r4);
        this.$event = r3;
        this.this$0 = expressionsSearchViewModel;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ExpressionsSearchViewModel$handleAvatarStickerPackEvent$1(this.this$0, this.$event, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            if (this.$event instanceof C106105Ij) {
                ExpressionsSearchViewModel expressionsSearchViewModel = this.this$0;
                this.label = 1;
                if (AnonymousClass0A2.A00(this, expressionsSearchViewModel.A0I, new ExpressionsSearchViewModel$fetchAvatarDynamicIcon$2(expressionsSearchViewModel, (C023509x) null)) == r4) {
                    return r4;
                }
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsSearchViewModel$handleAvatarStickerPackEvent$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
