package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import X.C109325Xd;
import X.C111405cE;
import X.C36331k8;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$startDataFlows$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$startDataFlows$1 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$startDataFlows$1(StickerExpressionsViewModel stickerExpressionsViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = stickerExpressionsViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        StickerExpressionsViewModel$startDataFlows$1 stickerExpressionsViewModel$startDataFlows$1 = new StickerExpressionsViewModel$startDataFlows$1(this.this$0, r4);
        stickerExpressionsViewModel$startDataFlows$1.L$0 = obj;
        return stickerExpressionsViewModel$startDataFlows$1;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
            C36331k8.A1T(new StickerExpressionsViewModel$handleAvatarEvent$1(stickerExpressionsViewModel, (C111405cE) this.L$0, (C023509x) null), C109325Xd.A00(stickerExpressionsViewModel));
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerExpressionsViewModel$startDataFlows$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
