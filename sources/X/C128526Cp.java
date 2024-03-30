package X;

/* renamed from: X.6Cp  reason: invalid class name and case insensitive filesystem */
public final class C128526Cp {
    public final int A00;
    public final C134606bJ A01;
    public final C134746bX A02;
    public final Integer A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128526Cp) {
                C128526Cp r5 = (C128526Cp) obj;
                if (this.A04 != r5.A04 || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A02, ((((C36341k9.A01(this.A04 ? 1 : 0) * 31) + this.A00) * 31) + AnonymousClass000.A0H(this.A01)) * 31) + C36411kG.A09(this.A03);
    }

    public C128526Cp(C134606bJ r1, C134746bX r2, Integer num, int i, boolean z) {
        this.A04 = z;
        this.A00 = i;
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = num;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VariantsCarouselDisplayData(showLoadingState=");
        A0u.append(this.A04);
        A0u.append(", selectedPosition=");
        A0u.append(this.A00);
        A0u.append(", selectedOption=");
        A0u.append(this.A01);
        A0u.append(", displayData=");
        A0u.append(this.A02);
        A0u.append(", type=");
        return AnonymousClass000.A0m(this.A03, A0u);
    }
}
