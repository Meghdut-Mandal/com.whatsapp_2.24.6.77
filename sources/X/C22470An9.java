package X;

/* renamed from: X.An9  reason: case insensitive filesystem */
public final class C22470An9 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass777 $callbackFuture;
    public final /* synthetic */ C22727Aug this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22470An9(C22727Aug aug, AnonymousClass777 r3) {
        super(1);
        this.this$0 = aug;
        this.$callbackFuture = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C199819g4 r6 = (C199819g4) obj;
        AnonymousClass00C.A0D(r6, 0);
        C22727Aug aug = this.this$0;
        C19700wN r2 = aug.A00;
        if (r2 != null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("FetchGroupsForDirtyBitJob/GetGroupInfo error; retry=");
            A0u.append(aug.parameters.retryCount);
            r2.A0E(AnonymousClass000.A0t(A0u, ';'), r6.A01, false);
            this.$callbackFuture.BVM(new C1890791z());
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0d("crashLogs");
    }
}
