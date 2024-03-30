package X;

/* renamed from: X.69G  reason: invalid class name */
public final class AnonymousClass69G {
    public final int A00;
    public final AnonymousClass6OS A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass69G) {
                AnonymousClass69G r5 = (AnonymousClass69G) obj;
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

    public AnonymousClass69G(AnonymousClass6OS r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ImageVectorEntry(imageVector=");
        A0u.append(this.A01);
        A0u.append(", configFlags=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
