package X;

import java.util.Map;

/* renamed from: X.6AJ  reason: invalid class name */
public final class AnonymousClass6AJ {
    public final Map A00;
    public final Map A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6AJ) {
                AnonymousClass6AJ r5 = (AnonymousClass6AJ) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36391kE.A0A(this.A01));
    }

    public AnonymousClass6AJ(Map map, Map map2) {
        this.A01 = map;
        this.A00 = map2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MessageRanks(individualRanks=");
        A0u.append(this.A01);
        A0u.append(", groupRanks=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
