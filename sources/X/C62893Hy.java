package X;

import java.util.List;

/* renamed from: X.3Hy  reason: invalid class name and case insensitive filesystem */
public final class C62893Hy {
    public final List A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62893Hy) {
                C62893Hy r5 = (C62893Hy) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36421kH.A04(this.A01));
    }

    public C62893Hy(String str, List list) {
        this.A01 = str;
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SubgroupSuggestions(view=");
        A0u.append(this.A01);
        A0u.append(", suggestions=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
