package X;

/* renamed from: X.53G  reason: invalid class name */
public final class AnonymousClass53G extends C116975lV {
    public final AnonymousClass141 A00;
    public final AnonymousClass171 A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass53G) {
                AnonymousClass53G r5 = (AnonymousClass53G) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36391kE.A0A(this.A00));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass53G(X.AnonymousClass171 r4, X.AnonymousClass141 r5) {
        /*
            r3 = this;
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
            java.lang.String r1 = r4.A0H(r5)
            r0 = 0
            r2[r0] = r1
            r0 = 2131890862(0x7f1212ae, float:1.9416428E38)
            X.2ft r0 = X.C90524aI.A0O(r2, r0)
            r3.<init>(r0)
            r3.A00 = r5
            r3.A01 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass53G.<init>(X.171, X.141):void");
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RecentlyJoinedUser(contact=");
        A0u.append(this.A00);
        A0u.append(", contactNames=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
