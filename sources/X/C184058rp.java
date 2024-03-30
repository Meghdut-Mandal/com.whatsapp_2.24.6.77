package X;

/* renamed from: X.8rp  reason: invalid class name and case insensitive filesystem */
public class C184058rp extends C118095nK {
    public final int A00;

    public C184058rp(C203399nx r9, int i) {
        String str;
        this.A00 = i;
        C203399nx r1 = r9;
        String[] A0P = C203399nx.A0P(r9, "group");
        Class<String> cls = String.class;
        Long A0P2 = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        switch (i) {
            case 0:
                str = "400";
                break;
            case 1:
                str = "409";
                break;
            case 2:
                str = "401";
                break;
            case 3:
                str = "404";
                break;
            case 4:
                str = "419";
                break;
            default:
                str = "500";
                break;
        }
        C203379ns.A03(r1, cls, A0P2, A0Q, str, A0P, false);
        this.A00 = r9;
    }
}
