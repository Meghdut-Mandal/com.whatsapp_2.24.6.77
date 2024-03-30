package X;

/* renamed from: X.7YT  reason: invalid class name */
public final class AnonymousClass7YT extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C009003v $content;
    public final /* synthetic */ C199979gM $typography;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7YT(C199979gM r2, C009003v r3, int i) {
        super(2);
        this.$typography = r2;
        this.$content = r3;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C161337ma r4 = (C161337ma) obj;
        if ((AnonymousClass000.A0I(obj2) & 11) != 2 || !r4.BHg()) {
            AnonymousClass6UK.A02(r4, this.$typography.A00, this.$content, (this.$$dirty >> 6) & 112);
        } else {
            r4.BuE();
        }
        return AnonymousClass0AJ.A00;
    }
}
