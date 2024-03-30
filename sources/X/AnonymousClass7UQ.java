package X;

/* renamed from: X.7UQ  reason: invalid class name */
public final class AnonymousClass7UQ extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C159767jt $callback;
    public final /* synthetic */ AnonymousClass5OK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UQ(C159767jt r2, AnonymousClass5OK r3) {
        super(1);
        this.$callback = r2;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        AnonymousClass00C.A0D(th, 0);
        C159767jt r4 = this.$callback;
        if (r4 != null) {
            String message = th.getMessage();
            if (message == null) {
                message = "extensions-data-exchange-graphql-response-error";
            }
            r4.B0A(message, th.getMessage(), AnonymousClass6TM.A00(this.this$0.A02.A02(), (String) null));
        }
        return AnonymousClass0AJ.A00;
    }
}
