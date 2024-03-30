package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass000;
import X.AnonymousClass011;
import X.AnonymousClass05L;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C110695b5;
import X.C110725b8;
import X.C17980sO;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$observerSearchProvider$2", f = "StickerExpressionsViewModel.kt", i = {}, l = {219, 221}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$observerSearchProvider$2 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$observerSearchProvider$2(StickerExpressionsViewModel stickerExpressionsViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = stickerExpressionsViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        StickerExpressionsViewModel$observerSearchProvider$2 stickerExpressionsViewModel$observerSearchProvider$2 = new StickerExpressionsViewModel$observerSearchProvider$2(this.this$0, r4);
        stickerExpressionsViewModel$observerSearchProvider$2.L$0 = obj;
        return stickerExpressionsViewModel$observerSearchProvider$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object B6N;
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass011 r1 = (AnonymousClass011) this.L$0;
            C110695b5 r3 = (C110695b5) r1.first;
            StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
            if (stickerExpressionsViewModel.A07) {
                this.label = 1;
                B6N = StickerExpressionsViewModel.A03(r3, stickerExpressionsViewModel, (String) r1.second, this);
            } else {
                AnonymousClass05L r12 = stickerExpressionsViewModel.A0h;
                C110725b8 A02 = StickerExpressionsViewModel.A02(r3, stickerExpressionsViewModel);
                this.label = 2;
                B6N = r12.B6N(A02, this);
            }
            if (B6N == r6) {
                return r6;
            }
        } else if (i == 1 || i == 2) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        C17980sO r0 = this.this$0.A0b;
        AnonymousClass0AJ r62 = AnonymousClass0AJ.A00;
        r0.B3E(r62);
        return r62;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerExpressionsViewModel$observerSearchProvider$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
