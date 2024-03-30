package X;

/* renamed from: X.8uT  reason: invalid class name and case insensitive filesystem */
public class C185588uT extends C118095nK implements C23051B1w {
    public final int A00;

    public C185588uT(C203399nx r10, int i) {
        Long A0P;
        Long A0Q;
        boolean z;
        String[] A1Z;
        Class<Long> cls;
        long j;
        this.A00 = i;
        C203399nx r2 = r10;
        if (i != 0) {
            String[] A0L = C203399nx.A0L(r10);
            A0P = C165567td.A0P();
            A0Q = C165567td.A0Q();
            z = C203379ns.A0I(r10, A0P, A0Q, A0L);
            A1Z = C165597tg.A1Z();
            cls = Long.class;
            j = 400;
        } else {
            String[] A0L2 = C203399nx.A0L(r10);
            A0P = C165567td.A0P();
            A0Q = C165567td.A0Q();
            z = false;
            C203379ns.A03(r2, String.class, A0P, A0Q, "already-exists", A0L2, false);
            A1Z = C165597tg.A1Z();
            cls = Long.class;
            j = 304;
        }
        C203379ns.A03(r2, cls, A0P, A0Q, Long.valueOf(j), A1Z, z);
        this.A00 = r10;
    }

    public Long B9o() {
        long j;
        if (this.A00 != 0) {
            j = 400;
        } else {
            j = 304;
        }
        return Long.valueOf(j);
    }

    public String BIF() {
        if (this.A00 != 0) {
            return "bad-request";
        }
        return "already-exists";
    }
}
