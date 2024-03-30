package X;

import java.util.Arrays;

/* renamed from: X.66Y  reason: invalid class name */
public class AnonymousClass66Y {
    public final C1271567e A00;
    public final AnonymousClass6TE A01;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass66Y)) {
            return false;
        }
        AnonymousClass66Y r4 = (AnonymousClass66Y) obj;
        if (this.A01 == r4.A01 && this.A00 == r4.A00) {
            return true;
        }
        return false;
    }

    public AnonymousClass66Y(C1271567e r1, AnonymousClass6TE r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A01;
        A0M[1] = this.A00;
        return Arrays.deepHashCode(A0M);
    }
}
