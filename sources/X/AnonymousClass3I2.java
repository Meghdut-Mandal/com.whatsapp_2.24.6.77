package X;

import java.util.Set;

/* renamed from: X.3I2  reason: invalid class name */
public final class AnonymousClass3I2 {
    public final Set A00;
    public final AnonymousClass00S A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3I2) {
                AnonymousClass3I2 r5 = (AnonymousClass3I2) obj;
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

    public AnonymousClass3I2(Set set, AnonymousClass00S r2) {
        this.A00 = set;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CommunitySuspendActionModeUiState(selectedJids=");
        A0u.append(this.A00);
        A0u.append(", clear=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
