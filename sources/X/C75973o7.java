package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3o7  reason: invalid class name and case insensitive filesystem */
public final class C75973o7 implements AnonymousClass4TP {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ NewsletterInfoActivity A01;
    public final /* synthetic */ boolean A02;

    public C75973o7(UserJid userJid, NewsletterInfoActivity newsletterInfoActivity, boolean z) {
        this.A01 = newsletterInfoActivity;
        this.A00 = userJid;
        this.A02 = z;
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
        NewsletterInfoActivity newsletterInfoActivity = this.A01;
        newsletterInfoActivity.A05.A0H(new AnonymousClass736(newsletterInfoActivity, this.A00, A0J, 13));
    }

    public void BiG(List list) {
        ArrayList<AnonymousClass2YR> A0l = C36341k9.A0l(list);
        for (Object next : list) {
            if (next instanceof AnonymousClass2YR) {
                A0l.add(next);
            }
        }
        ArrayList A0J = C36321k7.A0J(A0l);
        for (AnonymousClass2YR r0 : A0l) {
            A0J.add(r0.A01);
        }
        NewsletterInfoActivity newsletterInfoActivity = this.A01;
        newsletterInfoActivity.A05.A0H(new AnonymousClass755(newsletterInfoActivity, this.A00, A0J, 18, this.A02));
    }
}
