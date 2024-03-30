package X;

/* renamed from: X.8rs  reason: invalid class name and case insensitive filesystem */
public class C184088rs extends C118095nK {
    public final int A00;

    public C184088rs(C203399nx r9, int i) {
        String str;
        this.A00 = i;
        C203399nx r1 = r9;
        C203399nx.A0A(r9, "picture");
        String[] strArr = {"status"};
        Class<String> cls = String.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        switch (i) {
            case 0:
                str = "405";
                break;
            case 1:
                str = "500";
                break;
            case 2:
                str = "304";
                break;
            default:
                str = "204";
                break;
        }
        C203379ns.A03(r1, cls, A0P, A0Q, str, strArr, false);
        this.A00 = r9;
    }
}
