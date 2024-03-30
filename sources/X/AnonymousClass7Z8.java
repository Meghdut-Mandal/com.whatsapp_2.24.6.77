package X;

import java.util.Map;

/* renamed from: X.7Z8  reason: invalid class name */
public final class AnonymousClass7Z8 extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AnonymousClass7bR $color = null;
    public final /* synthetic */ Map $inlineContent;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ int $minLines;
    public final /* synthetic */ C161267mT $modifier;
    public final /* synthetic */ C006302t $onTextLayout;
    public final /* synthetic */ int $overflow;
    public final /* synthetic */ boolean $softWrap;
    public final /* synthetic */ AnonymousClass6V8 $style;
    public final /* synthetic */ AnonymousClass72L $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7Z8(C161267mT r2, AnonymousClass72L r3, AnonymousClass6V8 r4, Map map, C006302t r6, int i, int i2, int i3, int i4, int i5, boolean z) {
        super(2);
        this.$text = r3;
        this.$modifier = r2;
        this.$style = r4;
        this.$onTextLayout = r6;
        this.$overflow = i;
        this.$softWrap = z;
        this.$maxLines = i2;
        this.$minLines = i3;
        this.$inlineContent = map;
        this.$$changed = i4;
        this.$$default = i5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C161337ma A0L = C90474aD.A0L(obj, obj2);
        AnonymousClass72L r3 = this.$text;
        C161267mT r2 = this.$modifier;
        AnonymousClass6V8 r4 = this.$style;
        C006302t r6 = this.$onTextLayout;
        int i = this.$overflow;
        boolean z = this.$softWrap;
        AnonymousClass6U0.A00(A0L, r2, r3, r4, this.$inlineContent, r6, i, this.$maxLines, this.$minLines, AnonymousClass5WD.A00(this.$$changed), this.$$default, z);
        return AnonymousClass0AJ.A00;
    }
}
