package X;

/* renamed from: X.0Uh  reason: invalid class name and case insensitive filesystem */
public final class C06610Uh {
    public final String A00;
    public final C15020mZ A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C06610Uh) {
                C06610Uh r5 = (C06610Uh) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public C06610Uh(String str, C15020mZ r2) {
        this.A00 = str;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MatchGroup(value=");
        A0u.append(this.A00);
        A0u.append(", range=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
