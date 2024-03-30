package X;

/* renamed from: X.69B  reason: invalid class name */
public final class AnonymousClass69B {
    public final long A00 = (4284900966L << 32);
    public final C156907b9 A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (AnonymousClass00C.A0J(getClass(), C90474aD.A0W(obj))) {
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
                AnonymousClass69B r9 = (AnonymousClass69B) obj;
                long j = this.A00;
                long j2 = r9.A00;
                long j3 = C133336Xx.A01;
                if (j != j2 || !AnonymousClass00C.A0J(this.A01, r9.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.A00;
        long j2 = C133336Xx.A01;
        return C36401kF.A02(this.A01, C90464aC.A08(j));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("OverscrollConfiguration(glowColor=");
        C90484aE.A1J(A0u, this.A00);
        A0u.append(", drawPadding=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }

    public /* synthetic */ AnonymousClass69B() {
        long j = C133336Xx.A01;
        float f = (float) 0;
        C136756ew r0 = new C136756ew(f, f, f, f);
        this.A01 = r0;
    }
}
