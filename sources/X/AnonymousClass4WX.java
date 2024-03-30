package X;

import com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet;
import com.whatsapp.newsletter.ui.multiadmin.NewsletterRevokeAdminInviteSheet;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4WX  reason: invalid class name */
public class AnonymousClass4WX implements AnonymousClass4TP {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4WX(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public void BWt(List list) {
        AnonymousClass17Y r3;
        Runnable runnable;
        if (this.A02 != 0) {
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
            Object obj = ((Reference) this.A00).get();
            if (obj != null) {
                NewsletterRevokeAdminInviteSheet newsletterRevokeAdminInviteSheet = (NewsletterRevokeAdminInviteSheet) this.A01;
                r3 = newsletterRevokeAdminInviteSheet.A00;
                if (r3 != null) {
                    runnable = new AnonymousClass736(newsletterRevokeAdminInviteSheet, A0J, obj, 20);
                } else {
                    throw C36321k7.A06();
                }
            } else {
                return;
            }
        } else {
            NewsletterAcceptAdminInviteSheet newsletterAcceptAdminInviteSheet = (NewsletterAcceptAdminInviteSheet) this.A01;
            r3 = newsletterAcceptAdminInviteSheet.A1m();
            runnable = new C81123wV((Object) newsletterAcceptAdminInviteSheet, 24);
        }
        r3.A0H(runnable);
    }

    public void BiG(List list) {
        if (this.A02 != 0) {
            Object obj = ((Reference) this.A00).get();
            if (obj != null) {
                NewsletterRevokeAdminInviteSheet newsletterRevokeAdminInviteSheet = (NewsletterRevokeAdminInviteSheet) this.A01;
                AnonymousClass17Y r1 = newsletterRevokeAdminInviteSheet.A00;
                if (r1 != null) {
                    C36411kG.A1F(r1, obj, newsletterRevokeAdminInviteSheet, 46);
                    return;
                }
                throw C36321k7.A06();
            }
            return;
        }
        NewsletterAcceptAdminInviteSheet newsletterAcceptAdminInviteSheet = (NewsletterAcceptAdminInviteSheet) this.A01;
        C36411kG.A1F(newsletterAcceptAdminInviteSheet.A1m(), newsletterAcceptAdminInviteSheet, this.A00, 45);
    }
}
