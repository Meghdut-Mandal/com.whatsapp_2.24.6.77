package X;

/* renamed from: X.7YO  reason: invalid class name */
public final class AnonymousClass7YO extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ int $index;
    public final /* synthetic */ C159827jz $itemProvider;
    public final /* synthetic */ Object $key;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7YO(C159827jz r2, Object obj, int i) {
        super(2);
        this.$itemProvider = r2;
        this.$index = i;
        this.$key = obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C161337ma r5 = (C161337ma) obj;
        if ((AnonymousClass000.A0I(obj2) & 11) != 2 || !r5.BHg()) {
            this.$itemProvider.Azg(r5, this.$key, this.$index, 64);
        } else {
            r5.BuE();
        }
        return AnonymousClass0AJ.A00;
    }
}
