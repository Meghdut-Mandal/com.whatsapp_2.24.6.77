package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterReactionSendersListQueryImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterReactionSendersListResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterReactionSenderListInput;
import com.whatsapp.util.Log;

/* renamed from: X.8fI  reason: invalid class name */
public final class AnonymousClass8fI extends C22726Aue {
    public transient C27591Ow A00;
    public C22824AwZ callback;
    public final String messageSortId;
    public final C28981Uw newsletterJid;

    public boolean A0D(Exception exc) {
        return false;
    }

    public void Bqf(Context context) {
        AnonymousClass00C.A0D(context, 0);
        Log.i("NewsletterReactionSendersGraphqlJob/setContext");
        this.A00 = C36391kE.A0g(C36371kC.A0P(context));
    }

    public void cancel() {
        this.isCancelled = true;
        this.callback = null;
    }

    public AnonymousClass8fI(C28981Uw r2, C22824AwZ awZ, String str) {
        super("GetNewsletterMetadataJob");
        this.newsletterJid = r2;
        this.messageSortId = str;
        this.callback = awZ;
    }

    public void A09() {
        C22824AwZ awZ;
        Log.i("NewsletterReactionSendersGraphqlJob/onAdded");
        C27591Ow r0 = this.A00;
        if (r0 == null) {
            throw C36331k8.A0d("graphqlClient");
        } else if (!r0.A03.A0I() && (awZ = this.callback) != null) {
            C21230ADm aDm = (C21230ADm) awZ;
            Log.e((Throwable) new C178228fO());
            C10770fC r2 = aDm.A02;
            if (!r2.element) {
                aDm.A01.resumeWith(new C178318fk());
                r2.element = true;
            }
        }
    }

    public void A0A() {
        Log.i("NewsletterReactionSendersGraphqlJob/onCanceled");
        this.callback = null;
    }

    public void A0B() {
        if (!this.isCancelled) {
            Log.i("NewsletterReactionSendersGraphqlJob/onRun");
            XWA2NewsletterReactionSenderListInput xWA2NewsletterReactionSenderListInput = new XWA2NewsletterReactionSenderListInput();
            xWA2NewsletterReactionSenderListInput.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.newsletterJid.getRawString());
            xWA2NewsletterReactionSenderListInput.A07("server_id", this.messageSortId);
            AnonymousClass9VA r3 = new NewsletterReactionSendersListQueryImpl$Builder().A00;
            r3.A00(xWA2NewsletterReactionSenderListInput, "input");
            AnonymousClass9JF r1 = new AnonymousClass9JF(r3, NewsletterReactionSendersListResponseImpl.class, "NewsletterReactionSendersList");
            C27591Ow r0 = this.A00;
            if (r0 == null) {
                throw C36331k8.A0d("graphqlClient");
            }
            r0.A01(r1).A02(new C22424AmP(this));
        }
    }
}
