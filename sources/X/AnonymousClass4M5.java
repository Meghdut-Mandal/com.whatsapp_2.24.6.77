package X;

/* renamed from: X.4M5  reason: invalid class name */
public final class AnonymousClass4M5 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ Runnable $dismissToolTipRunnable;
    public final /* synthetic */ AnonymousClass17Y $globalUI;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4M5(AnonymousClass17Y r2, Runnable runnable) {
        super(1);
        this.$globalUI = r2;
        this.$dismissToolTipRunnable = runnable;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j;
        AnonymousClass3K4 r5 = (AnonymousClass3K4) obj;
        AnonymousClass00C.A0D(r5, 0);
        this.$globalUI.A0G(this.$dismissToolTipRunnable);
        if (r5.A05) {
            if (r5.A01 == 1) {
                j = 7000;
            } else {
                j = 3500;
            }
            this.$globalUI.A0I(this.$dismissToolTipRunnable, j);
        }
        return AnonymousClass0AJ.A00;
    }
}
