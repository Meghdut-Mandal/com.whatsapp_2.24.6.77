package X;

import com.whatsapp.newsletter.NewsletterInfoActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3o6  reason: invalid class name and case insensitive filesystem */
public final class C75963o6 implements AnonymousClass4TP {
    public final /* synthetic */ NewsletterInfoActivity A00;

    public C75963o6(NewsletterInfoActivity newsletterInfoActivity) {
        this.A00 = newsletterInfoActivity;
    }

    public void BiG(List list) {
        NewsletterInfoActivity newsletterInfoActivity = this.A00;
        newsletterInfoActivity.A05.A0H(new C1497272n(newsletterInfoActivity, 44));
    }

    public void BWt(List list) {
        ArrayList A0l = C36341k9.A0l(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C36381kD.A1Q(A0l, it);
        }
        ArrayList A0J = C36321k7.A0J(A0l);
        Iterator it2 = A0l.iterator();
        while (it2.hasNext()) {
            AnonymousClass2YQ.A00(A0J, it2);
        }
        NewsletterInfoActivity newsletterInfoActivity = this.A00;
        C36411kG.A1F(newsletterInfoActivity.A05, newsletterInfoActivity, A0J, 27);
    }
}
