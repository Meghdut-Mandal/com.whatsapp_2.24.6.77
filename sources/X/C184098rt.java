package X;

/* renamed from: X.8rt  reason: invalid class name and case insensitive filesystem */
public class C184098rt extends C118095nK {
    public final int A00;

    public C184098rt(C203399nx r9, int i) {
        String str;
        this.A00 = i;
        C203399nx r1 = r9;
        String[] A0P = C203399nx.A0P(r9, "participant");
        Class<String> cls = String.class;
        Long A0P2 = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        switch (i) {
            case 0:
                str = "406";
                break;
            case 1:
                str = "405";
                break;
            case 2:
                str = "404";
                break;
            default:
                str = "500";
                break;
        }
        C203379ns.A03(r1, cls, A0P2, A0Q, str, A0P, false);
        this.A00 = r9;
    }
}
