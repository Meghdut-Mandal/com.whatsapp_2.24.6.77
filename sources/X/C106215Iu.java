package X;

/* renamed from: X.5Iu  reason: invalid class name and case insensitive filesystem */
public final class C106215Iu extends C111465cK {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C106215Iu) && AnonymousClass00C.A0J(this.A00, ((C106215Iu) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C106215Iu(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Success(fileUri=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
