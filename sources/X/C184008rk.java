package X;

/* renamed from: X.8rk  reason: invalid class name and case insensitive filesystem */
public class C184008rk extends C118095nK {
    public final int A00;

    public C184008rk(C203399nx r9, int i) {
        String str;
        this.A00 = i;
        C203399nx r1 = r9;
        String[] A0P = C203399nx.A0P(r9, "linked_groups");
        Class<String> cls = String.class;
        Long A0P2 = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        switch (i) {
            case 0:
                str = "400";
                break;
            case 1:
                str = "405";
                break;
            default:
                str = "500";
                break;
        }
        C203379ns.A03(r1, cls, A0P2, A0Q, str, A0P, false);
        this.A00 = r9;
    }
}
