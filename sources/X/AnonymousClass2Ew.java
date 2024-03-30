package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2Ew  reason: invalid class name */
public final class AnonymousClass2Ew extends C53622rc {
    public final UserJid A00;
    public final AnonymousClass00S A01;
    public final C006302t A02;

    public AnonymousClass2Ew(UserJid userJid, AnonymousClass00S r3, C006302t r4) {
        AnonymousClass00C.A0D(userJid, 1);
        this.A00 = userJid;
        this.A02 = r4;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2Ew) {
                AnonymousClass2Ew r5 = (AnonymousClass2Ew) obj;
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

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("OnRequestFailedErrorWithRetry(userJid=");
        A0u.append(this.A00);
        A0u.append(", onRetryRequested=");
        A0u.append(this.A02);
        A0u.append(", onErrorDismissed=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
