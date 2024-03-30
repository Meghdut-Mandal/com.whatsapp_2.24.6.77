package X;

import java.util.Map;

/* renamed from: X.6Be  reason: invalid class name and case insensitive filesystem */
public final class C128166Be {
    public final String A00;
    public final String A01;
    public final Map A02;

    public C128166Be(String str, String str2, Map map) {
        AnonymousClass00C.A0D(str, 1);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = map;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128166Be) {
                C128166Be r5 = (C128166Be) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36421kH.A04(this.A00) + C36341k9.A09(this.A01)) * 31) + C36411kG.A09(this.A02);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PhoenixRequestNode(config=");
        A0u.append(this.A00);
        A0u.append(", state=");
        A0u.append(this.A01);
        A0u.append(", params=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
