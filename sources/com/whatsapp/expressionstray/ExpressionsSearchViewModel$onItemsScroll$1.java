package com.whatsapp.expressionstray;

import X.AnonymousClass000;
import X.AnonymousClass05J;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass557;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.ExpressionsSearchViewModel$onItemsScroll$1", f = "ExpressionsSearchViewModel.kt", i = {}, l = {352}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsSearchViewModel$onItemsScroll$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ ExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsSearchViewModel$onItemsScroll$1(ExpressionsSearchViewModel expressionsSearchViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = expressionsSearchViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new ExpressionsSearchViewModel$onItemsScroll$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ExpressionsSearchViewModel$onItemsScroll$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass05J r1 = this.this$0.A0J;
            AnonymousClass557 r0 = AnonymousClass557.A00;
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
