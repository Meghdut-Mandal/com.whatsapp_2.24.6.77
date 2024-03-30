package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3IC  reason: invalid class name */
public class AnonymousClass3IC {
    public final AnonymousClass3Q6 A00;
    public final UserJid A01;

    public int A00() {
        if (this instanceof AnonymousClass2JC) {
            return ((AnonymousClass2JC) this).A01;
        }
        if (this instanceof AnonymousClass2JB) {
            return Integer.MAX_VALUE;
        }
        return this.A00.A00();
    }

    public long A01(int i) {
        if ((this instanceof AnonymousClass2JC) || (this instanceof AnonymousClass2JB)) {
            return 0;
        }
        return this.A00.A01(i);
    }

    public Integer A02() {
        if (this instanceof AnonymousClass2JC) {
            return C023109s.A01;
        }
        if (this instanceof AnonymousClass2JB) {
            return C023109s.A0C;
        }
        return C023109s.A00;
    }

    public AnonymousClass3IC(AnonymousClass3Q6 r1, UserJid userJid) {
        this.A01 = userJid;
        this.A00 = r1;
    }
}
