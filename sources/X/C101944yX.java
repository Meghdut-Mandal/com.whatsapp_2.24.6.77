package X;

import java.util.Arrays;

/* renamed from: X.4yX  reason: invalid class name and case insensitive filesystem */
public final class C101944yX extends C109815Zf {
    public final int A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && C36381kD.A1Y(this, obj) && this.A00 == ((C101944yX) obj).A00;
        }
        return true;
    }

    public C101944yX(int i) {
        this.A00 = i;
    }

    public int hashCode() {
        Object[] A0L = AnonymousClass001.A0L();
        AnonymousClass000.A1J(A0L, this.A00);
        return Arrays.hashCode(A0L);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NoParamsStatusMessage{type=");
        A0u.append(this.A00);
        return AnonymousClass000.A0s(A0u);
    }
}
