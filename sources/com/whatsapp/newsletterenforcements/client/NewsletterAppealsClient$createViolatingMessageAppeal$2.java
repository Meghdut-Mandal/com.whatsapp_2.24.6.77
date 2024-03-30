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
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterCreateViolatingMessageAppealMutationImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterCreateViolatingMessageAppealResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterViolatingMessageAppealStateResponseImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient$createViolatingMessageAppeal$2", f = "NewsletterAppealsClient.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterAppealsClient$createViolatingMessageAppeal$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C28981Uw $newsletterJid;
    public final /* synthetic */ String $reason;
    public final /* synthetic */ String $serverMsgId;
    public int label;
    public final /* synthetic */ NewsletterAppealsClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterAppealsClient$createViolatingMessageAppeal$2(C28981Uw r2, NewsletterAppealsClient newsletterAppealsClient, String str, String str2, C023509x r6) {
        super(2, r6);
        this.$newsletterJid = r2;
        this.$serverMsgId = str;
        this.$reason = str2;
        this.this$0 = newsletterAppealsClient;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new NewsletterAppealsClient$createViolatingMessageAppeal$2(this.$newsletterJid, this.this$0, this.$serverMsgId, this.$reason, r8);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            NewsletterCreateViolatingMessageAppealMutationImpl$Builder newsletterCreateViolatingMessageAppealMutationImpl$Builder = new NewsletterCreateViolatingMessageAppealMutationImpl$Builder();
            String obj2 = this.$newsletterJid.toString();
            AnonymousClass9VA r5 = newsletterCreateViolatingMessageAppealMutationImpl$Builder.A00;
            newsletterCreateViolatingMessageAppealMutationImpl$Builder.A01 = C36341k9.A1Y(r5, "channel_id", obj2);
            newsletterCreateViolatingMessageAppealMutationImpl$Builder.A03 = C36341k9.A1Y(r5, "server_msg_id", this.$serverMsgId);
            newsletterCreateViolatingMessageAppealMutationImpl$Builder.A02 = C36341k9.A1Y(r5, "reason", this.$reason);
            C20740y5.A06(newsletterCreateViolatingMessageAppealMutationImpl$Builder.A01);
            C20740y5.A06(newsletterCreateViolatingMessageAppealMutationImpl$Builder.A03);
            C20740y5.A06(newsletterCreateViolatingMessageAppealMutationImpl$Builder.A02);
            AnonymousClass9JF r1 = new AnonymousClass9JF(r5, NewsletterCreateViolatingMessageAppealResponseImpl.class, "NewsletterCreateViolatingMessageAppeal");
            C61563Cm r0 = this.this$0.A00;
            this.label = 1;
            obj = r0.A00(r1, this);
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return new NewsletterViolatingMessageAppealStateResponseImpl(((AnonymousClass9Y8) obj).A03(NewsletterCreateViolatingMessageAppealResponseImpl.Xwa2CreateChannelViolatingMessageAppeal.class, "xwa2_create_channel_violating_message_appeal").A00);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterAppealsClient$createViolatingMessageAppeal$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
