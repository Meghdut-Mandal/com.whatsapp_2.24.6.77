package X;

/* renamed from: X.8uV  reason: invalid class name and case insensitive filesystem */
public class C185608uV extends C118095nK implements C23051B1w {
    public String A00;
    public final int A01;

    public C185608uV(C203399nx r10, int i) {
        long j;
        this.A01 = i;
        C203399nx r2 = r10;
        C203399nx.A0A(r10, "error");
        String[] A1Z = C165597tg.A1Z();
        Class<Long> cls = Long.class;
        if (i != 0) {
            j = 40602;
        } else {
            j = 40601;
        }
        C203379ns.A03(r2, cls, C165567td.A0P(), C165567td.A0Q(), Long.valueOf(j), A1Z, false);
        Long A0Y = C90474aD.A0Y();
        C203539oF r1 = C203379ns.A00;
        this.A00 = (String) r1.A0Z(r2, String.class, A0Y, 40L, (Object) null, new String[]{"text"}, false);
        this.A00 = r10;
    }

    public Long B9o() {
        long j;
        if (this.A01 != 0) {
            j = 40602;
        } else {
            j = 40601;
        }
        return Long.valueOf(j);
    }

    public String BIF() {
        return this.A00;
    }
}
