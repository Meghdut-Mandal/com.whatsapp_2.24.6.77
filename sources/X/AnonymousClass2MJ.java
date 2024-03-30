package X;

/* renamed from: X.2MJ  reason: invalid class name */
public final class AnonymousClass2MJ extends C588731j {
    public String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2MJ) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass2MJ) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass2MJ(String str) {
        super(C51532ny.HEADER);
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("HeaderItem(text=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
