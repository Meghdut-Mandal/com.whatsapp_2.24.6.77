package X;

/* renamed from: X.5Jr  reason: invalid class name and case insensitive filesystem */
public final class C106435Jr extends C132056Ry {
    public C006302t A00;
    public final AnonymousClass6QG A01;
    public final AnonymousClass6E6 A02;
    public final AnonymousClass00S A03;
    public final C006302t A04;
    public final boolean A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106435Jr(AnonymousClass6QG r2, AnonymousClass6E6 r3, AnonymousClass00S r4, C006302t r5, int i, boolean z) {
        super(r3, i);
        AnonymousClass00C.A0D(r3, 2);
        this.A06 = i;
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = z;
        this.A03 = r4;
        this.A04 = r5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C106435Jr) {
                C106435Jr r5 = (C106435Jr) obj;
                if (this.A06 != r5.A06 || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01) || this.A05 != r5.A05 || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A052 = C36351kA.A05(this.A02, this.A06 * 31);
        return C36401kF.A02(this.A04, C36351kA.A05(this.A03, (C36351kA.A05(this.A01, A052) + C36341k9.A01(this.A05 ? 1 : 0)) * 31));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BusinessProfileListItem(itemType=");
        A0u.append(this.A06);
        A0u.append(", data=");
        A0u.append(this.A02);
        A0u.append(", searchLocation=");
        A0u.append(this.A01);
        A0u.append(", isCached=");
        A0u.append(this.A05);
        A0u.append(", onViewProfileBtnClicked=");
        A0u.append(this.A03);
        A0u.append(", onProfileClicked=");
        return AnonymousClass000.A0m(this.A04, A0u);
    }
}
