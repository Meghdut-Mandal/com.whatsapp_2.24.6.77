package X;

/* renamed from: X.7JI  reason: invalid class name */
public final class AnonymousClass7JI extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C138116hK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7JI(C138116hK r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object systemService = this.this$0.A00.getContext().getSystemService("input_method");
        AnonymousClass00C.A0E(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return systemService;
    }
}
