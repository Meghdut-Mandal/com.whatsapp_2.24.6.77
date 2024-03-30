package X;

/* renamed from: X.551  reason: invalid class name */
public final class AnonymousClass551 extends C110605aw {
    public final AnonymousClass3XU A00;

    public AnonymousClass551(AnonymousClass3XU r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass551) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass551) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("OnGifSelected(result=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
