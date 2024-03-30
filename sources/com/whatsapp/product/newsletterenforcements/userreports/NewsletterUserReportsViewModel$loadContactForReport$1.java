package com.whatsapp.product.newsletterenforcements.userreports;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass9Y8;
import X.C005502l;
import X.C006302t;
import X.C009003v;
import X.C023509x;
import X.C28981Uw;
import X.C65313Ro;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponse;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel$loadContactForReport$1", f = "NewsletterUserReportsViewModel.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterUserReportsViewModel$loadContactForReport$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C006302t $callback;
    public final /* synthetic */ NewsletterReportAppealStateResponse $report;
    public int label;
    public final /* synthetic */ NewsletterUserReportsViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel$loadContactForReport$1$1", f = "NewsletterUserReportsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel$loadContactForReport$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r6) {
            return new AnonymousClass1(newsletterUserReportsViewModel, r6, r2);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                NewsletterReportAppealStateResponse newsletterReportAppealStateResponse = NewsletterReportAppealStateResponse.this;
                AnonymousClass00C.A0D(newsletterReportAppealStateResponse, 0);
                C65313Ro r0 = C28981Uw.A03;
                r2.invoke(newsletterUserReportsViewModel.A02.A08(C65313Ro.A00(((AnonymousClass9Y8) newsletterReportAppealStateResponse).A00.optString("channel_jid"))));
                return AnonymousClass0AJ.A00;
            }
            throw AnonymousClass000.A0e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterUserReportsViewModel$loadContactForReport$1(NewsletterReportAppealStateResponse newsletterReportAppealStateResponse, NewsletterUserReportsViewModel newsletterUserReportsViewModel, C023509x r4, C006302t r5) {
        super(2, r4);
        this.this$0 = newsletterUserReportsViewModel;
        this.$report = newsletterReportAppealStateResponse;
        this.$callback = r5;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new NewsletterUserReportsViewModel$loadContactForReport$1(this.$report, this.this$0, r6, this.$callback);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final NewsletterUserReportsViewModel newsletterUserReportsViewModel = this.this$0;
            C005502l r4 = newsletterUserReportsViewModel.A06;
            final NewsletterReportAppealStateResponse newsletterReportAppealStateResponse = this.$report;
            final C006302t r2 = this.$callback;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r4, r0) == r7) {
                return r7;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterUserReportsViewModel$loadContactForReport$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
