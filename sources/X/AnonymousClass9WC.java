package X;

import com.whatsapp.jid.PhoneUserJid;
import java.util.List;

/* renamed from: X.9WC  reason: invalid class name */
public final class AnonymousClass9WC {
    public final C28981Uw A00;
    public final PhoneUserJid A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9WC) {
                AnonymousClass9WC r5 = (AnonymousClass9WC) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A02, C36351kA.A05(this.A01, C36391kE.A0A(this.A00)));
    }

    public AnonymousClass9WC(C28981Uw r1, PhoneUserJid phoneUserJid, List list) {
        this.A00 = r1;
        this.A01 = phoneUserJid;
        this.A02 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NewsletterNotificationInfo(newsletterJid=");
        A0u.append(this.A00);
        A0u.append(", adminJid=");
        A0u.append(this.A01);
        A0u.append(", metadataUpdateTypes=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
