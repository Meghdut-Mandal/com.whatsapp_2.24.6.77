package X;

/* renamed from: X.5Km  reason: invalid class name and case insensitive filesystem */
public final class C106595Km extends C1267165e {
    public final int A00;
    public final String A01;
    public final String A02;

    public C106595Km(int i, String str, String str2) {
        AnonymousClass00C.A0D(str2, 3);
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C106595Km) {
                C106595Km r5 = (C106595Km) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90504aG.A0B(this.A02, C36381kD.A08(this.A01, this.A00 * 31));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AvatarStickerHeaderTextItem(index=");
        A0u.append(this.A00);
        A0u.append(", pageId=");
        A0u.append(this.A01);
        A0u.append(", title=");
        return C36321k7.A0E(this.A02, A0u);
    }
}
