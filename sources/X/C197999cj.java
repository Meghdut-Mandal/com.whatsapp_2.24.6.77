package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9cj  reason: invalid class name and case insensitive filesystem */
public final class C197999cj {
    public final C19970wo A00;
    public final C20810yC A01;
    public final Map A02 = C36431kI.A1G();
    public final AnonymousClass00T A03 = C36431kI.A1I(new C22185Ai8(this));
    public final AnonymousClass00T A04 = C36431kI.A1I(new C22186Ai9(this));

    public static final void A00(C197999cj r9) {
        Map map = r9.A02;
        synchronized (map) {
            ArrayList A0I = AnonymousClass001.A0I();
            long A002 = C19970wo.A00(r9.A00);
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                String A0f = C90494aF.A0f(A11);
                C199839g6 r5 = (C199839g6) A11.getValue();
                if (r5.A00 < A002) {
                    r5.A02 = C36431kI.A1G();
                }
                if (r5.A01 < A002) {
                    r5.A03 = C36431kI.A1G();
                }
                if (r5.A02.isEmpty() && r5.A03.isEmpty()) {
                    A0I.add(A0f);
                }
            }
            AnonymousClass3R6.A02(map, A0I.toArray(new String[0]));
        }
    }

    public C197999cj(C19970wo r2, C20810yC r3) {
        C36321k7.A0x(r3, r2);
        this.A01 = r3;
        this.A00 = r2;
    }
}
