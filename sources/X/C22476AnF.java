package X;

/* renamed from: X.AnF  reason: case insensitive filesystem */
public final class C22476AnF extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C023509x $continuation;
    public final /* synthetic */ C006302t $continueOnError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22476AnF(C023509x r2, C006302t r3) {
        super(1);
        this.$continueOnError = r3;
        this.$continuation = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C201259jD r4 = (C201259jD) obj;
        AnonymousClass00C.A0D(r4, 0);
        Boolean bool = (Boolean) this.$continueOnError.invoke(r4);
        if (!bool.booleanValue()) {
            this.$continuation.resumeWith(AnonymousClass00C.A02(new C27581Ov(r4)));
        }
        return bool;
    }
}
