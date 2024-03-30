package X;

/* renamed from: X.530  reason: invalid class name */
public final class AnonymousClass530 extends AnonymousClass532 {
    public final AnonymousClass6BH A00;
    public final AnonymousClass6BH A01;
    public final AnonymousClass6BI A02;
    public final AnonymousClass141 A03;
    public final C61243Bc A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass530) {
                AnonymousClass530 r5 = (AnonymousClass530) obj;
                if (!AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        AnonymousClass6BI r0 = this.A02;
        return C36401kF.A02(this.A01, (C36351kA.A05(r0, ((AnonymousClass000.A0H(this.A03) * 31) + AnonymousClass000.A0H(this.A04)) * 31) + C36411kG.A09(this.A00)) * 31);
    }

    public AnonymousClass530(AnonymousClass6BH r1, AnonymousClass6BH r2, AnonymousClass6BI r3, AnonymousClass141 r4, C61243Bc r5) {
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LGCOrOneToOne(titleContact=");
        A0u.append(this.A03);
        A0u.append(", titleContentDescription=");
        A0u.append(this.A04);
        A0u.append(", subtitleState=");
        A0u.append(this.A02);
        A0u.append(", minimizeBtnState=");
        A0u.append(this.A00);
        A0u.append(", participantsBtnState=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
