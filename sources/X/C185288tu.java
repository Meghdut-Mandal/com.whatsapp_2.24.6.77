package X;

/* renamed from: X.8tu  reason: invalid class name and case insensitive filesystem */
public class C185288tu extends C118095nK implements C23009Azz, B00, B01, B02, C23048B1t {
    public final int A00;

    public C185288tu(C203399nx r10, int i) {
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
            C203379ns.A03(r2, String.class, A0P, A0Q, "rate-overlimit", A0L, false);
            A1Z = C165597tg.A1Z();
            cls = Long.class;
            j = 429;
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

    public void B05(C197199bI r3) {
        Integer A0j;
        int i = this.A00;
        AnonymousClass026 r1 = r3.A00;
        if (i != 0) {
            A0j = C36361kB.A0i();
        } else {
            A0j = C36361kB.A0j();
        }
        r1.accept(A0j);
    }

    public Long B9o() {
        long j;
        if (this.A00 != 0) {
            j = 429;
        } else {
            j = 400;
        }
        return Long.valueOf(j);
    }

    public String BIF() {
        if (this.A00 != 0) {
            return "rate-overlimit";
        }
        return "bad-request";
    }
}
