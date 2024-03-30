package X;

/* renamed from: X.4vC  reason: invalid class name and case insensitive filesystem */
public final class C100544vC extends AnonymousClass66B {
    public final Throwable A00;
    public final C118825on A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C100544vC) {
                C100544vC r5 = (C100544vC) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36351kA.A05(this.A00, C36421kH.A04(this.A02)));
    }

    public C100544vC(C118825on r1, String str, Throwable th) {
        super(r1, str);
        this.A02 = str;
        this.A00 = th;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Failure(key=");
        A0u.append(this.A02);
        A0u.append(", exception=");
        A0u.append(this.A00);
        A0u.append(", summary=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
