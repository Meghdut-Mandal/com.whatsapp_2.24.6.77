package X;

/* renamed from: X.6gR  reason: invalid class name and case insensitive filesystem */
public final class C137616gR implements C161567n7 {
    public final long A00;

    public /* synthetic */ C161267mT Bva(C161267mT r2) {
        return AnonymousClass5WL.A00(this, r2);
    }

    public boolean equals(Object obj) {
        C137616gR r7;
        if ((obj instanceof C137616gR) && (r7 = (C137616gR) obj) != null) {
            long j = this.A00;
            long j2 = r7.A00;
            long j3 = C113625fq.A01;
            if (j != j2) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.A00;
        long j2 = C113625fq.A01;
        return AnonymousClass000.A08(j);
    }

    public C137616gR(long j) {
        this.A00 = j;
    }

    public /* synthetic */ boolean B0v(C006302t r2) {
        return C90464aC.A1Y(this, r2);
    }

    public /* synthetic */ Object B7V(Object obj, C009003v r3) {
        return r3.invoke(obj, this);
    }
}
