package X;

import java.util.List;

/* renamed from: X.69o  reason: invalid class name and case insensitive filesystem */
public final class C1277669o {
    public final List A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1277669o) {
                C1277669o r5 = (C1277669o) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A00) + C36341k9.A01(this.A01 ? 1 : 0);
    }

    public C1277669o(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BusinessSearchResponsePayload(businessProfiles=");
        A0u.append(this.A00);
        A0u.append(", hasMoreBusiness=");
        return C36321k7.A0H(A0u, this.A01);
    }
}
