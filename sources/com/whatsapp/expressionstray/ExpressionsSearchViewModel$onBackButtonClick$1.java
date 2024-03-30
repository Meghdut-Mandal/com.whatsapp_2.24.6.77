package com.whatsapp.expressionstray;

import X.AnonymousClass000;
import X.AnonymousClass05J;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass556;
import X.AnonymousClass557;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.ExpressionsSearchViewModel$onBackButtonClick$1", f = "ExpressionsSearchViewModel.kt", i = {}, l = {284, 286}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsSearchViewModel$onBackButtonClick$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ boolean $isKeyboardShowing;
    public int label;
    public final /* synthetic */ ExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsSearchViewModel$onBackButtonClick$1(ExpressionsSearchViewModel expressionsSearchViewModel, C023509x r3, boolean z) {
        super(2, r3);
        this.$isKeyboardShowing = z;
        this.this$0 = expressionsSearchViewModel;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ExpressionsSearchViewModel$onBackButtonClick$1(this.this$0, r5, this.$isKeyboardShowing);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            boolean z = this.$isKeyboardShowing;
            AnonymousClass05J r1 = this.this$0.A0J;
            if (z) {
                obj2 = AnonymousClass557.A00;
                this.label = 1;
            } else {
                obj2 = AnonymousClass556.A00;
                this.label = 2;
            }
            if (r1.B6N(obj2, this) == r5) {
                return r5;
            }
        } else if (i == 1 || i == 2) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsSearchViewModel$onBackButtonClick$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
