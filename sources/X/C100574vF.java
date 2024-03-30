package X;

/* renamed from: X.4vF  reason: invalid class name and case insensitive filesystem */
public final class C100574vF extends C115145iP {
    public final Throwable A00;
    public final AnonymousClass6S1 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100574vF(AnonymousClass6S1 r2, Throwable th) {
        super(r2);
        AnonymousClass00C.A0D(th, 1);
        this.A00 = th;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C100574vF) {
                C100574vF r5 = (C100574vF) obj;
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

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Failure(exception=");
        A0u.append(this.A00);
        A0u.append(", fetchSummaryData=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
