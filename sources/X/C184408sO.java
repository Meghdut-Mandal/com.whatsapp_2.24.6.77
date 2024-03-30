package X;

/* renamed from: X.8sO  reason: invalid class name and case insensitive filesystem */
public final class C184408sO extends C118095nK {
    public final Long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C184408sO(C203399nx r11) {
        C203399nx r3 = r11;
        C203399nx.A0A(r11, "upi");
        Class<String> cls = String.class;
        Long A0Y = C90474aD.A0Y();
        Long A0Z = C165577te.A0Z();
        C203539oF r2 = C203379ns.A00;
        this.A05 = (String) r2.A0Z(r3, cls, A0Y, A0Z, (Object) null, new String[]{"payee_vpa"}, false);
        this.A03 = (String) r2.A0Z(r3, cls, A0Y, C165587tf.A0c(), (Object) null, new String[]{"payee_name"}, false);
        this.A02 = (String) r2.A0Z(r3, cls, A0Y, 4L, (Object) null, new String[]{"payee_mcc"}, false);
        this.A04 = (String) r2.A0Z(r3, cls, A0Y, 4L, (Object) null, new String[]{"payee_purpose_code"}, false);
        this.A06 = (String) r2.A0Z(r3, cls, A0Y, 35L, (Object) null, new String[]{"upi_reference_id"}, false);
        Long A0Q = C165567td.A0Q();
        this.A01 = (String) C203539oF.A07(r3, cls, A0Y, A0Q, (Object) null, new String[]{"note"}, false);
        this.A00 = (Long) C203539oF.A07(r3, Long.class, C36411kG.A0t(), A0Q, (Object) null, new String[]{"expiration_time_ms"}, false);
        this.A00 = r11;
    }
}
