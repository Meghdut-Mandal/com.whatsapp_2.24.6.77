package X;

/* renamed from: X.5Ir  reason: invalid class name and case insensitive filesystem */
public final class C106185Ir extends C111455cJ {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C106185Ir) && AnonymousClass00C.A0J(this.A00, ((C106185Ir) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C106185Ir(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Success(fileUri=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
