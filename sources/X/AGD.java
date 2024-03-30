package X;

import java.util.Map;

public final class AGD implements C159627jf {
    public final /* synthetic */ C203619oP A00;
    public final /* synthetic */ AnonymousClass6F2 A01;
    public final /* synthetic */ AnonymousClass8h2 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public AGD(C203619oP r1, AnonymousClass6F2 r2, AnonymousClass8h2 r3, String str, String str2, Map map) {
        this.A00 = r1;
        this.A04 = str;
        this.A02 = r3;
        this.A03 = str2;
        this.A01 = r2;
        this.A05 = map;
    }

    public void BXS(AnonymousClass6PH r12, Map map) {
        String A002;
        C203619oP r3 = this.A00;
        AnonymousClass66U r4 = r3.A04;
        if (r4 == null) {
            throw C36331k8.A0d("fcsLoadingEventManager");
        }
        C108215Sq r5 = C108215Sq.ON_FAILURE;
        String str = this.A04;
        AnonymousClass8h2 r2 = this.A02;
        r4.A00(r5, r12, str, r2.A00(), this.A03, map);
        C203619oP.A07(r3, "actionPerformed");
        C203619oP.A08(r3, "action_performed", "submit");
        AnonymousClass9XM r1 = r3.A06;
        if (r1 != null) {
            AnonymousClass9S8 r0 = r3.A01;
            if (r0 == null) {
                throw C36331k8.A0d("flowManager");
            }
            r1.A01((String) C165607th.A0n(r0.A03));
        }
        Map A012 = r2.A01(this.A05, map);
        C198479dd r13 = r2.A00;
        if (r13 == null || (A002 = r13.A00(r12.A02)) == null) {
            C105705Fs r02 = r3.A0G;
            r02.A01.A04(r3.A00, 3);
            C203619oP.A06(r3, r12, A012);
            return;
        }
        C203619oP.A05(r3, r12, A002, A012, 3);
    }

    public void BiH(Map map) {
        C203619oP r3 = this.A00;
        AnonymousClass66U r5 = r3.A04;
        Object obj = null;
        if (r5 == null) {
            throw C36331k8.A0d("fcsLoadingEventManager");
        }
        C108215Sq r6 = C108215Sq.ON_COMPLETION;
        String str = this.A04;
        AnonymousClass8h2 r4 = this.A02;
        r5.A00(r6, (AnonymousClass6PH) null, str, r4.A00(), this.A03, map);
        C203619oP.A07(r3, "actionPerformed");
        C203619oP.A08(r3, "action_performed", "submit");
        AnonymousClass9XM r2 = r3.A06;
        if (r2 != null) {
            AnonymousClass9S8 r0 = r3.A01;
            if (r0 == null) {
                throw C36331k8.A0d("flowManager");
            }
            r2.A01((String) C165607th.A0n(r0.A03));
        }
        if (this.A01 instanceof AnonymousClass5G6) {
            if (map != null) {
                obj = map.get(C108355Te.RESUMABLE_DATA.key);
            }
            if (obj instanceof Map) {
                Map A0o = C165587tf.A0o(C108355Te.RESUMABLE_DATA.key, map);
                AnonymousClass9XM r02 = r3.A06;
                if (r02 != null) {
                    r02.A02((String) null, A0o);
                }
            }
        }
        C203619oP.A05(r3, (AnonymousClass6PH) null, r4.A00, r4.A01(this.A05, map), 2);
    }
}
