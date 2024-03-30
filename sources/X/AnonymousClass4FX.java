package X;

/* renamed from: X.4FX  reason: invalid class name */
public final class AnonymousClass4FX extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass00S $extrasProducer = null;
    public final /* synthetic */ AnonymousClass01G $this_viewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4FX(AnonymousClass01G r2) {
        super(0);
        this.$this_viewModels = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object invoke;
        AnonymousClass00S r0 = this.$extrasProducer;
        if (r0 == null || (invoke = r0.invoke()) == null) {
            return this.$this_viewModels.BAv();
        }
        return invoke;
    }
}
