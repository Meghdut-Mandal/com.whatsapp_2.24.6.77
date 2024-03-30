package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterAcceptAdminInviteMutationImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterAcceptAdminInviteResponseImpl;

/* renamed from: X.8fU  reason: invalid class name */
public final class AnonymousClass8fU extends C68993cn {
    public AnonymousClass4TM A00;
    public final C28981Uw A01;
    public final AnonymousClass1ZL A02;

    public /* bridge */ /* synthetic */ void A02(AnonymousClass9Y8 r5) {
        AnonymousClass00C.A0D(r5, 0);
        if (!this.A01) {
            boolean A08 = AnonymousClass1ZL.A08(AnonymousClass9Y8.A00(r5, NewsletterAcceptAdminInviteResponseImpl.Xwa2NewsletterAdminInviteAccept.class, "xwa2_newsletter_admin_invite_accept"));
            AnonymousClass4TM r2 = this.A00;
            if (!A08) {
                if (r2 != null) {
                    r2.onError(new C178238fP("Invitation accept failed", 0));
                }
            } else if (r2 != null) {
                r2.Bbg(this.A01);
            }
        }
    }

    public boolean A03() {
        return true;
    }

    public boolean A04(C201259jD r3) {
        AnonymousClass00C.A0D(r3, 0);
        if (!this.A01) {
            C165587tf.A19(r3, this.A00);
        }
        return false;
    }

    public AnonymousClass9JF A00() {
        NewsletterAcceptAdminInviteMutationImpl$Builder newsletterAcceptAdminInviteMutationImpl$Builder = new NewsletterAcceptAdminInviteMutationImpl$Builder();
        String rawString = this.A01.getRawString();
        AnonymousClass9VA r3 = newsletterAcceptAdminInviteMutationImpl$Builder.A00;
        C20740y5.A06(C36341k9.A1Y(r3, "newsletter_id", rawString));
        return new AnonymousClass9JF(r3, NewsletterAcceptAdminInviteResponseImpl.class, "NewsletterAcceptAdminInvite");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8fU(C27591Ow r1, C28981Uw r2, AnonymousClass4TM r3, AnonymousClass4OL r4, AnonymousClass1ZL r5, C19770wU r6) {
        super(r1, r4, r6);
        C36321k7.A11(r6, r1, r4);
        this.A02 = r5;
        this.A01 = r2;
        this.A00 = r3;
    }

    public void cancel() {
        super.cancel();
        this.A00 = null;
    }
}
