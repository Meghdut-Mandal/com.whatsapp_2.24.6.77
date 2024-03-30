package X;

/* renamed from: X.4hf  reason: invalid class name and case insensitive filesystem */
public abstract class C94114hf extends C137856gq {
    public C137856gq A00;
    public final int A01 = AnonymousClass6X7.A01(this);

    public final void A0F(AnonymousClass7bY r9) {
        int i;
        C137856gq r1 = (C137856gq) r9;
        C137856gq r2 = r1.A03;
        C137856gq r4 = null;
        if (C36371kC.A1W(r2, r9)) {
            if (r9 instanceof C137856gq) {
                r4 = r1.A04;
            }
            if (r2 != this.A03 || !AnonymousClass00C.A0J(r4, this)) {
                throw AnonymousClass001.A09("Cannot delegate to an already delegated node");
            }
        } else if (!r2.A08) {
            r2.A03 = this.A03;
            int i2 = this.A01;
            int A02 = AnonymousClass6X7.A02(r2);
            r2.A01 = A02;
            int i3 = this.A01;
            int i4 = A02 & 2;
            if (i4 == 0 || (2 & i3) == 0 || (this instanceof C161777nS)) {
                r2.A02 = this.A00;
                this.A00 = r2;
                r2.A04 = this;
                int i5 = i3 | A02;
                this.A01 = i5;
                if (i3 != i5) {
                    C137856gq r3 = this.A03;
                    if (r3 == this) {
                        this.A00 = i5;
                    }
                    if (this.A08) {
                        C137856gq r12 = this;
                        while (true) {
                            i5 |= r12.A01;
                            r12.A01 = i5;
                            if (r12 != r3) {
                                r12 = r12.A04;
                                if (r12 == null) {
                                    break;
                                }
                            } else {
                                C137856gq r0 = r12.A02;
                                if (r0 != null) {
                                    i = r0.A00;
                                } else {
                                    i = 0;
                                }
                                int i6 = i5 | i;
                                do {
                                    i6 |= r12.A01;
                                    r12.A00 = i6;
                                    r12 = r12.A04;
                                } while (r12 != null);
                            }
                        }
                    }
                }
                if (this.A08) {
                    if (i4 == 0 || (i2 & 2) != 0) {
                        A0E(this.A05);
                    } else {
                        AnonymousClass6XQ r13 = AnonymousClass6VZ.A02(this).A0R;
                        this.A03.A0E((C94894iy) null);
                        r13.A08();
                    }
                    r2.A08();
                    r2.A0C();
                    AnonymousClass6X7.A03(r2);
                    return;
                }
                return;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: ");
            A0u.append(this);
            throw AnonymousClass000.A0f(r2, "\nDelegate Node: ", A0u);
        } else {
            throw AnonymousClass001.A09("Cannot delegate to an already attached node");
        }
    }

    public void A09() {
        for (C137856gq r0 = this.A00; r0 != null; r0 = r0.A02) {
            r0.A09();
        }
        super.A09();
    }

    public void A0C() {
        for (C137856gq r0 = this.A00; r0 != null; r0 = r0.A02) {
            r0.A0C();
        }
        super.A0C();
    }

    public void A08() {
        super.A08();
        for (C137856gq r1 = this.A00; r1 != null; r1 = r1.A02) {
            r1.A0E(this.A05);
            if (!r1.A08) {
                r1.A08();
            }
        }
    }

    public void A0B() {
        super.A0B();
        for (C137856gq r0 = this.A00; r0 != null; r0 = r0.A02) {
            r0.A0B();
        }
    }

    public void A0D() {
        super.A0D();
        for (C137856gq r0 = this.A00; r0 != null; r0 = r0.A02) {
            r0.A0D();
        }
    }
}
