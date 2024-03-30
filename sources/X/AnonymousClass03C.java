package X;

/* renamed from: X.03C  reason: invalid class name */
public final class AnonymousClass03C extends C005502l {
    public static final AnonymousClass03C A00 = new AnonymousClass03C();

    public void A02(Runnable runnable, C005102h r5) {
        C006802y r0 = C006802y.A01;
        r0.A00.A04(runnable, C006902z.A06, true);
    }

    public void A03(Runnable runnable, C005102h r5) {
        C006802y r0 = C006802y.A01;
        r0.A00.A04(runnable, C006902z.A06, false);
    }

    public C005502l A01(int i) {
        AnonymousClass03D.A00(i);
        if (i >= C006902z.A02) {
            return this;
        }
        AnonymousClass03D.A00(i);
        return new AnonymousClass03E(this, i);
    }
}
