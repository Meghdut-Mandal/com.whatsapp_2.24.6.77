package X;

/* renamed from: X.7YH  reason: invalid class name */
public final class AnonymousClass7YH extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ C009003v $content;
    public final /* synthetic */ C123575wj $nodeState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7YH(C123575wj r2, C009003v r3) {
        super(2);
        this.$nodeState = r2;
        this.$content = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C161337ma r5 = (C161337ma) obj;
        if ((AnonymousClass000.A0I(obj2) & 11) != 2 || !r5.BHg()) {
            Boolean bool = (Boolean) this.$nodeState.A00.getValue();
            boolean booleanValue = bool.booleanValue();
            C009003v r1 = this.$content;
            r5.Buo(207, bool);
            boolean B2g = r5.B2g(booleanValue);
            if (booleanValue) {
                r1.invoke(r5, C36381kD.A0m());
            } else {
                r5.B55(B2g);
            }
            r5.B6a();
        } else {
            r5.BuE();
        }
        return AnonymousClass0AJ.A00;
    }
}
