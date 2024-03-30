package X;

/* renamed from: X.2ho  reason: invalid class name and case insensitive filesystem */
public final class C48652ho extends C55692v2 {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C48652ho) && AnonymousClass00C.A0J(this.A00, ((C48652ho) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C48652ho(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Success(username=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
