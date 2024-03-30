package X;

/* renamed from: X.68j  reason: invalid class name and case insensitive filesystem */
public final class C1274568j {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1274568j) && AnonymousClass00C.A0J(this.A00, ((C1274568j) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C1274568j(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Image(uri=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
