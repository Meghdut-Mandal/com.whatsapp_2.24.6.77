package X;

/* renamed from: X.57F  reason: invalid class name */
public final class AnonymousClass57F extends C110875bN {
    public final AnonymousClass6AH A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass57F) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass57F) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass57F(AnonymousClass6AH r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MediaUploadFailed(uploadFailedParams=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
