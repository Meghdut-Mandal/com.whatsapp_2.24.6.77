package X;

import java.util.Map;

/* renamed from: X.6FY  reason: invalid class name */
public abstract class AnonymousClass6FY {
    public final C20810yC A00;
    public final C24631De A01;
    public final AnonymousClass6AT A02;
    public final C128626Cz A03;

    public void A04(Integer num, String str) {
        this.A02.A02(num, str, 2);
    }

    public Integer A00(String str, int i) {
        if (!this.A00.A0E(1546)) {
            return null;
        }
        if (str == null) {
            str = "unknown";
        }
        C128626Cz r4 = this.A03;
        int A002 = r4.A00(i, "p2p_flow_tag", str);
        String A0r = AnonymousClass000.A0r("p2p_flow_tag", AnonymousClass000.A0u(), A002);
        Integer valueOf = Integer.valueOf(A002);
        r4.A02(valueOf, A0r, "entry_point", str);
        C202159l8 A022 = this.A01.A02();
        if (A022 != null) {
            A07("country", A022.A03, A002);
        }
        A05("new_payment", A002);
        return valueOf;
    }

    public void A01(int i, String str) {
        if (this.A00.A0E(1546)) {
            C128626Cz r4 = this.A03;
            Map map = r4.A03;
            C21700zf r2 = (C21700zf) map.get(str);
            if (r2 == null) {
                C21710zg r1 = new C21710zg(i);
                r2 = r4.A00.A01(r1, str);
                r1.A04 = true;
                AnonymousClass00C.A0B(r2);
                map.put(str, r2);
            }
            r2.A0D("unknown", -1);
            C202159l8 A022 = this.A01.A02();
            if (A022 != null) {
                r4.A02((Integer) null, str, "country", A022.A03);
            }
        }
    }

    public void A02(int i, short s) {
        Object obj;
        C128626Cz r5 = this.A03;
        Integer valueOf = Integer.valueOf(i);
        Map map = r5.A03;
        if (valueOf == null) {
            obj = map.get("p2p_flow_tag");
        } else {
            obj = map.get(AnonymousClass000.A0l(valueOf, "p2p_flow_tag", AnonymousClass000.A0u()));
        }
        C21700zf r3 = (C21700zf) obj;
        if (r3 != null) {
            String A0r = AnonymousClass000.A0r("p2p_flow_tag", AnonymousClass000.A0u(), i);
            Map map2 = r5.A02;
            String A1A = C36431kI.A1A(A0r, map2);
            if (A1A != null) {
                r3.A01(i, A1A);
                map2.remove(A0r);
            }
            r3.A04(i, s);
            map.remove(A0r);
        }
    }

    public void A03(C202059ky r8, String str) {
        if (r8 == null) {
            r8 = new C202059ky();
        }
        C128626Cz r1 = this.A03;
        r1.A01((Integer) null, str, "error_code", (long) r8.A00);
        Map map = r1.A03;
        C21700zf r0 = (C21700zf) map.get(str);
        if (r0 != null) {
            r0.A0C(3);
            map.remove(str);
        }
    }

    public void A05(String str, int i) {
        Object obj;
        C128626Cz r5 = this.A03;
        Integer valueOf = Integer.valueOf(i);
        if (valueOf == null) {
            obj = r5.A03.get("p2p_flow_tag");
        } else {
            obj = r5.A03.get(AnonymousClass000.A0l(valueOf, "p2p_flow_tag", AnonymousClass000.A0u()));
        }
        C21700zf r4 = (C21700zf) obj;
        if (r4 != null) {
            String A0r = AnonymousClass000.A0r("p2p_flow_tag", AnonymousClass000.A0u(), i);
            Map map = r5.A02;
            String A1A = C36431kI.A1A(A0r, map);
            if (A1A != null) {
                if (A1A.equals(str)) {
                    C36321k7.A1Q("PaymentsPerfTrackerManager.markerFlowPoint used the same qpl flow point twice: ", str, AnonymousClass000.A0u());
                    return;
                }
                r4.A01(i, A1A);
            }
            r4.A02(i, str);
            map.put(A0r, str);
        }
    }

    public AnonymousClass6FY(C20810yC r1, C24631De r2, AnonymousClass6AT r3, C128626Cz r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public void A06(String str, long j, int i) {
        this.A03.A01(Integer.valueOf(i), AnonymousClass000.A0r("p2p_flow_tag", AnonymousClass000.A0u(), i), str, j);
    }

    public void A07(String str, String str2, int i) {
        this.A03.A02(Integer.valueOf(i), AnonymousClass000.A0r("p2p_flow_tag", AnonymousClass000.A0u(), i), str, str2);
    }

    public void A08(String str, boolean z, int i) {
        String A0r = AnonymousClass000.A0r("p2p_flow_tag", AnonymousClass000.A0u(), i);
        C128626Cz r3 = this.A03;
        Integer valueOf = Integer.valueOf(i);
        AnonymousClass00C.A0D(A0r, 0);
        C155067Uq r1 = new C155067Uq(valueOf, str, z);
        Object obj = r3.A03.get(A0r);
        if (obj != null) {
            r1.invoke(obj);
        }
    }
}
