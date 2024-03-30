package com.whatsapp.calling.callsuggestions;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass040;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass19R;
import X.C009003v;
import X.C023109s;
import X.C023509x;
import X.C123745x1;
import X.C1260762l;
import X.C17990sP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callsuggestions.FetchCallLogs$fetchCallLogSummary$1", f = "FetchCallLogs.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
public final class FetchCallLogs$fetchCallLogSummary$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass040 $coroutineScope;
    public final /* synthetic */ C123745x1 $parameters;
    public int label;
    public final /* synthetic */ C1260762l this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchCallLogs$fetchCallLogSummary$1(C123745x1 r2, C1260762l r3, C023509x r4, AnonymousClass040 r5) {
        super(2, r4);
        this.this$0 = r3;
        this.$coroutineScope = r5;
        this.$parameters = r2;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new FetchCallLogs$fetchCallLogSummary$1(this.$parameters, this.this$0, r6, this.$coroutineScope);
    }

    public final Object invokeSuspend(Object obj) {
        C17990sP r0;
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C1260762l r4 = this.this$0;
            AnonymousClass040 r3 = this.$coroutineScope;
            C123745x1 r1 = this.$parameters;
            synchronized (r4) {
                r0 = r4.A00;
                if (r0 == null) {
                    FetchCallLogs$startFetchCallLogs$1 fetchCallLogs$startFetchCallLogs$1 = new FetchCallLogs$startFetchCallLogs$1(r1, r4, (C023509x) null);
                    AnonymousClass00C.A0D(r3, 0);
                    r0 = AnonymousClass0A2.A01(C023109s.A00, AnonymousClass19R.A01, fetchCallLogs$startFetchCallLogs$1, r3);
                    r4.A00 = r0;
                }
            }
            this.label = 1;
            obj = r0.B1c(this);
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FetchCallLogs$fetchCallLogSummary$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
