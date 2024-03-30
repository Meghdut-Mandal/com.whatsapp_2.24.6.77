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
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterCreateSuspendAppealMutationImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterCreateSuspendAppealResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterSuspendAppealStateResponseImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient$createSuspensionAppeal$2", f = "NewsletterAppealsClient.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterAppealsClient$createSuspensionAppeal$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C28981Uw $newsletterJid;
    public final /* synthetic */ String $reason;
    public int label;
    public final /* synthetic */ NewsletterAppealsClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterAppealsClient$createSuspensionAppeal$2(C28981Uw r2, NewsletterAppealsClient newsletterAppealsClient, String str, C023509x r5) {
        super(2, r5);
        this.$newsletterJid = r2;
        this.$reason = str;
        this.this$0 = newsletterAppealsClient;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new NewsletterAppealsClient$createSuspensionAppeal$2(this.$newsletterJid, this.this$0, this.$reason, r6);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            NewsletterCreateSuspendAppealMutationImpl$Builder newsletterCreateSuspendAppealMutationImpl$Builder = new NewsletterCreateSuspendAppealMutationImpl$Builder();
            String obj2 = this.$newsletterJid.toString();
            AnonymousClass9VA r5 = newsletterCreateSuspendAppealMutationImpl$Builder.A00;
            newsletterCreateSuspendAppealMutationImpl$Builder.A01 = C36341k9.A1Y(r5, "channel_id", obj2);
            newsletterCreateSuspendAppealMutationImpl$Builder.A02 = C36341k9.A1Y(r5, "reason", this.$reason);
            C20740y5.A06(newsletterCreateSuspendAppealMutationImpl$Builder.A01);
            C20740y5.A06(newsletterCreateSuspendAppealMutationImpl$Builder.A02);
            AnonymousClass9JF r1 = new AnonymousClass9JF(r5, NewsletterCreateSuspendAppealResponseImpl.class, "NewsletterCreateSuspendAppeal");
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
        return new NewsletterSuspendAppealStateResponseImpl(((AnonymousClass9Y8) obj).A03(NewsletterCreateSuspendAppealResponseImpl.Xwa2CreateChannelSuspendAppeal.class, "xwa2_create_channel_suspend_appeal").A00);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterAppealsClient$createSuspensionAppeal$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
