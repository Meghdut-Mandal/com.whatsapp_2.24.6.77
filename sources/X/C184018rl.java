package X;

/* renamed from: X.8rl  reason: invalid class name and case insensitive filesystem */
public class C184018rl extends C118095nK {
    public final int A00;

    public C184018rl(C203399nx r10, int i) {
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
                z = C203379ns.A0J(r10, A0P, A0Q, A0L);
                A1Z = C165597tg.A1Z();
                cls = Long.class;
                j = 500;
                break;
            case 1:
                String[] A0L2 = C203399nx.A0L(r10);
                A0P = C165567td.A0P();
                A0Q = C165567td.A0Q();
                z = false;
                C203379ns.A03(r2, String.class, A0P, A0Q, "rate-overlimit", A0L2, false);
                A1Z = C165597tg.A1Z();
                cls = Long.class;
                j = 429;
                break;
            default:
                String[] A0L3 = C203399nx.A0L(r10);
                A0P = C165567td.A0P();
                A0Q = C165567td.A0Q();
                z = false;
                C203379ns.A03(r2, String.class, A0P, A0Q, "service-unavailable", A0L3, false);
                A1Z = C165597tg.A1Z();
                cls = Long.class;
                j = 503;
                break;
        }
        C203379ns.A03(r2, cls, A0P, A0Q, Long.valueOf(j), A1Z, z);
        this.A00 = r10;
    }
}
