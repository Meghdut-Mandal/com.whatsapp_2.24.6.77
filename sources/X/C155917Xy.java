package X;

/* renamed from: X.7Xy  reason: invalid class name and case insensitive filesystem */
public final class C155917Xy extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ AnonymousClass6SD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155917Xy(AnonymousClass6SD r2) {
        super(2);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C129136Fi r3 = (C129136Fi) obj2;
        C136906fE r0 = this.this$0.A00;
        if (r0 != null) {
            r0.A04 = r3;
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass001.A08("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
