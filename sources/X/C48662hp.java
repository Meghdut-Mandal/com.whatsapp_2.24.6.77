package X;

/* renamed from: X.2hp  reason: invalid class name and case insensitive filesystem */
public final class C48662hp extends C55692v2 {
    public final long A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C48662hp) {
                C48662hp r8 = (C48662hp) obj;
                if (this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass000.A08(this.A00) * 31) + this.A01.hashCode();
    }

    public C48662hp(long j, String str) {
        this.A00 = j;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Error(errorCode=");
        A0u.append(this.A00);
        A0u.append(", errorMessage=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
