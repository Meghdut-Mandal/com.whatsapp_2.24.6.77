package X;

/* renamed from: X.7Ut  reason: invalid class name and case insensitive filesystem */
public final class C155097Ut extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass00S $onCancel;
    public final /* synthetic */ C006302t $onFailure;
    public final /* synthetic */ C006302t $onSuccess;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155097Ut(AnonymousClass00S r2, C006302t r3, C006302t r4) {
        super(1);
        this.$onSuccess = r3;
        this.$onFailure = r4;
        this.$onCancel = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C006302t r1;
        String str;
        C111455cJ r3 = (C111455cJ) obj;
        AnonymousClass00C.A0D(r3, 0);
        if (r3 instanceof C106185Ir) {
            r1 = this.$onSuccess;
            str = ((C106185Ir) r3).A00;
        } else if (r3 instanceof C106175Iq) {
            r1 = this.$onFailure;
            str = ((C106175Iq) r3).A00;
        } else {
            if (r3 instanceof C106195Is) {
                this.$onCancel.invoke();
            }
            return AnonymousClass0AJ.A00;
        }
        r1.invoke(str);
        return AnonymousClass0AJ.A00;
    }
}
