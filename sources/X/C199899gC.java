package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.9gC  reason: invalid class name and case insensitive filesystem */
public final class C199899gC {
    public AnonymousClass9W6 A00;
    public final UserJid A01;
    public final String A02;
    public final String A03;
    public final List A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C199899gC(UserJid userJid, String str, String str2, List list) {
        this((AnonymousClass9W6) null, userJid, str, str2, list);
        C36321k7.A18(userJid, list, str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C36381kD.A1Y(this, obj)) {
                return false;
            }
            C199899gC r4 = (C199899gC) obj;
            if (!AnonymousClass00C.A0J(this.A01, r4.A01) || !AnonymousClass00C.A0J(this.A04, r4.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A01;
        return AnonymousClass000.A0L(this.A04, A0M);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ProductListRequest(businessId=");
        A0u.append(this.A01);
        A0u.append(", productIds=");
        A0u.append(this.A04);
        A0u.append(", width=");
        A0u.append(this.A03);
        A0u.append(", height=");
        A0u.append(this.A02);
        A0u.append(", catalogVariantsRequestData=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }

    public C199899gC(AnonymousClass9W6 r1, UserJid userJid, String str, String str2, List list) {
        this.A01 = userJid;
        this.A04 = list;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = r1;
    }
}
