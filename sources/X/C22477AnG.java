package X;

/* renamed from: X.AnG  reason: case insensitive filesystem */
public final class C22477AnG extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C023509x $continuation;
    public final /* synthetic */ C006302t $continueOnError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22477AnG(C023509x r2, C006302t r3) {
        super(1);
        this.$continuation = r2;
        this.$continueOnError = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C177258dV A0P = C165597tg.A0P(obj);
        C023509x r2 = this.$continuation;
        A0P.A00 = new C22415AmG(r2);
        A0P.A01 = new C22476AnF(r2, this.$continueOnError);
        return AnonymousClass0AJ.A00;
    }
}
