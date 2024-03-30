package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3uN  reason: invalid class name and case insensitive filesystem */
public final class C79843uN implements C16540pP {
    public C63363Jt A00 = null;
    public UserJid A01;

    public C79843uN(UserJid userJid) {
        AnonymousClass00C.A0D(userJid, 1);
        this.A01 = userJid;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C79843uN) {
                C79843uN r5 = (C79843uN) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A01) + AnonymousClass000.A0H(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SurveyQuickPromotionsUserFilterContext(userJid=");
        A0u.append(this.A01);
        A0u.append(", surveyInfo=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
