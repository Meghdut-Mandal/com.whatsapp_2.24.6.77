package X;

/* renamed from: X.2am  reason: invalid class name and case insensitive filesystem */
public final class C46692am extends C55092u3 {
    public final AnonymousClass3X9 A00;

    public C46692am(AnonymousClass3X9 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C46692am) && AnonymousClass00C.A0J(this.A00, ((C46692am) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ReviewDataItem(newsletterAppeal=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
