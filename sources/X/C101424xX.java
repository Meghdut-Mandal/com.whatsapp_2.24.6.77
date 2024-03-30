package X;

/* renamed from: X.4xX  reason: invalid class name and case insensitive filesystem */
public final class C101424xX extends AnonymousClass5ZY {
    public final int A00;
    public final int A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C101424xX) {
                C101424xX r5 = (C101424xX) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A03 == r5.A03 && AnonymousClass00C.A0J(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90504aG.A0B(this.A02, ((((this.A00 * 31) + this.A01) * 31) + C36341k9.A01(this.A03 ? 1 : 0)) * 31);
    }

    public C101424xX(int i, int i2, String str, boolean z) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = z;
        this.A02 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AvatarBackground(backgroundColor=");
        A0u.append(this.A00);
        A0u.append(", ringColor=");
        A0u.append(this.A01);
        A0u.append(", isSelected=");
        A0u.append(this.A03);
        A0u.append(", contentDescription=");
        return C36321k7.A0E(this.A02, A0u);
    }
}
