package X;

/* renamed from: X.AnT  reason: case insensitive filesystem */
public final class C22490AnT extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C006302t $callback = null;
    public final /* synthetic */ String $token;
    public final /* synthetic */ AnonymousClass1TZ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22490AnT(AnonymousClass1TZ r2, String str) {
        super(1);
        this.this$0 = r2;
        this.$token = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass1TZ r2 = this.this$0;
        String str = this.$token;
        synchronized (r2) {
            r2.A04.remove(str);
        }
        C006302t r1 = this.$callback;
        if (r1 != null) {
            r1.invoke(this.$token);
        }
        return AnonymousClass0AJ.A00;
    }
}
