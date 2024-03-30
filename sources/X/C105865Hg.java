package X;

/* renamed from: X.5Hg  reason: invalid class name and case insensitive filesystem */
public final class C105865Hg extends C111355c9 {
    public final Object A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C105865Hg) && AnonymousClass00C.A0J(this.A00, ((C105865Hg) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass000.A0H(this.A00);
    }

    public C105865Hg(Object obj) {
        this.A00 = obj;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Success(data=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
