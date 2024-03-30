package X;

/* renamed from: X.9gG  reason: invalid class name and case insensitive filesystem */
public final class C199919gG {
    public final C202059ky A00;
    public final C202059ky A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C199919gG) {
                C199919gG r5 = (C199919gG) obj;
                if (!(this.A04 == r5.A04 && this.A02 == r5.A02 && AnonymousClass00C.A0J(this.A01, r5.A01) && AnonymousClass00C.A0J(this.A00, r5.A00) && this.A05 == r5.A05 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((C36341k9.A01(this.A04 ? 1 : 0) * 31) + C36341k9.A01(this.A02 ? 1 : 0)) * 31) + AnonymousClass000.A0H(this.A01)) * 31) + C36411kG.A09(this.A00)) * 31) + C36341k9.A01(this.A05 ? 1 : 0)) * 31) + C36341k9.A01(this.A03 ? 1 : 0);
    }

    public C199919gG(C202059ky r1, C202059ky r2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A04 = z;
        this.A02 = z2;
        this.A01 = r1;
        this.A00 = r2;
        this.A05 = z3;
        this.A03 = z4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ViewState(isUpdateInProgress=");
        A0u.append(this.A04);
        A0u.append(", isDeregisterInProgress=");
        A0u.append(this.A02);
        A0u.append(", updateApiError=");
        A0u.append(this.A01);
        A0u.append(", deregisterApiError=");
        A0u.append(this.A00);
        A0u.append(", isUpdateSuccessful=");
        A0u.append(this.A05);
        A0u.append(", isDeregisterSuccessful=");
        return C36321k7.A0H(A0u, this.A03);
    }

    public C199919gG() {
        this((C202059ky) null, (C202059ky) null, false, false, false, false);
    }
}
