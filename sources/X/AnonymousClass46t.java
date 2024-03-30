package X;

/* renamed from: X.46t  reason: invalid class name */
public final /* synthetic */ class AnonymousClass46t extends C03030Cw implements C006302t {
    public final /* synthetic */ C023509x $continuation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass46t(C023509x r7) {
        super(1, C05640Qm.class, "dataHandler", "invoke$dataHandler(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", 0);
        this.$continuation = r7;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.$continuation.resumeWith(obj);
        return AnonymousClass0AJ.A00;
    }
}
