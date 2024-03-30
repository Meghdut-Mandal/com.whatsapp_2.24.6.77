package X;

import java.util.Map;

/* renamed from: X.6Ci  reason: invalid class name and case insensitive filesystem */
public final class C128456Ci {
    public final AnonymousClass69R A00;
    public final AnonymousClass72B A01;
    public final String A02;
    public final String A03;
    public final Map A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128456Ci) {
                C128456Ci r5 = (C128456Ci) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36381kD.A08(this.A03, C36351kA.A05(this.A04, C36381kD.A08(this.A02, C36391kE.A0A(this.A00)))) + AnonymousClass000.A0H(this.A01);
    }

    public C128456Ci(AnonymousClass69R r1, AnonymousClass72B r2, String str, String str2, Map map) {
        this.A00 = r1;
        this.A02 = str;
        this.A04 = map;
        this.A03 = str2;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BloksBatchedComponentQueryParseResult(componentParseResult=");
        A0u.append(this.A00);
        A0u.append(", appId=");
        A0u.append(this.A02);
        A0u.append(", consumedParams=");
        A0u.append(this.A04);
        A0u.append(", rawComponentPayload=");
        A0u.append(this.A03);
        A0u.append(", resources=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
