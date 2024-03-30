package X;

/* renamed from: X.2Y5  reason: invalid class name */
public final class AnonymousClass2Y5 extends C54792tY {
    public final String A00;

    public AnonymousClass2Y5(String str) {
        AnonymousClass00C.A0D(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2Y5) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass2Y5) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NoResults(query=");
        return C36321k7.A0E(this.A00, A0u);
    }

    public AnonymousClass2Y5() {
        this("");
    }
}
