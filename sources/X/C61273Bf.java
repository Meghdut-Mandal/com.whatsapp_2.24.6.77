package X;

import java.util.List;

/* renamed from: X.3Bf  reason: invalid class name and case insensitive filesystem */
public abstract class C61273Bf {
    public C56962xR A00;

    public void A00() {
        C56962xR r0 = this.A00;
        if (r0 != null) {
            AnonymousClass3B4 r4 = r0.A00;
            C61283Bg r02 = r4.A00;
            if (r02 != null) {
                r02.A00();
            }
            if (r4.A01) {
                r4.A04.removeCallbacks(r4.A09);
                long now = r4.A05.now();
                if (r4.A0B.isEmpty()) {
                    C61973Ef r03 = r4.A06;
                    List list = r4.A0A;
                    r03.A00(list);
                    AnonymousClass3PT r04 = r4.A08;
                    r04.A02(list, now);
                    r04.A01();
                } else {
                    throw new IllegalStateException();
                }
            }
            r4.A01 = false;
        }
    }
}
