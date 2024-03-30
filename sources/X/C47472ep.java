package X;

/* renamed from: X.2ep  reason: invalid class name and case insensitive filesystem */
public final class C47472ep extends C55442ud {
    public final C135066c4 A00;
    public final AnonymousClass690 A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47472ep) {
                C47472ep r5 = (C47472ep) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36391kE.A0A(this.A01));
    }

    public C47472ep(AnonymousClass690 r1, C135066c4 r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AvatarSticker(stableId=");
        A0u.append(this.A01);
        A0u.append(", sticker=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
