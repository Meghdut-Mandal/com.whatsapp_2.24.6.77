package X;

import java.util.Map;

/* renamed from: X.7ZD  reason: invalid class name */
public final class AnonymousClass7ZD extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ C129796Im $fontFamily;
    public final /* synthetic */ long $fontSize;
    public final /* synthetic */ AnonymousClass68R $fontStyle;
    public final /* synthetic */ AnonymousClass72W $fontWeight;
    public final /* synthetic */ Map $inlineContent;
    public final /* synthetic */ long $letterSpacing;
    public final /* synthetic */ long $lineHeight;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ int $minLines;
    public final /* synthetic */ C161267mT $modifier;
    public final /* synthetic */ C006302t $onTextLayout;
    public final /* synthetic */ int $overflow;
    public final /* synthetic */ boolean $softWrap;
    public final /* synthetic */ AnonymousClass6V8 $style;
    public final /* synthetic */ AnonymousClass72L $text;
    public final /* synthetic */ C131266Oj $textAlign;
    public final /* synthetic */ C131366Ot $textDecoration;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7ZD(C161267mT r3, AnonymousClass72L r4, AnonymousClass6V8 r5, C129796Im r6, AnonymousClass68R r7, AnonymousClass72W r8, C131266Oj r9, C131366Ot r10, Map map, C006302t r12, int i, int i2, int i3, int i4, int i5, int i6, long j, long j2, long j3, long j4, boolean z) {
        super(2);
        this.$text = r4;
        this.$modifier = r3;
        this.$color = j;
        this.$fontSize = j2;
        this.$fontStyle = r7;
        this.$fontWeight = r8;
        this.$fontFamily = r6;
        this.$letterSpacing = j3;
        this.$textDecoration = r10;
        this.$textAlign = r9;
        this.$lineHeight = j4;
        this.$overflow = i;
        this.$softWrap = z;
        this.$maxLines = i2;
        this.$minLines = i3;
        this.$inlineContent = map;
        this.$onTextLayout = r12;
        this.$style = r5;
        this.$$changed = i4;
        this.$$changed1 = i5;
        this.$$default = i6;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C161337ma A0L = C90474aD.A0L(obj, obj2);
        AnonymousClass72L r43 = this.$text;
        C161267mT r42 = this.$modifier;
        long j = this.$color;
        long j2 = this.$fontSize;
        AnonymousClass68R r21 = this.$fontStyle;
        AnonymousClass72W r22 = this.$fontWeight;
        C129796Im r20 = this.$fontFamily;
        long j3 = this.$letterSpacing;
        C131366Ot r19 = this.$textDecoration;
        C131266Oj r18 = this.$textAlign;
        long j4 = this.$lineHeight;
        int i = this.$overflow;
        boolean z = this.$softWrap;
        int i2 = this.$maxLines;
        int i3 = this.$minLines;
        Map map = this.$inlineContent;
        C006302t r10 = this.$onTextLayout;
        C161267mT r17 = r42;
        AnonymousClass72L r182 = r43;
        AnonymousClass6V8 r192 = this.$style;
        AnonymousClass6UK.A00(A0L, r17, r182, r192, r20, r21, r22, r18, r19, map, r10, i, i2, i3, AnonymousClass5WD.A00(this.$$changed), AnonymousClass5WD.A01(this.$$changed1), this.$$default, j, j2, j3, j4, z);
        return AnonymousClass0AJ.A00;
    }
}
