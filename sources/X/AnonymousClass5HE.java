package X;

import java.util.Arrays;

/* renamed from: X.5HE  reason: invalid class name */
public class AnonymousClass5HE extends C117735mk {
    public AnonymousClass5HE() {
        super(-1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass5HE)) {
            return false;
        }
        return C1901797e.A00(Integer.valueOf(this.A00), Integer.valueOf(((C117735mk) obj).A00));
    }

    public int hashCode() {
        Object[] A0L = AnonymousClass001.A0L();
        AnonymousClass000.A1J(A0L, this.A00);
        return Arrays.hashCode(A0L);
    }
}
