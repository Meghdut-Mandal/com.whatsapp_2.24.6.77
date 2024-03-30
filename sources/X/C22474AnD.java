package X;

/* renamed from: X.AnD  reason: case insensitive filesystem */
public final class C22474AnD extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass777 $callbackFuture;
    public final /* synthetic */ C22729Aun this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22474AnD(C22729Aun aun, AnonymousClass777 r3) {
        super(1);
        this.this$0 = aun;
        this.$callbackFuture = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        AnonymousClass00C.A0D(th, 0);
        C19700wN r2 = this.this$0.A00;
        if (r2 != null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("retry=");
            A0u.append(this.this$0.parameters.retryCount);
            r2.A0D("GroupInfoBatchProcessor/FetchTruncatedGroupsJob/GetGroupInfo", C36331k8.A0i("; message=", A0u, th), th);
            this.$callbackFuture.BVM(new C1890791z(th));
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0d("crashLogs");
    }
}
