package X;

/* renamed from: X.6CK  reason: invalid class name */
public final class AnonymousClass6CK {
    public final int A00;
    public final int A01;
    public final String A02;
    public final boolean A03;

    public AnonymousClass6CK(int i, int i2, String str, boolean z) {
        AnonymousClass00C.A0D(str, 1);
        this.A02 = str;
        this.A01 = i;
        this.A03 = z;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6CK) {
                AnonymousClass6CK r5 = (AnonymousClass6CK) obj;
                if (!(AnonymousClass00C.A0J(this.A02, r5.A02) && this.A01 == r5.A01 && this.A03 == r5.A03 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C36421kH.A04(this.A02) + this.A01) * 31) + C36341k9.A01(this.A03 ? 1 : 0)) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EmojiExpressionsSection(id=");
        A0u.append(this.A02);
        A0u.append(", icon=");
        A0u.append(this.A01);
        A0u.append(", selected=");
        A0u.append(this.A03);
        A0u.append(", accessibilityLabel=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
