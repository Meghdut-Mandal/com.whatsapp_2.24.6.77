package X;

import java.util.Map;

/* renamed from: X.6AT  reason: invalid class name */
public final class AnonymousClass6AT {
    public final C20810yC A00;
    public final C128626Cz A01;

    public final void A01(C202059ky r10, Integer num, String str) {
        int i;
        if (r10 != null) {
            i = r10.A00;
        } else {
            i = 0;
        }
        String A0l = AnonymousClass000.A0l(num, str, AnonymousClass000.A0u());
        this.A01.A01(num, A0l, "error_code", (long) i);
        A02(num, str, 3);
    }

    public final Integer A00(String str) {
        if (!this.A00.A0E(1546)) {
            return null;
        }
        C128626Cz r3 = this.A01;
        int A002 = r3.A00(185470120, str, "unknown");
        String A0r = AnonymousClass000.A0r(str, AnonymousClass000.A0u(), A002);
        Integer valueOf = Integer.valueOf(A002);
        r3.A02(valueOf, A0r, "iq_action", str);
        return valueOf;
    }

    public final void A02(Integer num, String str, short s) {
        if (num != null) {
            String A0l = AnonymousClass000.A0l(num, str, AnonymousClass000.A0u());
            C128626Cz r1 = this.A01;
            int intValue = num.intValue();
            AnonymousClass00C.A0D(A0l, 0);
            Map map = r1.A03;
            C21700zf r0 = (C21700zf) map.get(A0l);
            if (r0 != null) {
                r0.A04(intValue, s);
                map.remove(A0l);
            }
        }
    }

    public AnonymousClass6AT(C20810yC r1, C128626Cz r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
