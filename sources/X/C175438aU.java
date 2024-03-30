package X;

/* renamed from: X.8aU  reason: invalid class name and case insensitive filesystem */
public final class C175438aU extends AnonymousClass96Q {
    public final AnonymousClass011 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C175438aU) && AnonymousClass00C.A0J(this.A00, ((C175438aU) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C175438aU(AnonymousClass011 r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Success(value=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
