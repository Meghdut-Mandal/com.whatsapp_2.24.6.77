package X;

/* renamed from: X.9fq  reason: invalid class name and case insensitive filesystem */
public final class C199719fq {
    public C186238vd A00;
    public boolean A01;

    public C199719fq(C186238vd r2) {
        this.A00 = r2;
        this.A01 = false;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C199719fq) {
                C199719fq r5 = (C199719fq) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass000.A0H(this.A00) * 31) + C36341k9.A01(this.A01 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CacheData(response=");
        A0u.append(this.A00);
        A0u.append(", isLoading=");
        return C36321k7.A0H(A0u, this.A01);
    }

    public C199719fq() {
        this.A00 = null;
        this.A01 = true;
    }
}
