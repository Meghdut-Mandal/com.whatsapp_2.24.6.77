package com.whatsapp.newsletterenforcements.client;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletterenforcements.client.NewsletterUserReportsNetworkClient$fetchUserReports$2", f = "NewsletterUserReportsNetworkClient.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterUserReportsNetworkClient$fetchUserReports$2 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ NewsletterUserReportsNetworkClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterUserReportsNetworkClient$fetchUserReports$2(NewsletterUserReportsNetworkClient newsletterUserReportsNetworkClient, C023509x r3) {
        super(2, r3);
        this.this$0 = newsletterUserReportsNetworkClient;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new NewsletterUserReportsNetworkClient$fetchUserReports$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new NewsletterUserReportsNetworkClient$fetchUserReports$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005a, code lost:
        if (r7 == r5) goto L_0x005c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L_0x0040
            if (r0 != r4) goto L_0x005d
            X.AnonymousClass0AN.A00(r7)
        L_0x000c:
            X.9Y8 r7 = (X.AnonymousClass9Y8) r7
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterUserReportsResponseImpl$Xwa2ChannelsReports> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterUserReportsResponseImpl.Xwa2ChannelsReports.class
            java.lang.String r0 = "xwa2_channels_reports"
            X.9Y8 r2 = r7.A03(r1, r0)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterUserReportsResponseImpl$Xwa2ChannelsReports$ChannelsReports> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterUserReportsResponseImpl.Xwa2ChannelsReports.ChannelsReports.class
            java.lang.String r0 = "channels_reports"
            X.1Ak r0 = r2.A04(r1, r0)
            X.AnonymousClass00C.A08(r0)
            java.util.ArrayList r5 = X.C36321k7.A0J(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0029:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005c
            java.lang.Object r0 = r2.next()
            X.9Y8 r0 = (X.AnonymousClass9Y8) r0
            org.json.JSONObject r1 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl r0 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl
            r0.<init>(r1)
            r5.add(r0)
            goto L_0x0029
        L_0x0040:
            X.AnonymousClass0AN.A00(r7)
            X.9VA r3 = X.C36441kJ.A0d()
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterUserReportsResponseImpl> r2 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterUserReportsResponseImpl.class
            java.lang.String r0 = "NewsletterUserReports"
            X.9JF r1 = new X.9JF
            r1.<init>(r3, r2, r0)
            com.whatsapp.newsletterenforcements.client.NewsletterUserReportsNetworkClient r0 = r6.this$0
            X.3Cm r0 = r0.A00
            r6.label = r4
            java.lang.Object r7 = r0.A00(r1, r6)
            if (r7 != r5) goto L_0x000c
        L_0x005c:
            return r5
        L_0x005d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletterenforcements.client.NewsletterUserReportsNetworkClient$fetchUserReports$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
