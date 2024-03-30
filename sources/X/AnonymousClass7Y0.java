package X;

import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;

/* renamed from: X.7Y0  reason: invalid class name */
public final class AnonymousClass7Y0 extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ AnonymousClass6SD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7Y0(AnonymousClass6SD r2) {
        super(2);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C137846gp r5 = (C137846gp) obj;
        AnonymousClass6SD r2 = this.this$0;
        C136906fE r1 = r5.A05;
        if (r1 == null) {
            r1 = new C136906fE(r2.A01, r5);
            r5.A05 = r1;
        }
        r2.A00 = r1;
        C136906fE r0 = this.this$0.A00;
        if (r0 != null) {
            r0.A04();
            AnonymousClass6SD r02 = this.this$0;
            C136906fE r3 = r02.A00;
            if (r3 != null) {
                SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = r02.A01;
                if (r3.A05 != subcomposeSlotReusePolicy) {
                    r3.A05 = subcomposeSlotReusePolicy;
                    C136906fE.A02(r3, false);
                    r3.A09.A0X(false, true);
                }
                return AnonymousClass0AJ.A00;
            }
            throw AnonymousClass001.A08("SubcomposeLayoutState is not attached to SubcomposeLayout");
        }
        throw AnonymousClass001.A08("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
