package X;

import java.util.Date;

/* renamed from: X.6AD  reason: invalid class name */
public final class AnonymousClass6AD {
    public final int A00;
    public final Date A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6AD) {
                AnonymousClass6AD r5 = (AnonymousClass6AD) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A01) + this.A00;
    }

    public AnonymousClass6AD(Date date, int i) {
        this.A01 = date;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FlowsWebCleanUpScheduledState(date=");
        A0u.append(this.A01);
        A0u.append(", needsCleanUpAfterTarget=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
