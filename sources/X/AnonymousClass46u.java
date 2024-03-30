package X;

/* renamed from: X.46u  reason: invalid class name */
public final /* synthetic */ class AnonymousClass46u extends C03030Cw implements C006302t {
    public final /* synthetic */ C023509x $continuation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass46u(C023509x r7) {
        super(1, C05640Qm.class, "errorHandler", "invoke$errorHandler(Lkotlin/coroutines/Continuation;Lcom/whatsapp/infra/graphql/error/MexErrorSummary;)Z", 0);
        this.$continuation = r7;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C201259jD r5 = (C201259jD) obj;
        AnonymousClass00C.A0D(r5, 0);
        C023509x r2 = this.$continuation;
        C82263yQ r1 = new C82263yQ(r5);
        AnonymousClass00C.A0D(r1, 0);
        r2.resumeWith(new AnonymousClass03N(r1));
        return false;
    }
}
