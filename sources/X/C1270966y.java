package X;

import java.util.Map;

/* renamed from: X.66y  reason: invalid class name and case insensitive filesystem */
public final class C1270966y {
    public final /* synthetic */ C159627jf A00;
    public final /* synthetic */ AnonymousClass5G2 A01;
    public final /* synthetic */ Map A02;

    public C1270966y(C159627jf r1, AnonymousClass5G2 r2, Map map) {
        this.A02 = map;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00() {
        AnonymousClass5G2.A00(this.A00, this.A01, C000400e.A0D(), false);
    }

    public void A01(Map map) {
        Map map2 = this.A02;
        map2.put("external_resources_data", C36391kE.A11("direct_connect", map));
        AnonymousClass5G2.A00(this.A00, this.A01, map2, true);
    }
}
