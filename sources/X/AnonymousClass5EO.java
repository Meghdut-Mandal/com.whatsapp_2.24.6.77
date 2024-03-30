package X;

/* renamed from: X.5EO  reason: invalid class name */
public final class AnonymousClass5EO extends AnonymousClass5EQ {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5EO) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass5EO) obj).A00));
    }

    public AnonymousClass5EO(String str) {
        super(14);
        this.A00 = str;
    }

    public int hashCode() {
        return C36341k9.A09(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NoResultViewData(query=");
        return C36321k7.A0E(this.A00, A0u);
    }

    public AnonymousClass5EO() {
        this((String) null);
    }
}
