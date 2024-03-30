package com.whatsapp.calling.calldatasource;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C05770Qz;
import X.C116915lP;
import X.C143906rJ;
import X.C153217Nm;
import X.C18000sQ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.calldatasource.CallRepository$getCallStateModel$1", f = "CallRepository.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
public final class CallRepository$getCallStateModel$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ boolean $withSpeakerRanking;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C116915lP this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallRepository$getCallStateModel$1(C116915lP r2, C023509x r3, boolean z) {
        super(2, r3);
        this.this$0 = r2;
        this.$withSpeakerRanking = z;
    }

    public final C023509x create(Object obj, C023509x r5) {
        CallRepository$getCallStateModel$1 callRepository$getCallStateModel$1 = new CallRepository$getCallStateModel$1(this.this$0, r5, this.$withSpeakerRanking);
        callRepository$getCallStateModel$1.L$0 = obj;
        return callRepository$getCallStateModel$1;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C18000sQ r3 = (C18000sQ) this.L$0;
            boolean z = this.$withSpeakerRanking;
            C116915lP r0 = this.this$0;
            C143906rJ r2 = new C143906rJ(r0, r3, z);
            r0.A00.registerObserver(r2);
            r3.BwE(this.this$0.A00.A05());
            C153217Nm r02 = new C153217Nm(r2, this.this$0);
            this.label = 1;
            if (C05770Qz.A00(this, r02, r3) == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CallRepository$getCallStateModel$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
