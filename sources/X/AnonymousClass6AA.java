package X;

/* renamed from: X.6AA  reason: invalid class name */
public final class AnonymousClass6AA {
    public final C1275268q A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6AA) {
                AnonymousClass6AA r5 = (AnonymousClass6AA) obj;
                if (this.A01 != r5.A01 || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36341k9.A01(this.A01 ? 1 : 0) * 31);
    }

    public AnonymousClass6AA(C1275268q r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EmojiCacheKey(hasStroke=");
        A0u.append(this.A01);
        A0u.append(", emojiIdList=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
