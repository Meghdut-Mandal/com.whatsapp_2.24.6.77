package X;

/* renamed from: X.6AE  reason: invalid class name */
public final class AnonymousClass6AE {
    public final C108115Sf A00;
    public final C121585tN A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6AE) {
                AnonymousClass6AE r5 = (AnonymousClass6AE) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A00) + AnonymousClass000.A0H(this.A01);
    }

    public AnonymousClass6AE(C108115Sf r1, C121585tN r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MetadataCacheReadResult(status=");
        A0u.append(this.A00);
        A0u.append(", metadata=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
