package X;

/* renamed from: X.9Vd  reason: invalid class name and case insensitive filesystem */
public final class C195619Vd {
    public final int A00;
    public final C21197ACf A01;

    public C195619Vd(C21197ACf aCf, int i) {
        AnonymousClass00C.A0D(aCf, 2);
        this.A00 = i;
        this.A01 = aCf;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195619Vd) {
                C195619Vd r5 = (C195619Vd) obj;
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
        A0u.append("E2eMessageParserInfo(messageType=");
        A0u.append(this.A00);
        A0u.append(", parser=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
