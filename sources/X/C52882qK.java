package X;

/* renamed from: X.2qK  reason: invalid class name and case insensitive filesystem */
public final class C52882qK extends Exception {
    public final C52412pO error;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C52882qK) && this.error == ((C52882qK) obj).error);
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    public C52882qK(C52412pO r1) {
        this.error = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CancelRequestParticipantError(error=");
        return AnonymousClass000.A0m(this.error, A0u);
    }
}
