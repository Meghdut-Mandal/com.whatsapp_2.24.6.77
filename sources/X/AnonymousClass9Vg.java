package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9Vg  reason: invalid class name */
public final class AnonymousClass9Vg {
    public final UserJid A00;
    public final AnonymousClass630 A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9Vg) {
                AnonymousClass9Vg r5 = (AnonymousClass9Vg) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, (C36391kE.A0A(this.A00) + 1) * 31);
    }

    public AnonymousClass9Vg(UserJid userJid, AnonymousClass630 r2) {
        this.A00 = userJid;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AdditionalEncryptedMessage(toJid=");
        A0u.append(this.A00);
        A0u.append(", encryptedMessageType=");
        A0u.append(1);
        A0u.append(", encryptedMessage=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
