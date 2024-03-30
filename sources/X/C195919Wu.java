package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.9Wu  reason: invalid class name and case insensitive filesystem */
public final class C195919Wu {
    public final int A00;
    public final int A01;
    public final AnonymousClass9W6 A02;
    public final UserJid A03;
    public final List A04;

    public C195919Wu(AnonymousClass9W6 r2, UserJid userJid, List list, int i, int i2) {
        AnonymousClass00C.A0D(userJid, 1);
        this.A03 = userJid;
        this.A04 = list;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195919Wu) {
                C195919Wu r5 = (C195919Wu) obj;
                if (!AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A04, r5.A04) || this.A01 != r5.A01 || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C36351kA.A05(this.A04, C36391kE.A0A(this.A03)) + this.A01) * 31) + this.A00) * 31) + AnonymousClass000.A0H(this.A02);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RefreshCartRequest(bizJid=");
        A0u.append(this.A03);
        A0u.append(", productIds=");
        A0u.append(this.A04);
        A0u.append(", width=");
        A0u.append(this.A01);
        A0u.append(", height=");
        A0u.append(this.A00);
        A0u.append(", catalogVariantsRequestData=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
