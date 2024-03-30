package X;

import java.util.Map;

/* renamed from: X.6PG  reason: invalid class name */
public final class AnonymousClass6PG {
    public static final AnonymousClass6SY A03 = new AnonymousClass6SY();
    public final Map A00;
    public final Map A01;
    public final Map A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6PG) {
                AnonymousClass6PG r5 = (AnonymousClass6PG) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36351kA.A05(this.A00, C36391kE.A0A(this.A02)));
    }

    public AnonymousClass6PG(Map map, Map map2, Map map3) {
        this.A02 = map;
        this.A00 = map2;
        this.A01 = map3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FlowsCompatibility(welj=");
        A0u.append(this.A02);
        A0u.append(", dataChannel=");
        A0u.append(this.A00);
        A0u.append(", flowMessage=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
