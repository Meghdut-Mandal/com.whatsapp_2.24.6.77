package X;

/* renamed from: X.8sB  reason: invalid class name and case insensitive filesystem */
public class C184278sB extends C118095nK {
    public String A00;
    public String A01;
    public String A02;

    public C184278sB(C203399nx r9, int i) {
        String str;
        if (i != 0) {
            str = "secondary_action";
        } else {
            str = "primary_action";
        }
        C203399nx r1 = r9;
        C203399nx.A0A(r9, str);
        Class<String> cls = String.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        this.A01 = (String) C203379ns.A00.A0Z(r1, cls, A0P, A0Q, (Object) null, new String[]{"text"}, false);
        this.A02 = (String) C203539oF.A07(r1, cls, A0P, A0Q, (Object) null, new String[]{"universal_link"}, false);
        this.A00 = (String) C203539oF.A07(r1, cls, A0P, A0Q, (Object) null, new String[]{"deep_link"}, false);
        this.A00 = r9;
    }
}
