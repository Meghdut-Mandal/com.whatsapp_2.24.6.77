package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminInviteRevokeMutationImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminInviteRevokeResponseImpl;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8fW  reason: invalid class name */
public final class AnonymousClass8fW extends C68993cn {
    public AnonymousClass4TM A00;
    public final C28981Uw A01;
    public final UserJid A02;
    public final AnonymousClass1ZL A03;

    public /* bridge */ /* synthetic */ void A02(AnonymousClass9Y8 r5) {
        AnonymousClass00C.A0D(r5, 0);
        if (!this.A01) {
            boolean A08 = AnonymousClass1ZL.A08(AnonymousClass9Y8.A00(r5, NewsletterAdminInviteRevokeResponseImpl.Xwa2NewsletterAdminInviteRevoke.class, "xwa2_newsletter_admin_invite_revoke"));
            AnonymousClass4TM r2 = this.A00;
            if (!A08) {
                if (r2 != null) {
                    r2.onError(new C178238fP("Revoking failed", 0));
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
        NewsletterAdminInviteRevokeMutationImpl$Builder newsletterAdminInviteRevokeMutationImpl$Builder = new NewsletterAdminInviteRevokeMutationImpl$Builder();
        String rawString = this.A01.getRawString();
        AnonymousClass9VA r3 = newsletterAdminInviteRevokeMutationImpl$Builder.A00;
        newsletterAdminInviteRevokeMutationImpl$Builder.A01 = C36341k9.A1Y(r3, "newsletter_id", rawString);
        newsletterAdminInviteRevokeMutationImpl$Builder.A02 = C36341k9.A1Y(r3, "user_id", this.A03.A0E(this.A02).getRawString());
        C20740y5.A06(newsletterAdminInviteRevokeMutationImpl$Builder.A01);
        C20740y5.A06(newsletterAdminInviteRevokeMutationImpl$Builder.A02);
        return new AnonymousClass9JF(r3, NewsletterAdminInviteRevokeResponseImpl.class, "NewsletterAdminInviteRevoke");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8fW(C27591Ow r1, C28981Uw r2, UserJid userJid, AnonymousClass4TM r4, AnonymousClass4OL r5, AnonymousClass1ZL r6, C19770wU r7) {
        super(r1, r5, r7);
        C36321k7.A11(r7, r1, r5);
        this.A03 = r6;
        this.A01 = r2;
        this.A02 = userJid;
        this.A00 = r4;
    }

    public void cancel() {
        super.cancel();
        this.A00 = null;
    }
}
