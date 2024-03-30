package com.whatsapp.productinfra.reportingtoken.cron;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C144776sn;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.reportingtoken.cron.ReportingTokenCleanupDailyCron$onDailyCron$1", f = "ReportingTokenCleanupDailyCron.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
public final class ReportingTokenCleanupDailyCron$onDailyCron$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ long $timestampSince;
    public int label;
    public final /* synthetic */ C144776sn this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportingTokenCleanupDailyCron$onDailyCron$1(C144776sn r2, C023509x r3, long j) {
        super(2, r3);
        this.this$0 = r2;
        this.$timestampSince = j;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new ReportingTokenCleanupDailyCron$onDailyCron$1(this.this$0, r6, this.$timestampSince);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C144776sn r5 = this.this$0;
            long j = this.$timestampSince;
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r5.A01, new ReportingTokenCleanupDailyCron$cleanupReportingTokenData$2(r5, (C023509x) null, j)) == r6) {
                return r6;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReportingTokenCleanupDailyCron$onDailyCron$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
