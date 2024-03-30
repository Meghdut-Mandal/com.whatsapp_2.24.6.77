package X;

import android.content.Context;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterRecommendedQueryImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterRecommendedResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterSearchQueryImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterSearchResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterFiltersInput;
import com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterRecommendedInput;
import com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterSearchInput;
import com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterSortInput;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.8fN  reason: invalid class name and case insensitive filesystem */
public final class C178218fN extends C22726Aue {
    public transient AnonymousClass1ZS A00;
    public transient AnonymousClass1ZL A01;
    public transient C27591Ow A02;
    public AnonymousClass4TN callback;
    public final boolean filterOutSubscribedChannels;
    public final boolean isRecommended;
    public final int limit;
    public final String query;
    public final String sortField;
    public final String sortOrder;

    public boolean A0D(Exception exc) {
        return false;
    }

    public void cancel() {
        this.isCancelled = true;
        this.callback = null;
    }

    public /* synthetic */ C178218fN(AnonymousClass4TN r8) {
        super("GetNewsletterMetadataJob");
        this.query = null;
        this.sortField = "SUBSCRIBER_COUNT";
        this.sortOrder = "DESCENDING";
        this.limit = 20;
        this.isRecommended = true;
        this.callback = r8;
        this.filterOutSubscribedChannels = false;
    }

    public static void A00(AnonymousClass9VA r1, Boolean bool, Boolean bool2) {
        r1.A01("fetch_image", bool);
        r1.A01("fetch_preview", bool2);
        r1.A01("fetch_description", bool2);
        r1.A01("fetch_invite", bool2);
        r1.A01("fetch_handle", bool2);
        r1.A01("fetch_subscribers_count", bool2);
        r1.A01("fetch_verification", bool2);
        r1.A01("fetch_viewer_metadata", bool);
    }

    public void A09() {
        Log.i("GetDirectoryNewslettersJob/onAdded");
        C27591Ow r0 = this.A02;
        if (r0 == null) {
            throw C36331k8.A0d("graphQlClient");
        } else if (!r0.A03.A0I()) {
            AnonymousClass4TN r1 = this.callback;
            if (r1 != null) {
                r1.BWe(new C178228fO());
            }
            this.callback = null;
        }
    }

    public void A0A() {
        if (!this.isCancelled) {
            Log.i("GetDirectoryNewslettersJob/onCanceled");
        }
    }

    public void A0B() {
        C199459fL r1;
        C006302t r0;
        if (!this.isCancelled) {
            Log.i("GetDirectoryNewslettersJob/onRun");
            boolean z = this.isRecommended;
            C27591Ow r4 = this.A02;
            if (z) {
                if (r4 == null) {
                    throw C36331k8.A0d("graphQlClient");
                }
                AnonymousClass1ZS r02 = this.A00;
                if (r02 == null) {
                    throw C36331k8.A0d("newsletterDirectoryUtil");
                }
                List A11 = C36371kC.A11(r02.A00());
                XWA2NewsletterRecommendedInput xWA2NewsletterRecommendedInput = new XWA2NewsletterRecommendedInput();
                xWA2NewsletterRecommendedInput.A08("country_codes", A11);
                xWA2NewsletterRecommendedInput.A06("limit", Integer.valueOf(this.limit));
                NewsletterRecommendedQueryImpl$Builder newsletterRecommendedQueryImpl$Builder = new NewsletterRecommendedQueryImpl$Builder();
                AnonymousClass9VA r3 = newsletterRecommendedQueryImpl$Builder.A00;
                r3.A00(xWA2NewsletterRecommendedInput, "input");
                newsletterRecommendedQueryImpl$Builder.A01 = true;
                r3.A01("fetch_state", true);
                r3.A01("fetch_creation_time", true);
                r3.A01("fetch_name", true);
                A00(r3, C36381kD.A0j(), true);
                C20740y5.A06(newsletterRecommendedQueryImpl$Builder.A01);
                r1 = r4.A01(new AnonymousClass9JF(r3, NewsletterRecommendedResponseImpl.class, "NewsletterRecommended"));
                r0 = new C22421AmM(this);
            } else if (r4 == null) {
                throw C36331k8.A0d("graphQlClient");
            } else {
                XWA2NewsletterSortInput xWA2NewsletterSortInput = new XWA2NewsletterSortInput();
                xWA2NewsletterSortInput.A07("field", this.sortField);
                xWA2NewsletterSortInput.A07("order", this.sortOrder);
                AnonymousClass1ZS r03 = this.A00;
                if (r03 == null) {
                    throw C36331k8.A0d("newsletterDirectoryUtil");
                }
                List A112 = C36371kC.A11(r03.A00());
                XWA2NewsletterFiltersInput xWA2NewsletterFiltersInput = new XWA2NewsletterFiltersInput();
                xWA2NewsletterFiltersInput.A08("country_codes", A112);
                xWA2NewsletterFiltersInput.A07("search_text", this.query);
                XWA2NewsletterSearchInput xWA2NewsletterSearchInput = new XWA2NewsletterSearchInput();
                xWA2NewsletterSearchInput.A06("limit", Integer.valueOf(this.limit));
                xWA2NewsletterSearchInput.A05(xWA2NewsletterFiltersInput, "filters");
                xWA2NewsletterSearchInput.A05(xWA2NewsletterSortInput, "sorted_by");
                NewsletterSearchQueryImpl$Builder newsletterSearchQueryImpl$Builder = new NewsletterSearchQueryImpl$Builder();
                AnonymousClass9VA r32 = newsletterSearchQueryImpl$Builder.A00;
                r32.A00(xWA2NewsletterSearchInput, "input");
                newsletterSearchQueryImpl$Builder.A01 = true;
                r32.A01("fetch_state", true);
                r32.A01("fetch_creation_time", true);
                r32.A01("fetch_name", true);
                A00(r32, C36381kD.A0j(), true);
                C20740y5.A06(newsletterSearchQueryImpl$Builder.A01);
                r1 = r4.A01(new AnonymousClass9JF(r32, NewsletterSearchResponseImpl.class, "NewsletterSearch"));
                r0 = new C22422AmN(this);
            }
            r1.A02(r0);
        }
    }

    public void Bqf(Context context) {
        C18800tq A0P = C165577te.A0P(context);
        this.A02 = C36391kE.A0g(A0P);
        this.A01 = A0P.Azc();
        this.A00 = (AnonymousClass1ZS) A0P.A5b.get();
    }

    public C178218fN() {
        super("GetNewsletterMetadataJob");
        this.query = null;
        this.sortField = "SUBSCRIBER_COUNT";
        this.sortOrder = "DESCENDING";
        this.limit = 500;
        this.isRecommended = false;
        this.callback = null;
        this.filterOutSubscribedChannels = false;
    }
}
