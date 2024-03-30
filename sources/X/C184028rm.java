package X;

/* renamed from: X.8rm  reason: invalid class name and case insensitive filesystem */
public class C184028rm extends C118095nK {
    public final int A00;

    public C184028rm(C203399nx r10, int i) {
        Long A0P;
        Long A0Q;
        boolean A0I;
        String[] A1Z;
        Class<Long> cls;
        long j;
        this.A00 = i;
        C203399nx r2 = r10;
        if (i != 0) {
            String[] A0L = C203399nx.A0L(r10);
            A0P = C165567td.A0P();
            A0Q = C165567td.A0Q();
            A0I = false;
            C203379ns.A03(r2, String.class, A0P, A0Q, "feature-not-implemented", A0L, false);
            A1Z = C165597tg.A1Z();
            cls = Long.class;
            j = 501;
        } else {
            String[] A0L2 = C203399nx.A0L(r10);
            A0P = C165567td.A0P();
            A0Q = C165567td.A0Q();
            A0I = C203379ns.A0I(r10, A0P, A0Q, A0L2);
            A1Z = C165597tg.A1Z();
            cls = Long.class;
            j = 400;
        }
        C203379ns.A03(r2, cls, A0P, A0Q, Long.valueOf(j), A1Z, A0I);
        this.A00 = r10;
    }
}
