package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.6Bw  reason: invalid class name and case insensitive filesystem */
public final class C128346Bw {
    public final String A00;
    public final Map A01;
    public final Set A02;
    public final Set A03;

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C128346Bw) {
            C128346Bw r5 = (C128346Bw) obj;
            if (AnonymousClass00C.A0J(this.A00, r5.A00) && AnonymousClass00C.A0J(this.A01, r5.A01) && AnonymousClass00C.A0J(this.A02, r5.A02)) {
                Set set2 = this.A03;
                if (set2 == null || (set = r5.A03) == null) {
                    return true;
                }
                return set2.equals(set);
            }
        }
        return false;
    }

    public int hashCode() {
        return C36401kF.A02(this.A02, C36351kA.A05(this.A01, C36421kH.A04(this.A00)));
    }

    public C128346Bw(String str, Map map, Set set, Set set2) {
        this.A00 = str;
        this.A01 = map;
        this.A02 = set;
        this.A03 = set2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TableInfo{name='");
        A0u.append(this.A00);
        A0u.append("', columns=");
        A0u.append(this.A01);
        A0u.append(", foreignKeys=");
        A0u.append(this.A02);
        A0u.append(", indices=");
        return C90464aC.A0X(this.A03, A0u);
    }
}
