package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponse;

/* renamed from: X.3RJ  reason: invalid class name */
public abstract class AnonymousClass3RJ {
    public static final String A00(C220412q r3, NewsletterReportAppealStateResponse newsletterReportAppealStateResponse) {
        C44072La r1;
        AnonymousClass00C.A0D(newsletterReportAppealStateResponse, 0);
        AnonymousClass9Y8 r4 = (AnonymousClass9Y8) newsletterReportAppealStateResponse;
        if (r4.A07("channel_name") != null) {
            return r4.A07("channel_name");
        }
        C65313Ro r0 = C28981Uw.A03;
        C65073Qp A09 = r3.A09(C65313Ro.A00(r4.A00.optString("channel_jid")), false);
        if (!(A09 instanceof C44072La) || (r1 = (C44072La) A09) == null) {
            return null;
        }
        return r1.A0K;
    }
}
