package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataQueryImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterInput;
import com.whatsapp.util.Log;

/* renamed from: X.8fM  reason: invalid class name */
public class AnonymousClass8fM extends C22726Aue {
    public transient C220412q A00;
    public transient C26141Ja A01;
    public transient C27591Ow A02;
    public transient AnonymousClass1ZK A03;
    public transient C30131Zi A04;
    public transient AnonymousClass1ZL A05;
    public AnonymousClass4TM callback;
    public final String handlerType;
    public final C198239d8 metadataRequestFields;
    public final String newsletterHandle;
    public final C28981Uw newsletterJid;

    public boolean A0D(Exception exc) {
        return false;
    }

    public void Bqf(Context context) {
        AnonymousClass00C.A0D(context, 0);
        C18800tq A0P = C36371kC.A0P(context);
        C220412q A0a = C36351kA.A0a(A0P);
        AnonymousClass00C.A0D(A0a, 0);
        this.A00 = A0a;
        C27591Ow A0g = C36391kE.A0g(A0P);
        AnonymousClass00C.A0D(A0g, 0);
        this.A02 = A0g;
        C26141Ja r0 = (C26141Ja) A0P.A5m.get();
        AnonymousClass00C.A0D(r0, 0);
        this.A01 = r0;
        this.A04 = C36431kI.A0m(A0P);
        this.A05 = A0P.Azc();
        AnonymousClass1ZK r02 = (AnonymousClass1ZK) A0P.A5o.get();
        AnonymousClass00C.A0D(r02, 0);
        this.A03 = r02;
    }

    public void cancel() {
        this.isCancelled = true;
        this.callback = null;
    }

    public AnonymousClass8fM(C28981Uw r4, AnonymousClass4TM r5, C198239d8 r6) {
        super("GetNewsletterMetadataJob");
        this.newsletterHandle = null;
        this.newsletterJid = r4;
        this.handlerType = "JID";
        this.metadataRequestFields = r6;
        this.callback = r5;
    }

    public void A09() {
        Log.i("BaseMetadataNewsletterGraphqlJob/onAdded");
    }

    public void A0A() {
        if (!this.isCancelled) {
            this.callback = null;
            Log.i("BaseMetadataNewsletterGraphqlJob/onCanceled");
        }
    }

    public void A0B() {
        NewsletterMetadataQueryImpl$Builder A0C;
        if (!this.isCancelled) {
            Log.i("BaseMetadataNewsletterGraphqlJob/onRun");
            XWA2NewsletterInput xWA2NewsletterInput = new XWA2NewsletterInput();
            C28981Uw r0 = this.newsletterJid;
            if (r0 == null) {
                String str = this.newsletterHandle;
                C18740tg.A06(str);
                xWA2NewsletterInput.A07("key", str);
                C26141Ja r02 = this.A01;
                if (r02 != null) {
                    AnonymousClass00C.A0B(str);
                    C44072La A032 = r02.A03(str);
                    if (A032 != null) {
                        C54802ta.A00(A032.A09, xWA2NewsletterInput);
                    }
                    AnonymousClass1ZL r1 = this.A05;
                    if (r1 != null) {
                        A0C = r1.A0D(xWA2NewsletterInput, this.metadataRequestFields);
                    } else {
                        throw C36331k8.A0d("newsletterGraphqlUtil");
                    }
                } else {
                    throw C36331k8.A0d("newsletterStore");
                }
            } else {
                xWA2NewsletterInput.A07("key", r0.getRawString());
                C220412q r12 = this.A00;
                if (r12 != null) {
                    C44072La r2 = (C44072La) C36371kC.A0W(r12, this.newsletterJid);
                    if (r2 != null) {
                        C54802ta.A00(r2.A09, xWA2NewsletterInput);
                    }
                    AnonymousClass1ZL r13 = this.A05;
                    if (r13 != null) {
                        A0C = r13.A0C(r2, xWA2NewsletterInput, this.metadataRequestFields);
                    } else {
                        throw C36331k8.A0d("newsletterGraphqlUtil");
                    }
                } else {
                    throw C36331k8.A0d("chatsCache");
                }
            }
            C20740y5.A06(A0C.A01);
            AnonymousClass9JF r22 = new AnonymousClass9JF(A0C.A00, NewsletterMetadataResponseImpl.class, "NewsletterMetadata");
            xWA2NewsletterInput.A07(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, this.handlerType);
            C27591Ow r03 = this.A02;
            if (r03 != null) {
                r03.A01(r22).A02(new C22419AmK(this));
                return;
            }
            throw C36331k8.A0d("graphqlIqClient");
        }
    }

    public AnonymousClass8fM() {
        this((C28981Uw) null, (AnonymousClass4TM) null, new C198239d8(true, true, true, true, true, true, true, true, true, true, true, true));
    }
}
