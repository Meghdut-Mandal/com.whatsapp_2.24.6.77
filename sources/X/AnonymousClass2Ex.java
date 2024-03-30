package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2Ex  reason: invalid class name */
public final class AnonymousClass2Ex extends C53622rc {
    public final UserJid A00;
    public final AnonymousClass00S A01;
    public final C006302t A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2Ex) {
                AnonymousClass2Ex r5 = (AnonymousClass2Ex) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36351kA.A05(this.A02, C36391kE.A0A(this.A00)));
    }

    public AnonymousClass2Ex(UserJid userJid, AnonymousClass00S r2, C006302t r3) {
        this.A00 = userJid;
        this.A02 = r3;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UserConfirmationRequired(userJid=");
        A0u.append(this.A00);
        A0u.append(", onUserConfirmationGranted=");
        A0u.append(this.A02);
        A0u.append(", onUserConfirmationDenied=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
