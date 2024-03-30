package X;

import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.6Co  reason: invalid class name and case insensitive filesystem */
public final class C128516Co {
    public final int A00;
    public final int A01;
    public final UserJid A02;
    public final String A03;
    public final Set A04;

    public C128516Co(UserJid userJid, String str, Set set, int i, int i2) {
        AnonymousClass00C.A0D(str, 5);
        this.A02 = userJid;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = set;
        this.A03 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128516Co) {
                C128516Co r5 = (C128516Co) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || this.A01 != r5.A01 || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.A02;
        return C90504aG.A0m("GetCategoriesRequest{bizJid=%s, categoryIds=%s'}", C90524aI.A0x(this.A04, objArr, 1, 2));
    }

    public int hashCode() {
        return C90504aG.A0B(this.A03, C36351kA.A05(this.A04, (((C36391kE.A0A(this.A02) + this.A01) * 31) + this.A00) * 31));
    }
}
