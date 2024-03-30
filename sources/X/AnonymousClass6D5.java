package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.6D5  reason: invalid class name */
public final class AnonymousClass6D5 {
    public final C128736Dk A00;
    public final List A01;
    public final List A02;
    public final Map A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6D5) {
                AnonymousClass6D5 r5 = (AnonymousClass6D5) obj;
                if (this.A04 != r5.A04 || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A02, C36351kA.A05(this.A03, C36351kA.A05(this.A01, C36341k9.A01(this.A04 ? 1 : 0) * 31))) + AnonymousClass000.A0H(this.A00);
    }

    public AnonymousClass6D5(C128736Dk r1, List list, List list2, Map map, boolean z) {
        this.A04 = z;
        this.A01 = list;
        this.A03 = map;
        this.A02 = list2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EligibilityCheckResult(isAccountLinked=");
        A0u.append(this.A04);
        A0u.append(", destinationList=");
        A0u.append(this.A01);
        A0u.append(", crosspostedStateMap=");
        A0u.append(this.A03);
        A0u.append(", uniqueIdList=");
        A0u.append(this.A02);
        A0u.append(", purposeEncryptionParams=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
