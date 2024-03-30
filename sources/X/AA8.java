package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class AA8 implements C159417jK {
    public final AnonymousClass8Y6 A00;
    public final AnonymousClass12O A01;
    public final AnonymousClass1AC A02;
    public final AnonymousClass196 A03;
    public final C220412q A04;

    public void BV1() {
        AnonymousClass196 r3 = this.A03;
        if (r3.A0S()) {
            ArrayList A042 = AnonymousClass1AC.A04(this.A02, "pnForLidChat", false);
            HashSet A16 = C36441kJ.A16();
            Iterator it = A042.iterator();
            while (it.hasNext()) {
                A16.add(((C176038bT) it.next()).A00);
            }
            Set A0G = this.A04.A0G();
            AnonymousClass00C.A08(A0G);
            Set A012 = C15060md.A01(C15060md.A03(new C22377Ale(this), new C12810ih(new C22376Ald(A16), C15060md.A03(C22519Ao1.A00, new C18650tV(A0G, 0)), false)));
            if (!A012.isEmpty()) {
                r3.A0M(A012);
            }
        }
    }

    public AA8(AnonymousClass196 r1, AnonymousClass8Y6 r2, C220412q r3, AnonymousClass12O r4, AnonymousClass1AC r5) {
        C36321k7.A18(r3, r1, r4, r5);
        this.A04 = r3;
        this.A03 = r1;
        this.A01 = r4;
        this.A02 = r5;
        this.A00 = r2;
    }
}
