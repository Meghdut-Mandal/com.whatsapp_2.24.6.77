package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.8Wt  reason: invalid class name and case insensitive filesystem */
public final class C174408Wt extends AnonymousClass9EP {
    public final C128506Cn A00;
    public final UserJid A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174408Wt(C128506Cn r2, UserJid userJid) {
        super(2);
        AnonymousClass00C.A0D(userJid, 2);
        this.A00 = r2;
        this.A01 = userJid;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C174408Wt) {
                C174408Wt r5 = (C174408Wt) obj;
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

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ExpandableCategoryParentItem(categoryData=");
        A0u.append(this.A00);
        A0u.append(", bizJid=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
