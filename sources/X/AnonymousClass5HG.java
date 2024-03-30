package X;

import java.util.Arrays;

/* renamed from: X.5HG  reason: invalid class name */
public class AnonymousClass5HG extends C117735mk {
    public String A00 = "";

    public AnonymousClass5HG() {
        super(-2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass5HG)) {
            return false;
        }
        return C1901797e.A00(this.A00, ((AnonymousClass5HG) obj).A00);
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        AnonymousClass000.A1J(A0M, this.A00);
        AnonymousClass000.A1K(A0M, this.A00.hashCode());
        return Arrays.hashCode(A0M);
    }
}
