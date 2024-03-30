package X;

/* renamed from: X.5DK  reason: invalid class name */
public final class AnonymousClass5DK extends C108645Ui {
    public final String reason;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5DK) && AnonymousClass00C.A0J(this.reason, ((AnonymousClass5DK) obj).reason));
    }

    public int hashCode() {
        return this.reason.hashCode();
    }

    public AnonymousClass5DK(String str) {
        this.reason = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ModelNotFound(reason=");
        return C36321k7.A0E(this.reason, A0u);
    }
}
