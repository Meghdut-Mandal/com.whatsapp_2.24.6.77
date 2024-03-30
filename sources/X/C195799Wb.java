package X;

import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.Date;

/* renamed from: X.9Wb  reason: invalid class name and case insensitive filesystem */
public final class C195799Wb {
    public final UserJid A00;
    public final String A01;
    public final Collection A02;
    public final Date A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195799Wb) {
                C195799Wb r5 = (C195799Wb) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A03, C36351kA.A05(this.A02, C36391kE.A0A(this.A00))) + C36341k9.A09(this.A01);
    }

    public C195799Wb(UserJid userJid, String str, Collection collection, Date date) {
        this.A00 = userJid;
        this.A02 = collection;
        this.A03 = date;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CreateOrderRequest(bizJid=");
        A0u.append(this.A00);
        A0u.append(", products=");
        A0u.append(this.A02);
        A0u.append(", date=");
        A0u.append(this.A03);
        A0u.append(", promotionId=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
