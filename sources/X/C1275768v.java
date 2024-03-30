package X;

/* renamed from: X.68v  reason: invalid class name and case insensitive filesystem */
public final class C1275768v {
    public final AnonymousClass5SH A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1275768v) && this.A00 == ((C1275768v) obj).A00);
    }

    public int hashCode() {
        return C36391kE.A0A(this.A00) + 1237;
    }

    public C1275768v(AnonymousClass5SH r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ParseHistorySyncParams(historySyncUsage=");
        A0u.append(this.A00);
        A0u.append(", strictMode=");
        return C36321k7.A0H(A0u, false);
    }
}
