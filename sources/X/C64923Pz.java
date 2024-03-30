package X;

/* renamed from: X.3Pz  reason: invalid class name and case insensitive filesystem */
public final class C64923Pz {
    public final int A00;
    public final C61243Bc A01;
    public final AnonymousClass147 A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C64923Pz) {
                C64923Pz r5 = (C64923Pz) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A00 * 31) + AnonymousClass000.A0H(this.A01)) * 31) + C36411kG.A09(this.A02);
    }

    public C64923Pz(AnonymousClass147 r1, C61243Bc r2, int i) {
        this.A00 = i;
        this.A01 = r2;
        this.A02 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UiState(step=");
        A0u.append(this.A00);
        A0u.append(", disclaimerText=");
        A0u.append(this.A01);
        A0u.append(", linkedGeneralGroup=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }

    public C64923Pz() {
        this((AnonymousClass147) null, (C61243Bc) null, 0);
    }
}
