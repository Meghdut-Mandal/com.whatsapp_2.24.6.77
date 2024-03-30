package X;

/* renamed from: X.9VV  reason: invalid class name */
public final class AnonymousClass9VV {
    public final String A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9VV) {
                AnonymousClass9VV r5 = (AnonymousClass9VV) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36421kH.A04(this.A00) + C36341k9.A01(this.A01 ? 1 : 0);
    }

    public AnonymousClass9VV(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ProductBottomSheetErrorState(message=");
        A0u.append(this.A00);
        A0u.append(", showAsDialog=");
        return C36321k7.A0H(A0u, this.A01);
    }
}
