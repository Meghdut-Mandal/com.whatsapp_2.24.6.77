package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4Kr  reason: invalid class name and case insensitive filesystem */
public final class C86374Kr extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C46512Yd this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86374Kr(C46512Yd r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C40131uz A3k;
        C52382pL r4;
        C62913Ia r7 = (C62913Ia) obj;
        C46512Yd r3 = this.this$0;
        AnonymousClass00C.A0B(r7);
        r3.A04.Bp1(new C1502074j(r3, r7, 42));
        int ordinal = r7.A01.ordinal();
        boolean z = true;
        if (ordinal != 3) {
            if (ordinal == 2) {
                A3k = r3.A3k();
                z = false;
            }
            return AnonymousClass0AJ.A00;
        }
        A3k = r3.A3k();
        C28981Uw r5 = r7.A00;
        C75933o3 r0 = A3k.A09;
        if (z) {
            r4 = C52382pL.GUEST;
        } else {
            r4 = C52382pL.SUBSCRIBED;
        }
        C604838a r02 = (C604838a) r0.A00.A04();
        if (r02 != null) {
            List list = r02.A03;
            ArrayList<C44072La> A0I = AnonymousClass001.A0I();
            for (Object next : list) {
                if (AnonymousClass00C.A0J(((C65073Qp) next).A06(), r5)) {
                    A0I.add(next);
                }
            }
            for (C44072La r03 : A0I) {
                r03.A09 = r4;
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
