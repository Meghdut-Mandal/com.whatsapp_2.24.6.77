package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.69j  reason: invalid class name and case insensitive filesystem */
public final class C1277169j {
    public final UserJid A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1277169j) {
                C1277169j r5 = (C1277169j) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A00) + C36341k9.A09(this.A01);
    }

    public C1277169j(UserJid userJid, String str) {
        this.A00 = userJid;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Bot(jid=");
        A0u.append(this.A00);
        A0u.append(", personaId=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
