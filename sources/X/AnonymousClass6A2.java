package X;

/* renamed from: X.6A2  reason: invalid class name */
public final class AnonymousClass6A2 {
    public final C107865Re A00;
    public final C108085Sc A01;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6A2) && this.A01 == ((AnonymousClass6A2) obj).A01);
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36391kE.A0A(this.A00));
    }

    public AnonymousClass6A2(C107865Re r1, C108085Sc r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CallTooltipState(useCase=");
        A0u.append(this.A00);
        A0u.append(", stage=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
