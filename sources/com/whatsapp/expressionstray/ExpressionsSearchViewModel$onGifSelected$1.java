package com.whatsapp.expressionstray;

import X.AnonymousClass000;
import X.AnonymousClass05J;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass3XU;
import X.AnonymousClass551;
import X.AnonymousClass6O1;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.ExpressionsSearchViewModel$onGifSelected$1", f = "ExpressionsSearchViewModel.kt", i = {}, l = {326}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsSearchViewModel$onGifSelected$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass3XU $result;
    public int label;
    public final /* synthetic */ ExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsSearchViewModel$onGifSelected$1(ExpressionsSearchViewModel expressionsSearchViewModel, AnonymousClass3XU r3, C023509x r4) {
        super(2, r4);
        this.this$0 = expressionsSearchViewModel;
        this.$result = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ExpressionsSearchViewModel$onGifSelected$1(this.this$0, this.$result, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            ExpressionsSearchViewModel expressionsSearchViewModel = this.this$0;
            expressionsSearchViewModel.A06 = true;
            AnonymousClass05J r2 = expressionsSearchViewModel.A0J;
            AnonymousClass551 r0 = new AnonymousClass551(this.$result);
            this.label = 1;
            if (r2.B6N(r0, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        AnonymousClass6O1.A00(this.this$0.A0A, 22, 5);
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsSearchViewModel$onGifSelected$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
