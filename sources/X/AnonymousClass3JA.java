package X;

/* renamed from: X.3JA  reason: invalid class name */
public final class AnonymousClass3JA {
    public final C51772oM A00;
    public final Long A01;
    public final Object A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3JA) {
                AnonymousClass3JA r5 = (AnonymousClass3JA) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36391kE.A0A(this.A00) + AnonymousClass000.A0H(this.A02)) * 31) + C36411kG.A09(this.A01);
    }

    public AnonymousClass3JA(C51772oM r1, Long l, Object obj) {
        this.A00 = r1;
        this.A02 = obj;
        this.A01 = l;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ResultStatus(type=");
        A0u.append(this.A00);
        A0u.append(", data=");
        A0u.append(this.A02);
        A0u.append(", errorCode=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
