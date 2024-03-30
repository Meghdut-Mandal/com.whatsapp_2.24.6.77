package X;

/* renamed from: X.7Oe  reason: invalid class name and case insensitive filesystem */
public final class C153397Oe extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C136296e9 $animationSpec;
    public final /* synthetic */ Object $initialValue;
    public final /* synthetic */ Object $targetValue;
    public final /* synthetic */ C137106fb $transitionAnimation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153397Oe(C136296e9 r2, C137106fb r3, Object obj, Object obj2) {
        super(0);
        this.$initialValue = obj;
        this.$transitionAnimation = r3;
        this.$targetValue = obj2;
        this.$animationSpec = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        if (!AnonymousClass00C.A0J(this.$initialValue, this.$transitionAnimation.A03) || !AnonymousClass00C.A0J(this.$targetValue, this.$transitionAnimation.A04)) {
            C137106fb r2 = this.$transitionAnimation;
            Object obj = this.$initialValue;
            Object obj2 = this.$targetValue;
            C136296e9 r4 = this.$animationSpec;
            r2.A03 = obj;
            r2.A04 = obj2;
            r2.A01 = r4;
            r2.A02 = new C136286e8(r4, (C129076Ev) null, r2.A07, obj, obj2);
            C90474aD.A11(r2.A09.A02, true);
            r2.A05 = false;
            r2.A06 = true;
        }
        return AnonymousClass0AJ.A00;
    }
}
