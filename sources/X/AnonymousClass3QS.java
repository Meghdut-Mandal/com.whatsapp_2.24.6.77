package X;

/* renamed from: X.3QS  reason: invalid class name */
public final class AnonymousClass3QS {
    public boolean A00;
    public final AnonymousClass3Q3 A01;
    public final Integer A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3QS) {
                AnonymousClass3QS r5 = (AnonymousClass3QS) obj;
                if (!(this.A00 == r5.A00 && this.A04 == r5.A04 && this.A08 == r5.A08 && this.A03 == r5.A03 && this.A05 == r5.A05 && this.A06 == r5.A06 && AnonymousClass00C.A0J(this.A01, r5.A01) && this.A07 == r5.A07 && AnonymousClass00C.A0J(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36351kA.A05(this.A01, ((((((((((C36341k9.A01(this.A00 ? 1 : 0) * 31) + C36341k9.A01(this.A04 ? 1 : 0)) * 31) + C36341k9.A01(this.A08 ? 1 : 0)) * 31) + C36341k9.A01(this.A03 ? 1 : 0)) * 31) + C36341k9.A01(this.A05 ? 1 : 0)) * 31) + C36341k9.A01(this.A06 ? 1 : 0)) * 31) + C36341k9.A01(this.A07 ? 1 : 0)) * 31) + AnonymousClass000.A0H(this.A02);
    }

    public AnonymousClass3QS(AnonymousClass3Q3 r1, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A00 = z;
        this.A04 = z2;
        this.A08 = z3;
        this.A03 = z4;
        this.A05 = z5;
        this.A06 = z6;
        this.A01 = r1;
        this.A07 = z7;
        this.A02 = num;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ViewState(viewVisible=");
        A0u.append(this.A00);
        A0u.append(", fullToggleVisible=");
        A0u.append(this.A04);
        A0u.append(", glassesSelected=");
        A0u.append(this.A08);
        A0u.append(", connecting=");
        A0u.append(this.A03);
        A0u.append(", isConnected=");
        A0u.append(this.A05);
        A0u.append(", isStatusIndicatorVisible=");
        A0u.append(this.A06);
        A0u.append(", statusIndicatorViewState=");
        A0u.append(this.A01);
        A0u.append(", isTooltipVisible=");
        A0u.append(this.A07);
        A0u.append(", tooltipTextRes=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }

    public AnonymousClass3QS() {
        this(new AnonymousClass3Q3((AnonymousClass9QU) null, false, false), (Integer) null, true, false, false, false, false, false, false);
    }
}
