package X;

/* renamed from: X.8uS  reason: invalid class name and case insensitive filesystem */
public class C185578uS extends C118095nK implements C23049B1u, C23050B1v, C23051B1w {
    public final int A00;

    public C185578uS(C203399nx r10, int i) {
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
                A0J = false;
                C203379ns.A03(r2, String.class, A0P, A0Q, "forbidden", A0L, false);
                A1Z = C165597tg.A1Z();
                cls = Long.class;
                j = 403;
                break;
            case 1:
                String[] A0L2 = C203399nx.A0L(r10);
                A0P = C165567td.A0P();
                A0Q = C165567td.A0Q();
                A0J = C203379ns.A0J(r10, A0P, A0Q, A0L2);
                A1Z = C165597tg.A1Z();
                cls = Long.class;
                j = 500;
                break;
            default:
                String[] A0L3 = C203399nx.A0L(r10);
                A0P = C165567td.A0P();
                A0Q = C165567td.A0Q();
                A0J = false;
                C203379ns.A03(r2, String.class, A0P, A0Q, "rate-overlimit", A0L3, false);
                A1Z = C165597tg.A1Z();
                cls = Long.class;
                j = 429;
                break;
        }
        C203379ns.A03(r2, cls, A0P, A0Q, Long.valueOf(j), A1Z, A0J);
        this.A00 = r10;
    }

    public Long B9o() {
        long j;
        switch (this.A00) {
            case 0:
                j = 403;
                break;
            case 1:
                j = 500;
                break;
            default:
                j = 429;
                break;
        }
        return Long.valueOf(j);
    }

    public String BIF() {
        switch (this.A00) {
            case 0:
                return "forbidden";
            case 1:
                return "internal-server-error";
            default:
                return "rate-overlimit";
        }
    }
}
