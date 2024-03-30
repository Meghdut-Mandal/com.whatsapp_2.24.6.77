package X;

/* renamed from: X.4xV  reason: invalid class name and case insensitive filesystem */
public final class C101404xV extends C101414xW {
    public final Integer A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C101404xV) {
                C101404xV r5 = (C101404xV) obj;
                if (this.A01 != r5.A01 || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C36341k9.A01(this.A01 ? 1 : 0) * 31) + AnonymousClass000.A0H(this.A00);
    }

    public C101404xV(Integer num, boolean z) {
        this.A01 = z;
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Loading(isSelected=");
        A0u.append(this.A01);
        A0u.append(", ringColor=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }

    public C101404xV() {
        this((Integer) null, false);
    }
}
