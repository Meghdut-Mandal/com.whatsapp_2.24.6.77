package X;

import java.util.Set;

/* renamed from: X.3EK  reason: invalid class name */
public final class AnonymousClass3EK {
    public final Set A00;
    public final Set A01;
    public final Set A02;
    public final Set A03;

    public AnonymousClass3EK(Set set, Set set2, Set set3, Set set4) {
        C36321k7.A18(set, set2, set3, set4);
        this.A01 = set;
        this.A02 = set2;
        this.A00 = set3;
        this.A03 = set4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("sending = ");
        A0u.append(this.A02.size());
        A0u.append(", send = ");
        A0u.append(this.A03.size());
        A0u.append(", deleting = ");
        A0u.append(this.A00.size());
        A0u.append(", failed = ");
        return C36381kD.A10(A0u, this.A01.size());
    }
}
