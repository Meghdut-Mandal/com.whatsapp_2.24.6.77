package X;

/* renamed from: X.57G  reason: invalid class name */
public final class AnonymousClass57G extends C110875bN {
    public final AnonymousClass6BR A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass57G) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass57G) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass57G(AnonymousClass6BR r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MediaUploadProgress(uploadProgressParams=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
