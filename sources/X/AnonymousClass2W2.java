package X;

/* renamed from: X.2W2  reason: invalid class name */
public final class AnonymousClass2W2 extends C54562t9 {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2W2) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass2W2) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass2W2(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Error(errorMessage=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
