package X;

import androidx.compose.ui.Alignment;

/* renamed from: X.7VU  reason: invalid class name */
public final class AnonymousClass7VU extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ int $boxHeight;
    public final /* synthetic */ int $boxWidth;
    public final /* synthetic */ C161687nJ $measurable;
    public final /* synthetic */ AnonymousClass6Q4 $placeable;
    public final /* synthetic */ C161717nM $this_measure;
    public final /* synthetic */ C137646gU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7VU(C137646gU r2, C161687nJ r3, C161717nM r4, AnonymousClass6Q4 r5, int i, int i2) {
        super(1);
        this.$placeable = r5;
        this.$measurable = r3;
        this.$this_measure = r4;
        this.$boxWidth = i;
        this.$boxHeight = i2;
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass6Q4 r4 = this.$placeable;
        C161687nJ r1 = this.$measurable;
        AnonymousClass5RW layoutDirection = this.$this_measure.getLayoutDirection();
        int i = this.$boxWidth;
        int i2 = this.$boxHeight;
        Alignment alignment = this.this$0.A00;
        r1.BF4();
        AnonymousClass6WO.A00(r4, 0.0f, alignment.B0u(layoutDirection, C90484aE.A0J(r4.A01, r4.A00), C90484aE.A0J(i, i2)));
        return AnonymousClass0AJ.A00;
    }
}
