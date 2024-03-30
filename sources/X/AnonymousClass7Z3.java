package X;

import androidx.compose.ui.Alignment;

/* renamed from: X.7Z3  reason: invalid class name */
public final class AnonymousClass7Z3 extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Alignment $alignment;
    public final /* synthetic */ float $alpha;
    public final /* synthetic */ C114365h6 $colorFilter;
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ C161187mL $contentScale;
    public final /* synthetic */ C161267mT $modifier;
    public final /* synthetic */ C128906Eb $painter;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7Z3(Alignment alignment, C161267mT r3, C114365h6 r4, C128906Eb r5, C161187mL r6, String str, float f, int i, int i2) {
        super(2);
        this.$painter = r5;
        this.$contentDescription = str;
        this.$modifier = r3;
        this.$alignment = alignment;
        this.$contentScale = r6;
        this.$alpha = f;
        this.$colorFilter = r4;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C161337ma A0L = C90474aD.A0L(obj, obj2);
        C128906Eb r5 = this.$painter;
        String str = this.$contentDescription;
        C161267mT r3 = this.$modifier;
        C109005Vv.A00(A0L, this.$alignment, r3, this.$colorFilter, r5, this.$contentScale, str, this.$alpha, AnonymousClass5WD.A00(this.$$changed), this.$$default);
        return AnonymousClass0AJ.A00;
    }
}
