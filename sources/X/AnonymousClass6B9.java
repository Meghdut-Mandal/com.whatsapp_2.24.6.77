package X;

import java.util.Map;

/* renamed from: X.6B9  reason: invalid class name */
public final class AnonymousClass6B9 {
    public final Map A00;
    public final Map A01;
    public final String A02;

    public AnonymousClass6B9(String str, Map map, Map map2) {
        AnonymousClass00C.A0D(str, 1);
        this.A02 = str;
        this.A00 = map;
        this.A01 = map2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6B9) {
                AnonymousClass6B9 r5 = (AnonymousClass6B9) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36351kA.A05(this.A00, C36421kH.A04(this.A02)));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AIBotEmbodimentStateData(state=");
        A0u.append(this.A02);
        A0u.append(", actions=");
        A0u.append(this.A00);
        A0u.append(", transitions=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
