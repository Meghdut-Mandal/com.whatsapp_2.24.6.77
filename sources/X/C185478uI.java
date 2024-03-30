package X;

/* renamed from: X.8uI  reason: invalid class name and case insensitive filesystem */
public class C185478uI extends C118095nK implements B09 {
    public final int A00;

    public C185478uI(C203399nx r10, int i) {
        Long A0P;
        Long A0Q;
        boolean z;
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
                z = C203379ns.A0I(r10, A0P, A0Q, A0L);
                A1Z = C165597tg.A1Z();
                cls = Long.class;
                j = 400;
                break;
            case 1:
                String[] A0L2 = C203399nx.A0L(r10);
                A0P = C165567td.A0P();
                A0Q = C165567td.A0Q();
                z = false;
                C203379ns.A03(r2, String.class, A0P, A0Q, "invalid-direct-connection-encrypted-info", A0L2, false);
                A1Z = C165597tg.A1Z();
                cls = Long.class;
                j = 421;
                break;
            case 2:
                String[] A0L3 = C203399nx.A0L(r10);
                A0P = C165567td.A0P();
                A0Q = C165567td.A0Q();
                z = C203379ns.A0J(r10, A0P, A0Q, A0L3);
                A1Z = C165597tg.A1Z();
                cls = Long.class;
                j = 500;
                break;
            case 3:
                String[] A0L4 = C203399nx.A0L(r10);
                A0P = C165567td.A0P();
                A0Q = C165567td.A0Q();
                z = false;
                C203379ns.A03(r2, String.class, A0P, A0Q, "item-not-found", A0L4, false);
                A1Z = C165597tg.A1Z();
                cls = Long.class;
                j = 404;
                break;
            case 4:
                String[] A0L5 = C203399nx.A0L(r10);
                A0P = C165567td.A0P();
                A0Q = C165567td.A0Q();
                z = false;
                C203379ns.A03(r2, String.class, A0P, A0Q, "not-authorized", A0L5, false);
                A1Z = C165597tg.A1Z();
                cls = Long.class;
                j = 401;
                break;
            case 5:
                String[] A0L6 = C203399nx.A0L(r10);
                A0P = C165567td.A0P();
                A0Q = C165567td.A0Q();
                z = false;
                C203379ns.A03(r2, String.class, A0P, A0Q, "service-unavailable", A0L6, false);
                A1Z = C165597tg.A1Z();
                cls = Long.class;
                j = 503;
                break;
            default:
                String[] A0L7 = C203399nx.A0L(r10);
                A0P = C165567td.A0P();
                A0Q = C165567td.A0Q();
                z = false;
                C203379ns.A03(r2, String.class, A0P, A0Q, "commerce-features-disabled", A0L7, false);
                A1Z = C165597tg.A1Z();
                cls = Long.class;
                j = 451;
                break;
        }
        C203379ns.A03(r2, cls, A0P, A0Q, Long.valueOf(j), A1Z, z);
        this.A00 = r10;
    }

    public Long B9o() {
        long j;
        switch (this.A00) {
            case 0:
                j = 400;
                break;
            case 1:
                j = 421;
                break;
            case 2:
                j = 500;
                break;
            case 3:
                j = 404;
                break;
            case 4:
                j = 401;
                break;
            case 5:
                j = 503;
                break;
            default:
                j = 451;
                break;
        }
        return Long.valueOf(j);
    }
}
