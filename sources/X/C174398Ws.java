package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.8Ws  reason: invalid class name and case insensitive filesystem */
public final class C174398Ws extends AnonymousClass9EP {
    public final C128506Cn A00;
    public final UserJid A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C174398Ws) {
                C174398Ws r5 = (C174398Ws) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36391kE.A0A(this.A00));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174398Ws(C128506Cn r2, UserJid userJid) {
        super(3);
        C36321k7.A0x(r2, userJid);
        this.A00 = r2;
        this.A01 = userJid;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ExpandableCategoryChildItem(categoryData=");
        A0u.append(this.A00);
        A0u.append(", bizJid=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
