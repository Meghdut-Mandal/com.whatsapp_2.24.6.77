package X;

/* renamed from: X.6gG  reason: invalid class name and case insensitive filesystem */
public final class C137516gG implements C158837iJ {
    public final /* synthetic */ AnonymousClass7bT A00;

    public C137516gG(AnonymousClass7bT r1) {
        this.A00 = r1;
    }

    public void BKm(float f, float f2, float f3, float f4) {
        C128306Bs r5 = ((C137486gD) this.A00).A01.A02;
        C161047m3 r4 = r5.A01;
        long j = r5.A00;
        long A0B = C90464aC.A0B(AnonymousClass6X0.A01(j) - (f3 + f), AnonymousClass6X0.A00(j) - (f4 + f2));
        if (AnonymousClass6X0.A01(A0B) < 0.0f || AnonymousClass6X0.A00(A0B) < 0.0f) {
            throw AnonymousClass001.A08("Width and height must be greater than or equal to zero");
        }
        r5.A00 = A0B;
        r4.Bw6(f, f2);
    }

    public void BpK(float f, float f2, long j) {
        C161047m3 A002 = C128306Bs.A00(this.A00);
        A002.Bw6(C133206Xf.A00(j), C133206Xf.A01(j));
        A002.BpJ(f, f2);
        A002.Bw6(-C133206Xf.A00(j), -C133206Xf.A01(j));
    }
}
