package X;

import java.util.Map;

/* renamed from: X.9Wh  reason: invalid class name and case insensitive filesystem */
public final class C195849Wh {
    public C187888yh A00;
    public final String A01;
    public final Map A02;
    public final Map A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195849Wh) {
                C195849Wh r5 = (C195849Wh) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A03, C36351kA.A05(this.A00, (C36421kH.A04(this.A01) + AnonymousClass000.A0H(this.A02)) * 31));
    }

    public C195849Wh(C187888yh r1, String str, Map map, Map map2) {
        this.A01 = str;
        this.A02 = map;
        this.A00 = r1;
        this.A03 = map2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StateData(stateName=");
        A0u.append(this.A01);
        A0u.append(", input=");
        A0u.append(this.A02);
        A0u.append(", status=");
        A0u.append(this.A00);
        A0u.append(", resumableBloksData=");
        return AnonymousClass000.A0m(this.A03, A0u);
    }
}
