package com.whatsapp.product.newsletterenforcements.alerts;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C39771tc;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel$refreshAlerts$1", f = "NewsletterAlertsViewModel.kt", i = {2}, l = {89, 94, 97}, m = "invokeSuspend", n = {"appeals"}, s = {"L$0"})
public final class NewsletterAlertsViewModel$refreshAlerts$1 extends AnonymousClass0A1 implements C009003v {
    public Object L$0;
    public int label;
    public final /* synthetic */ C39771tc this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterAlertsViewModel$refreshAlerts$1(C39771tc r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new NewsletterAlertsViewModel$refreshAlerts$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new NewsletterAlertsViewModel$refreshAlerts$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a A[Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }, LOOP:0: B:21:0x0064->B:23:0x006a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0093 A[Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a7 A[Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }, LOOP:1: B:29:0x00a1->B:31:0x00a7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c5 A[Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d2 A[Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r1 = r7.label
            r6 = 3
            r4 = 2
            r0 = 1
            if (r1 == 0) goto L_0x001a
            if (r1 == r0) goto L_0x0034
            if (r1 == r4) goto L_0x0057
            if (r1 != r6) goto L_0x0015
            java.lang.Object r4 = r7.L$0
            java.util.List r4 = (java.util.List) r4
            goto L_0x0094
        L_0x0015:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x001a:
            X.AnonymousClass0AN.A00(r8)
            X.1tc r3 = r7.this$0
            r7.label = r0
            X.02l r2 = r3.A09
            r1 = 0
            com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel$hideChannelAlertsBanner$2 r0 = new com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel$hideChannelAlertsBanner$2
            r0.<init>(r3, r1)
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r7, r2, r0)
            if (r0 == r5) goto L_0x0031
            X.0AJ r0 = X.AnonymousClass0AJ.A00
        L_0x0031:
            if (r0 != r5) goto L_0x0037
            return r5
        L_0x0034:
            X.AnonymousClass0AN.A00(r8)
        L_0x0037:
            X.1tc r0 = r7.this$0
            X.00s r1 = r0.A00
            X.3oZ r0 = X.C76253oZ.A00
            r1.A0C(r0)
            X.1tc r0 = r7.this$0     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            r7.label = r4     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient r4 = r0.A05     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            X.1Uw r3 = r0.A03     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            X.02l r2 = r4.A01     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            r1 = 0
            com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient$fetchAllAppealsForNewsletter$2 r0 = new com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient$fetchAllAppealsForNewsletter$2     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            r0.<init>(r3, r4, r1)     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            java.lang.Object r8 = X.AnonymousClass0A2.A00(r7, r2, r0)     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            if (r8 != r5) goto L_0x005a
            return r5
        L_0x0057:
            X.AnonymousClass0AN.A00(r8)     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
        L_0x005a:
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            java.util.ArrayList r3 = X.C36351kA.A0z(r8)     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            java.util.Iterator r2 = r8.iterator()     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
        L_0x0064:
            boolean r0 = r2.hasNext()     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            if (r0 == 0) goto L_0x0079
            java.lang.Object r1 = r2.next()     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            X.3X9 r1 = (X.AnonymousClass3X9) r1     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            X.2am r0 = new X.2am     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            r0.<init>(r1)     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            r3.add(r0)     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            goto L_0x0064
        L_0x0079:
            r0 = 8
            java.util.List r4 = X.C89834Yb.A00(r3, r0)     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            X.1tc r3 = r7.this$0     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            r7.L$0 = r4     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            r7.label = r6     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            X.02l r2 = r3.A09     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            r1 = 0
            com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel$fetchNewsletterAlertsResponse$2 r0 = new com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel$fetchNewsletterAlertsResponse$2     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            r0.<init>(r3, r1)     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            java.lang.Object r8 = X.AnonymousClass0A2.A00(r7, r2, r0)     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            if (r8 != r5) goto L_0x0097
            return r5
        L_0x0094:
            X.AnonymousClass0AN.A00(r8)     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
        L_0x0097:
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            java.util.ArrayList r3 = X.C36351kA.A0z(r8)     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            java.util.Iterator r2 = r8.iterator()     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
        L_0x00a1:
            boolean r0 = r2.hasNext()     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r1 = r2.next()     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            X.2u2 r1 = (X.C55082u2) r1     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            X.2ak r0 = new X.2ak     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            r0.<init>(r1)     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            r3.add(r0)     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            goto L_0x00a1
        L_0x00b6:
            X.1tc r0 = r7.this$0     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            X.00s r2 = r0.A00     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            int r1 = r3.size()     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            int r0 = r4.size()     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            int r1 = r1 + r0
            if (r1 <= 0) goto L_0x00d2
            java.util.ArrayList r1 = X.C007103b.A0S(r4, r3)     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            X.3oW r0 = new X.3oW     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            r0.<init>(r1)     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
        L_0x00ce:
            r2.A0C(r0)     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            goto L_0x00e5
        L_0x00d2:
            X.3oX r0 = X.C76233oX.A00     // Catch:{ 2Yz -> 0x00d5, 3yQ -> 0x00dc }
            goto L_0x00ce
        L_0x00d5:
            X.1tc r0 = r7.this$0
            X.00s r1 = r0.A00
            X.3oa r0 = X.C76263oa.A00
            goto L_0x00e2
        L_0x00dc:
            X.1tc r0 = r7.this$0
            X.00s r1 = r0.A00
            X.3oY r0 = X.C76243oY.A00
        L_0x00e2:
            r1.A0C(r0)
        L_0x00e5:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel$refreshAlerts$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
