package X;

/* renamed from: X.8rd  reason: invalid class name and case insensitive filesystem */
public class C183938rd extends C118095nK {
    public C183938rd(C203399nx r10, int i) {
        Long A0P;
        Long A0Q;
        boolean A0I;
        String[] A1Z;
        Class<Long> cls;
        long j;
        C203399nx r2 = r10;
        switch (i) {
            case 0:
                String[] A0L = C203399nx.A0L(r10);
                A0P = C165567td.A0P();
                A0Q = C165567td.A0Q();
                A0I = C203379ns.A0I(r10, A0P, A0Q, A0L);
                A1Z = C165597tg.A1Z();
                cls = Long.class;
                j = 400;
                break;
            case 1:
                String[] A0L2 = C203399nx.A0L(r10);
                A0P = C165567td.A0P();
                A0Q = C165567td.A0Q();
                A0I = false;
                C203379ns.A03(r2, String.class, A0P, A0Q, "feature-not-implemented", A0L2, false);
                A1Z = C165597tg.A1Z();
                cls = Long.class;
                j = 501;
                break;
            case 2:
                String[] A0L3 = C203399nx.A0L(r10);
                A0P = C165567td.A0P();
                A0Q = C165567td.A0Q();
                A0I = false;
                C203379ns.A03(r2, String.class, A0P, A0Q, "forbidden", A0L3, false);
                A1Z = C165597tg.A1Z();
                cls = Long.class;
                j = 403;
                break;
            case 3:
                String[] A0L4 = C203399nx.A0L(r10);
                A0P = C165567td.A0P();
                A0Q = C165567td.A0Q();
                A0I = C203379ns.A0J(r10, A0P, A0Q, A0L4);
                A1Z = C165597tg.A1Z();
                cls = Long.class;
                j = 500;
                break;
            case 4:
                String[] A0L5 = C203399nx.A0L(r10);
                A0P = C165567td.A0P();
                A0Q = C165567td.A0Q();
                A0I = false;
                C203379ns.A03(r2, String.class, A0P, A0Q, "rate-overlimit", A0L5, false);
                A1Z = C165597tg.A1Z();
                cls = Long.class;
                j = 429;
                break;
            default:
                String[] A0L6 = C203399nx.A0L(r10);
                A0P = C165567td.A0P();
                A0Q = C165567td.A0Q();
                A0I = false;
                C203379ns.A03(r2, String.class, A0P, A0Q, "service-unavailable", A0L6, false);
                A1Z = C165597tg.A1Z();
                cls = Long.class;
                j = 503;
                break;
        }
        C203379ns.A03(r2, cls, A0P, A0Q, Long.valueOf(j), A1Z, A0I);
        this.A00 = r10;
    }
}
