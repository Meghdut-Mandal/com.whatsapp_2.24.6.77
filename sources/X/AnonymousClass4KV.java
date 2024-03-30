package X;

import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.newsletter.NewsletterInfoMembersListViewModel;

/* renamed from: X.4KV  reason: invalid class name */
public final class AnonymousClass4KV extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ NewsletterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4KV(NewsletterInfoActivity newsletterInfoActivity) {
        super(1);
        this.this$0 = newsletterInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass3IZ r9 = (AnonymousClass3IZ) obj;
        NewsletterInfoActivity newsletterInfoActivity = this.this$0;
        AnonymousClass00C.A0B(r9);
        AnonymousClass3IZ r0 = newsletterInfoActivity.A0m;
        if (r0 == null) {
            throw C36331k8.A0d("currentState");
        }
        C44072La r4 = r0.A00;
        C44072La r3 = r9.A00;
        newsletterInfoActivity.A0m = r9;
        if (!(AnonymousClass00C.A0J(r4.A0K, r3.A0K) && r4.A07 == r3.A07 && r4.A0F == r3.A0F)) {
            AnonymousClass3QQ r1 = newsletterInfoActivity.A0P;
            if (r1 != null) {
                AnonymousClass141 r02 = newsletterInfoActivity.A0Y;
                if (r02 == null) {
                    throw C36331k8.A0d("contact");
                }
                r1.A02(r02);
            }
            if (NewsletterInfoActivity.A1D(newsletterInfoActivity)) {
                NewsletterInfoMembersListViewModel newsletterInfoMembersListViewModel = newsletterInfoActivity.A0i;
                if (newsletterInfoMembersListViewModel != null) {
                    newsletterInfoMembersListViewModel.A0S(C52172p0.SHORT);
                }
                NewsletterInfoActivity.A13(newsletterInfoActivity);
            }
        }
        if (!(r3.A0O == r4.A0O && r3.A09 == r4.A09)) {
            if (r4.A09 != r3.A09) {
                NewsletterInfoActivity.A0z(newsletterInfoActivity);
            }
            if (r4.A0O != r3.A0O) {
                NewsletterInfoActivity.A1B(newsletterInfoActivity, false, false);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
