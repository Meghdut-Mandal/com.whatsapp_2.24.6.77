package X;

/* renamed from: X.3Hg  reason: invalid class name and case insensitive filesystem */
public final class C62713Hg {
    public final Object A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62713Hg) {
                C62713Hg r5 = (C62713Hg) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0J;
        int hashCode;
        Object obj = this.A00;
        if (obj instanceof Enum) {
            A0J = ((Enum) obj).ordinal();
        } else {
            A0J = AnonymousClass000.A0J(obj);
        }
        int i = A0J * 31;
        Object obj2 = this.A01;
        if (obj2 instanceof Enum) {
            hashCode = ((Enum) obj2).ordinal();
        } else {
            hashCode = obj2.hashCode();
        }
        return i + hashCode;
    }

    public C62713Hg(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("JoinedKey(left=");
        A0u.append(this.A00);
        A0u.append(", right=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
