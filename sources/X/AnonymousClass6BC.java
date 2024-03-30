package X;

import java.util.List;

/* renamed from: X.6BC  reason: invalid class name */
public final class AnonymousClass6BC {
    public final String A00;
    public final String A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6BC) {
                AnonymousClass6BC r5 = (AnonymousClass6BC) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A02, C36381kD.A08(this.A01, C36421kH.A04(this.A00)));
    }

    public AnonymousClass6BC(String str, String str2, List list) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Section(name=");
        A0u.append(this.A00);
        A0u.append(", type=");
        A0u.append(this.A01);
        A0u.append(", bots=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
