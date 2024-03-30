package X;

import android.content.Context;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminMetadataQueryImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminMetadataQueryResponseImpl;
import com.whatsapp.util.Log;

/* renamed from: X.8fK  reason: invalid class name and case insensitive filesystem */
public final class C178208fK extends C22726Aue {
    public transient AnonymousClass1SM A00;
    public transient C30211Zq A01;
    public transient AnonymousClass1ZM A02;
    public transient C62663Ha A03;
    public transient C27591Ow A04;
    public B1B callback;
    public final boolean includeAdminCount;
    public final boolean includeMessageEnforcements;
    public final boolean includePendingAdmins;
    public final boolean includeThreadMetadata;
    public final C28981Uw newsletterJid;

    public boolean A0D(Exception exc) {
        return true;
    }

    public void cancel() {
        this.isCancelled = true;
        this.callback = null;
    }

    public C178208fK(C28981Uw r2, B1B b1b, boolean z, boolean z2, boolean z3, boolean z4) {
        super("GetNewsletterMetadataJob");
        this.newsletterJid = r2;
        this.includeThreadMetadata = z;
        this.includeMessageEnforcements = z2;
        this.includePendingAdmins = z3;
        this.includeAdminCount = z4;
        this.callback = b1b;
    }

    public void A09() {
        Log.i("GetNewsletterAdminMetadataJob/onAdded");
    }

    public void A0A() {
        Log.i("GetNewsletterAdminMetadataJob/onCanceled");
    }

    public void A0B() {
        NewsletterAdminMetadataQueryImpl$Builder newsletterAdminMetadataQueryImpl$Builder = new NewsletterAdminMetadataQueryImpl$Builder();
        String rawString = this.newsletterJid.getRawString();
        AnonymousClass9VA r3 = newsletterAdminMetadataQueryImpl$Builder.A00;
        newsletterAdminMetadataQueryImpl$Builder.A05 = C36341k9.A1Y(r3, "jid", rawString);
        Boolean valueOf = Boolean.valueOf(this.includeThreadMetadata);
        r3.A01("include_thread_metadata", valueOf);
        newsletterAdminMetadataQueryImpl$Builder.A04 = AnonymousClass000.A1V(valueOf);
        Boolean valueOf2 = Boolean.valueOf(this.includeMessageEnforcements);
        r3.A01("include_messages", valueOf2);
        newsletterAdminMetadataQueryImpl$Builder.A03 = AnonymousClass000.A1V(valueOf2);
        Boolean valueOf3 = Boolean.valueOf(this.includePendingAdmins);
        r3.A01("fetch_pending_admin_invites", valueOf3);
        newsletterAdminMetadataQueryImpl$Builder.A02 = AnonymousClass000.A1V(valueOf3);
        Boolean valueOf4 = Boolean.valueOf(this.includeAdminCount);
        r3.A01("fetch_admin_count", valueOf4);
        newsletterAdminMetadataQueryImpl$Builder.A01 = AnonymousClass000.A1V(valueOf4);
        C20740y5.A06(newsletterAdminMetadataQueryImpl$Builder.A05);
        C20740y5.A06(newsletterAdminMetadataQueryImpl$Builder.A04);
        C20740y5.A06(newsletterAdminMetadataQueryImpl$Builder.A03);
        C20740y5.A06(newsletterAdminMetadataQueryImpl$Builder.A02);
        C20740y5.A06(newsletterAdminMetadataQueryImpl$Builder.A01);
        AnonymousClass9JF r1 = new AnonymousClass9JF(r3, NewsletterAdminMetadataQueryResponseImpl.class, "NewsletterAdminMetadataQuery");
        C27591Ow r0 = this.A04;
        if (r0 == null) {
            throw C36331k8.A0d("graphqlIqClient");
        }
        r0.A01(r1).A02(new C22423AmO(this));
    }

    public void Bqf(Context context) {
        C18800tq A0P = C165577te.A0P(context);
        this.A04 = C36391kE.A0g(A0P);
        this.A00 = (AnonymousClass1SM) A0P.A5k.get();
        this.A02 = A0P.Aze();
        this.A03 = (C62663Ha) A0P.A5c.get();
        this.A01 = (C30211Zq) A0P.A5i.get();
    }
}
