package X;

/* renamed from: X.9Tr  reason: invalid class name and case insensitive filesystem */
public class C195299Tr {
    public final AnonymousClass8TP A00;
    public final boolean A01;

    public C199959gK A00(C194879Rp r5, Object obj, Object obj2) {
        C199959gK r3 = new C199959gK(r5, this, obj2, false);
        try {
            this.A00.A03(C21670AUn.A01, r3, obj, "");
        } catch (C21828Ab5 unused) {
        }
        return r3;
    }

    public String toString() {
        return this.A00.toString();
    }

    public C195299Tr(AnonymousClass8TP r6, boolean z) {
        if ((r6.A01 instanceof AnonymousClass8TO) && (r6.A01() instanceof AnonymousClass8TR)) {
            C196179Ya r4 = r6;
            C196179Ya r1 = null;
            while (true) {
                r4 = r4.A01();
                if (r4 instanceof AnonymousClass8TO) {
                    break;
                }
                r1 = r4;
            }
            r1.A01 = null;
            r6.A01 = r1;
            C201989kp r3 = new C201989kp();
            r3.A01 = new C195299Tr(r6, true);
            r3.A03 = C023109s.A01;
            ((AnonymousClass8TO) r4).A00 = C90524aI.A0p(r3, new C201989kp[1], 0);
            r6 = new AnonymousClass8TP('$');
            r6.A01 = r4;
            r6.A01 = r4;
        }
        this.A00 = r6;
        this.A01 = z;
    }
}
