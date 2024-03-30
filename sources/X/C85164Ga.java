package X;

/* renamed from: X.4Ga  reason: invalid class name and case insensitive filesystem */
public final class C85164Ga extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass00S $extrasProducer = null;
    public final /* synthetic */ AnonymousClass00T $owner$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85164Ga(AnonymousClass00T r2) {
        super(0);
        this.$owner$delegate = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass015 r1;
        Object invoke;
        AnonymousClass00S r0 = this.$extrasProducer;
        if (r0 != null && (invoke = r0.invoke()) != null) {
            return invoke;
        }
        AnonymousClass016 A0V = C36411kG.A0V(this.$owner$delegate);
        if (!(A0V instanceof AnonymousClass015) || (r1 = (AnonymousClass015) A0V) == null) {
            return AnonymousClass04M.A00;
        }
        return r1.BAv();
    }
}
