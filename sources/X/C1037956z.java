package X;

/* renamed from: X.56z  reason: invalid class name and case insensitive filesystem */
public final class C1037956z extends C110845bK {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1037956z) && AnonymousClass00C.A0J(this.A00, ((C1037956z) obj).A00));
    }

    public int hashCode() {
        return C36341k9.A09(this.A00);
    }

    public C1037956z(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Failure(errorMessage=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
