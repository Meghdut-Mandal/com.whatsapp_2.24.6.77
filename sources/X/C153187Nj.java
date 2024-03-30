package X;

/* renamed from: X.7Nj  reason: invalid class name and case insensitive filesystem */
public final class C153187Nj extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ String $purpose;
    public final /* synthetic */ C1274268g $userEntitySourceAccessTokenPair;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153187Nj(C1274268g r2, String str) {
        super(0);
        this.$userEntitySourceAccessTokenPair = r2;
        this.$purpose = str;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object obj;
        AnonymousClass011 r0 = (AnonymousClass011) this.$userEntitySourceAccessTokenPair.A00.A00(this.$purpose);
        if (r0 != null && (obj = r0.first) != null) {
            return obj;
        }
        throw C36381kD.A0l();
    }
}
