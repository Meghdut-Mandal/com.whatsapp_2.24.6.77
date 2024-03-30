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
import X.C023409w;
import X.C023509x;
import X.C20740y5;
import X.C23931Ak;
import X.C28981Uw;
import X.C36321k7;
import X.C36341k9;
import X.C61563Cm;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterViolatingMessageAppealStateResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterViolatingMessageLatestAppealStateQueryImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterViolatingMessageLatestAppealStateResponseImpl;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient$fetchViolatingMessagesAppeal$2", f = "NewsletterAppealsClient.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterAppealsClient$fetchViolatingMessagesAppeal$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C28981Uw $newsletterJid;
    public int label;
    public final /* synthetic */ NewsletterAppealsClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterAppealsClient$fetchViolatingMessagesAppeal$2(C28981Uw r2, NewsletterAppealsClient newsletterAppealsClient, C023509x r4) {
        super(2, r4);
        this.$newsletterJid = r2;
        this.this$0 = newsletterAppealsClient;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new NewsletterAppealsClient$fetchViolatingMessagesAppeal$2(this.$newsletterJid, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            NewsletterViolatingMessageLatestAppealStateQueryImpl$Builder newsletterViolatingMessageLatestAppealStateQueryImpl$Builder = new NewsletterViolatingMessageLatestAppealStateQueryImpl$Builder();
            String obj2 = this.$newsletterJid.toString();
            AnonymousClass9VA r3 = newsletterViolatingMessageLatestAppealStateQueryImpl$Builder.A00;
            C20740y5.A06(C36341k9.A1Y(r3, "channel_id", obj2));
            AnonymousClass9JF r1 = new AnonymousClass9JF(r3, NewsletterViolatingMessageLatestAppealStateResponseImpl.class, "NewsletterViolatingMessageLatestAppealState");
            C61563Cm r0 = this.this$0.A00;
            this.label = 1;
            obj = r0.A00(r1, this);
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        C23931Ak A04 = ((AnonymousClass9Y8) obj).A04(NewsletterViolatingMessageLatestAppealStateResponseImpl.Xwa2ChannelViolatingMessagesLatestAppealState.class, "xwa2_channel_violating_messages_latest_appeal_state");
        if (A04 == null) {
            return C023409w.A00;
        }
        ArrayList A0J = C36321k7.A0J(A04);
        Iterator it = A04.iterator();
        while (it.hasNext()) {
            A0J.add(NewsletterAppealsClient.A01(new NewsletterViolatingMessageAppealStateResponseImpl(((AnonymousClass9Y8) it.next()).A00)));
        }
        return A0J;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterAppealsClient$fetchViolatingMessagesAppeal$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
