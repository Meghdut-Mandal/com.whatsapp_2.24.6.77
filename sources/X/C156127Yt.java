package X;

/* renamed from: X.7Yt  reason: invalid class name and case insensitive filesystem */
public final class C156127Yt extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AnonymousClass00S $itemProvider;
    public final /* synthetic */ C009003v $measurePolicy;
    public final /* synthetic */ C161267mT $modifier;
    public final /* synthetic */ C114265gw $prefetchState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C156127Yt(C114265gw r2, C161267mT r3, AnonymousClass00S r4, C009003v r5, int i, int i2) {
        super(2);
        this.$itemProvider = r4;
        this.$modifier = r3;
        this.$prefetchState = r2;
        this.$measurePolicy = r5;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C161337ma A0L = C90474aD.A0L(obj, obj2);
        AnonymousClass00S r4 = this.$itemProvider;
        AnonymousClass5W3.A00(this.$prefetchState, A0L, this.$modifier, r4, this.$measurePolicy, AnonymousClass5WD.A00(this.$$changed), this.$$default);
        return AnonymousClass0AJ.A00;
    }
}
