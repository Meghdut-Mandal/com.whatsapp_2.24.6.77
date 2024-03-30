package X;

/* renamed from: X.5P3  reason: invalid class name */
public final class AnonymousClass5P3 extends AnonymousClass5P5 {
    public final String errorMessage;

    public AnonymousClass5P3(String str) {
        this.errorMessage = null;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5P3) && AnonymousClass00C.A0J(this.errorMessage, ((AnonymousClass5P3) obj).errorMessage));
    }

    public int hashCode() {
        return C36341k9.A09(this.errorMessage);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EligibilityPurposeEncryptionValidationError(errorMessage=");
        return C36321k7.A0E(this.errorMessage, A0u);
    }

    public AnonymousClass5P3() {
        this((String) null);
    }
}
