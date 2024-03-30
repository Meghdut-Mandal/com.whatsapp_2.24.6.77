package com.whatsapp.product.newsletterenforcements.userreports;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass32d;
import X.AnonymousClass9Y8;
import X.C009003v;
import X.C023509x;
import X.C36331k8;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponse;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel$processUserReports$2", f = "NewsletterUserReportsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterUserReportsViewModel$processUserReports$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ List $userReports;
    public int label;
    public final /* synthetic */ NewsletterUserReportsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterUserReportsViewModel$processUserReports$2(NewsletterUserReportsViewModel newsletterUserReportsViewModel, List list, C023509x r4) {
        super(2, r4);
        this.$userReports = list;
        this.this$0 = newsletterUserReportsViewModel;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new NewsletterUserReportsViewModel$processUserReports$2(this.this$0, this.$userReports, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            List list = this.$userReports;
            ArrayList A0I = AnonymousClass001.A0I();
            for (Object next : list) {
                GraphQLXWA2ReportStatus graphQLXWA2ReportStatus = GraphQLXWA2ReportStatus.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                if (((AnonymousClass9Y8) ((NewsletterReportAppealStateResponse) next)).A06(graphQLXWA2ReportStatus, "status") != graphQLXWA2ReportStatus) {
                    A0I.add(next);
                }
            }
            AnonymousClass32d r1 = this.this$0.A04;
            r1.A00.clear();
            ConcurrentHashMap concurrentHashMap = r1.A00;
            LinkedHashMap linkedHashMap = new LinkedHashMap(C36331k8.A01(A0I));
            for (Object next2 : A0I) {
                linkedHashMap.put(((AnonymousClass9Y8) ((NewsletterReportAppealStateResponse) next2)).A00.optString("report_id"), next2);
            }
            concurrentHashMap.putAll(linkedHashMap);
            return A0I;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterUserReportsViewModel$processUserReports$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
