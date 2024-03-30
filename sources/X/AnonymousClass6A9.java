package X;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.6A9  reason: invalid class name */
public final class AnonymousClass6A9 {
    public final LinkedHashSet A00;
    public final Set A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6A9) {
                AnonymousClass6A9 r5 = (AnonymousClass6A9) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36391kE.A0A(this.A00));
    }

    public AnonymousClass6A9(LinkedHashSet linkedHashSet, Set set) {
        this.A00 = linkedHashSet;
        this.A01 = set;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UnsentCrosspostingSession(messageRowIds=");
        A0u.append(this.A00);
        A0u.append(", destinationAppList=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
