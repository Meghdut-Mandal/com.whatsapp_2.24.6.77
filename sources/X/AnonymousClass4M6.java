package X;

/* renamed from: X.4M6  reason: invalid class name */
public final class AnonymousClass4M6 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ Runnable $dismissToolTipRunnable;
    public final /* synthetic */ AnonymousClass17Y $globalUI;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4M6(AnonymousClass17Y r2, Runnable runnable) {
        super(1);
        this.$globalUI = r2;
        this.$dismissToolTipRunnable = runnable;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass3IE r5 = (AnonymousClass3IE) obj;
        AnonymousClass00C.A0D(r5, 0);
        this.$globalUI.A0G(this.$dismissToolTipRunnable);
        if (r5.A01) {
            this.$globalUI.A0I(this.$dismissToolTipRunnable, 3500);
        }
        return AnonymousClass0AJ.A00;
    }
}
