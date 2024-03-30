package X;

/* renamed from: X.7Z9  reason: invalid class name */
public final class AnonymousClass7Z9 extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AnonymousClass5VU $border = null;
    public final /* synthetic */ AnonymousClass674 $colors;
    public final /* synthetic */ C019408g $content;
    public final /* synthetic */ C156907b9 $contentPadding;
    public final /* synthetic */ AnonymousClass6O8 $elevation;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C161437mu $interactionSource;
    public final /* synthetic */ C161267mT $modifier;
    public final /* synthetic */ AnonymousClass00S $onClick;
    public final /* synthetic */ C157657dt $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7Z9(C161437mu r2, C156907b9 r3, AnonymousClass674 r4, AnonymousClass6O8 r5, C161267mT r6, C157657dt r7, AnonymousClass00S r8, C019408g r9, int i, int i2, boolean z) {
        super(2);
        this.$onClick = r8;
        this.$modifier = r6;
        this.$enabled = z;
        this.$shape = r7;
        this.$colors = r4;
        this.$elevation = r5;
        this.$contentPadding = r3;
        this.$interactionSource = r2;
        this.$content = r9;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C161337ma A0L = C90474aD.A0L(obj, obj2);
        AnonymousClass00S r8 = this.$onClick;
        C161267mT r6 = this.$modifier;
        boolean z = this.$enabled;
        C157657dt r7 = this.$shape;
        AnonymousClass674 r3 = this.$colors;
        AnonymousClass6O8 r4 = this.$elevation;
        AnonymousClass5WA.A00(this.$interactionSource, this.$contentPadding, r3, r4, A0L, r6, r7, r8, this.$content, AnonymousClass5WD.A00(this.$$changed), this.$$default, z);
        return AnonymousClass0AJ.A00;
    }
}
