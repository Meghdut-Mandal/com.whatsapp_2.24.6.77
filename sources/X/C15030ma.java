package X;

/* renamed from: X.0ma  reason: invalid class name and case insensitive filesystem */
public final class C15030ma extends C11000fZ implements C17160qp {
    public boolean equals(Object obj) {
        if (!(obj instanceof C15030ma)) {
            return false;
        }
        long j = this.A00;
        long j2 = this.A01;
        if (j > j2) {
            C11000fZ r0 = (C11000fZ) obj;
            if (r0.A00 > r0.A01) {
                return true;
            }
        }
        C11000fZ r10 = (C11000fZ) obj;
        if (j == r10.A00 && j2 == r10.A01) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.A00;
        long j2 = this.A01;
        if (j <= j2) {
            return (int) ((((long) 31) * (j ^ (j >>> 32))) + (j2 ^ (j2 >>> 32)));
        }
        return -1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A00);
        A0u.append("..");
        A0u.append(this.A01);
        return A0u.toString();
    }

    public C15030ma(long j, long j2) {
        super(j, j2);
    }

    public /* bridge */ /* synthetic */ Comparable BBY() {
        throw null;
    }

    public /* bridge */ /* synthetic */ Comparable BHr() {
        throw null;
    }
}
