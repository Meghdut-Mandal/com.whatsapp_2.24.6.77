package com.whatsapp.funstickers.report.bloks;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass6AI;
import X.C009003v;
import X.C023509x;
import X.C117265ly;
import X.C121625tR;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.funstickers.report.bloks.WaBkFunReportInterpreterExtImpl$onReportSubmitted$1", f = "WaBkFunReportInterpreterExtImpl.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
public final class WaBkFunReportInterpreterExtImpl$onReportSubmitted$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $requestId;
    public final /* synthetic */ String $responseId;
    public int label;
    public final /* synthetic */ C121625tR this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaBkFunReportInterpreterExtImpl$onReportSubmitted$1(C121625tR r2, String str, String str2, C023509x r5) {
        super(2, r5);
        this.this$0 = r2;
        this.$responseId = str;
        this.$requestId = str2;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new WaBkFunReportInterpreterExtImpl$onReportSubmitted$1(this.this$0, this.$responseId, this.$requestId, r6);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C117265ly r3 = this.this$0.A00;
            AnonymousClass6AI r1 = new AnonymousClass6AI(this.$responseId, this.$requestId);
            this.label = 1;
            if (r3.A00.B6N(r1, this) == r5) {
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
        return ((WaBkFunReportInterpreterExtImpl$onReportSubmitted$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
