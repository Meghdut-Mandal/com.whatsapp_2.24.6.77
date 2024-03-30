package X;

/* renamed from: X.7YB  reason: invalid class name */
public final class AnonymousClass7YB extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ C157507de $$this$scroll;
    public final /* synthetic */ C10780fD $previousValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7YB(C157507de r2, C10780fD r3) {
        super(2);
        this.$previousValue = r3;
        this.$$this$scroll = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        float A03 = C36441kJ.A03(obj);
        ((Number) obj2).floatValue();
        C10780fD r2 = this.$previousValue;
        float f = r2.element;
        r2.element = f + this.$$this$scroll.BpR(A03 - f);
        return AnonymousClass0AJ.A00;
    }
}
