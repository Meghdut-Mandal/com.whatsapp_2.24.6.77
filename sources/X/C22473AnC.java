package X;

/* renamed from: X.AnC  reason: case insensitive filesystem */
public final class C22473AnC extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass777 $callbackFuture;
    public final /* synthetic */ C22729Aun this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22473AnC(C22729Aun aun, AnonymousClass777 r3) {
        super(1);
        this.this$0 = aun;
        this.$callbackFuture = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C199819g4 r5 = (C199819g4) obj;
        AnonymousClass00C.A0D(r5, 0);
        C19700wN r2 = this.this$0.A00;
        if (r2 != null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("retry=");
            A0u.append(this.this$0.parameters.retryCount);
            A0u.append("; errorText=");
            r2.A0E("GroupInfoBatchProcessor/FetchTruncatedGroupsJob/GetGroupInfo - | error;", AnonymousClass000.A0q(r5.A01, A0u), false);
            this.$callbackFuture.BVM(new C1890791z());
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0d("crashLogs");
    }
}
