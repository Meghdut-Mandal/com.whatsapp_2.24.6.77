package com.whatsapp.calling.callsuggestions;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass4QI;
import X.C009003v;
import X.C023509x;
import X.C122395um;
import X.C123745x1;
import X.C1260762l;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callsuggestions.FetchCallLogs$startFetchCallLogs$1", f = "FetchCallLogs.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FetchCallLogs$startFetchCallLogs$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C123745x1 $parameters;
    public int label;
    public final /* synthetic */ C1260762l this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchCallLogs$startFetchCallLogs$1(C123745x1 r2, C1260762l r3, C023509x r4) {
        super(2, r4);
        this.$parameters = r2;
        this.this$0 = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new FetchCallLogs$startFetchCallLogs$1(this.$parameters, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            return new C122395um(this.$parameters, this.this$0.A02.A08((AnonymousClass4QI) null, 0, 200));
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FetchCallLogs$startFetchCallLogs$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
