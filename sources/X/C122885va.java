package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5va  reason: invalid class name and case insensitive filesystem */
public class C122885va {
    public final int A00;
    public final int A01;
    public final String A02;
    public final Map A03 = C90524aI.A0s();

    public C122885va(String str, Map map, int i, int i2) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = i2;
        if (map != null) {
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                this.A03.put(A11.getKey(), A11.getValue());
            }
        }
    }

    public static int A00(AnonymousClass005 r0, int i) {
        return C133056Wm.A00(((AnonymousClass61J) r0.get()).A00, i).A01;
    }

    public static int A01(AnonymousClass005 r0, int i) {
        return C133056Wm.A00(((C148316yf) r0.get()).A06, i).A00;
    }
}
