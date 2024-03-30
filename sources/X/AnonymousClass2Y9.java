package X;

import android.content.Context;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribersQueryImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribersResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterSubscribersInput;
import com.whatsapp.util.Log;

/* renamed from: X.2Y9  reason: invalid class name */
public final class AnonymousClass2Y9 extends C22726Aue {
    public transient C19970wo A00;
    public transient AnonymousClass12O A01;
    public transient AnonymousClass1ZV A02;
    public transient AnonymousClass1ZL A03;
    public transient C27591Ow A04;
    public AnonymousClass4RF callback;
    public final C28981Uw newsletterJid;
    public final C52172p0 typeOfFetch;

    public boolean A0D(Exception exc) {
        return false;
    }

    public void Bqf(Context context) {
        AnonymousClass00C.A0D(context, 0);
        super.Bqf(context);
        C18800tq A0P = C36371kC.A0P(context);
        this.A00 = A0P.Bvc();
        this.A04 = C36391kE.A0g(A0P);
        this.A01 = C36411kG.A0d(A0P);
        this.A03 = A0P.Azc();
        this.A02 = (AnonymousClass1ZV) A0P.A5n.get();
    }

    public AnonymousClass2Y9(C52172p0 r2, C28981Uw r3, AnonymousClass4RF r4) {
        super("GetNewsletterMetadataJob");
        this.newsletterJid = r3;
        this.typeOfFetch = r2;
        this.callback = r4;
    }

    public void A09() {
        Log.i("NewsletterSubscribersGraphqlJob/onAdded");
        C27591Ow r0 = this.A04;
        if (r0 == null) {
            throw C36331k8.A0d("graphqlClient");
        } else if (!r0.A03.A0I() && this.callback != null) {
            new C178228fO();
        }
    }

    public void A0A() {
        Log.i("NewsletterSubscribersGraphqlJob/onCanceled");
        this.callback = null;
    }

    public void A0B() {
        super.A0B();
        if (!this.isCancelled) {
            Log.i("NewsletterSubscribersGraphqlJob/onRun");
            XWA2NewsletterSubscribersInput xWA2NewsletterSubscribersInput = new XWA2NewsletterSubscribersInput();
            xWA2NewsletterSubscribersInput.A07("newsletter_id", this.newsletterJid.getRawString());
            int i = 2500;
            if (this.typeOfFetch == C52172p0.SHORT) {
                i = 10;
            }
            xWA2NewsletterSubscribersInput.A06("count", Integer.valueOf(i));
            AnonymousClass9VA r3 = new NewsletterSubscribersQueryImpl$Builder().A00;
            r3.A00(xWA2NewsletterSubscribersInput, "input");
            AnonymousClass9JF r1 = new AnonymousClass9JF(r3, NewsletterSubscribersResponseImpl.class, "NewsletterSubscribers");
            C27591Ow r0 = this.A04;
            if (r0 == null) {
                throw C36331k8.A0d("graphqlClient");
            }
            r0.A01(r1).A02(new C86324Km(this));
        }
    }

    public void cancel() {
        super.cancel();
        this.callback = null;
    }
}
