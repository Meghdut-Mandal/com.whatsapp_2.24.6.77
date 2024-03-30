package X;

import java.util.Set;

/* renamed from: X.6AU  reason: invalid class name */
public final class AnonymousClass6AU {
    public final String A00;
    public final Set A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6AU) {
                AnonymousClass6AU r5 = (AnonymousClass6AU) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36341k9.A09(this.A00) * 31);
    }

    public AnonymousClass6AU(String str, Set set) {
        this.A00 = str;
        this.A01 = set;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UserListData(dHash=");
        A0u.append(this.A00);
        A0u.append(", userList=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
