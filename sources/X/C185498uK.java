package X;

/* renamed from: X.8uK  reason: invalid class name and case insensitive filesystem */
public class C185498uK extends C118095nK implements B0A {
    public C185498uK(C203399nx r9, int i) {
        String str;
        C203399nx r1 = r9;
        C203399nx.A0A(r9, "config");
        String[] strArr = {"platform"};
        Class<String> cls = String.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        if (i != 0) {
            str = "web";
        } else {
            str = "kaios";
        }
        C203379ns.A03(r1, cls, A0P, A0Q, str, strArr, false);
        Long A0Y = C90474aD.A0Y();
        Long A0l = C165607th.A0l();
        C203379ns.A03(r1, cls, A0Y, A0l, (Object) null, new String[]{"endpoint"}, false);
        C203379ns.A03(r1, cls, A0Y, A0l, (Object) null, new String[]{"auth"}, false);
        C203379ns.A03(r1, cls, A0Y, A0l, (Object) null, new String[]{"p256dh"}, false);
        this.A00 = r9;
    }

    public void B06(C198169d1 r1) {
    }
}
