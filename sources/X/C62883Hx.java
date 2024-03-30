package X;

/* renamed from: X.3Hx  reason: invalid class name and case insensitive filesystem */
public final class C62883Hx {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62883Hx) {
                C62883Hx r5 = (C62883Hx) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public C62883Hx(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SuggestionsListData(titleStringId=");
        A0u.append(this.A01);
        A0u.append(", count=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
