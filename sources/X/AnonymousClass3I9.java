package X;

/* renamed from: X.3I9  reason: invalid class name */
public final class AnonymousClass3I9 {
    public final int A00;
    public final AnonymousClass2bV A01;

    public AnonymousClass3I9(AnonymousClass2bV r2, int i) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3I9) {
                AnonymousClass3I9 r5 = (AnonymousClass3I9) obj;
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

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PluginCarouselItem(message=");
        A0u.append(this.A01);
        A0u.append(", carouselCount=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
