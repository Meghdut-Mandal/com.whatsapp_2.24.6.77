package X;

/* renamed from: X.7UT  reason: invalid class name */
public final class AnonymousClass7UT extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C17300r3 $channel;
    public final /* synthetic */ boolean $reverseDirection = false;
    public final /* synthetic */ C128316Bt $velocityTracker;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UT(C128316Bt r2, C17300r3 r3) {
        super(1);
        this.$velocityTracker = r2;
        this.$channel = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass6E5 r5 = (AnonymousClass6E5) obj;
        C129566Ho.A00(r5, this.$velocityTracker);
        if (!r5.A0C || r5.A0B) {
            long A02 = C133206Xf.A02(r5.A06, r5.A07);
            if (r5.A00()) {
                A02 = C133206Xf.A03;
            }
            C129946Jc r3 = r5.A01;
            r3.A00 = true;
            r3.A01 = true;
            this.$channel.BwE(new C93384gT(C90474aD.A0B(this.$reverseDirection ? 1 : 0, A02)));
        }
        return AnonymousClass0AJ.A00;
    }
}
