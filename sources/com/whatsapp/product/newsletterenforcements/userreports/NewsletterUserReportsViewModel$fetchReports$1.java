package com.whatsapp.product.newsletterenforcements.userreports;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel$fetchReports$1", f = "NewsletterUserReportsViewModel.kt", i = {1}, l = {74, 75}, m = "invokeSuspend", n = {"userReports"}, s = {"L$0"})
public final class NewsletterUserReportsViewModel$fetchReports$1 extends AnonymousClass0A1 implements C009003v {
    public Object L$0;
    public int label;
    public final /* synthetic */ NewsletterUserReportsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterUserReportsViewModel$fetchReports$1(NewsletterUserReportsViewModel newsletterUserReportsViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = newsletterUserReportsViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new NewsletterUserReportsViewModel$fetchReports$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new NewsletterUserReportsViewModel$fetchReports$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0085 A[Catch:{ 3yQ -> 0x0096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008f A[Catch:{ 3yQ -> 0x0096 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r5 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0016
            if (r0 == r1) goto L_0x0049
            if (r0 != r5) goto L_0x0011
            java.lang.Object r2 = r6.L$0
            java.util.List r2 = (java.util.List) r2
            goto L_0x0065
        L_0x0011:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0016:
            X.AnonymousClass0AN.A00(r7)
            com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel r0 = r6.this$0     // Catch:{ 3yQ -> 0x0096 }
            X.1M6 r0 = r0.A01     // Catch:{ 3yQ -> 0x0096 }
            boolean r0 = r0.A02()     // Catch:{ 3yQ -> 0x0096 }
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = "Fetching user reports: No network, so returning..."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 3yQ -> 0x0096 }
            com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel r0 = r6.this$0     // Catch:{ 3yQ -> 0x0096 }
            X.00s r1 = r0.A00     // Catch:{ 3yQ -> 0x0096 }
            X.3of r0 = X.C76313of.A00     // Catch:{ 3yQ -> 0x0096 }
            r1.A0C(r0)     // Catch:{ 3yQ -> 0x0096 }
            X.0AJ r0 = X.AnonymousClass0AJ.A00     // Catch:{ 3yQ -> 0x0096 }
            return r0
        L_0x0034:
            com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel r0 = r6.this$0     // Catch:{ 3yQ -> 0x0096 }
            com.whatsapp.newsletterenforcements.client.NewsletterUserReportsNetworkClient r3 = r0.A03     // Catch:{ 3yQ -> 0x0096 }
            r6.label = r1     // Catch:{ 3yQ -> 0x0096 }
            X.02m r2 = X.AnonymousClass19R.A01     // Catch:{ 3yQ -> 0x0096 }
            r1 = 0
            com.whatsapp.newsletterenforcements.client.NewsletterUserReportsNetworkClient$fetchUserReports$2 r0 = new com.whatsapp.newsletterenforcements.client.NewsletterUserReportsNetworkClient$fetchUserReports$2     // Catch:{ 3yQ -> 0x0096 }
            r0.<init>(r3, r1)     // Catch:{ 3yQ -> 0x0096 }
            java.lang.Object r7 = X.AnonymousClass0A2.A00(r6, r2, r0)     // Catch:{ 3yQ -> 0x0096 }
            if (r7 != r4) goto L_0x004c
            return r4
        L_0x0049:
            X.AnonymousClass0AN.A00(r7)     // Catch:{ 3yQ -> 0x0096 }
        L_0x004c:
            java.util.List r7 = (java.util.List) r7     // Catch:{ 3yQ -> 0x0096 }
            com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel r3 = r6.this$0     // Catch:{ 3yQ -> 0x0096 }
            r6.L$0 = r7     // Catch:{ 3yQ -> 0x0096 }
            r6.label = r5     // Catch:{ 3yQ -> 0x0096 }
            X.02m r2 = X.AnonymousClass19R.A00     // Catch:{ 3yQ -> 0x0096 }
            r1 = 0
            com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel$processUserReports$2 r0 = new com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel$processUserReports$2     // Catch:{ 3yQ -> 0x0096 }
            r0.<init>(r3, r7, r1)     // Catch:{ 3yQ -> 0x0096 }
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r6, r2, r0)     // Catch:{ 3yQ -> 0x0096 }
            if (r0 == r4) goto L_0x0095
            r2 = r7
            r7 = r0
            goto L_0x0068
        L_0x0065:
            X.AnonymousClass0AN.A00(r7)     // Catch:{ 3yQ -> 0x0096 }
        L_0x0068:
            java.util.List r7 = (java.util.List) r7     // Catch:{ 3yQ -> 0x0096 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 3yQ -> 0x0096 }
            java.lang.String r0 = "Successfully fetched user reports: from network: "
            X.C36371kC.A1R(r0, r1, r2)     // Catch:{ 3yQ -> 0x0096 }
            java.lang.String r0 = ", after filtering: "
            r1.append(r0)     // Catch:{ 3yQ -> 0x0096 }
            int r0 = r7.size()     // Catch:{ 3yQ -> 0x0096 }
            X.C36321k7.A1Y(r1, r0)     // Catch:{ 3yQ -> 0x0096 }
            boolean r0 = r7.isEmpty()     // Catch:{ 3yQ -> 0x0096 }
            if (r0 == 0) goto L_0x008f
            X.3oh r1 = X.C76333oh.A00     // Catch:{ 3yQ -> 0x0096 }
        L_0x0087:
            com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel r0 = r6.this$0     // Catch:{ 3yQ -> 0x0096 }
            X.00s r0 = r0.A00     // Catch:{ 3yQ -> 0x0096 }
            r0.A0C(r1)     // Catch:{ 3yQ -> 0x0096 }
            goto L_0x00b6
        L_0x008f:
            X.3od r1 = new X.3od     // Catch:{ 3yQ -> 0x0096 }
            r1.<init>(r7)     // Catch:{ 3yQ -> 0x0096 }
            goto L_0x0087
        L_0x0095:
            return r4
        L_0x0096:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Exception while fetching newsletter reports: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", "
            r1.append(r0)
            X.9jD r0 = r2.error
            X.C36331k8.A1P(r0, r1)
            com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel r0 = r6.this$0
            X.00s r1 = r0.A00
            X.3oe r0 = X.C76303oe.A00
            r1.A0C(r0)
        L_0x00b6:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel$fetchReports$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
