package X;

/* renamed from: X.9Vc  reason: invalid class name and case insensitive filesystem */
public final class C195609Vc {
    public final int A00;
    public final C21196ACe A01;

    public C195609Vc(C21196ACe aCe, int i) {
        AnonymousClass00C.A0D(aCe, 2);
        this.A00 = i;
        this.A01 = aCe;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195609Vc) {
                C195609Vc r5 = (C195609Vc) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, this.A00 * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CustomMessageParserInfo(messageType=");
        A0u.append(this.A00);
        A0u.append(", parser=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
