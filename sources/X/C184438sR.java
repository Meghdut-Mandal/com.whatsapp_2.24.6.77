package X;

/* renamed from: X.8sR  reason: invalid class name and case insensitive filesystem */
public class C184438sR extends C118095nK {
    public final int A00;

    public C184438sR(C203399nx r10, int i) {
        Long A0P;
        Long A0Q;
        boolean A0J;
        String[] A1Z;
        Class<Long> cls;
        long j;
        this.A00 = i;
        C203399nx r2 = r10;
        switch (i) {
            case 0:
                String[] A0L = C203399nx.A0L(r10);
                A0P = C165567td.A0P();
                A0Q = C165567td.A0Q();
                A0J = C203379ns.A0I(r10, A0P, A0Q, A0L);
                A1Z = C165597tg.A1Z();
                cls = Long.class;
                j = 400;
                break;
            case 1:
                String[] A0L2 = C203399nx.A0L(r10);
                A0P = C165567td.A0P();
                A0Q = C165567td.A0Q();
                A0J = false;
                C203379ns.A03(r2, String.class, A0P, A0Q, "forbidden", A0L2, false);
                A1Z = C165597tg.A1Z();
                cls = Long.class;
                j = 403;
                break;
            case 2:
                String[] A0L3 = C203399nx.A0L(r10);
                A0P = C165567td.A0P();
                A0Q = C165567td.A0Q();
                A0J = C203379ns.A0J(r10, A0P, A0Q, A0L3);
                A1Z = C165597tg.A1Z();
                cls = Long.class;
                j = 500;
                break;
            default:
                String[] A0L4 = C203399nx.A0L(r10);
                A0P = C165567td.A0P();
                A0Q = C165567td.A0Q();
                A0J = false;
                C203379ns.A03(r2, String.class, A0P, A0Q, "not-allowed", A0L4, false);
                A1Z = C165597tg.A1Z();
                cls = Long.class;
                j = 405;
                break;
        }
        C203379ns.A03(r2, cls, A0P, A0Q, Long.valueOf(j), A1Z, A0J);
        this.A00 = r10;
    }
}
