package X;

import java.util.List;

/* renamed from: X.3Hi  reason: invalid class name and case insensitive filesystem */
public final class C62733Hi {
    public final String A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62733Hi) {
                C62733Hi r5 = (C62733Hi) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A01, C36421kH.A04(this.A00)) + 1237;
    }

    public C62733Hi(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Section(section=");
        A0u.append(this.A00);
        A0u.append(", bots=");
        A0u.append(this.A01);
        A0u.append(", large=");
        return C36321k7.A0H(A0u, false);
    }
}
