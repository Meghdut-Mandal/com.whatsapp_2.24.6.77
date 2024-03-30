package X;

/* renamed from: X.6Eb  reason: invalid class name and case insensitive filesystem */
public abstract class C128906Eb {
    public float A00 = 1.0f;
    public C114365h6 A01;
    public AnonymousClass5RW A02 = AnonymousClass5RW.Ltr;
    public final C006302t A03 = new AnonymousClass7RL(this);

    public long A00() {
        if (this instanceof C94624iW) {
            return ((AnonymousClass6X0) ((C94624iW) this).A05.getValue()).A00;
        }
        return AnonymousClass6GI.A02(((C94614iV) this).A03);
    }

    public void A01(C161927nh r28) {
        C161927nh r12 = r28;
        if (this instanceof C94624iW) {
            C94624iW r6 = (C94624iW) this;
            C94644iY r10 = r6.A06;
            C114365h6 r9 = r6.A02;
            if (r9 == null) {
                r9 = (C114365h6) r10.A07.getValue();
            }
            if (!C90474aD.A1U(r6.A04) || r12.getLayoutDirection() != AnonymousClass5RW.Rtl) {
                r10.A05(r9, r12, r6.A00);
            } else {
                long B9U = r12.B9U();
                C137486gD r7 = (C137486gD) r12.BBD();
                C128306Bs r5 = r7.A01.A02;
                long j = r5.A00;
                r5.A01.BpF();
                r7.A00.BpK(-1.0f, 1.0f, B9U);
                r10.A05(r9, r12, r6.A00);
                r5.A01.Boi();
                r5.A00 = j;
            }
            r6.A01 = r6.A03.BCn();
            return;
        }
        C94614iV r62 = (C94614iV) this;
        C23085B3v b3v = r62.A06;
        long j2 = r62.A04;
        long j3 = r62.A05;
        long A012 = AnonymousClass6GI.A01(r12.BHc());
        float f = r62.A00;
        r12.B65(r62.A02, b3v, C94604iU.A00, f, 3, r62.A01, j2, j3, AnonymousClass6TU.A01, A012);
    }
}
