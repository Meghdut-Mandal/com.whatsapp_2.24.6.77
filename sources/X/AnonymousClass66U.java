package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.66U  reason: invalid class name */
public final class AnonymousClass66U {
    public final C131376Ou A00;
    public final String A01;

    public AnonymousClass66U(C131376Ou r2, String str) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
        this.A01 = str;
    }

    public final void A00(C108215Sq r13, AnonymousClass6PH r14, String str, String str2, String str3, Map map) {
        String str4 = str2;
        C36321k7.A0x(str, str4);
        this.A00.A02(this.A01).A02(new AnonymousClass70D(r13, r14, str, (String) C007103b.A0L(AnonymousClass099.A0L(str4, new String[]{":"}, 0)), (String) C007103b.A0N(C90494aF.A0i(str4, ":")), str3, map));
    }

    public final void A01(AnonymousClass6PH r6, String str, String str2, Map map) {
        LinkedHashMap linkedHashMap;
        AnonymousClass00C.A0D(str2, 1);
        AnonymousClass6EW A02 = this.A00.A02(this.A01);
        if (map != null) {
            linkedHashMap = C201759kL.A01((Integer) map.get(C108355Te.ERROR_CODE.key), C36431kI.A1A(C108355Te.ERROR_NAME.key, map), C36431kI.A1A(C108355Te.ERROR_MESSAGE.key, map), C90514aH.A15(C108355Te.ERROR_PARAMS.key, map));
        } else if (r6 != null) {
            linkedHashMap = C201759kL.A01(r6.A00, r6.A02, r6.A01, (Map) null);
        } else {
            linkedHashMap = null;
        }
        A02.A02(new AnonymousClass709(str, str2, linkedHashMap));
    }
}
