package X;

import java.util.Map;

/* renamed from: X.1A3  reason: invalid class name */
public final class AnonymousClass1A3 {
    public final C220412q A00;
    public final AnonymousClass177 A01;
    public final Map A02;

    public AnonymousClass1A3(C220412q r2, AnonymousClass176 r3) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A00 = r2;
        AnonymousClass177 r0 = r3.A01;
        AnonymousClass00C.A08(r0);
        this.A01 = r0;
        Map map = r3.A02;
        AnonymousClass00C.A08(map);
        this.A02 = map;
    }

    public static final boolean A00(AnonymousClass3T1 r5, C006302t r6) {
        AnonymousClass11F r0 = r5.A1J.A00;
        C18740tg.A06(r0);
        long j = r5.A1O;
        AnonymousClass00C.A0B(r0);
        if (j <= ((Number) r6.invoke(r0)).longValue()) {
            return true;
        }
        return false;
    }

    public final void A01(C64933Qa r2) {
        if (r2 != null) {
            this.A01.A02(r2);
            this.A02.remove(r2);
        }
    }
}
