package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.7aG  reason: invalid class name and case insensitive filesystem */
public final class C156617aG extends AnonymousClass00R implements C019408g {
    public final /* synthetic */ long $containerConstraints;
    public final /* synthetic */ C161697nK $this_null;
    public final /* synthetic */ int $totalHorizontalPadding;
    public final /* synthetic */ int $totalVerticalPadding;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C156617aG(C161697nK r2, int i, int i2, long j) {
        super(3);
        this.$this_null = r2;
        this.$containerConstraints = j;
        this.$totalHorizontalPadding = i;
        this.$totalVerticalPadding = i2;
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        int A0I = AnonymousClass000.A0I(obj);
        int A0I2 = AnonymousClass000.A0I(obj2);
        C161697nK r4 = this.$this_null;
        long j = this.$containerConstraints;
        return C90474aD.A0M(r4, (C006302t) obj3, Constraints.A06(j, A0I + this.$totalHorizontalPadding), Constraints.A05(j, A0I2 + this.$totalVerticalPadding));
    }
}
