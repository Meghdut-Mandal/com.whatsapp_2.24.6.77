package X;

import java.util.Map;

/* renamed from: X.66v  reason: invalid class name and case insensitive filesystem */
public final class C1270766v {
    public final C160467l3 A00;
    public final AnonymousClass6EW A01;
    public final String A02;

    public C1270766v(C160467l3 r2, C131376Ou r3, String str) {
        AnonymousClass00C.A0D(r3, 1);
        this.A02 = str;
        this.A00 = r2;
        this.A01 = r3.A02(str);
    }

    public final void A00(C123405wR r24, String str, String str2, Map map, Map map2, int i, int i2, boolean z, boolean z2) {
        AnonymousClass6EW r4;
        C16360p7 r3;
        Map map3 = map;
        Object obj = map3.get("app_id");
        if (obj != null) {
            this.A01.A02(new AnonymousClass701((String) obj));
        }
        String str3 = str;
        String str4 = str2;
        Map map4 = map2;
        int i3 = i;
        C153517Oq r16 = new C153517Oq(this, str3, str4, map3, map4, i3);
        C123405wR r32 = r24;
        if (r32.A02 == C108025Rw.MODAL) {
            if (!z) {
                r4 = this.A01;
                r4.A01(new C163227pr(r16, 9), C149076zt.class, this);
                AnonymousClass6EW.A00(r4, C149136zz.class, this, 8);
                this.A00.Bl6(r32.A01, r32.A04, r32.A00, r32.A03.name(), str3, this.A02, str4, map3, map4, i3, i2, z2);
                r3 = new C149016zn();
            }
            r16.invoke();
            r4 = this.A01;
            r3 = new AnonymousClass708(r32.A04, r32.A03.name(), r32.A00);
        } else {
            if (!z) {
                this.A00.Bku(r32.A04, r32.A00, r32.A03.name(), str3, this.A02, str4, map3, map4, i3);
                return;
            }
            r16.invoke();
            r4 = this.A01;
            r3 = new AnonymousClass708(r32.A04, r32.A03.name(), r32.A00);
        }
        r4.A02(r3);
    }
}
