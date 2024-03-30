package X;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.6Cq  reason: invalid class name and case insensitive filesystem */
public final class C128536Cq {
    public int A00;
    public final C1277269k A01;
    public final C124875yw A02;
    public final String A03;
    public final Set A04;

    public /* synthetic */ C128536Cq(C1277269k r5, String str, int i) {
        C124875yw r2 = null;
        LinkedHashSet A17 = (i & 4) != 0 ? C36441kJ.A17() : null;
        r5 = (i & 8) != 0 ? null : r5;
        r2 = (i & 16) != 0 ? new C1265664n().A00() : r2;
        C36321k7.A0y(str, A17);
        AnonymousClass00C.A0D(r2, 5);
        this.A03 = str;
        this.A00 = 0;
        this.A04 = A17;
        this.A01 = r5;
        this.A02 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128536Cq) {
                C128536Cq r5 = (C128536Cq) obj;
                if (!AnonymousClass00C.A0J(this.A03, r5.A03) || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Set set = this.A04;
        return C36401kF.A02(this.A02, (C36351kA.A05(set, (C36421kH.A04(this.A03) + this.A00) * 31) + AnonymousClass000.A0H(this.A01)) * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TextSearchResult(query=");
        A0u.append(this.A03);
        A0u.append(", statusCode=");
        A0u.append(this.A00);
        A0u.append(", fulfilledRequests=");
        A0u.append(this.A04);
        A0u.append(", recentSearch=");
        A0u.append(this.A01);
        A0u.append(", response=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
