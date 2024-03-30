package X;

/* renamed from: X.5Jq  reason: invalid class name and case insensitive filesystem */
public final class C106425Jq extends C132056Ry {
    public final AnonymousClass6QG A00;
    public final AnonymousClass00S A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C106425Jq) {
                C106425Jq r5 = (C106425Jq) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || this.A02 != r5.A02 || this.A03 != r5.A03 || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C106425Jq(AnonymousClass6QG r2, AnonymousClass00S r3, boolean z, boolean z2) {
        super(r2, 31);
        this.A00 = r2;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = r3;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, (((C36391kE.A0A(this.A00) + C36341k9.A01(this.A02 ? 1 : 0)) * 31) + C36341k9.A01(this.A03 ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BusinessSearchLocationHeaderItem(data=");
        A0u.append(this.A00);
        A0u.append(", isInternalOnly=");
        A0u.append(this.A02);
        A0u.append(", showMyLocationButton=");
        A0u.append(this.A03);
        A0u.append(", myLocationButtonClick=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
