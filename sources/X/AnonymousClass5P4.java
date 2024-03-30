package X;

/* renamed from: X.5P4  reason: invalid class name */
public final class AnonymousClass5P4 extends AnonymousClass5P5 {
    public final String errorMessage;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5P4) && AnonymousClass00C.A0J(this.errorMessage, ((AnonymousClass5P4) obj).errorMessage));
    }

    public int hashCode() {
        return C36341k9.A09(this.errorMessage);
    }

    public AnonymousClass5P4(String str) {
        this.errorMessage = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EligibilitySessionDataValidationError(errorMessage=");
        return C36321k7.A0E(this.errorMessage, A0u);
    }

    public AnonymousClass5P4() {
        this((String) null);
    }
}
