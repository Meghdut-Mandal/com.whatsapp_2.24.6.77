package X;

/* renamed from: X.3Id  reason: invalid class name and case insensitive filesystem */
public final class C62943Id {
    public final int A00;
    public final Boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62943Id) {
                C62943Id r5 = (C62943Id) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + AnonymousClass000.A0H(this.A01);
    }

    public C62943Id(Boolean bool, int i) {
        this.A00 = i;
        this.A01 = bool;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EphemeralAdditionalInfo(trigger=");
        A0u.append(this.A00);
        A0u.append(", initiatedByMe=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
