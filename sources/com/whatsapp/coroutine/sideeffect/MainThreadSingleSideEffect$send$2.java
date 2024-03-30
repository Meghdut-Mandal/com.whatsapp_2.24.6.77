package com.whatsapp.coroutine.sideeffect;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass31V;
import X.C009003v;
import X.C023509x;
import X.C18010sR;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.coroutine.sideeffect.MainThreadSingleSideEffect$send$2", f = "MainThreadSingleSideEffect.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
public final class MainThreadSingleSideEffect$send$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Object $value;
    public int label;
    public final /* synthetic */ AnonymousClass31V this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MainThreadSingleSideEffect$send$2(AnonymousClass31V r2, Object obj, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$value = obj;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new MainThreadSingleSideEffect$send$2(this.this$0, this.$value, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C18010sR r1 = this.this$0.A00;
            Object obj2 = this.$value;
            this.label = 1;
            if (r1.Bpf(obj2, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MainThreadSingleSideEffect$send$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
