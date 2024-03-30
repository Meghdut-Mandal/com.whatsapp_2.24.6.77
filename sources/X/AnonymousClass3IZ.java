package X;

import com.whatsapp.newsletter.viewmodel.NewsletterViewModel;

/* renamed from: X.3IZ  reason: invalid class name */
public final class AnonymousClass3IZ {
    public final C44072La A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3IZ) {
                AnonymousClass3IZ r5 = (AnonymousClass3IZ) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static C44072La A00(NewsletterViewModel newsletterViewModel) {
        AnonymousClass3IZ A012 = newsletterViewModel.A03.A01(newsletterViewModel.A05);
        AnonymousClass00C.A0E(A012, "null cannot be cast to non-null type com.whatsapp.newsletter.cache.NewsletterState");
        return A012.A00;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A00) + C36341k9.A01(this.A01 ? 1 : 0);
    }

    public AnonymousClass3IZ(C44072La r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NewsletterState(newsletter=");
        A0u.append(this.A00);
        A0u.append(", animated=");
        return C36321k7.A0H(A0u, this.A01);
    }
}
