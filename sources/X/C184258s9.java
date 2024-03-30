package X;

/* renamed from: X.8s9  reason: invalid class name and case insensitive filesystem */
public class C184258s9 extends C118095nK {
    public Object A00;
    public String A01;
    public String A02;

    public C184258s9(C203399nx r20, int i) {
        Object A07;
        C203399nx r4 = r20;
        if (i != 0) {
            String[] A0M = C203399nx.A0M(r4, "description");
            Class<String> cls = String.class;
            Long A0Y = C90474aD.A0Y();
            Long A0e = C165597tg.A0e();
            C203539oF r3 = C203379ns.A00;
            this.A02 = (String) r3.A0Z(r4, cls, A0Y, A0e, (Object) null, A0M, false);
            C203539oF r11 = r3;
            C203399nx r12 = r4;
            this.A00 = r11.A0Z(r12, Long.class, C36411kG.A0t(), C165567td.A0Q(), (Object) null, new String[]{"update_time"}, false);
            A07 = r3.A0Z(r4, cls, A0Y, 65536L, (Object) null, new String[]{"#elementValue"}, false);
        } else {
            C203399nx.A0A(r4, "error");
            String[] A1Z = C165597tg.A1Z();
            Long A0P = C165567td.A0P();
            Long A0Q = C165567td.A0Q();
            C203539oF r32 = C203379ns.A00;
            this.A00 = r32.A0Z(r4, Long.class, A0P, A0Q, (Object) null, A1Z, false);
            Class<String> cls2 = String.class;
            this.A02 = (String) r32.A0Z(r4, cls2, C90474aD.A0Y(), C165587tf.A0c(), (Object) null, new String[]{"text"}, false);
            A07 = C203539oF.A07(r4, cls2, C36411kG.A0t(), 10000L, (Object) null, new String[]{"parameters"}, false);
        }
        this.A01 = (String) A07;
        this.A00 = r4;
    }
}
