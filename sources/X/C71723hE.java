package X;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3hE  reason: invalid class name and case insensitive filesystem */
public final class C71723hE implements AnonymousClass1JB {
    public final C001700s A00;
    public final C220412q A01;

    private final AnonymousClass3IZ A00(AnonymousClass11F r31) {
        C44072La r5;
        C65073Qp A09 = this.A01.A09(r31, false);
        AnonymousClass3IZ r3 = null;
        if ((A09 instanceof C44072La) && (r5 = (C44072La) A09) != null) {
            r3 = new AnonymousClass3IZ(C44072La.A00((C65073Qp) null, (C52382pL) null, r5, (C52452pS) null, (C52162oz) null, (C52282pB) null, (C52182p1) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 536870911, 0, 0, 0, 0, 0, 0, false), true);
            C001700s r2 = this.A00;
            Map map = (Map) r2.A04();
            if (map != null) {
                map.put(r3.A00.A06(), r3);
            }
            r2.A0D(r2.A04());
        }
        return r3;
    }

    public void BQH(AnonymousClass11F r1) {
    }

    public void BQI() {
    }

    public void BQJ(AnonymousClass11F r5, boolean z) {
        AnonymousClass00C.A0D(r5, 0);
        AnonymousClass3IZ A002 = A00(r5);
        if (A002 != null) {
            C001700s r2 = this.A00;
            Map map = (Map) r2.A04();
            if (map != null) {
                map.put(A002.A00.A06(), A002);
            }
            r2.A0D(r2.A04());
        }
    }

    public void BQK(AnonymousClass11F r1, Collection collection, int i) {
    }

    public void BQL(AnonymousClass11F r4) {
        AnonymousClass00C.A0D(r4, 0);
        C001700s r1 = this.A00;
        Map map = (Map) r1.A04();
        if (map != null && map.remove(r4) != null) {
            AnonymousClass00C.A0D(r1, 0);
            r1.A0D(r1.A04());
        }
    }

    public void BQM(AnonymousClass11F r1) {
    }

    public final AnonymousClass3IZ A01(AnonymousClass11F r2) {
        AnonymousClass3IZ r0;
        Map map = (Map) this.A00.A04();
        if (map == null || (r0 = (AnonymousClass3IZ) map.get(r2)) == null) {
            return A00(r2);
        }
        return r0;
    }

    public C71723hE(AnonymousClass1DP r3, C220412q r4) {
        C36321k7.A0x(r4, r3);
        this.A01 = r4;
        C001700s A0S = C36431kI.A0S();
        this.A00 = A0S;
        A0S.A0D(new ConcurrentHashMap());
        r3.registerObserver(this);
    }
}
