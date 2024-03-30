package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3In  reason: invalid class name and case insensitive filesystem */
public final class C63043In {
    public String A00 = null;
    public String A01 = null;
    public List A02;

    public C63043In() {
        ArrayList A0I = AnonymousClass001.A0I();
        this.A02 = A0I;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63043In) {
                C63043In r5 = (C63043In) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A02, ((C36341k9.A09(this.A00) * 31) + C36421kH.A05(this.A01)) * 31) + 1237;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Builder(searchabilityIntent=");
        A0u.append(this.A00);
        A0u.append(", searchabilityStatus=");
        A0u.append(this.A01);
        A0u.append(", issues=");
        A0u.append(this.A02);
        A0u.append(", isProfileEditDisabled=");
        return C36321k7.A0H(A0u, false);
    }
}
