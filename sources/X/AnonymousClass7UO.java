package X;

/* renamed from: X.7UO  reason: invalid class name */
public final class AnonymousClass7UO extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C006302t $onError;
    public final /* synthetic */ C130456Ld this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UO(C130456Ld r2, C006302t r3) {
        super(1);
        this.this$0 = r2;
        this.$onError = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object r4;
        C111345c8 r6 = (C111345c8) obj;
        AnonymousClass00C.A0D(r6, 0);
        if (r6 instanceof AnonymousClass5HW) {
            r4 = ((AnonymousClass5HW) r6).A00;
        } else if (r6 instanceof AnonymousClass5HV) {
            r4 = new AnonymousClass5Hp(((AnonymousClass5HV) r6).A00);
        } else if (r6 instanceof AnonymousClass5HY) {
            r4 = new AnonymousClass5Hp(((AnonymousClass5HY) r6).A00);
        } else if (r6 instanceof AnonymousClass5HX) {
            r4 = new AnonymousClass5Hq(((AnonymousClass5HX) r6).A00);
        } else if (r6 instanceof AnonymousClass5HU) {
            r4 = new C105925Hr(0);
        } else {
            throw C36441kJ.A18();
        }
        this.this$0.A00.A0H(new C1498072v(this.$onError, r4, 49));
        return AnonymousClass0AJ.A00;
    }
}
