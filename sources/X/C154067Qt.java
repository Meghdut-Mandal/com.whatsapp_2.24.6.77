package X;

/* renamed from: X.7Qt  reason: invalid class name and case insensitive filesystem */
public final class C154067Qt extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass00S $itemProviderLambda;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154067Qt(AnonymousClass00S r2) {
        super(1);
        this.$itemProviderLambda = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C159827jz r3 = (C159827jz) this.$itemProviderLambda.invoke();
        int i = ((C136776ey) r3).A01.A00.A00;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                if (AnonymousClass00C.A0J(r3.BDL(i2), obj)) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        return Integer.valueOf(i2);
    }
}
