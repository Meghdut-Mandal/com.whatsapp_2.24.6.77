package X;

/* renamed from: X.5IN  reason: invalid class name */
public final class AnonymousClass5IN extends C111385cC {
    public final C135066c4 A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5IN) {
                AnonymousClass5IN r5 = (AnonymousClass5IN) obj;
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

    public AnonymousClass5IN(C135066c4 r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Remote(stableId=");
        A0u.append(this.A01);
        A0u.append(", sticker=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
