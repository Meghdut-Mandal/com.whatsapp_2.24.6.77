package X;

/* renamed from: X.3JM  reason: invalid class name */
public final class AnonymousClass3JM {
    public long A00;
    public C52132ow A01;
    public final C195759Vv A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3JM) {
                AnonymousClass3JM r8 = (AnonymousClass3JM) obj;
                if (!(AnonymousClass00C.A0J(this.A02, r8.A02) && this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36321k7.A00(this.A00, AnonymousClass000.A0H(this.A02) * 31));
    }

    public AnonymousClass3JM(C52132ow r1, C195759Vv r2, long j) {
        this.A02 = r2;
        this.A00 = j;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ParentAssociationInfo(parentMessageKey=");
        A0u.append(this.A02);
        A0u.append(", parentMessageRowId=");
        A0u.append(this.A00);
        A0u.append(", associationType=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
