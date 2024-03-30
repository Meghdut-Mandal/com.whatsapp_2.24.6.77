package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass000;
import X.AnonymousClass05G;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C007403e;
import X.C019408g;
import X.C023509x;
import X.C06820Vf;
import X.C13010j1;
import X.C164487rt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$observerSearchProvider$$inlined$flatMapLatest$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$observerSearchProvider$$inlined$flatMapLatest$1 extends AnonymousClass0A1 implements C019408g {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$observerSearchProvider$$inlined$flatMapLatest$1(StickerExpressionsViewModel stickerExpressionsViewModel, C023509x r3) {
        super(3, r3);
        this.this$0 = stickerExpressionsViewModel;
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        StickerExpressionsViewModel$observerSearchProvider$$inlined$flatMapLatest$1 stickerExpressionsViewModel$observerSearchProvider$$inlined$flatMapLatest$1 = new StickerExpressionsViewModel$observerSearchProvider$$inlined$flatMapLatest$1(this.this$0, (C023509x) obj3);
        stickerExpressionsViewModel$observerSearchProvider$$inlined$flatMapLatest$1.L$0 = obj;
        stickerExpressionsViewModel$observerSearchProvider$$inlined$flatMapLatest$1.L$1 = obj2;
        return stickerExpressionsViewModel$observerSearchProvider$$inlined$flatMapLatest$1.invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C164487rt r0 = new C164487rt(new C13010j1((C007403e) null, this.this$0.A0J.A01), this.L$1, 5);
            this.label = 1;
            if (C06820Vf.A00(this, r0, (AnonymousClass05G) this.L$0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
