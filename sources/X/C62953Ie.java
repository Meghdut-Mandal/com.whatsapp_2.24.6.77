package X;

import java.util.List;

/* renamed from: X.3Ie  reason: invalid class name and case insensitive filesystem */
public final class C62953Ie {
    public String A00;
    public List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62953Ie) {
                C62953Ie r5 = (C62953Ie) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36421kH.A04(this.A00));
    }

    public C62953Ie(String str, List list) {
        C36321k7.A0x(str, list);
        this.A00 = str;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ChangeNumberContacts(oldJid=");
        A0u.append(this.A00);
        A0u.append(", notifyJids=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
