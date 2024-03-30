package X;

/* renamed from: X.0Mx  reason: invalid class name and case insensitive filesystem */
public final class C05020Mx extends C10930fS {
    public final long A00;

    public C05020Mx(long j) {
        this.A00 = j;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass() && this.A00 == ((C05020Mx) obj).A00);
    }

    public final int A02() {
        int i = 32;
        if (this.A00 >= 0) {
            i = 0;
        }
        return (i >> 5) & 7;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C10930fS r6 = (C10930fS) obj;
        int A02 = A02();
        int A022 = r6.A02();
        if (A02 != A022) {
            return A02 - A022;
        }
        int i = (Math.abs(this.A00) > Math.abs(((C05020Mx) r6).A00) ? 1 : (Math.abs(this.A00) == Math.abs(((C05020Mx) r6).A00) ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return AnonymousClass000.A1R(i) ? 1 : 0;
    }

    public final String toString() {
        return Long.toString(this.A00);
    }

    public final int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        AnonymousClass000.A1J(A0M, A02());
        return AnonymousClass000.A0L(Long.valueOf(this.A00), A0M);
    }
}
