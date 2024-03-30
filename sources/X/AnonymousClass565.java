package X;

/* renamed from: X.565  reason: invalid class name */
public final class AnonymousClass565 extends C125385zp {
    public final C125415zs A00;
    public final String A01;

    public AnonymousClass565(C125415zs r2, String str) {
        AnonymousClass00C.A0D(str, 1);
        this.A01 = str;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass565) {
                AnonymousClass565 r5 = (AnonymousClass565) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36421kH.A04(this.A01));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AvatarStickerCategory(id=");
        A0u.append(this.A01);
        A0u.append(", category=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
