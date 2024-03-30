package X;

/* renamed from: X.5EI  reason: invalid class name */
public final class AnonymousClass5EI extends AnonymousClass5EQ {
    public final int A00;
    public final AnonymousClass6QG A01;
    public final AnonymousClass00S A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5EI) {
                AnonymousClass5EI r5 = (AnonymousClass5EI) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A02, C36351kA.A05(this.A01, this.A00 * 31));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5EI(AnonymousClass6QG r2, AnonymousClass00S r3, int i) {
        super(43);
        C36321k7.A0z(r2, r3);
        this.A00 = i;
        this.A01 = r2;
        this.A02 = r3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("HeaderWithLocationListItemData(title=");
        A0u.append(this.A00);
        A0u.append(", searchLocation=");
        A0u.append(this.A01);
        A0u.append(", onLocationClickListener=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
