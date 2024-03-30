package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.62b  reason: invalid class name and case insensitive filesystem */
public class C1259762b {
    public final UserJid A00;
    public final String A01;
    public final long A02;

    public C1259762b(UserJid userJid, String str, long j) {
        this.A02 = j;
        this.A00 = userJid;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("id=");
        A0u.append(this.A02);
        A0u.append(" jid=");
        A0u.append(this.A00);
        A0u.append(" display=");
        return AnonymousClass000.A0q(this.A01, A0u);
    }
}
