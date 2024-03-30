package X;

import java.util.Map;

/* renamed from: X.6Bl  reason: invalid class name and case insensitive filesystem */
public final class C128236Bl {
    public final Map A00;
    public final boolean A01;
    public final Integer A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128236Bl) {
                C128236Bl r5 = (C128236Bl) obj;
                if (this.A01 != r5.A01 || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, ((C36341k9.A01(this.A01 ? 1 : 0) * 31) + AnonymousClass000.A0H(this.A02)) * 31);
    }

    public C128236Bl(Integer num, Map map, boolean z) {
        this.A01 = z;
        this.A02 = num;
        this.A00 = map;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CrosspostRequestResult(isAccountLinkingStatusValid=");
        A0u.append(this.A01);
        A0u.append(", tosId=");
        A0u.append(this.A02);
        A0u.append(", destinationResultMap=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
