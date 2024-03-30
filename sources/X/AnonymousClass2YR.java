package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2YR  reason: invalid class name */
public final class AnonymousClass2YR extends C54832td {
    public final long A00;
    public final UserJid A01;

    public AnonymousClass2YR(UserJid userJid, long j) {
        AnonymousClass00C.A0D(userJid, 1);
        this.A01 = userJid;
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2YR) {
                AnonymousClass2YR r8 = (AnonymousClass2YR) obj;
                if (!AnonymousClass00C.A0J(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36341k9.A02(this.A00, C36391kE.A0A(this.A01));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Success(user=");
        A0u.append(this.A01);
        A0u.append(", expirationTimestamp=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
