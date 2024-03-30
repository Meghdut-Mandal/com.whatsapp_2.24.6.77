package X;

/* renamed from: X.7NK  reason: invalid class name */
public final class AnonymousClass7NK extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C134876bk $userAccessToken;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7NK(C134876bk r2) {
        super(0);
        this.$userAccessToken = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object A00 = this.$userAccessToken.A00("XFAM_CROSSPOSTING_NATIVE_AUTH_TOKEN_XCHANGE_GQL");
        if (A00 != null) {
            return A00;
        }
        throw C36381kD.A0l();
    }
}
