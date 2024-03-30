package X;

import java.util.List;

/* renamed from: X.6AW  reason: invalid class name */
public final class AnonymousClass6AW {
    public final int A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6AW) {
                AnonymousClass6AW r5 = (AnonymousClass6AW) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, this.A00 * 31);
    }

    public AnonymousClass6AW(int i, List list) {
        this.A00 = i;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PrivacyDisclosureFlow(disclosureId=");
        A0u.append(this.A00);
        A0u.append(", prompts=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
