package X;

/* renamed from: X.3HU  reason: invalid class name */
public final class AnonymousClass3HU {
    public final AnonymousClass00S A00;

    public AnonymousClass3HU(AnonymousClass00S r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass3HU) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass3HU) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UiState(onClick=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
