package X;

/* renamed from: X.57E  reason: invalid class name */
public final class AnonymousClass57E extends C110875bN {
    public final C128586Cv A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass57E) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass57E) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass57E(C128586Cv r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AddMedia(addMediaParams=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
