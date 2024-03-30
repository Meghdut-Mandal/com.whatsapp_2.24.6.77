package com.whatsapp.newsletterenforcements.client;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C28981Uw;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient$fetchAllAppealsForNewsletter$2", f = "NewsletterAppealsClient.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterAppealsClient$fetchAllAppealsForNewsletter$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C28981Uw $newsletterJid;
    public int label;
    public final /* synthetic */ NewsletterAppealsClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterAppealsClient$fetchAllAppealsForNewsletter$2(C28981Uw r2, NewsletterAppealsClient newsletterAppealsClient, C023509x r4) {
        super(2, r4);
        this.$newsletterJid = r2;
        this.this$0 = newsletterAppealsClient;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new NewsletterAppealsClient$fetchAllAppealsForNewsletter$2(this.$newsletterJid, this.this$0, r5);
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L_0x0046
            if (r0 != r4) goto L_0x00de
            X.AnonymousClass0AN.A00(r7)
        L_0x000c:
            X.9Y8 r7 = (X.AnonymousClass9Y8) r7
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAppealsResponseImpl$Xwa2ChannelAppeals> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAppealsResponseImpl.Xwa2ChannelAppeals.class
            java.lang.String r0 = "xwa2_channel_appeals"
            X.9Y8 r3 = r7.A03(r1, r0)
            X.AnonymousClass00C.A08(r3)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAppealsResponseImpl$Xwa2ChannelAppeals$SuspensionAppeals> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAppealsResponseImpl.Xwa2ChannelAppeals.SuspensionAppeals.class
            java.lang.String r0 = "suspension_appeals"
            X.1Ak r0 = r3.A04(r1, r0)
            if (r0 == 0) goto L_0x0075
            java.util.ArrayList r5 = X.C36351kA.A0z(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x002b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r0 = r2.next()
            X.9Y8 r0 = (X.AnonymousClass9Y8) r0
            org.json.JSONObject r1 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterSuspendAppealStateResponseImpl r0 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterSuspendAppealStateResponseImpl
            r0.<init>(r1)
            X.2Z0 r0 = com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient.A02(r0)
            r5.add(r0)
            goto L_0x002b
        L_0x0046:
            X.AnonymousClass0AN.A00(r7)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterAppealsQueryImpl$Builder r2 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterAppealsQueryImpl$Builder
            r2.<init>()
            X.1Uw r0 = r6.$newsletterJid
            java.lang.String r1 = r0.toString()
            X.9VA r3 = r2.A00
            java.lang.String r0 = "channel_id"
            boolean r0 = X.C36341k9.A1Y(r3, r0, r1)
            X.C20740y5.A06(r0)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAppealsResponseImpl> r2 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAppealsResponseImpl.class
            java.lang.String r0 = "NewsletterAppeals"
            X.9JF r1 = new X.9JF
            r1.<init>(r3, r2, r0)
            com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient r0 = r6.this$0
            X.3Cm r0 = r0.A00
            r6.label = r4
            java.lang.Object r7 = r0.A00(r1, r6)
            if (r7 != r5) goto L_0x000c
            return r5
        L_0x0075:
            X.09w r5 = X.C023409w.A00
        L_0x0077:
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAppealsResponseImpl$Xwa2ChannelAppeals$GeoSuspendAppeals> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAppealsResponseImpl.Xwa2ChannelAppeals.GeoSuspendAppeals.class
            java.lang.String r0 = "geo_suspend_appeals"
            X.1Ak r0 = r3.A04(r1, r0)
            if (r0 == 0) goto L_0x00a4
            java.util.ArrayList r4 = X.C36351kA.A0z(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0089:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r0 = r2.next()
            X.9Y8 r0 = (X.AnonymousClass9Y8) r0
            org.json.JSONObject r1 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterGeoSuspendAppealStateResponseImpl r0 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterGeoSuspendAppealStateResponseImpl
            r0.<init>(r1)
            X.2Z1 r0 = com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient.A00(r0)
            r4.add(r0)
            goto L_0x0089
        L_0x00a4:
            X.09w r4 = X.C023409w.A00
        L_0x00a6:
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAppealsResponseImpl$Xwa2ChannelAppeals$ViolatingMessageAppeals> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAppealsResponseImpl.Xwa2ChannelAppeals.ViolatingMessageAppeals.class
            java.lang.String r0 = "violating_message_appeals"
            X.1Ak r0 = r3.A04(r1, r0)
            if (r0 == 0) goto L_0x00d3
            java.util.ArrayList r3 = X.C36351kA.A0z(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x00b8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00d5
            java.lang.Object r0 = r2.next()
            X.9Y8 r0 = (X.AnonymousClass9Y8) r0
            org.json.JSONObject r1 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterViolatingMessageAppealStateResponseImpl r0 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterViolatingMessageAppealStateResponseImpl
            r0.<init>(r1)
            X.2Z2 r0 = com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient.A01(r0)
            r3.add(r0)
            goto L_0x00b8
        L_0x00d3:
            X.09w r3 = X.C023409w.A00
        L_0x00d5:
            java.util.ArrayList r0 = X.C007103b.A0S(r4, r5)
            java.util.ArrayList r0 = X.C007103b.A0S(r3, r0)
            return r0
        L_0x00de:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient$fetchAllAppealsForNewsletter$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterAppealsClient$fetchAllAppealsForNewsletter$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
