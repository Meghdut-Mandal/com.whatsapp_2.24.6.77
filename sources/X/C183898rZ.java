package X;

/* renamed from: X.8rZ  reason: invalid class name and case insensitive filesystem */
public class C183898rZ extends C118095nK {
    public C183898rZ(C203399nx r10, int i) {
        Long A0P;
        Long A0Q;
        boolean z;
        String[] A1Z;
        Class<Long> cls;
        long j;
        C203399nx r2 = r10;
        if (i != 0) {
            String[] A0L = C203399nx.A0L(r10);
            A0P = C165567td.A0P();
            A0Q = C165567td.A0Q();
            z = C203379ns.A0J(r10, A0P, A0Q, A0L);
            A1Z = C165597tg.A1Z();
            cls = Long.class;
            j = 500;
        } else {
            String[] A0L2 = C203399nx.A0L(r10);
            A0P = C165567td.A0P();
            A0Q = C165567td.A0Q();
            z = false;
            C203379ns.A03(r2, String.class, A0P, A0Q, "feature-not-implemented", A0L2, false);
            A1Z = C165597tg.A1Z();
            cls = Long.class;
            j = 501;
        }
        C203379ns.A03(r2, cls, A0P, A0Q, Long.valueOf(j), A1Z, z);
        this.A00 = r10;
    }
}
