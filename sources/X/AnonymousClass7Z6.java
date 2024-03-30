package X;

/* renamed from: X.7Z6  reason: invalid class name */
public final class AnonymousClass7Z6 extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AnonymousClass7bR $color = null;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ int $minLines;
    public final /* synthetic */ C161267mT $modifier;
    public final /* synthetic */ C006302t $onTextLayout;
    public final /* synthetic */ int $overflow;
    public final /* synthetic */ boolean $softWrap;
    public final /* synthetic */ AnonymousClass6V8 $style;
    public final /* synthetic */ String $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7Z6(C161267mT r2, AnonymousClass6V8 r3, String str, C006302t r5, int i, int i2, int i3, int i4, int i5, boolean z) {
        super(2);
        this.$text = str;
        this.$modifier = r2;
        this.$style = r3;
        this.$onTextLayout = r5;
        this.$overflow = i;
        this.$softWrap = z;
        this.$maxLines = i2;
        this.$minLines = i3;
        this.$$changed = i4;
        this.$$default = i5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C161337ma A0L = C90474aD.A0L(obj, obj2);
        String str = this.$text;
        AnonymousClass6U0.A02(A0L, this.$modifier, this.$style, str, this.$onTextLayout, this.$overflow, this.$maxLines, this.$minLines, AnonymousClass5WD.A00(this.$$changed), this.$$default, this.$softWrap);
        return AnonymousClass0AJ.A00;
    }
}
