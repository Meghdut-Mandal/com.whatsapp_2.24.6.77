package X;

/* renamed from: X.4hs  reason: invalid class name and case insensitive filesystem */
public final class C94234hs extends C137856gq implements C161817nW {
    public long A00;
    public AnonymousClass6X0 A01;
    public C109065Wd A02;
    public C157657dt A03;
    public C157657dt A04;
    public AnonymousClass5RW A05;

    public /* synthetic */ void BaV() {
    }

    public void B5y(C161667nH r25) {
        C109065Wd B4p;
        C157657dt r6 = this.A04;
        C161667nH r9 = r25;
        if (r6 == C112355dl.A00) {
            long j = this.A00;
            if (j != C133336Xx.A05) {
                long j2 = C133206Xf.A03;
                long BHc = r9.BHc();
                r9.B6E((C114365h6) null, C94604iU.A00, 1.0f, 3, j, j2, C90464aC.A0B(AnonymousClass6X0.A01(BHc) - C133206Xf.A00(j2), AnonymousClass6X0.A00(BHc) - C133206Xf.A01(j2)));
            }
        } else {
            long BHc2 = r9.BHc();
            AnonymousClass6X0 r3 = this.A01;
            long j3 = AnonymousClass6X0.A02;
            if (r3 == null || BHc2 != r3.A00 || r9.getLayoutDirection() != this.A05 || !AnonymousClass00C.A0J(this.A03, r6)) {
                B4p = this.A04.B4p(r9, r9.getLayoutDirection(), r9.BHc());
            } else {
                B4p = this.A02;
                AnonymousClass00C.A0B(B4p);
            }
            long j4 = this.A00;
            if (j4 != C133336Xx.A05) {
                C94604iU r11 = C94604iU.A00;
                if (B4p instanceof C94504iK) {
                    AnonymousClass6QC r5 = ((C94504iK) B4p).A00;
                    float f = r5.A01;
                    float f2 = r5.A03;
                    long A0B = C90464aC.A0B(f, f2);
                    long j5 = C133206Xf.A03;
                    r9.B6E((C114365h6) null, r11, 1.0f, 3, j4, A0B, C90464aC.A0B(r5.A02 - f, r5.A00 - f2));
                } else if (B4p instanceof C94514iL) {
                    C94514iL r32 = (C94514iL) B4p;
                    C161177mK r2 = r32.A01;
                    if (r2 != null) {
                        r9.B6C((C114365h6) null, r2, r11, 1.0f, 3, j4);
                    } else {
                        AnonymousClass6PW r52 = r32.A00;
                        long j6 = r52.A04;
                        long j7 = AnonymousClass6RD.A00;
                        float A012 = C90464aC.A01(j6);
                        float f3 = r52.A01;
                        float f4 = r52.A03;
                        long A0B2 = C90464aC.A0B(f3, f4);
                        long j8 = C133206Xf.A03;
                        r9.B6G((C114365h6) null, r11, 1.0f, 3, j4, A0B2, C90464aC.A0B(r52.A02 - f3, r52.A00 - f4), C90464aC.A0B(A012, A012));
                    }
                } else {
                    throw C36441kJ.A18();
                }
            }
            this.A02 = B4p;
            this.A01 = new AnonymousClass6X0(r9.BHc());
            this.A05 = r9.getLayoutDirection();
            this.A03 = this.A04;
        }
        r9.B63();
    }

    public C94234hs(C157657dt r1, long j) {
        this.A00 = j;
        this.A04 = r1;
    }
}
