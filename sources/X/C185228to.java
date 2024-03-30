package X;

/* renamed from: X.8to  reason: invalid class name and case insensitive filesystem */
public class C185228to extends C118095nK implements C23047B1s {
    public final int A00;

    public C185228to(C203399nx r10, int i) {
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
                C203379ns.A03(r2, String.class, A0P, A0Q, "partial-server-error", A0L2, false);
                A1Z = C165597tg.A1Z();
                cls = Long.class;
                j = 530;
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

    public Long B9o() {
        long j;
        switch (this.A00) {
            case 0:
                j = 500;
                break;
            case 1:
                j = 530;
                break;
            default:
                j = 503;
                break;
        }
        return Long.valueOf(j);
    }

    public String BIF() {
        switch (this.A00) {
            case 0:
                return "internal-server-error";
            case 1:
                return "partial-server-error";
            default:
                return "service-unavailable";
        }
    }
}
