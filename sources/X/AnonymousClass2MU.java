package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2MU  reason: invalid class name */
public final class AnonymousClass2MU extends C588831k {
    public final C51262nX A00;
    public final AnonymousClass11F A01;
    public final UserJid A02;
    public final Long A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2MU(C51262nX r2, AnonymousClass11F r3, UserJid userJid, Long l) {
        super(C51862oV.USER);
        AnonymousClass00C.A0D(userJid, 1);
        this.A02 = userJid;
        this.A03 = l;
        this.A01 = r3;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2MU) {
                AnonymousClass2MU r5 = (AnonymousClass2MU) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36351kA.A05(this.A01, (C36391kE.A0A(this.A02) + AnonymousClass000.A0H(this.A03)) * 31));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UserItem(userJid=");
        A0u.append(this.A02);
        A0u.append(", timestamp=");
        A0u.append(this.A03);
        A0u.append(", chatJid=");
        A0u.append(this.A01);
        A0u.append(", role=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
