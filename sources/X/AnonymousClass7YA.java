package X;

/* renamed from: X.7YA  reason: invalid class name */
public final class AnonymousClass7YA extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ C10800fF $initialDelta;
    public final /* synthetic */ C128316Bt $velocityTracker;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7YA(C128316Bt r2, C10800fF r3) {
        super(2);
        this.$velocityTracker = r2;
        this.$initialDelta = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass6E5 r5 = (AnonymousClass6E5) obj;
        long j = ((C133206Xf) obj2).A00;
        C129566Ho.A00(r5, this.$velocityTracker);
        C129946Jc r1 = r5.A01;
        r1.A00 = true;
        r1.A01 = true;
        this.$initialDelta.element = j;
        return AnonymousClass0AJ.A00;
    }
}
