package X;

/* renamed from: X.5Kn  reason: invalid class name and case insensitive filesystem */
public final class C106605Kn extends C1267165e {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public C106605Kn(int i, int i2, String str, String str2) {
        AnonymousClass00C.A0D(str2, 4);
        this.A01 = i;
        this.A03 = str;
        this.A00 = i2;
        this.A02 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C106605Kn) {
                C106605Kn r5 = (C106605Kn) obj;
                if (this.A01 != r5.A01 || !AnonymousClass00C.A0J(this.A03, r5.A03) || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.A01 * 31;
        return C90504aG.A0B(this.A02, (C36381kD.A08(this.A03, i) + this.A00) * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AvatarStickerHeaderIconItem(index=");
        A0u.append(this.A01);
        A0u.append(", pageId=");
        A0u.append(this.A03);
        A0u.append(", icon=");
        A0u.append(this.A00);
        A0u.append(", accessibilityLabel=");
        return C36321k7.A0E(this.A02, A0u);
    }
}
