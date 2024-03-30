package X;

/* renamed from: X.7NO  reason: invalid class name */
public final class AnonymousClass7NO extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C134876bk $userAccessToken;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7NO(C134876bk r2) {
        super(0);
        this.$userAccessToken = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object A00 = this.$userAccessToken.A00("XFAM_CROSSPOSTING_ELIGIBILITY_GQL");
        if (A00 != null) {
            return A00;
        }
        throw C36381kD.A0l();
    }
}
