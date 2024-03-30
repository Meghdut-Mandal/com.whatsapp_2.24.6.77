package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterLinkPreviewCheckResponseImpl;

/* renamed from: X.4Kh  reason: invalid class name and case insensitive filesystem */
public final class C86274Kh extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass4RG $callback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86274Kh(AnonymousClass4RG r2) {
        super(1);
        this.$callback = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C23931Ak A04;
        AnonymousClass9Y8 r0;
        AnonymousClass00C.A0D(obj, 0);
        AnonymousClass9Y8 A03 = ((AnonymousClass9Y8) obj).A03(NewsletterLinkPreviewCheckResponseImpl.Xwa2NewsletterMessageIntegrity.class, "xwa2_newsletter_message_integrity");
        if (A03 == null || (A04 = A03.A04(NewsletterLinkPreviewCheckResponseImpl.Xwa2NewsletterMessageIntegrity.UrlPreviews.class, "url_previews")) == null || (r0 = (AnonymousClass9Y8) C007103b.A0L(A04)) == null || !r0.A00.optBoolean("is_previewable")) {
            this.$callback.BOC();
        } else {
            C75913o0 r4 = (C75913o0) this.$callback;
            r4.A00.A0H.A0H(new AnonymousClass751(45, r4.A01, r4));
        }
        return AnonymousClass0AJ.A00;
    }
}
