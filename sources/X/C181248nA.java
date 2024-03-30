package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.8nA  reason: invalid class name and case insensitive filesystem */
public class C181248nA extends AnonymousClass2bI {
    public UserJid A00;
    public UserJid A01;
    public transient C19700wN A02;

    public AnonymousClass11F A0J() {
        return null;
    }

    public void A0q(AnonymousClass11F r1) {
    }

    public String A0c() {
        UserJid userJid;
        if (this.A00 != 28 || (userJid = this.A01) == null) {
            return null;
        }
        return userJid.getRawString();
    }

    public void A1Z(UserJid userJid) {
        if (this.A02 != null && (userJid == null || AnonymousClass143.A0I(userJid))) {
            this.A02.A0E("InvalidNumberChangeJid", AnonymousClass000.A0l(userJid, "newJid = ", AnonymousClass000.A0u()), true);
        }
        this.A00 = userJid;
    }

    public C181248nA(C64933Qa r1, int i, long j) {
        super(r1, i, j);
    }
}
