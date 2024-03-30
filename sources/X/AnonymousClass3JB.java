package X;

/* renamed from: X.3JB  reason: invalid class name */
public final class AnonymousClass3JB {
    public final C145166tS A00;
    public final C52492pW A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3JB) {
                AnonymousClass3JB r5 = (AnonymousClass3JB) obj;
                if (this.A01 != r5.A01 || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36391kE.A0A(this.A01) + AnonymousClass000.A0H(this.A00)) * 31) + C36421kH.A05(this.A02);
    }

    public AnonymousClass3JB(C145166tS r1, C52492pW r2, String str) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PreviewLoadingInfo(state=");
        A0u.append(this.A01);
        A0u.append(", webPageInfo=");
        A0u.append(this.A00);
        A0u.append(", host=");
        return C36321k7.A0E(this.A02, A0u);
    }
}
