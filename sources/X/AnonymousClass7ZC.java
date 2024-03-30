package X;

/* renamed from: X.7ZC  reason: invalid class name */
public final class AnonymousClass7ZC extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ C129796Im $fontFamily;
    public final /* synthetic */ long $fontSize;
    public final /* synthetic */ AnonymousClass68R $fontStyle;
    public final /* synthetic */ AnonymousClass72W $fontWeight;
    public final /* synthetic */ long $letterSpacing;
    public final /* synthetic */ long $lineHeight;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ int $minLines;
    public final /* synthetic */ C161267mT $modifier;
    public final /* synthetic */ C006302t $onTextLayout;
    public final /* synthetic */ int $overflow;
    public final /* synthetic */ boolean $softWrap;
    public final /* synthetic */ AnonymousClass6V8 $style;
    public final /* synthetic */ String $text;
    public final /* synthetic */ C131266Oj $textAlign;
    public final /* synthetic */ C131366Ot $textDecoration;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7ZC(C161267mT r3, AnonymousClass6V8 r4, C129796Im r5, AnonymousClass68R r6, AnonymousClass72W r7, C131266Oj r8, C131366Ot r9, String str, C006302t r11, int i, int i2, int i3, int i4, int i5, int i6, long j, long j2, long j3, long j4, boolean z) {
        super(2);
        this.$text = str;
        this.$modifier = r3;
        this.$color = j;
        this.$fontSize = j2;
        this.$fontStyle = r6;
        this.$fontWeight = r7;
        this.$fontFamily = r5;
        this.$letterSpacing = j3;
        this.$textDecoration = r9;
        this.$textAlign = r8;
        this.$lineHeight = j4;
        this.$overflow = i;
        this.$softWrap = z;
        this.$maxLines = i2;
        this.$minLines = i3;
        this.$onTextLayout = r11;
        this.$style = r4;
        this.$$changed = i4;
        this.$$changed1 = i5;
        this.$$default = i6;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C161337ma A0L = C90474aD.A0L(obj, obj2);
        String str = this.$text;
        C161267mT r42 = this.$modifier;
        long j = this.$color;
        long j2 = this.$fontSize;
        AnonymousClass68R r41 = this.$fontStyle;
        AnonymousClass72W r20 = this.$fontWeight;
        C129796Im r19 = this.$fontFamily;
        long j3 = this.$letterSpacing;
        C131366Ot r18 = this.$textDecoration;
        C131266Oj r17 = this.$textAlign;
        long j4 = this.$lineHeight;
        int i = this.$overflow;
        boolean z = this.$softWrap;
        int i2 = this.$maxLines;
        int i3 = this.$minLines;
        C006302t r10 = this.$onTextLayout;
        C161267mT r172 = r42;
        AnonymousClass6V8 r182 = this.$style;
        AnonymousClass68R r202 = r41;
        AnonymousClass6UK.A01(A0L, r172, r182, r19, r202, r20, r17, r18, str, r10, i, i2, i3, AnonymousClass5WD.A00(this.$$changed), AnonymousClass5WD.A01(this.$$changed1), this.$$default, j, j2, j3, j4, z);
        return AnonymousClass0AJ.A00;
    }
}
