package X;

import android.content.Context;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterDeleteMutationImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterDeleteResponseImpl;
import com.whatsapp.util.Log;

/* renamed from: X.8fJ  reason: invalid class name and case insensitive filesystem */
public final class C178198fJ extends C22726Aue {
    public transient C30131Zi A00;
    public transient AnonymousClass1ZL A01;
    public transient C27591Ow A02;
    public AnonymousClass4TM callback;
    public final C28981Uw newsletterJid;

    public void A0A() {
        this.callback = null;
        Log.i("DeleteNewsletterGraphqlJob/onCanceled");
    }

    public boolean A0D(Exception exc) {
        return false;
    }

    public void cancel() {
        this.isCancelled = true;
        this.callback = null;
    }

    public C178198fJ(C28981Uw r2, AnonymousClass4TM r3) {
        super("GetNewsletterMetadataJob");
        this.newsletterJid = r2;
        this.callback = r3;
    }

    public void A09() {
        AnonymousClass4TM r1;
        Log.i("DeleteNewsletterGraphqlJob/onAdded");
        C27591Ow r0 = this.A02;
        if (r0 == null) {
            throw C36331k8.A0d("graphqlClient");
        } else if (!r0.A03.A0I() && (r1 = this.callback) != null) {
            r1.onError(new C178228fO());
        }
    }

    public void A0B() {
        if (!this.isCancelled) {
            Log.i("DeleteNewsletterGraphqlJob/onRun");
            NewsletterDeleteMutationImpl$Builder newsletterDeleteMutationImpl$Builder = new NewsletterDeleteMutationImpl$Builder();
            String rawString = this.newsletterJid.getRawString();
            AnonymousClass9VA r3 = newsletterDeleteMutationImpl$Builder.A00;
            C20740y5.A06(C36341k9.A1Y(r3, "newsletter_id", rawString));
            AnonymousClass9JF r1 = new AnonymousClass9JF(r3, NewsletterDeleteResponseImpl.class, "NewsletterDelete");
            C27591Ow r0 = this.A02;
            if (r0 == null) {
                throw C36331k8.A0d("graphqlClient");
            }
            r0.A01(r1).A02(new C22420AmL(this));
        }
    }

    public void Bqf(Context context) {
        C18800tq A0P = C165577te.A0P(context);
        this.A02 = C36391kE.A0g(A0P);
        this.A00 = C36431kI.A0m(A0P);
        this.A01 = A0P.Azc();
    }
}
