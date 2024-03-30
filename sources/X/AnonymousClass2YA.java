package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectorySearchQueryImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectorySearchResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterDirectorySearchInput;

/* renamed from: X.2YA  reason: invalid class name */
public final class AnonymousClass2YA extends AnonymousClass2YD {
    public final int limit;
    public final String query;
    public final String startCursor;

    public AnonymousClass2YA(AnonymousClass4UA r3, String str, String str2, int i) {
        super(r3, "NewsletterDirectoryV2SearchJob", false);
        this.query = str;
        this.limit = i;
        this.startCursor = str2;
    }

    public void A0B() {
        super.A0B();
        if (!this.isCancelled) {
            C27591Ow r4 = this.A02;
            if (r4 != null) {
                XWA2NewsletterDirectorySearchInput xWA2NewsletterDirectorySearchInput = new XWA2NewsletterDirectorySearchInput();
                xWA2NewsletterDirectorySearchInput.A07("search_text", this.query);
                xWA2NewsletterDirectorySearchInput.A06("limit", Integer.valueOf(this.limit));
                xWA2NewsletterDirectorySearchInput.A07("start_cursor", this.startCursor);
                AnonymousClass9VA r3 = new NewsletterDirectorySearchQueryImpl$Builder().A00;
                r3.A00(xWA2NewsletterDirectorySearchInput, "input");
                r4.A01(new AnonymousClass9JF(r3, NewsletterDirectorySearchResponseImpl.class, "NewsletterDirectorySearch")).A02(new C86314Kl(this));
                return;
            }
            throw C36331k8.A0d("graphQlClient");
        }
    }
}
