package X;

/* renamed from: X.7NN  reason: invalid class name */
public final class AnonymousClass7NN extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C134876bk $userAccessTokenEnforced;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7NN(C134876bk r2) {
        super(0);
        this.$userAccessTokenEnforced = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object A00 = this.$userAccessTokenEnforced.A00("XFAM_CROSSPOSTING_REQUEST_GQL");
        if (A00 != null) {
            return A00;
        }
        throw C36381kD.A0l();
    }
}
