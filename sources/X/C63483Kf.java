package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3Kf  reason: invalid class name and case insensitive filesystem */
public final class C63483Kf {
    public UserJid A00;
    public C51962of A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63483Kf) {
                C63483Kf r5 = (C63483Kf) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || this.A01 != r5.A01 || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A01, C36421kH.A04(this.A02)) + AnonymousClass000.A0H(this.A00);
    }

    public C63483Kf(UserJid userJid, C51962of r2, String str) {
        C36321k7.A0x(str, r2);
        this.A02 = str;
        this.A01 = r2;
        this.A00 = userJid;
    }

    public final String A00() {
        return this.A02;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BotMessageInfo(targetId=");
        A0u.append(this.A02);
        A0u.append(", state=");
        A0u.append(this.A01);
        A0u.append(", botInvokerJid=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
