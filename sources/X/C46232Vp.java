package X;

/* renamed from: X.2Vp  reason: invalid class name and case insensitive filesystem */
public final class C46232Vp extends C54492t2 {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46232Vp) {
                C46232Vp r5 = (C46232Vp) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public C46232Vp(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LinkExistingSubgroupsPartialSuccessResult(totalCount=");
        A0u.append(this.A01);
        A0u.append(", successCount=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
