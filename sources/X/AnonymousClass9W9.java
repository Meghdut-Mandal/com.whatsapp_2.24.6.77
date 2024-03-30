package X;

/* renamed from: X.9W9  reason: invalid class name */
public final class AnonymousClass9W9 {
    public final AnonymousClass3T1 A00;
    public final int A01;
    public final C019108d A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9W9) {
                AnonymousClass9W9 r5 = (AnonymousClass9W9) obj;
                if (this.A01 != r5.A01 || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36351kA.A05(this.A02, this.A01 * 31));
    }

    public AnonymousClass9W9(AnonymousClass3T1 r1, C019108d r2, int i) {
        this.A01 = i;
        this.A02 = r2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ParsingResult(messageType=");
        A0u.append(this.A01);
        A0u.append(", parser=");
        A0u.append(this.A02);
        A0u.append(", parsedMessage=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
