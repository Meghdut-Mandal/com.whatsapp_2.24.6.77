package X;

import java.util.Iterator;

/* renamed from: X.7J3  reason: invalid class name */
public final class AnonymousClass7J3 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass6SD $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7J3(AnonymousClass6SD r2) {
        super(0);
        this.$state = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C136906fE r2 = this.$state.A00;
        if (r2 != null) {
            C137846gp r3 = r2.A09;
            if (r2.A03 != C1506776e.A00(r3.A0Q.A00)) {
                Iterator A10 = C36371kC.A10(r2.A0A);
                while (A10.hasNext()) {
                    ((C123575wj) C36351kA.A0u(A10)).A04 = true;
                }
                if (!r3.A0P.A0E) {
                    C137846gp.A03(r3);
                }
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass001.A08("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
