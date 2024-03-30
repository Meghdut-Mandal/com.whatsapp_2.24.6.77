package X;

import java.util.Map;

/* renamed from: X.64K  reason: invalid class name */
public final class AnonymousClass64K {
    public final /* synthetic */ AnonymousClass6F2 A00;
    public final /* synthetic */ AnonymousClass8h2 A01;
    public final /* synthetic */ AnonymousClass6PH A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ C203619oP A04;
    public final /* synthetic */ String A05;

    public AnonymousClass64K(C203619oP r1, AnonymousClass6F2 r2, AnonymousClass8h2 r3, AnonymousClass6PH r4, String str, Map map) {
        this.A04 = r1;
        this.A05 = str;
        this.A01 = r3;
        this.A03 = map;
        this.A00 = r2;
        this.A02 = r4;
    }

    public void A00() {
        C203619oP r3 = this.A04;
        AnonymousClass66U r2 = r3.A04;
        if (r2 == null) {
            throw C36331k8.A0d("fcsLoadingEventManager");
        }
        String str = this.A05;
        AnonymousClass00C.A07(str);
        r2.A01((AnonymousClass6PH) null, "onLoadingCompletion", str, (Map) null);
        AnonymousClass8h2 r7 = this.A01;
        Map map = this.A03;
        C203619oP.A03(r3, r7, map);
        C203619oP.A01(r3, (C187868yf) null, this.A00, AnonymousClass5SM.EXECUTE, r7, this.A02, (String) null, map);
    }
}
