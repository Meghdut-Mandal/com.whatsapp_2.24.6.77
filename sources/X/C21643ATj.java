package X;

import java.util.List;

/* renamed from: X.ATj  reason: case insensitive filesystem */
public final class C21643ATj implements C87384Oo {
    public final String A00;
    public final String A01;
    public final List A02;
    public final AnonymousClass00T A03 = C36431kI.A1I(new C22183Ai6(this));

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C21643ATj) {
                C21643ATj aTj = (C21643ATj) obj;
                if (!AnonymousClass00C.A0J(this.A01, aTj.A01) || !AnonymousClass00C.A0J(this.A00, aTj.A00) || !AnonymousClass00C.A0J(this.A02, aTj.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A02, C36381kD.A08(this.A00, C36421kH.A04(this.A01)));
    }

    public C21643ATj(String str, String str2, List list) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BatchGetGroupInfoRequest(iqId=");
        A0u.append(this.A01);
        A0u.append(", context=");
        A0u.append(this.A00);
        A0u.append(", groupJids=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
