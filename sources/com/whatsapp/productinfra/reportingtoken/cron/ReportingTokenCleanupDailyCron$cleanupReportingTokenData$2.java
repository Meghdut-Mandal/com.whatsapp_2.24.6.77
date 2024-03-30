package com.whatsapp.productinfra.reportingtoken.cron;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C144776sn;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.reportingtoken.cron.ReportingTokenCleanupDailyCron$cleanupReportingTokenData$2", f = "ReportingTokenCleanupDailyCron.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ReportingTokenCleanupDailyCron$cleanupReportingTokenData$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ long $timestampSince;
    public int label;
    public final /* synthetic */ C144776sn this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportingTokenCleanupDailyCron$cleanupReportingTokenData$2(C144776sn r2, C023509x r3, long j) {
        super(2, r3);
        this.this$0 = r2;
        this.$timestampSince = j;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new ReportingTokenCleanupDailyCron$cleanupReportingTokenData$2(this.this$0, r6, this.$timestampSince);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            if (r0 != 0) goto L_0x0045
            X.AnonymousClass0AN.A00(r7)
            X.6sn r0 = r6.this$0
            X.1Xi r2 = r0.A00
            long r0 = r6.$timestampSince
            X.12P r2 = r2.A00     // Catch:{ all -> 0x0032 }
            X.1M0 r5 = r2.A05()     // Catch:{ all -> 0x0032 }
            X.14e r4 = r5.A02     // Catch:{ all -> 0x002b }
            java.lang.String r3 = "reporting_token"
            java.lang.String r2 = "timestamp < ? OR timestamp IS NULL"
            java.lang.String[] r1 = X.C36341k9.A1b(r0)     // Catch:{ all -> 0x002b }
            java.lang.String r0 = "DELETE_REPORTING_TOKEN_INFO_OLDER_THAN"
            int r0 = r4.A03(r3, r2, r0, r1)     // Catch:{ all -> 0x002b }
            r5.close()     // Catch:{ all -> 0x0032 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0032 }
            goto L_0x0037
        L_0x002b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002d }
        L_0x002d:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x0032 }
            throw r0     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            X.03N r0 = X.C90524aI.A0t(r0)
        L_0x0037:
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r0)
            if (r1 == 0) goto L_0x0042
            java.lang.String r0 = "ReportingTokenStore/deleteReportingInfoOlderThan"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0042:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0045:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.reportingtoken.cron.ReportingTokenCleanupDailyCron$cleanupReportingTokenData$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReportingTokenCleanupDailyCron$cleanupReportingTokenData$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
