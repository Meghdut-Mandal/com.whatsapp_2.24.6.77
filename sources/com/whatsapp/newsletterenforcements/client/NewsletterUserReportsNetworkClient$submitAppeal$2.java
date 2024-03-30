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
import X.C36341k9;
import X.C61563Cm;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterCreateReportAppealMutationImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterCreateReportAppealResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletterenforcements.client.NewsletterUserReportsNetworkClient$submitAppeal$2", f = "NewsletterUserReportsNetworkClient.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterUserReportsNetworkClient$submitAppeal$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $reason;
    public final /* synthetic */ String $reportId;
    public int label;
    public final /* synthetic */ NewsletterUserReportsNetworkClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterUserReportsNetworkClient$submitAppeal$2(NewsletterUserReportsNetworkClient newsletterUserReportsNetworkClient, String str, String str2, C023509x r5) {
        super(2, r5);
        this.$reportId = str;
        this.$reason = str2;
        this.this$0 = newsletterUserReportsNetworkClient;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new NewsletterUserReportsNetworkClient$submitAppeal$2(this.this$0, this.$reportId, this.$reason, r6);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            NewsletterCreateReportAppealMutationImpl$Builder newsletterCreateReportAppealMutationImpl$Builder = new NewsletterCreateReportAppealMutationImpl$Builder();
            String str = this.$reportId;
            AnonymousClass9VA r5 = newsletterCreateReportAppealMutationImpl$Builder.A00;
            newsletterCreateReportAppealMutationImpl$Builder.A02 = C36341k9.A1Y(r5, "report_id", str);
            newsletterCreateReportAppealMutationImpl$Builder.A01 = C36341k9.A1Y(r5, "reason", this.$reason);
            C20740y5.A06(newsletterCreateReportAppealMutationImpl$Builder.A02);
            C20740y5.A06(newsletterCreateReportAppealMutationImpl$Builder.A01);
            AnonymousClass9JF r1 = new AnonymousClass9JF(r5, NewsletterCreateReportAppealResponseImpl.class, "NewsletterCreateReportAppeal");
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
        return new NewsletterReportAppealStateResponseImpl(((AnonymousClass9Y8) obj).A03(NewsletterCreateReportAppealResponseImpl.Xwa2CreateChannelReportAppealV2.class, "xwa2_create_channel_report_appeal_v2").A00);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterUserReportsNetworkClient$submitAppeal$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
