package com.whatsapp.newsletterenforcements.client;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass9JF;
import X.AnonymousClass9VA;
import X.AnonymousClass9Y8;
import X.C009003v;
import X.C023509x;
import X.C20740y5;
import X.C28981Uw;
import X.C36341k9;
import X.C61563Cm;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterSuspendAppealStateResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterSuspendLatestAppealStateQueryImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterSuspendLatestAppealStateResponseImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient$fetchSuspensionAppeal$2", f = "NewsletterAppealsClient.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterAppealsClient$fetchSuspensionAppeal$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C28981Uw $newsletterJid;
    public Object L$0;
    public int label;
    public final /* synthetic */ NewsletterAppealsClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterAppealsClient$fetchSuspensionAppeal$2(C28981Uw r2, NewsletterAppealsClient newsletterAppealsClient, C023509x r4) {
        super(2, r4);
        this.$newsletterJid = r2;
        this.this$0 = newsletterAppealsClient;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new NewsletterAppealsClient$fetchSuspensionAppeal$2(this.$newsletterJid, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            NewsletterSuspendLatestAppealStateQueryImpl$Builder newsletterSuspendLatestAppealStateQueryImpl$Builder = new NewsletterSuspendLatestAppealStateQueryImpl$Builder();
            String obj2 = this.$newsletterJid.toString();
            AnonymousClass9VA r3 = newsletterSuspendLatestAppealStateQueryImpl$Builder.A00;
            C20740y5.A06(C36341k9.A1Y(r3, "channel_id", obj2));
            AnonymousClass9JF r2 = new AnonymousClass9JF(r3, NewsletterSuspendLatestAppealStateResponseImpl.class, "NewsletterSuspendLatestAppealState");
            NewsletterAppealsClient newsletterAppealsClient = this.this$0;
            C61563Cm r0 = newsletterAppealsClient.A00;
            this.L$0 = newsletterAppealsClient;
            this.label = 1;
            obj = r0.A00(r2, this);
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return NewsletterAppealsClient.A02(new NewsletterSuspendAppealStateResponseImpl(((AnonymousClass9Y8) obj).A03(NewsletterSuspendLatestAppealStateResponseImpl.Xwa2ChannelSuspendLatestAppealState.class, "xwa2_channel_suspend_latest_appeal_state").A00));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterAppealsClient$fetchSuspensionAppeal$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
