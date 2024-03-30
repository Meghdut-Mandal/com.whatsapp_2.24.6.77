package X;

/* renamed from: X.6eU  reason: invalid class name and case insensitive filesystem */
public abstract class C136496eU implements C157477db {
    public final C122015uA A00;

    public final void A01(C161927nh r20, long j) {
        float Bvq;
        C122015uA r2 = this.A00;
        C161927nh r5 = r20;
        if (Float.isNaN(Float.NaN)) {
            Bvq = C129486He.A00(r5, r5.BHc());
        } else {
            Bvq = r5.Bvq(Float.NaN);
        }
        float A02 = C90484aE.A02(r2.A01.A02.A05);
        if (A02 > 0.0f) {
            long A05 = AnonymousClass6QU.A00(C114185go.A0K[(int) (j & 63)], C133336Xx.A04(j), C133336Xx.A03(j), C133336Xx.A02(j), A02);
            long BHc = r5.BHc();
            float A01 = AnonymousClass6X0.A01(BHc);
            float A002 = AnonymousClass6X0.A00(BHc);
            C137486gD r4 = (C137486gD) r5.BBD();
            C128306Bs r0 = r4.A01.A02;
            long j2 = r0.A00;
            r0.A01.BpF();
            C128306Bs.A00(((C137516gG) r4.A00).A00).B2x(0.0f, 0.0f, A01, A002, 1);
            r5.B62((C114365h6) null, C94604iU.A00, Bvq, 1.0f, 3, A05, r5.B9U());
            r0.A01.Boi();
            r0.A00 = j2;
        }
    }

    public C136496eU(C157597dn r2) {
        this.A00 = new C122015uA(r2);
    }
}
