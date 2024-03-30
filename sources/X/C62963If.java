package X;

/* renamed from: X.3If  reason: invalid class name and case insensitive filesystem */
public final class C62963If {
    public final int A00;
    public final String A01;

    public C62963If(int i, String str) {
        AnonymousClass00C.A0D(str, 2);
        this.A00 = i;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62963If) {
                C62963If r5 = (C62963If) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ErrorData(errorCode=");
        A0u.append(this.A00);
        A0u.append(", errorDescription=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
