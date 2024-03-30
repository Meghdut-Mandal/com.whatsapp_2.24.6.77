package X;

import java.util.Collections;
import java.util.Map;

public final /* synthetic */ class A3P implements C22886Axh {
    public final C200909iS A00;
    public final C202919mw A01;

    public A3P(C200909iS r1, C202919mw r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final Object Byy() {
        boolean z;
        Map map;
        Map map2;
        C202919mw r4 = this.A01;
        C200909iS r3 = this.A00;
        if (C202919mw.A03()) {
            z = AnonymousClass000.A1X(C202919mw.A01(new A3O("gms:phenotype:phenotype_flag:debug_disable_caching")));
        } else {
            z = false;
        }
        if (z) {
            map = C200909iS.A00(r3);
        } else {
            map = r3.A06;
        }
        if (map2 == null) {
            synchronized (r3.A03) {
                map2 = r3.A06;
                if (map2 == null) {
                    map2 = C200909iS.A00(r3);
                    r3.A06 = map2;
                }
            }
        }
        if (map2 == null) {
            map2 = Collections.emptyMap();
        }
        return map2.get(r4.A00);
    }
}
