package X;

/* renamed from: X.68m  reason: invalid class name and case insensitive filesystem */
public final class C1274868m {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1274868m) && AnonymousClass00C.A0J(this.A00, ((C1274868m) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C1274868m(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PageInfo(endCursor=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
