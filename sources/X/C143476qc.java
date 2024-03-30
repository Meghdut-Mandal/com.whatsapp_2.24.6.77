package X;

import java.util.List;

/* renamed from: X.6qc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C143476qc implements AnonymousClass7g0 {
    public final /* synthetic */ C128836Du A00;
    public final /* synthetic */ C143516qg A01;
    public final /* synthetic */ List A02;

    public /* synthetic */ C143476qc(C128836Du r1, C143516qg r2, List list) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = list;
    }

    public final void Be6() {
        C143516qg r3 = this.A01;
        C128836Du r2 = this.A00;
        List list = this.A02;
        List list2 = r2.A09;
        list2.clear();
        list2.addAll(list);
        C125025zC r1 = r3.A09;
        r1.A05 = r2;
        if (!list2.isEmpty() || !r2.A06.isEmpty()) {
            r1.A03 = 1;
            r3.A0B();
            C143516qg.A05(r3);
            C143516qg.A04(r2, r3);
            return;
        }
        r1.A03 = 6;
        r3.A0B();
    }
}
