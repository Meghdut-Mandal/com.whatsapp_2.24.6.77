package X;

/* renamed from: X.2Mn  reason: invalid class name and case insensitive filesystem */
public final class C44222Mn extends AnonymousClass1DJ {
    public boolean A00;
    public final C19730wQ A01;
    public final C19420v0 A02;
    public final AnonymousClass17X A03;
    public final AnonymousClass12P A04;
    public final C20350xQ A05;
    public final C20810yC A06;
    public final C19770wU A07;

    public void A01() {
        Boolean bool;
        AnonymousClass005 r2 = this.A02.A00;
        if (C36391kE.A0H(r2).contains("ug_sync_state")) {
            bool = Boolean.valueOf(C36371kC.A1U(C36391kE.A0H(r2), "ug_sync_state"));
        } else {
            bool = null;
        }
        if (C36371kC.A1X(bool, false) || (!this.A00 && this.A06.A0E(3010))) {
            this.A07.Boy(C81183wb.A00(this, 43));
        }
    }

    public void A02() {
        this.A00 = this.A06.A0E(3010);
    }

    public C44222Mn(C19730wQ r1, C19420v0 r2, AnonymousClass17X r3, AnonymousClass12P r4, C20810yC r5, C20350xQ r6, C19770wU r7) {
        C36321k7.A1B(r5, r1, r7, r6, r4);
        C36321k7.A10(r2, r3);
        this.A06 = r5;
        this.A01 = r1;
        this.A07 = r7;
        this.A05 = r6;
        this.A04 = r4;
        this.A02 = r2;
        this.A03 = r3;
    }
}
