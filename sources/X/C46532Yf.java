package X;

/* renamed from: X.2Yf  reason: invalid class name and case insensitive filesystem */
public final class C46532Yf extends C54872th {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C46532Yf) && AnonymousClass00C.A0J(this.A00, ((C46532Yf) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C46532Yf(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SectionHeaderDataItem(title=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
