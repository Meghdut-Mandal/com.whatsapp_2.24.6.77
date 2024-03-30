package X;

/* renamed from: X.0mc  reason: invalid class name and case insensitive filesystem */
public final class C15050mc extends C11010fa implements C17160qp {
    public boolean equals(Object obj) {
        if (!(obj instanceof C15050mc)) {
            return false;
        }
        long j = this.A00;
        long j2 = this.A01;
        if (Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) > 0) {
            C11010fa r0 = (C11010fa) obj;
            if (Long.compare(r0.A00 ^ Long.MIN_VALUE, r0.A01 ^ Long.MIN_VALUE) > 0) {
                return true;
            }
        }
        C11010fa r9 = (C11010fa) obj;
        if (j == r9.A00 && j2 == r9.A01) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.A00;
        long j2 = this.A01;
        if (Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) > 0) {
            return -1;
        }
        return ((int) (j2 ^ (j2 >>> 32))) + (((int) (j ^ (j >>> 32))) * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(AnonymousClass0VZ.A01(this.A00));
        A0u.append("..");
        return AnonymousClass000.A0o(AnonymousClass0VZ.A01(this.A01), A0u);
    }

    public C15050mc(long j, long j2) {
        super(j, j2);
    }

    public /* bridge */ /* synthetic */ Comparable BBY() {
        throw null;
    }

    public /* bridge */ /* synthetic */ Comparable BHr() {
        throw null;
    }
}
