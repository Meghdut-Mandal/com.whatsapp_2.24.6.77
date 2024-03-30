package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.8Wv  reason: invalid class name and case insensitive filesystem */
public final class C174428Wv extends AnonymousClass9EP {
    public final C128506Cn A00;
    public final UserJid A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C174428Wv) {
                C174428Wv r5 = (C174428Wv) obj;
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
    public C174428Wv(C128506Cn r2, UserJid userJid) {
        super(0);
        C36321k7.A0x(r2, userJid);
        this.A00 = r2;
        this.A01 = userJid;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StandardCategoryListDisplayItem(categoryData=");
        A0u.append(this.A00);
        A0u.append(", bizJid=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
