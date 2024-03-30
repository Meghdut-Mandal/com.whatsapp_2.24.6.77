package X;

/* renamed from: X.2ak  reason: invalid class name and case insensitive filesystem */
public final class C46672ak extends C55092u3 {
    public final C55082u2 A00;

    public C46672ak(C55082u2 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C46672ak) && AnonymousClass00C.A0J(this.A00, ((C46672ak) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AlertDataItem(newsletterAlert=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
