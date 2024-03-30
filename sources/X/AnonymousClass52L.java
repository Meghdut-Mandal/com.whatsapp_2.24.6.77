package X;

/* renamed from: X.52L  reason: invalid class name */
public final class AnonymousClass52L extends C110285aQ {
    public final String A00;

    public AnonymousClass52L(String str) {
        AnonymousClass00C.A0D(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass52L) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass52L) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RequestingConsent(productSessionId=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
