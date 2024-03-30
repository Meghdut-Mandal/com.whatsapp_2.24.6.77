package X;

/* renamed from: X.7Ni  reason: invalid class name and case insensitive filesystem */
public final class C153177Ni extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ String $purpose;
    public final /* synthetic */ C1274268g $userEntitySourceAccessTokenPair;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153177Ni(C1274268g r2, String str) {
        super(0);
        this.$userEntitySourceAccessTokenPair = r2;
        this.$purpose = str;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object obj;
        AnonymousClass011 r0 = (AnonymousClass011) this.$userEntitySourceAccessTokenPair.A00.A00(this.$purpose);
        if (r0 != null && (obj = r0.second) != null) {
            return obj;
        }
        throw C36381kD.A0l();
    }
}
