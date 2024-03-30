package X;

/* renamed from: X.8sQ  reason: invalid class name and case insensitive filesystem */
public class C184428sQ extends C118095nK {
    public final int A00;

    public C184428sQ(C203399nx r10, int i) {
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
                z = C203379ns.A0J(r10, A0P, A0Q, A0L2);
                A1Z = C165597tg.A1Z();
                cls = Long.class;
                j = 500;
                break;
            case 2:
                String[] A0L3 = C203399nx.A0L(r10);
                A0P = C165567td.A0P();
                A0Q = C165567td.A0Q();
                z = false;
                C203379ns.A03(r2, String.class, A0P, A0Q, "item-not-found", A0L3, false);
                A1Z = C165597tg.A1Z();
                cls = Long.class;
                j = 404;
                break;
            case 3:
                String[] A0L4 = C203399nx.A0L(r10);
                A0P = C165567td.A0P();
                A0Q = C165567td.A0Q();
                z = false;
                C203379ns.A03(r2, String.class, A0P, A0Q, "not-authorized", A0L4, false);
                A1Z = C165597tg.A1Z();
                cls = Long.class;
                j = 401;
                break;
            case 4:
                String[] A0L5 = C203399nx.A0L(r10);
                A0P = C165567td.A0P();
                A0Q = C165567td.A0Q();
                z = false;
                C203379ns.A03(r2, String.class, A0P, A0Q, "rate-overlimit", A0L5, false);
                A1Z = C165597tg.A1Z();
                cls = Long.class;
                j = 429;
                break;
            default:
                String[] A0L6 = C203399nx.A0L(r10);
                A0P = C165567td.A0P();
                A0Q = C165567td.A0Q();
                z = false;
                C203379ns.A03(r2, String.class, A0P, A0Q, "sequencing-pending", A0L6, false);
                A1Z = C165597tg.A1Z();
                cls = Long.class;
                j = 16792;
                break;
        }
        C203379ns.A03(r2, cls, A0P, A0Q, Long.valueOf(j), A1Z, z);
        this.A00 = r10;
    }

    public Long A00() {
        long j;
        switch (this.A00) {
            case 0:
                j = 400;
                break;
            case 1:
                j = 500;
                break;
            case 2:
                j = 404;
                break;
            case 3:
                j = 401;
                break;
            case 4:
                j = 429;
                break;
            default:
                j = 16792;
                break;
        }
        return Long.valueOf(j);
    }
}
