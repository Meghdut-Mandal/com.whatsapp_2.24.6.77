package X;

/* renamed from: X.8sE  reason: invalid class name and case insensitive filesystem */
public class C184308sE extends C118095nK {
    public Object A00;
    public String A01;
    public String A02;
    public String A03;

    public C184308sE(C203399nx r13, int i) {
        String[] strArr;
        C22993Azj azj;
        C203399nx r3 = r13;
        switch (i) {
            case 0:
                Class<String> cls = String.class;
                Long A0Y = C90474aD.A0Y();
                Long A0Z = C165577te.A0Z();
                C203539oF r4 = C203379ns.A00;
                C203399nx r5 = r13;
                this.A03 = (String) r4.A0Z(r5, cls, A0Y, A0Z, (Object) null, new String[]{"money", "value"}, false);
                this.A02 = (String) r4.A0Z(r5, cls, A0Y, A0Z, (Object) null, new String[]{"money", "offset"}, false);
                this.A01 = (String) r4.A0Z(r5, cls, A0Y, A0Z, (Object) null, new String[]{"money", "currency"}, false);
                strArr = C165607th.A1b(r13, this, "money");
                azj = AJZ.A00;
                break;
            case 1:
                Class<String> cls2 = String.class;
                Long A0Y2 = C90474aD.A0Y();
                Long A0Z2 = C165577te.A0Z();
                C203539oF r42 = C203379ns.A00;
                C203399nx r52 = r13;
                this.A03 = (String) r42.A0Z(r52, cls2, A0Y2, A0Z2, (Object) null, new String[]{"money", "value"}, false);
                this.A02 = (String) r42.A0Z(r52, cls2, A0Y2, A0Z2, (Object) null, new String[]{"money", "offset"}, false);
                this.A01 = (String) r42.A0Z(r52, cls2, A0Y2, A0Z2, (Object) null, new String[]{"money", "currency"}, false);
                strArr = C165607th.A1b(r13, this, "money");
                azj = AKY.A00;
                break;
            case 2:
                Class<String> cls3 = String.class;
                Long A0Y3 = C90474aD.A0Y();
                Long A0Z3 = C165577te.A0Z();
                C203539oF r43 = C203379ns.A00;
                C203399nx r53 = r13;
                this.A03 = (String) r43.A0Z(r53, cls3, A0Y3, A0Z3, (Object) null, new String[]{"money", "value"}, false);
                this.A02 = (String) r43.A0Z(r53, cls3, A0Y3, A0Z3, (Object) null, new String[]{"money", "offset"}, false);
                this.A01 = (String) r43.A0Z(r53, cls3, A0Y3, A0Z3, (Object) null, new String[]{"money", "currency"}, false);
                strArr = C165607th.A1b(r13, this, "money");
                azj = C21601ARt.A00;
                break;
            default:
                C203399nx.A0A(r13, "hpp_payment_link");
                Class<String> cls4 = String.class;
                Long A0Y4 = C90474aD.A0Y();
                Long A0Q = C165567td.A0Q();
                C203539oF r2 = C203379ns.A00;
                this.A03 = (String) r2.A0Z(r3, cls4, A0Y4, A0Q, (Object) null, new String[]{"value"}, false);
                this.A02 = (String) r2.A0Z(r3, cls4, A0Y4, A0Q, (Object) null, new String[]{"success_url"}, false);
                this.A01 = (String) r2.A0Z(r3, cls4, A0Y4, A0Q, (Object) null, new String[]{"cancel_url"}, false);
                this.A00 = C203539oF.A07(r3, Long.class, C36411kG.A0t(), A0Q, (Object) null, new String[]{"expiration_time_ms"}, false);
                this.A00 = r13;
                return;
        }
        this.A00 = C203539oF.A05(r13, azj, strArr);
    }
}
