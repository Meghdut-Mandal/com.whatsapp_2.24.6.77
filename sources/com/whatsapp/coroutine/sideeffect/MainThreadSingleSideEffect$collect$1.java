package com.whatsapp.coroutine.sideeffect;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.coroutine.sideeffect.MainThreadSingleSideEffect$collect$1", f = "MainThreadSingleSideEffect.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
public final class MainThreadSingleSideEffect$collect$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C009003v $collector;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MainThreadSingleSideEffect$collect$1(C023509x r2, C009003v r3) {
        super(2, r2);
        this.$collector = r3;
    }

    public final C023509x create(Object obj, C023509x r4) {
        MainThreadSingleSideEffect$collect$1 mainThreadSingleSideEffect$collect$1 = new MainThreadSingleSideEffect$collect$1(r4, this.$collector);
        mainThreadSingleSideEffect$collect$1.L$0 = obj;
        return mainThreadSingleSideEffect$collect$1;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            Object obj2 = this.L$0;
            C009003v r0 = this.$collector;
            this.label = 1;
            if (r0.invoke(obj2, this) == r3) {
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
        return ((MainThreadSingleSideEffect$collect$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
