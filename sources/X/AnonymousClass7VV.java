package X;

import androidx.compose.ui.Alignment;
import java.util.List;

/* renamed from: X.7VV  reason: invalid class name */
public final class AnonymousClass7VV extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C10790fE $boxHeight;
    public final /* synthetic */ C10790fE $boxWidth;
    public final /* synthetic */ List $measurables;
    public final /* synthetic */ AnonymousClass6Q4[] $placeables;
    public final /* synthetic */ C161717nM $this_measure;
    public final /* synthetic */ C137646gU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7VV(C137646gU r2, C161717nM r3, List list, C10790fE r5, C10790fE r6, AnonymousClass6Q4[] r7) {
        super(1);
        this.$placeables = r7;
        this.$measurables = list;
        this.$this_measure = r3;
        this.$boxWidth = r5;
        this.$boxHeight = r6;
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass6Q4[] r9 = this.$placeables;
        List list = this.$measurables;
        C161717nM r10 = this.$this_measure;
        C10790fE r7 = this.$boxWidth;
        C10790fE r6 = this.$boxHeight;
        C137646gU r5 = this.this$0;
        int length = r9.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            AnonymousClass6Q4 r2 = r9[i];
            int i3 = i2 + 1;
            AnonymousClass00C.A0E(r2, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            AnonymousClass5RW layoutDirection = r10.getLayoutDirection();
            int i4 = r7.element;
            int i5 = r6.element;
            Alignment alignment = r5.A00;
            ((C157687dw) list.get(i2)).BF4();
            AnonymousClass6WO.A00(r2, 0.0f, alignment.B0u(layoutDirection, C90484aE.A0J(r2.A01, r2.A00), C90484aE.A0J(i4, i5)));
            i++;
            i2 = i3;
        }
        return AnonymousClass0AJ.A00;
    }
}
