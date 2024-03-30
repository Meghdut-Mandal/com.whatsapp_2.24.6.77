package X;

/* renamed from: X.56V  reason: invalid class name */
public final class AnonymousClass56V extends C110735b9 {
    public final int A00;
    public final C134936bq A01;
    public final C135066c4 A02;
    public final String A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass56V) {
                AnonymousClass56V r5 = (AnonymousClass56V) obj;
                if (!AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || this.A04 != r5.A04 || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C36351kA.A05(this.A01, C36341k9.A09(this.A03) * 31) + C36411kG.A09(this.A02)) * 31) + C36341k9.A01(this.A04 ? 1 : 0)) * 31) + this.A00;
    }

    public AnonymousClass56V(C134936bq r1, C135066c4 r2, String str, int i, boolean z) {
        this.A03 = str;
        this.A01 = r1;
        this.A02 = r2;
        this.A04 = z;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Complete(contentDescription=");
        A0u.append(this.A03);
        A0u.append(", model=");
        A0u.append(this.A01);
        A0u.append(", sticker=");
        A0u.append(this.A02);
        A0u.append(", isDisabled=");
        A0u.append(this.A04);
        A0u.append(", searchBatchId=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
