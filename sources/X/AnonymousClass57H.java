package X;

/* renamed from: X.57H  reason: invalid class name */
public final class AnonymousClass57H extends C110875bN {
    public final AnonymousClass6DZ A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass57H) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass57H) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass57H(AnonymousClass6DZ r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MediaUploadSuccess(uploadSuccessParams=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
