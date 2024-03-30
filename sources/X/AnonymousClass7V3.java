package X;

/* renamed from: X.7V3  reason: invalid class name */
public final class AnonymousClass7V3 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ int $direction;
    public final /* synthetic */ C94214hq $focusedItem;
    public final /* synthetic */ C006302t $onFound;
    public final /* synthetic */ C94214hq $this_generateAndSearchChildren;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7V3(C94214hq r2, C94214hq r3, C006302t r4, int i) {
        super(1);
        this.$this_generateAndSearchChildren = r2;
        this.$focusedItem = r3;
        this.$direction = i;
        this.$onFound = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C157677dv r5 = (C157677dv) obj;
        Boolean valueOf = Boolean.valueOf(AnonymousClass6VW.A00(this.$this_generateAndSearchChildren, this.$focusedItem, this.$onFound, this.$direction));
        if (valueOf.booleanValue() || !r5.BCI()) {
            return valueOf;
        }
        return null;
    }
}
