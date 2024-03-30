package X;

/* renamed from: X.2EJ  reason: invalid class name */
public final class AnonymousClass2EJ extends C39801to {
    public C44072La A00;
    public AnonymousClass141 A01;
    public final C001600r A02;
    public final C001600r A03;
    public final C001600r A04;
    public final C001700s A05;
    public final C001700s A06;
    public final C001700s A07;
    public final C001700s A08;
    public final C001700s A09 = C36431kI.A0S();
    public final C19460v5 A0A;
    public final AnonymousClass2LF A0B;
    public final AnonymousClass16D A0C;
    public final C220412q A0D;
    public final AnonymousClass12O A0E;
    public final C20810yC A0F;
    public final AnonymousClass1GQ A0G;
    public final C30131Zi A0H;
    public final C62133Ex A0I;
    public final C005502l A0J;
    public final C001700s A0K;
    public final AnonymousClass3G3 A0L;

    public final void A0U() {
        AnonymousClass2LF r3 = this.A0B;
        AnonymousClass141 r2 = this.A01;
        AnonymousClass4YN r1 = new AnonymousClass4YN(this, 1);
        C36351kA.A1H(r3.A00);
        r3.A00 = null;
        AnonymousClass2L2 r0 = new AnonymousClass2L2(r3, r2);
        r3.A00(r1, r0);
        r3.A00 = r0;
    }

    public final void A0V(C52382pL r13) {
        C44072La r0 = this.A00;
        if (r0 == null) {
            throw C36331k8.A0d("newsletterInfo");
        }
        C52382pL r3 = r13;
        r0.A09 = r13;
        C001700s r1 = this.A0K;
        AnonymousClass3KP r02 = (AnonymousClass3KP) r1.A04();
        if (r02 != null) {
            r1.A0C(new AnonymousClass3KP(r3, r02.A02, r02.A04, r02.A03, r02.A00, r02.A05, r02.A07, r02.A06));
        }
    }

    public final void A0W(boolean z) {
        C44072La r2;
        C65073Qp A092 = this.A0D.A09(this.A01.A0H, false);
        if (A092 instanceof C44072La) {
            r2 = (C44072La) A092;
        } else {
            r2 = null;
        }
        if (r2 == null) {
            C36341k9.A19(this.A09, true);
            return;
        }
        this.A00 = r2;
        AnonymousClass141 r4 = this.A01;
        String str = r2.A0K;
        String str2 = r2.A0H;
        boolean z2 = r2.A0O;
        C52382pL r3 = r2.A09;
        boolean A0P = r2.A0P();
        boolean A002 = this.A0L.A00(r2);
        C44072La r0 = this.A00;
        if (r0 == null) {
            throw C36331k8.A0d("newsletterInfo");
        }
        AnonymousClass3KP r22 = new AnonymousClass3KP(r3, r4, str, str2, r0.A07, z2, A0P, A002);
        C001700s r1 = this.A0K;
        if (!r22.equals(r1.A04())) {
            r1.A0C(r22);
        }
        if (z) {
            A0U();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2EJ(C19460v5 r2, C58062zG r3, AnonymousClass2LF r4, AnonymousClass16D r5, C220412q r6, AnonymousClass141 r7, AnonymousClass12O r8, C20810yC r9, AnonymousClass11F r10, AnonymousClass1GQ r11, C30131Zi r12, C62133Ex r13, AnonymousClass3G3 r14, C19770wU r15, C005502l r16) {
        super(r3, r10, r15);
        C36321k7.A0x(r3, r15);
        C36331k8.A1H(r6, r14);
        C36321k7.A1C(r12, r13, r8, r5, r2);
        C005502l r0 = r16;
        C36321k7.A15(r9, r11, r0);
        this.A0B = r4;
        this.A0D = r6;
        this.A0L = r14;
        this.A0H = r12;
        this.A0I = r13;
        this.A0E = r8;
        this.A0C = r5;
        this.A0A = r2;
        this.A0F = r9;
        this.A0G = r11;
        this.A0J = r0;
        this.A01 = r7;
        C001700s A0S = C36431kI.A0S();
        this.A0K = A0S;
        this.A04 = A0S;
        C001700s A0S2 = C36431kI.A0S();
        this.A08 = A0S2;
        this.A03 = A0S2;
        C001700s A0S3 = C36431kI.A0S();
        this.A07 = A0S3;
        this.A02 = A0S3;
        this.A06 = C36431kI.A0S();
        this.A05 = C36431kI.A0S();
    }
}
