package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.17B  reason: invalid class name */
public final class AnonymousClass17B {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass00T A02 = new AnonymousClass00U(new AnonymousClass17C(this));
    public final AnonymousClass00T A03 = new AnonymousClass00U(new AnonymousClass17D(this));
    public final Map A04 = new LinkedHashMap();

    public AnonymousClass17B(AnonymousClass005 r3, AnonymousClass005 r4) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r4, 2);
        this.A00 = r3;
        this.A01 = r4;
    }

    public final AnonymousClass9XG A00(C019108d r5) {
        AnonymousClass9XG r2;
        synchronized (this) {
            Map map = this.A04;
            Object obj = map.get(r5);
            if (obj == null) {
                AnonymousClass9UT r1 = (AnonymousClass9UT) this.A02.getValue();
                AnonymousClass00C.A08(r1);
                C198879eL r0 = (C198879eL) this.A03.getValue();
                AnonymousClass00C.A08(r0);
                obj = new AnonymousClass9XG(r1, r0, r5);
                map.put(r5, obj);
            }
            r2 = (AnonymousClass9XG) obj;
        }
        return r2;
    }
}
