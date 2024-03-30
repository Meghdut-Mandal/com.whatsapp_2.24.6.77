package X;

/* renamed from: X.6PL  reason: invalid class name */
public final class AnonymousClass6PL {
    public final C137446g9 A00;
    public final C137446g9 A01;
    public final C137446g9 A02;
    public final C137446g9 A03;
    public final C137446g9 A04;

    public AnonymousClass6PL() {
        this((C137446g9) null, (C137446g9) null, (C137446g9) null, (C137446g9) null, (C137446g9) null, (C05250Oz) null, 31);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6PL) {
                AnonymousClass6PL r5 = (AnonymousClass6PL) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ AnonymousClass6PL(C137446g9 r6, C137446g9 r7, C137446g9 r8, C137446g9 r9, C137446g9 r10, C05250Oz r11, int i) {
        C137446g9 r4 = C114035gX.A01;
        C137446g9 r3 = C114035gX.A04;
        C137446g9 r2 = C114035gX.A03;
        C137446g9 r1 = C114035gX.A02;
        C137446g9 r0 = C114035gX.A00;
        C36321k7.A1B(r4, r3, r2, r1, r0);
        this.A01 = r4;
        this.A04 = r3;
        this.A03 = r2;
        this.A02 = r1;
        this.A00 = r0;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36351kA.A05(this.A02, C36351kA.A05(this.A03, C36351kA.A05(this.A04, C36391kE.A0A(this.A01)))));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Shapes(extraSmall=");
        A0u.append(this.A01);
        A0u.append(", small=");
        A0u.append(this.A04);
        A0u.append(", medium=");
        A0u.append(this.A03);
        A0u.append(", large=");
        A0u.append(this.A02);
        A0u.append(", extraLarge=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
