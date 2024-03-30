package X;

import java.util.Map;

/* renamed from: X.9oL  reason: invalid class name and case insensitive filesystem */
public class C203579oL implements C159657ji {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C203579oL(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public void BXS(AnonymousClass6PH r4, Map map) {
        if (this.A03 != 0) {
            ((C79593ty) this.A02).A0C(C36381kD.A0j());
            return;
        }
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass8h3.A00((C194419Pp) this.A00, (AnonymousClass8h3) this.A02, r4, (Map) this.A01, map);
    }

    public void BiH(Map map) {
        if (this.A03 != 0) {
            ((AnonymousClass9UG) this.A00).A00.A00.A0H.remove("PaymentData");
            if (map == null) {
                C165577te.A1M("BrazilCardPhoenixHelper", "launchPhoenixFlow :: terminalParams is null");
                ((C79593ty) this.A02).A0C(false);
                return;
            }
            Object obj = map.get(C52122ov.A02.key);
            if (obj instanceof C128176Bf) {
                ((C22989Azf) this.A01).BYC((int) ((C128176Bf) obj).A00);
                ((C79593ty) this.A02).A0C(false);
            } else if (obj instanceof Map) {
                ((C22989Azf) this.A01).BYC(AnonymousClass000.A0I(((Map) obj).get(C108355Te.ERROR_CODE.key)));
            } else {
                ((C22989Azf) this.A01).BYC(0);
                ((C79593ty) this.A02).A0C(true);
            }
            ((C79593ty) this.A02).A0C(true);
            return;
        }
        AnonymousClass8h3.A00((C194419Pp) this.A00, (AnonymousClass8h3) this.A02, (AnonymousClass6PH) null, (Map) this.A01, map);
    }
}
