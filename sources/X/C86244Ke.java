package X;

import com.whatsapp.R;
import com.whatsapp.newsletter.NewsletterInfoActivity;

/* renamed from: X.4Ke  reason: invalid class name and case insensitive filesystem */
public final class C86244Ke extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ NewsletterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86244Ke(NewsletterInfoActivity newsletterInfoActivity) {
        super(1);
        this.this$0 = newsletterInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass3KA r6 = (AnonymousClass3KA) obj;
        NewsletterInfoActivity newsletterInfoActivity = this.this$0;
        AnonymousClass00C.A0B(r6);
        newsletterInfoActivity.Bnv();
        int ordinal = r6.A03.ordinal();
        if (ordinal == 3 || ordinal == 2) {
            NewsletterInfoActivity.A0z(newsletterInfoActivity);
        } else if (ordinal == 1 || ordinal == 0) {
            NewsletterInfoActivity.A1B(newsletterInfoActivity, false, false);
        }
        if (!r6.A04) {
            newsletterInfoActivity.BO5(r6.A00);
        } else {
            C39001qm A00 = AnonymousClass3LW.A00(newsletterInfoActivity);
            A00.A0d(r6.A01);
            A00.A0c(r6.A00);
            A00.A0m(newsletterInfoActivity, new AnonymousClass3UW(r6, newsletterInfoActivity, 27), R.string.f12nameremoved);
            A00.A0l(newsletterInfoActivity, C67953b6.A00, R.string.f12nameremoved);
            C36341k9.A11(A00);
        }
        return AnonymousClass0AJ.A00;
    }
}
